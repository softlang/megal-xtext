package org.softlang.megal.api;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.softlang.megal.api.context.Context;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.Relationship;

/**
 * <p>
 * Plugins evaluate relationships or entities to new KBs and may emit errors
 * they recognize during evaluation.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class Plugin {
	private final Set<Plugin> parts;

	private final Set<Entity> realization;

	public Plugin() {
		this.parts = newHashSet();
		this.realization = newHashSet();
	}

	public Set<Plugin> getParts() {
		return parts;
	}

	public Set<Entity> getRealization() {
		return realization;
	}

	/**
	 * <p>
	 * Adds a plugin part, usually defined as the <code>partOf</code>
	 * relationship between a plugin mapped entity and another plugin.
	 * </p>
	 * 
	 * @param part
	 *            The part added
	 */
	public void addPart(Plugin part) {
		parts.add(part);
	}

	/**
	 * <p>
	 * Adds a plugin realization, usually defined as the
	 * <code>realizationOf</code> relationship between a plugin mapped entity
	 * and an arbitrary entity.
	 * </p>
	 * 
	 * @param entity
	 *            The realized entity
	 */
	public void addRealization(Entity entity) {
		realization.add(entity);
	}

	/**
	 * <p>
	 * Tries to evaluate the entity, may spawn new KBs that are considered as
	 * residue additions and are in turn evaluated again.
	 * </p>
	 * 
	 * @param context
	 *            The evaluation context
	 * @param entity
	 *            The evaluation item
	 */
	public void evaluate(Context context, Entity entity) {
	}

	/**
	 * <p>
	 * Tries to evaluate the relationship, may spawn new KBs that are considered
	 * as residue additions and are in turn evaluated again.
	 * </p>
	 * 
	 * @param context
	 *            The evaluation context
	 * @param relationship
	 *            The evaluation item
	 */
	public void evaluate(Context context, Relationship relationship) {
	}
}
