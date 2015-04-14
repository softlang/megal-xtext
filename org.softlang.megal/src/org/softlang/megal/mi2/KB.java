package org.softlang.megal.mi2;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table;
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
	Multimap<String, String> getAnnotations();

	/**
	 * <p>
	 * Maps the entity type name to their supertype.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Map<String, Ref> getEntityTypes();

	/**
	 * <p>
	 * Maps from relationship type name to all their applicable type pairs.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multimap<String, Entry<Ref, Ref>> getRelationshipTypes();

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
	SetMultimap<String, String> getBindings();

	/**
	 * <p>
	 * Maps from entity name via entity name to the relationship type name that
	 * applies.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Table<String, String, String> getRelationships();

	/**
	 * <p>
	 * Gets a map from entity type entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multimap<Entry<String, Ref>, Entry<String, String>> getEntityTypeAnnotations();

	/**
	 * <p>
	 * Gets a map from relationship type entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> getRelationshipTypeAnnotations();

	/**
	 * <p>
	 * Gets a map from entity entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multimap<Entry<String, Ref>, Entry<String, String>> getEntityAnnotations();

	/**
	 * <p>
	 * Gets a map from relationship entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	Multimap<Cell<String, String, String>, Entry<String, String>> getRelationshipAnnotations();
}
