package org.softlang.megal.evaluation;

import static com.google.common.base.Objects.equal;

import org.eclipse.emf.ecore.EObject;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.LinkImpl;

import com.google.common.collect.FluentIterable;

public class LinkEval extends LinkImpl {
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
		if (!(o instanceof Link))
			return false;

		Link e = (Link) o;
		return getLink() == null ? e.getLink() == null : e != null && equal(getLink().getName(), e.getLink());
	}

	@Override
	public String identity() {
		return getLink().getName() + "=" + getTo();
	}

	@Override
	public String toString() {
		return identity();
	}
}
