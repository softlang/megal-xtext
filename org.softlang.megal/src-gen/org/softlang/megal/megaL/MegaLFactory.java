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
   * Returns a new object of class '<em>Mega L</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mega L</em>'.
   * @generated
   */
  MegaL createMegaL();

  /**
   * Returns a new object of class '<em>ETDR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ETDR</em>'.
   * @generated
   */
  ETDR createETDR();

  /**
   * Returns a new object of class '<em>ETD Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ETD Entity</em>'.
   * @generated
   */
  ETDEntity createETDEntity();

  /**
   * Returns a new object of class '<em>ETD Declared</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ETD Declared</em>'.
   * @generated
   */
  ETDDeclared createETDDeclared();

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
   * Returns a new object of class '<em>ED</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ED</em>'.
   * @generated
   */
  ED createED();

  /**
   * Returns a new object of class '<em>RD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RD</em>'.
   * @generated
   */
  RD createRD();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MegaLPackage getMegaLPackage();

} //MegaLFactory
