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
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.MegaLImpl <em>Mega L</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.MegaLImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getMegaL()
   * @generated
   */
  int MEGA_L = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Etd</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L__ETD = 2;

  /**
   * The feature id for the '<em><b>Rtd</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L__RTD = 3;

  /**
   * The feature id for the '<em><b>Ed</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L__ED = 4;

  /**
   * The feature id for the '<em><b>Rd</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L__RD = 5;

  /**
   * The number of structural features of the '<em>Mega L</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEGA_L_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.softlang.megal.megaL.impl.ETDRImpl <em>ETDR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.softlang.megal.megaL.impl.ETDRImpl
   * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getETDR()
   * @generated
   */
  int ETDR = 1;

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
  int ETD_ENTITY = 2;

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
  int ETD_DECLARED = 3;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD_DECLARED__REFERENCE = ETDR_FEATURE_COUNT + 0;

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
  int ETD = 4;

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
  int RTD = 5;

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
  int ED = 6;

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
  int RD = 7;

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
   * Returns the meta object for class '{@link org.softlang.megal.megaL.MegaL <em>Mega L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mega L</em>'.
   * @see org.softlang.megal.megaL.MegaL
   * @generated
   */
  EClass getMegaL();

  /**
   * Returns the meta object for the attribute '{@link org.softlang.megal.megaL.MegaL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.softlang.megal.megaL.MegaL#getName()
   * @see #getMegaL()
   * @generated
   */
  EAttribute getMegaL_Name();

  /**
   * Returns the meta object for the reference list '{@link org.softlang.megal.megaL.MegaL#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imports</em>'.
   * @see org.softlang.megal.megaL.MegaL#getImports()
   * @see #getMegaL()
   * @generated
   */
  EReference getMegaL_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaL#getEtd <em>Etd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Etd</em>'.
   * @see org.softlang.megal.megaL.MegaL#getEtd()
   * @see #getMegaL()
   * @generated
   */
  EReference getMegaL_Etd();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaL#getRtd <em>Rtd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rtd</em>'.
   * @see org.softlang.megal.megaL.MegaL#getRtd()
   * @see #getMegaL()
   * @generated
   */
  EReference getMegaL_Rtd();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaL#getEd <em>Ed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ed</em>'.
   * @see org.softlang.megal.megaL.MegaL#getEd()
   * @see #getMegaL()
   * @generated
   */
  EReference getMegaL_Ed();

  /**
   * Returns the meta object for the containment reference list '{@link org.softlang.megal.megaL.MegaL#getRd <em>Rd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rd</em>'.
   * @see org.softlang.megal.megaL.MegaL#getRd()
   * @see #getMegaL()
   * @generated
   */
  EReference getMegaL_Rd();

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
   * Returns the meta object for the reference '{@link org.softlang.megal.megaL.ETDDeclared#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.softlang.megal.megaL.ETDDeclared#getReference()
   * @see #getETDDeclared()
   * @generated
   */
  EReference getETDDeclared_Reference();

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
     * The meta object literal for the '{@link org.softlang.megal.megaL.impl.MegaLImpl <em>Mega L</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.softlang.megal.megaL.impl.MegaLImpl
     * @see org.softlang.megal.megaL.impl.MegaLPackageImpl#getMegaL()
     * @generated
     */
    EClass MEGA_L = eINSTANCE.getMegaL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEGA_L__NAME = eINSTANCE.getMegaL_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_L__IMPORTS = eINSTANCE.getMegaL_Imports();

    /**
     * The meta object literal for the '<em><b>Etd</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_L__ETD = eINSTANCE.getMegaL_Etd();

    /**
     * The meta object literal for the '<em><b>Rtd</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_L__RTD = eINSTANCE.getMegaL_Rtd();

    /**
     * The meta object literal for the '<em><b>Ed</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_L__ED = eINSTANCE.getMegaL_Ed();

    /**
     * The meta object literal for the '<em><b>Rd</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEGA_L__RD = eINSTANCE.getMegaL_Rd();

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
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ETD_DECLARED__REFERENCE = eINSTANCE.getETDDeclared_Reference();

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

  }

} //MegaLPackage
