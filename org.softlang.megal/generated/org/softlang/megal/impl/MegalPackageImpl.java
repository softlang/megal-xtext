/**
 */
package org.softlang.megal.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.softlang.megal.Annotation;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.Link;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Megamodel;
import org.softlang.megal.NamedDeclaration;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalPackageImpl extends EPackageImpl implements MegalPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eSetEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.softlang.megal.MegalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MegalPackageImpl()
	{
		super(eNS_URI, MegalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MegalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MegalPackage init()
	{
		if (isInited) return (MegalPackage)EPackage.Registry.INSTANCE.getEPackage(MegalPackage.eNS_URI);

		// Obtain or create and register package
		MegalPackageImpl theMegalPackage = (MegalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MegalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MegalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMegalPackage.createPackageContents();

		// Initialize created meta-data
		theMegalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMegalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MegalPackage.eNS_URI, theMegalPackage);
		return theMegalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegamodel()
	{
		return megamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegamodel_Declarations()
	{
		return (EReference)megamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegamodel_Bindings()
	{
		return (EReference)megamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegamodel_Name()
	{
		return (EAttribute)megamodelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegamodel_Imports()
	{
		return (EReference)megamodelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMegamodel__GetVisibleDeclarations()
	{
		return megamodelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMegamodel__GetVisibleBindings()
	{
		return megamodelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMegamodel__AlternativeEntityTypes__Entity()
	{
		return megamodelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMegamodel__ApplicableRelationshipTypes__Entity_Entity()
	{
		return megamodelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMegamodel__FetchInfos__Element()
	{
		return megamodelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement()
	{
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Info()
	{
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetMegamodel()
	{
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__IsAssigned()
	{
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration()
	{
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedDeclaration()
	{
		return namedDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedDeclaration_Name()
	{
		return (EAttribute)namedDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedDeclaration__GetShowName()
	{
		return namedDeclarationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityType()
	{
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Supertype()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType()
	{
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_Left()
	{
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_Right()
	{
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelationshipType__GetInstances()
	{
		return relationshipTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity()
	{
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Type()
	{
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Dependent()
	{
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Parameter()
	{
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__GetLinks()
	{
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__FollowOutgoing__RelationshipType()
	{
		return entityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__FollowIncoming__RelationshipType()
	{
		return entityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship()
	{
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Type()
	{
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Left()
	{
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Right()
	{
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink()
	{
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Link()
	{
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_To()
	{
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeReference()
	{
		return entityTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityTypeReference_Many()
	{
		return (EAttribute)entityTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeReference_Definition()
	{
		return (EReference)entityTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeReference_Parameters()
	{
		return (EReference)entityTypeReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityTypeReference__IsAssignableFrom__EntityTypeReference()
	{
		return entityTypeReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityTypeReference__IsAssignableFrom__EntityType_boolean()
	{
		return entityTypeReferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation()
	{
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Key()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Value()
	{
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionApplication()
	{
		return functionApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionApplication_Function()
	{
		return (EReference)functionApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionApplication_Input()
	{
		return (EReference)functionApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionApplication_Output()
	{
		return (EReference)functionApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI()
	{
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getESet()
	{
		return eSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalFactory getMegalFactory()
	{
		return (MegalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		megamodelEClass = createEClass(MEGAMODEL);
		createEReference(megamodelEClass, MEGAMODEL__DECLARATIONS);
		createEReference(megamodelEClass, MEGAMODEL__BINDINGS);
		createEAttribute(megamodelEClass, MEGAMODEL__NAME);
		createEReference(megamodelEClass, MEGAMODEL__IMPORTS);
		createEOperation(megamodelEClass, MEGAMODEL___GET_VISIBLE_DECLARATIONS);
		createEOperation(megamodelEClass, MEGAMODEL___GET_VISIBLE_BINDINGS);
		createEOperation(megamodelEClass, MEGAMODEL___ALTERNATIVE_ENTITY_TYPES__ENTITY);
		createEOperation(megamodelEClass, MEGAMODEL___APPLICABLE_RELATIONSHIP_TYPES__ENTITY_ENTITY);
		createEOperation(megamodelEClass, MEGAMODEL___FETCH_INFOS__ELEMENT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__INFO);
		createEOperation(elementEClass, ELEMENT___GET_MEGAMODEL);
		createEOperation(elementEClass, ELEMENT___IS_ASSIGNED);

		declarationEClass = createEClass(DECLARATION);

		namedDeclarationEClass = createEClass(NAMED_DECLARATION);
		createEAttribute(namedDeclarationEClass, NAMED_DECLARATION__NAME);
		createEOperation(namedDeclarationEClass, NAMED_DECLARATION___GET_SHOW_NAME);

		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__SUPERTYPE);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__LEFT);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__RIGHT);
		createEOperation(relationshipTypeEClass, RELATIONSHIP_TYPE___GET_INSTANCES);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__TYPE);
		createEAttribute(entityEClass, ENTITY__DEPENDENT);
		createEAttribute(entityEClass, ENTITY__PARAMETER);
		createEOperation(entityEClass, ENTITY___GET_LINKS);
		createEOperation(entityEClass, ENTITY___FOLLOW_OUTGOING__RELATIONSHIPTYPE);
		createEOperation(entityEClass, ENTITY___FOLLOW_INCOMING__RELATIONSHIPTYPE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__TYPE);
		createEReference(relationshipEClass, RELATIONSHIP__LEFT);
		createEReference(relationshipEClass, RELATIONSHIP__RIGHT);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__LINK);
		createEAttribute(linkEClass, LINK__TO);

		entityTypeReferenceEClass = createEClass(ENTITY_TYPE_REFERENCE);
		createEAttribute(entityTypeReferenceEClass, ENTITY_TYPE_REFERENCE__MANY);
		createEReference(entityTypeReferenceEClass, ENTITY_TYPE_REFERENCE__DEFINITION);
		createEReference(entityTypeReferenceEClass, ENTITY_TYPE_REFERENCE__PARAMETERS);
		createEOperation(entityTypeReferenceEClass, ENTITY_TYPE_REFERENCE___IS_ASSIGNABLE_FROM__ENTITYTYPEREFERENCE);
		createEOperation(entityTypeReferenceEClass, ENTITY_TYPE_REFERENCE___IS_ASSIGNABLE_FROM__ENTITYTYPE_BOOLEAN);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__KEY);
		createEAttribute(annotationEClass, ANNOTATION__VALUE);

		functionApplicationEClass = createEClass(FUNCTION_APPLICATION);
		createEReference(functionApplicationEClass, FUNCTION_APPLICATION__FUNCTION);
		createEReference(functionApplicationEClass, FUNCTION_APPLICATION__INPUT);
		createEReference(functionApplicationEClass, FUNCTION_APPLICATION__OUTPUT);

		// Create data types
		uriEDataType = createEDataType(URI);
		eSetEDataType = createEDataType(ESET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(eSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		megamodelEClass.getESuperTypes().add(this.getElement());
		declarationEClass.getESuperTypes().add(this.getElement());
		namedDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		entityTypeEClass.getESuperTypes().add(this.getNamedDeclaration());
		relationshipTypeEClass.getESuperTypes().add(this.getNamedDeclaration());
		entityEClass.getESuperTypes().add(this.getNamedDeclaration());
		relationshipEClass.getESuperTypes().add(this.getDeclaration());
		linkEClass.getESuperTypes().add(this.getElement());
		functionApplicationEClass.getESuperTypes().add(this.getDeclaration());

		// Initialize classes, features, and operations; add parameters
		initEClass(megamodelEClass, Megamodel.class, "Megamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegamodel_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Megamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegamodel_Bindings(), this.getLink(), null, "bindings", null, 0, -1, Megamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegamodel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Megamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegamodel_Imports(), this.getMegamodel(), null, "imports", null, 0, -1, Megamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMegamodel__GetVisibleDeclarations(), null, "getVisibleDeclarations", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getESet());
		EGenericType g2 = createEGenericType(this.getDeclaration());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getMegamodel__GetVisibleBindings(), null, "getVisibleBindings", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getESet());
		g2 = createEGenericType(this.getLink());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getMegamodel__AlternativeEntityTypes__Entity(), this.getEntityType(), "alternativeEntityTypes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntity(), "entity", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMegamodel__ApplicableRelationshipTypes__Entity_Entity(), this.getRelationshipType(), "applicableRelationshipTypes", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntity(), "left", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntity(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMegamodel__FetchInfos__Element(), this.getAnnotation(), "fetchInfos", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Info(), this.getAnnotation(), null, "info", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElement__GetMegamodel(), this.getMegamodel(), "getMegamodel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__IsAssigned(), ecorePackage.getEBoolean(), "isAssigned", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedDeclarationEClass, NamedDeclaration.class, "NamedDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNamedDeclaration__GetShowName(), ecorePackage.getEString(), "getShowName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_Supertype(), this.getEntityTypeReference(), null, "supertype", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_Left(), this.getEntityTypeReference(), null, "left", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Right(), this.getEntityTypeReference(), null, "right", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRelationshipType__GetInstances(), null, "getInstances", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getESet());
		g2 = createEGenericType(this.getRelationshipType());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Type(), this.getEntityTypeReference(), null, "type", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Dependent(), ecorePackage.getEBoolean(), "dependent", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Parameter(), ecorePackage.getEBoolean(), "parameter", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntity__GetLinks(), null, "getLinks", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getESet());
		g2 = createEGenericType(this.getLink());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEntity__FollowOutgoing__RelationshipType(), null, "followOutgoing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelationshipType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getESet());
		g2 = createEGenericType(this.getEntity());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEntity__FollowIncoming__RelationshipType(), null, "followIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelationshipType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getESet());
		g2 = createEGenericType(this.getEntity());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Type(), this.getRelationshipType(), null, "type", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Left(), this.getEntity(), null, "left", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Right(), this.getEntity(), null, "right", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Link(), this.getEntity(), null, "link", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_To(), this.getURI(), "to", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityTypeReferenceEClass, EntityTypeReference.class, "EntityTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityTypeReference_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, EntityTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityTypeReference_Definition(), this.getEntityType(), null, "definition", null, 0, 1, EntityTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityTypeReference_Parameters(), this.getEntity(), null, "parameters", null, 0, -1, EntityTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntityTypeReference__IsAssignableFrom__EntityTypeReference(), ecorePackage.getEBoolean(), "isAssignableFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntityTypeReference(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntityTypeReference__IsAssignableFrom__EntityType_boolean(), ecorePackage.getEBoolean(), "isAssignableFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEntityType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isMany", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Key(), ecorePackage.getEString(), "key", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionApplicationEClass, FunctionApplication.class, "FunctionApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionApplication_Function(), this.getEntity(), null, "function", null, 0, 1, FunctionApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionApplication_Input(), this.getEntity(), null, "input", null, 0, 1, FunctionApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionApplication_Output(), this.getEntity(), null, "output", null, 0, 1, FunctionApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uriEDataType, org.softlang.megal.api.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eSetEDataType, Set.class, "ESet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MegalPackageImpl
