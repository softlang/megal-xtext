/**
 */
package org.softlang.megal.megaL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.ETDDeclared;
import org.softlang.megal.megaL.MegaLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETD Declared</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.ETDDeclaredImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETDDeclaredImpl extends ETDRImpl implements ETDDeclared
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected ETD reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETDDeclaredImpl()
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
    return MegaLPackage.Literals.ETD_DECLARED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (ETD)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegaLPackage.ETD_DECLARED__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(ETD newReference)
  {
    ETD oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.ETD_DECLARED__REFERENCE, oldReference, reference));
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
      case MegaLPackage.ETD_DECLARED__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
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
      case MegaLPackage.ETD_DECLARED__REFERENCE:
        setReference((ETD)newValue);
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
      case MegaLPackage.ETD_DECLARED__REFERENCE:
        setReference((ETD)null);
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
      case MegaLPackage.ETD_DECLARED__REFERENCE:
        return reference != null;
    }
    return super.eIsSet(featureID);
  }

} //ETDDeclaredImpl
