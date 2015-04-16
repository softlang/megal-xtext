package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.concat;
import static java.util.Collections.singleton;

import java.util.List;

import org.softlang.megal.mi2.util.PostOrderDeepeningIterable;

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
	 * Gets all direct instances of this relationship type.
	 * </p>
	 * 
	 * @return Iterates over the instances
	 */
	public abstract Iterable<? extends Relationship> getInstances();

	/**
	 * <p>
	 * Gets all direct and transitive instances of this relationship type.
	 * </p>
	 * 
	 * @return Iterates over all the instances
	 */
	public Iterable<? extends Relationship> getAllInstances() {
		return from(concat(singleton(this), getAllSubtypes())).transformAndConcat(RelationshipType::getInstances);
	}

	/**
	 * <p>
	 * Gets all direct subtypes of this relationship type.
	 * </p>
	 * 
	 * @return Iterates over the instances
	 */
	public abstract Iterable<? extends RelationshipType> getSubtypes();

	/**
	 * <p>
	 * Gets all direct and transitive subtypes of this relationship type.
	 * </p>
	 * 
	 * @return Iterates over all the instances
	 */
	public Iterable<? extends RelationshipType> getAllSubtypes() {
		return new PostOrderDeepeningIterable<RelationshipType>(getSubtypes()) {
			@Override
			protected Iterable<? extends RelationshipType> getNext(RelationshipType e) {
				return e.getSubtypes();
			}
		};
	}

	public boolean isApplicable(Entity left, Entity right) {
		return isApplicable(left.getType(), right.getType());
	}

	public boolean isApplicable(EntityType left, EntityType right) {
		if (getLeft().equals(left) && getRight().equals(right))
			return true;

		EntityType leftSupertype = left.getSupertype();

		if (!leftSupertype.equals(left))
			if (isApplicable(leftSupertype, right))
				return true;

		EntityType rightSupertype = left.getSupertype();

		if (!rightSupertype.equals(right))
			if (isApplicable(left, rightSupertype))
				return true;

		if (!leftSupertype.equals(left) && rightSupertype.equals(right))
			if (isApplicable(leftSupertype, rightSupertype))
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
}