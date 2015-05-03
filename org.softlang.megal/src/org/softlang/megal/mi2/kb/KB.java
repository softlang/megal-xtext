package org.softlang.megal.mi2.kb;

import java.util.Map;
import java.util.Map.Entry;

import org.softlang.megal.mi2.util.Multitable;

import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Class of knowledge bases on entity and typed relationships.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public interface KB {
	/**
	 * <p>
	 * This is the name of the top level entity. This entity has itself as a
	 * supertype. A {@link KB} is invalid, if it assigns a new type to this
	 * name.
	 * </p>
	 */
	public static final String ENTITY = "Entity";

	/**
	 * <p>
	 * Gets the title of this knowledge base.
	 * </p>
	 * 
	 * @return Returns the title
	 */
	String getTitle();

	/**
	 * <p>
	 * Gets the top level annotations, applied directly to the knowledge base.
	 * </p>
	 * 
	 * @return Returns the annotations
	 */
	SetMultimap<String, String> getAnnotations();

	/**
	 * <p>
	 * Gets the annotations to the root entity type.
	 * </p>
	 * 
	 * @return Returns the annotations
	 */
	SetMultimap<String, String> getTheEntityTypeAnnotations();

	/**
	 * <p>
	 * Maps the entity type name to their supertype.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Map<String, String> getEntityTypes();

	/**
	 * <p>
	 * Maps from relationship type name to all their applicable type pairs.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multitable<Ref, Ref, String> getRelationshipTypes();

	/**
	 * <p>
	 * Maps the entity name to their type.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Map<String, Ref> getEntities();

	/**
	 * <p>
	 * Maps from entity name to all their bindings.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Map<String, Object> getBindings();

	/**
	 * <p>
	 * Maps from relationship name to all their instances.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multitable<String, String, String> getRelationships();

	/**
	 * <p>
	 * Gets a map from entity type entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	SetMultimap<Entry<String, String>, Entry<String, String>> getEntityTypeAnnotations();

	/**
	 * <p>
	 * Gets a map from relationship type entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> getRelationshipTypeAnnotations();

	/**
	 * <p>
	 * Gets a map from entity entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	SetMultimap<Entry<String, Ref>, Entry<String, String>> getEntityAnnotations();

	/**
	 * <p>
	 * Gets a map from relationship entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	SetMultimap<Cell<String, String, String>, Entry<String, String>> getRelationshipAnnotations();
}
