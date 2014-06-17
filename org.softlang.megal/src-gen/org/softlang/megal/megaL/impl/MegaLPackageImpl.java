/**
 */
package org.softlang.megal.megaL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.softlang.megal.megaL.ETDDeclared;
import org.softlang.megal.megaL.ETDEntity;
import org.softlang.megal.megaL.MegaLDefinition;
import org.softlang.megal.megaL.MegaLFactory;
import org.softlang.megal.megaL.MegaLLinking;
import org.softlang.megal.megaL.MegaLPackage;
import org.softlang.megal.megaL.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegaLPackageImpl extends EPackageImpl implements MegaLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass megaLDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etdrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etdEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etdDeclaredEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass megaLLinkingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.softlang.megal.megaL.MegaLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MegaLPackageImpl()
  {
    super(eNS_URI, MegaLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MegaLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MegaLPackage init()
  {
    if (isInited) return (MegaLPackage)EPackage.Registry.INSTANCE.getEPackage(MegaLPackage.eNS_URI);

    // Obtain or create and register package
    MegaLPackageImpl theMegaLPackage = (MegaLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MegaLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MegaLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMegaLPackage.createPackageContents();

    // Initialize created meta-data
    theMegaLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMegaLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MegaLPackage.eNS_URI, theMegaLPackage);
    return theMegaLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMegaLDefinition()
  {
    return megaLDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLDefinition_Linker()
  {
    return (EReference)megaLDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLDefinition_Imports()
  {
    return (EReference)megaLDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLDefinition_Etd()
  {
    return (EReference)megaLDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLDefinition_Rtd()
  {
    return (EReference)megaLDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLDefinition_Ed()
  {
    return (EReference)megaLDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLDefinition_Rd()
  {
    return (EReference)megaLDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDR()
  {
    return etdrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDEntity()
  {
    return etdEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETDDeclared()
  {
    return etdDeclaredEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETDDeclared_Reference()
  {
    return (EReference)etdDeclaredEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETD()
  {
    return etdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getETD_Name()
  {
    return (EAttribute)etdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETD_Supertype()
  {
    return (EReference)etdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTD()
  {
    return rtdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRTD_Name()
  {
    return (EAttribute)rtdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTD_Domain()
  {
    return (EReference)rtdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTD_CoDomain()
  {
    return (EReference)rtdEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getED()
  {
    return edEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getED_Name()
  {
    return (EAttribute)edEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getED_Type()
  {
    return (EReference)edEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRD()
  {
    return rdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRD_Source()
  {
    return (EReference)rdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRD_Rel()
  {
    return (EReference)rdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRD_Target()
  {
    return (EReference)rdEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMegaLLinking()
  {
    return megaLLinkingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLLinking_Target()
  {
    return (EReference)megaLLinkingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMegaLLinking_Links()
  {
    return (EReference)megaLLinkingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLD()
  {
    return ldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLD_Target()
  {
    return (EReference)ldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLD_Key()
  {
    return (EAttribute)ldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLD_Value()
  {
    return (EAttribute)ldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MegaLFactory getMegaLFactory()
  {
    return (MegaLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__NAME);

    megaLDefinitionEClass = createEClass(MEGA_LDEFINITION);
    createEReference(megaLDefinitionEClass, MEGA_LDEFINITION__LINKER);
    createEReference(megaLDefinitionEClass, MEGA_LDEFINITION__IMPORTS);
    createEReference(megaLDefinitionEClass, MEGA_LDEFINITION__ETD);
    createEReference(megaLDefinitionEClass, MEGA_LDEFINITION__RTD);
    createEReference(megaLDefinitionEClass, MEGA_LDEFINITION__ED);
    createEReference(megaLDefinitionEClass, MEGA_LDEFINITION__RD);

    etdrEClass = createEClass(ETDR);

    etdEntityEClass = createEClass(ETD_ENTITY);

    etdDeclaredEClass = createEClass(ETD_DECLARED);
    createEReference(etdDeclaredEClass, ETD_DECLARED__REFERENCE);

    etdEClass = createEClass(ETD);
    createEAttribute(etdEClass, ETD__NAME);
    createEReference(etdEClass, ETD__SUPERTYPE);

    rtdEClass = createEClass(RTD);
    createEAttribute(rtdEClass, RTD__NAME);
    createEReference(rtdEClass, RTD__DOMAIN);
    createEReference(rtdEClass, RTD__CO_DOMAIN);

    edEClass = createEClass(ED);
    createEAttribute(edEClass, ED__NAME);
    createEReference(edEClass, ED__TYPE);

    rdEClass = createEClass(RD);
    createEReference(rdEClass, RD__SOURCE);
    createEReference(rdEClass, RD__REL);
    createEReference(rdEClass, RD__TARGET);

    megaLLinkingEClass = createEClass(MEGA_LLINKING);
    createEReference(megaLLinkingEClass, MEGA_LLINKING__TARGET);
    createEReference(megaLLinkingEClass, MEGA_LLINKING__LINKS);

    ldEClass = createEClass(LD);
    createEReference(ldEClass, LD__TARGET);
    createEAttribute(ldEClass, LD__KEY);
    createEAttribute(ldEClass, LD__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    megaLDefinitionEClass.getESuperTypes().add(this.getModel());
    etdEntityEClass.getESuperTypes().add(this.getETDR());
    etdDeclaredEClass.getESuperTypes().add(this.getETDR());
    megaLLinkingEClass.getESuperTypes().add(this.getModel());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(megaLDefinitionEClass, MegaLDefinition.class, "MegaLDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMegaLDefinition_Linker(), this.getMegaLLinking(), null, "linker", null, 0, 1, MegaLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMegaLDefinition_Imports(), this.getMegaLDefinition(), null, "imports", null, 0, -1, MegaLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMegaLDefinition_Etd(), this.getETD(), null, "etd", null, 0, -1, MegaLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMegaLDefinition_Rtd(), this.getRTD(), null, "rtd", null, 0, -1, MegaLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMegaLDefinition_Ed(), this.getED(), null, "ed", null, 0, -1, MegaLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMegaLDefinition_Rd(), this.getRD(), null, "rd", null, 0, -1, MegaLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etdrEClass, org.softlang.megal.megaL.ETDR.class, "ETDR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etdEntityEClass, ETDEntity.class, "ETDEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etdDeclaredEClass, ETDDeclared.class, "ETDDeclared", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETDDeclared_Reference(), this.getETD(), null, "reference", null, 0, 1, ETDDeclared.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(etdEClass, org.softlang.megal.megaL.ETD.class, "ETD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getETD_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.softlang.megal.megaL.ETD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getETD_Supertype(), this.getETDR(), null, "supertype", null, 0, 1, org.softlang.megal.megaL.ETD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtdEClass, org.softlang.megal.megaL.RTD.class, "RTD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRTD_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.softlang.megal.megaL.RTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRTD_Domain(), this.getETDR(), null, "domain", null, 0, 1, org.softlang.megal.megaL.RTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRTD_CoDomain(), this.getETDR(), null, "coDomain", null, 0, 1, org.softlang.megal.megaL.RTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edEClass, org.softlang.megal.megaL.ED.class, "ED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getED_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.softlang.megal.megaL.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getED_Type(), this.getETDR(), null, "type", null, 0, 1, org.softlang.megal.megaL.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rdEClass, org.softlang.megal.megaL.RD.class, "RD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRD_Source(), this.getED(), null, "source", null, 0, 1, org.softlang.megal.megaL.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRD_Rel(), this.getRTD(), null, "rel", null, 0, 1, org.softlang.megal.megaL.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRD_Target(), this.getED(), null, "target", null, 0, 1, org.softlang.megal.megaL.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(megaLLinkingEClass, MegaLLinking.class, "MegaLLinking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMegaLLinking_Target(), this.getMegaLDefinition(), null, "target", null, 0, 1, MegaLLinking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMegaLLinking_Links(), this.getLD(), null, "links", null, 0, -1, MegaLLinking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldEClass, org.softlang.megal.megaL.LD.class, "LD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLD_Target(), this.getED(), null, "target", null, 0, 1, org.softlang.megal.megaL.LD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLD_Key(), ecorePackage.getEString(), "key", null, 0, 1, org.softlang.megal.megaL.LD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLD_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.softlang.megal.megaL.LD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MegaLPackageImpl
