package org.softlang.megal.sirius;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;

public class MegalServices {

	public final static MegalServices INSTANCE = new MegalServices();

	public Megamodel getMegamodel(Declaration declaration) {
		return (Megamodel) declaration.eContainer();
	}

	public String getUnusedEntityName(Megamodel megamodel) {

		int number = 1;
		while (true) {
			String name = "Entity" + String.valueOf(number);

			Entity resolved = resolveEntity(megamodel, name);

			if (resolved == null)
				return name;

			number++;
		}
	}

	public Set<RelationshipType> getApplicableTypes(Relationship relationship) {
		// TODO: Call function on model class.
		return null;// relationship.
	}

	public String getLable(Entity entity) {

		String name = entity.getName();

		// Add type to entity name
		if (entity.getType() != null && entity.getType().getDefinition() != null)
			name = name + ":" + entity.getType().getDefinition().getName();

		return name;
	}

	public List<Entity> getEntities(Megamodel megamodel) {
		return megamodel.getVisibleDeclarations().stream().filter(x -> (x instanceof Entity))
				.map(x -> (Entity) x).collect(Collectors.toList());
	}

	public String getLable(Relationship relationship) {

		RelationshipType type = relationship.getType();

		if (type == null)
			return "UNDEFINED";

		return type.getName();
	}

	public String getLable(EntityType entityType) {
		return entityType.getName();
	}

	public List<Declaration> getVisibleEntityTypesWithoutContaining(Megamodel megamodel) {
		return megamodel
				.getVisibleDeclarations()
				.stream()
				.filter(x -> ((x instanceof EntityType) && !megamodel.getDeclarations().contains(x)))
				.map(x -> (EntityType) x).collect(Collectors.toList());
	}

	public List<EntityType> getEntityTypes(Megamodel megamodel) {
		return megamodel.getDeclarations().stream().filter(x -> (x instanceof EntityType))
				.map(x -> (EntityType) x).collect(Collectors.toList());
	}

	public EntityType resolveEntityType(Megamodel megamodel, String name) {
		return megamodel.getVisibleDeclarations().stream().filter(x -> x instanceof EntityType)
				.map(x -> (EntityType) x).filter(x -> name.equals(x.getName())).findFirst()
				.orElse(null);
	}

	public Entity resolveEntity(Megamodel megamodel, String name) {
		return megamodel.getVisibleDeclarations().stream().filter(x -> x instanceof Entity)
				.map(x -> (Entity) x).filter(x -> name.equals(x.getName())).findFirst()
				.orElse(null);
	}

}
