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
			try {
				field.set(ModelAPI.this, value);
				open = value == null;
			} catch (IllegalArgumentException | IllegalAccessException e) {
				throw new RuntimeException(e);
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

	/**
	 * <p>
	 * Map from class over name to resolved slot
	 * </p>
	 */
	private final Map<Class<?>, Map<String, ResolvedSlot>> slots;

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

			if (slot != null) {
				// Compute a map from class to name to getter/setter pair
				Map<String, ResolvedSlot> classToGetterMap = slots
						.computeIfAbsent(field.getType(),
								n -> Maps.newHashMap());

				// Put a getter/setter pair to the index
				classToGetterMap.put(field.getName(), new ResolvedSlot(field,
						in != null ? in.value() : null, slot.mandatory()));
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
		for (ResolvedSlot slot : FluentIterable.from(slots.values())
				.transformAndConcat(Map::values))
			slot.set(null);

		// Map links by their associate entities
		for (Link link : megamodel.getVisibleBindings()) {
			// Get potential target
			ResolvedSlot target = slots.getOrDefault(Link.class,
					Collections.emptyMap()).get(link.getLink().getName());

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

			// Get potential target
			ResolvedSlot target = slots.getOrDefault(instanceClass,
					Collections.emptyMap()).get(name);

			// Check if there is a target and its location requirements match
			if (target != null)
				if (target.getLocation() == null
						|| target.getLocation().equals(
								declaration.getMegamodel().getName()))
					target.set(declaration);
		}

		// Find all open, mandatory setters
		List<ResolvedSlot> openSetters = FluentIterable.from(slots.values())
				.transformAndConcat(Map::values).filter(ResolvedSlot::isOpen)
				.filter(ResolvedSlot::isMandatory).toList();

		// If there are some throw an exception
		if (!openSetters.isEmpty())
			throw new NoSuchElementException(
					"Unassigned mandatory slots after initialization: "
							+ openSetters);

	}
}
