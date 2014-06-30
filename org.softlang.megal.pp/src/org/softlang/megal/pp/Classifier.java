/**
 */
package org.softlang.megal.pp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier in a package, may be a class or an interface
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.pp.Classifier#getGenerics <em>Generics</em>}</li>
 *   <li>{@link org.softlang.megal.pp.Classifier#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.softlang.megal.pp.Classifier#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.softlang.megal.pp.Classifier#isInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.pp.PPPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Node {
	/**
	 * Returns the value of the '<em><b>Generics</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.pp.Generic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generics</em>' containment reference list.
	 * @see org.softlang.megal.pp.PPPackage#getClassifier_Generics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generic> getGenerics();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(Type)
	 * @see org.softlang.megal.pp.PPPackage#getClassifier_Extends()
	 * @model containment="true"
	 * @generated
	 */
	Type getExtends();

	/**
	 * Sets the value of the '{@link org.softlang.megal.pp.Classifier#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Type value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.pp.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see org.softlang.megal.pp.PPPackage#getClassifier_Implements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getImplements();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see org.softlang.megal.pp.PPPackage#getClassifier_Interface()
	 * @model required="true"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link org.softlang.megal.pp.Classifier#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean isImplementationOf(String typeName);

} // Classifier
