package org.softlang.megal.api;

import org.softlang.megal.Megamodel;

public interface Refactoring extends Transformation {
	void refactor(Megamodel megamodel);
}
