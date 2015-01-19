package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;
import static org.softlang.megal.Megamodels.*;

public class Relationships {
	/**
	 * Returns true if the relationships specify the same objects in a different
	 * location
	 * 
	 * @param a
	 *            The first relationship
	 * @param b
	 *            The second relationship
	 * @return Returns true if merge is possible
	 */
	public static boolean isMergable(Relationship a, Relationship b) {
		return equal(a.getLeft(), b.getLeft()) && equal(a.getType(), b.getType()) && equal(a.getRight(), b.getRight());
	}

	/**
	 * Returns true if the relationship is the declarator of the group specified
	 * by {@link #isMergable(Relationship, Relationship)}
	 * 
	 * @param a
	 *            The object to check
	 * @return Returns true if this object is the declarator
	 */
	public static boolean isDeclarator(Relationship a) {
		for (Declaration d : a.megamodel().getDeclarations()) {
			if (!(d instanceof Relationship))
				continue;

			Relationship b = (Relationship) d;

			if (a == b)
				return true;

			if (isMergable(a, b))
				return false;
		}
		throw new IllegalStateException("Relationship is not contained in its megamodel");
	}

	/**
	 * Creates a merged relationship
	 * 
	 * @param a
	 *            The relationship to merge with it's group
	 * @return Returns a newly created relationship
	 */
	public static Relationship createMerge(Relationship a) {
		// Copy the base
		Relationship r = EcoreUtil.copy(a);

		// Iterate all possible merge targets
		for (Declaration d : allDeclarations(a.megamodel())) {
			// Skip non-relationships
			if (!(d instanceof Relationship))
				continue;

			// Cast to relationship
			Relationship b = (Relationship) d;

			// If not the source and equal, do the merge
			if (a != b && isMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}

	private static void wire(Relationship x) {
		// If type assigned to a different megamodel
		if (x.getType().megamodel() != x.megamodel()) {

			// Get the relationship type to wire
			RelationshipType a = x.getType();

			// Iterate the targets megamodels declarations
			for (Declaration d : x.megamodel().getDeclarations()) {
				// If not an entity type, this is not a candidate
				if (!(d instanceof RelationshipType))
					continue;

				// Cast to relationship type
				RelationshipType b = (RelationshipType) d;

				// If mergable and the item is the declarator, wire to it
				if (RelationshipTypes.isMergable(a, b) && RelationshipTypes.isDeclarator(b)) {
					a = b;
					break;
				}
			}

			if (x.getType() != a)
				x.setType(a);
			else
				throw new IllegalArgumentException("The argument is not wireable in the current scope");
		}
	}
}
