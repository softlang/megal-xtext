package org.softlang.megal.mi;

import org.softlang.megal.Megamodel;
import org.softlang.megal.mi.wrapped.WrappedMegamodel;

public class MI {
	public static MIMegamodel initialize(Megamodel megamodel) {
		return new WrappedMegamodel(megamodel);
	}
}
