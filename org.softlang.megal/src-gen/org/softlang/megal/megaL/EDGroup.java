/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.EDGroup#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.EDGroup#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getEDGroup()
 * @model
 * @generated
 */
public interface EDGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ETD)
   * @see org.softlang.megal.megaL.MegaLPackage#getEDGroup_Type()
   * @model
   * @generated
   */
  ETD getType();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.EDGroup#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ETD value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.ED}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getEDGroup_Items()
   * @model containment="true"
   * @generated
   */
  EList<ED> getItems();

} // EDGroup
