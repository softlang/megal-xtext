package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * Returns true if the entity type is the declarator of the group specified
	 * by {@link #isMergable(EntityType, EntityType)}
	 * 
	 * @param a
	 *            The object to check
	 * @return Returns true if this object is the declarator
	 */
	public static boolean isDeclarator(EntityType a) {
		for (Declaration d : a.megamodel().getDeclarations()) {
			if (!(d instanceof EntityType))
				continue;

			EntityType b = (EntityType) d;

			if (a == b)
				return true;

			if (isMergable(a, b))
				return false;
		}
		throw new IllegalStateException("Entity type is not contained in its megamodel");
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

		// Iterate all possible merge targets
		for (Declaration d : a.megamodel().getDeclarations()) {
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

	public static void wire(EntityType x) {
		// If type assigned to a different megamodel
		if (x.getSupertype() != null && x.getSupertype().getDefinition().megamodel() != x.megamodel()) {

			// Get the entity type to wire
			EntityType a = x.getSupertype().getDefinition();

			// Iterate the targets megamodels declarations
			for (Declaration d : x.megamodel().getDeclarations()) {
				// If not an entity type, this is not a candidate
				if (!(d instanceof EntityType))
					continue;

				// Cast to entity type
				EntityType b = (EntityType) d;

				// If mergable and the item is the declarator, wire to it
				if (EntityTypes.isMergable(a, b) && EntityTypes.isDeclarator(b)) {
					a = b;
					break;
				}
			}

			if (x.getSupertype().getDefinition() != a)
				x.getSupertype().setDefinition(a);
			else
				throw new IllegalArgumentException("The argument is not wireable in the current scope");
		}
	}
}
