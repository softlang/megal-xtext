/**
 */
package org.softlang.megal.megaL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.softlang.megal.megaL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.megaL.MegaLPackage
 * @generated
 */
public class MegaLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MegaLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MegaLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MegaLSwitch<Adapter> modelSwitch =
    new MegaLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseMegaLDefinition(MegaLDefinition object)
      {
        return createMegaLDefinitionAdapter();
      }
      @Override
      public Adapter caseETDR(ETDR object)
      {
        return createETDRAdapter();
      }
      @Override
      public Adapter caseETDEntity(ETDEntity object)
      {
        return createETDEntityAdapter();
      }
      @Override
      public Adapter caseETDDeclared(ETDDeclared object)
      {
        return createETDDeclaredAdapter();
      }
      @Override
      public Adapter caseETD(ETD object)
      {
        return createETDAdapter();
      }
      @Override
      public Adapter caseRTD(RTD object)
      {
        return createRTDAdapter();
      }
      @Override
      public Adapter caseED(ED object)
      {
        return createEDAdapter();
      }
      @Override
      public Adapter caseRD(RD object)
      {
        return createRDAdapter();
      }
      @Override
      public Adapter caseMegaLLinking(MegaLLinking object)
      {
        return createMegaLLinkingAdapter();
      }
      @Override
      public Adapter caseLD(LD object)
      {
        return createLDAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.MegaLDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.MegaLDefinition
   * @generated
   */
  public Adapter createMegaLDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.ETDR <em>ETDR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.ETDR
   * @generated
   */
  public Adapter createETDRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.ETDEntity <em>ETD Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.ETDEntity
   * @generated
   */
  public Adapter createETDEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.ETDDeclared <em>ETD Declared</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.ETDDeclared
   * @generated
   */
  public Adapter createETDDeclaredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.ETD <em>ETD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.ETD
   * @generated
   */
  public Adapter createETDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.RTD <em>RTD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.RTD
   * @generated
   */
  public Adapter createRTDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.ED <em>ED</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.ED
   * @generated
   */
  public Adapter createEDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.RD <em>RD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.RD
   * @generated
   */
  public Adapter createRDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.MegaLLinking <em>Linking</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.MegaLLinking
   * @generated
   */
  public Adapter createMegaLLinkingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.softlang.megal.megaL.LD <em>LD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.softlang.megal.megaL.LD
   * @generated
   */
  public Adapter createLDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MegaLAdapterFactory
