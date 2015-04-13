package org.softlang.megal.mi.util;

import org.softlang.megal.mi.MIElement;

public final class IdBuilder {
	private StringBuilder resultBuilder;

	private IdBuilder(String classification) {
		resultBuilder = new StringBuilder(classification);
	}

	public static IdBuilder of(String classification) {
		return new IdBuilder(classification);
	}

	public IdBuilder add(MIElement element) {
		if (element == null)
			resultBuilder.append("(null)");
		else
			resultBuilder.append('(').append(element.getId()).append(')');

		return this;
	}

	public IdBuilder add(Iterable<? extends MIElement> elements) {
		resultBuilder.append('{');

		for (MIElement element : elements)
			add(element);

		resultBuilder.append('}');
		return this;
	}

	public IdBuilder add(Object literal) {
		resultBuilder.append('[').append(literal).append(']');
		return this;
	}

	@Override
	public int hashCode() {
		return resultBuilder.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdBuilder other = (IdBuilder) obj;
		if (resultBuilder == null) {
			if (other.resultBuilder != null)
				return false;
		} else if (!resultBuilder.equals(other.resultBuilder))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return resultBuilder.toString();
	}
}
