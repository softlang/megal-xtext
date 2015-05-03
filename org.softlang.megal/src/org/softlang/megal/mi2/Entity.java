package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;

import java.util.Set;

import org.softlang.megal.mi2.util.SetOperations;

import com.google.common.base.Optional;

/**
 * <p>
 * Base class for entities in the model interface that supports a basic set of
 * reasoning operations.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class Entity extends Named {
	/**
	 * <p>
	 * Gets all bindings of this entity.
	 * </p>
	 * 
	 * @return Returns a set of the link targets
	 */
	public abstract Optional<Object> getBinding();

	/**
	 * <p>
	 * Gets the type of the entity.
	 * </p>
	 * 
	 * @return Returns the entity type
	 */
	public abstract EntityType getType();

	/**
	 * <p>
	 * Returns true if the entities type is a many reference.
	 * </p>
	 */
	public abstract boolean isTypeMany();

	/**
	 * <p>
	 * Gets a sequence of incoming relationships.
	 * </p>
	 * 
	 * @return Returns a transformed network sequence of relationships
	 */
	public abstract Set<Relationship> incoming();

	/**
	 * <p>
	 * Gets a sequence of outgoing relationships.
	 * </p>
	 * 
	 * @return Returns a transformed network sequence of relationships
	 */
	public abstract Set<Relationship> outgoing();

	/**
	 * <p>
	 * Gets a sequence of incoming relationships.
	 * </p>
	 * 
	 * @return Returns a transformed network sequence of relationships
	 */
	public Set<Relationship> incoming(String relationship) {
		return SetOperations.filter(incoming(), Relationship.class, x -> equal(relationship, x.getType().getName()));
	}

	/**
	 * <p>
	 * Gets a sequence of outgoing relationships.
	 * </p>
	 * 
	 * @return Returns a transformed network sequence of relationships
	 */
	public Set<Relationship> outgoing(String relationship) {
		return SetOperations.filter(outgoing(), Relationship.class, x -> equal(relationship, x.getType().getName()));
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

		if (!(obj instanceof Entity))
			return false;

		Entity other = (Entity) obj;

		return equal(getName(), other.getName());
	}

	@Override
	public String toString() {
		return getName() + ": " + (getType().getName() + (isTypeMany() ? "+" : ""));
	}

	/**
	 * <p>
	 * Returns true if entity is an instance of the given entity type.
	 * </p>
	 * 
	 * @param of
	 *            The type to check
	 * @return Returns true if assignable to
	 */
	public boolean isInstance(EntityType of) {
		return equal(getType(), of) || getType().isSpecializationOf(of);
	}
}