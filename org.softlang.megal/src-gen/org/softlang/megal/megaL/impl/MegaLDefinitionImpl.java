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

import org.softlang.megal.megaL.ED;
import org.softlang.megal.megaL.ETD;
import org.softlang.megal.megaL.Import;
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
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getEtds <em>Etds</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getRtds <em>Rtds</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getEds <em>Eds</em>}</li>
 *   <li>{@link org.softlang.megal.megaL.impl.MegaLDefinitionImpl#getRds <em>Rds</em>}</li>
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getEtds() <em>Etds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtds()
   * @generated
   * @ordered
   */
  protected EList<ETD> etds;

  /**
   * The cached value of the '{@link #getRtds() <em>Rtds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtds()
   * @generated
   * @ordered
   */
  protected EList<RTD> rtds;

  /**
   * The cached value of the '{@link #getEds() <em>Eds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEds()
   * @generated
   * @ordered
   */
  protected EList<ED> eds;

  /**
   * The cached value of the '{@link #getRds() <em>Rds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRds()
   * @generated
   * @ordered
   */
  protected EList<RD> rds;

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
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MegaLPackage.MEGA_LDEFINITION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETD> getEtds()
  {
    if (etds == null)
    {
      etds = new EObjectContainmentEList<ETD>(ETD.class, this, MegaLPackage.MEGA_LDEFINITION__ETDS);
    }
    return etds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RTD> getRtds()
  {
    if (rtds == null)
    {
      rtds = new EObjectContainmentEList<RTD>(RTD.class, this, MegaLPackage.MEGA_LDEFINITION__RTDS);
    }
    return rtds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ED> getEds()
  {
    if (eds == null)
    {
      eds = new EObjectContainmentEList<ED>(ED.class, this, MegaLPackage.MEGA_LDEFINITION__EDS);
    }
    return eds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RD> getRds()
  {
    if (rds == null)
    {
      rds = new EObjectContainmentEList<RD>(RD.class, this, MegaLPackage.MEGA_LDEFINITION__RDS);
    }
    return rds;
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
      case MegaLPackage.MEGA_LDEFINITION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__ETDS:
        return ((InternalEList<?>)getEtds()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__RTDS:
        return ((InternalEList<?>)getRtds()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__EDS:
        return ((InternalEList<?>)getEds()).basicRemove(otherEnd, msgs);
      case MegaLPackage.MEGA_LDEFINITION__RDS:
        return ((InternalEList<?>)getRds()).basicRemove(otherEnd, msgs);
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
      case MegaLPackage.MEGA_LDEFINITION__ETDS:
        return getEtds();
      case MegaLPackage.MEGA_LDEFINITION__RTDS:
        return getRtds();
      case MegaLPackage.MEGA_LDEFINITION__EDS:
        return getEds();
      case MegaLPackage.MEGA_LDEFINITION__RDS:
        return getRds();
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
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__ETDS:
        getEtds().clear();
        getEtds().addAll((Collection<? extends ETD>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__RTDS:
        getRtds().clear();
        getRtds().addAll((Collection<? extends RTD>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__EDS:
        getEds().clear();
        getEds().addAll((Collection<? extends ED>)newValue);
        return;
      case MegaLPackage.MEGA_LDEFINITION__RDS:
        getRds().clear();
        getRds().addAll((Collection<? extends RD>)newValue);
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
      case MegaLPackage.MEGA_LDEFINITION__ETDS:
        getEtds().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__RTDS:
        getRtds().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__EDS:
        getEds().clear();
        return;
      case MegaLPackage.MEGA_LDEFINITION__RDS:
        getRds().clear();
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
      case MegaLPackage.MEGA_LDEFINITION__ETDS:
        return etds != null && !etds.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__RTDS:
        return rtds != null && !rtds.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__EDS:
        return eds != null && !eds.isEmpty();
      case MegaLPackage.MEGA_LDEFINITION__RDS:
        return rds != null && !rds.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MegaLDefinitionImpl
