package org.softlang.megal.evaluation;

import org.softlang.megal.impl.FunctionApplicationImpl;

public class FunctionApplicationEval extends FunctionApplicationImpl {
	@Override
	public String identity() {
		return getFunction().getName() + "(" + getInput().getName() + ")|->" + getOutput();
	}

	@Override
	public String toString() {
		return identity();
	}
}
