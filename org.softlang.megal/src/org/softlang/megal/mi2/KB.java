package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Predicates.equalTo;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Maps.immutableEntry;
import static com.google.common.collect.Tables.immutableCell;
import static org.softlang.megal.mi2.util.SetOperations.translate;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.softlang.megal.mi2.util.Bijection;
import org.softlang.megal.mi2.util.Bijections;
import org.softlang.megal.mi2.util.ImmutableMultitable;
import org.softlang.megal.mi2.util.Multitable;
import org.softlang.megal.mi2.util.SetOperations;
import org.softlang.megal.util.Persistent;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Class of knowledge bases on entity and typed relationships.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public abstract class KB {
	/**
	 * <p>
	 * This is the name of the top level entity. This entity has itself as a
	 * supertype. A {@link KB} is invalid, if it assigns a new type to this
	 * name.
	 * </p>
	 */
	public static final String ENTITY = "Entity";

	private final class ConvertedEntityType extends EntityType {
		private final Entry<String, String> from;

		public ConvertedEntityType(Entry<String, String> from) {
			this.from = from;
		}

		@Override
		public Multimap<String, String> getAnnotations() {
			// Translate the unstructured annotations
			return translate(getRawEntityTypeAnnotations().get(from));
		}

		@Override
		public Set<Entity> getInstances() {
			// All entities that are of this type or thats type is a
			// specialization of this type
			return SetOperations.filter(getEntities(), Entity.class, x -> equal(x.getType(), this)
					|| x.getType().isSpecializationOf(this));
		}

		@Override
		public String getName() {
			// Name is specified by key
			return from.getKey();
		}

		@Override
		public Set<EntityType> getSpecializations() {
			// All entity types that are specializations of this type
			return SetOperations.filter(getEntityTypes(), EntityType.class, x -> x.isSpecializationOf(this));
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
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;

			if (obj instanceof ConvertedEntityType)
				return equal(from, ((ConvertedEntityType) obj).from);

			return super.equals(obj);
		}

		@Override
		public String toString() {
			return from.getKey() + " < " + from.getValue();
		}
	}

	private final class ConvertedRelationshipType extends RelationshipType {
		private final Cell<Ref, Ref, String> from;

		public ConvertedRelationshipType(Cell<Ref, Ref, String> from) {
			this.from = from;
		}

		@Override
		public Multimap<String, String> getAnnotations() {
			// Translate the unstructured annotations
			return translate(getRawRelationshipTypeAnnotations().get(from));
		}

		@Override
		public Set<Relationship> getInstances() {
			// All relationships that are of this type or thats type is a
			// specialization of this type
			return SetOperations.filter(getRelationships(), Relationship.class, x -> equal(x.getType(), this)
					|| x.getType().isSpecializationOf(this));
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
		public Set<RelationshipType> getSpecializations() {
			// All relationship types that are specializations of this type
			return SetOperations.filter(getRelationshipTypes(from.getValue()), RelationshipType.class,
					x -> x.isSpecializationOf(this));
		}

		@Override
		public int hashCode() {
			return from.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;

			if (obj instanceof ConvertedRelationshipType)
				return equal(from, ((ConvertedRelationshipType) obj).from);

			return super.equals(obj);
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
	}

	private final class ConvertedEntity extends Entity {
		private final Entry<String, Ref> from;

		public ConvertedEntity(Entry<String, Ref> from) {
			this.from = from;
		}

		@Override
		public Multimap<String, String> getAnnotations() {
			// Translate the unstructured annotations
			return translate(getRawEntityAnnotations().get(from));
		}

		@Override
		public Optional<Object> getBinding() {
			// Bindings are mapped from the key
			if (getRawBindings().containsKey(from.getKey()))
				return Optional.of(getRawBindings().get(from.getKey()));

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
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;

			if (obj instanceof ConvertedEntity)
				return equal(from, ((ConvertedEntity) obj).from);

			return super.equals(obj);
		}

		@Override
		public Set<Relationship> incoming() {
			// Incoming are in the relationship column of this entity
			return SetOperations.transform(getRawRelationships().whereColumn(from.getKey()), Relationship.class,
					relationshipBijection);
		}

		@Override
		public boolean isTypeMany() {
			// Many is specified by value
			return from.getValue().isMany();
		}

		@Override
		public Set<Relationship> outgoing() {
			// Outgoing are in the relationship column of this entity
			return SetOperations.transform(getRawRelationships().whereRow(from.getKey()), Relationship.class,
					relationshipBijection);
		}

		@Override
		public String toString() {
			return from.getKey() + ": " + from.getValue();
		}
	}

	private final class ConvertedRelationship extends Relationship {
		private final Cell<String, String, String> from;

		private ConvertedRelationship(Cell<String, String, String> from) {
			this.from = from;
		}

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
			if (getRawRelationshipTypes().contains(fromType, toType, from.getValue()))
				return Optional.of(relationshipType(immutableCell(fromType, toType, from.getValue())));

			// Make supertype for the left side
			Ref fromTypeSupertype = Ref.to(getRawEntityTypes().get(fromType.getType()), fromType.isMany());

			// Make supertype for the right side
			Ref toTypeSupertype = Ref.to(getRawEntityTypes().get(toType.getType()), toType.isMany());

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
			return translate(getRawRelationshipAnnotations().get(from));
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
			Ref fe = getRawEntities().get(from.getRowKey());
			Ref te = getRawEntities().get(from.getColumnKey());

			// Find an applicable relationship type
			return loadOrSubstitute(fe, te).orNull();
		}

		@Override
		public int hashCode() {
			return from.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;

			if (obj instanceof ConvertedRelationship)
				return equal(from, ((ConvertedRelationship) obj).from);

			return super.equals(obj);
		}

		@Override
		public String toString() {
			return from.getRowKey() + " " + from.getValue() + " " + from.getColumnKey();
		}
	}

	/*
	 * BUILDER
	 * ========================================================================
	 */
	/**
	 * <p>
	 * The builder class initializes a knowledge base on the given static return
	 * values. It may be supplied to other consumers, as every operation makes a
	 * copy of the builder.
	 * </p>
	 * 
	 * @author Pazuzu
	 *
	 */
	public static class Builder {
		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final String title;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final Multitable<String, String, String> relationships;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final Multitable<Ref, Ref, String> relationshipTypes;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> relationshipTypeAnnotations;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final SetMultimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final Map<String, String> entityTypes;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final SetMultimap<Entry<String, String>, Entry<String, String>> entityTypeAnnotations;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final SetMultimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final Map<String, Ref> entities;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final Map<String, Object> bindings;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final SetMultimap<String, String> annotations;

		/**
		 * <p>
		 * Internal backing field.
		 * </p>
		 */
		private final SetMultimap<String, String> theEntityTypeAnnotations;

		/**
		 * <p>
		 * Creates the builder on the given parameters
		 * </p>
		 * 
		 * @param title
		 *            The title
		 * @param relationships
		 *            The relationships
		 * @param relationshipTypes
		 *            The relationship types
		 * @param relationshipTypeAnnotations
		 *            The relationship type annotations
		 * @param relationshipAnnotations
		 *            The relationship annotations
		 * @param entityTypes
		 *            The entity types
		 * @param entityTypeAnnotations
		 *            The entity type annotations
		 * @param entityAnnotations
		 *            The entity annotations
		 * @param entities
		 *            The entities
		 * @param bindings
		 *            The bindings
		 * @param annotations
		 *            The annotations
		 */
		public Builder(String title, Multitable<String, String, String> relationships,
				Multitable<Ref, Ref, String> relationshipTypes,
				SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> relationshipTypeAnnotations,
				SetMultimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations,
				Map<String, String> entityTypes,
				SetMultimap<Entry<String, String>, Entry<String, String>> entityTypeAnnotations,
				SetMultimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations, Map<String, Ref> entities,
				Map<String, Object> bindings, SetMultimap<String, String> theEntityTypeAnnotations,
				SetMultimap<String, String> annotations) {
			this.title = title;
			this.relationships = relationships;
			this.relationshipTypes = relationshipTypes;
			this.relationshipTypeAnnotations = relationshipTypeAnnotations;
			this.relationshipAnnotations = relationshipAnnotations;
			this.entityTypes = entityTypes;
			this.entityTypeAnnotations = entityTypeAnnotations;
			this.entityAnnotations = entityAnnotations;
			this.entities = entities;
			this.bindings = bindings;
			this.theEntityTypeAnnotations = theEntityTypeAnnotations;
			this.annotations = annotations;
		}

		/**
		 * <p>
		 * Assigns the title, copies the builder
		 * </p>
		 * 
		 * @param title
		 *            The desired title
		 * @return Returns a copied builder
		 */
		public Builder setTitle(String title) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the relationships, copies the builder
		 * </p>
		 * 
		 * @param relationships
		 *            The desired relationships
		 * @return Returns a copied builder
		 */
		public Builder setRelationships(Multitable<String, String, String> relationships) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the relationship types, copies the builder
		 * </p>
		 * 
		 * @param relationshipTypes
		 *            The relationship types
		 * @return Returns a copied builder
		 */
		public Builder setRelationshipTypes(Multitable<Ref, Ref, String> relationshipTypes) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		public Builder setRelationshipTypeAnnotations(
				SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> relationshipTypeAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the relationship type annotations, copies the builder
		 * </p>
		 * 
		 * @param relationshipAnnotations
		 *            The relationship type annotations
		 * @return Returns a copied builder
		 */
		public Builder setRelationshipAnnotations(
				SetMultimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the entity types, copies the builder
		 * </p>
		 * 
		 * @param entityTypes
		 *            The entity types
		 * @return Returns a copied builder
		 */
		public Builder setEntityTypes(Map<String, String> entityTypes) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the entity type annotations, copies the builder
		 * </p>
		 * 
		 * @param entityTypeAnnotations
		 *            The entity type annotations
		 * @return Returns a copied builder
		 */
		public Builder setEntityTypeAnnotations(
				SetMultimap<Entry<String, String>, Entry<String, String>> entityTypeAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the entity annotations, copies the builder
		 * </p>
		 * 
		 * @param entityAnnotations
		 *            The entity annotations
		 * @return Returns a copied builder
		 */
		public Builder setEntityAnnotations(SetMultimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the entities, copies the builder
		 * </p>
		 * 
		 * @param entities
		 *            The entities
		 * @return Returns a copied builder
		 */
		public Builder setEntities(Map<String, Ref> entities) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the bindings, copies the builder
		 * </p>
		 * 
		 * @param bindings
		 *            The bindings
		 * @return Returns a copied builder
		 */
		public Builder setBindings(Map<String, Object> bindings) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the annotations, copies the builder
		 * </p>
		 * 
		 * @param annotations
		 *            The annotations
		 * @return Returns a copied builder
		 */
		public Builder setAnnotations(SetMultimap<String, String> annotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Assigns the entity type annotations, copies the builder
		 * </p>
		 * 
		 * @param annotations
		 *            The annotations
		 * @return Returns a copied builder
		 */
		public Builder setTheEntityTypeAnnotations(SetMultimap<String, String> theEntityTypeAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					theEntityTypeAnnotations, annotations);
		}

		/**
		 * <p>
		 * Manifests the current builder into a knowledge base.
		 * </p>
		 * 
		 * @return Returns a knowledge base backed by the current state
		 */
		public KB build() {
			return new KB() {
				@Override
				public String getTitle() {
					return title;
				}

				@Override
				public Multitable<String, String, String> getRawRelationships() {
					return relationships;
				}

				@Override
				public Multitable<Ref, Ref, String> getRawRelationshipTypes() {
					return relationshipTypes;
				}

				@Override
				public SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> getRawRelationshipTypeAnnotations() {
					return relationshipTypeAnnotations;
				}

				@Override
				public SetMultimap<Cell<String, String, String>, Entry<String, String>> getRawRelationshipAnnotations() {
					return relationshipAnnotations;
				}

				@Override
				public Map<String, String> getRawEntityTypes() {
					return entityTypes;
				}

				@Override
				public SetMultimap<Entry<String, String>, Entry<String, String>> getRawEntityTypeAnnotations() {
					return entityTypeAnnotations;
				}

				@Override
				public SetMultimap<Entry<String, Ref>, Entry<String, String>> getRawEntityAnnotations() {
					return entityAnnotations;
				}

				@Override
				public Map<String, Ref> getRawEntities() {
					return entities;
				}

				@Override
				public Map<String, Object> getRawBindings() {
					return bindings;
				}

				@Override
				public SetMultimap<String, String> getRawTheEntityTypeAnnotations() {
					return theEntityTypeAnnotations;
				}

				@Override
				public SetMultimap<String, String> getRawAnnotations() {
					return annotations;
				}
			};
		}
	}

	/**
	 * <p>
	 * Starts a builder on empty values.
	 * </p>
	 * 
	 * @return Returns a builder
	 */
	public static Builder builder() {
		return new Builder(null, ImmutableMultitable.of(), ImmutableMultitable.of(), ImmutableSetMultimap.of(),
				ImmutableSetMultimap.of(), ImmutableMap.of(), ImmutableSetMultimap.of(), ImmutableSetMultimap.of(),
				ImmutableMap.of(), ImmutableMap.of(), ImmutableSetMultimap.of(), ImmutableSetMultimap.of());
	}

	/*
	 * UTILITIES
	 * ========================================================================
	 */

	public static KB clone(KB current) {
		return union(current, empty());
	}

	/**
	 * <p>
	 * Applies the union on the values of <code>a</code> and <code>b</code>.
	 * Uses the first knowledge bases title.
	 * </p>
	 * 
	 * @param a
	 *            The first knowledge base
	 * @param b
	 *            The second knowledge base
	 * @return Returns a new knowledge base
	 */
	public static KB union(KB a, KB b) {
		return KB
				.builder()
				.setTitle(a.getTitle())
				.setRelationships(SetOperations.union(a.getRawRelationships(), b.getRawRelationships()))
				.setRelationshipTypes(SetOperations.union(a.getRawRelationshipTypes(), b.getRawRelationshipTypes()))
				.setRelationshipTypeAnnotations(
						SetOperations.union(a.getRawRelationshipTypeAnnotations(),
								b.getRawRelationshipTypeAnnotations()))
				.setRelationshipAnnotations(
						SetOperations.union(a.getRawRelationshipAnnotations(), b.getRawRelationshipAnnotations()))
				.setEntityTypes(SetOperations.union(a.getRawEntityTypes(), b.getRawEntityTypes()))
				.setEntityTypeAnnotations(
						SetOperations.union(a.getRawEntityTypeAnnotations(), b.getRawEntityTypeAnnotations()))
				.setEntityAnnotations(SetOperations.union(a.getRawEntityAnnotations(), b.getRawEntityAnnotations()))
				.setEntities(SetOperations.union(a.getRawEntities(), b.getRawEntities()))
				.setBindings(SetOperations.union(a.getRawBindings(), b.getRawBindings()))
				.setTheEntityTypeAnnotations(
						SetOperations.union(a.getRawTheEntityTypeAnnotations(), b.getRawTheEntityTypeAnnotations()))
				.setAnnotations(SetOperations.union(a.getRawAnnotations(), b.getRawAnnotations())).build();
	}

	/**
	 * <p>
	 * Applies the intersection on the values of <code>a</code> and
	 * <code>b</code>. Uses the first knowledge bases title.
	 * </p>
	 * 
	 * @param a
	 *            The first knowledge base
	 * @param b
	 *            The second knowledge base
	 * @return Returns a new knowledge base
	 */
	public static KB intersection(KB a, KB b) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <p>
	 * Applies the difference on the values of <code>a</code> and <code>b</code>
	 * . Uses the first knowledge bases title.
	 * </p>
	 * 
	 * @param a
	 *            The first knowledge base
	 * @param b
	 *            The second knowledge base
	 * @return Returns a new knowledge base
	 */
	public static KB difference(KB a, KB b) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <p>
	 * Constructs an empty immutable KB.
	 * </p>
	 * 
	 * @return Returns an empty KB
	 */
	public static KB empty() {
		return KB.builder().build();
	}

	/*
	 * FUNCTION OBJECTS
	 * ========================================================================
	 */
	/**
	 * <p>
	 * Bijection object on the methods {@link #entity(Entry)} and
	 * {@link #entityInverse(Entity)}.
	 * </p>
	 */
	private final Bijection<Entry<String, Ref>, Entity> entityBijection = Bijections.of(this::entity,
			this::entityInverse);

	/**
	 * <p>
	 * Bijection object on the methods {@link #entityType(Entry)} and
	 * {@link #entityTypeInverse(EntityType)}.
	 * </p>
	 */
	private final Bijection<Entry<String, String>, EntityType> entityTypeBijection = Bijections.of(this::entityType,
			this::entityTypeInverse);

	/**
	 * <p>
	 * Bijection object on the methods {@link #relationship(Cell)} and
	 * {@link #relationshipInverse(Relationship)}.
	 * </p>
	 */
	private final Bijection<Cell<String, String, String>, Relationship> relationshipBijection = Bijections.of(
			this::relationship, this::relationshipInverse);

	/**
	 * <p>
	 * Bijection object on the methods {@link #relationshipType(Cell)} and
	 * {@link #relationshipTypeInverse(RelationshipType)}.
	 * </p>
	 */
	private final Bijection<Cell<Ref, Ref, String>, RelationshipType> relationshipTypeBijection = Bijections.of(
			this::relationshipType, this::relationshipTypeInverse);

	/*
	 * INTERFACE
	 * ========================================================================
	 */
	/**
	 * <p>
	 * Gets the title of this knowledge base.
	 * </p>
	 * 
	 * @return Returns the title
	 */
	public abstract String getTitle();

	/**
	 * <p>
	 * Gets the top level annotations, applied directly to the knowledge base.
	 * </p>
	 * 
	 * @return Returns the annotations
	 */
	public abstract SetMultimap<String, String> getRawAnnotations();

	/**
	 * <p>
	 * Gets the annotations to the root entity type.
	 * </p>
	 * 
	 * @return Returns the annotations
	 */
	public abstract SetMultimap<String, String> getRawTheEntityTypeAnnotations();

	/**
	 * <p>
	 * Maps the entity type name to their supertype.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract Map<String, String> getRawEntityTypes();

	/**
	 * <p>
	 * Maps from relationship type name to all their applicable type pairs.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract Multitable<Ref, Ref, String> getRawRelationshipTypes();

	/**
	 * <p>
	 * Maps the entity name to their type.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract Map<String, Ref> getRawEntities();

	/**
	 * <p>
	 * Maps from entity name to all their bindings.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract Map<String, Object> getRawBindings();

	/**
	 * <p>
	 * Maps from relationship name to all their instances.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract Multitable<String, String, String> getRawRelationships();

	/**
	 * <p>
	 * Gets a map from entity type entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract SetMultimap<Entry<String, String>, Entry<String, String>> getRawEntityTypeAnnotations();

	/**
	 * <p>
	 * Gets a map from relationship type entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> getRawRelationshipTypeAnnotations();

	/**
	 * <p>
	 * Gets a map from entity entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract SetMultimap<Entry<String, Ref>, Entry<String, String>> getRawEntityAnnotations();

	/**
	 * <p>
	 * Gets a map from relationship entry to all annotations.
	 * </p>
	 * 
	 * @return Returns the data
	 */
	public abstract SetMultimap<Cell<String, String, String>, Entry<String, String>> getRawRelationshipAnnotations();

	/*
	 * TRANSFORMATION
	 * ========================================================================
	 */
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
		return new ConvertedEntity(from);
	}

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
	private EntityType entityType(Entry<String, String> from) {
		return new ConvertedEntityType(from);
	}

	private Entry<String, String> entityTypeInverse(EntityType entityType) {
		return immutableEntry(entityType.getName(), entityType.getSupertype() != null ? entityType.getSupertype()
				.getName() : null);
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
		return new ConvertedRelationship(from);
	}

	private Cell<String, String, String> relationshipInverse(Relationship relationship) {
		return immutableCell(relationship.getLeft().getName(), relationship.getRight().getName(), relationship
				.getType().getName());
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
		return new ConvertedRelationshipType(from);
	}

	private Cell<Ref, Ref, String> relationshipTypeInverse(RelationshipType relationshipType) {
		return immutableCell(Ref.to(relationshipType.getLeft().getName(), relationshipType.isLeftMany()),
				Ref.to(relationshipType.getRight().getName(), relationshipType.isRightMany()),
				relationshipType.getName());
	}

	/*
	 * ACCESSS
	 * ========================================================================
	 */
	public Set<Element> getElements() {
		return Sets.union(Sets.union(Sets.union(getEntityTypes(), getRelationshipTypes()), getEntities()),
				getRelationships());
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
		return getRawAnnotations();
	}

	/**
	 * <p>
	 * Gets all entities.
	 * </p>
	 * 
	 * @return Iterates over all entities
	 */
	public Set<Entity> getEntities() {
		// Transform all entries of the entities in the KB
		return SetOperations.transform(getRawEntities().entrySet(), Entity.class, entityBijection);
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
		Ref type = getRawEntities().get(name);

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
		String supertype = getRawEntityTypes().get(name);

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
	public Set<EntityType> getEntityTypes() {
		// Get all newly defined entity types after the Entity type
		return Persistent.with(getTheEntityType(),
				SetOperations.transform(getRawEntityTypes().entrySet(), EntityType.class, entityTypeBijection));
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
		if (!getRawRelationships().contains(left, right, relationship))
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
	public Set<Relationship> getRelationships() {
		// Transform all entries of the relationships in the KB
		return SetOperations.transform(getRawRelationships().cells(), Relationship.class, relationshipBijection);
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
		Set<String> names = getRawRelationshipTypes().get(leftType, rightType);

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
	public Set<RelationshipType> getRelationshipTypes() {
		// Transform all entries of the relationship types in the KB
		return SetOperations.transform(getRawRelationshipTypes().cells(), RelationshipType.class,
				relationshipTypeBijection);
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
	public Set<RelationshipType> getRelationshipTypes(String name) {
		// Lookup relationship type multimap by name and wrap the triples
		return SetOperations.transform(getRawRelationshipTypes().whereValue(name), RelationshipType.class,
				relationshipTypeBijection);
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
				return getRawTheEntityTypeAnnotations();
			}

			@Override
			public Set<Entity> getInstances() {
				// All entities are instances of Entity
				return getEntities();
			}

			@Override
			public String getName() {
				// Name is the name given in the KB constants
				return KB.ENTITY;
			}

			@Override
			public Set<EntityType> getSpecializations() {
				// All entity types that are not Entity itself are
				// specializations of Entity
				return SetOperations.filter(getEntityTypes(), EntityType.class, not(equalTo(this)));
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

	/*
	 * EQUIVALENCE AND EQUIVALENCE IMPLICAITON
	 * ========================================================================
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getRawAnnotations().hashCode();
		result = prime * result + getRawTheEntityTypeAnnotations().hashCode();
		result = prime * result + getRawBindings().hashCode();
		result = prime * result + getRawEntities().hashCode();
		result = prime * result + getRawEntityAnnotations().hashCode();
		result = prime * result + getRawEntityTypeAnnotations().hashCode();
		result = prime * result + getRawEntityTypes().hashCode();
		result = prime * result + getRawRelationshipAnnotations().hashCode();
		result = prime * result + getRawRelationshipTypeAnnotations().hashCode();
		result = prime * result + getRawRelationshipTypes().hashCode();
		result = prime * result + getRawRelationships().hashCode();
		result = prime * result + (getTitle() == null ? 0 : getTitle().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KB other = (KB) obj;
		if (!getRawAnnotations().equals(other.getRawAnnotations()))
			return false;
		if (!getRawTheEntityTypeAnnotations().equals(other.getRawTheEntityTypeAnnotations()))
			return false;
		if (!getRawBindings().equals(other.getRawBindings()))
			return false;
		if (!getRawEntities().equals(other.getRawEntities()))
			return false;
		if (!getRawEntityAnnotations().equals(other.getRawEntityAnnotations()))
			return false;
		if (!getRawEntityTypeAnnotations().equals(other.getRawEntityTypeAnnotations()))
			return false;
		if (!getRawEntityTypes().equals(other.getRawEntityTypes()))
			return false;
		if (!getRawRelationshipAnnotations().equals(other.getRawRelationshipAnnotations()))
			return false;
		if (!getRawRelationshipTypeAnnotations().equals(other.getRawRelationshipTypeAnnotations()))
			return false;
		if (!getRawRelationshipTypes().equals(other.getRawRelationshipTypes()))
			return false;
		if (!getRawRelationships().equals(other.getRawRelationships()))
			return false;
		if (getTitle() == null) {
			if (other.getTitle() != null)
				return false;
		} else if (!getTitle().equals(other.getTitle()))
			return false;
		return true;
	}

	/*
	 * REPRESENTATION
	 * ========================================================================
	 */
	@Override
	public String toString() {
		return "KB " + getTitle() + " [relationships=" + getRawRelationships() + ", relationshipTypes="
				+ getRawRelationshipTypes() + ", relationshipTypeAnnotations=" + getRawRelationshipTypeAnnotations()
				+ ", relationshipAnnotations=" + getRawRelationshipAnnotations() + ", entityTypes="
				+ getRawEntityTypes() + ", entityTypeAnnotations=" + getRawEntityTypeAnnotations()
				+ ", entityAnnotations=" + getRawEntityAnnotations() + ", entities=" + getRawEntities() + ", bindings="
				+ getRawBindings() + ", annotations=" + getRawAnnotations() + ", theEntityTypeAnnotations"
				+ getRawTheEntityTypeAnnotations() + "]";
	}
}
