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
      case MegaLPackage.MODEL: return createModel();
      case MegaLPackage.MEGA_LDEFINITION: return createMegaLDefinition();
      case MegaLPackage.IMPORT: return createImport();
      case MegaLPackage.ETD: return createETD();
      case MegaLPackage.RTD: return createRTD();
      case MegaLPackage.ED_GROUP: return createEDGroup();
      case MegaLPackage.ED: return createED();
      case MegaLPackage.RD: return createRD();
      case MegaLPackage.MEGA_LLINKING: return createMegaLLinking();
      case MegaLPackage.LD: return createLD();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLDefinition createMegaLDefinition()
  {
    MegaLDefinitionImpl megaLDefinition = new MegaLDefinitionImpl();
    return megaLDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public EDGroup createEDGroup()
  {
    EDGroupImpl edGroup = new EDGroupImpl();
    return edGroup;
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
  public MegaLLinking createMegaLLinking()
  {
    MegaLLinkingImpl megaLLinking = new MegaLLinkingImpl();
    return megaLLinking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LD createLD()
  {
    LDImpl ld = new LDImpl();
    return ld;
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
