/**
 */
package org.softlang.megal.megaL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.ETDR;
import org.softlang.megal.megaL.MegaLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.ETDImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.ETDImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETDImpl extends MinimalEObjectImpl.Container implements ETD
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupertype()
   * @generated
   * @ordered
   */
  protected ETDR supertype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETDImpl()
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
    return MegaLPackage.Literals.ETD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.ETD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDR getSupertype()
  {
    return supertype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSupertype(ETDR newSupertype, NotificationChain msgs)
  {
    ETDR oldSupertype = supertype;
    supertype = newSupertype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegaLPackage.ETD__SUPERTYPE, oldSupertype, newSupertype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupertype(ETDR newSupertype)
  {
    if (newSupertype != supertype)
    {
      NotificationChain msgs = null;
      if (supertype != null)
        msgs = ((InternalEObject)supertype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegaLPackage.ETD__SUPERTYPE, null, msgs);
      if (newSupertype != null)
        msgs = ((InternalEObject)newSupertype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegaLPackage.ETD__SUPERTYPE, null, msgs);
      msgs = basicSetSupertype(newSupertype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.ETD__SUPERTYPE, newSupertype, newSupertype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MegaLPackage.ETD__SUPERTYPE:
        return basicSetSupertype(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MegaLPackage.ETD__NAME:
        return getName();
      case MegaLPackage.ETD__SUPERTYPE:
        return getSupertype();
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
      case MegaLPackage.ETD__NAME:
        setName((String)newValue);
        return;
      case MegaLPackage.ETD__SUPERTYPE:
        setSupertype((ETDR)newValue);
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
      case MegaLPackage.ETD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MegaLPackage.ETD__SUPERTYPE:
        setSupertype((ETDR)null);
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
      case MegaLPackage.ETD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MegaLPackage.ETD__SUPERTYPE:
        return supertype != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ETDImpl
