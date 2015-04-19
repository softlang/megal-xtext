package org.softlang.megal.api;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.reasoning.Reasoner;

/**
 * Dynamic resolution authority for entities, e.g. mapping to dbpedia or SCMs
 * 
 * @author Pazuzu
 *
 */
public abstract class Resolver {
	/**
	 * Loads the resolver from the specifying entity
	 * 
	 * @param resolver
	 *            The resolver entity
	 */
	public void load(Reasoner reasoner, Entity resolver) {
	}

	/**
	 * Checks if this resolver is responsible for the given entity
	 * 
	 * @param e
	 *            The entity to check
	 * @return True if responsible
	 */
	public abstract boolean resolves(Entity e);

	/**
	 * Resolves the entity
	 * 
	 * @param e
	 *            THe entity to be resolved
	 * @return Returns a string representing the entities location
	 */
	public abstract String resolve(Entity e);
}
