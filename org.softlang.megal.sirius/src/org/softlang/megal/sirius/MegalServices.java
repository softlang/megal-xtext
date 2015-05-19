package org.softlang.megal.sirius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.xtend.lib.macro.declaration.Declaration;
import org.softlang.megal.MegalAnnotation;
import org.softlang.megal.MegalDeclaration;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalEntityType;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalFunctionApplication;
import org.softlang.megal.MegalRelationship;
import org.softlang.megal.MegalRelationshipType;
import org.softlang.megal.mi2.RelationshipType;

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

public class MegalServices {

	public final static MegalServices INSTANCE = new MegalServices();

	private static final String COLOR = "Color";

	private static final Integer COLOR_RED_DEFAULT = 255;
	private static final Integer COLOR_GREEN_DEFAULT = 255;
	private static final Integer COLOR_BLUE_DEFAULT = 255;

	/**
	 * Returns all files imported in this megal file inclusive this file.
	 */
	public Set<MegalFile> megalFiles(MegalFile node) {
		Set<MegalFile> nodes = new HashSet<>();
		nodes.add(node);

		for (MegalFile importedMegalFile : node.getImports())
			nodes.addAll(megalFiles(importedMegalFile));

		return nodes;
	}

	/**
	 * Returns all files imported in this megal file exclusive this file.
	 */
	public Set<MegalFile> megalFilesImported(MegalFile node) {
		Set<MegalFile> nodes = megalFiles(node);
		nodes.remove(node);
		return nodes;
	}

	public <T extends MegalDeclaration> Set<T> declarations(MegalFile node, Class<T> cls) {
		Set<T> declarations = new HashSet<>();

		for (MegalFile megalFile : megalFiles(node))
			declarations.addAll(FluentIterable.from(megalFile.getDeclarations()).filter(cls).toSet());

		return declarations;
	}

	public <T extends MegalDeclaration> Set<T> declarationsLocal(MegalFile node, Class<T> cls) {
		return FluentIterable.from(node.getDeclarations()).filter(cls).toSet();
	}

	public <T extends MegalDeclaration> Set<T> declarationsImport(MegalFile node, Class<T> cls) {
		Set<T> declarations = new HashSet<>();

		for (MegalFile megalFile : megalFilesImported(node))
			declarations.addAll(FluentIterable.from(megalFile.getDeclarations()).filter(cls).toSet());

		return declarations;
	}

	public MegalFile megalFile(MegalDeclaration declaration) {
		return (MegalFile) declaration.eContainer();
	}

	public Set<MegalEntity> entities(MegalFile node) {
		return declarations(node, MegalEntity.class);
	}

	public Set<MegalEntity> entitiesLocal(MegalFile node) {
		return declarationsLocal(node, MegalEntity.class);
	}

	public Set<MegalEntity> entitiesImport(MegalFile node) {
		return declarationsImport(node, MegalEntity.class);
	}

	public Set<MegalEntityType> entityTypes(MegalFile node) {
		return declarations(node, MegalEntityType.class);
	}

	public Set<MegalEntityType> entityTypesLocal(MegalFile node) {
		return declarationsLocal(node, MegalEntityType.class);
	}

	public Set<MegalEntityType> entityTypesImport(MegalFile node) {
		return declarationsImport(node, MegalEntityType.class);
	}

	public Set<MegalRelationship> relations(MegalFile node) {
		return declarations(node, MegalRelationship.class);
	}

	public Set<MegalRelationship> relationsLocal(MegalFile node) {
		return declarationsLocal(node, MegalRelationship.class);
	}

	public Set<MegalRelationship> relationsImport(MegalFile node) {
		return declarationsImport(node, MegalRelationship.class);
	}

	public Set<MegalRelationshipType> relationshipTypes(MegalFile node) {
		return declarations(node, MegalRelationshipType.class);
	}

	public Set<MegalRelationshipType> relationshipTypesLocal(MegalFile node) {
		return declarationsLocal(node, MegalRelationshipType.class);
	}

	public Set<MegalRelationshipType> relationshipTypesImport(MegalFile node) {
		return declarationsImport(node, MegalRelationshipType.class);
	}

	public Set<MegalFunctionApplication> functionApplications(MegalFile node) {
		return declarations(node, MegalFunctionApplication.class);
	}

	public Set<MegalFunctionApplication> functionApplicationsLocal(MegalFile node) {
		return declarationsLocal(node, MegalFunctionApplication.class);
	}

	public Set<MegalFunctionApplication> functionApplicationsImport(MegalFile node) {
		return declarationsImport(node, MegalFunctionApplication.class);
	}

	/**
	 * Returns the first Relationionships in this megal file that connects this
	 * type nodes.
	 * 
	 * @param node
	 * @return
	 */
	public Set<MegalRelationshipType> firstRelationshipTypesLocal(MegalFile node) {
		Set<MegalRelationshipType> firsts = new HashSet<>();

		for (MegalRelationshipType current : relationshipTypesLocal(node)) {
			boolean contains = false;
			for (MegalRelationshipType first : firsts)
				if (first.getTypeLeft() == current.getTypeLeft() && first.getTypeRight() == current.getTypeRight()) {
					contains = true;
					break;
				}
			if (!contains)
				firsts.add(current);
		}
		return firsts;
	}

	public Set<MegalRelationshipType> merged(MegalRelationshipType relationshipType) {
		Set<MegalRelationshipType> merged = new HashSet<>();
		for (MegalRelationshipType current : relationshipTypesLocal(megalFile(relationshipType)))
			if (relationshipType.getTypeLeft() == current.getTypeLeft()
					&& relationshipType.getTypeRight() == current.getTypeRight())
				merged.add(current);

		return merged;
	}

	public String lable(MegalEntity entity) {

		String name = entity.getName();

		// Add type to entity name
		if (entity.getType() != null && entity.getType() != null)
			name = name + ":" + entity.getType().getName();

		if (entity.isTypeMany()) {
			name = name + "+";
		}

		return name;
	}

	public String lable(MegalRelationship relationship) {

		MegalRelationshipType type = relationship.getType();

		if (type == null)
			return "UNDEFINED";

		return type.getName();
	}

	public String lable(MegalFunctionApplication functionApplication) {

		MegalEntity entity = functionApplication.getFunction();

		if (entity == null)
			return "UNDEFINED";

		return entity.getName();
	}

	public String lable(MegalEntityType entitiyType) {
		return entitiyType.getName();
	}

	public String lable(MegalRelationshipType relationshipType) {
		return Joiner.on("/").join(FluentIterable.from(merged(relationshipType)).transform(x -> x.getName()));
	}

	public Boolean isEntity(MegalEntityType entitiyType) {
		return "Entity".equals(entitiyType.getName());
	}

	/**
	 * Associated elements serve as source for the graphical mapping. Changes
	 * update on associated elements lead to update of mapping.
	 *
	 * @param entity
	 * @return
	 */
	public Collection<EObject> associatedElements(MegalEntity entity) {
		Collection<EObject> associated = new ArrayList<>();

		associated.add(entity);
		associated.add(entity.getType());

		return associated;
	}

	public Collection<EObject> associatedElements(MegalRelationship relationship) {
		Collection<EObject> associated = new ArrayList<>();

		associated.add(relationship);
		associated.add(relationship.getType());
		associated.add(relationship.getLeft().getType());
		associated.add(relationship.getLeft());
		associated.add(relationship.getRight().getType());

		return associated;
	}

	public String error(MegalDeclaration declaration) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(declaration);
		if (diagnostic.getSeverity() == Diagnostic.ERROR) {
			return diagnostic.getMessage();
		}
		return null;
	}

	public String warning(MegalDeclaration declaration) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(declaration);
		if (diagnostic.getSeverity() == Diagnostic.WARNING) {
			return diagnostic.getMessage();
		}
		return null;
	}

	public MegalEntity resolveEntity(MegalFile node, String name) {
		return entities(node).stream().filter(x -> name.equals(x.getName())).findFirst().orElse(null);
	}

	public MegalEntityType resolveEntityType(MegalFile node, String name) {
		return entityTypes(node).stream().filter(x -> name.equals(x.getName())).findFirst().orElse(null);
	}

	public MegalRelationshipType resolveRelationshipType(MegalFile node, String name) {
		return relationshipTypes(node).stream().filter(x -> name.equals(x.getName())).findFirst().orElse(null);
	}

	public String unusedEntityName(MegalFile megamodel) {

		int number = 1;
		while (true) {
			String name = "Entity" + String.valueOf(number);

			MegalEntity resolved = resolveEntity(megamodel, name);

			if (resolved == null)
				return name;

			number++;
		}
	}

	public String unusedEntityTypeName(MegalFile megamodel) {

		int number = 1;
		while (true) {
			String name = "EntityType" + String.valueOf(number);

			MegalEntityType resolved = resolveEntityType(megamodel, name);

			if (resolved == null)
				return name;

			number++;
		}
	}

	public String unusedRelationshipTypeName(MegalFile megamodel) {

		int number = 1;
		while (true) {
			String name = "RelationshipType" + String.valueOf(number);

			MegalRelationshipType resolved = resolveRelationshipType(megamodel, name);

			if (resolved == null)
				return name;

			number++;
		}
	}

	public EObject megalFileOverView(MegalDeclaration declaration, DNode dnode) {
		return ((DSemanticDecorator) dnode.eContainer()).getTarget();
	}

	public EObject megalFileOverView(MegalDeclaration declaration, DEdge dedge) {
		return ((DSemanticDecorator) dedge.eContainer()).getTarget();
	}

	public MegalAnnotation getAnnotation(MegalDeclaration entity, String name) {
		return entity.getAnnotations().stream().filter(x -> name.equals(x.getKey())).findAny().orElse(null);
	}

	private Integer get(MegalDeclaration declaration, int position) {

		MegalAnnotation annotation = getAnnotation(declaration, COLOR);

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

	public Integer red(MegalEntity entity) {

		Integer color = get(entity, 0);

		if (color == null && entity.getType() != null)
			color = get(entity.getType(), 0);

		if (color == null)
			color = COLOR_RED_DEFAULT;

		return color;
	}

	public int green(MegalEntity entity) {
		Integer color = get(entity, 1);

		if (color == null && entity.getType() != null)
			color = get(entity.getType(), 1);

		if (color == null)
			color = COLOR_GREEN_DEFAULT;

		return color;
	}

	public int blue(MegalEntity entity) {
		Integer color = get(entity, 2);

		if (color == null && entity.getType() != null)
			color = get(entity.getType(), 2);

		if (color == null)
			color = COLOR_BLUE_DEFAULT;

		return color;
	}

	public Integer red(MegalEntityType entityType) {

		Integer color = get(entityType, 0);

		if (color == null)
			color = COLOR_RED_DEFAULT;

		return color;
	}

	public int green(MegalEntityType entityType) {
		Integer color = get(entityType, 1);

		if (color == null)
			color = COLOR_GREEN_DEFAULT;

		return color;
	}

	public int blue(MegalEntityType entityType) {
		Integer color = get(entityType, 2);

		if (color == null)
			color = COLOR_BLUE_DEFAULT;

		return color;
	}

	public boolean canRemove(MegalEntity entity) {
		for (MegalRelationship relationship : relationsLocal(megalFile(entity)))
			if (relationship.getLeft().equals(entity) || relationship.getRight().equals(entity))
				return false;

		for (MegalFunctionApplication functionApplication : functionApplicationsLocal((megalFile(entity))))
			if (functionApplication.getFunction().equals(entity))
				return false;

		return true;
	}

	public boolean canRemove(MegalEntityType entityType) {
		for (MegalRelationshipType relationshipType : relationshipTypes(megalFile(entityType)))
			if (relationshipType.getTypeLeft().equals(entityType) || relationshipType.getTypeRight().equals(entityType))
				return false;

		return true;
	}

	public int getLineRed(MegalDeclaration declaration) {
		if (error(declaration) != null)
			return 255;

		if (warning(declaration) != null)
			return 255;

		return 0;
	}

	public int getLineGreen(MegalDeclaration declaration) {
		if (warning(declaration) != null)
			return 255;

		return 0;
	}

	public int getLineBlue(MegalDeclaration declaration) {
		return 0;
	}

}
