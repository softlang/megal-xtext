/**
 */
package org.softlang.megal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.Entity;
import org.softlang.megal.FunctionApplication;
import org.softlang.megal.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.impl.FunctionApplicationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.softlang.megal.impl.FunctionApplicationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.softlang.megal.impl.FunctionApplicationImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionApplicationImpl extends DeclarationImpl implements FunctionApplication
{
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Entity function;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Entity input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Entity output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionApplicationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MegalPackage.Literals.FUNCTION_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getFunction()
	{
		if (function != null && function.eIsProxy())
		{
			InternalEObject oldFunction = (InternalEObject)function;
			function = (Entity)eResolveProxy(oldFunction);
			if (function != oldFunction)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.FUNCTION_APPLICATION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetFunction()
	{
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Entity newFunction)
	{
		Entity oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FUNCTION_APPLICATION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getInput()
	{
		if (input != null && input.eIsProxy())
		{
			InternalEObject oldInput = (InternalEObject)input;
			input = (Entity)eResolveProxy(oldInput);
			if (input != oldInput)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.FUNCTION_APPLICATION__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetInput()
	{
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Entity newInput)
	{
		Entity oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FUNCTION_APPLICATION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getOutput()
	{
		if (output != null && output.eIsProxy())
		{
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Entity)eResolveProxy(oldOutput);
			if (output != oldOutput)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.FUNCTION_APPLICATION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetOutput()
	{
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Entity newOutput)
	{
		Entity oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FUNCTION_APPLICATION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_APPLICATION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case MegalPackage.FUNCTION_APPLICATION__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case MegalPackage.FUNCTION_APPLICATION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_APPLICATION__FUNCTION:
				setFunction((Entity)newValue);
				return;
			case MegalPackage.FUNCTION_APPLICATION__INPUT:
				setInput((Entity)newValue);
				return;
			case MegalPackage.FUNCTION_APPLICATION__OUTPUT:
				setOutput((Entity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_APPLICATION__FUNCTION:
				setFunction((Entity)null);
				return;
			case MegalPackage.FUNCTION_APPLICATION__INPUT:
				setInput((Entity)null);
				return;
			case MegalPackage.FUNCTION_APPLICATION__OUTPUT:
				setOutput((Entity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MegalPackage.FUNCTION_APPLICATION__FUNCTION:
				return function != null;
			case MegalPackage.FUNCTION_APPLICATION__INPUT:
				return input != null;
			case MegalPackage.FUNCTION_APPLICATION__OUTPUT:
				return output != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionApplicationImpl
