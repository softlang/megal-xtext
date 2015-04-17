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

	/**
	 * <p>
	 * Gets all instances of this relationship type.
	 * </p>
	 * 
	 * @return Iterates over the instances
	 */
	public abstract Iterable<? extends Relationship> getInstances();

	/**
	 * <p>
	 * Gets all subtypes of this relationship type.
	 * </p>
	 * 
	 * @return Iterates over the instances
	 */
	public abstract Iterable<? extends RelationshipType> getSpecializations();

	public boolean isApplicable(Entity left, Entity right) {
		return isApplicable(left.getType(), left.isTypeMany(), left.getTypeParams(), right.getType(),
				right.isTypeMany(), right.getTypeParams());
	}

	public boolean isApplicable(EntityType left, boolean leftMany, List<? extends Entity> leftParams, EntityType right,
			boolean rightMany, List<? extends Entity> rightParams) {
		if (leftMany != isLeftMany())
			return false;

		if (rightMany != isRightMany())
			return false;

		if (!equal(leftParams, getLeftParams()))
			return false;

		if (!equal(rightParams, getRightParams()))
			return false;

		if (getLeft().equals(left) && getRight().equals(right))
			return true;

		EntityType leftSupertype = left.getSupertype();

		if (!leftSupertype.equals(left))
			if (isApplicable(leftSupertype, leftMany, leftParams, right, rightMany, rightParams))
				return true;

		EntityType rightSupertype = left.getSupertype();

		if (!rightSupertype.equals(right))
			if (isApplicable(left, leftMany, leftParams, rightSupertype, rightMany, rightParams))
				return true;

		if (!leftSupertype.equals(left) && rightSupertype.equals(right))
			if (isApplicable(leftSupertype, leftMany, leftParams, rightSupertype, rightMany, rightParams))
				return true;

		return false;
	}

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

	public boolean isSpecializationOf(RelationshipType x) {
		// Check left many is equal
		if (!equal(getName(), x.getName()))
			return false;

		// Check left many is equal
		if (isLeftMany() != x.isLeftMany())
			return false;

		// Check right many is equal
		if (isRightMany() != x.isRightMany())
			return false;

		// Check left parameters are equal
		if (!equal(getLeftParams(), getRightParams()))
			return false;

		// Check right parameters are equal
		if (!equal(getRightParams(), getRightParams()))
			return false;

		// Get equals and true subtype values
		boolean le = equal(getLeft(), x.getLeft());
		boolean re = equal(getRight(), x.getRight());
		boolean las = getLeft().isSpecializationOf(x.getLeft());
		boolean ras = getRight().isSpecializationOf(x.getRight());

		// Check matrix
		return le && ras || las && re || las && ras;
	}
}