package plugins.root.elementof;

import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Iterables.filter;
import static java.util.Collections.singleton;
import static plugins.util.Prelude.isElementOfLanguage;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

import com.google.common.base.Optional;

/**
 * <p>
 * Parts for this evaluator will be seen as acceptors
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class FileElementOfLanguage extends EvaluatorPlugin {

	private static Iterable<Artifact> expandIfFolder(Iterable<Artifact> iterable) {
		return from(iterable).transformAndConcat(
				x -> x.hasContent() ? singleton(x) : x.getChildren());
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		Entity element = relationship.getLeft();
		if (!element.getBinding().isPresent())
			return;

		boolean anyError = false;
		for (Artifact artifact : expandIfFolder(context.getArtifacts(element
				.getBinding().get()))) {

			Optional<String> error = isElement(element, artifact);

			if (error.isPresent()) {
				anyError = true;
				context.error(error.get());
			}
		}

		if (!anyError)
			context.valid();
	}

	private Optional<String> isElement(Entity element, Artifact artifact) {
		if (!artifact.hasContent())
			return Optional.absent();

		for (Acceptor acceptor : filter(getParts(), Acceptor.class)) {
			if (!any(acceptor.getRealization(),
					x -> isElementOfLanguage(element, x)))
				continue;

			Optional<String> error = acceptor.accept(artifact);

			if (error.isPresent())
				return error;
		}

		return Optional.absent();
	}
}
