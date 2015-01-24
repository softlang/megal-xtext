package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.ImmutableList;

import static org.softlang.megal.Megamodels.*;
import static org.softlang.megal.Declarations.*;
import static org.softlang.megal.Annotations.*;

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
	public static boolean isEntityMergable(Entity a, Entity b) {
		return a == null ? b == null : b != null && equal(a.getName(), b.getName()) && equal(a.getType(), b.getType());
	}

	/**
	 * Creates a merged entity
	 * 
	 * @param a
	 *            The entity to merge with it's group
	 * @return Returns a newly created entity
	 */
	public static Entity createEntityMerge(Entity a) {
		// Copy the base
		Entity r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Declaration d : transitiveDeclarations(a.megamodel())) {
			// Skip non-entities
			if (!(d instanceof Entity))
				continue;

			// Cast to entity
			Entity b = (Entity) d;

			// If not the source and equal, do the merge
			if (a != b && isEntityMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}

	public static Entity resolveToMergedEntity(Megamodel m, String name) {
		for (Declaration d : m.getDeclarations()) {
			if (!(d instanceof Entity))
				continue;

			Entity e = (Entity) d;

			if (match(e, name))
				return createEntityMerge(e);
		}

		for (Megamodel i : m.getImports()) {
			Entity pr = resolveToMergedEntity(i, name);
			if (pr != null)
				return pr;
		}

		return null;
	}

	public static List<Link> filterBindings(Collection<Link> bindings, Entity link, Entity input, Entity output) {
		ImmutableList.Builder<Link> resultBuilder = ImmutableList.builder();

		for (Link d : bindings)
			if (isEntityMergable(d.getLink(), link) && isEntityMergable(d.getInput(), input)
					&& isEntityMergable(d.getOutput(), output))
				resultBuilder.add(d);

		return resultBuilder.build();
	}

	public static List<Link> bindings(Megamodel m, Entity link, Entity input, Entity output) {
		return filterBindings(m.getBindings(), link, input, output);
	}

	public static List<Link> allBindings(Megamodel m, Entity link, Entity input, Entity output) {
		return filterBindings(transitiveBindings(m), link, input, output);
	}

}
