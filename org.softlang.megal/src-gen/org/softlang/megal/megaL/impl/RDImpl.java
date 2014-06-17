/**
 */
package org.softlang.megal.megaL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.MegaLPackage;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.RTD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.RDImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.RDImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.RDImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDImpl extends MinimalEObjectImpl.Container implements RD
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected ED source;

  /**
   * The cached value of the '{@link #getRel() <em>Rel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRel()
   * @generated
   * @ordered
   */
  protected RTD rel;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ED target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RDImpl()
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
    return MegaLPackage.Literals.RD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ED getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (ED)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegaLPackage.RD__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ED basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ED newSource)
  {
    ED oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.RD__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTD getRel()
  {
    if (rel != null && rel.eIsProxy())
    {
      InternalEObject oldRel = (InternalEObject)rel;
      rel = (RTD)eResolveProxy(oldRel);
      if (rel != oldRel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegaLPackage.RD__REL, oldRel, rel));
      }
    }
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTD basicGetRel()
  {
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRel(RTD newRel)
  {
    RTD oldRel = rel;
    rel = newRel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.RD__REL, oldRel, rel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ED getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ED)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegaLPackage.RD__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ED basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ED newTarget)
  {
    ED oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.RD__TARGET, oldTarget, target));
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
      case MegaLPackage.RD__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case MegaLPackage.RD__REL:
        if (resolve) return getRel();
        return basicGetRel();
      case MegaLPackage.RD__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case MegaLPackage.RD__SOURCE:
        setSource((ED)newValue);
        return;
      case MegaLPackage.RD__REL:
        setRel((RTD)newValue);
        return;
      case MegaLPackage.RD__TARGET:
        setTarget((ED)newValue);
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
      case MegaLPackage.RD__SOURCE:
        setSource((ED)null);
        return;
      case MegaLPackage.RD__REL:
        setRel((RTD)null);
        return;
      case MegaLPackage.RD__TARGET:
        setTarget((ED)null);
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
      case MegaLPackage.RD__SOURCE:
        return source != null;
      case MegaLPackage.RD__REL:
        return rel != null;
      case MegaLPackage.RD__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //RDImpl
