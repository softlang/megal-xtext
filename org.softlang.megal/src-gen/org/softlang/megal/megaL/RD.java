/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.RD#getSource <em>Source</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.RD#getRel <em>Rel</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.RD#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getRD()
 * @model
 * @generated
 */
public interface RD extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ED)
   * @see org.softlang.megal.megaL.MegaLPackage#getRD_Source()
   * @model
   * @generated
   */
  ED getSource();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.RD#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ED value);

  /**
   * Returns the value of the '<em><b>Rel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel</em>' reference.
   * @see #setRel(RTD)
   * @see org.softlang.megal.megaL.MegaLPackage#getRD_Rel()
   * @model
   * @generated
   */
  RTD getRel();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.RD#getRel <em>Rel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel</em>' reference.
   * @see #getRel()
   * @generated
   */
  void setRel(RTD value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ED)
   * @see org.softlang.megal.megaL.MegaLPackage#getRD_Target()
   * @model
   * @generated
   */
  ED getTarget();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.RD#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ED value);

} // RD
