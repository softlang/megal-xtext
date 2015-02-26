package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.Sets.difference;
import static java.util.Collections.singleton;
import static org.softlang.megal.Graph.extendBy;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.MegamodelImpl;

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
		return difference(extendBy(this, Megamodel::getImports), singleton(this));
	}

	@Override
	public Iterable<Megamodel> allModels() {
		return extendBy(this, Megamodel::getImports);
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