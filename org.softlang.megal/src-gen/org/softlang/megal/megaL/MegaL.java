/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mega L</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.MegaL#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaL#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaL#getEtd <em>Etd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaL#getRtd <em>Rtd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaL#getEd <em>Ed</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaL#getRd <em>Rd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getMegaL()
 * @model
 * @generated
 */
public interface MegaL extends EObject
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
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.MegaL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.MegaL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaL_Imports()
   * @model
   * @generated
   */
  EList<MegaL> getImports();

  /**
   * Returns the value of the '<em><b>Etd</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.ETD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etd</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etd</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaL_Etd()
   * @model containment="true"
   * @generated
   */
  EList<ETD> getEtd();

  /**
   * Returns the value of the '<em><b>Rtd</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.RTD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rtd</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rtd</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaL_Rtd()
   * @model containment="true"
   * @generated
   */
  EList<RTD> getRtd();

  /**
   * Returns the value of the '<em><b>Ed</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.ED}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ed</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ed</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaL_Ed()
   * @model containment="true"
   * @generated
   */
  EList<ED> getEd();

  /**
   * Returns the value of the '<em><b>Rd</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.RD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rd</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rd</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaL_Rd()
   * @model containment="true"
   * @generated
   */
  EList<RD> getRd();

} // MegaL
