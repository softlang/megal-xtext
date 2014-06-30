/**
 */
package org.softlang.megal.pp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root package of a package provider
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.pp.RootPackage#getBase <em>Base</em>}</li>
 *   <li>{@link org.softlang.megal.pp.RootPackage#getNoClassDefs <em>No Class Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.pp.PPPackage#getRootPackage()
 * @model
 * @generated
 */
public interface RootPackage extends Node {

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The most common package of all contained classifiers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see org.softlang.megal.pp.PPPackage#getRootPackage_Base()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getBase();

	/**
	 * Returns the value of the '<em><b>No Class Defs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Class Defs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class definitions required by the defining packages that could not be loaded
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Class Defs</em>' attribute list.
	 * @see org.softlang.megal.pp.PPPackage#getRootPackage_NoClassDefs()
	 * @model
	 * @generated
	 */
	EList<String> getNoClassDefs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resolves a classifier by it type name
	 * <!-- end-model-doc -->
	 * @model required="true"
	 * @generated
	 */
	Classifier resolveClassifier(String typeName);
} // RootPackage
