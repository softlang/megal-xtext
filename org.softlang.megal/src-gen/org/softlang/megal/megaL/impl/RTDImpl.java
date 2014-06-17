/**
 */
package org.softlang.megal.megaL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.megaL.ETDR;
import org.softlang.megal.megaL.MegaLPackage;
import org.softlang.megal.megaL.RTD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.RTDImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.RTDImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.RTDImpl#getCoDomain <em>Co Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTDImpl extends MinimalEObjectImpl.Container implements RTD
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
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected ETDR domain;

  /**
   * The cached value of the '{@link #getCoDomain() <em>Co Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoDomain()
   * @generated
   * @ordered
   */
  protected ETDR coDomain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RTDImpl()
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
    return MegaLPackage.Literals.RTD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.RTD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDR getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomain(ETDR newDomain, NotificationChain msgs)
  {
    ETDR oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegaLPackage.RTD__DOMAIN, oldDomain, newDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(ETDR newDomain)
  {
    if (newDomain != domain)
    {
      NotificationChain msgs = null;
      if (domain != null)
        msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegaLPackage.RTD__DOMAIN, null, msgs);
      if (newDomain != null)
        msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegaLPackage.RTD__DOMAIN, null, msgs);
      msgs = basicSetDomain(newDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.RTD__DOMAIN, newDomain, newDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDR getCoDomain()
  {
    return coDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoDomain(ETDR newCoDomain, NotificationChain msgs)
  {
    ETDR oldCoDomain = coDomain;
    coDomain = newCoDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegaLPackage.RTD__CO_DOMAIN, oldCoDomain, newCoDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoDomain(ETDR newCoDomain)
  {
    if (newCoDomain != coDomain)
    {
      NotificationChain msgs = null;
      if (coDomain != null)
        msgs = ((InternalEObject)coDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegaLPackage.RTD__CO_DOMAIN, null, msgs);
      if (newCoDomain != null)
        msgs = ((InternalEObject)newCoDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegaLPackage.RTD__CO_DOMAIN, null, msgs);
      msgs = basicSetCoDomain(newCoDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.RTD__CO_DOMAIN, newCoDomain, newCoDomain));
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
      case MegaLPackage.RTD__DOMAIN:
        return basicSetDomain(null, msgs);
      case MegaLPackage.RTD__CO_DOMAIN:
        return basicSetCoDomain(null, msgs);
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
      case MegaLPackage.RTD__NAME:
        return getName();
      case MegaLPackage.RTD__DOMAIN:
        return getDomain();
      case MegaLPackage.RTD__CO_DOMAIN:
        return getCoDomain();
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
      case MegaLPackage.RTD__NAME:
        setName((String)newValue);
        return;
      case MegaLPackage.RTD__DOMAIN:
        setDomain((ETDR)newValue);
        return;
      case MegaLPackage.RTD__CO_DOMAIN:
        setCoDomain((ETDR)newValue);
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
      case MegaLPackage.RTD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MegaLPackage.RTD__DOMAIN:
        setDomain((ETDR)null);
        return;
      case MegaLPackage.RTD__CO_DOMAIN:
        setCoDomain((ETDR)null);
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
      case MegaLPackage.RTD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MegaLPackage.RTD__DOMAIN:
        return domain != null;
      case MegaLPackage.RTD__CO_DOMAIN:
        return coDomain != null;
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

} //RTDImpl
