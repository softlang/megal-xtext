package org.softlang.megal.api;

import org.softlang.megal.Entity;
import org.softlang.megal.Megamodel;
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
	// TODO: Error-messages
	public static enum EvaluationResult {
		NOT_HANDLED, INVALID, VALID
	}

	/**
	 * Loads the evaluator from the specifying entity
	 * 
	 * @param m
	 *            The megamodel this evaluator is initialized from
	 * @param evaluator
	 *            The evaluator entity
	 */
	public void initialize(Megamodel m, Entity evaluator) {

	}

	/**
	 * Adds a evaluator part, a plugin
	 * 
	 * @param via
	 *            The relationship that is responsible for the linkage from
	 *            <code>this</code> evaluator to the one given
	 * @param evaluator
	 *            The plugin to add, i.e. the left hand side of the
	 *            <code>partOf</code> relationship
	 */
	public void addPart(Relationship via, Evaluator evaluator) {
	}

	/**
	 * Adds a realized entity, used for plugins
	 * 
	 * @param via
	 *            The relationship that is responsible for the linkage from
	 *            <code>this</code> evaluator to the one given
	 * @param entity
	 *            The realized entity, i.e. the right hand side of the
	 *            <code>realizationOf</code> relationship
	 */
	public void addRealized(Relationship via, Entity entity) {
	}

	// /**
	// * Checks if this evaluator is responsible for the specified entity
	// *
	// * @param entity
	// * The entity to check
	// * @return True if responsible
	// */
	// public boolean evaluates(Entity entity) {
	// return false;
	// }
	//
	// /**
	// * Checks if this evaluator is responsible for the specified relationship
	// *
	// * @param relationship
	// * The relationship to check
	// * @return True if responsible
	// */
	// public boolean evaluates(Relationship relationship) {
	// return false;
	// }

	/**
	 * Evaluates the entity
	 * 
	 * @param entity
	 *            The entity to evaluate
	 * @return Returns the result of evaluation as an element of
	 *         {@link EvaluationResult}
	 */
	public EvaluationResult evaluate(Entity entity) {
		return EvaluationResult.NOT_HANDLED;
	}

	/**
	 * Evaluates the relationship
	 * 
	 * @param relationship
	 *            The relationship to evaluate
	 * @return Returns the result of evaluation as an element of
	 *         {@link EvaluationResult}
	 */
	public EvaluationResult evaluate(Relationship relationship) {
		return EvaluationResult.NOT_HANDLED;
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
