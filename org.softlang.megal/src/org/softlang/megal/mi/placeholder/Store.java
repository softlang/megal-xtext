package org.softlang.megal.mi.placeholder;

public abstract class Store<T> {
	private boolean initialzied;

	private T value;

	protected abstract T compute();

	public T getValue() {
		if (!initialzied) {
			initialzied = true;
			value = compute();
		}

		return value;
	}

	@Override
	public String toString() {
		if (initialzied)
			return String.valueOf(value);
		
		return "<proxy...>";
	}
}
