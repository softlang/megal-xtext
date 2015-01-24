package org.softlang.megal;

import static org.softlang.megal.Entities.allBindings;
import static org.softlang.megal.EntityTypes.allInstances;
import static org.softlang.megal.TypeReferences.singleRef;

import java.util.List;

import org.eclipse.core.runtime.Status;
import org.softlang.megal.api.Resolver;
import org.softlang.sourcesupport.SourceSupport;
import org.softlang.sourcesupport.SourceSupportPlugin;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;

public class Resolvers {
	/**
	 * Gets a list of all initialized resolvers
	 * 
	 * @param m
	 *            The megamodel to analyze
	 * @return Returns an immutable list
	 */
	public static List<Resolver> allResolvers(Megamodel m) {
		// Get the type
		EntityType resolverType = EntityTypes.resolveToMergedEntityType(m, "Resolver");

		// Get support for code
		SourceSupport s = SourceSupportPlugin.getSupport().analyzeContaining(m);

		// Make result and error builder
		ImmutableList.Builder<Resolver> resultBuilder = ImmutableList.builder();
		ImmutableMultimap.Builder<Class<? extends Resolver>, Throwable> errorsBuilder = ImmutableMultimap.builder();

		// Iterate all resolver entities
		for (Entity r : allInstances(m, singleRef(resolverType))) {
			// Make a store for a potential merge
			Entity merged = null;

			// Iterate all the binding s for the resolver
			for (Link l : allBindings(m, r, null, null)) {
				// Try to load the attached class
				Class<? extends Resolver> v = s.loadClass(Resolver.class, l.getTo());

				// If class is loadable
				if (v != null)
					try {
						// Create merge if not already merged
						if (merged == null)
							merged = Entities.createEntityMerge(r);

						Resolver vi = v.newInstance();

						vi.load(merged);

						// Put result
						resultBuilder.add(vi);
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

		// Build the
		return resultBuilder.build();
	}
}
