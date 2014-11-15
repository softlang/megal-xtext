/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.FunctionApplication#getFunction <em>Function</em>}</li>
 *   <li>{@link org.softlang.megal.FunctionApplication#getInput <em>Input</em>}</li>
 *   <li>{@link org.softlang.megal.FunctionApplication#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.MegalPackage#getFunctionApplication()
 * @model
 * @generated
 */
public interface FunctionApplication extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Entity)
	 * @see org.softlang.megal.MegalPackage#getFunctionApplication_Function()
	 * @model
	 * @generated
	 */
	Entity getFunction();

	/**
	 * Sets the value of the '{@link org.softlang.megal.FunctionApplication#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Entity value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Entity)
	 * @see org.softlang.megal.MegalPackage#getFunctionApplication_Input()
	 * @model
	 * @generated
	 */
	Entity getInput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.FunctionApplication#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Entity value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Entity)
	 * @see org.softlang.megal.MegalPackage#getFunctionApplication_Output()
	 * @model
	 * @generated
	 */
	Entity getOutput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.FunctionApplication#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Entity value);

} // FunctionApplication
