/**
 */
package org.softlang.megal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.softlang.megal.MegalFactory
 * @model kind="package"
 * @generated
 */
public interface MegalPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "megal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://softlang.wikidot.com/megal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegalPackage eINSTANCE = org.softlang.megal.impl.MegalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegamodelImpl <em>Megamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegamodelImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegamodel()
	 * @generated
	 */
	int MEGAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__IMPORTS = 3;

	/**
	 * The number of structural features of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Visible Declarations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___GET_VISIBLE_DECLARATIONS = 0;

	/**
	 * The operation id for the '<em>Get Visible Bindings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___GET_VISIBLE_BINDINGS = 1;

	/**
	 * The operation id for the '<em>Scope Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___SCOPE_ENTITY_TYPE__ENTITY = 2;

	/**
	 * The operation id for the '<em>Scope Relationship Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___SCOPE_RELATIONSHIP_TYPE__ENTITY_ENTITY = 3;

	/**
	 * The operation id for the '<em>Fetch Infos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL___FETCH_INFOS__ELEMENT = 4;

	/**
	 * The number of operations of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.softlang.megal.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.Element
	 * @see org.softlang.megal.impl.MegalPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__INFO = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_MEGAMODEL = 0;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___IS_ASSIGNED = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.DeclarationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__INFO = ELEMENT__INFO;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___GET_MEGAMODEL = ELEMENT___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION___IS_ASSIGNED = ELEMENT___IS_ASSIGNED;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.NamedDeclarationImpl <em>Named Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.NamedDeclarationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getNamedDeclaration()
	 * @generated
	 */
	int NAMED_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION__INFO = DECLARATION__INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION___GET_MEGAMODEL = DECLARATION___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION___IS_ASSIGNED = DECLARATION___IS_ASSIGNED;

	/**
	 * The operation id for the '<em>Get Show Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION___GET_SHOW_NAME = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.EntityTypeImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__INFO = NAMED_DECLARATION__INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = NAMED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SUPERTYPE = NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = NAMED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_MEGAMODEL = NAMED_DECLARATION___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___IS_ASSIGNED = NAMED_DECLARATION___IS_ASSIGNED;

	/**
	 * The operation id for the '<em>Get Show Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_SHOW_NAME = NAMED_DECLARATION___GET_SHOW_NAME;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = NAMED_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.RelationshipTypeImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__INFO = NAMED_DECLARATION__INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__NAME = NAMED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__LEFT = NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__RIGHT = NAMED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = NAMED_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___GET_MEGAMODEL = NAMED_DECLARATION___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___IS_ASSIGNED = NAMED_DECLARATION___IS_ASSIGNED;

	/**
	 * The operation id for the '<em>Get Show Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___GET_SHOW_NAME = NAMED_DECLARATION___GET_SHOW_NAME;

	/**
	 * The operation id for the '<em>Get Variants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___GET_VARIANTS = NAMED_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = NAMED_DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.EntityImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INFO = NAMED_DECLARATION__INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = NAMED_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DEPENDENT = NAMED_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARAMETER = NAMED_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MEGAMODEL = NAMED_DECLARATION___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___IS_ASSIGNED = NAMED_DECLARATION___IS_ASSIGNED;

	/**
	 * The operation id for the '<em>Get Show Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_SHOW_NAME = NAMED_DECLARATION___GET_SHOW_NAME;

	/**
	 * The operation id for the '<em>Get Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_LINKS = NAMED_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Follow Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___FOLLOW_OUTGOING__RELATIONSHIPTYPE = NAMED_DECLARATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Follow Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___FOLLOW_INCOMING__RELATIONSHIPTYPE = NAMED_DECLARATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_DECLARATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.RelationshipImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__INFO = DECLARATION__INFO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LEFT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RIGHT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_MEGAMODEL = DECLARATION___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_ASSIGNED = DECLARATION___IS_ASSIGNED;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.LinkImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INFO = ELEMENT__INFO;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_MEGAMODEL = ELEMENT___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___IS_ASSIGNED = ELEMENT___IS_ASSIGNED;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.EntityTypeReferenceImpl <em>Entity Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.EntityTypeReferenceImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityTypeReference()
	 * @generated
	 */
	int ENTITY_TYPE_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE__MANY = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Entity Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Assignable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE___IS_ASSIGNABLE_FROM__ENTITYTYPEREFERENCE = 0;

	/**
	 * The number of operations of the '<em>Entity Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_REFERENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.AnnotationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.FunctionApplicationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getFunctionApplication()
	 * @generated
	 */
	int FUNCTION_APPLICATION = 11;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__INFO = DECLARATION__INFO;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__FUNCTION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__INPUT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__OUTPUT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Megamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION___GET_MEGAMODEL = DECLARATION___GET_MEGAMODEL;

	/**
	 * The operation id for the '<em>Is Assigned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION___IS_ASSIGNED = DECLARATION___IS_ASSIGNED;

	/**
	 * The number of operations of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.api.URI
	 * @see org.softlang.megal.impl.MegalPackageImpl#getURI()
	 * @generated
	 */
	int URI = 12;

	/**
	 * The meta object id for the '<em>ESet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see org.softlang.megal.impl.MegalPackageImpl#getESet()
	 * @generated
	 */
	int ESET = 13;


	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Megamodel <em>Megamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Megamodel</em>'.
	 * @see org.softlang.megal.Megamodel
	 * @generated
	 */
	EClass getMegamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.Megamodel#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.softlang.megal.Megamodel#getDeclarations()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.Megamodel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.softlang.megal.Megamodel#getBindings()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Megamodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.Megamodel#getName()
	 * @see #getMegamodel()
	 * @generated
	 */
	EAttribute getMegamodel_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.Megamodel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.Megamodel#getImports()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Imports();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#getVisibleDeclarations() <em>Get Visible Declarations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visible Declarations</em>' operation.
	 * @see org.softlang.megal.Megamodel#getVisibleDeclarations()
	 * @generated
	 */
	EOperation getMegamodel__GetVisibleDeclarations();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#getVisibleBindings() <em>Get Visible Bindings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visible Bindings</em>' operation.
	 * @see org.softlang.megal.Megamodel#getVisibleBindings()
	 * @generated
	 */
	EOperation getMegamodel__GetVisibleBindings();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#scopeEntityType(org.softlang.megal.Entity) <em>Scope Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scope Entity Type</em>' operation.
	 * @see org.softlang.megal.Megamodel#scopeEntityType(org.softlang.megal.Entity)
	 * @generated
	 */
	EOperation getMegamodel__ScopeEntityType__Entity();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#scopeRelationshipType(org.softlang.megal.Entity, org.softlang.megal.Entity) <em>Scope Relationship Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scope Relationship Type</em>' operation.
	 * @see org.softlang.megal.Megamodel#scopeRelationshipType(org.softlang.megal.Entity, org.softlang.megal.Entity)
	 * @generated
	 */
	EOperation getMegamodel__ScopeRelationshipType__Entity_Entity();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Megamodel#fetchInfos(org.softlang.megal.Element) <em>Fetch Infos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Infos</em>' operation.
	 * @see org.softlang.megal.Megamodel#fetchInfos(org.softlang.megal.Element)
	 * @generated
	 */
	EOperation getMegamodel__FetchInfos__Element();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.softlang.megal.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.Element#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info</em>'.
	 * @see org.softlang.megal.Element#getInfo()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Info();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Element#getMegamodel() <em>Get Megamodel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Megamodel</em>' operation.
	 * @see org.softlang.megal.Element#getMegamodel()
	 * @generated
	 */
	EOperation getElement__GetMegamodel();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Element#isAssigned() <em>Is Assigned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Assigned</em>' operation.
	 * @see org.softlang.megal.Element#isAssigned()
	 * @generated
	 */
	EOperation getElement__IsAssigned();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.softlang.megal.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.NamedDeclaration <em>Named Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Declaration</em>'.
	 * @see org.softlang.megal.NamedDeclaration
	 * @generated
	 */
	EClass getNamedDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.NamedDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.NamedDeclaration#getName()
	 * @see #getNamedDeclaration()
	 * @generated
	 */
	EAttribute getNamedDeclaration_Name();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.NamedDeclaration#getShowName() <em>Get Show Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Show Name</em>' operation.
	 * @see org.softlang.megal.NamedDeclaration#getShowName()
	 * @generated
	 */
	EOperation getNamedDeclaration__GetShowName();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.softlang.megal.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.EntityType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see org.softlang.megal.EntityType#getSupertype()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Supertype();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.softlang.megal.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.RelationshipType#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.softlang.megal.RelationshipType#getLeft()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.RelationshipType#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.softlang.megal.RelationshipType#getRight()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_Right();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.RelationshipType#getVariants() <em>Get Variants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Variants</em>' operation.
	 * @see org.softlang.megal.RelationshipType#getVariants()
	 * @generated
	 */
	EOperation getRelationshipType__GetVariants();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.softlang.megal.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.Entity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.softlang.megal.Entity#getType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Entity#isDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent</em>'.
	 * @see org.softlang.megal.Entity#isDependent()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Dependent();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Entity#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.softlang.megal.Entity#isParameter()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Parameter();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Entity#getLinks() <em>Get Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Links</em>' operation.
	 * @see org.softlang.megal.Entity#getLinks()
	 * @generated
	 */
	EOperation getEntity__GetLinks();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Entity#followOutgoing(org.softlang.megal.RelationshipType) <em>Follow Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Follow Outgoing</em>' operation.
	 * @see org.softlang.megal.Entity#followOutgoing(org.softlang.megal.RelationshipType)
	 * @generated
	 */
	EOperation getEntity__FollowOutgoing__RelationshipType();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.Entity#followIncoming(org.softlang.megal.RelationshipType) <em>Follow Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Follow Incoming</em>' operation.
	 * @see org.softlang.megal.Entity#followIncoming(org.softlang.megal.RelationshipType)
	 * @generated
	 */
	EOperation getEntity__FollowIncoming__RelationshipType();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.softlang.megal.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Relationship#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.Relationship#getLeft()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Relationship#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.Relationship#getRight()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Right();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.softlang.megal.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.Link#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.softlang.megal.Link#getLink()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Link#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.softlang.megal.Link#getTo()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_To();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.EntityTypeReference <em>Entity Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type Reference</em>'.
	 * @see org.softlang.megal.EntityTypeReference
	 * @generated
	 */
	EClass getEntityTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.EntityTypeReference#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.softlang.megal.EntityTypeReference#isMany()
	 * @see #getEntityTypeReference()
	 * @generated
	 */
	EAttribute getEntityTypeReference_Many();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.EntityTypeReference#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.softlang.megal.EntityTypeReference#getDefinition()
	 * @see #getEntityTypeReference()
	 * @generated
	 */
	EReference getEntityTypeReference_Definition();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.EntityTypeReference#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.softlang.megal.EntityTypeReference#getParameters()
	 * @see #getEntityTypeReference()
	 * @generated
	 */
	EReference getEntityTypeReference_Parameters();

	/**
	 * Returns the meta object for the '{@link org.softlang.megal.EntityTypeReference#isAssignableFrom(org.softlang.megal.EntityTypeReference) <em>Is Assignable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Assignable From</em>' operation.
	 * @see org.softlang.megal.EntityTypeReference#isAssignableFrom(org.softlang.megal.EntityTypeReference)
	 * @generated
	 */
	EOperation getEntityTypeReference__IsAssignableFrom__EntityTypeReference();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.softlang.megal.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.softlang.megal.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.softlang.megal.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.FunctionApplication <em>Function Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Application</em>'.
	 * @see org.softlang.megal.FunctionApplication
	 * @generated
	 */
	EClass getFunctionApplication();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionApplication#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.softlang.megal.FunctionApplication#getFunction()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Function();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionApplication#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.softlang.megal.FunctionApplication#getInput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Input();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.FunctionApplication#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.softlang.megal.FunctionApplication#getOutput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Output();

	/**
	 * Returns the meta object for data type '{@link org.softlang.megal.api.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.softlang.megal.api.URI
	 * @model instanceClass="org.softlang.megal.api.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>ESet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ESet</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T"
	 * @generated
	 */
	EDataType getESet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MegalFactory getMegalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegamodelImpl <em>Megamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegamodelImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegamodel()
		 * @generated
		 */
		EClass MEGAMODEL = eINSTANCE.getMegamodel();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__DECLARATIONS = eINSTANCE.getMegamodel_Declarations();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__BINDINGS = eINSTANCE.getMegamodel_Bindings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAMODEL__NAME = eINSTANCE.getMegamodel_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__IMPORTS = eINSTANCE.getMegamodel_Imports();

		/**
		 * The meta object literal for the '<em><b>Get Visible Declarations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___GET_VISIBLE_DECLARATIONS = eINSTANCE.getMegamodel__GetVisibleDeclarations();

		/**
		 * The meta object literal for the '<em><b>Get Visible Bindings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___GET_VISIBLE_BINDINGS = eINSTANCE.getMegamodel__GetVisibleBindings();

		/**
		 * The meta object literal for the '<em><b>Scope Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___SCOPE_ENTITY_TYPE__ENTITY = eINSTANCE.getMegamodel__ScopeEntityType__Entity();

		/**
		 * The meta object literal for the '<em><b>Scope Relationship Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___SCOPE_RELATIONSHIP_TYPE__ENTITY_ENTITY = eINSTANCE.getMegamodel__ScopeRelationshipType__Entity_Entity();

		/**
		 * The meta object literal for the '<em><b>Fetch Infos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEGAMODEL___FETCH_INFOS__ELEMENT = eINSTANCE.getMegamodel__FetchInfos__Element();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.Element
		 * @see org.softlang.megal.impl.MegalPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__INFO = eINSTANCE.getElement_Info();

		/**
		 * The meta object literal for the '<em><b>Get Megamodel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___GET_MEGAMODEL = eINSTANCE.getElement__GetMegamodel();

		/**
		 * The meta object literal for the '<em><b>Is Assigned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___IS_ASSIGNED = eINSTANCE.getElement__IsAssigned();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.DeclarationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.NamedDeclarationImpl <em>Named Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.NamedDeclarationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getNamedDeclaration()
		 * @generated
		 */
		EClass NAMED_DECLARATION = eINSTANCE.getNamedDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_DECLARATION__NAME = eINSTANCE.getNamedDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Get Show Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_DECLARATION___GET_SHOW_NAME = eINSTANCE.getNamedDeclaration__GetShowName();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.EntityTypeImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SUPERTYPE = eINSTANCE.getEntityType_Supertype();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.RelationshipTypeImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__LEFT = eINSTANCE.getRelationshipType_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__RIGHT = eINSTANCE.getRelationshipType_Right();

		/**
		 * The meta object literal for the '<em><b>Get Variants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP_TYPE___GET_VARIANTS = eINSTANCE.getRelationshipType__GetVariants();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.EntityImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__TYPE = eINSTANCE.getEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DEPENDENT = eINSTANCE.getEntity_Dependent();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PARAMETER = eINSTANCE.getEntity_Parameter();

		/**
		 * The meta object literal for the '<em><b>Get Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___GET_LINKS = eINSTANCE.getEntity__GetLinks();

		/**
		 * The meta object literal for the '<em><b>Follow Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___FOLLOW_OUTGOING__RELATIONSHIPTYPE = eINSTANCE.getEntity__FollowOutgoing__RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Follow Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___FOLLOW_INCOMING__RELATIONSHIPTYPE = eINSTANCE.getEntity__FollowIncoming__RelationshipType();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.RelationshipImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__LEFT = eINSTANCE.getRelationship_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RIGHT = eINSTANCE.getRelationship_Right();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.LinkImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINK = eINSTANCE.getLink_Link();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TO = eINSTANCE.getLink_To();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.EntityTypeReferenceImpl <em>Entity Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.EntityTypeReferenceImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getEntityTypeReference()
		 * @generated
		 */
		EClass ENTITY_TYPE_REFERENCE = eINSTANCE.getEntityTypeReference();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE_REFERENCE__MANY = eINSTANCE.getEntityTypeReference_Many();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE_REFERENCE__DEFINITION = eINSTANCE.getEntityTypeReference_Definition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE_REFERENCE__PARAMETERS = eINSTANCE.getEntityTypeReference_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is Assignable From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE_REFERENCE___IS_ASSIGNABLE_FROM__ENTITYTYPEREFERENCE = eINSTANCE.getEntityTypeReference__IsAssignableFrom__EntityTypeReference();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.AnnotationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.FunctionApplicationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getFunctionApplication()
		 * @generated
		 */
		EClass FUNCTION_APPLICATION = eINSTANCE.getFunctionApplication();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__FUNCTION = eINSTANCE.getFunctionApplication_Function();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__INPUT = eINSTANCE.getFunctionApplication_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__OUTPUT = eINSTANCE.getFunctionApplication_Output();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.api.URI
		 * @see org.softlang.megal.impl.MegalPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>ESet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see org.softlang.megal.impl.MegalPackageImpl#getESet()
		 * @generated
		 */
		EDataType ESET = eINSTANCE.getESet();

	}

} //MegalPackage
