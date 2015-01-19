package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;

import static org.softlang.megal.Megamodels.*;
import static org.softlang.megal.Nameds.*;

public class Entities {
	/**
	 * Returns true if the entities specify the same objects in a different
	 * location
	 * 
	 * @param a
	 *            The first entity
	 * @param b
	 *            The second entity
	 * @return Returns true if merge is possible
	 */
	public static boolean isMergable(Entity a, Entity b) {
		return equal(a.getName(), b.getName()) && equal(a.getType(), b.getType());
	}

	/**
	 * Creates a merged entity
	 * 
	 * @param a
	 *            The entity to merge with it's group
	 * @return Returns a newly created entity
	 */
	public static Entity createMerge(Entity a) {
		// Copy the base
		Entity r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Declaration d : allDeclarations(a.megamodel())) {
			// Skip non-entities
			if (!(d instanceof Entity))
				continue;

			// Cast to entity
			Entity b = (Entity) d;

			// If not the source and equal, do the merge
			if (a != b && isMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}

	public static Entity resolveToMerged(Megamodel m, String name) {
		for (Declaration d : m.getDeclarations()) {
			if (!(d instanceof Entity))
				continue;

			Entity e = (Entity) d;

			if (match(e, name))
				return createMerge(e);
		}

		for (Megamodel i : m.getImports()) {
			Entity pr = resolveToMerged(i, name);
			if (pr != null)
				return pr;
		}

		return null;
	}
}
