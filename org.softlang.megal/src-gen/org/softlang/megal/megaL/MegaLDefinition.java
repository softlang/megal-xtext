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
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getEtds <em>Etds</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getRtds <em>Rtds</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getEds <em>Eds</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.MegaLDefinition#getRds <em>Rds</em>}</li>
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
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Etds</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.ETD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Etds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etds</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Etds()
   * @model containment="true"
   * @generated
   */
  EList<ETD> getEtds();

  /**
   * Returns the value of the '<em><b>Rtds</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.RTD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rtds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rtds</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Rtds()
   * @model containment="true"
   * @generated
   */
  EList<RTD> getRtds();

  /**
   * Returns the value of the '<em><b>Eds</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.ED}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eds</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Eds()
   * @model containment="true"
   * @generated
   */
  EList<ED> getEds();

  /**
   * Returns the value of the '<em><b>Rds</b></em>' containment reference list.
   * The list contents are of type {@link org.softlang.megal.megaL.RD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rds</em>' containment reference list.
   * @see org.softlang.megal.megaL.MegaLPackage#getMegaLDefinition_Rds()
   * @model containment="true"
   * @generated
   */
  EList<RD> getRds();

} // MegaLDefinition
