package plugins.jaxb;

import static com.google.common.collect.Lists.transform;
import static java.util.Arrays.asList;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.base.Joiner;
import com.google.common.base.Throwables;

public class ObjectCorrespondsToJavaFiles extends EvaluatorPlugin {
	private static String createSignatureString(Class<?>[] p) {
		return Joiner.on(", ").join(transform(asList(p), Class::getSimpleName));
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getLeft().getBinding().isPresent())
			return;
		if (!relationship.getRight().getBinding().isPresent())
			return;

		// Get the object and the artifact parent
		Object object = relationship.getLeft().getBinding().get();
		Artifact right = context.getArtifact(relationship.getRight()
				.getBinding().get());

		// Get the object class
		Class<?> objectClass = object.getClass();

		// Needs to be in the artifact
		Artifact corrChild = right.getChild(objectClass.getSimpleName()
				+ ".java");

		if (corrChild.exists()) {
			try {
				String content = corrChild.getChars().read();
				boolean invalidated = false;

				// Check all the fields
				for (Field field : objectClass.getDeclaredFields())
					if (invalidated |= !content.contains(field.getName()))
						context.error("Cannot find the declared field "
								+ field.getName() + ": " + field.getType());

				// Check all the methods
				for (Method method : objectClass.getDeclaredMethods())
					if (invalidated |= !content.contains(method.getName()))
						context.error("Cannot find the declared method"
								+ method.getName()
								+ "("
								+ createSignatureString(method
										.getParameterTypes()) + ")" + ": "
								+ method.getReturnType());

				// No invalidation evidence found, regard as valid
				if (!invalidated)
					context.valid();
			} catch (IOException e) {
				// IO exception, but we had a java file
				context.warning("Found a corresponding artifact, but the evaluation failed with an exception: "
						+ Throwables.getStackTraceAsString(e));
			}
		} else
			// No java file
			context.error("Can not find a file corresponding to "
					+ objectClass.getSimpleName() + ".");
	}
}
