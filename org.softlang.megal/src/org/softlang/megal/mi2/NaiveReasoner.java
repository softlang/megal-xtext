package org.softlang.megal.mi2;

import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.transform;
import static com.google.common.collect.Maps.immutableEntry;
import static com.google.common.collect.Multimaps.index;
import static com.google.common.collect.Multimaps.transformValues;
import static com.google.common.collect.Tables.immutableCell;
import static java.util.Collections.emptyList;

import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import com.google.common.collect.ImmutableMultimap;
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
public class NaiveReasoner implements Reasoner {
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
	private EntityType entityType(Entry<String, Ref> from) {
		return new EntityType() {

			@Override
			public Multimap<String, String> getAnnotations() {
				return translate(kb.getEntityTypeAnnotations().get(from));
			}

			@Override
			public String getName() {
				return from.getKey();
			}

			@Override
			public EntityType getSupertype() {
				return getEntityType(from.getValue().getType());
			}

			@Override
			public boolean isSupertypeMany() {
				return from.getValue().isMany();
			}

			@Override
			public List<? extends Entity> getSupertypeParams() {
				return transform(from.getValue().getParams(), x -> getEntity(x));
			}

			@Override
			public Iterable<? extends Entity> getInstances() {
				return filter(getEntities(), x -> equals(x.getType()));
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
	private RelationshipType relationshipType(Entry<String, Entry<Ref, Ref>> from) {
		return new RelationshipType() {

			@Override
			public Multimap<String, String> getAnnotations() {
				return translate(kb.getRelationshipTypeAnnotations().get(from));
			}

			@Override
			public String getName() {
				return from.getKey();
			}

			@Override
			public EntityType getLeft() {
				return getEntityType(from.getValue().getKey().getType());
			}

			@Override
			public boolean isLeftMany() {
				return from.getValue().getKey().isMany();
			}

			@Override
			public List<? extends Entity> getLeftParams() {
				return transform(from.getValue().getKey().getParams(), x -> getEntity(x));
			}

			@Override
			public EntityType getRight() {
				return getEntityType(from.getValue().getValue().getType());
			}

			@Override
			public boolean isRightMany() {
				return from.getValue().getValue().isMany();
			}

			@Override
			public List<? extends Entity> getRightParams() {
				return transform(from.getValue().getValue().getParams(), x -> getEntity(x));
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

				return translate(kb.getEntityAnnotations().get(from));
			}

			@Override
			public String getName() {
				return from.getKey();
			}

			@Override
			public Set<String> getBindings() {
				return kb.getBindings().get(from.getKey());
			}

			@Override
			public EntityType getType() {
				return getEntityType(from.getValue().getType());
			}

			@Override
			public boolean isTypeMany() {
				return from.getValue().isMany();
			}

			@Override
			public List<? extends Entity> getTypeParams() {
				return transform(from.getValue().getParams(), x -> getEntity(x));
			}

			@Override
			public Iterable<? extends Relationship> incoming() {
				return transform(kb.getRelationships().column(from.getKey()).entrySet(),
						r -> relationship(immutableCell(r.getKey(), from.getKey(), r.getValue())));
			}

			@Override
			public Iterable<? extends Relationship> outgoing() {
				return transform(kb.getRelationships().row(from.getKey()).entrySet(),
						r -> relationship(immutableCell(from.getKey(), r.getKey(), r.getValue())));
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
				return translate(kb.getRelationshipAnnotations().get(from));
			}

			@Override
			public RelationshipType getType() {
				Ref fe = kb.getEntities().get(from.getRowKey());
				Ref te = kb.getEntities().get(from.getColumnKey());

				// TODO Inheritance substitution

				return relationshipType(immutableEntry(from.getValue(), immutableEntry(fe, te)));
			}

			@Override
			public Entity getLeft() {
				return getEntity(from.getRowKey());
			}

			@Override
			public Entity getRight() {
				return getEntity(from.getColumnKey());
			}
		};
	}

	@Override
	public String getTitle() {
		return kb.getTitle();
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return kb.getAnnotations();
	}

	@Override
	public EntityType getTheEntityType() {
		return new EntityType() {

			@Override
			public Multimap<String, String> getAnnotations() {
				return ImmutableMultimap.of();
			}

			@Override
			public String getName() {
				return KB.ENTITY;
			}

			@Override
			public boolean isSupertypeMany() {
				return false;
			}

			@Override
			public List<? extends Entity> getSupertypeParams() {
				return emptyList();
			}

			@Override
			public EntityType getSupertype() {
				return this;
			}

			@Override
			public Iterable<? extends Entity> getInstances() {
				return filter(getEntities(), x -> equals(x.getType()));
			}
		};
	}

	@Override
	public EntityType getEntityType(String name) {
		if (KB.ENTITY.equals(name))
			return getTheEntityType();

		Ref q = kb.getEntityTypes().get(name);
		if (q == null)
			throw new NoSuchElementException(name);

		return entityType(immutableEntry(name, q));
	}

	@Override
	public Entity getEntity(String name) {
		Ref q = kb.getEntities().get(name);
		if (q == null)
			throw new NoSuchElementException(name);

		return entity(immutableEntry(name, q));
	}

	@Override
	public Iterable<? extends EntityType> getEntityTypes() {
		return from(kb.getEntityTypes().entrySet()).transform(this::entityType);
	}

	@Override
	public Iterable<? extends RelationshipType> getRelationshipTypes() {
		return from(kb.getRelationshipTypes().entries()).transform(this::relationshipType);
	}

	@Override
	public Iterable<? extends Entity> getEntities() {
		return from(kb.getEntities().entrySet()).transform(this::entity);
	}

	@Override
	public Iterable<? extends Relationship> getRelationships() {
		return from(kb.getRelationships().cellSet()).transform(this::relationship);
	}
}
