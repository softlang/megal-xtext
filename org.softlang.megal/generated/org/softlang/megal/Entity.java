/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.Entity#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.Entity#isDependent <em>Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.Entity#isParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedDeclaration
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(EntityTypeReference)
	 * @see org.softlang.megal.MegalPackage#getEntity_Type()
	 * @model containment="true"
	 * @generated
	 */
	EntityTypeReference getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Entity#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EntityTypeReference value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' attribute.
	 * @see #setDependent(boolean)
	 * @see org.softlang.megal.MegalPackage#getEntity_Dependent()
	 * @model
	 * @generated
	 */
	boolean isDependent();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Entity#isDependent <em>Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' attribute.
	 * @see #isDependent()
	 * @generated
	 */
	void setDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(boolean)
	 * @see org.softlang.megal.MegalPackage#getEntity_Parameter()
	 * @model
	 * @generated
	 */
	boolean isParameter();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Entity#isParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #isParameter()
	 * @generated
	 */
	void setParameter(boolean value);

} // Entity
