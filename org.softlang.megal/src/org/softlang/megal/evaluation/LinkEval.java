package org.softlang.megal.evaluation;

import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.LinkImpl;

public class LinkEval extends LinkImpl {
	@Override
	public Megamodel getMegamodel() {
		if (eContainer() == null || !(eContainer() instanceof Megamodel))
			throw new IllegalStateException("Dangeling binding");

		return (Megamodel) eContainer();
	}

	@Override
	public boolean isAssigned() {
		return getLink() != null && getTo() != null;
	}

	@Override
	public String toString() {
		return getLink() + " = " + getTo();
	}
}