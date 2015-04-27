package org.softlang.megal.mi2.reasoning;

import java.util.Set;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;

import com.google.common.collect.ImmutableSet;
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
	 * Gets the knowledge base this reasoner is build upon.
	 * </p>
	 * 
	 * @return Returns the knowledge base
	 */
	KB getKB();

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
	 * Gets the relationship type for the name. Uses empty parameters.
	 * </p>
	 * 
	 * @param name
	 *            The name of the relationship type
	 * @param left
	 *            The definition of the left side
	 * @param leftMany
	 *            True if left is many
	 * @param right
	 *            The definition of the right side
	 * @param rightMany
	 *            True if right is many
	 * 
	 * @return Returns the relationship type
	 */
	RelationshipType getRelationshipType(String name, String left, boolean leftMany, String right, boolean rightMany);

	/**
	 * <p>
	 * Gets the relationship type for the name. Uses false for many and empty
	 * parameters.
	 * </p>
	 * 
	 * @param name
	 *            The name of the relationship type
	 * @param left
	 *            The definition of the left side
	 * @param right
	 *            The definition of the right side
	 * 
	 * @return Returns the relationship type
	 */
	RelationshipType getRelationshipType(String name, String left, String right);

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
	 * Gets the relationship for the names.
	 * </p>
	 * 
	 * @param left
	 *            The name of the left entity
	 * 
	 * @param relationship
	 *            The name of the relationship
	 * 
	 * @param right
	 *            The name of the right entity
	 * @return Returns the entity
	 */
	Relationship getRelationship(String left, String relationship, String right);

	/**
	 * <p>
	 * Gets all relationships for the given name.
	 * </p>
	 * 
	 * @param name
	 *            The name to find
	 * @return Returns an iterable on the relationship types
	 */
	Iterable<? extends RelationshipType> getRelationshipTypes(String name);

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
