package plugins.jaxb;

import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newHashSet;
import static plugins.util.Prelude.incomingFrom;
import static plugins.util.Prelude.isElementOfLanguage;

import java.net.URI;
import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.context.Context;

public class CommonLanguageDefinition extends EvaluatorPlugin {
	private NSURIExtractor getExtractor(Entity artifact) {
		for (NSURIExtractor extractor : filter(getParts(), NSURIExtractor.class))
			if (any(extractor.getRealization(),
					x -> isElementOfLanguage(artifact, x)))
				return extractor;

		return null;
	}

	@Override
	public void evaluate(Context context, Relationship relationship) {
		Iterable<Entity> entities = incomingFrom(relationship.getRight(),
				"defines");

		Set<URI> variants = newHashSet();

		for (Entity entity : entities) {
			NSURIExtractor extractor = getExtractor(entity);
			if (extractor != null)
				variants.add(extractor.extractNSURI(context, entity));
		}

		if (variants.size() == 1)
			context.valid();
		else if (variants.size() > 1)
			context.error("Mutliple variants for language: " + variants);
	}
}
