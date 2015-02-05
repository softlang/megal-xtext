package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;
import static org.softlang.megal.RelationshipTypes.allOverloads;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.impl.RelationshipImpl;

public class RelationshipEval extends RelationshipImpl {
	@Override
	public Megamodel megamodel() {
		if (getOrigin() != null) {
			if (getOrigin() instanceof Megamodel)
				return (Megamodel) getOrigin();

			if (getOrigin() instanceof Declaration)
				return ((Declaration) getOrigin()).megamodel();
		}

		return (Megamodel) eContainer();
	}

	@Override
	public Iterable<Annotation> allAnnotations() {
		return from(megamodel().allModels()).transformAndConcat(Megamodel::getDeclarations).filter(this::logicEq)
				.transformAndConcat(Element::getAnnotations);
	}

	@Override
	public boolean logicEq(EObject o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Relationship))
			return false;

		Relationship e = (Relationship) o;
		// Left same name
		return (getLeft() == null ? e.getLeft() == null : e != null && equal(getLeft().getName(), e.getLeft())) &&
		// Relationship type same name
				(getType() == null ? e.getType() == null : e != null && equal(getType().getName(), e.getType())) &&
				// Right same name
				(getRight() == null ? e.getRight() == null : e != null && equal(getRight().getName(), e.getRight()));

	}

	@Override
	public RelationshipType appliedInstance() {
		if (getType() == null)
			return null;

		RelationshipType prv = null;
		int mc = Integer.MAX_VALUE;
		for (RelationshipType i : allOverloads(megamodel(), getType())) {
			int dl = i.getLeft().equals(getLeft().getType()) ? 0 : i.getLeft().latticeBelow(getLeft().getType()) ? 1
					: -1;
			int dr = i.getRight().equals(getRight().getType()) ? 0
					: i.getRight().latticeBelow(getRight().getType()) ? 1 : -1;

			// Prefer exact matches for both, then for one of each, then
			// don't
			// care as long as it's applicable
			if (dl >= 0 && dr >= 0)
				if (mc > dl + dr) {
					mc = dl + dr;
					prv = i;
				}
		}

		return prv;
	}

	@Override
	public String identity() {
		return getLeft().getName() + " " + getType().getName() + " " + getRight().getName();
	}

	@Override
	public String toString() {
		return identity();
	}

}
