package org.softlang.megal.mi2;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Predicates.equalTo;
import static com.google.common.base.Predicates.not;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.transform;
import static com.google.common.collect.Maps.immutableEntry;
import static com.google.common.collect.Multimaps.index;
import static com.google.common.collect.Multimaps.transformValues;
import static com.google.common.collect.Tables.immutableCell;
import static java.util.Collections.singleton;

import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import com.google.common.base.Optional;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * A basic reasoner that directly operates on the given knowledge base.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class NaiveReasoner extends AbstractReasoner {
	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final KB kb;

	/**
	 * <p>
	 * Constructs the naive reasoner on the knowledge base.
	 * </p>
	 * 
	 * @param kb
	 *            The knowledge base to operate on
	 */
	public NaiveReasoner(KB kb) {
		this.kb = kb;
	}

	/**
	 * <p>
	 * Gets the knowledge base operated on.
	 * </p>
	 * 
	 * @return Returns the input
	 */
	public KB getKB() {
		return kb;
	}

	/**
	 * <p>
	 * Translates the collection of entries to a multimap.
	 * </p>
	 * 
	 * @param entries
	 *            The entries to translate
	 * @return Returns a multimap
	 */
	private static Multimap<String, String> translate(Collection<Entry<String, String>> entries) {
		// Index by map entry key and map the value by entry value
		return transformValues(index(entries, Entry::getKey), Entry::getValue);
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
			public String getName() {
				// Name is specified by key
				return from.getKey();
			}

			@Override
			public EntityType getSupertype() {
				// Entity type is specified by the value
				return getEntityType(from.getValue());
			}

			@Override
			public Iterable<? extends Entity> getInstances() {
				// TODO Post order deepening iterator on KB supertypes

				// All entities that are of this type or thats type is a
				// specialization of this type
				return filter(getEntities(), x -> equal(x.getType(), this) || x.getType().isSpecializationOf(this));
			}

			@Override
			public Iterable<? extends EntityType> getSpecializations() {
				// TODO Post order deepening iterator on KB supertypes

				// All entity types that are specializations of this type
				return filter(getEntityTypes(), x -> x.isSpecializationOf(this));
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
			public String getName() {
				// Name is specified by key
				return from.getValue();
			}

			@Override
			public EntityType getLeft() {
				// Left type is specified values key
				return getEntityType(from.getRowKey().getType());
			}

			@Override
			public boolean isLeftMany() {
				// Left many is specified values key
				return from.getRowKey().isMany();
			}

			@Override
			public List<? extends Entity> getLeftParams() {
				// Left params are specified values key
				return transform(from.getRowKey().getParams(), x -> getEntity(x));
			}

			@Override
			public EntityType getRight() {
				// Right type is specified values key
				return getEntityType(from.getColumnKey().getType());
			}

			@Override
			public boolean isRightMany() {
				// Right many is specified values key
				return from.getColumnKey().isMany();
			}

			@Override
			public List<? extends Entity> getRightParams() {
				// Right params are specified values key
				return transform(from.getColumnKey().getParams(), x -> getEntity(x));
			}

			@Override
			public Iterable<? extends Relationship> getInstances() {
				// All relationships that are of this type or thats type is a
				// specialization of this type
				return from(getRelationships()).filter(
						x -> equal(x.getType(), this) || x.getType().isSpecializationOf(this));
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
			public String toString() {
				return from.getValue() + "< " + from.getRowKey() + " * " + from.getColumnKey();
			}
		};
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
			public String getName() {
				// Name is specified by key
				return from.getKey();
			}

			@Override
			public Set<String> getBindings() {
				// Bindings are mapped from the key
				return kb.getBindings().get(from.getKey());
			}

			@Override
			public EntityType getType() {
				// Type is specified by value
				return getEntityType(from.getValue().getType());
			}

			@Override
			public boolean isTypeMany() {
				// Many is specified by value
				return from.getValue().isMany();
			}

			@Override
			public List<? extends Entity> getTypeParams() {
				// Params are specified by value
				return transform(from.getValue().getParams(), x -> getEntity(x));
			}

			@Override
			public Iterable<? extends Relationship> incoming() {

				// Incoming are in the relationship column of this entity
				return transform(kb.getRelationships().whereColumn(from.getKey()), x -> relationship(x));
			}

			@Override
			public Iterable<? extends Relationship> outgoing() {
				// Outgoing are in the relationship column of this entity
				return transform(kb.getRelationships().whereRow(from.getKey()), x -> relationship(x));
			}

			@Override
			public int hashCode() {
				return from.hashCode();
			}

			@Override
			public String toString() {
				return from.getKey() + ": " + from.getValue();
			}
		};
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

			@Override
			public Multimap<String, String> getAnnotations() {
				// Translate the unstructured annotations
				return translate(kb.getRelationshipAnnotations().get(from));
			}

			@Override
			public RelationshipType getType() {
				// Type is obtained by substitution lookup
				Ref fe = kb.getEntities().get(from.getRowKey());
				Ref te = kb.getEntities().get(from.getColumnKey());

				// Find an applicable relationship type
				Optional<RelationshipType> potential = loadOrSubstitute(fe, te);

				// If none present, throw an exception
				if (!potential.isPresent())
					throw new NoSuchElementException("No relationship type for " + from.getRowKey() + " "
							+ from.getValue() + " " + from.getColumnKey());

				// TODO Maybe null instead

				// Return the result
				return potential.get();
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
				if (kb.getRelationshipTypes().contains(fromType, toType, from.getValue()))
					return Optional.of(relationshipType(immutableCell(fromType, toType, from.getValue())));

				// Make supertype for the left side
				Ref fromTypeSupertype = Ref.to(kb.getEntityTypes().get(fromType.getType()), fromType.isMany(),
						fromType.getParams());

				// Make supertype for the right side
				Ref toTypeSupertype = Ref.to(kb.getEntityTypes().get(toType.getType()), toType.isMany(),
						toType.getParams());

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
			public int hashCode() {
				return from.hashCode();
			}

			@Override
			public String toString() {
				return from.getRowKey() + " " + from.getValue() + " " + from.getColumnKey();
			}
		};
	}

	@Override
	public String getTitle() {
		// Title is carried in the KB
		return kb.getTitle();
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		// Annotations are carried in the KB
		return kb.getAnnotations();
	}

	@Override
	public EntityType getTheEntityType() {
		return new EntityType() {
			@Override
			public Multimap<String, String> getAnnotations() {
				// Annotations are carried in the KB
				return kb.getTheEntityTypeAnnotations();
			}

			@Override
			public String getName() {
				// Name is the name given in the KB constants
				return KB.ENTITY;
			}

			@Override
			public EntityType getSupertype() {
				// Entity has no supertype (same as for
				// Object.class.getSuperclass())
				return null;
			}

			@Override
			public Iterable<? extends Entity> getInstances() {
				// All entities are instances of Entity
				return getEntities();
			}

			@Override
			public Iterable<? extends EntityType> getSpecializations() {
				// All entity types that are not Entity itself are
				// specializations of Entity
				return filter(getEntityTypes(), not(equalTo(this)));
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

	@Override
	public EntityType getEntityType(String name) {
		// If name is Entity as defined by KB constants, return the Entity type
		if (KB.ENTITY.equals(name))
			return getTheEntityType();

		// Get the supertype by KB lookup
		String supertype = kb.getEntityTypes().get(name);

		// If null, then there was no mapping
		if (supertype == null)
			throw new NoSuchElementException(name);

		// Wrap the pair
		return entityType(immutableEntry(name, supertype));
	}

	@Override
	public RelationshipType getRelationshipType(String name, String left, boolean leftMany, List<String> leftParams,
			String right, boolean rightMany, List<String> rightParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getEntity(String name) {
		// Get the type by KB lookup
		Ref type = kb.getEntities().get(name);

		// If null, then there was no mapping
		if (type == null)
			throw new NoSuchElementException(name);

		// Wrap the pair
		return entity(immutableEntry(name, type));
	}

	@Override
	public Relationship getRelationship(String left, String relationship, String right) {
		if (!kb.getRelationships().contains(left, right, relationship))
			throw new NoSuchElementException(left + ", " + relationship + ", " + right);

		return relationship(immutableCell(left, right, relationship));
	}

	@Override
	public Iterable<? extends RelationshipType> getRelationshipTypes(String name) {
		// Lookup relationship type multimap by name and wrap the triples
		return from(kb.getRelationshipTypes().whereValue(name)).transform(x -> relationshipType(x));
	}

	@Override
	public Iterable<? extends EntityType> getEntityTypes() {
		// Get all newly defined entity types after the Entity type
		return concat(singleton(getTheEntityType()), from(kb.getEntityTypes().entrySet()).transform(this::entityType));
	}

	@Override
	public Iterable<? extends RelationshipType> getRelationshipTypes() {
		// Transform all entries of the relationship types in the KB
		return from(kb.getRelationshipTypes().cells()).transform(x -> relationshipType(x));
	}

	@Override
	public Iterable<? extends Entity> getEntities() {
		// Transform all entries of the entities in the KB
		return from(kb.getEntities().entrySet()).transform(x -> entity(x));
	}

	@Override
	public Iterable<? extends Relationship> getRelationships() {
		// Transform all entries of the relationships in the KB
		return from(kb.getRelationships().cells()).transform(x -> relationship(x));
	}

}
