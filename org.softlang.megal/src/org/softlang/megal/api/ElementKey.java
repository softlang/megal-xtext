package org.softlang.megal.api;

import java.util.Objects;

import org.softlang.megal.Element;
import org.softlang.megal.Elements;

public class ElementKey<K extends Element> {
	private final K element;

	public ElementKey(K element) {
		this.element = element;
	}

	public K getElement() {
		return element;
	}

	@Override
	public int hashCode() {
		if (element == null)
			return 0;

		return element.identity().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (!(obj instanceof ElementKey))
			return false;

		ElementKey<?> o = (ElementKey<?>) obj;

		return Elements.logicEq(element, o.element);
	}

	@Override
	public String toString() {
		return Objects.toString(element);
	}
}
