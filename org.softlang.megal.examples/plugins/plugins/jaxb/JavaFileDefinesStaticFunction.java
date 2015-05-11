package plugins.jaxb;

import static com.google.common.collect.Iterables.getFirst;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Throwables;

public class JavaFileDefinesStaticFunction extends EvaluatorPlugin {
	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getLeft().getBinding().isPresent())
			return;

		if (!relationship.getRight().getBinding().isPresent())
			return;

		Artifact javaFile = context.getArtifact(relationship.getLeft()
				.getBinding().get());
		try {
			URI binding = new URI(relationship.getRight().getBinding().get()
					.toString());
			if (!"classpath".equals(binding.getScheme()))
				return;

			String qname = binding.getSchemeSpecificPart();
			String function = binding.getFragment();

			List<String> split = Splitter.on('.').omitEmptyStrings()
					.splitToList(qname);
			String frag = Joiner.on('.').join(
					split.subList(0, split.size() - 2));
			String name = split.get(split.size() - 1);

			String fname = getFirst(
					Splitter.on('(').omitEmptyStrings().split(function), null);

			try {
				String file = javaFile.getChars().read();

				if (!file.contains(frag)) {
					context.error("The file is not even in the same package.");
					return;
				}

				if (!(file.contains("class " + name) || file
						.contains("interface " + name))) {
					context.error("Not the same name, dude.");
					return;
				}

				if (!file.contains(fname)) {
					context.error("Can't find the method, I don't like this file!");
					return;
				}

				context.valid();
			} catch (IOException e) {
				context.error(Throwables.getStackTraceAsString(e));
			}
		} catch (URISyntaxException e) {
			return;
		}
	}
}
