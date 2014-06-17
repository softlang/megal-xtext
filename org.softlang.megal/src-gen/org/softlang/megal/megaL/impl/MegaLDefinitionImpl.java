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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.MegaLDefinition;
import org.softlang.megal.megaL.MegaLLinking;
import org.softlang.megal.megaL.MegaLPackage;
import org.softlang.megal.megaL.RD;
import org.softlang.megal.megaL.RTD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getLinker <em>Linker</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getEtd <em>Etd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getRtd <em>Rtd</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getEd <em>Ed</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getRd <em>Rd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MegaLDefinitionImpl extends ModelImpl implements MegaLDefinition
{
  /**
   * The cached value of the '{@link #getLinker() <em>Linker</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinker()
   * @generated
   * @ordered
   */
  protected MegaLLinking linker;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<MegaLDefinition> imports;

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
  protected MegaLDefinitionImpl()
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
    return MegaLPackage.Literals.MEGA_LDEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLLinking getLinker()
  {
    if (linker != null && linker.eIsProxy())
    {
      InternalEObject oldLinker = (InternalEObject)linker;
      linker = (MegaLLinking)eResolveProxy(oldLinker);
      if (linker != oldLinker)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegaLPackage.MEGA_LDEFINITION__LINKER, oldLinker, linker));
      }
    }
    return linker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLLinking basicGetLinker()
  {
    return linker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinker(MegaLLinking newLinker)
  {
    MegaLLinking oldLinker = linker;
    linker = newLinker;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MegaLPackage.MEGA_LDEFINITION__LINKER, oldLinker, linker));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MegaLDefinition> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectResolvingEList<MegaLDefinition>(MegaLDefinition.class, this, MegaLPackage.MEGA_LDEFINITION__IMPORTS);
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
      etd = new EObjectContainmentEList<ETD>(ETD.class, this, MegaLPackage.MEGA_LDEFINITION__ETD);
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
      rtd = new EObjectContainmentEList<RTD>(RTD.class, this, MegaLPackage.MEGA_LDEFINITION__RTD);
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
      ed = new EObjectContainmentEList<ED>(ED.class, this, MegaLPackage.MEGA_LDEFINITION__ED);
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
      rd = new EObjectContainmentEList<RD>(RD.class, this, MegaLPackage.MEGA_LDEFINITION__RD);
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
      case MegaLPackage.MEGA_LDEFINITION__ETD:
        return ((InternalEList<?>)getEtd()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__RTD:
        return ((InternalEList<?>)getRtd()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__ED:
        return ((InternalEList<?>)getEd()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__RD:
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
      case MegaLPackage.MEGA_LDEFINITION__LINKER:
        if (resolve) return getLinker();
        return basicGetLinker();
      case MegaLPackage.MEGA_LDEFINITION__IMPORTS:
        return getImports();
      case MegaLPackage.MEGA_LDEFINITION__ETD:
        return getEtd();
      case MegaLPackage.MEGA_LDEFINITION__RTD:
        return getRtd();
      case MegaLPackage.MEGA_LDEFINITION__ED:
        return getEd();
      case MegaLPackage.MEGA_LDEFINITION__RD:
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
      case MegaLPackage.MEGA_LDEFINITION__LINKER:
        setLinker((MegaLLinking)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends MegaLDefinition>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__ETD:
        getEtd().clear();
        getEtd().addAll((Collection<? extends ETD>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__RTD:
        getRtd().clear();
        getRtd().addAll((Collection<? extends RTD>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__ED:
        getEd().clear();
        getEd().addAll((Collection<? extends ED>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__RD:
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
      case MegaLPackage.MEGA_LDEFINITION__LINKER:
        setLinker((MegaLLinking)null);
        return;
      case MegaLPackage.MEGA_LDEFINITION__IMPORTS:
        getImports().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__ETD:
        getEtd().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__RTD:
        getRtd().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__ED:
        getEd().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__RD:
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
      case MegaLPackage.MEGA_LDEFINITION__LINKER:
        return linker != null;
      case MegaLPackage.MEGA_LDEFINITION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__ETD:
        return etd != null && !etd.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__RTD:
        return rtd != null && !rtd.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__ED:
        return ed != null && !ed.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__RD:
        return rd != null && !rd.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MegaLDefinitionImpl
