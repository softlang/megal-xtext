package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;

import java.util.List;

/**
 * <p>
 * Base class for relationship types in the model interface that supports a
 * basic set of reasoning operations.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class RelationshipType extends Named {
	/**
	 * <p>
	 * Gets the left input type.
	 * </p>
	 * 
	 * @return Returns the left input type
	 */
	public abstract EntityType getLeft();

	/**
	 * <p>
	 * Returns true if the left input type is a many reference.
	 * </p>
	 */
	public abstract boolean isLeftMany();

	/**
	 * <p>
	 * Gets the parameters of the left input type.
	 * </p>
	 * 
	 * @return Returns a list of entities
	 */
	public abstract List<? extends Entity> getLeftParams();

	/**
	 * <p>
	 * Gets the right input type.
	 * </p>
	 * 
	 * @return Returns the right input type
	 */
	public abstract EntityType getRight();

	/**
	 * <p>
	 * Returns true if the right input type is a many reference.
	 * </p>
	 */
	public abstract boolean isRightMany();

	/**
	 * <p>
	 * Gets the parameters of the right input type.
	 * </p>
	 * 
	 * @return Returns a list of entities
	 */
	public abstract List<? extends Entity> getRightParams();

	@Override
	public int hashCode() {
		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (!(obj instanceof RelationshipType))
			return false;

		RelationshipType other = (RelationshipType) obj;

		if (!equal(getName(), other.getName()))
			return false;

		if (!equal(getLeft(), other.getLeft()))
			return false;

		if (!equal(isLeftMany(), other.isLeftMany()))
			return false;

		if (!equal(getLeftParams(), other.getLeftParams()))
			return false;

		if (!equal(getRight(), other.getRight()))
			return false;

		if (!equal(isRightMany(), other.isRightMany()))
			return false;

		if (!equal(getRightParams(), other.getRightParams()))
			return false;

		return true;
	}

	@Override
	public String toString() {
		String left = getLeft().getName() + (isLeftMany() ? "+" : "")
				+ (getLeftParams().isEmpty() ? "" : getLeftParams());

		String right = getRight().getName() + (isRightMany() ? "+" : "")
				+ (getRightParams().isEmpty() ? "" : getRightParams());

		return getName() + " < " + left + " * " + right;
	}
}