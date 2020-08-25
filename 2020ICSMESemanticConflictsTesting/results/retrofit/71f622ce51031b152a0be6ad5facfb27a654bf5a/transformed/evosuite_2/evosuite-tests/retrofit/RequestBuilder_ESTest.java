/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 13:23:40 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import java.io.FileDescriptor;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import retrofit.RequestBuilder;
import retrofit.RestMethodInfo;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.GsonConverter;
import retrofit.mime.MultipartTypedOutput;
import retrofit.mime.TypedOutput;
import retrofit.mime.TypedString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestBuilder_ESTest extends RequestBuilder_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      Object[] objectArray0 = new Object[3];
      Excluder excluder0 = Excluder.DEFAULT;
      double double0 = 0.0;
      Excluder excluder1 = excluder0.withVersion(double0);
      TypeToken<TypedString> typeToken0 = null;
      Object object1 = new Object();
      objectArray0[1] = object1;
      String string0 = "@JD?wTf66";
      String string1 = "";
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      RequestBuilder requestBuilder2 = requestBuilder1.apiUrl(requestBuilder0.apiUrl);
      String string0 = "";
      requestBuilder2.apiUrl = string0;
      // Undeclared exception!
      try { 
        requestBuilder2.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Gson gson0 = new Gson();
          GsonConverter gsonConverter0 = new GsonConverter(gson0);
          RequestBuilder requestBuilder0 = new RequestBuilder();
          MultipartTypedOutput multipartTypedOutput0 = new MultipartTypedOutput();
          String string0 = " must start with '/'. (";
          Class<Short> class0 = Short.TYPE;
          FileDescriptor fileDescriptor0 = new FileDescriptor();
          MockFileWriter mockFileWriter0 = null;
          try {
            mockFileWriter0 = new MockFileWriter(fileDescriptor0);
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"writeFileDescriptor\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:954)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:245)
             // java.io.FileWriter.<init>(FileWriter.java:116)
             // org.evosuite.runtime.mock.java.io.MockFileWriter.<init>(MockFileWriter.java:79)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:233)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      List<Header> list0 = null;
      RequestBuilder requestBuilder1 = requestBuilder0.headers(list0);
      RequestBuilder requestBuilder2 = requestBuilder1.apiUrl(requestBuilder0.apiUrl);
      RequestBuilder requestBuilder3 = requestBuilder2.args(requestBuilder0.args);
      // Undeclared exception!
      try { 
        requestBuilder3.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "W,{qDQ&";
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      RequestBuilder requestBuilder2 = requestBuilder1.args(requestBuilder0.args);
      RequestBuilder requestBuilder3 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder4 = requestBuilder2.methodInfo(requestBuilder3.methodInfo);
      // Undeclared exception!
      try { 
        requestBuilder3.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "Unknown request type ";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder0.methodInfo(requestBuilder0.methodInfo);
      RequestBuilder requestBuilder3 = requestBuilder2.args(requestBuilder0.args);
      // Undeclared exception!
      try { 
        requestBuilder3.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "}";
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) requestBuilder0;
      objectArray0[1] = (Object) string0;
      objectArray0[2] = (Object) requestBuilder0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      RequestBuilder requestBuilder2 = requestBuilder1.headers(requestBuilder0.headers);
      requestBuilder0.apiUrl = string0;
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = false;
      boolean boolean1 = true;
      boolean boolean2 = FileSystemHandling.setPermissions(evoSuiteFile0, boolean0, boolean1, boolean1);
      String string1 = "Hyr)a92";
      RequestBuilder requestBuilder3 = requestBuilder0.apiUrl(string1);
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      RequestBuilder requestBuilder2 = requestBuilder1.methodInfo(requestBuilder0.methodInfo);
      String string0 = null;
      RequestBuilder requestBuilder3 = requestBuilder2.apiUrl(string0);
      RequestBuilder requestBuilder4 = requestBuilder3.apiUrl(requestBuilder0.apiUrl);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      // Undeclared exception!
      try { 
        requestBuilder0.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      // Undeclared exception!
      try { 
        requestBuilder0.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "^9 p![~B3(-#";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder1.headers(requestBuilder0.headers);
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[0];
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      // Undeclared exception!
      try { 
        requestBuilder1.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }
}
