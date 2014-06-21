/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.softlang.megal.megaL.MegaLFactory
 * @model kind="package"
 * @generated
 */
public interface MegaLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "megaL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.softlang.org/megal/MegaL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "megaL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MegaLPackage eINSTANCE = org.softlang.megal.megaL.impl.MegaLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ModelImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.MegaLDefinitionImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getMegaLDefinition()
   * @generated
   */
  int MEGA_LDEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Linker</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__LINKER = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__IMPORTS = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Etds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__ETDS = MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rtds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__RTDS = MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Eds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__EDS = MODEL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION__RDS = MODEL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LDEFINITION_FEATURE_COUNT = MODEL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ImportImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__REF = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ETDRImpl <em>ETDR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ETDRImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDR()
   * @generated
   */
  int ETDR = 3;

  /**
   * The number of structural features of the '<em>ETDR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETDR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ETDEntityImpl <em>ETD Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ETDEntityImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDEntity()
   * @generated
   */
  int ETD_ENTITY = 4;

  /**
   * The number of structural features of the '<em>ETD Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD_ENTITY_FEATURE_COUNT = ETDR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ETDDeclaredImpl <em>ETD Declared</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ETDDeclaredImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDDeclared()
   * @generated
   */
  int ETD_DECLARED = 5;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD_DECLARED__REF = ETDR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ETD Declared</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD_DECLARED_FEATURE_COUNT = ETDR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ETDImpl <em>ETD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ETDImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETD()
   * @generated
   */
  int ETD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD__NAME = 0;

  /**
   * The feature id for the '<em><b>Supertype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD__SUPERTYPE = 1;

  /**
   * The number of structural features of the '<em>ETD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.RTDImpl <em>RTD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.RTDImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getRTD()
   * @generated
   */
  int RTD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__NAME = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__DOMAIN = 1;

  /**
   * The feature id for the '<em><b>Co Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__CO_DOMAIN = 2;

  /**
   * The number of structural features of the '<em>RTD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.EDImpl <em>ED</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.EDImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getED()
   * @generated
   */
  int ED = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED__TYPE = 1;

  /**
   * The number of structural features of the '<em>ED</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.RDImpl <em>RD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.RDImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getRD()
   * @generated
   */
  int RD = 9;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Rel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__REL = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__TARGET = 2;

  /**
   * The number of structural features of the '<em>RD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.MegaLLinkingImpl <em>Linking</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.MegaLLinkingImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getMegaLLinking()
   * @generated
   */
  int MEGA_LLINKING = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LLINKING__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LLINKING__TARGET = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LLINKING__LDS = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Linking</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_LLINKING_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.LDImpl <em>LD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.LDImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getLD()
   * @generated
   */
  int LD = 11;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LD__TARGET = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LD__VALUE = 1;

  /**
   * The number of structural features of the '<em>LD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LD_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.softlang.megal.megaL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.softlang.megal.megaL.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.softlang.megal.megaL.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.MegaLDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition
   * @generated
   */
  EClass getMegaLDefinition();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.MegaLDefinition#getLinker <em>Linker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Linker</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition#getLinker()
   * @see #getMegaLDefinition()
   * @generated
   */
  EReference getMegaLDefinition_Linker();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaLDefinition#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition#getImports()
   * @see #getMegaLDefinition()
   * @generated
   */
  EReference getMegaLDefinition_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaLDefinition#getEtds <em>Etds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Etds</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition#getEtds()
   * @see #getMegaLDefinition()
   * @generated
   */
  EReference getMegaLDefinition_Etds();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaLDefinition#getRtds <em>Rtds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rtds</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition#getRtds()
   * @see #getMegaLDefinition()
   * @generated
   */
  EReference getMegaLDefinition_Rtds();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaLDefinition#getEds <em>Eds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Eds</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition#getEds()
   * @see #getMegaLDefinition()
   * @generated
   */
  EReference getMegaLDefinition_Eds();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaLDefinition#getRds <em>Rds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rds</em>'.
   * @see org.softlang.megal.megaL.MegaLDefinition#getRds()
   * @see #getMegaLDefinition()
   * @generated
   */
  EReference getMegaLDefinition_Rds();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.softlang.megal.megaL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.Import#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.softlang.megal.megaL.Import#getRef()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Ref();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.ETDR <em>ETDR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETDR</em>'.
   * @see org.softlang.megal.megaL.ETDR
   * @generated
   */
  EClass getETDR();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.ETDEntity <em>ETD Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETD Entity</em>'.
   * @see org.softlang.megal.megaL.ETDEntity
   * @generated
   */
  EClass getETDEntity();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.ETDDeclared <em>ETD Declared</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETD Declared</em>'.
   * @see org.softlang.megal.megaL.ETDDeclared
   * @generated
   */
  EClass getETDDeclared();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.ETDDeclared#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.softlang.megal.megaL.ETDDeclared#getRef()
   * @see #getETDDeclared()
   * @generated
   */
  EReference getETDDeclared_Ref();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.ETD <em>ETD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETD</em>'.
   * @see org.softlang.megal.megaL.ETD
   * @generated
   */
  EClass getETD();

  /**
   * Returns the meta object for the attribute '{@link org.softlang.megal.megaL.ETD#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.softlang.megal.megaL.ETD#getName()
   * @see #getETD()
   * @generated
   */
  EAttribute getETD_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.softlang.megal.megaL.ETD#getSupertype <em>Supertype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Supertype</em>'.
   * @see org.softlang.megal.megaL.ETD#getSupertype()
   * @see #getETD()
   * @generated
   */
  EReference getETD_Supertype();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.RTD <em>RTD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RTD</em>'.
   * @see org.softlang.megal.megaL.RTD
   * @generated
   */
  EClass getRTD();

  /**
   * Returns the meta object for the attribute '{@link org.softlang.megal.megaL.RTD#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.softlang.megal.megaL.RTD#getName()
   * @see #getRTD()
   * @generated
   */
  EAttribute getRTD_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.softlang.megal.megaL.RTD#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.softlang.megal.megaL.RTD#getDomain()
   * @see #getRTD()
   * @generated
   */
  EReference getRTD_Domain();

  /**
   * Returns the meta object for the containment reference '{@link org.softlang.megal.megaL.RTD#getCoDomain <em>Co Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Co Domain</em>'.
   * @see org.softlang.megal.megaL.RTD#getCoDomain()
   * @see #getRTD()
   * @generated
   */
  EReference getRTD_CoDomain();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.ED <em>ED</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ED</em>'.
   * @see org.softlang.megal.megaL.ED
   * @generated
   */
  EClass getED();

  /**
   * Returns the meta object for the attribute '{@link org.softlang.megal.megaL.ED#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.softlang.megal.megaL.ED#getName()
   * @see #getED()
   * @generated
   */
  EAttribute getED_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.softlang.megal.megaL.ED#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.softlang.megal.megaL.ED#getType()
   * @see #getED()
   * @generated
   */
  EReference getED_Type();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.RD <em>RD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RD</em>'.
   * @see org.softlang.megal.megaL.RD
   * @generated
   */
  EClass getRD();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.RD#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.softlang.megal.megaL.RD#getSource()
   * @see #getRD()
   * @generated
   */
  EReference getRD_Source();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.RD#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rel</em>'.
   * @see org.softlang.megal.megaL.RD#getRel()
   * @see #getRD()
   * @generated
   */
  EReference getRD_Rel();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.RD#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.softlang.megal.megaL.RD#getTarget()
   * @see #getRD()
   * @generated
   */
  EReference getRD_Target();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.MegaLLinking <em>Linking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linking</em>'.
   * @see org.softlang.megal.megaL.MegaLLinking
   * @generated
   */
  EClass getMegaLLinking();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.MegaLLinking#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.softlang.megal.megaL.MegaLLinking#getTarget()
   * @see #getMegaLLinking()
   * @generated
   */
  EReference getMegaLLinking_Target();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaLLinking#getLds <em>Lds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lds</em>'.
   * @see org.softlang.megal.megaL.MegaLLinking#getLds()
   * @see #getMegaLLinking()
   * @generated
   */
  EReference getMegaLLinking_Lds();

  /**
   * Returns the meta object for class '{@link org.softlang.megal.megaL.LD <em>LD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LD</em>'.
   * @see org.softlang.megal.megaL.LD
   * @generated
   */
  EClass getLD();

  /**
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.LD#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.softlang.megal.megaL.LD#getTarget()
   * @see #getLD()
   * @generated
   */
  EReference getLD_Target();

  /**
   * Returns the meta object for the attribute '{@link org.softlang.megal.megaL.LD#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.softlang.megal.megaL.LD#getValue()
   * @see #getLD()
   * @generated
   */
  EAttribute getLD_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MegaLFactory getMegaLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.ModelImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.MegaLDefinitionImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getMegaLDefinition()
     * @generated
     */
    EClass MEGA_LDEFINITION = eINSTANCE.getMegaLDefinition();

    /**
     * The meta object literal for the '<em><b>Linker</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LDEFINITION__LINKER = eINSTANCE.getMegaLDefinition_Linker();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LDEFINITION__IMPORTS = eINSTANCE.getMegaLDefinition_Imports();

    /**
     * The meta object literal for the '<em><b>Etds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LDEFINITION__ETDS = eINSTANCE.getMegaLDefinition_Etds();

    /**
     * The meta object literal for the '<em><b>Rtds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LDEFINITION__RTDS = eINSTANCE.getMegaLDefinition_Rtds();

    /**
     * The meta object literal for the '<em><b>Eds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LDEFINITION__EDS = eINSTANCE.getMegaLDefinition_Eds();

    /**
     * The meta object literal for the '<em><b>Rds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LDEFINITION__RDS = eINSTANCE.getMegaLDefinition_Rds();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.ImportImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__REF = eINSTANCE.getImport_Ref();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.ETDRImpl <em>ETDR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.ETDRImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDR()
     * @generated
     */
    EClass ETDR = eINSTANCE.getETDR();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.ETDEntityImpl <em>ETD Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.ETDEntityImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDEntity()
     * @generated
     */
    EClass ETD_ENTITY = eINSTANCE.getETDEntity();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.ETDDeclaredImpl <em>ETD Declared</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.ETDDeclaredImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDDeclared()
     * @generated
     */
    EClass ETD_DECLARED = eINSTANCE.getETDDeclared();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ETD_DECLARED__REF = eINSTANCE.getETDDeclared_Ref();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.ETDImpl <em>ETD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.ETDImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETD()
     * @generated
     */
    EClass ETD = eINSTANCE.getETD();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ETD__NAME = eINSTANCE.getETD_Name();

    /**
     * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ETD__SUPERTYPE = eINSTANCE.getETD_Supertype();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.RTDImpl <em>RTD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.RTDImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getRTD()
     * @generated
     */
    EClass RTD = eINSTANCE.getRTD();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RTD__NAME = eINSTANCE.getRTD_Name();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RTD__DOMAIN = eINSTANCE.getRTD_Domain();

    /**
     * The meta object literal for the '<em><b>Co Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RTD__CO_DOMAIN = eINSTANCE.getRTD_CoDomain();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.EDImpl <em>ED</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.EDImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getED()
     * @generated
     */
    EClass ED = eINSTANCE.getED();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ED__NAME = eINSTANCE.getED_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ED__TYPE = eINSTANCE.getED_Type();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.RDImpl <em>RD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.RDImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getRD()
     * @generated
     */
    EClass RD = eINSTANCE.getRD();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RD__SOURCE = eINSTANCE.getRD_Source();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RD__REL = eINSTANCE.getRD_Rel();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RD__TARGET = eINSTANCE.getRD_Target();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.MegaLLinkingImpl <em>Linking</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.MegaLLinkingImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getMegaLLinking()
     * @generated
     */
    EClass MEGA_LLINKING = eINSTANCE.getMegaLLinking();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LLINKING__TARGET = eINSTANCE.getMegaLLinking_Target();

    /**
     * The meta object literal for the '<em><b>Lds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_LLINKING__LDS = eINSTANCE.getMegaLLinking_Lds();

    /**
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.LDImpl <em>LD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.LDImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getLD()
     * @generated
     */
    EClass LD = eINSTANCE.getLD();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LD__TARGET = eINSTANCE.getLD_Target();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LD__VALUE = eINSTANCE.getLD_Value();

  }

} //MegaLPackage
