package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;

import static org.softlang.megal.Megamodels.*;

import static org.softlang.megal.Nameds.*;

public class RelationshipTypes {
	/**
	 * Returns true if the relationship types specify the same objects in a
	 * different location
	 * 
	 * @param a
	 *            The first relationship type
	 * @param b
	 *            The second relationship type
	 * @return Returns true if merge is possible
	 */
	public static boolean isMergable(RelationshipType a, RelationshipType b) {
		return equal(a.getName(), b.getName());
	}

	/**
	 * Creates a merged relationship
	 * 
	 * @param a
	 *            The relationship to merge with it's group
	 * @return Returns a newly created relationship
	 */
	public static RelationshipType createMerge(RelationshipType a) {
		// Copy the base
		RelationshipType r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Declaration d : allDeclarations(a.megamodel())) {
			// Skip non-relationship types
			if (!(d instanceof RelationshipType))
				continue;

			// Cast to relationship type
			RelationshipType b = (RelationshipType) d;

			// If not the source and equal, do the merge
			if (a != b && isMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
				r.getInstances().addAll(EcoreUtil.copyAll(b.getInstances()));
			}
		}
		return r;
	}

	public static RelationshipType resolveToMerged(Megamodel m, String name) {
		for (Declaration d : m.getDeclarations()) {
			if (!(d instanceof EntityType))
				continue;

			RelationshipType e = (RelationshipType) d;

			if (match(e, name))
				return createMerge(e);
		}

		for (Megamodel i : m.getImports()) {
			RelationshipType pr = resolveToMerged(i, name);
			if (pr != null)
				return pr;
		}

		return null;
	}
}
