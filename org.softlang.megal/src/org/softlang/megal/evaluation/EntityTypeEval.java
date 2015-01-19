package org.softlang.megal.evaluation;

import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.EntityTypeImpl;

public class EntityTypeEval extends EntityTypeImpl {
	@Override
	public Megamodel megamodel() {
		return (Megamodel) eContainer();
	}

	@Override
	public String toString() {
		return getName() + (getSupertype() == null ? " as entity" : " < " + getSupertype());
	}

}
