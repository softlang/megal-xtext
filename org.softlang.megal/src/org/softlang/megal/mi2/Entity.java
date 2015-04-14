package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;

import java.util.List;
import java.util.Set;

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
	public abstract Set<String> getBindings();

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
	 * Gets the parameters of the entities type.
	 * </p>
	 * 
	 * @return Returns a list of entities
	 */
	public abstract List<? extends Entity> getTypeParams();

	/**
	 * <p>
	 * Gets a sequence of incoming relationships.
	 * </p>
	 * 
	 * @return Returns a transformed network sequence of relationships
	 */
	public abstract Iterable<? extends Relationship> incoming();

	/**
	 * <p>
	 * Gets a sequence of outgoing relationships.
	 * </p>
	 * 
	 * @return Returns a transformed network sequence of relationships
	 */
	public abstract Iterable<? extends Relationship> outgoing();

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
		String type = getType().getName() + (isTypeMany() ? "+" : "")
				+ (getTypeParams().isEmpty() ? "" : getTypeParams());
		return getName() + " " + type;
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
		return getType().isAssignableTo(of);
	}
}