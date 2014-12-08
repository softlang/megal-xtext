package org.softlang.megal.api;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.softlang.megal.Link;
import org.softlang.megal.Megamodel;
import org.softlang.megal.NamedDeclaration;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;

import com.google.common.base.CaseFormat;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * <p>
 * Model API injects elements of the model into the class
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class ModelAPI {
	/**
	 * <p>
	 * Resolved slot, may be mandatory and reside in a specific model, must be
	 * closed if mandatory.
	 * </p>
	 * 
	 * @author Pazuzu
	 *
	 */
	private class ResolvedSlot {
		/**
		 * <p>
		 * Backing for the target field
		 * </p>
		 */
		private final Field field;

		/**
		 * <p>
		 * Backing for the location
		 * </p>
		 */
		private final String location;

		/**
		 * <p>
		 * Backing for the mandatory state
		 * </p>
		 */
		private final boolean mandatory;

		/**
		 * <p>
		 * Backing for the openness
		 * </p>
		 */
		private boolean open;

		/**
		 * <p>
		 * Constructs the resolved slot
		 * </p>
		 * 
		 * @param field
		 *            The target field
		 * @param location
		 *            The location
		 * @param mandatory
		 *            The mandatory state
		 */
		public ResolvedSlot(Field field, String location, boolean mandatory) {
			this.field = field;
			this.location = location;
			this.mandatory = mandatory;
			this.open = true;
		}

		/**
		 * <p>
		 * Sets the value, closes the slot if value is not null
		 * </p>
		 * 
		 * @param value
		 *            The value to assign
		 */
		public void set(Object value) {
			boolean wasAccessible = field.isAccessible();
			try {
				field.setAccessible(true);
				field.set(ModelAPI.this, value);
				open = value == null;
			} catch (IllegalArgumentException | IllegalAccessException e) {
				throw new RuntimeException(e);
			} finally {
				field.setAccessible(wasAccessible);
			}
		}

		/**
		 * <p>
		 * Gets the location
		 * </p>
		 * 
		 * @return Returns the value of the backing
		 */
		public String getLocation() {
			return location;
		}

		/**
		 * <p>
		 * Gets the mandatory state
		 * </p>
		 * 
		 * @return Returns the value of the backing
		 */
		public boolean isMandatory() {
			return mandatory;
		}

		/**
		 * <p>
		 * Gets the openness
		 * </p>
		 * 
		 * @return Returns the value of the backing
		 */
		public boolean isOpen() {
			return open;
		}

		@Override
		public String toString() {
			return field.getType().getSimpleName() + " " + field.getName();
		}
	}

	private static class SlotKey {
		private final Class<?> type;

		private final String name;

		private final String leftOrNull;

		private final String rightOrNull;

		public SlotKey(Class<?> type, String name, String leftOrNull,
				String rightOrNull) {
			this.type = type;
			this.name = name;
			this.leftOrNull = leftOrNull;
			this.rightOrNull = rightOrNull;
		}

		public SlotKey(Class<?> type, String name) {
			this.type = type;
			this.name = name;
			this.leftOrNull = null;
			this.rightOrNull = null;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((leftOrNull == null) ? 0 : leftOrNull.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result
					+ ((rightOrNull == null) ? 0 : rightOrNull.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SlotKey other = (SlotKey) obj;
			if (leftOrNull == null) {
				if (other.leftOrNull != null)
					return false;
			} else if (!leftOrNull.equals(other.leftOrNull))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (rightOrNull == null) {
				if (other.rightOrNull != null)
					return false;
			} else if (!rightOrNull.equals(other.rightOrNull))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "SlotKey [type=" + type + ", name=" + name + ", leftOrNull="
					+ leftOrNull + ", rightOrNull=" + rightOrNull + "]";
		}
	}

	/**
	 * <p>
	 * Map from class over name over left/right requirements to resolved slot
	 * </p>
	 */
	private final Map<SlotKey, ResolvedSlot> slots;

	/**
	 * <p>
	 * Computes all fields declared in this or any superclass
	 * </p>
	 * 
	 * @param c
	 *            The class to compute the fields for
	 * @return Returns a hash set of all fields declared
	 */
	private static Set<Field> computeAllFields(Class<?> c) {
		Set<Field> r = Sets.newHashSet(c.getDeclaredFields());
		while (c != Object.class) {
			c = c.getSuperclass();
			for (Field f : c.getDeclaredFields())
				if ((f.getModifiers() & Modifier.PRIVATE) == 0)
					r.add(f);
		}

		return r;
	}

	/**
	 * <p>
	 * Constructs the model API
	 * </p>
	 */
	public ModelAPI() {
		slots = Maps.newHashMap();
		// Find all fields with annotation slot
		for (Field field : computeAllFields(getClass())) {
			// Get slot and optional location
			Slot slot = field.getAnnotation(Slot.class);
			In in = field.getAnnotation(In.class);

			Left left = field.getAnnotation(Left.class);
			Right right = field.getAnnotation(Right.class);

			if (slot != null) {
				SlotKey key = new SlotKey(field.getType(), field.getName(),
						left != null ? left.value() : null,
						right != null ? right.value() : null);
				ResolvedSlot value = new ResolvedSlot(field,
						in != null ? in.value() : null, slot.mandatory());
				slots.put(key, value);
			}
		}
	}

	/**
	 * <p>
	 * Normalizes a Megal name to a Java name
	 * </p>
	 * 
	 * @param c
	 *            The source class
	 * @param str
	 *            The source name
	 * @return Default implementation converts to lower camel casing
	 */
	protected String normalizeName(Class<?> c, String str) {
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, str);
	}

	/**
	 * <p>
	 * Injects all slots from the given megamodel
	 * </p>
	 * 
	 * @param megamodel
	 *            The megamodel to analyze
	 */
	public void apply(Megamodel megamodel) {
		// Reset slots
		for (ResolvedSlot slot : slots.values())
			slot.set(null);

		// Map links by their associate entities
		for (Link link : megamodel.getVisibleBindings()) {
			// Get potential target
			ResolvedSlot target = slots.get(new SlotKey(Link.class, link
					.getLink().getName()));

			if (target != null)
				target.set(link);
		}

		// Map named declarations by their names
		for (NamedDeclaration declaration : FluentIterable.from(
				megamodel.getVisibleDeclarations()).filter(
				NamedDeclaration.class)) {
			// Compute class and name
			Class<?> instanceClass = declaration.eClass().getInstanceClass();
			String name = normalizeName(instanceClass, declaration.getName());

			String left = null;
			String right = null;
			if (declaration instanceof RelationshipType) {
				RelationshipType relationshipType = (RelationshipType) declaration;
				left = relationshipType.getLeft().getDefinition().getName()
						+ (relationshipType.getLeft().isMany() ? "+" : "");
				right = relationshipType.getRight().getDefinition().getName()
						+ (relationshipType.getRight().isMany() ? "+" : "");
			}

			if (declaration instanceof Relationship) {
				Relationship relationship = (Relationship) declaration;
				left = relationship.getLeft().getName();
				right = relationship.getRight().getName();
			}

			// Get potential target
			ResolvedSlot target = slots.get(new SlotKey(instanceClass, name,
					left, right));

			// Check if there is a target and its location requirements match
			if (target != null)
				if (target.getLocation() == null
						|| target.getLocation().equals(
								declaration.getMegamodel().getName()))
					target.set(declaration);
		}

		// Find all open, mandatory setters
		List<ResolvedSlot> openSetters = FluentIterable.from(slots.values())
				.filter(ResolvedSlot::isOpen).filter(ResolvedSlot::isMandatory)
				.toList();

		// If there are some throw an exception
		if (!openSetters.isEmpty())
			throw new NoSuchElementException(
					"Unassigned mandatory slots after initialization: "
							+ openSetters);

	}
}
