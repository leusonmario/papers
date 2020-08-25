/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 30 04:34:44 GMT 2020
 */

package com.netflix.appinfo;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ApplicationInfoManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.netflix.appinfo.ApplicationInfoManager"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/eureka/6tb09030e95e118a784ca7ec616398a4f0e384bcd/evosuite_5"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ApplicationInfoManager_ESTest_scaffolding.class.getClassLoader() ,
      "com.netflix.appinfo.InstanceInfo$InstanceStatus",
      "com.netflix.appinfo.DataCenterInfo$Name",
      "com.netflix.appinfo.ApplicationInfoManager$StatusChangeListener",
      "com.thoughtworks.xstream.annotations.XStreamAlias",
      "com.netflix.appinfo.InstanceInfo",
      "com.thoughtworks.xstream.annotations.XStreamOmitField",
      "com.netflix.appinfo.EurekaInstanceConfig",
      "com.netflix.appinfo.PropertiesInstanceConfig",
      "com.netflix.discovery.converters.Auto",
      "com.netflix.appinfo.DataCenterInfo",
      "com.netflix.appinfo.InstanceInfo$Builder",
      "com.netflix.appinfo.InstanceInfo$PortType",
      "com.netflix.appinfo.ApplicationInfoManager",
      "com.netflix.appinfo.AmazonInfo",
      "com.netflix.discovery.shared.Pair",
      "com.netflix.discovery.StatusChangeEvent",
      "com.netflix.appinfo.InstanceInfo$1",
      "com.netflix.appinfo.CloudInstanceConfig",
      "com.netflix.appinfo.AbstractInstanceConfig",
      "com.netflix.appinfo.AmazonInfo$MetaDataKey$1",
      "com.netflix.appinfo.LeaseInfo$1",
      "com.netflix.appinfo.AmazonInfo$MetaDataKey",
      "com.netflix.appinfo.AmazonInfo$MetaDataKey$2",
      "com.netflix.appinfo.MyDataCenterInstanceConfig",
      "com.netflix.appinfo.InstanceInfo$ActionType",
      "com.netflix.discovery.provider.Serializer",
      "com.netflix.appinfo.UniqueIdentifier",
      "com.netflix.appinfo.LeaseInfo"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.netflix.appinfo.ApplicationInfoManager$StatusChangeListener", false, ApplicationInfoManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.netflix.appinfo.InstanceInfo", false, ApplicationInfoManager_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ApplicationInfoManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.netflix.appinfo.ApplicationInfoManager",
      "com.netflix.discovery.shared.Pair",
      "com.netflix.appinfo.AbstractInstanceConfig",
      "com.netflix.appinfo.PropertiesInstanceConfig",
      "com.netflix.appinfo.InstanceInfo",
      "com.netflix.appinfo.AmazonInfo",
      "com.netflix.appinfo.AmazonInfo$MetaDataKey"
    );
  }
}
