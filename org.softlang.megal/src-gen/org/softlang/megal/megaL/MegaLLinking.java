/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.MegaLLinking#getTarget <em>Target</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLLinking#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getMegaLLinking()
 * @model
 * @generated
 */
public interface MegaLLinking extends Model
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(MegaLDefinition)
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLLinking_Target()
   * @model
   * @generated
   */
  MegaLDefinition getTarget();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.MegaLLinking#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(MegaLDefinition value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.LD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLLinking_Links()
   * @model containment="true"
   * @generated
   */
  EList<LD> getLinks();

} // MegaLLinking
