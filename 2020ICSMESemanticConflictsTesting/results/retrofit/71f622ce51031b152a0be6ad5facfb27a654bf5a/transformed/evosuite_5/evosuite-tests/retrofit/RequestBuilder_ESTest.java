/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 13:40:17 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import retrofit.RequestBuilder;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.GsonConverter;
import retrofit.mime.TypedFile;
import retrofit.mime.TypedOutput;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestBuilder_ESTest extends RequestBuilder_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "/";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder1.args(requestBuilder0.args);
      RequestBuilder requestBuilder3 = requestBuilder2.headers(requestBuilder1.headers);
      RequestBuilder requestBuilder4 = requestBuilder3.args(requestBuilder2.args);
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
  public void test01()  throws Throwable  {
      String string0 = "";
      Class<Float> class0 = Float.TYPE;
      List<Header> list0 = null;
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      requestBuilder1.converter = requestBuilder0.converter;
      RequestBuilder requestBuilder2 = requestBuilder1.methodInfo(requestBuilder0.methodInfo);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) requestBuilder1;
      objectArray0[1] = (Object) requestBuilder0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) requestBuilder2;
      objectArray0[4] = (Object) requestBuilder0;
      objectArray0[5] = (Object) requestBuilder2;
      objectArray0[6] = (Object) linkedList0;
      objectArray0[7] = (Object) requestBuilder0;
      requestBuilder2.args = objectArray0;
      // Undeclared exception!
      try { 
        requestBuilder2.buildBody();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      String string0 = "x";
      String string1 = ", ";
      int int0 = 63;
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      int int0 = (-1);
      Random.setNextRandom(int0);
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "@2N6v\"#*";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      Object[] objectArray0 = new Object[0];
      RequestBuilder requestBuilder2 = requestBuilder0.args(objectArray0);
      RequestBuilder requestBuilder3 = requestBuilder2.apiUrl(requestBuilder0.apiUrl);
      RequestBuilder requestBuilder4 = requestBuilder2.methodInfo(requestBuilder3.methodInfo);
      RequestBuilder requestBuilder5 = requestBuilder3.headers(requestBuilder1.headers);
      requestBuilder5.converter = requestBuilder4.converter;
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
      String string0 = null;
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      RequestBuilder requestBuilder2 = requestBuilder0.args(requestBuilder1.args);
      requestBuilder2.args = requestBuilder1.args;
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
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      String string0 = "";
      RequestBuilder requestBuilder2 = requestBuilder1.apiUrl(string0);
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      StringWriter stringWriter0 = new StringWriter();
      char char0 = 'E';
      StringWriter stringWriter1 = stringWriter0.append(char0);
      int int0 = 0;
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) requestBuilder0.apiUrl, int0, int0);
      StringWriter stringWriter3 = stringWriter2.append((CharSequence) requestBuilder2.apiUrl);
      gson0.toJson((JsonElement) jsonNull0, (Appendable) stringWriter3);
      Header header0 = new Header(string0, string0);
      Header header1 = linkedList0.pollLast();
      TypedOutput typedOutput0 = gsonConverter0.toBody(header0);
      RequestBuilder requestBuilder3 = requestBuilder2.args(requestBuilder0.args);
      RequestBuilder requestBuilder4 = requestBuilder2.args(requestBuilder1.args);
      requestBuilder3.apiUrl = requestBuilder2.apiUrl;
      RequestBuilder requestBuilder5 = requestBuilder3.args(requestBuilder0.args);
      RequestBuilder requestBuilder6 = requestBuilder3.args(requestBuilder2.args);
      // Undeclared exception!
      try { 
        requestBuilder6.buildRelativeUrl();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) requestBuilder0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      RequestBuilder requestBuilder2 = requestBuilder1.args(objectArray0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      String string0 = "Lz";
      requestBuilder0.apiUrl = string0;
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
  public void test10()  throws Throwable  {
      RequestBuilder requestBuilder0 = new RequestBuilder();
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      String string0 = "5<23s>={BLa+!r/";
      String string1 = "3";
      Header header0 = new Header(string1, string1);
      boolean boolean0 = linkedList0.offerLast(header0);
      RequestBuilder requestBuilder2 = requestBuilder1.apiUrl(string0);
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
}
