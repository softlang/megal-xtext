package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.EntityTypeImpl;

import com.google.common.collect.FluentIterable;

public class EntityTypeEval extends EntityTypeImpl {
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
		if (!(o instanceof EntityType))
			return false;

		EntityType e = (EntityType) o;
		return equal(getName(), e.getName()) && equal(getSupertype(), e.getSupertype());
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
