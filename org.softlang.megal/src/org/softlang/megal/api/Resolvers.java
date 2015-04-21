package org.softlang.megal.api;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.reasoning.Reasoner;
import org.softlang.sourcesupport.SourceSupport;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

public class Resolvers {
	/**
	 * Gets a list of all initialized resolvers
	 * 
	 * @param reasoner
	 *            The megamodel to analyze
	 * @return Returns an immutable list
	 */
	public static Multimap<Entity, Resolver> loadResolvers(SourceSupport sourceSupport, Reasoner reasoner) {

		// Get the type
		EntityType resolverType = reasoner.getEntityType("Resolver");

		// Make result and error builder
		Multimap<Entity, Resolver> resultMultimap = HashMultimap.create();
		ImmutableMultimap.Builder<Class<? extends Resolver>, Throwable> errorsBuilder = ImmutableMultimap.builder();

		// Iterate all resolver entities
		for (Entity r : resolverType.getInstances()) {
			// Iterate all the bindings for the resolver
			for (Object l : r.getBindings()) {
				// Try to load the attached class
				Class<? extends Resolver> v = sourceSupport.loadClass(Resolver.class, (String) l);

				// If class is loadable
				if (v != null)
					try {
						Resolver vi = v.newInstance();

						vi.load(reasoner, r);

						// Put result
						resultMultimap.put(r, vi);
					} catch (InstantiationException | IllegalAccessException | Error e) {
						// On exception, put to the errors
						errorsBuilder.put(v, e);
					}
			}
		}

		// Optionally output errors
		ImmutableMultimap<Class<? extends Resolver>, Throwable> errors = errorsBuilder.build();
		if (!errors.isEmpty())
			MegalPlugin.log(Status.WARNING, "Some of the resolvers could not be instantiated, namely " + errors);

		// Build and return the result vector
		return Multimaps.unmodifiableMultimap(resultMultimap);
	}
}
