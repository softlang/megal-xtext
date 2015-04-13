package org.softlang.megal.mi;

import static com.google.common.base.Objects.equal;

import org.softlang.megal.mi.util.IdBuilder;

import com.google.common.base.Objects;

/**
 * <p>
 * There must be no relationship with the same {@link #getType()} and the same
 * {@link #getLeft()} and {@link #getRight()} in the containing megamodel.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class MIRelationship extends MIAnnotated {
	@Override
	public String getId() {
		return IdBuilder.of("relationship").add(getLeft()).add(getType()).add(getRight()).toString();
	}

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
