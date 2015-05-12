package plugins.jaxb;

import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newHashSet;
import static plugins.util.Prelude.incomingFrom;
import static plugins.util.Prelude.isElementOfLanguage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

public class MatchingLanguageDefinition extends EvaluatorPlugin {
	private NSURIExtractor getExtractor(Entity artifact) {
		for (NSURIExtractor extractor : filter(getParts(), NSURIExtractor.class))
			if (any(extractor.getRealization(),
					x -> isElementOfLanguage(artifact, x)))
				return extractor;

		return null;
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		if (!relationship.getRight().getBinding().isPresent())
			return;

		Object rightBinding = relationship.getRight().getBinding().get();

		NSURIExtractor extractor = getExtractor(relationship.getLeft());
		if (extractor == null)
			return;

		try {
			URI toURI = new URI(rightBinding.toString());
			URI extracted = extractor.extractNSURI(context,
					relationship.getLeft());

			if (extractor != null && toURI.equals(extracted))
				context.valid();
			else
				context.error("The artifacts language " + extracted
						+ " does not match the expected " + toURI);

		} catch (URISyntaxException e) {
		}
	}
}
