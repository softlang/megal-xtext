package org.softlang.megal;

import static org.softlang.megal.Links.allBindings;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.softlang.megal.api.API;
import org.softlang.megal.api.Resolver;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class APIs {
	/**
	 * <p>
	 * Resolvers are defined as applicable predicates, this API wrapper caches
	 * their result for an entity using a weak hash map.
	 * </p>
	 * 
	 * @param resolvers
	 *            The resolvers to test and apply
	 * @return Returns a new API
	 */
	public static API applier(Iterable<Resolver> resolvers) {
		return new API() {

			@Override
			public List<String> getLinks(Entity entity) {
				ImmutableList.Builder<String> resultBuilder = ImmutableList.builder();

				for (Resolver r : resolvers)
					if (r.resolves(entity))
						resultBuilder.add(r.resolve(entity));

				return resultBuilder.build();
			}
		};
	}

	/**
	 * <p>
	 * Reads the links associated with the entity in the model.
	 * </p>
	 * 
	 * @param m
	 *            The model to read from, possibly below the model in which the
	 *            entities to evaluate has been placed
	 * @return Returns a new API
	 */
	public static API modelReader(Megamodel m) {
		return new API() {

			@Override
			public List<String> getLinks(Entity entity) {
				ImmutableList.Builder<String> resultBuilder = ImmutableList.builder();

				for (Link l : allBindings(m, entity))
					resultBuilder.add(l.getTo());

				return resultBuilder.build();
			}
		};
	}

	/**
	 * <p>
	 * Caches the results of an API using a {@link WeakHashMap}.
	 * </p>
	 * 
	 * @param api
	 *            The API to cache
	 * @return Returns a new API
	 */
	public static API cache(API api) {
		return new API() {
			private final Map<Entity, Iterable<String>> cache = new WeakHashMap<Entity, Iterable<String>>();

			@Override
			public Iterable<String> getLinks(Entity entity) {
				return cache.computeIfAbsent(entity, api::getLinks);
			}
		};
	}

	/**
	 * <p>
	 * Composes a list of APIs by concatenation of their results
	 * </p>
	 * 
	 * @param xs
	 *            The APIs to compose
	 * @return Returns a new API
	 */
	public static API compose(API... xs) {
		return new API() {
			@Override
			public Iterable<String> getLinks(Entity entity) {
				Iterable<String> r = ImmutableList.of();

				for (API x : xs)
					r = Iterables.concat(r, x.getLinks(entity));

				return r;
			}
		};
	}

}
