package org.softlang.megal.mi2;

import static com.google.common.collect.Maps.immutableEntry;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Tables.immutableCell;

import java.util.Map;
import java.util.Map.Entry;

import org.softlang.megal.Annotations;
import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.FunctionTypeReference;
import org.softlang.megal.Link;
import org.softlang.megal.Links;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.TypeReference;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * <p>
 * Wrapper for megamodels in MegaL notation.
 * </p>
 * 
 * @author Pazuzu
 *
 */
public class MegamodelKB implements KB {

	private static final String ELEMENT_OF = "elementOf";

	private static final String INPUT_OF = "inputOf";

	private static final String OUTPUT_OF = "outputOf";

	private static final String FUNCTION_APPLICATION = "FunctionApplication";

	private static String applicationName(FunctionApplication a) {
		return a.getFunction().getName() + "(" + a.getInput().getName() + ")|->" + a.getOutput().getName();
	}

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Megamodel megamodel;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final String title;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Multimap<String, String> annotations;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Map<String, Ref> entityTypes;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Multimap<String, Entry<Ref, Ref>> relationshipTypes;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Map<String, Ref> entities;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final SetMultimap<String, String> bindings;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Table<String, String, String> relationships;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Multimap<Entry<String, Ref>, Entry<String, String>> entityTypeAnnotations;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> relationshipTypeAnnotations;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Multimap<Entry<String, Ref>, Entry<String, String>> entityAnnotations;

	/**
	 * <p>
	 * Internal backing field.
	 * </p>
	 */
	private final Multimap<Cell<String, String, String>, Entry<String, String>> relationshipAnnotations;

	/**
	 * <p>
	 * Initialized and analyzes the given megamodel.
	 * </p>
	 * 
	 * @param megamodel
	 *            The given megamodel
	 */
	public MegamodelKB(Megamodel megamodel) {
		this.megamodel = megamodel;

		// Create database
		title = megamodel.getName();
		annotations = Annotations.getAnnotationMap(megamodel);
		entityTypes = newHashMap();
		relationshipTypes = HashMultimap.create();
		entities = newHashMap();
		bindings = HashMultimap.create();
		relationships = HashBasedTable.create();
		entityTypeAnnotations = HashMultimap.create();
		relationshipTypeAnnotations = HashMultimap.create();
		entityAnnotations = HashMultimap.create();
		relationshipAnnotations = HashMultimap.create();

		// Initialize database
		for (Megamodel model : megamodel.allModels())
			for (Declaration declaration : model.getDeclarations()) {
				if (declaration instanceof EntityType) {
					EntityType entityType = (EntityType) declaration;

					// Translate the entity type
					String name = entityType.getName();
					Ref ref = translate(entityType.getSupertype());

					// Put the data
					entityTypes.put(name, ref);

					// Put the annotations
					entityTypeAnnotations.putAll(immutableEntry(name, ref), Annotations.getAnnotationMap(entityType)
							.entries());

				} else if (declaration instanceof RelationshipType) {
					RelationshipType relationshipType = (RelationshipType) declaration;

					// Translate the relationship type
					String name = relationshipType.getName();
					Ref left = translate(relationshipType.getLeft());
					Ref right = translate(relationshipType.getRight());

					// Put the data
					relationshipTypes.put(name, immutableEntry(left, right));

					// Put the annotations
					relationshipTypeAnnotations.putAll(immutableEntry(name, immutableEntry(left, right)), Annotations
							.getAnnotationMap(relationshipType).entries());

				} else if (declaration instanceof Entity) {
					Entity entity = (Entity) declaration;

					// Translate the entity
					String name = entity.getName();
					Ref ref = translate(entity.getType());

					// Put the data
					entities.put(name, ref);

					// Put the bindings
					for (Link link : Links.allBindings(megamodel, entity))
						bindings.put(name, link.getTo());

					// Put the annotations
					entityAnnotations.putAll(immutableEntry(name, ref), Annotations.getAnnotationMap(entity).entries());

				} else if (declaration instanceof Relationship) {
					Relationship relationship = (Relationship) declaration;

					// Translate the relationship
					String name = relationship.getType().getName();
					String left = relationship.getLeft().getName();
					String right = relationship.getRight().getName();

					// Put the data
					relationships.put(left, right, name);

					// Put the annotations
					relationshipAnnotations.putAll(immutableCell(left, right, name),
							Annotations.getAnnotationMap(relationship).entries());
				} else if (declaration instanceof FunctionApplication) {
					FunctionApplication functionApplication = (FunctionApplication) declaration;

					// Translate the function application
					String function = functionApplication.getFunction().getName();
					String input = functionApplication.getInput().getName();
					String output = functionApplication.getOutput().getName();

					String appname = applicationName(functionApplication);
					Ref apptype = Ref.ref(FUNCTION_APPLICATION, false);

					// Put the application entity
					entities.put(appname, apptype);

					// Put all relationships
					relationships.put(appname, function, ELEMENT_OF);
					relationships.put(input, appname, INPUT_OF);
					relationships.put(output, appname, OUTPUT_OF);

					// Put the bindings
					for (Link link : Links.allBindings(megamodel, functionApplication.getFunction(),
							functionApplication.getInput(), functionApplication.getOutput()))
						bindings.put(appname, link.getTo());

					// Put the annotations
					entityAnnotations.putAll(immutableEntry(appname, apptype),
							Annotations.getAnnotationMap(functionApplication).entries());
				}
			}
	}

	/**
	 * <p>
	 * Translates a type reference in MegaL notation into a simple reference.
	 * </p>
	 * 
	 * @param typeReference
	 *            The reference to translate
	 * @return Returns a reference
	 */
	private static Ref translate(TypeReference typeReference) {
		// If type reference is null, reference is to the entity supertype,
		// which itself is the entity type
		if (typeReference == null)
			return Ref.ref(ENTITY, false);

		if (typeReference instanceof EntityTypeReference) {
			// If type reference is basic, carry it's many value
			EntityTypeReference entityTypeReference = (EntityTypeReference) typeReference;

			return Ref.ref(typeReference.getDefinition().getName(), entityTypeReference.isMany());
		} else if (typeReference instanceof FunctionTypeReference) {
			// If type reference is a function type reference, carry it's domain
			// and codomain
			FunctionTypeReference functionTypeReference = (FunctionTypeReference) typeReference;

			String domain = functionTypeReference.getDomain().getName();
			String codomain = functionTypeReference.getCodomain().getName();

			return Ref.ref(typeReference.getDefinition().getName(), false, domain, codomain);
		} else {
			throw new UnsupportedOperationException("Cannot translate type reference, unknown type");
		}
	}

	/**
	 * <p>
	 * Gets the input megamodel in MegaL notation.
	 * </p>
	 * 
	 * @return Returns the input
	 */
	public Megamodel getMegamodel() {
		return megamodel;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Multimap<String, String> getAnnotations() {
		return annotations;
	}

	@Override
	public Map<String, Ref> getEntityTypes() {
		return entityTypes;
	}

	@Override
	public Multimap<String, Entry<Ref, Ref>> getRelationshipTypes() {
		return relationshipTypes;
	}

	@Override
	public Map<String, Ref> getEntities() {
		return entities;
	}

	@Override
	public SetMultimap<String, String> getBindings() {
		return bindings;
	}

	@Override
	public Table<String, String, String> getRelationships() {
		return relationships;
	}

	@Override
	public Multimap<Entry<String, Ref>, Entry<String, String>> getEntityTypeAnnotations() {
		return entityTypeAnnotations;
	}

	@Override
	public Multimap<Entry<String, Entry<Ref, Ref>>, Entry<String, String>> getRelationshipTypeAnnotations() {
		return relationshipTypeAnnotations;
	}

	@Override
	public Multimap<Entry<String, Ref>, Entry<String, String>> getEntityAnnotations() {
		return entityAnnotations;
	}

	@Override
	public Multimap<Cell<String, String, String>, Entry<String, String>> getRelationshipAnnotations() {
		return relationshipAnnotations;
	}

}
