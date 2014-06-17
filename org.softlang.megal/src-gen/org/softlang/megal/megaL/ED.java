/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.ED#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.ED#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getED()
 * @model
 * @generated
 */
public interface ED extends EObject
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
   * @see org.softlang.megal.megaL.MegaLPackage#getED_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.ED#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ETDR)
   * @see org.softlang.megal.megaL.MegaLPackage#getED_Type()
   * @model containment="true"
   * @generated
   */
  ETDR getType();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.ED#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ETDR value);

} // ED
