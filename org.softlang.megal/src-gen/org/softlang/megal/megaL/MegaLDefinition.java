/**
 */
package org.softlang.megal.megaL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getLinker <em>Linker</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getEtd <em>Etd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getRtd <em>Rtd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getEd <em>Ed</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getRd <em>Rd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition()
 * @model
 * @generated
 */
public interface MegaLDefinition extends Model
{
  /**
   * Returns the value of the '<em><b>Linker</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linker</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linker</em>' reference.
   * @see #setLinker(MegaLLinking)
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Linker()
   * @model
   * @generated
   */
  MegaLLinking getLinker();

  /**
   * Sets the value of the '{@link org.softlang.megal.megaL.MegaLDefinition#getLinker <em>Linker</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Linker</em>' reference.
   * @see #getLinker()
   * @generated
   */
  void setLinker(MegaLLinking value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.MegaLDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Imports()
   * @model
   * @generated
   */
  EList<MegaLDefinition> getImports();

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
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Etd()
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
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Rtd()
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
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Ed()
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
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Rd()
   * @model containment="true"
   * @generated
   */
  EList<RD> getRd();

} // MegaLDefinition
