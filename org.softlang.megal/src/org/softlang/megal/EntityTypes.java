package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;

import static org.softlang.megal.Megamodels.*;

import static org.softlang.megal.Nameds.*;
public class EntityTypes {
	/**
	 * Returns true if the entity types specify the same objects in a different
	 * location
	 * 
	 * @param a
	 *            The first entity type
	 * @param b
	 *            The second entity type
	 * @return Returns true if merge is possible
	 */
	public static boolean isMergable(EntityType a, EntityType b) {
		return equal(a.getName(), b.getName()) && equal(a.getSupertype(), b.getSupertype());
	}

	/**
	 * Creates a merged entity type
	 * 
	 * @param a
	 *            The entity type to merge with it's group
	 * @return Returns a newly created entity type
	 */
	public static EntityType createMerge(EntityType a) {
		// Copy the base
		EntityType r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Declaration d : allDeclarations(a.megamodel())) {
			// Skip non-entity types
			if (!(d instanceof EntityType))
				continue;

			// Cast to entity type
			EntityType b = (EntityType) d;

			// If not the source and equal, do the merge
			if (a != b && isMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}

	public static EntityType resolveToMerged(Megamodel m, String name) {
		for (Declaration d : m.getDeclarations()) {
			if (!(d instanceof EntityType))
				continue;

			EntityType e = (EntityType) d;

			if (match(e, name))
				return createMerge(e);
		}

		for (Megamodel i : m.getImports()) {
			EntityType pr = resolveToMerged(i, name);
			if (pr != null)
				return pr;
		}

		return null;
	}
}
