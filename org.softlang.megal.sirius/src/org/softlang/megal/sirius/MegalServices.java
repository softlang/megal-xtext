package org.softlang.megal.sirius;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Megamodels;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;

import com.sun.xml.internal.ws.wsdl.writer.document.Definitions;

public class MegalServices {

	public final static MegalServices INSTANCE = new MegalServices();

	private static final String COLOR = "Color";

	private static final Integer COLOR_RED_DEFAULT = 255;
	private static final Integer COLOR_GREEN_DEFAULT = 255;
	private static final Integer COLOR_BLUE_DEFAULT = 255;

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

	public String getUnusedEntityTypeName(Megamodel megamodel) {

		int number = 1;
		while (true) {
			String name = "EntityType" + String.valueOf(number);

			EntityType resolved = resolveEntityType(megamodel, name);

			if (resolved == null)
				return name;

			number++;
		}
	}

	public String getUnusedRelationshipTypeName(Megamodel megamodel, EntityType from) {

		int number = 1;
		while (true) {
			String name = "RelationshipType" + String.valueOf(number);

			RelationshipType resolved = resolveRelationshipType(megamodel, name, from);

			if (resolved == null)
				return name;

			number++;
		}
	}

	public String getLable(Entity entity) {

		String name = entity.getName();

		// Add type to entity name
		if (entity.getType() != null && entity.getType().getDefinition() != null)
			name = name + ":" + entity.getType().getDefinition().getName();

		return name;
	}

	public List<Entity> getEntities(Megamodel megamodel) {
		return Megamodels.allDeclarations(megamodel).stream().filter(x -> (x instanceof Entity))
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
		return megamodel.importedDeclarations();
//		return megamodel
//				.allDeclarations()
//				.stream()
//				.filter(x -> ((x instanceof EntityType) && !megamodel.getDeclarations().contains(x)))
//				.map(x -> (EntityType) x).collect(Collectors.toList());
	}

	public List<EntityType> getEntityTypes(Megamodel megamodel) {
		return megamodel.getDeclarations().stream().filter(x -> (x instanceof EntityType))
				.map(x -> (EntityType) x).collect(Collectors.toList());
	}

	public EntityType resolveEntityType(Megamodel megamodel, String name) {
		return Megamodels.allDeclarations(megamodel).stream().filter(x -> x instanceof EntityType)
				.map(x -> (EntityType) x).filter(x -> name.equals(x.getName())).findFirst()
				.orElse(null);
	}

	public Entity resolveEntity(Megamodel megamodel, String name) {
		return Megamodels.allDeclarations(megamodel).stream().filter(x -> x instanceof Entity)
				.map(x -> (Entity) x).filter(x -> name.equals(x.getName())).findFirst()
				.orElse(null);
	}

	public RelationshipType resolveRelationshipType(Megamodel megamodel, String name,
			EntityType from) {

		return Megamodels.allDeclarations(megamodel).stream()
				.filter(x -> x instanceof RelationshipType).map(x -> (RelationshipType) x)
				.filter(x -> from.equals(x.instanceLeft().getDefinition()) && name.equals(x.getName()))
				.findFirst().orElse(null);
	}

	public Annotation getAnnotation(Declaration entity, String name) {
		Optional<Annotation> color = entity.getAnnotations().stream().filter(x -> name.equals(x.getKey()))
				.findAny();
		return color.orElse(null);
	}

	private Integer get(Declaration declaration, int position) {

		Annotation annotation = getAnnotation(declaration, COLOR);

		if (annotation == null)
			return null;

		String[] colorStrings = annotation.getValue().split(",");

		if (colorStrings.length != 3)
			return null;

		String colorString = colorStrings[position];

		try {
			Integer color = Integer.valueOf(colorString);

			return color;
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public Integer red(Entity entity) {

		Integer color = get(entity, 0);

		if (color == null)
			color = get(entity.getType().getDefinition(), 0);

		if (color == null)
			color = COLOR_RED_DEFAULT;

		return color;
	}

	public int green(Entity entity) {
		Integer color = get(entity, 1);

		if (color == null)
			color = get(entity.getType().getDefinition(), 1);

		if (color == null)
			color = COLOR_GREEN_DEFAULT;

		return color;
	}

	public int blue(Entity entity) {
		Integer color = get(entity, 2);

		if (color == null)
			color = get(entity.getType().getDefinition(), 2);

		if (color == null)
			color = COLOR_BLUE_DEFAULT;

		return color;
	}

	public Integer red(EntityType entityType) {

		Integer color = get(entityType, 0);

		if (color == null)
			color = COLOR_RED_DEFAULT;

		return color;
	}

	public int green(EntityType entityType) {
		Integer color = get(entityType, 1);

		if (color == null)
			color = COLOR_GREEN_DEFAULT;

		return color;
	}

	public int blue(EntityType entityType) {
		Integer color = get(entityType, 2);

		if (color == null)
			color = COLOR_BLUE_DEFAULT;

		return color;
	}

	public boolean canRemove(Entity entity) {
		for (Declaration declaration : getMegamodel(entity).getDeclarations()) {
			if (declaration instanceof Relationship) {
				Relationship relationship = (Relationship) declaration;
				if (relationship.getLeft().equals(entity) || relationship.getRight().equals(entity))
					return false;
			}
		}

		return true;
	}

}
