package org.softlang.megal.mi2;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

public class KBs {
	public static class Builder {
		private final String title;
		private final Table<String, String, String> relationships;
		private final Multimap<String, Entry<Ref, Ref>> relationshipTypes;
		private final Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> relationshipTypeAnnotations;
		private final Multimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations;
		private final Map<String, Ref> entityTypes;
		private final Multimap<Entry<String, Ref>, Entry<String, String>> entityTypeAnnotations;
		private final Multimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations;
		private final Map<String, Ref> entities;
		private final SetMultimap<String, String> bindings;
		private final Multimap<String, String> annotations;

		public Builder(String title, Table<String, String, String> relationships,
				Multimap<String, Entry<Ref, Ref>> relationshipTypes,
				Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> relationshipTypeAnnotations,
				Multimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations,
				Map<String, Ref> entityTypes,
				Multimap<Entry<String, Ref>, Entry<String, String>> entityTypeAnnotations,
				Multimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations, Map<String, Ref> entities,
				SetMultimap<String, String> bindings, Multimap<String, String> annotations) {
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
			this.annotations = annotations;
		}

		public Builder setTitle(String title) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setRelationships(Table<String, String, String> relationships) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setRelationshipTypes(Multimap<String, Entry<Ref, Ref>> relationshipTypes) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setRelationshipTypeAnnotations(
				Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> relationshipTypeAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setRelationshipAnnotations(
				Multimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setEntityTypes(Map<String, Ref> entityTypes) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setEntityTypeAnnotations(
				Multimap<Entry<String, Ref>, Entry<String, String>> entityTypeAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setEntityAnnotations(Multimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setEntities(Map<String, Ref> entities) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setBindings(SetMultimap<String, String> bindings) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public Builder setAnnotations(Multimap<String, String> annotations) {
			return new Builder(title, relationships, relationshipTypes, relationshipTypeAnnotations,
					relationshipAnnotations, entityTypes, entityTypeAnnotations, entityAnnotations, entities, bindings,
					annotations);
		}

		public KB build() {
			return new KB() {
				@Override
				public String getTitle() {
					return title;
				}

				@Override
				public Table<String, String, String> getRelationships() {
					return relationships;
				}

				@Override
				public Multimap<String, Entry<Ref, Ref>> getRelationshipTypes() {
					return relationshipTypes;
				}

				@Override
				public Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> getRelationshipTypeAnnotations() {
					return relationshipTypeAnnotations;
				}

				@Override
				public Multimap<Cell<String, String, String>, Entry<String, String>> getRelationshipAnnotations() {
					return relationshipAnnotations;
				}

				@Override
				public Map<String, Ref> getEntityTypes() {
					return entityTypes;
				}

				@Override
				public Multimap<Entry<String, Ref>, Entry<String, String>> getEntityTypeAnnotations() {
					return entityTypeAnnotations;
				}

				@Override
				public Multimap<Entry<String, Ref>, Entry<String, String>> getEntityAnnotations() {
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
				public Multimap<String, String> getAnnotations() {
					return annotations;
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + ((annotations == null) ? 0 : annotations.hashCode());
					result = prime * result + ((bindings == null) ? 0 : bindings.hashCode());
					result = prime * result + ((entities == null) ? 0 : entities.hashCode());
					result = prime * result + ((entityAnnotations == null) ? 0 : entityAnnotations.hashCode());
					result = prime * result + ((entityTypeAnnotations == null) ? 0 : entityTypeAnnotations.hashCode());
					result = prime * result + ((entityTypes == null) ? 0 : entityTypes.hashCode());
					result = prime * result
							+ ((relationshipAnnotations == null) ? 0 : relationshipAnnotations.hashCode());
					result = prime * result
							+ ((relationshipTypeAnnotations == null) ? 0 : relationshipTypeAnnotations.hashCode());
					result = prime * result + ((relationshipTypes == null) ? 0 : relationshipTypes.hashCode());
					result = prime * result + ((relationships == null) ? 0 : relationships.hashCode());
					result = prime * result + ((title == null) ? 0 : title.hashCode());
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
					if (!annotations.equals(other.getAnnotations()))
						return false;
					if (!bindings.equals(other.getBindings()))
						return false;
					if (!entities.equals(other.getEntities()))
						return false;
					if (!entityAnnotations.equals(other.getEntityAnnotations()))
						return false;
					if (!entityTypeAnnotations.equals(other.getEntityTypeAnnotations()))
						return false;
					if (!entityTypes.equals(other.getEntityTypes()))
						return false;
					if (!relationshipAnnotations.equals(other.getRelationshipAnnotations()))
						return false;
					if (!relationshipTypeAnnotations.equals(other.getRelationshipTypeAnnotations()))
						return false;
					if (!relationshipTypes.equals(other.getRelationshipTypes()))
						return false;
					if (!relationships.equals(other.getRelationships()))
						return false;
					if (title == null) {
						if (other.getTitle() != null)
							return false;
					} else if (!title.equals(other.getTitle()))
						return false;
					return true;
				}

				@Override
				public String toString() {
					return "KB "+title+" [relationships=" + relationships + ", relationshipTypes="
							+ relationshipTypes + ", relationshipTypeAnnotations=" + relationshipTypeAnnotations
							+ ", relationshipAnnotations=" + relationshipAnnotations + ", entityTypes=" + entityTypes
							+ ", entityTypeAnnotations=" + entityTypeAnnotations + ", entityAnnotations="
							+ entityAnnotations + ", entities=" + entities + ", bindings=" + bindings
							+ ", annotations=" + annotations + "]";
				}
			};
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((annotations == null) ? 0 : annotations.hashCode());
			result = prime * result + ((bindings == null) ? 0 : bindings.hashCode());
			result = prime * result + ((entities == null) ? 0 : entities.hashCode());
			result = prime * result + ((entityAnnotations == null) ? 0 : entityAnnotations.hashCode());
			result = prime * result + ((entityTypeAnnotations == null) ? 0 : entityTypeAnnotations.hashCode());
			result = prime * result + ((entityTypes == null) ? 0 : entityTypes.hashCode());
			result = prime * result + ((relationshipAnnotations == null) ? 0 : relationshipAnnotations.hashCode());
			result = prime * result
					+ ((relationshipTypeAnnotations == null) ? 0 : relationshipTypeAnnotations.hashCode());
			result = prime * result + ((relationshipTypes == null) ? 0 : relationshipTypes.hashCode());
			result = prime * result + ((relationships == null) ? 0 : relationships.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
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
					+ ", entities=" + entities + ", bindings=" + bindings + ", annotations=" + annotations + "]";
		}
	}

	public static Builder builder() {
		return new Builder(null, ImmutableTable.of(), ImmutableMultimap.of(), ImmutableMultimap.of(),
				ImmutableMultimap.of(), ImmutableMap.of(), ImmutableMultimap.of(), ImmutableMultimap.of(),
				ImmutableMap.of(), ImmutableSetMultimap.of(), ImmutableMultimap.of());
	}

	private static <R, C, V> ImmutableTable<R, C, V> union(Table<R, C, V> a, Table<R, C, V> b) {
		ImmutableTable.Builder<R, C, V> builder = ImmutableTable.builder();

		builder.putAll(a);
		for (Cell<R, C, V> cell : b.cellSet())
			if (!a.contains(cell.getRowKey(), cell.getColumnKey()))
				builder.put(cell);

		return builder.build();
	}

	private static <K, V> ImmutableMultimap<K, V> union(Multimap<K, V> a, Multimap<K, V> b) {
		ImmutableMultimap.Builder<K, V> builder = ImmutableMultimap.builder();

		builder.putAll(a);
		builder.putAll(b);

		return builder.build();
	}

	private static <K, V> ImmutableMap<K, V> union(Map<K, V> a, Map<K, V> b) {
		ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();

		builder.putAll(a);
		for (Entry<K, V> entry : b.entrySet())
			if (!a.containsKey(entry.getKey()))
				builder.put(entry);

		return builder.build();
	}

	private static <K, V> ImmutableSetMultimap<K, V> union(SetMultimap<K, V> a, SetMultimap<K, V> b) {
		ImmutableSetMultimap.Builder<K, V> builder = ImmutableSetMultimap.builder();

		builder.putAll(a);
		builder.putAll(b);

		return builder.build();
	}

	public static KB union(KB a, KB b) {
		return builder()
				.setTitle(a.getTitle())
				.setRelationships(union(a.getRelationships(), b.getRelationships()))
				.setRelationshipTypes(union(a.getRelationshipTypes(), b.getRelationshipTypes()))
				.setRelationshipTypeAnnotations(
						union(a.getRelationshipTypeAnnotations(), b.getRelationshipTypeAnnotations()))
				.setRelationshipAnnotations(union(a.getRelationshipAnnotations(), b.getRelationshipAnnotations()))
				.setEntityTypes(union(a.getEntityTypes(), b.getEntityTypes()))
				.setEntityTypeAnnotations(union(a.getEntityTypeAnnotations(), b.getEntityTypeAnnotations()))
				.setEntityAnnotations(union(a.getEntityAnnotations(), b.getEntityAnnotations()))
				.setEntities(union(a.getEntities(), b.getEntities()))
				.setBindings(union(a.getBindings(), b.getBindings()))
				.setAnnotations(union(a.getAnnotations(), b.getAnnotations())).build();
	}

	public static KB intersection(KB a, KB b) {
		throw new UnsupportedOperationException();
	}

	public static KB difference(KB a, KB b) {
		throw new UnsupportedOperationException();
	}
}
