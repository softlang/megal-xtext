package plugins.jaxb;

import java.net.URI;
import java.util.Set;

import org.softlang.megal.mi2.Element;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.api.EvaluatorPlugin;
import org.softlang.megal.mi2.api.Message;
import org.softlang.megal.mi2.api.context.Context;

import static com.google.common.collect.Iterables.any;
import static plugins.util.Prelude.*;
import static com.google.common.collect.Iterables.filter;
import static java.util.Collections.*;
import static com.google.common.collect.Sets.*;

public class CommonLanguageDefinition extends EvaluatorPlugin {
	private NSURIExtractor getExtractor(Entity artifact) {
		for (NSURIExtractor extractor : filter(getParts(), NSURIExtractor.class))
			if (any(extractor.getRealization(),
					x -> isElementOfLanguage(artifact, x)))
				return extractor;

		return null;
	}

	@Override
	public Set<Element> evaluate(Context context, Relationship relationship) {
		Iterable<Entity> entities = incomingFrom(relationship.getRight(),
				"defines");

		Set<URI> variants = newHashSet();

		for (Entity entity : entities) {
			NSURIExtractor extractor = getExtractor(entity);
			if (extractor != null)
				variants.add(extractor.extractNSURI(context, entity));
		}

		if (variants.isEmpty())
			return null;

		if (variants.size() == 1)
			return singleton(relationship);

		context.emit(Message.error("Mutliple variants for language: "
				+ variants));
		return emptySet();
	}
}
