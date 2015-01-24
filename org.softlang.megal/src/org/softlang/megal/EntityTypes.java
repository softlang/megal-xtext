package org.softlang.megal;

import static com.google.common.base.Objects.equal;
import static org.softlang.megal.TypeReferences.*;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.ImmutableList;

import static org.softlang.megal.Megamodels.*;
import static org.softlang.megal.Declarations.*;

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
	public static boolean isEntityTypeMergable(EntityType a, EntityType b) {
		return a == null ? b == null : b != null && equal(a.getName(), b.getName()) && equal(a.getSupertype(), b.getSupertype());
	}

	/**
	 * Creates a merged entity type
	 * 
	 * @param a
	 *            The entity type to merge with it's group
	 * @return Returns a newly created entity type
	 */
	public static EntityType createEntityTypeMerge(EntityType a) {
		// Copy the base
		EntityType r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Declaration d : transitiveDeclarations(a.megamodel())) {
			// Skip non-entity types
			if (!(d instanceof EntityType))
				continue;

			// Cast to entity type
			EntityType b = (EntityType) d;

			// If not the source and equal, do the merge
			if (a != b && isEntityTypeMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}

	public static EntityType resolveToMergedEntityType(Megamodel m, String name) {
		for (Declaration d : m.getDeclarations()) {
			if (!(d instanceof EntityType))
				continue;

			EntityType e = (EntityType) d;

			if (match(e, name))
				return createEntityTypeMerge(e);
		}

		for (Megamodel i : m.getImports()) {
			EntityType pr = resolveToMergedEntityType(i, name);
			if (pr != null)
				return pr;
		}

		return null;
	}

	public static List<Entity> filterInstances(Collection<Declaration> declarations, TypeReference ref) {
		ImmutableList.Builder<Entity> resultBuilder = ImmutableList.builder();

		for (Declaration d : declarations) {
			// Skip non-entities
			if (!(d instanceof Entity))
				continue;

			// Cast to entity
			Entity b = (Entity) d;

			if (b.getType().equals(ref) || b.getType().latticeAbove(ref))
				resultBuilder.add(b);
		}

		return resultBuilder.build();
	}

	public static List<Entity> instances(Megamodel m, TypeReference ref) {
		return filterInstances(m.getDeclarations(), ref);
	}

	public static List<Entity> allInstances(Megamodel m, TypeReference ref) {
		return filterInstances(transitiveDeclarations(m), ref);
	}
}
