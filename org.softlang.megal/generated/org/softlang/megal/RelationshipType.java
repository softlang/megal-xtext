/**
 */
package org.softlang.megal;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.RelationshipType#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.RelationshipType#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends NamedDeclaration
{
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(EntityTypeReference)
	 * @see org.softlang.megal.MegalPackage#getRelationshipType_Left()
	 * @model containment="true"
	 * @generated
	 */
	EntityTypeReference getLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.RelationshipType#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(EntityTypeReference value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(EntityTypeReference)
	 * @see org.softlang.megal.MegalPackage#getRelationshipType_Right()
	 * @model containment="true"
	 * @generated
	 */
	EntityTypeReference getRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.RelationshipType#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(EntityTypeReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.softlang.megal.ESet<org.softlang.megal.RelationshipType>"
	 * @generated
	 */
	Set<RelationshipType> getVariants();

} // RelationshipType
