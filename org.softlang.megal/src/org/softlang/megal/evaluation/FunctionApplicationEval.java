package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Element;
import org.softlang.megal.Elements;
import org.softlang.megal.EntityType;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.FunctionApplicationImpl;

import com.google.common.collect.FluentIterable;

public class FunctionApplicationEval extends FunctionApplicationImpl {
	@Override
	public Megamodel megamodel() {
		return (Megamodel) eContainer();
	}

	@Override
	public boolean logicEq(EObject o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof FunctionApplication))
			return false;

		FunctionApplication e = (FunctionApplication) o;
		return Elements.logicEq(getFunction(), e.getFunction()) &&
				Elements.logicEq(getInput(), e.getInput()) &&
				Elements.logicEq(getOutput(), e.getOutput()) ;
	}

	@Override
	public String identity() {
		return getFunction().getName() + "(" + getInput().getName() + ")|->" + getOutput();
	}

	@Override
	public Iterable<Annotation> allAnnotations() {
		return FluentIterable.from(megamodel().allModels()).transformAndConcat(Megamodel::getDeclarations)
				.filter(this::logicEq).transformAndConcat(Element::getAnnotations);
	}

	@Override
	public String toString() {
		return identity();
	}
}
