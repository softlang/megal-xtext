package org.softlang.megal.evaluation;

import org.softlang.megal.Element;
import org.softlang.megal.Elements;
import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.impl.LinkImpl;

import com.google.common.base.Objects;

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

	@Override
	public boolean equalBase(Element other) {
		if (!(other instanceof Link))
			return false;
		Link lother = (Link) other;

		if (!Elements.equalBase(getLink(), lother.getLink()))
			return false;

		if (!Objects.equal(getTo(), lother.getTo()))
			return false;

		return true;
	}
}
