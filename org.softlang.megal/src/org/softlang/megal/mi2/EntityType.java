package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newLinkedList;

import java.util.Deque;
import java.util.List;
import java.util.ListIterator;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;

/**
 * <p>
 * Base class for entity type in the model interface that supports a basic set
 * of reasoning operations.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class EntityType extends Named {
	/**
	 * <p>
	 * Gets the supertype of the entity type. If the type is the base type
	 * {@link KB#ENTITY}, then this method returns <code>this</code>.
	 * </p>
	 * 
	 * @return Returns the super type
	 */
	public abstract EntityType getSupertype();

	/**
	 * <p>
	 * Returns true if the supertype is a many reference.
	 * </p>
	 */
	public abstract boolean isSupertypeMany();

	/**
	 * <p>
	 * Gets the parameters of the supertype.
	 * </p>
	 * 
	 * @return Returns a list of entities
	 */
	public abstract List<? extends Entity> getSupertypeParams();

	/**
	 * <p>
	 * Gets all direct instances of this entity type.
	 * </p>
	 * 
	 * @return Iterates over the instances
	 */
	public abstract Iterable<? extends Entity> getInstances();

	/**
	 * <p>
	 * Gets all direct and transitive instances of this entity type.
	 * </p>
	 * 
	 * @return Iterates over all the instances
	 */
	public Iterable<? extends Entity> getAllInstances() {
		return () -> new AbstractIterator<Entity>() {
			List<EntityType> tier = newArrayList(EntityType.this);

			Deque<Entity> sequence = newLinkedList(getInstances());

			@Override
			protected Entity computeNext() {
				if (!sequence.isEmpty())
					return sequence.poll();

				for (ListIterator<EntityType> it = tier.listIterator(); it.hasNext();) {
					EntityType v = it.next();

					it.remove();

					for (EntityType s : v.getSubtypes()) {
						it.add(s);

						for (Entity i : s.getInstances())
							sequence.add(i);
					}
				}

				if (sequence.isEmpty())
					return endOfData();

				return sequence.poll();
			}
		};
	}

	/**
	 * <p>
	 * Gets all direct instances of this entity type.
	 * </p>
	 * 
	 * @return Iterates over the instances
	 */
	public abstract Iterable<? extends EntityType> getSubtypes();

	/**
	 * <p>
	 * Gets all direct and transitive subtypes of this entity type.
	 * </p>
	 * 
	 * @return Iterates over all the instances
	 */
	public Iterable<? extends EntityType> getAllSubtypes() {
		return () -> new AbstractIterator<EntityType>() {
			List<EntityType> tier = newArrayList(getSubtypes());

			Deque<EntityType> sequence = newLinkedList(tier);

			@Override
			protected EntityType computeNext() {
				if (!sequence.isEmpty())
					return sequence.poll();

				for (ListIterator<EntityType> it = tier.listIterator(); it.hasNext();) {
					EntityType v = it.next();

					it.remove();

					for (EntityType s : v.getSubtypes()) {
						it.add(s);
						sequence.add(s);
					}
				}

				if (sequence.isEmpty())
					return endOfData();

				return sequence.poll();
			}
		};
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

		if (!(obj instanceof EntityType))
			return false;

		EntityType other = (EntityType) obj;

		return equal(getName(), other.getName());
	}

	@Override
	public String toString() {
		if (getSupertype() == this)
			return getName();

		return getName() + " < " + getSupertype().getName();
	}

	/**
	 * <p>
	 * Gets the supertypes of this entity type.
	 * </p>
	 * 
	 * @return Returns a sequence of supertypes
	 */
	public ImmutableList<EntityType> hierarchy(boolean includeThis) {
		ImmutableList.Builder<EntityType> builder = ImmutableList.builder();

		EntityType x = this;

		if (includeThis)
			builder.add(x);

		do {
			x = x.getSupertype();
			builder.add(x);
		} while (x.getSupertype() != x);

		return builder.build();
	}

	/**
	 * <p>
	 * Gets the supertypes of this entity type.
	 * </p>
	 * 
	 * @return Returns a sequence of supertypes
	 */
	public boolean isAssignableTo(EntityType other) {
		return hierarchy(true).contains(other);
	}

	/**
	 * <p>
	 * Returns the first common supertype of this and the parameter entity type.
	 * </p>
	 * 
	 * @param with
	 *            The other entity type
	 * @return Returns the first common entity type
	 */
	public EntityType gcd(EntityType with) {
		ImmutableList<EntityType> aSupertypes = hierarchy(true);
		ImmutableList<EntityType> bSupertypes = with.hierarchy(true);

		List<EntityType> common = newArrayList(aSupertypes);
		common.retainAll(bSupertypes);

		return common.get(0);
	}
}