package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * Returns true if the entity is the declarator of the group specified by
	 * {@link #isMergable(Entity, Entity)}
	 * 
	 * @param a
	 *            The object to check
	 * @return Returns true if this object is the declarator
	 */
	public static boolean isDeclarator(Entity a) {
		for (Declaration d : a.megamodel().getDeclarations()) {
			if (!(d instanceof Entity))
				continue;

			Entity b = (Entity) d;

			if (a == b)
				return true;

			if (isMergable(a, b))
				return false;
		}
		throw new IllegalStateException("Entity is not contained in its megamodel");
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

		// Iterate all possible merge targets
		for (Declaration d : a.megamodel().getDeclarations()) {
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

	public static void wire(Entity x) {
		// If type assigned to a different megamodel
		if (x.getType() != null && x.getType().getDefinition().megamodel() != x.megamodel()) {

			// Get the entity type to wire
			EntityType a = x.getType().getDefinition();

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

			if (x.getType().getDefinition() != a)
				x.getType().setDefinition(a);
			else
				throw new IllegalArgumentException("The argument is not wireable in the current scope");
		}
	}
}
