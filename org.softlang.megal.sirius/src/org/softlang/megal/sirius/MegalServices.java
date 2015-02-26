package org.softlang.megal.sirius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;

import com.google.common.collect.FluentIterable;

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

	public String getUnusedRelationshipTypeName(Megamodel megamodel) {

		int number = 1;
		while (true) {
			String name = "RelationshipType" + String.valueOf(number);

			RelationshipType resolved = resolveRelationshipType(megamodel, name);

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

	public String getLable(Relationship relationship) {

		RelationshipType type = relationship.getType();

		if (type == null)
			return "UNDEFINED";

		return type.getName();
	}

	public String getLable(EntityType entityType) {
		return entityType.getName();
	}

	public List<Entity> getEntities(Megamodel megamodel) {
		return FluentIterable.from(megamodel.allModels())
				.transformAndConcat(x -> x.getDeclarations()).filter(Entity.class).toList();
	}

	public List<Entity> getLocalEntities(Megamodel megamodel) {
		return FluentIterable.from(megamodel.getDeclarations()).filter(Entity.class).toList();
	}

	public List<Entity> getImportedEntities(Megamodel megamodel) {
		return FluentIterable.from(megamodel.allImports())
				.transformAndConcat(x -> x.getDeclarations()).filter(Entity.class).toList();
	}

	public List<EntityType> getEntityTypes(Megamodel megamodel) {
		return FluentIterable.from(megamodel.allModels())
				.transformAndConcat(x -> x.getDeclarations()).filter(EntityType.class).toList();
	}

	public List<EntityType> getLocalEntityTypes(Megamodel megamodel) {
		return FluentIterable.from(megamodel.getDeclarations()).filter(EntityType.class).toList();
	}

	public List<EntityType> getImportedEntityTypes(Megamodel megamodel) {
		return FluentIterable.from(megamodel.allImports())
				.transformAndConcat(x -> x.getDeclarations()).filter(EntityType.class).toList();
	}

	public List<RelationshipType> getRelationshipTypes(Megamodel megamodel) {
		return FluentIterable.from(megamodel.allModels())
				.transformAndConcat(x -> x.getDeclarations()).filter(RelationshipType.class)
				.toList();
	}

	public List<RelationshipType> getImportedRelationshipTypes(Megamodel megamodel) {
		return FluentIterable.from(megamodel.allImports())
				.transformAndConcat(x -> x.getDeclarations()).filter(RelationshipType.class)
				.toList();
	}

	public List<RelationshipType> getLocalRelationshipTypes(Megamodel megamodel) {
		return FluentIterable.from(megamodel.getDeclarations()).filter(RelationshipType.class)
				.toList();
	}

	public EntityType resolveEntityType(Megamodel megamodel, String name) {
		return getEntityTypes(megamodel).stream().filter(x -> name.equals(x.getName())).findFirst()
				.orElse(null);
	}

	public Entity resolveEntity(Megamodel megamodel, String name) {
		return getEntities(megamodel).stream().filter(x -> name.equals(x.getName())).findFirst()
				.orElse(null);
	}

	public RelationshipType resolveRelationshipType(Megamodel megamodel, String name) {

		return getRelationshipTypes(megamodel).stream().filter(x -> name.equals(x.getName()))
				.findAny().orElse(null);
	}

	public Annotation getAnnotation(Declaration entity, String name) {
		Optional<Annotation> color = entity.getAnnotations().stream()
				.filter(x -> name.equals(x.getKey())).findAny();
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
	
	public boolean canRemove(EntityType entityType) {
		for (Declaration declaration : getMegamodel(entityType).getDeclarations()) {
			if (declaration instanceof RelationshipType) {
				RelationshipType relationshipType = (RelationshipType) declaration;
				if (relationshipType.getLeft().getDefinition().equals(entityType) || relationshipType.getRight().getDefinition().equals(entityType))
					return false;
			}
		}

		return true;
	}

	public int getLineRed(Declaration declaration) {
		if (error(declaration) != null)
			return 255;

		if (warning(declaration) != null)
			return 255;

		return 0;
	}

	public int getLineGreen(Declaration declaration) {
		if (warning(declaration) != null)
			return 255;

		return 0;
	}

	public int getLineBlue(Declaration declaration) {
		return 0;
	}

	public String error(Declaration declaration) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(declaration);
		if (diagnostic.getSeverity() == Diagnostic.ERROR) {
			return diagnostic.getMessage();
		}
		return null;
	}

	public String warning(Declaration declaration) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(declaration);
		if (diagnostic.getSeverity() == Diagnostic.WARNING) {
			return diagnostic.getMessage();
		}
		return null;
	}

	/**
	 * Associated elements serve as source for the graphical mapping. Changes
	 * update on associated elements lead to update of mapping.
	 * 
	 * @param entity
	 * @return
	 */
	public Collection<EObject> associatedElements(Entity entity) {
		Collection<EObject> associated = new ArrayList<>();

		associated.add(entity);
		associated.add(entity.getType().getDefinition());

		return associated;
	}

	public Collection<EObject> associatedElements(Relationship relationship) {
		Collection<EObject> associated = new ArrayList<>();

		associated.add(relationship);
		associated.add(relationship.getType());
		associated.add(relationship.getLeft().getType());
		associated.add(relationship.getLeft());
		associated.add(relationship.getRight().getType());

		return associated;
	}

	public EObject getMegamodelOverView(Declaration declaration, DNode dnode) {
		return ((DSemanticDecorator)dnode.eContainer()).getTarget();
	}
	
}
