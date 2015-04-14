package org.softlang.megal.mi2;

import com.google.common.collect.Multimap;

/**
 * <p>
 * Reasoner on a knowledge base.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public interface Reasoner {
	/**
	 * <p>
	 * Gets the title of the model.
	 * </p>
	 * 
	 * @return Returns the title
	 */
	String getTitle();

	/**
	 * <p>
	 * Gets the top level annotations of the model.
	 * </p>
	 * 
	 * @return Returns the annotations
	 */
	Multimap<String, String> getAnnotations();

	/**
	 * <p>
	 * Gets the one entity type that is {@link KB#ENTITY}.
	 * </p>
	 * 
	 * @return Returns the entity type
	 */
	EntityType getTheEntityType();

	/**
	 * <p>
	 * Gets the entity type for the name.
	 * </p>
	 * 
	 * @param name
	 *            The name of the entity type
	 * @return Returns the entity type
	 */
	EntityType getEntityType(String name);

	/**
	 * <p>
	 * Gets the entity for the name.
	 * </p>
	 * 
	 * @param name
	 *            The name of the entity
	 * @return Returns the entity
	 */
	Entity getEntity(String name);

	/**
	 * <p>
	 * Gets all entity types.
	 * </p>
	 * 
	 * @return Iterates over all entity types
	 */
	Iterable<? extends EntityType> getEntityTypes();

	/**
	 * <p>
	 * Gets all relationship types.
	 * </p>
	 * 
	 * @return Iterates over all relationship types
	 */
	Iterable<? extends RelationshipType> getRelationshipTypes();

	/**
	 * <p>
	 * Gets all entities.
	 * </p>
	 * 
	 * @return Iterates over all entities
	 */
	Iterable<? extends Entity> getEntities();

	/**
	 * <p>
	 * Gets all relationships.
	 * </p>
	 * 
	 * @return Iterates over all relationships
	 */
	Iterable<? extends Relationship> getRelationships();
}
