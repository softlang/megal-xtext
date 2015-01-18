package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * Returns true if the relationship type is the declarator of the group
	 * specified by {@link #isMergable(RelationshipType, RelationshipType)}
	 * 
	 * @param a
	 *            The object to check
	 * @return Returns true if this object is the declarator
	 */
	public static boolean isDeclarator(RelationshipType a) {
		for (Declaration d : a.megamodel().getDeclarations()) {
			if (!(d instanceof RelationshipType))
				continue;

			RelationshipType b = (RelationshipType) d;

			if (a == b)
				return true;

			if (isMergable(a, b))
				return false;
		}
		throw new IllegalStateException("Relationship type is not contained in its megamodel");
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

		// Iterate all possible merge targets
		for (Declaration d : a.megamodel().getDeclarations()) {
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
}
