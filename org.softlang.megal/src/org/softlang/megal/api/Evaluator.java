package org.softlang.megal.api;

import java.util.Collection;

import org.softlang.megal.Entity;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

/**
 * Semantic authority for entities and relationships
 * 
 * @author Pazuzu
 *
 */
public abstract class Evaluator {
	private API api;

	private final Multimap<Evaluator, Relationship> parts;

	private final Multimap<Entity, Relationship> realizations;

	protected Evaluator() {
		this.api = null;
		this.parts = HashMultimap.create();
		this.realizations = ElementMap.newSetMultimap(Entity.class);
	}

	public void setAPI(API api) {
		this.api = api;
	}

	public API getAPI() {
		return api;
	}

	/**
	 * Adds a evaluator part, a plugin
	 * 
	 * @param evaluator
	 *            The plugin to add, i.e. the left hand side of the
	 *            <code>partOf</code> relationship
	 * @param via
	 *            The relationship that is responsible for the linkage from
	 *            <code>this</code> evaluator to the one given
	 */
	public boolean add(Evaluator evaluator, Relationship via) {
		return parts.put(evaluator, via);
	}

	public Multiset<Evaluator> getParts() {
		return parts.keys();
	}

	public Collection<Relationship> getAll(Evaluator evaluator) {
		return parts.get(evaluator);
	}

	public boolean remove(Evaluator evaluator, Relationship via) {
		return parts.remove(evaluator, via);
	}

	/**
	 * Adds a realized entity, used for plugins
	 * 
	 * @param entity
	 *            The realized entity, i.e. the right hand side of the
	 *            <code>realizationOf</code> relationship
	 * @param via
	 *            The relationship that is responsible for the linkage from
	 *            <code>this</code> evaluator to the one given
	 */
	public boolean add(Entity entity, Relationship via) {
		return realizations.put(entity, via);
	}

	public Multiset<Entity> getRealized() {
		return realizations.keys();
	}

	public Collection<Relationship> getAll(Entity entity) {
		return realizations.get(entity);
	}

	public boolean remove(Entity entity, Relationship via) {
		return realizations.remove(entity, via);
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
	 * Evaluates the entity
	 * 
	 * @param entity
	 *            The entity to evaluate
	 * @return Returns the result of evaluation as an element of {@link Result}
	 */
	public Result evaluate(Entity entity) {
		return Result.NOT_HANDLED;
	}

	/**
	 * Evaluates the relationship
	 * 
	 * @param relationship
	 *            The relationship to evaluate
	 * @return Returns the result of evaluation as an element of {@link Result}
	 */
	public Result evaluate(Relationship relationship) {
		return Result.NOT_HANDLED;
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
