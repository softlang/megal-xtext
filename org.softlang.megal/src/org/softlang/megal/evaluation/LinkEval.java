package org.softlang.megal.evaluation;

import org.softlang.megal.impl.LinkImpl;

public class LinkEval extends LinkImpl {

	@Override
	public String toString() {
		return getLink() + " = " + getTo();
	}
}
