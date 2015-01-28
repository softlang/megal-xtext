package org.softlang.megal.evaluation;

import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.concat;
import static java.util.Collections.singleton;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.MegamodelImpl;

import static com.google.common.base.Objects.*;

public class MegamodelEval extends MegamodelImpl {
	@Override
	public Megamodel megamodel() {
		return this;
	}

	@Override
	public Iterable<Annotation> allAnnotations() {
		return getAnnotations();
	}

	@Override
	public Iterable<Megamodel> allImports() {
		return concat(getImports(), from(getImports()).transformAndConcat(Megamodel::allImports));
	}

	@Override
	public Iterable<Megamodel> allModels() {
		return concat(singleton(this), getImports(), from(getImports()).transformAndConcat(Megamodel::allImports));
	}

	@Override
	public boolean logicEq(EObject o) {
		if (this == o)
			return true;
		if (o == null)
			return false;

		if (!(o instanceof Megamodel))
			return false;

		Megamodel e = (Megamodel) o;
		return equal(getName(), e.getName());
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