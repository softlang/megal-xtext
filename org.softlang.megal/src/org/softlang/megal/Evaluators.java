package org.softlang.megal;

import static com.google.common.collect.FluentIterable.from;
import static org.softlang.megal.Annotations.getAnnotation;
import static org.softlang.megal.Elements.resolve;
import static org.softlang.megal.EntityTypes.allInstances;
import static org.softlang.megal.Links.allBindings;
import static org.softlang.megal.Relationships.allInvolved;
import static org.softlang.megal.TypeReferences.singleRef;

import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.api.API;
import org.softlang.megal.api.ElementMap;
import org.softlang.megal.api.Result;
import org.softlang.megal.api.Evaluator;
import org.softlang.megal.api.Resolver;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Ordering;

import static org.softlang.megal.APIs.*;
import static org.softlang.megal.Resolvers.*;

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
						vi.initialize(m, r);

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
					to.getValue().add(from.getValue(), r);

		// Evaluator realizes entity
		for (Entry<Entity, Evaluator> it : resultMultimap.entries())
			for (Relationship r : allInvolved(m, it.getKey(), realizationOfType, null))
				it.getValue().add(r.getRight(), r);

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
		Multimap<RelationshipType, Entity> resultMultimap = ElementMap.newSetMultimap(RelationshipType.class);

		for (RelationshipType b : from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).filter(
				RelationshipType.class)) {
			String plugin = getAnnotation(b, "Plugin", null);

			if (plugin != null)
				resultMultimap.put(b, resolve(m, Entity.class, plugin));
		}

		return Multimaps.unmodifiableMultimap(resultMultimap);
	}

	public static Multimap<String, String> evaluate(Megamodel m) {

		// Load all evaluators
		Multimap<Entity, Resolver> resolvers = loadResolvers(m);
		Multimap<Entity, Evaluator> entToEval = loadEvaluators(m);
		Multimap<RelationshipType, Entity> rstToEnt = loadMappings(m);

		// Get the API
		API api = createAPI(m, resolvers);
		Multimap<String, String> resultMultimap = HashMultimap.create();

		for (Relationship b : from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).filter(
				Relationship.class)) {
			Collection<Entity> evaluators = rstToEnt.get(b.getType());

			for (Entity x : evaluators)
				for (Evaluator y : entToEval.get(x)) {
					y.setAPI(api);

					Result result = y.evaluate(b);

					if (result.isValid())
						resultMultimap.putAll(y.calculateTrace(b));
				}
		}

		return Multimaps.unmodifiableMultimap(resultMultimap);
	}

	/**
	 * Three-tiered parallel evaluation
	 * 
	 * @param m
	 * @return
	 */
	public static ForkJoinTask<Multimap<String, String>> evaluateParallel(ForkJoinPool pool, Megamodel m) {

		return pool.submit(new Callable<Multimap<String, String>>() {
			@Override
			public Multimap<String, String> call() throws Exception {
				// Load all resolvers in one task
				ForkJoinTask<Multimap<Entity, Resolver>> loadResolversTask = ForkJoinTask.adapt(
						new Callable<Multimap<Entity, Resolver>>() {

							@Override
							public Multimap<Entity, Resolver> call() throws Exception {
								return loadResolvers(m);
							}
						}).fork();

				// Load all mappings in one task
				ForkJoinTask<Multimap<RelationshipType, Entity>> loadMappingsTaks = ForkJoinTask.adapt(
						new Callable<Multimap<RelationshipType, Entity>>() {
							@Override
							public Multimap<RelationshipType, Entity> call() throws Exception {
								return loadMappings(m);
							}
						}).fork();

				// Load all evaluators in one task
				ForkJoinTask<Multimap<Entity, Evaluator>> loadEvaluatorsTask = ForkJoinTask.adapt(
						new Callable<Multimap<Entity, Evaluator>>() {
							@Override
							public Multimap<Entity, Evaluator> call() throws Exception {
								return loadEvaluators(m);
							}
						}).fork();

				// Join the tasks
				Multimap<Entity, Resolver> resolvers = loadResolversTask.join();
				Multimap<Entity, Evaluator> entToEval = loadEvaluatorsTask.join();
				Multimap<RelationshipType, Entity> rstToEnt = loadMappingsTaks.join();

				// Get the API
				API api = createAPI(m, resolvers);

				// Badass motherforker
				Multimap<String, String> result = HashMultimap.create();

				// Make a list of all subtasks so we may join them afterwards
				List<ForkJoinTask<Multimap<String, String>>> subtasks = Lists.newArrayList();

				for (Relationship rel : from(m.allModels()).transformAndConcat(Megamodel::getDeclarations).filter(
						Relationship.class))
					// First tier: Subtask for each relationship
					subtasks.add(ForkJoinTask.adapt(new Callable<Multimap<String, String>>() {
						@Override
						public Multimap<String, String> call() throws Exception {
							List<ForkJoinTask<Multimap<String, String>>> subtasks = Lists.newArrayList();

							for (Entity ent : rstToEnt.get(rel.getType()))
								for (Evaluator eval : entToEval.get(ent))
									// Second tier: Subtask for each evaluator
									subtasks.add(ForkJoinTask.adapt(new Callable<Multimap<String, String>>() {
										@Override
										public Multimap<String, String> call() throws Exception {
											// Assign the API before evaluation
											eval.setAPI(api);
											Result result = eval.evaluate(rel);
											if (result.isValid())
												return eval.calculateTrace(rel);
											return ImmutableMultimap.of();
										}
									}).fork());

							// Join and add all results from the subtasks
							for (ForkJoinTask<Multimap<String, String>> subtask : subtasks)
								result.putAll(subtask.join());
							return result;
						}
					}).fork());

				// Join and add all results from the subtasks
				for (ForkJoinTask<Multimap<String, String>> subtask : subtasks)
					result.putAll(subtask.join());
				return result;
			}
		});
	}

	/**
	 * <p>
	 * Creates the standard issue API for reading a megamodels links and
	 * applying the appropriate resolvers to an entity.
	 * </p>
	 * <p>
	 * The result is cached using a {@link WeakHashMap}.
	 * </p>
	 * 
	 * @param m
	 * @param resolvers
	 * @return
	 */
	private static API createAPI(Megamodel m, Multimap<Entity, Resolver> resolvers) {
		return cache(compose(applier(resolvers.values()), modelReader(m)));
	}
}
