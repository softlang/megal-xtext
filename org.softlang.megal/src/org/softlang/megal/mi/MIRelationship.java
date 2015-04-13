package org.softlang.megal.mi;

import static com.google.common.base.Objects.equal;

import com.google.common.base.Objects;

public abstract class MIRelationship extends MIAnnotated {
	public abstract MIEntity getLeft();

	public abstract MIRelationshipType getType();

	public abstract MIEntity getRight();

	@Override
	public int hashCode() {
		return Objects.hashCode(getLeft(), getType(), getRight());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MIRelationship))
			return false;

		MIRelationship other = (MIRelationship) obj;

		return equal(getLeft(), other.getLeft()) && equal(getType(), other.getType())
				&& equal(getRight(), other.getRight());
	}

	@Override
	public String toString() {
		return getLeft().getName() + " " + getType().getName() + " " + getRight().getName();
	}
}
