package org.softlang.megal.evaluation;

import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.RelationshipImpl;

public class RelationshipEval extends RelationshipImpl {
	@Override
	public Megamodel getMegamodel() {
		if (eContainer() == null || !(eContainer() instanceof Megamodel))
			throw new IllegalStateException("Dangeling declaration");

		return (Megamodel) eContainer();
	}
	@Override
	public boolean isAssigned() {
		return getLeft() != null && getType() != null && getRight() != null;
	}

	@Override
	public String toString() {
		return getLeft() + " " + getType() + " " + getRight();
	}
}
