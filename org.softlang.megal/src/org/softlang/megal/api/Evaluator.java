package org.softlang.megal.api;

import org.softlang.megal.Entity;
import org.softlang.megal.Relationship;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

/**
 * Semantic authority for entities and relationships
 * 
 * @author Pazuzu
 *
 */
public abstract class Evaluator {
	/**
	 * Adds a evaluator part, a plugin
	 * 
	 * @param evaluator
	 *            The plugin to add, i.e. the left hand side of the
	 *            <code>partOf</code> relationship
	 */
	public void addPart(Evaluator evaluator) {
	}

	/**
	 * Adds a realized entity, used for plugins
	 * 
	 * @param entity
	 *            The realized entity, i.e. the right hand side of the
	 *            <code>realizationOf</code> relationship
	 */
	public void addRealized(Entity entity) {
	}

	/**
	 * Checks if this evaluator is responsible for the specified entity
	 * 
	 * @param entity
	 *            The entity to check
	 * @return True if responsible
	 */
	public boolean evaluates(Entity entity) {
		return false;
	}

	/**
	 * Checks if this evaluator is responsible for the specified relationship
	 * 
	 * @param relationship
	 *            The relationship to check
	 * @return True if responsible
	 */
	public boolean evaluates(Relationship relationship) {
		return false;
	}

	/**
	 * Evaluates the entity
	 * 
	 * @param entity
	 *            The entity to evaluate
	 * @return Returns true if the entity is valid at its place
	 */
	public boolean evaluate(Entity entity) {
		return false;
	}

	/**
	 * Evaluates the relationship
	 * 
	 * @param relationship
	 *            The relationship to evaluate
	 * @return Returns true if the relationship is valid with the given source
	 *         and target
	 */
	public boolean evaluate(Relationship relationship) {
		return false;
	}

	/**
	 * Calculates the trace for a relationship
	 * 
	 * @param relationship
	 *            The relationship to generate the trace for
	 * @return Returns a <code>m</code> &times; <code>n</code> mapping from
	 *         source location to target locations
	 */
	public Multimap<String, String> calculateTrace(Relationship relationship) {
		return ImmutableMultimap.of();
	}
}
