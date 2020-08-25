/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 04:27:08 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      String string0 = "Wt'%$";
      String string1 = "j7,J@{WkL.6db8P3O";
      InputStream inputStream0 = null;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1, inputStream0);
      String string2 = httpConnection_KeyVal0.key();
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "\\\\`K-PLJ%";
      String string1 = "xt X";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      InputStream inputStream0 = null;
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream(inputStream0);
      String string2 = "/=Y++|";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.key(string2);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal2.inputStream(inputStream0);
      String string3 = httpConnection_KeyVal1.toString();
      int int0 = (-1467);
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(inputStream0, int0);
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = "form";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      URL uRL0 = MockURL.getFileExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.value(string0);
      Map<String, String> map0 = httpConnection_Response0.cookies;
      httpConnection_Response0.cookies = map0;
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string0);
      // Undeclared exception!
      try { 
        httpConnection_Response0.body();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      String string0 = "vxJ9Coojvx";
      String string1 = "yVv5'BRMlrbh3z";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      byte[] byteArray0 = new byte[1];
      String string2 = "{W'`t";
      String string3 = "org.jsoup.select.Evaluator$Attribute";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      int int0 = 0;
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(pipedOutputStream0, int0);
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "w3bjqndt";
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = hashMap0.put(string0, linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string1 = "dd";
      String string2 = "0dD #eY/lT.";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string1, string2);
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)52;
      byteArray0[0] = byte0;
      byte byte1 = (byte)73;
      byteArray0[1] = byte1;
      int int0 = (-6276);
      int int1 = 0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, int0, int1);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) byteArrayInputStream0);
      String string3 = "Otr";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.value(string3);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal2.value(string0);
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal2.value(string1);
      String string4 = "1RN3qwe/A3{2";
      HttpConnection.KeyVal httpConnection_KeyVal5 = httpConnection_KeyVal2.value(string4);
      HttpConnection.KeyVal httpConnection_KeyVal6 = httpConnection_KeyVal2.key(string0);
      String string5 = "^-se(p1#e{_T)RMW]^?";
      HttpConnection.KeyVal httpConnection_KeyVal7 = httpConnection_KeyVal2.key(string5);
      String string6 = httpConnection_Response0.contentType();
      boolean boolean0 = httpConnection_KeyVal3.hasInputStream();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "";
      String string1 = "%22";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream(pipedOutputStream0);
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = ")NkO{3G";
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean1 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      EvoSuiteFile evoSuiteFile1 = null;
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-119);
      byteArray0[1] = byte0;
      byte byte1 = (byte)0;
      byteArray0[2] = byte1;
      boolean boolean2 = FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      boolean boolean3 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      String string1 = "\"GO?u";
      boolean boolean4 = FileSystemHandling.appendStringToFile(evoSuiteFile1, string1);
      boolean boolean5 = true;
      boolean boolean6 = FileSystemHandling.setPermissions(evoSuiteFile1, boolean4, boolean5, boolean4);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string2 = "{+;AbiWX";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string2);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: {+;AbiWX
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      boolean boolean1 = FileSystemHandling.createFolder(evoSuiteFile0);
      HashMap<String, List<String>> hashMap1 = new HashMap<String, List<String>>();
      String string0 = ">";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      String string1 = "Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml";
      String string2 = "";
      Document document0 = Parser.parseBodyFragmentRelaxed(string1, string2);
      Charset charset0 = document0.charset();
      Set<String> set0 = charset0.aliases();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      List<String> list1 = hashMap1.put(string0, list0);
      Map<String, String> map0 = httpConnection_Response0.cookies;
      // Undeclared exception!
      try { 
        httpConnection_Response0.parse();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before parsing response
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "&lt;";
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string1 = "";
      boolean boolean0 = linkedList0.add(string1);
      List<String> list0 = hashMap0.put(string0, linkedList0);
      HttpConnection.Response httpConnection_Response1 = new HttpConnection.Response();
      URL uRL0 = httpConnection_Response1.url;
      httpConnection_Response0.url = uRL0;
      String string2 = "ARU(.]*\\";
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.GERMAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      String string3 = locale0.getDisplayLanguage();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) set0, locale_FilteringMode0);
      BiFunction<Object, Object, List<String>> biFunction0 = (BiFunction<Object, Object, List<String>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      List<String> list2 = hashMap0.merge(string2, list1, biFunction0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      HashMap<String, List<String>> hashMap1 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap1);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string4 = httpConnection_Response0.contentType();
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      String string0 = " /{V0/@JpS;= ic";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL:  /{V0/@JpS;= ic
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = "#[N)BSOdvt<~{3>!";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "h'0,Yl8+qFr7NF+v";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string1);
      String string2 = "%22";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.key(string2);
      String string3 = httpConnection_KeyVal0.value();
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.OPTIONS;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method0);
      String string0 = "";
      String string1 = "-->";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = null;
      TextNode textNode1 = textNode0.text(string2);
      // Undeclared exception!
      try { 
        textNode1.attributes();
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      String string0 = " 0x#zUBR&2TW`2S3y";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0, (InputStream) pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.value(string0);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal2.inputStream((InputStream) pipedInputStream0);
      InputStream inputStream0 = httpConnection_KeyVal3.inputStream();
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.headers;
      httpConnection_Response0.cookies = map0;
      String string0 = httpConnection_Response0.statusMessage();
      URL uRL0 = httpConnection_Response0.url;
      // Undeclared exception!
      try { 
        MockURL.openStream(uRL0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = null;
      String string1 = "Key val must not be null";
      // Undeclared exception!
      try { 
        httpConnection_Response0.cookie(string0, string1);
      } catch(IllegalArgumentException e) {
         //
         // Cookie name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "TX[b)\"H{$";
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      Map<String, String> map0 = attributes1.dataset();
      String string1 = "";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      httpConnection_Response0.cookies = map0;
      Connection.Response connection_Response1 = httpConnection_Response0.removeCookie(string0);
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0, httpConnection_Response0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      URL uRL0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.connect(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // URL must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.cookies;
      httpConnection_Response0.headers = map0;
      int int0 = httpConnection_Response0.statusCode();
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      String string0 = "text";
      String string1 = "r";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "Tc>";
      String string3 = "&,";
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string2, string3);
      HttpConnection.KeyVal httpConnection_KeyVal2 = HttpConnection.KeyVal.create(string1, string1);
      String string4 = ";";
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal0.key(string4);
      boolean boolean0 = httpConnection_KeyVal0.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = null;
      String string0 = "user-agent";
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, string0);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string1 = "a~?A";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string1);
      String string2 = httpConnection_Response0.charset();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string3 = "aru(.]*\\";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Collection<String> collection0 = null;
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, collection0, locale_FilteringMode0);
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean1 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string1);
      boolean boolean2 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string2);
      String string4 = "\\;B&udLlXI} $:c";
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange(string4);
      } catch(IllegalArgumentException e) {
         //
         // range=\\;b&udllxi} $:c
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = "Must supply a valid URL";
      URL uRL1 = MockURL.URL(uRL0, string0);
      Connection connection0 = HttpConnection.connect(uRL1);
      Connection connection1 = connection0.followRedirects(boolean0);
      String string1 = null;
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string0, string1);
      } catch(IllegalArgumentException e) {
         //
         // Data value must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteURL evoSuiteURL0 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "l'Eg){d";
      boolean boolean1 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      String string1 = "?c";
      boolean boolean2 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, string1);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Map<String, String> map0 = httpConnection_Response0.headers;
      httpConnection_Response0.cookies = map0;
      boolean boolean3 = true;
      String string2 = "nb6IW\"?";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string1, string2);
      String string3 = "aru(.]*\\";
      Connection.Method connection_Method0 = Connection.Method.PUT;
      String string4 = "hgroup";
      Connection.Response connection_Response1 = httpConnection_Response0.removeHeader(string4);
      httpConnection_Response0.method = connection_Method0;
      Connection.Response connection_Response2 = httpConnection_Response0.removeHeader(string3);
      boolean boolean4 = FileSystemHandling.setPermissions(evoSuiteFile0, boolean3, boolean2, boolean1);
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = null;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = hashMap0.put(string0, linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      String string1 = null;
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string1, string0);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
