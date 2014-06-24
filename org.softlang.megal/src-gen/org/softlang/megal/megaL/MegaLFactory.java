/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.megaL.MegaLPackage
 * @generated
 */
public interface MegaLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MegaLFactory eINSTANCE = org.softlang.megal.megaL.impl.MegaLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  MegaLDefinition createMegaLDefinition();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>ETD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ETD</em>'.
   * @generated
   */
  ETD createETD();

  /**
   * Returns a new object of class '<em>RTD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RTD</em>'.
   * @generated
   */
  RTD createRTD();

  /**
   * Returns a new object of class '<em>RD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RD</em>'.
   * @generated
   */
  RD createRD();

  /**
   * Returns a new object of class '<em>ED</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ED</em>'.
   * @generated
   */
  ED createED();

  /**
   * Returns a new object of class '<em>Use ETD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use ETD</em>'.
   * @generated
   */
  UseETD createUseETD();

  /**
   * Returns a new object of class '<em>Use ETD Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use ETD Ref</em>'.
   * @generated
   */
  UseETDRef createUseETDRef();

  /**
   * Returns a new object of class '<em>Use Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Entity</em>'.
   * @generated
   */
  UseEntity createUseEntity();

  /**
   * Returns a new object of class '<em>Linking</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linking</em>'.
   * @generated
   */
  MegaLLinking createMegaLLinking();

  /**
   * Returns a new object of class '<em>LD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LD</em>'.
   * @generated
   */
  LD createLD();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MegaLPackage getMegaLPackage();

} //MegaLFactory
