package org.softlang.megal.evaluation;

import org.softlang.megal.impl.RelationshipTypeInstanceImpl;

public class RelationshipTypeInstanceEval extends RelationshipTypeInstanceImpl {

	@Override
	public String toString() {
		return getLeft() + " * " + getRight();
	}

}
