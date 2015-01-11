package org.softlang.megal.evaluation;

import org.softlang.megal.Element;
import org.softlang.megal.Elements;
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

	@Override
	public boolean equalBase(Element other) {
		if (!(other instanceof RelationshipEval))
			return false;

		RelationshipEval rother = (RelationshipEval) other;

		if (!Elements.equalBase(getLeft(), rother.getLeft()))
			return false;

		if (!Elements.equalBase(getType(), rother.getType()))
			return false;

		if (!Elements.equalBase(getRight(), rother.getRight()))
			return false;

		return true;
	}
}
