package org.softlang.megal;

import static org.softlang.megal.Elements.*;
import static org.softlang.megal.EntityTypes.*;
import static org.softlang.megal.Links.*;
import static org.softlang.megal.TypeReferences.singleRef;
import static org.softlang.megal.Relationships.*;
import static org.softlang.megal.Annotations.*;

import java.util.Map.Entry;

import static com.google.common.collect.FluentIterable.*;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.api.ElementMap;
import org.softlang.megal.api.Evaluator;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

public class Evaluators {
	/**
	 * Gets a list of all initialized resolvers
	 * 
	 * @param m
	 *            The megamodel to analyze
	 * @return Returns an immutable list
	 */
	public static Multimap<Entity, Evaluator> loadEvaluators(Megamodel m) {

		// Get the types
		EntityType evaluatorType = resolve(m, EntityType.class, "Evaluator");
		RelationshipType realizationOfType = resolve(m, RelationshipType.class, "realizationOf");
		RelationshipType partOfType = resolve(m, RelationshipType.class, "partOf");

		// Get support for code
		SourceSupport s = SourceSupportPlugin.getSupport().analyzeContaining(m);

		// Make result and error builder
		// ImmutableMultimap.Builder<Entity, Evaluator> resultBuilder =
		// ImmutableMultimap.builder();
		Multimap<Entity, Evaluator> resultMultimap = ElementMap.newSetMultimap(Entity.class);
		ImmutableMultimap.Builder<Class<? extends Evaluator>, Throwable> errorsBuilder = ImmutableMultimap.builder();

		// Iterate all evaluator entities
		for (Entity r : allInstances(m, singleRef(evaluatorType))) {

			// Iterate all the bindings for the resolver
			for (Link l : allBindings(m, r, null, null)) {
				// Try to load the attached class
				Class<? extends Evaluator> v = s.loadClass(Evaluator.class, l.getTo());

				// If class is loadable
				if (v != null)
					try {

						Evaluator vi = v.newInstance();

						vi.load(r);

						// Put result
						resultMultimap.put(r, vi);
					} catch (InstantiationException | IllegalAccessException | Error e) {
						// On exception, put to the errors
						errorsBuilder.put(v, e);
					}
			}
		}

		// Optionally output errors
		ImmutableMultimap<Class<? extends Evaluator>, Throwable> errors = errorsBuilder.build();
		if (!errors.isEmpty())
			MegalPlugin.log(Status.WARNING, "Some of the evaluators could not be instantiated, namely " + errors);

		// Evaluator plugin part of relationship
		for (Entry<Entity, Evaluator> from : resultMultimap.entries())
			for (Entry<Entity, Evaluator> to : resultMultimap.entries())
				for (Relationship r : allInvolved(m, from.getKey(), partOfType, to.getKey()))
					to.getValue().addPart(r, from.getValue());

		// Evaluator realizes entity
		for (Entry<Entity, Evaluator> it : resultMultimap.entries())
			for (Relationship r : allInvolved(m, null, realizationOfType, it.getKey()))
				it.getValue().addRealized(r, r.getLeft());
		// Those are actually connected now!
		return Multimaps.unmodifiableMultimap(resultMultimap);
	}

	/**
	 * Loads all mappings from relationship types to
	 * 
	 * @param m
	 * @return
	 */
	public static Multimap<RelationshipType, Entity> loadMappings(Megamodel m) {
		// TODO: isMergable maps instead of self testing everything, will boost
		// performance because of less merge OPs
		Multimap<RelationshipType, Entity> resultMultimap = ElementMap.newSetMultimap(RelationshipType.class);

		for (Declaration d : from(m.allModels()).transformAndConcat(Megamodel::getDeclarations)) {
			if (!(d instanceof RelationshipType))
				continue;

			RelationshipType b = (RelationshipType) d;
			String plugin = getAnnotation(b, "Plugin", null);

			if (plugin != null)
				resultMultimap.put(b, resolve(m, Entity.class, plugin));
		}

		return Multimaps.unmodifiableMultimap(resultMultimap);
	}
}
