package org.softlang.megal;

import static org.softlang.megal.Megamodels.*;
import static org.softlang.megal.Entities.*;
import static org.softlang.megal.EntityTypes.*;
import static org.softlang.megal.RelationshipTypes.*;
import static org.softlang.megal.TypeReferences.singleRef;
import static org.softlang.megal.Relationships.*;
import static org.softlang.megal.Annotations.*;

import java.util.Map.Entry;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.api.Evaluator;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.collect.ImmutableMultimap;

public class Evaluators {
	/**
	 * Gets a list of all initialized resolvers
	 * 
	 * @param m
	 *            The megamodel to analyze
	 * @return Returns an immutable list
	 */
	public static ImmutableMultimap<Entity, Evaluator> loadEvaluators(Megamodel m) {
		// Get the types
		EntityType evaluatorType = resolveToMergedEntityType(m, "Evaluator");
		RelationshipType realizationOfType = resolveToMergedRelationshipType(m, "realizationOf");
		RelationshipType partOfType = resolveToMergedRelationshipType(m, "partOf");

		// Get support for code
		SourceSupport s = SourceSupportPlugin.getSupport().analyzeContaining(m);

		// Make result and error builder
		ImmutableMultimap.Builder<Entity, Evaluator> resultBuilder = ImmutableMultimap.builder();
		ImmutableMultimap.Builder<Class<? extends Evaluator>, Throwable> errorsBuilder = ImmutableMultimap.builder();

		// Iterate all evaluator entities
		for (Entity r : allInstances(m, singleRef(evaluatorType))) {
			// Make a store for a potential merge
			Entity merged = null;

			// Iterate all the bindings for the resolver
			for (Link l : allBindings(m, r, null, null)) {
				// Try to load the attached class
				Class<? extends Evaluator> v = s.loadClass(Evaluator.class, l.getTo());

				// If class is loadable
				if (v != null)
					try {
						// Create merge if not already merged
						if (merged == null)
							merged = createEntityMerge(r);

						Evaluator vi = v.newInstance();

						vi.load(merged);

						// Put result
						resultBuilder.put(r, vi);
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

		// Build the result vector that will be linked hereafter
		ImmutableMultimap<Entity, Evaluator> unconnected = resultBuilder.build();

		// Evaluator plugin part of relationship
		for (Entry<Entity, Evaluator> from : unconnected.entries())
			for (Entry<Entity, Evaluator> to : unconnected.entries())
				for (Relationship r : allInvolved(m, from.getKey(), partOfType, to.getKey()))
					to.getValue().addPart(r, from.getValue());

		// Evaluator realizes entity
		for (Entry<Entity, Evaluator> it : unconnected.entries())
			for (Relationship r : allInvolved(m, null, realizationOfType, it.getKey()))
				it.getValue().addRealized(r, createEntityMerge(r.getLeft()));

		// Those are actually connected now!
		return unconnected;
	}

	/**
	 * Loads all mappings from relationship types to
	 * 
	 * @param m
	 * @return
	 */
	public static ImmutableMultimap<RelationshipType, Entity> loadMappings(Megamodel m) {
		// TODO: isMergable maps instead of self testing everything, will boost
		// performance because of less merge OPs
		ImmutableMultimap.Builder<RelationshipType, Entity> resultBuilder = ImmutableMultimap.builder();

		for (Declaration d : transitiveDeclarations(m)) {
			if (!(d instanceof RelationshipType))
				continue;

			RelationshipType b = (RelationshipType) d;
			String plugin = getAnnotation(b, "Plugin", null);

			if (plugin != null)
				resultBuilder.put(b, resolveToMergedEntity(m, plugin));
		}

		return resultBuilder.build();
	}
}
