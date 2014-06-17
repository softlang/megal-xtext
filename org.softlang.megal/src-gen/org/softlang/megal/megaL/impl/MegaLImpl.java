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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.MegaL;
import org.softlang.megal.megaL.MegaLPackage;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.RTD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mega L</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLImpl#getEtd <em>Etd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLImpl#getRtd <em>Rtd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLImpl#getEd <em>Ed</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLImpl#getRd <em>Rd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MegaLImpl extends MinimalEObjectImpl.Container implements MegaL
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<MegaL> imports;

  /**
   * The cached value of the '{@link #getEtd() <em>Etd</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtd()
   * @generated
   * @ordered
   */
  protected EList<ETD> etd;

  /**
   * The cached value of the '{@link #getRtd() <em>Rtd</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtd()
   * @generated
   * @ordered
   */
  protected EList<RTD> rtd;

  /**
   * The cached value of the '{@link #getEd() <em>Ed</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEd()
   * @generated
   * @ordered
   */
  protected EList<ED> ed;

  /**
   * The cached value of the '{@link #getRd() <em>Rd</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRd()
   * @generated
   * @ordered
   */
  protected EList<RD> rd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MegaLImpl()
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
    return MegaLPackage.Literals.MEGA_L;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.MEGA_L__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MegaL> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectResolvingEList<MegaL>(MegaL.class, this, MegaLPackage.MEGA_L__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETD> getEtd()
  {
    if (etd == null)
    {
      etd = new EObjectContainmentEList<ETD>(ETD.class, this, MegaLPackage.MEGA_L__ETD);
    }
    return etd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RTD> getRtd()
  {
    if (rtd == null)
    {
      rtd = new EObjectContainmentEList<RTD>(RTD.class, this, MegaLPackage.MEGA_L__RTD);
    }
    return rtd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ED> getEd()
  {
    if (ed == null)
    {
      ed = new EObjectContainmentEList<ED>(ED.class, this, MegaLPackage.MEGA_L__ED);
    }
    return ed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RD> getRd()
  {
    if (rd == null)
    {
      rd = new EObjectContainmentEList<RD>(RD.class, this, MegaLPackage.MEGA_L__RD);
    }
    return rd;
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
      case MegaLPackage.MEGA_L__ETD:
        return ((InternalEList<?>)getEtd()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_L__RTD:
        return ((InternalEList<?>)getRtd()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_L__ED:
        return ((InternalEList<?>)getEd()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_L__RD:
        return ((InternalEList<?>)getRd()).basicRemove(otherEnd, msgs);
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
      case MegaLPackage.MEGA_L__NAME:
        return getName();
      case MegaLPackage.MEGA_L__IMPORTS:
        return getImports();
      case MegaLPackage.MEGA_L__ETD:
        return getEtd();
      case MegaLPackage.MEGA_L__RTD:
        return getRtd();
      case MegaLPackage.MEGA_L__ED:
        return getEd();
      case MegaLPackage.MEGA_L__RD:
        return getRd();
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
      case MegaLPackage.MEGA_L__NAME:
        setName((String)newValue);
        return;
      case MegaLPackage.MEGA_L__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends MegaL>)newValue);
        return;
      case MegaLPackage.MEGA_L__ETD:
        getEtd().clear();
        getEtd().addAll((Collection<? extends ETD>)newValue);
        return;
      case MegaLPackage.MEGA_L__RTD:
        getRtd().clear();
        getRtd().addAll((Collection<? extends RTD>)newValue);
        return;
      case MegaLPackage.MEGA_L__ED:
        getEd().clear();
        getEd().addAll((Collection<? extends ED>)newValue);
        return;
      case MegaLPackage.MEGA_L__RD:
        getRd().clear();
        getRd().addAll((Collection<? extends RD>)newValue);
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
      case MegaLPackage.MEGA_L__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MegaLPackage.MEGA_L__IMPORTS:
        getImports().clear();
        return;
      case MegaLPackage.MEGA_L__ETD:
        getEtd().clear();
        return;
      case MegaLPackage.MEGA_L__RTD:
        getRtd().clear();
        return;
      case MegaLPackage.MEGA_L__ED:
        getEd().clear();
        return;
      case MegaLPackage.MEGA_L__RD:
        getRd().clear();
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
      case MegaLPackage.MEGA_L__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MegaLPackage.MEGA_L__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MegaLPackage.MEGA_L__ETD:
        return etd != null && !etd.isEmpty();
      case MegaLPackage.MEGA_L__RTD:
        return rtd != null && !rtd.isEmpty();
      case MegaLPackage.MEGA_L__ED:
        return ed != null && !ed.isEmpty();
      case MegaLPackage.MEGA_L__RD:
        return rd != null && !rd.isEmpty();
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

} //MegaLImpl
