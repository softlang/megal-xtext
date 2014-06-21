package org.softlang.megal.semantics;

import org.softlang.megal.megaL.ED;

public interface EntitySemantics {
	public void evaluate(Object state, ED entity);
}
