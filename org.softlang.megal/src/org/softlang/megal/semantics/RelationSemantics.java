package org.softlang.megal.semantics;

import org.softlang.megal.megaL.RD;

public interface RelationSemantics {
	public void evaluate(Object state, RD relation);
}
