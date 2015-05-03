package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Predicates.equalTo;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Maps.immutableEntry;
import static com.google.common.collect.Tables.immutableCell;
import static java.util.Collections.singleton;
import static org.softlang.megal.mi2.util.SetOperations.translate;

import java.util.Map.Entry;
import java.util.Set;

import org.softlang.megal.mi2.kb.KB;
import org.softlang.megal.mi2.kb.Ref;
import org.softlang.megal.mi2.util.Bijection;
import org.softlang.megal.mi2.util.Bijections;

import com.google.common.base.Optional;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Model access that directly operates on the given knowledge base.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public final class Access {
	/**
	 * <p>
	 * Constructs the access on the knowledge base.
	 * </p>
	 * 
	 * @param kb
	 *            The knowledge base to operate on
	 * @return Returns the access
	 */
	public static Access on(KB kb) {
		return new Access(kb);
	}

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final KB kb;

	/**
	 * <p>
	 * Constructs the access on the knowledge base.
	 * </p>
	 * 
	 * @param kb
	 *            The knowledge base to operate on
	 */
	private Access(KB kb) {
		this.kb = kb;
	}

	private final Bijection<Entry<String, Ref>, Entity> entity = Bijections.of(this::entity, this::entityInverse);

	private Entry<String, Ref> entityInverse(Entity entity) {
		return immutableEntry(entity.getName(), Ref.to(entity.getType().getName(), entity.isTypeMany()));
	}

	/**
	 * <p>
	 * Maps an entry.
	 * </p>
	 * 
	 * @param from
	 *            The entry to map
	 * @return Returns the corresponding high level element
	 */
	private Entity entity(Entry<String, Ref> from) {
		return new Entity() {

			@Override
			public Multimap<String, String> getAnnotations() {
				// Translate the unstructured annotations
				return translate(kb.getEntityAnnotations().get(from));
			}

			@Override
			public Optional<Object> getBinding() {
				// Bindings are mapped from the key
				if (kb.getBindings().containsKey(from.getKey()))
					return Optional.of(kb.getBindings().get(from.getKey()));

				return Optional.absent();
			}

			@Override
			public String getName() {
				// Name is specified by key
				return from.getKey();
			}

			@Override
			public EntityType getType() {
				// Type is specified by value
				return getEntityType(from.getValue().getType());
			}

			@Override
			public int hashCode() {
				return from.hashCode();
			}

			@Override
			public Iterable<? extends Relationship> incoming() {

				// Incoming are in the relationship column of this entity
				return transform(kb.getRelationships().whereColumn(from.getKey()), x -> relationship(x));
			}

			@Override
			public boolean isTypeMany() {
				// Many is specified by value
				return from.getValue().isMany();
			}

			@Override
			public Iterable<? extends Relationship> outgoing() {
				// Outgoing are in the relationship column of this entity
				return transform(kb.getRelationships().whereRow(from.getKey()), x -> relationship(x));
			}

			@Override
			public String toString() {
				return from.getKey() + ": " + from.getValue();
			}
		};
	}

	private final Bijection<Entry<String, String>, EntityType> entityType = Bijections.of(this::entityType,
			this::entityTypeInverse);

	private Entry<String, String> entityTypeInverse(EntityType entityType) {
		return immutableEntry(entityType.getName(), entityType.getSupertype().getName());
	}

	/**
	 * <p>
	 * Maps an entry.
	 * </p>
	 * 
	 * @param from
	 *            The entry to map
	 * @return Returns the corresponding high level element
	 */
	private EntityType entityType(Entry<String, String> from) {
		return new EntityType() {

			@Override
			public Multimap<String, String> getAnnotations() {
				// Translate the unstructured annotations
				return translate(kb.getEntityTypeAnnotations().get(from));
			}

			@Override
			public Iterable<? extends Entity> getInstances() {
				// TODO Post order deepening iterator on KB supertypes

				// All entities that are of this type or thats type is a
				// specialization of this type
				return filter(getEntities(), x -> equal(x.getType(), this) || x.getType().isSpecializationOf(this));
			}

			@Override
			public String getName() {
				// Name is specified by key
				return from.getKey();
			}

			@Override
			public Iterable<? extends EntityType> getSpecializations() {
				// TODO Post order deepening iterator on KB supertypes

				// All entity types that are specializations of this type
				return filter(getEntityTypes(), x -> x.isSpecializationOf(this));
			}

			@Override
			public EntityType getSupertype() {
				// Entity type is specified by the value
				return getEntityType(from.getValue());
			}

			@Override
			public int hashCode() {
				return from.hashCode();
			}

			@Override
			public String toString() {
				return from.getKey() + " < " + from.getValue();
			}
		};
	}

	private final Bijection<Cell<String, String, String>, Relationship> relationship = Bijections.of(
			this::relationship, this::relationshipInverse);

	private Cell<String, String, String> relationshipInverse(Relationship relationship) {
		return immutableCell(relationship.getLeft().getName(), relationship.getRight().getName(), relationship
				.getType().getName());
	}

	/**
	 * <p>
	 * Maps a cell.
	 * </p>
	 * 
	 * @param from
	 *            The cell to map
	 * @return Returns the corresponding high level element
	 */
	private Relationship relationship(final Cell<String, String, String> from) {
		return new Relationship() {

			/**
			 * <p>
			 * Loads by substitution.
			 * </p>
			 * 
			 * @param fromType
			 *            The from type
			 * @param toType
			 *            The to type
			 * @param candidates
			 *            The candidate relationships
			 * @return Returns the found relationship or absent if failed
			 */
			private Optional<RelationshipType> loadOrSubstitute(Ref fromType, Ref toType) {

				// If candidates contains an entry for the given pair, use it
				if (kb.getRelationshipTypes().contains(fromType, toType, from.getValue()))
					return Optional.of(relationshipType(immutableCell(fromType, toType, from.getValue())));

				// Make supertype for the left side
				Ref fromTypeSupertype = Ref.to(kb.getEntityTypes().get(fromType.getType()), fromType.isMany());

				// Make supertype for the right side
				Ref toTypeSupertype = Ref.to(kb.getEntityTypes().get(toType.getType()), toType.isMany());

				// If left was not Entity
				if (fromTypeSupertype.getType() != null) {
					// Try left supertype
					Optional<RelationshipType> potential = loadOrSubstitute(fromTypeSupertype, toType);
					if (potential.isPresent())
						return potential;
				}

				// If right was not Entity
				if (toTypeSupertype.getType() != null) {
					// Try right supertype
					Optional<RelationshipType> potential = loadOrSubstitute(fromType, toTypeSupertype);
					if (potential.isPresent())
						return potential;
				}

				// If both were not Entity
				if (fromTypeSupertype.getType() != null && toTypeSupertype.getType() != null) {
					// Try both supertypes
					Optional<RelationshipType> potential = loadOrSubstitute(fromTypeSupertype, toTypeSupertype);
					if (potential.isPresent())
						return potential;
				}

				// Else, no chance to substitute
				return Optional.absent();
			}

			@Override
			public Multimap<String, String> getAnnotations() {
				// Translate the unstructured annotations
				return translate(kb.getRelationshipAnnotations().get(from));
			}

			@Override
			public Entity getLeft() {
				// Left entity is specified in row key
				return getEntity(from.getRowKey());
			}

			@Override
			public Entity getRight() {
				// Left entity is specified in column key
				return getEntity(from.getColumnKey());
			}

			@Override
			public RelationshipType getType() {
				// Type is obtained by substitution lookup
				Ref fe = kb.getEntities().get(from.getRowKey());
				Ref te = kb.getEntities().get(from.getColumnKey());

				// Find an applicable relationship type
				return loadOrSubstitute(fe, te).orNull();
			}

			@Override
			public int hashCode() {
				return from.hashCode();
			}

			@Override
			public String toString() {
				return from.getRowKey() + " " + from.getValue() + " " + from.getColumnKey();
			}
		};
	}

	private final Bijection<Cell<Ref, Ref, String>, RelationshipType> relationshipType = Bijections.of(
			this::relationshipType, this::relationshipTypeInverse);

	private Cell<Ref, Ref, String> relationshipTypeInverse(RelationshipType relationshipType) {
		return immutableCell(Ref.to(relationshipType.getLeft().getName(), relationshipType.isLeftMany()),
				Ref.to(relationshipType.getRight().getName(), relationshipType.isRightMany()),
				relationshipType.getName());
	}

	/**
	 * <p>
	 * Maps an entry.
	 * </p>
	 * 
	 * @param from
	 *            The entry to map
	 * @return Returns the corresponding high level element
	 */
	private RelationshipType relationshipType(Cell<Ref, Ref, String> from) {
		return new RelationshipType() {

			@Override
			public Multimap<String, String> getAnnotations() {
				// Translate the unstructured annotations
				return translate(kb.getRelationshipTypeAnnotations().get(from));
			}

			@Override
			public Iterable<? extends Relationship> getInstances() {
				// All relationships that are of this type or thats type is a
				// specialization of this type
				return from(getRelationships()).filter(
						x -> equal(x.getType(), this) || x.getType().isSpecializationOf(this));
			}

			@Override
			public EntityType getLeft() {
				// Left type is specified values key
				return getEntityType(from.getRowKey().getType());
			}

			@Override
			public String getName() {
				// Name is specified by key
				return from.getValue();
			}

			@Override
			public EntityType getRight() {
				// Right type is specified values key
				return getEntityType(from.getColumnKey().getType());
			}

			@Override
			public Iterable<? extends RelationshipType> getSpecializations() {
				// All relationship types that are specializations of this type
				return from(getRelationshipTypes(from.getValue())).filter(x -> x.isSpecializationOf(this));
			}

			@Override
			public int hashCode() {
				return from.hashCode();
			}

			@Override
			public boolean isLeftMany() {
				// Left many is specified values key
				return from.getRowKey().isMany();
			}

			@Override
			public boolean isRightMany() {
				// Right many is specified values key
				return from.getColumnKey().isMany();
			}

			@Override
			public String toString() {
				return from.getValue() + "< " + from.getRowKey() + " * " + from.getColumnKey();
			}
		};
	}

	/**
	 * <p>
	 * Gets the top level annotations of the model.
	 * </p>
	 * 
	 * @return Returns the annotations
	 */
	public Multimap<String, String> getAnnotations() {
		// Annotations are carried in the KB
		return kb.getAnnotations();
	}

	/**
	 * <p>
	 * Gets all entities.
	 * </p>
	 * 
	 * @return Iterates over all entities
	 */
	public Iterable<? extends Entity> getEntities() {
		// Transform all entries of the entities in the KB
		return from(kb.getEntities().entrySet()).transform(x -> entity(x));
	}

	/**
	 * <p>
	 * Gets the entity for the name.
	 * </p>
	 * 
	 * @param name
	 *            The name of the entity
	 * @return Returns the entity
	 */
	public Entity getEntity(String name) {
		// Get the type by KB lookup
		Ref type = kb.getEntities().get(name);

		// If null, then there was no mapping
		if (type == null)
			return null;

		// Wrap the pair
		return entity(immutableEntry(name, type));
	}

	/**
	 * <p>
	 * Gets the entity type for the name.
	 * </p>
	 * 
	 * @param name
	 *            The name of the entity type
	 * @return Returns the entity type
	 */
	public EntityType getEntityType(String name) {
		// If name is Entity as defined by KB constants, return the Entity type
		if (KB.ENTITY.equals(name))
			return getTheEntityType();

		// Get the supertype by KB lookup
		String supertype = kb.getEntityTypes().get(name);

		// If null, then there was no mapping
		if (supertype == null)
			return null;

		// Wrap the pair
		return entityType(immutableEntry(name, supertype));
	}

	/**
	 * <p>
	 * Gets all entity types.
	 * </p>
	 * 
	 * @return Iterates over all entity types
	 */
	public Iterable<? extends EntityType> getEntityTypes() {
		// Get all newly defined entity types after the Entity type
		return concat(singleton(getTheEntityType()), from(kb.getEntityTypes().entrySet()).transform(this::entityType));
	}

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
	public Relationship getRelationship(String left, String relationship, String right) {
		if (!kb.getRelationships().contains(left, right, relationship))
			return null;

		return relationship(immutableCell(left, right, relationship));
	}

	/**
	 * <p>
	 * Gets all relationships.
	 * </p>
	 * 
	 * @return Iterates over all relationships
	 */
	public Iterable<? extends Relationship> getRelationships() {
		// Transform all entries of the relationships in the KB
		return from(kb.getRelationships().cells()).transform(x -> relationship(x));
	}

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
	public RelationshipType getRelationshipType(String name, String left, boolean leftMany, String right,
			boolean rightMany) {
		Ref leftType = Ref.to(left, leftMany);
		Ref rightType = Ref.to(right, rightMany);
		Set<String> names = kb.getRelationshipTypes().get(leftType, rightType);

		if (names.contains(name))
			return relationshipType(immutableCell(leftType, rightType, name));

		return null;
	}

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
	public RelationshipType getRelationshipType(String name, String left, String right) {
		return getRelationshipType(name, left, false, right, false);
	}

	/**
	 * <p>
	 * Gets all relationship types.
	 * </p>
	 * 
	 * @return Iterates over all relationship types
	 */
	public Iterable<? extends RelationshipType> getRelationshipTypes() {
		// Transform all entries of the relationship types in the KB
		return from(kb.getRelationshipTypes().cells()).transform(x -> relationshipType(x));
	}

	/**
	 * <p>
	 * Gets all relationships for the given name.
	 * </p>
	 * 
	 * @param name
	 *            The name to find
	 * @return Returns an iterable on the relationship types
	 */
	public Iterable<? extends RelationshipType> getRelationshipTypes(String name) {
		// Lookup relationship type multimap by name and wrap the triples
		return from(kb.getRelationshipTypes().whereValue(name)).transform(x -> relationshipType(x));
	}

	/**
	 * <p>
	 * Gets the one entity type that is {@link KB#ENTITY}.
	 * </p>
	 * 
	 * @return Returns the entity type
	 */
	public EntityType getTheEntityType() {
		return new EntityType() {
			@Override
			public Multimap<String, String> getAnnotations() {
				// Annotations are carried in the KB
				return kb.getTheEntityTypeAnnotations();
			}

			@Override
			public Iterable<? extends Entity> getInstances() {
				// All entities are instances of Entity
				return getEntities();
			}

			@Override
			public String getName() {
				// Name is the name given in the KB constants
				return KB.ENTITY;
			}

			@Override
			public Iterable<? extends EntityType> getSpecializations() {
				// All entity types that are not Entity itself are
				// specializations of Entity
				return filter(getEntityTypes(), not(equalTo(this)));
			}

			@Override
			public EntityType getSupertype() {
				// Entity has no supertype (same as for
				// Object.class.getSuperclass())
				return null;
			}

			@Override
			public int hashCode() {
				return KB.ENTITY.hashCode();
			}

			@Override
			public String toString() {
				return KB.ENTITY;
			}
		};
	}

	/**
	 * <p>
	 * Gets the title of the model.
	 * </p>
	 * 
	 * @return Returns the title
	 */
	public String getTitle() {
		// Title is carried in the KB
		return kb.getTitle();
	}

}
