/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.gratex.oomph.task.server.Server;
import com.gratex.oomph.task.server.ServerFactory;
import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.TomcatServerTask;
import com.gratex.oomph.task.server.TomcatServerVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerPackageImpl extends EPackageImpl implements ServerPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tomcatServerTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum tomcatServerVersionEEnum = null;

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
   * @see com.gratex.oomph.task.server.ServerPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ServerPackageImpl()
  {
    super(eNS_URI, ServerFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ServerPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ServerPackage init()
  {
    if (isInited)
    {
      return (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);
    }

    // Obtain or create and register package
    Object registeredServerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ServerPackageImpl theServerPackage = registeredServerPackage instanceof ServerPackageImpl ? (ServerPackageImpl)registeredServerPackage
        : new ServerPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    BasePackage.eINSTANCE.eClass();
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theServerPackage.createPackageContents();

    // Initialize created meta-data
    theServerPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theServerPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ServerPackage.eNS_URI, theServerPackage);
    return theServerPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTomcatServerTask()
  {
    return tomcatServerTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTomcatServerTask_JreVersion()
  {
    return (EAttribute)tomcatServerTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTomcatServerTask_Port()
  {
    return (EAttribute)tomcatServerTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTomcatServerTask_HttpsPort()
  {
    return (EAttribute)tomcatServerTaskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTomcatServerTask_ServerVersion()
  {
    return (EAttribute)tomcatServerTaskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTomcatServerTask_LaunchProgramArgs()
  {
    return (EAttribute)tomcatServerTaskEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTomcatServerTask_LaunchVmArgs()
  {
    return (EAttribute)tomcatServerTaskEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getServer()
  {
    return serverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_ServerName()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_Location()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_RuntimeName()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_Hostname()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_CleanPreviousRuntimes()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_StartTimeout()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getServer_StopTimeout()
  {
    return (EAttribute)serverEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTomcatServerVersion()
  {
    return tomcatServerVersionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServerFactory getServerFactory()
  {
    return (ServerFactory)getEFactoryInstance();
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
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    tomcatServerTaskEClass = createEClass(TOMCAT_SERVER_TASK);
    createEAttribute(tomcatServerTaskEClass, TOMCAT_SERVER_TASK__JRE_VERSION);
    createEAttribute(tomcatServerTaskEClass, TOMCAT_SERVER_TASK__PORT);
    createEAttribute(tomcatServerTaskEClass, TOMCAT_SERVER_TASK__HTTPS_PORT);
    createEAttribute(tomcatServerTaskEClass, TOMCAT_SERVER_TASK__SERVER_VERSION);
    createEAttribute(tomcatServerTaskEClass, TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS);
    createEAttribute(tomcatServerTaskEClass, TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS);

    serverEClass = createEClass(SERVER);
    createEAttribute(serverEClass, SERVER__SERVER_NAME);
    createEAttribute(serverEClass, SERVER__LOCATION);
    createEAttribute(serverEClass, SERVER__RUNTIME_NAME);
    createEAttribute(serverEClass, SERVER__HOSTNAME);
    createEAttribute(serverEClass, SERVER__CLEAN_PREVIOUS_RUNTIMES);
    createEAttribute(serverEClass, SERVER__START_TIMEOUT);
    createEAttribute(serverEClass, SERVER__STOP_TIMEOUT);

    // Create enums
    tomcatServerVersionEEnum = createEEnum(TOMCAT_SERVER_VERSION);
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
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    tomcatServerTaskEClass.getESuperTypes().add(getServer());
    serverEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(tomcatServerTaskEClass, TomcatServerTask.class, "TomcatServerTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTomcatServerTask_JreVersion(), ecorePackage.getEString(), "jreVersion", null, 1, 1, TomcatServerTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTomcatServerTask_Port(), ecorePackage.getEString(), "port", "8080", 1, 1, TomcatServerTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTomcatServerTask_HttpsPort(), ecorePackage.getEString(), "httpsPort", "8443", 1, 1, TomcatServerTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTomcatServerTask_ServerVersion(), getTomcatServerVersion(), "serverVersion", null, 1, 1, TomcatServerTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTomcatServerTask_LaunchProgramArgs(), ecorePackage.getEString(), "launchProgramArgs", "", 0, 1, TomcatServerTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTomcatServerTask_LaunchVmArgs(), ecorePackage.getEString(), "launchVmArgs", "", 0, 1, TomcatServerTask.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serverEClass, Server.class, "Server", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServer_ServerName(), ecorePackage.getEString(), "serverName", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServer_Location(), ecorePackage.getEString(), "location", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServer_RuntimeName(), ecorePackage.getEString(), "runtimeName", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServer_Hostname(), ecorePackage.getEString(), "hostname", "localhost", 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServer_CleanPreviousRuntimes(), ecorePackage.getEBoolean(), "cleanPreviousRuntimes", "false", 0, 1, Server.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServer_StartTimeout(), ecorePackage.getEString(), "startTimeout", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServer_StopTimeout(), ecorePackage.getEString(), "stopTimeout", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(tomcatServerVersionEEnum, TomcatServerVersion.class, "TomcatServerVersion");
    addEEnumLiteral(tomcatServerVersionEEnum, TomcatServerVersion.TOMCAT70);
    addEEnumLiteral(tomcatServerVersionEEnum, TomcatServerVersion.TOMCAT80);
    addEEnumLiteral(tomcatServerVersionEEnum, TomcatServerVersion.TOMCAT85);
    addEEnumLiteral(tomcatServerVersionEEnum, TomcatServerVersion.TOMCAT90);

    // Create resource
    createResource("https://raw.githubusercontent.com/gratex/oomph-task-server/master/com.gratex.oomph.task.server/model/Server-1.0.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation",
        "https://raw.githubusercontent.com/gratex/oomph-task-server/master/com.gratex.oomph.task.server/model/Server-1.0.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(tomcatServerTaskEClass, source, new String[] { "variableName", "p2.server", "repository",
        "https://gratex.github.io/oomph-task-server/repository/", "installableUnits", "com.gratex.oomph.task.server.feature.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(tomcatServerTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
  }

} // ServerPackageImpl
