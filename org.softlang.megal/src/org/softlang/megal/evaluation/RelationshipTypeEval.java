package org.softlang.megal.evaluation;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.softlang.megal.Megamodel;
import org.softlang.megal.TypeReference;
import org.softlang.megal.impl.RelationshipTypeImpl;

public class RelationshipTypeEval extends RelationshipTypeImpl {
	@Override
	public Megamodel megamodel() {
		return (Megamodel) eContainer();
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
	public String toString() {
		return getName() + " defined on " + getInstances();
	}

}
