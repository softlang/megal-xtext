/**
 */
package org.softlang.megal.megaL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.softlang.megal.megaL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegaLFactoryImpl extends EFactoryImpl implements MegaLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MegaLFactory init()
  {
    try
    {
      MegaLFactory theMegaLFactory = (MegaLFactory)EPackage.Registry.INSTANCE.getEFactory(MegaLPackage.eNS_URI);
      if (theMegaLFactory != null)
      {
        return theMegaLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MegaLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MegaLPackage.MEGA_L: return createMegaL();
      case MegaLPackage.ETDR: return createETDR();
      case MegaLPackage.ETD_ENTITY: return createETDEntity();
      case MegaLPackage.ETD_DECLARED: return createETDDeclared();
      case MegaLPackage.ETD: return createETD();
      case MegaLPackage.RTD: return createRTD();
      case MegaLPackage.ED: return createED();
      case MegaLPackage.RD: return createRD();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaL createMegaL()
  {
    MegaLImpl megaL = new MegaLImpl();
    return megaL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDR createETDR()
  {
    ETDRImpl etdr = new ETDRImpl();
    return etdr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDEntity createETDEntity()
  {
    ETDEntityImpl etdEntity = new ETDEntityImpl();
    return etdEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETDDeclared createETDDeclared()
  {
    ETDDeclaredImpl etdDeclared = new ETDDeclaredImpl();
    return etdDeclared;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD createETD()
  {
    ETDImpl etd = new ETDImpl();
    return etd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTD createRTD()
  {
    RTDImpl rtd = new RTDImpl();
    return rtd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ED createED()
  {
    EDImpl ed = new EDImpl();
    return ed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RD createRD()
  {
    RDImpl rd = new RDImpl();
    return rd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLPackage getMegaLPackage()
  {
    return (MegaLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MegaLPackage getPackage()
  {
    return MegaLPackage.eINSTANCE;
  }

} //MegaLFactoryImpl
