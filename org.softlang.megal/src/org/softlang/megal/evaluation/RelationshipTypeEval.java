package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.TypeReference;
import org.softlang.megal.impl.RelationshipTypeImpl;

import com.google.common.collect.FluentIterable;

public class RelationshipTypeEval extends RelationshipTypeImpl {
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
		return FluentIterable.from(megamodel().allModels()).transformAndConcat(Megamodel::getDeclarations)
				.filter(this::logicEq).transformAndConcat(Element::getAnnotations);
	}

	@Override
	public boolean logicEq(EObject o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof RelationshipType))
			return false;

		RelationshipType e = (RelationshipType) o;

		return equal(getName(), e.getName());

	}

	@Override
	public TypeReference instanceLeft() {
		if (getInstances().size() == 1)
			return getInstances().get(0).getLeft();
		return null;
	}

	@Override
	public TypeReference instanceRight() {
		if (getInstances().size() == 1)
			return getInstances().get(0).getRight();
		return null;
	}

	@Override
	public String identity() {
		// Name is fully representative
		return getName();
	}

	@Override
	public String toString() {
		return identity();
	}
}
