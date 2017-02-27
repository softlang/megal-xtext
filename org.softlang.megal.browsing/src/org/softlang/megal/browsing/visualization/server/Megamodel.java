package org.softlang.megal.browsing.visualization.server;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.softlang.megal.browsing.dtos.EntityDto;
import org.softlang.megal.browsing.dtos.EntityTypeDto;
import org.softlang.megal.browsing.dtos.RelationshipTypeDto;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.RelationshipType;

public class Megamodel {

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
	
	static public Megamodel from(KB kb) {
		return new Megamodel(kb);
	}
	
	private Set<EntityDto> entities;
	private Set<EntityTypeDto> entityTypes;
	private Set<RelationshipTypeDto> relationshipTypes;
	
	
	private Megamodel(KB kb) {
		this(
				entityDtos(kb.getEntities()),
				entityTypeDtos(kb.getEntityTypes()),
				relationshipTypeDtos(kb.getRelationshipTypes())
			);
	}
	
	private Megamodel(Set<EntityDto> entities, Set<EntityTypeDto> entityTypes, Set<RelationshipTypeDto> relationshipTypes) {
		this.entities = entities;
		this.entityTypes = entityTypes;
		this.relationshipTypes = relationshipTypes;
	}
	
	
}
