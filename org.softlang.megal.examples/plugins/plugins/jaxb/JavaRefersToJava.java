package plugins.jaxb;

import java.util.List;

import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

public class JavaRefersToJava extends EvaluatorPlugin {
	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getLeft().getBinding().isPresent())
			return;
		if (!relationship.getRight().getBinding().isPresent())
			return;

		List<Artifact> leftArtifact = context.getArtifacts(relationship
				.getLeft().getBinding().get());
		List<Artifact> rightArtifact = context.getArtifacts(relationship
				.getRight().getBinding().get());

	}
}
