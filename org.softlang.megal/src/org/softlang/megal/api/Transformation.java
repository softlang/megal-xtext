package org.softlang.megal.api;

import org.softlang.megal.Megamodel;

public interface Transformation extends Parameterized {
	Megamodel transform(Megamodel in);
}
