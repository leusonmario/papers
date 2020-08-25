/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 29 02:02:13 GMT 2020
 */

package com.squareup.okhttp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OkHttpClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.squareup.okhttp.OkHttpClient"; 
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
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/okhttp/35166168529bd27281685e56a0a122eff44460e9/evosuite_23"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OkHttpClient_ESTest_scaffolding.class.getClassLoader() ,
      "com.squareup.okhttp.internal.DiskLruCache$Entry",
      "com.squareup.okhttp.internal.http.HttpURLConnectionImpl$1",
      "com.squareup.okhttp.internal.http.HttpURLConnectionImpl",
      "com.squareup.okhttp.internal.http.RetryableOutputStream",
      "com.squareup.okhttp.internal.spdy.SpdyReader$2",
      "com.squareup.okhttp.internal.spdy.SpdyReader$1",
      "com.squareup.okhttp.TunnelRequest",
      "com.squareup.okhttp.OkAuthenticator$Credential",
      "com.squareup.okhttp.internal.http.HttpsURLConnectionImpl$HttpUrlConnectionDelegate",
      "com.squareup.okhttp.internal.http.HttpsURLConnectionImpl$HttpsEngine",
      "com.squareup.okhttp.ConnectionPool",
      "com.squareup.okhttp.internal.FaultRecoveringOutputStream",
      "com.squareup.okhttp.internal.spdy.SpdyReader$Handler",
      "com.squareup.okhttp.internal.http.OkResponseCacheAdapter",
      "com.squareup.okhttp.HttpResponseCache$2",
      "com.squareup.okhttp.internal.DiskLruCache$Editor$FaultHidingOutputStream",
      "com.squareup.okhttp.internal.http.RawHeaders$1",
      "com.squareup.okhttp.internal.http.HeaderParser$CacheControlHandler",
      "com.squareup.okhttp.internal.spdy.SpdyReader",
      "com.squareup.okhttp.internal.http.HttpsURLConnectionImpl",
      "com.squareup.okhttp.HttpResponseCache$CacheRequestImpl$1",
      "com.squareup.okhttp.internal.DiskLruCache$Editor",
      "com.squareup.okhttp.internal.http.HttpURLConnectionImpl$Retry",
      "com.squareup.okhttp.internal.http.HttpAuthenticator",
      "com.squareup.okhttp.internal.DiskLruCache",
      "com.squareup.okhttp.internal.spdy.SpdyConnection",
      "com.squareup.okhttp.internal.http.RequestHeaders",
      "com.squareup.okhttp.internal.spdy.SpdyStream$SpdyDataInputStream",
      "com.squareup.okhttp.internal.spdy.SpdyStream$SpdyDataOutputStream",
      "com.squareup.okhttp.internal.spdy.Settings",
      "com.squareup.okhttp.internal.Util",
      "com.squareup.okhttp.internal.DiskLruCache$1",
      "com.squareup.okhttp.internal.DiskLruCache$2",
      "com.squareup.okhttp.internal.http.RawHeaders",
      "com.squareup.okhttp.HttpResponseCache$Entry",
      "com.squareup.okhttp.HttpResponseCache$CacheRequestImpl",
      "com.squareup.okhttp.internal.http.Transport",
      "com.squareup.okhttp.internal.spdy.IncomingStreamHandler$1",
      "com.squareup.okhttp.internal.http.RouteSelector",
      "com.squareup.okhttp.Connection",
      "com.squareup.okhttp.HttpResponseCache$EntrySecureCacheResponse",
      "com.squareup.okhttp.internal.http.HttpAuthenticator$1",
      "com.squareup.okhttp.OkAuthenticator",
      "com.squareup.okhttp.internal.StrictLineReader",
      "com.squareup.okhttp.internal.spdy.SpdyStream",
      "com.squareup.okhttp.internal.http.HttpEngine",
      "com.squareup.okhttp.ConnectionPool$1",
      "com.squareup.okhttp.OkHttpClient",
      "com.squareup.okhttp.internal.spdy.IncomingStreamHandler",
      "com.squareup.okhttp.HttpResponseCache",
      "com.squareup.okhttp.internal.http.OkResponseCache",
      "com.squareup.okhttp.internal.StrictLineReader$1",
      "com.squareup.okhttp.ResponseSource",
      "com.squareup.okhttp.internal.DiskLruCache$Snapshot",
      "com.squareup.okhttp.Route",
      "com.squareup.okhttp.Address",
      "com.squareup.okhttp.internal.http.HttpEngine$1",
      "com.squareup.okhttp.internal.http.ResponseHeaders",
      "com.squareup.okhttp.HttpResponseCache$EntryCacheResponse",
      "com.squareup.okhttp.internal.spdy.Ping",
      "com.squareup.okhttp.internal.AbstractOutputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OkHttpClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.squareup.okhttp.internal.Util",
      "com.squareup.okhttp.OkHttpClient",
      "com.squareup.okhttp.internal.http.HttpAuthenticator$1",
      "com.squareup.okhttp.internal.http.HttpAuthenticator",
      "com.squareup.okhttp.ConnectionPool$1",
      "com.squareup.okhttp.ConnectionPool"
    );
  }
}
