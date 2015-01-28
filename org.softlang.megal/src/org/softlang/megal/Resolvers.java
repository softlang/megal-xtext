package org.softlang.megal;

import static org.softlang.megal.Elements.resolve;
import static org.softlang.megal.EntityTypes.allInstances;
import static org.softlang.megal.Links.allBindings;
import static org.softlang.megal.TypeReferences.singleRef;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.api.ElementMap;
import org.softlang.megal.api.Resolver;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

public class Resolvers {
	/**
	 * Gets a list of all initialized resolvers
	 * 
	 * @param m
	 *            The megamodel to analyze
	 * @return Returns an immutable list
	 */
	public static Multimap<Entity, Resolver> loadResolvers(Megamodel m) {

		// Get the type
		EntityType resolverType = resolve(m, "Resolver");

		// Get support for code
		SourceSupport s = SourceSupportPlugin.getSupport().analyzeContaining(m);

		// Make result and error builder
		Multimap<Entity, Resolver> resultMultimap = ElementMap.newSetMultimap(Entity.class);
		ImmutableMultimap.Builder<Class<? extends Resolver>, Throwable> errorsBuilder = ImmutableMultimap.builder();

		// Iterate all resolver entities
		for (Entity r : allInstances(m, singleRef(resolverType))) {
			// Iterate all the bindings for the resolver
			for (Link l : allBindings(m, r, null, null)) {
				// Try to load the attached class
				Class<? extends Resolver> v = s.loadClass(Resolver.class, l.getTo());

				// If class is loadable
				if (v != null)
					try {
						Resolver vi = v.newInstance();

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
		ImmutableMultimap<Class<? extends Resolver>, Throwable> errors = errorsBuilder.build();
		if (!errors.isEmpty())
			MegalPlugin.log(Status.WARNING, "Some of the resolvers could not be instantiated, namely " + errors);

		// Build and return the result vector
		return Multimaps.unmodifiableMultimap(resultMultimap);
	}
}
