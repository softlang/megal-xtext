package plugins.jaxb;

import static com.google.common.collect.Iterables.getFirst;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;

import plugins.prelude.GuidedEvaluatorPlugin;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class JavaFileDefinesStaticFunction extends GuidedEvaluatorPlugin {
	@Override
	public void guidedEvaluate(Relationship relationship) throws IOException {

		Artifact javaFile = withArtifact(relationship.getLeft());
		try {
			URI binding = new URI(withBound(relationship.getRight()).toString());
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

			String file = javaFile.getChars().read();

			if (!file.contains(frag)) {
				error("The file is not even in the same package.");
				return;
			}

			if (!(file.contains("class " + name) || file.contains("interface "
					+ name))) {
				error("Not the same name, dude.");
				return;
			}

			if (!file.contains(fname)) {
				error("Can't find the method, I don't like this file!");
				return;
			}

			valid();
		} catch (URISyntaxException e) {
			return;
		}
	}
}
