package plugins.jaxb;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Lists.newArrayList;
import static plugins.util.Pairs.*;
import static plugins.util.Pairs.secondOf;
import static plugins.util.Prelude.incomingFrom;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.util.List;
import java.util.Objects;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.base.Splitter;
import com.google.common.base.Throwables;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

public class FileToObjectFunction extends EvaluatorPlugin {
	@Override
	public void evaluate(Context context, Relationship relationship) {

		if (!relationship.getRight().getBinding().isPresent())
			return;

		Object binding = relationship.getRight().getBinding().get();
		Class<?> home = context.getClass(binding, Object.class, getClass());

		if (home == null) {
			context.error("Can not resolve the class.");
			return;
		}

		Method resolved = findAccessibleMethod(home, binding);

		if (resolved == null) {
			context.error("Can not resolve the method.");
			return;
		}

		if (resolved.getParameterCount() != 1) {
			context.error("Can not invoke method, it needs to have one parameter.");
			return;
		}

		// Get first parameter
		Class<?> firstParameter = resolved.getParameterTypes()[0];
		Relationship firstRelationshipOf = firstOf(relationship.getLeft());
		Relationship secondRelationshipOf = secondOf(relationship.getLeft());

		if (firstRelationshipOf == null || secondRelationshipOf == null)
			return;

		Entity input = firstRelationshipOf.getLeft();
		// Entity output = secondOf(pair);

		if (input == null)
			return;

		if (!input.getBinding().isPresent())
			return;

		Artifact inputArtifact = context.getArtifact(input.getBinding().get());

		if (inputArtifact == null)
			return;

		try {
			if (ByteSource.class.isAssignableFrom(firstParameter))
				resolved.invoke(null, inputArtifact.getBytes());
			else if (CharSource.class.isAssignableFrom(firstParameter))
				resolved.invoke(null, inputArtifact.getChars());
			else if (InputStream.class.isAssignableFrom(firstParameter))
				try (InputStream stream = inputArtifact.getBytes().openStream()) {
					resolved.invoke(null, stream);
				}
			else if (Reader.class.isAssignableFrom(firstParameter))
				try (Reader stream = inputArtifact.getChars().openStream()) {
					resolved.invoke(null, stream);
				}
			else
				context.error("Cannot invoke method with parameter "
						+ firstParameter.getSimpleName(), relationship,
						firstRelationshipOf, secondRelationshipOf);

			context.valid(relationship, firstRelationshipOf,
					secondRelationshipOf);
		} catch (InvocationTargetException | IllegalAccessException
				| IllegalArgumentException | IOException e) {
			context.error("Error while invoking function, " + e);
		}
	}

	public static Method findAccessibleMethod(Class<?> home, Object binding) {
		String location = URI.create(binding.toString()).getFragment();

		Iterable<String> commands = Splitter.onPattern("[(),]")
				.omitEmptyStrings().split(location);

		Method resolved = findAccessibleMethod(home, from(commands).first()
				.orNull(), from(commands).skip(1).toList());
		return resolved;
	}

	public static Method findAccessibleMethod(Class<?> home, String name,
			List<String> signature) {
		Method resolved = null;

		nextMethod: for (Method method : home.getMethods()) {
			if (!Modifier.isStatic(method.getModifiers()))
				continue;

			if (!Modifier.isPublic(method.getModifiers()))
				continue;

			if (!equal(name, method.getName()))
				continue;

			if (signature.size() != method.getParameterCount())
				continue;

			for (int i = 0; i < signature.size(); i++)
				if (!equal(signature.get(i),
						method.getParameterTypes()[i].getSimpleName()))
					continue nextMethod;

			resolved = method;
			break;
		}
		return resolved;
	}
}
