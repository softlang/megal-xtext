/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.RTD#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.RTD#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.RTD#getCoDomain <em>Co Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getRTD()
 * @model
 * @generated
 */
public interface RTD extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.softlang.megal.megaL.MegaLPackage#getRTD_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.RTD#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' reference.
   * @see #setDomain(ETD)
   * @see org.softlang.megal.megaL.MegaLPackage#getRTD_Domain()
   * @model
   * @generated
   */
  ETD getDomain();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.RTD#getDomain <em>Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(ETD value);

  /**
   * Returns the value of the '<em><b>Co Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Co Domain</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Co Domain</em>' reference.
   * @see #setCoDomain(ETD)
   * @see org.softlang.megal.megaL.MegaLPackage#getRTD_CoDomain()
   * @model
   * @generated
   */
  ETD getCoDomain();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.RTD#getCoDomain <em>Co Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Co Domain</em>' reference.
   * @see #getCoDomain()
   * @generated
   */
  void setCoDomain(ETD value);

} // RTD
