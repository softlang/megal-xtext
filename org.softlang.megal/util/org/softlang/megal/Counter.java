package org.softlang.megal;

public final class Counter {
	int value = 0;

	public int next() {
		return value++;
	}
}
