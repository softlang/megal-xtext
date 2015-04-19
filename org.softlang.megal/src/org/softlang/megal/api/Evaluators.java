package org.softlang.megal.api;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Sets.newHashSet;

import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.sourcesupport.SourceSupport;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
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
	public static Multimap<Entity, Evaluator> loadEvaluators(SourceSupport s, Reasoner m) {

		// Get the types
		EntityType evaluatorType = m.getEntityType("Evaluator");
		// RelationshipType realizationOfType = resolve(m,
		// RelationshipType.class, "realizationOf");
		// RelationshipType partOfType = resolve(m, RelationshipType.class,
		// "partOf");

		// Make result and error builder
		// ImmutableMultimap.Builder<Entity, Evaluator> resultBuilder =
		// ImmutableMultimap.builder();
		Multimap<Entity, Evaluator> resultMultimap = HashMultimap.create();
		ImmutableMultimap.Builder<Class<? extends Evaluator>, Throwable> errorsBuilder = ImmutableMultimap.builder();

		// Iterate all evaluator entities
		for (Entity r : evaluatorType.getInstances()) {

			// Iterate all the bindings for the resolver
			for (String l : r.getBindings()) {
				// Try to load the attached class
				Class<? extends Evaluator> v = s.loadClass(Evaluator.class, l);

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
				for (Relationship r : from.getKey().outgoing())
					if ("partOf".equals(r.getType().getName()))
						to.getValue().add(from.getValue(), r);

		// Evaluator realizes entity
		for (Entry<Entity, Evaluator> it : resultMultimap.entries())
			for (Relationship r : it.getKey().outgoing())
				if ("realizationOf".equals(r.getType().getName()))
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
	public static Multimap<RelationshipType, Entity> loadMappings(Reasoner m) {
		Multimap<RelationshipType, Entity> resultMultimap = HashMultimap.create();

		for (RelationshipType b : m.getRelationshipTypes()) {
			String plugin = b.getAnnotation("Plugin");

			if (plugin != null)
				resultMultimap.put(b, m.getEntity(plugin));
		}

		return Multimaps.unmodifiableMultimap(resultMultimap);
	}

	public static Result evaluate(SourceSupport s, Reasoner m) {

		// Load all evaluators
		// Multimap<Entity, Resolver> resolvers = loadResolvers(s, m);
		Multimap<Entity, Evaluator> entToEval = loadEvaluators(s, m);
		Multimap<RelationshipType, Entity> rstToEnt = loadMappings(m);

		// Get the API
		Multimap<String, String> trace = HashMultimap.create();
		Multimap<Relationship, String> invalid = HashMultimap.create();
		Set<Relationship> valid = newHashSet();

		for (Relationship b : m.getRelationships()) {
			Collection<Entity> evaluators = rstToEnt.get(b.getType());

			for (Entity x : evaluators)
				for (Evaluator y : entToEval.get(x)) {
					Output result = y.evaluate(b);

					if (result.isApplicable()) {
						if (result.isError())
							invalid.put(b, result.getError());
						else {
							valid.add(b);
							trace.putAll(y.calculateTrace(b));
						}
					}
				}
		}

		return new Result(invalid, valid, trace);
	}

	/**
	 * Three-tiered parallel evaluation
	 *
	 * @param m
	 * @return
	 */
	public static ForkJoinTask<Result> evaluateParallel(ForkJoinPool pool, SourceSupport s, Reasoner m) {

		return pool.submit(new Callable<Result>() {
			@Override
			public Result call() throws Exception {
				// Load all resolvers in one task
				// ForkJoinTask<Multimap<Entity, Resolver>> loadResolversTask =
				// ForkJoinTask.adapt(
				// new Callable<Multimap<Entity, Resolver>>() {
				//
				// @Override
				// public Multimap<Entity, Resolver> call() throws Exception {
				// return loadResolvers(s, m);
				// }
				// }).fork();

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
								return loadEvaluators(s, m);
							}
						}).fork();

				// Join the tasks
				// Multimap<Entity, Resolver> resolvers =
				// loadResolversTask.join();
				Multimap<Entity, Evaluator> entToEval = loadEvaluatorsTask.join();
				Multimap<RelationshipType, Entity> rstToEnt = loadMappingsTaks.join();

				Result result = new Result(ImmutableMultimap.of(), ImmutableSet.of(), ImmutableMultimap.of());

				// Make a list of all subtasks so we may join them afterwards
				List<ForkJoinTask<Result>> subtasks = newArrayList();

				for (Relationship rel : m.getRelationships())
					// First tier: Subtask for each relationship
					subtasks.add(ForkJoinTask.adapt(new Callable<Result>() {
						@Override
						public Result call() throws Exception {
							Result result = new Result(ImmutableMultimap.of(), ImmutableSet.of(), ImmutableMultimap
									.of());

							List<ForkJoinTask<Result>> subtasks = newArrayList();

							for (Entity ent : rstToEnt.get(rel.getType()))
								for (Evaluator eval : entToEval.get(ent))
									// Second tier: Subtask for each evaluator
									subtasks.add(ForkJoinTask.adapt(new Callable<Result>() {
										@Override
										public Result call() throws Exception {
											// Assign the API before evaluation
											Output result = eval.evaluate(rel);

											if (result.isApplicable()) {
												if (result.isError())
													return new Result(ImmutableMultimap.of(rel, result.getError()),
															ImmutableSet.of(), ImmutableMultimap.of());
												else
													return new Result(ImmutableMultimap.of(), ImmutableSet.of(rel),
															eval.calculateTrace(rel));

											}

											return new Result(ImmutableMultimap.of(), ImmutableSet.of(),
													ImmutableMultimap.of());
										}
									}).fork());

							// Join and add all results from the subtasks
							for (ForkJoinTask<Result> subtask : subtasks)
								result = Result.concatenate(result, subtask.join());

							return result;
						}
					}).fork());

				// Join and add all results from the subtasks
				for (ForkJoinTask<Result> subtask : subtasks)
					result = Result.concatenate(result, subtask.join());

				return result;
			}
		});
	}
	//
	// /**
	// * <p>
	// * Creates the standard issue API for reading a megamodels links and
	// * applying the appropriate resolvers to an entity.
	// * </p>
	// * <p>
	// * The result is cached using a {@link WeakHashMap}.
	// * </p>
	// *
	// * @param m
	// * @param resolvers
	// * @return
	// */
	// private static API createAPI(Megamodel m, Multimap<Entity, Resolver>
	// resolvers) {
	// return cache(compose(applier(resolvers.values()), modelReader(m)));
	// }
}
