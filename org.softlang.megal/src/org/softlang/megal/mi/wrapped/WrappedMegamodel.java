package org.softlang.megal.mi.wrapped;

import java.net.URI;
import java.util.Collection;
import java.util.Map;

import org.softlang.megal.Annotations;
import org.softlang.megal.Entities;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypes;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.RelationshipTypes;
import org.softlang.megal.Relationships;
import org.softlang.megal.TypeReference;
import org.softlang.megal.api.ElementMap;
import org.softlang.megal.mi.MIEntity;
import org.softlang.megal.mi.MIEntityType;
import org.softlang.megal.mi.MIEntityTypeReference;
import org.softlang.megal.mi.MIMegamodel;
import org.softlang.megal.mi.MIRelationship;
import org.softlang.megal.mi.MIRelationshipType;

import com.google.common.collect.Multimap;

public class WrappedMegamodel extends MIMegamodel {
	private final Megamodel source;
	private final String name;

	private final Multimap<String, String> annotations;

	private final Map<EntityType, MIEntityType> existingEntityTypes;

	private final Map<RelationshipType, MIRelationshipType> existingRelationshipTypes;

	private final Map<Entity, MIEntity> existingEntities;

	private final Map<Relationship, MIRelationship> existingRelationships;

	public WrappedMegamodel(Megamodel source) {
		this.source = source;

		// Get annotation based properties
		name = source.getName();
		annotations = Annotations.getAnnotationMap(source);

		existingEntityTypes = new ElementMap<>(EntityType.class);
		existingRelationshipTypes = new ElementMap<>(RelationshipType.class);
		existingEntities = new ElementMap<>(Entity.class);
		existingRelationships = new ElementMap<>(Relationship.class);

		for (EntityType entityType : EntityTypes.allEntityTypes(source))
			wrap(entityType);

		for (RelationshipType relationshipType : RelationshipTypes.allRealationshipTypes(source))
			wrap(relationshipType);

		for (Entity entity : Entities.allEntities(source))
			wrap(entity);

		for (Relationship relationship : Relationships.allRelationships(source))
			wrap(relationship);
	}

	public Megamodel getSource() {
		return source;
	}

	private MIEntityType delay(EntityType source) {
		return new MIEntityType() {
			private WrappedEntityType instance = null;

			private void initialize() {
				if (instance == null)
					instance = new WrappedEntityType(WrappedMegamodel.this, source);
			}

			@Override
			public MIEntityTypeReference getSupertype() {
				initialize();

				return instance.getSupertype();
			}

			@Override
			public String getDefinedName() {
				initialize();

				return instance.getDefinedName();
			}

			@Override
			public Multimap<String, String> getAnnotations() {
				initialize();

				return instance.getAnnotations();
			}

			@Override
			public MIMegamodel getMegamodel() {
				initialize();

				return instance.getMegamodel();
			}
		};
	}

	private MIRelationshipType delay(RelationshipType source) {
		return new MIRelationshipType() {
			private WrappedRelationshipType instance = null;

			private void initialize() {
				if (instance == null)
					instance = new WrappedRelationshipType(WrappedMegamodel.this, source);
			}

			@Override
			public MIEntityTypeReference getLeft() {
				initialize();

				return instance.getLeft();
			}

			@Override
			public MIEntityTypeReference getRight() {
				initialize();

				return instance.getRight();
			}

			@Override
			public String getDefinedName() {
				initialize();

				return instance.getDefinedName();
			}

			@Override
			public Multimap<String, String> getAnnotations() {
				initialize();

				return instance.getAnnotations();
			}

			@Override
			public MIMegamodel getMegamodel() {
				initialize();

				return instance.getMegamodel();
			}
		};
	}

	private MIEntity delay(Entity source) {
		return new MIEntity() {
			private WrappedEntity instance = null;

			private void initialize() {
				if (instance == null)
					instance = new WrappedEntity(WrappedMegamodel.this, source);
			}

			@Override
			public MIEntityTypeReference getType() {
				initialize();

				return instance.getType();
			}

			@Override
			public Collection<URI> getLinks() {
				initialize();

				return instance.getLinks();
			}

			@Override
			public Collection<? extends MIRelationship> getIncoming() {
				initialize();

				return instance.getIncoming();
			}

			@Override
			public Collection<? extends MIRelationship> getOutgoing() {
				initialize();

				return instance.getOutgoing();
			}

			@Override
			public String getDefinedName() {
				initialize();

				return instance.getDefinedName();
			}

			@Override
			public MIMegamodel getMegamodel() {
				initialize();

				return instance.getMegamodel();
			}

			@Override
			public Multimap<String, String> getAnnotations() {
				initialize();

				return instance.getAnnotations();
			}
		};
	}

	private MIRelationship delay(Relationship source) {
		return new MIRelationship() {
			private WrappedRelationship instance = null;

			private void initialize() {
				if (instance == null)
					instance = new WrappedRelationship(WrappedMegamodel.this, source);
			}

			@Override
			public MIMegamodel getMegamodel() {
				initialize();

				return instance.getMegamodel();
			}

			@Override
			public Multimap<String, String> getAnnotations() {
				initialize();

				return instance.getAnnotations();
			}

			@Override
			public MIRelationshipType getType() {
				initialize();

				return instance.getType();
			}

			@Override
			public MIEntity getRight() {
				initialize();

				return instance.getRight();
			}

			@Override
			public MIEntity getLeft() {
				initialize();

				return instance.getLeft();
			}
		};
	}

	public MIEntityType wrap(EntityType source) {
		if (source == null)
			return null;

		return existingEntityTypes.computeIfAbsent(source, this::delay);
	}

	public MIEntityTypeReference wrap(TypeReference source) {
		if (source == null)
			return null;

		return new WrappedEntityTypeReference(this, source);
	}

	public MIRelationshipType wrap(RelationshipType source) {
		if (source == null)
			return null;

		return existingRelationshipTypes.computeIfAbsent(source, this::delay);
	}

	public MIEntity wrap(Entity source) {
		if (source == null)
			return null;

		return existingEntities.computeIfAbsent(source, this::delay);
	}

	public MIRelationship wrap(Relationship source) {
		if (source == null)
			return null;

		return existingRelationships.computeIfAbsent(source, this::delay);
	}

	@Override
	public WrappedMegamodel getMegamodel() {
		return this;
	}

	@Override
	public String getTitle() {
		return name;
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return annotations;
	}

	@Override
	public Collection<MIEntityType> getEntityTypes() {
		return existingEntityTypes.values();
	}

	@Override
	public Collection<MIRelationshipType> getRelationshipTypes() {
		return existingRelationshipTypes.values();
	}

	@Override
	public Collection<MIEntity> getEntities() {
		return existingEntities.values();
	}

	@Override
	public Collection<MIRelationship> getRelationships() {
		return existingRelationships.values();
	}
}
