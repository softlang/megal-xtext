/**
 */
package org.softlang.megal.megaL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.megaL.LD;
import org.softlang.megal.megaL.MegaLDefinition;
import org.softlang.megal.megaL.MegaLLinking;
import org.softlang.megal.megaL.MegaLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLLinkingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLLinkingImpl#getLds <em>Lds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MegaLLinkingImpl extends ModelImpl implements MegaLLinking
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected MegaLDefinition target;

  /**
   * The cached value of the '{@link #getLds() <em>Lds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLds()
   * @generated
   * @ordered
   */
  protected EList<LD> lds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MegaLLinkingImpl()
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
    return MegaLPackage.Literals.MEGA_LLINKING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLDefinition getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (MegaLDefinition)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegaLPackage.MEGA_LLINKING__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLDefinition basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(MegaLDefinition newTarget)
  {
    MegaLDefinition oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.MEGA_LLINKING__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LD> getLds()
  {
    if (lds == null)
    {
      lds = new EObjectContainmentEList<LD>(LD.class, this, MegaLPackage.MEGA_LLINKING__LDS);
    }
    return lds;
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
      case MegaLPackage.MEGA_LLINKING__LDS:
        return ((InternalEList<?>)getLds()).basicRemove(otherEnd, msgs);
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
      case MegaLPackage.MEGA_LLINKING__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case MegaLPackage.MEGA_LLINKING__LDS:
        return getLds();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MegaLPackage.MEGA_LLINKING__TARGET:
        setTarget((MegaLDefinition)newValue);
        return;
      case MegaLPackage.MEGA_LLINKING__LDS:
        getLds().clear();
        getLds().addAll((Collection<? extends LD>)newValue);
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
      case MegaLPackage.MEGA_LLINKING__TARGET:
        setTarget((MegaLDefinition)null);
        return;
      case MegaLPackage.MEGA_LLINKING__LDS:
        getLds().clear();
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
      case MegaLPackage.MEGA_LLINKING__TARGET:
        return target != null;
      case MegaLPackage.MEGA_LLINKING__LDS:
        return lds != null && !lds.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MegaLLinkingImpl
