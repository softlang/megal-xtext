package org.softlang.megal.browsing.dtos;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.RelationshipType;

public class MegamodelDto {

	static private <T,R> Set<R> map(Set<T> set, Function<T,R> mapper) {
		return set.stream().map(mapper).collect(Collectors.toSet());
	}
	
	static private Set<EntityDto> entityDtos(Set<Entity> entities) {
		return map(entities, EntityDto::from);
	}
	
	static private Set<EntityTypeDto> entityTypeDtos(Set<EntityType> entityTypes) {
		return map(entityTypes, EntityTypeDto::from);
	}
	
	static private Set<RelationshipTypeDto> relationshipTypeDtos(Set<RelationshipType> relationshipTypes) {
		return map(relationshipTypes, RelationshipTypeDto::from);
	}
	
	static public MegamodelDto from(KB kb) {
		return new MegamodelDto(kb);
	}
	
	private Set<EntityDto> entities;
	private Set<EntityTypeDto> entityTypes;
	private Set<RelationshipDto> relationships;;
	private Set<RelationshipTypeDto> relationshipTypes;
	
	
	private MegamodelDto(KB kb) {
		this(
				entityDtos(kb.getEntities()),
				entityTypeDtos(kb.getEntityTypes()),
				relationshipTypeDtos(kb.getRelationshipTypes())
			);
	}
	
	private MegamodelDto(Set<EntityDto> entities, Set<EntityTypeDto> entityTypes, Set<RelationshipTypeDto> relationshipTypes) {
		this.entities = entities;
		this.entityTypes = entityTypes;
		this.relationshipTypes = relationshipTypes;
	}

	protected Set<EntityDto> getEntities() {
		return entities;
	}

	protected void setEntities(Set<EntityDto> entities) {
		this.entities = entities;
	}

	protected Set<EntityTypeDto> getEntityTypes() {
		return entityTypes;
	}

	protected void setEntityTypes(Set<EntityTypeDto> entityTypes) {
		this.entityTypes = entityTypes;
	}

	protected Set<RelationshipDto> getRelationships() {
		return relationships;
	}

	protected void setRelationships(Set<RelationshipDto> relationships) {
		this.relationships = relationships;
	}

	protected Set<RelationshipTypeDto> getRelationshipTypes() {
		return relationshipTypes;
	}

	protected void setRelationshipTypes(Set<RelationshipTypeDto> relationshipTypes) {
		this.relationshipTypes = relationshipTypes;
	}

}
