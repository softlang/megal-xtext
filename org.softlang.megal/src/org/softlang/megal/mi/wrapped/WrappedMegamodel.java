package org.softlang.megal.mi.wrapped;

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
import org.softlang.megal.mi.placeholder.ProxyEntity;
import org.softlang.megal.mi.placeholder.ProxyEntityType;
import org.softlang.megal.mi.placeholder.ProxyEntityTypeReference;
import org.softlang.megal.mi.placeholder.ProxyRelationship;
import org.softlang.megal.mi.placeholder.ProxyRelationshipType;

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
		name = Annotations.getEffectiveName(source);
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

	private MIEntityType compute(EntityType source) {
		return new ProxyEntityType() {
			@Override
			protected MIEntityType compute() {
				return new WrappedEntityType(WrappedMegamodel.this, source);
			}
		};
	}

	private MIEntityTypeReference compute(TypeReference source) {
		return new ProxyEntityTypeReference() {
			@Override
			protected MIEntityTypeReference compute() {
				return new WrappedEntityTypeReference(WrappedMegamodel.this, source);
			}
		};
	}

	private MIRelationshipType compute(RelationshipType source) {
		return new ProxyRelationshipType() {
			@Override
			protected MIRelationshipType compute() {
				return new WrappedRelationshipType(WrappedMegamodel.this, source);
			}
		};
	}

	private MIEntity compute(Entity source) {
		return new ProxyEntity() {
			@Override
			protected MIEntity compute() {
				return new WrappedEntity(WrappedMegamodel.this, source);
			}
		};
	}

	private MIRelationship compute(Relationship source) {
		return new ProxyRelationship() {
			@Override
			protected MIRelationship compute() {
				return new WrappedRelationship(WrappedMegamodel.this, source);
			}
		};
	}

	public MIEntityType wrap(EntityType source) {
		if (source == null)
			return null;

		return existingEntityTypes.computeIfAbsent(source, this::compute);
	}

	public MIEntityTypeReference wrap(TypeReference source) {
		if (source == null)
			return null;

		return compute(source);
	}

	public MIRelationshipType wrap(RelationshipType source) {
		if (source == null)
			return null;

		return existingRelationshipTypes.computeIfAbsent(source, this::compute);
	}

	public MIEntity wrap(Entity source) {
		if (source == null)
			return null;

		return existingEntities.computeIfAbsent(source, this::compute);
	}

	public MIRelationship wrap(Relationship source) {
		if (source == null)
			return null;

		return existingRelationships.computeIfAbsent(source, this::compute);
	}

	@Override
	public WrappedMegamodel getMegamodel() {
		return this;
	}

	@Override
	public String getDefinedName() {
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
