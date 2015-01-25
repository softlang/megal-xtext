package org.softlang.megal;

import static com.google.common.base.Objects.equal;

import java.awt.BufferCapabilities.FlipContents;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import static org.softlang.megal.Declarations.match;
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
	public static boolean isRelationshipMergable(Relationship a, Relationship b) {
		return a == null ? b == null : b != null && equal(a.getLeft(), b.getLeft()) && equal(a.getType(), b.getType())
				&& equal(a.getRight(), b.getRight());
	}

	/**
	 * Creates a merged relationship
	 * 
	 * @param a
	 *            The relationship to merge with it's group
	 * @return Returns a newly created relationship
	 */
	public static Relationship createRelationshipMerge(Relationship a) {
		// Copy the base
		Relationship r = EcoreUtil.copy(a);
		r.setOrigin(a);

		// Iterate all possible merge targets
		for (Declaration d : transitiveDeclarations(a.megamodel())) {
			// Skip non-relationships
			if (!(d instanceof Relationship))
				continue;

			// Cast to relationship
			Relationship b = (Relationship) d;

			// If not the source and equal, do the merge
			if (a != b && isRelationshipMergable(a, b)) {
				// Merge the annotations
				r.getAnnotations().addAll(EcoreUtil.copyAll(b.getAnnotations()));
			}
		}
		return r;
	}

	public static Relationship resolveToMergedRelationship(Megamodel m, String name) {
		for (Declaration d : m.getDeclarations()) {
			if (!(d instanceof Relationship))
				continue;

			Relationship e = (Relationship) d;

			if (match(e, name))
				return createRelationshipMerge(e);
		}

		for (Megamodel i : m.getImports()) {
			Relationship pr = resolveToMergedRelationship(i, name);
			if (pr != null)
				return pr;
		}

		return null;
	}

	public static Iterable<Relationship> filterInvolved(Iterable<Declaration> declarations, Entity left,
			RelationshipType type, Entity right) {
		return FluentIterable
				.from(declarations)
				.filter(Relationship.class)
				.filter(r -> (left == null || Entities.isEntityMergable(r.getLeft(), left))
						&& (type == null || RelationshipTypes.isRelationshipTypeMergable(r.getType(), type))
						&& (right == null || Entities.isEntityMergable(r.getRight(), right)));
	}

	public static Iterable<Relationship> involved(Megamodel m, Entity left, RelationshipType type, Entity right) {
		return filterInvolved(m.getDeclarations(), left, type, right);
	}

	public static Iterable<Relationship> allInvolved(Megamodel m, Entity left, RelationshipType type, Entity right) {
		return filterInvolved(transitiveDeclarations(m), left, type, right);
	}

}
