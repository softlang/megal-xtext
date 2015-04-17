package org.softlang.megal.mi2;

import java.util.Map;
import java.util.Map.Entry;

import org.softlang.megal.mi2.util.ImmutableMultitable;
import org.softlang.megal.mi2.util.Multitable;
import org.softlang.megal.mi2.util.SetOperations;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Utility methods on knowledge bases.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class KBs {
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
		private final SetMultimap<String, String> bindings;

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
				SetMultimap<String, String> bindings, SetMultimap<String, String> theEntityTypeAnnotations,
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
		public Builder setBindings(SetMultimap<String, String> bindings) {
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
			return new AbstractKB() {
				@Override
				public String getTitle() {
					return title;
				}

				@Override
				public Multitable<String, String, String> getRelationships() {
					return relationships;
				}

				@Override
				public Multitable<Ref, Ref, String> getRelationshipTypes() {
					return relationshipTypes;
				}

				@Override
				public SetMultimap<Cell<Ref, Ref, String>, Entry<String, String>> getRelationshipTypeAnnotations() {
					return relationshipTypeAnnotations;
				}

				@Override
				public SetMultimap<Cell<String, String, String>, Entry<String, String>> getRelationshipAnnotations() {
					return relationshipAnnotations;
				}

				@Override
				public Map<String, String> getEntityTypes() {
					return entityTypes;
				}

				@Override
				public SetMultimap<Entry<String, String>, Entry<String, String>> getEntityTypeAnnotations() {
					return entityTypeAnnotations;
				}

				@Override
				public SetMultimap<Entry<String, Ref>, Entry<String, String>> getEntityAnnotations() {
					return entityAnnotations;
				}

				@Override
				public Map<String, Ref> getEntities() {
					return entities;
				}

				@Override
				public SetMultimap<String, String> getBindings() {
					return bindings;
				}

				@Override
				public SetMultimap<String, String> getTheEntityTypeAnnotations() {
					return theEntityTypeAnnotations;
				}

				@Override
				public SetMultimap<String, String> getAnnotations() {
					return annotations;
				}
			};
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + annotations.hashCode();
			result = prime * result + theEntityTypeAnnotations.hashCode();
			result = prime * result + bindings.hashCode();
			result = prime * result + entities.hashCode();
			result = prime * result + entityAnnotations.hashCode();
			result = prime * result + entityTypeAnnotations.hashCode();
			result = prime * result + entityTypes.hashCode();
			result = prime * result + relationshipAnnotations.hashCode();
			result = prime * result + relationshipTypeAnnotations.hashCode();
			result = prime * result + relationshipTypes.hashCode();
			result = prime * result + relationships.hashCode();
			result = prime * result + title.hashCode();
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
			Builder other = (Builder) obj;
			if (!annotations.equals(other.annotations))
				return false;
			if (!theEntityTypeAnnotations.equals(other.theEntityTypeAnnotations))
				return false;
			if (!bindings.equals(other.bindings))
				return false;
			if (!entities.equals(other.entities))
				return false;
			if (!entityAnnotations.equals(other.entityAnnotations))
				return false;
			if (!entityTypeAnnotations.equals(other.entityTypeAnnotations))
				return false;
			if (!entityTypes.equals(other.entityTypes))
				return false;
			if (!relationshipAnnotations.equals(other.relationshipAnnotations))
				return false;
			if (!relationshipTypeAnnotations.equals(other.relationshipTypeAnnotations))
				return false;
			if (!relationshipTypes.equals(other.relationshipTypes))
				return false;
			if (!relationships.equals(other.relationships))
				return false;
			if (!title.equals(other.title))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Builder [title=" + title + ", relationships=" + relationships + ", relationshipTypes="
					+ relationshipTypes + ", relationshipTypeAnnotations=" + relationshipTypeAnnotations
					+ ", relationshipAnnotations=" + relationshipAnnotations + ", entityTypes=" + entityTypes
					+ ", entityTypeAnnotations=" + entityTypeAnnotations + ", entityAnnotations=" + entityAnnotations
					+ ", entities=" + entities + ", bindings=" + bindings + ", annotations=" + annotations
					+ ", theEntityTypeAnnotations=" + theEntityTypeAnnotations + "]";
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
				ImmutableMap.of(), ImmutableSetMultimap.of(), ImmutableSetMultimap.of(), ImmutableSetMultimap.of());
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
		return builder()
				.setTitle(a.getTitle())
				.setRelationships(SetOperations.union(a.getRelationships(), b.getRelationships()))
				.setRelationshipTypes(SetOperations.union(a.getRelationshipTypes(), b.getRelationshipTypes()))
				.setRelationshipTypeAnnotations(
						SetOperations.union(a.getRelationshipTypeAnnotations(), b.getRelationshipTypeAnnotations()))
				.setRelationshipAnnotations(
						SetOperations.union(a.getRelationshipAnnotations(), b.getRelationshipAnnotations()))
				.setEntityTypes(SetOperations.union(a.getEntityTypes(), b.getEntityTypes()))
				.setEntityTypeAnnotations(
						SetOperations.union(a.getEntityTypeAnnotations(), b.getEntityTypeAnnotations()))
				.setEntityAnnotations(SetOperations.union(a.getEntityAnnotations(), b.getEntityAnnotations()))
				.setEntities(SetOperations.union(a.getEntities(), b.getEntities()))
				.setBindings(SetOperations.union(a.getBindings(), b.getBindings()))
				.setTheEntityTypeAnnotations(
						SetOperations.union(a.getTheEntityTypeAnnotations(), b.getTheEntityTypeAnnotations()))
				.setAnnotations(SetOperations.union(a.getAnnotations(), b.getAnnotations())).build();
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
}
