/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 13:45:14 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import retrofit.RequestBuilder;
import retrofit.RestMethodInfo;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;
import retrofit.mime.FormUrlEncodedTypedOutput;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedFile;
import retrofit.mime.TypedOutput;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestBuilder_ESTest extends RequestBuilder_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "UTF-8";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      // Undeclared exception!
      try { 
        requestBuilder1.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder1.headers(requestBuilder0.headers);
      RequestBuilder requestBuilder3 = requestBuilder2.args(requestBuilder0.args);
      requestBuilder3.apiUrl = requestBuilder0.apiUrl;
      RequestBuilder requestBuilder4 = requestBuilder3.methodInfo(requestBuilder0.methodInfo);
      RequestBuilder requestBuilder5 = requestBuilder1.headers(requestBuilder0.headers);
      // Undeclared exception!
      try { 
        requestBuilder4.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      int int0 = (-3078);
      Integer integer0 = new Integer(int0);
      String string0 = "TT$SIS_}j4K";
      Integer integer1 = new Integer(int0);
      String string1 = null;
      // Undeclared exception!
      try { 
        Integer.decode(string1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) requestBuilder0;
      objectArray0[1] = (Object) requestBuilder0;
      objectArray0[2] = (Object) requestBuilder0;
      objectArray0[3] = (Object) requestBuilder0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      requestBuilder1.converter = (Converter) gsonConverter0;
      requestBuilder1.args = requestBuilder0.args;
      RequestBuilder requestBuilder2 = requestBuilder1.args(requestBuilder0.args);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[0];
      RestMethodInfo restMethodInfo0 = null;
      FormUrlEncodedTypedOutput formUrlEncodedTypedOutput0 = new FormUrlEncodedTypedOutput();
      String string0 = gson0.toJson((Object) formUrlEncodedTypedOutput0);
      RequestBuilder requestBuilder1 = requestBuilder0.methodInfo(restMethodInfo0);
      RequestBuilder requestBuilder2 = requestBuilder1.methodInfo(restMethodInfo0);
      RequestBuilder requestBuilder3 = requestBuilder0.args(objectArray0);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      TypedOutput typedOutput0 = gsonConverter0.toBody(requestBuilder3);
      // Undeclared exception!
      try { 
        linkedList0.removeFirst();
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[1];
      String string0 = "_9n.bd1U0\\";
      Boolean boolean0 = Boolean.valueOf(string0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<Byte> class0 = Byte.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BOOLEAN
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      objectArray0[2] = (Object) gson0;
      objectArray0[3] = (Object) requestBuilder0;
      objectArray0[4] = (Object) gsonConverter0;
      objectArray0[5] = (Object) gson0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      // Undeclared exception!
      try { 
        requestBuilder1.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      RestMethodInfo restMethodInfo0 = null;
      RequestBuilder requestBuilder1 = requestBuilder0.methodInfo(restMethodInfo0);
      // Undeclared exception!
      try { 
        requestBuilder1.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      RestMethodInfo restMethodInfo0 = null;
      RequestBuilder requestBuilder1 = requestBuilder0.methodInfo(restMethodInfo0);
      requestBuilder0.converter = requestBuilder1.converter;
      RequestBuilder requestBuilder2 = requestBuilder1.args(requestBuilder0.args);
      RequestBuilder requestBuilder3 = requestBuilder2.apiUrl(requestBuilder0.apiUrl);
      RequestBuilder requestBuilder4 = requestBuilder3.headers(requestBuilder2.headers);
      String string0 = null;
      requestBuilder1.converter = requestBuilder0.converter;
      RequestBuilder requestBuilder5 = requestBuilder1.args(requestBuilder0.args);
      RequestBuilder requestBuilder6 = requestBuilder2.apiUrl(string0);
      RequestBuilder requestBuilder7 = requestBuilder1.args(requestBuilder2.args);
      RequestBuilder requestBuilder8 = requestBuilder7.methodInfo(requestBuilder5.methodInfo);
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
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      requestBuilder0.converter = (Converter) gsonConverter0;
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
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      String string0 = null;
      requestBuilder0.apiUrl = string0;
      requestBuilder0.apiUrl = string0;
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
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

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "ai";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
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
}
