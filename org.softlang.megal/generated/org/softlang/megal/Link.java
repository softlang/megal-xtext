/**
 */
package org.softlang.megal;

import org.eclipse.emf.ecore.EObject;

import org.softlang.megal.api.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.Link#getLink <em>Link</em>}</li>
 *   <li>{@link org.softlang.megal.Link#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Entity)
	 * @see org.softlang.megal.MegalPackage#getLink_Link()
	 * @model
	 * @generated
	 */
	Entity getLink();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Link#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Entity value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(URI)
	 * @see org.softlang.megal.MegalPackage#getLink_To()
	 * @model dataType="org.softlang.megal.URI"
	 * @generated
	 */
	URI getTo();

	/**
	 * Sets the value of the '{@link org.softlang.megal.Link#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(URI value);

} // Link
