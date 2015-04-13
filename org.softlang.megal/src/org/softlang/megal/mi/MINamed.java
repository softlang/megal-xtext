package org.softlang.megal.mi;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.Iterables.getOnlyElement;

import com.google.common.base.Objects;

public abstract class MINamed extends MIAnnotated {
	public abstract String getDefinedName();

	public String getName() {
		if (getAnnotations().containsKey(null))
			return getAnnotation(null);

		return getDefinedName();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MINamed))
			return false;

		MINamed other = (MINamed) obj;
		return equal(getName(), other.getName());
	}
}
