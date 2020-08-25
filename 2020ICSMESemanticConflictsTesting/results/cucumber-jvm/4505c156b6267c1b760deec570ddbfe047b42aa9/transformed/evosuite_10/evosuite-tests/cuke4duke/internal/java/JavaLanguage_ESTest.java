/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 20:04:12 GMT 2020
 */

package cuke4duke.internal.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cuke4duke.internal.groovy.GroovyLanguage;
import cuke4duke.internal.groovy.GroovyStepDefinition;
import cuke4duke.internal.java.JavaLanguage;
import cuke4duke.internal.java.ObjectFactory;
import cuke4duke.internal.java.PicoFactory;
import cuke4duke.internal.java.SpringFactory;
import cuke4duke.internal.language.LanguageMixin;
import cuke4duke.internal.language.StepDefinition;
import groovy.lang.Closure;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;
import org.codehaus.groovy.runtime.MethodClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaLanguage_ESTest extends JavaLanguage_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      LanguageMixin languageMixin0 = mock(LanguageMixin.class, new ViolatedAssumptionAnswer());
      JavaLanguage javaLanguage0 = null;
      try {
        javaLanguage0 = new JavaLanguage(languageMixin0);
      } catch(RuntimeException e) {
         //
         // Missing system property: cuke4duke.objectFactory
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      // Undeclared exception!
      try { 
        javaLanguage0.begin_scenario();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<String> class0 = String.class;
      javaLanguage0.registerStepDefinitionsFor(class0);
      // Undeclared exception!
      try { 
        javaLanguage0.end_scenario();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = " does not referXto class/module";
      try { 
        javaLanguage0.load(string0);
      } catch(ClassNotFoundException e) {
         //
         // Couldn't determine class from file:  does not referXto class/module
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<BufferedInputStream> class0 = BufferedInputStream.class;
      // Undeclared exception!
      try { 
        javaLanguage0.getTarget(class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      // Undeclared exception!
      try { 
        javaLanguage0.end_scenario();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      LanguageMixin languageMixin0 = null;
      JavaLanguage javaLanguage0 = null;
      try {
        javaLanguage0 = new JavaLanguage(languageMixin0);
      } catch(RuntimeException e) {
         //
         // Missing system property: cuke4duke.objectFactory
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = "Setting 2 to ";
      try { 
        javaLanguage0.load(string0);
      } catch(ClassNotFoundException e) {
         //
         // Couldn't determine class from file: Setting 2 to 
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<InputStream> class0 = InputStream.class;
      // Undeclared exception!
      try { 
        javaLanguage0.getTarget(class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<String> class0 = String.class;
      javaLanguage0.registerStepDefinitionsFor(class0);
      String string0 = "CAT";
      // Undeclared exception!
      try { 
        javaLanguage0.loadClass(string0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<Object> class0 = Object.class;
      ObjectFactory objectFactory0 = javaLanguage0.objectFactory;
      javaLanguage0.objectFactory = objectFactory0;
      // Undeclared exception!
      try { 
        javaLanguage0.end_scenario();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<SpringFactory> class0 = SpringFactory.class;
      // Undeclared exception!
      try { 
        javaLanguage0.getTarget(class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<Object> class0 = Object.class;
      javaLanguage0.registerStepDefinitionsFor(class0);
      Class<Object> class1 = Object.class;
      javaLanguage0.registerStepDefinitionsFor(class1);
      PicoFactory picoFactory0 = new PicoFactory();
      javaLanguage0.objectFactory = (ObjectFactory) picoFactory0;
      Class<Object> class2 = Object.class;
      // Undeclared exception!
      try { 
        javaLanguage0.getTarget(class2);
      } catch(NoClassDefFoundError e) {
         //
         // org/picocontainer/MutablePicoContainer
         //
         verifyException("cuke4duke.internal.java.PicoFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      // Undeclared exception!
      try { 
        javaLanguage0.begin_scenario();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = "{rdDRdW";
      try { 
        javaLanguage0.loadClass(string0);
      } catch(ClassNotFoundException e) {
         //
         // Couldn't determine class from file: {rdDRdW
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Method method0 = null;
      // Undeclared exception!
      try { 
        javaLanguage0.registerStepDefinitionMaybe(method0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      LanguageMixin languageMixin0 = mock(LanguageMixin.class, new ViolatedAssumptionAnswer());
      PicoFactory picoFactory0 = new PicoFactory();
      javaLanguage0.objectFactory = (ObjectFactory) picoFactory0;
      javaLanguage0.languageMixin = languageMixin0;
      // Undeclared exception!
      try { 
        javaLanguage0.end_scenario();
      } catch(NoClassDefFoundError e) {
         //
         // org/picocontainer/MutablePicoContainer
         //
         verifyException("cuke4duke.internal.java.PicoFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      LanguageMixin languageMixin0 = mock(LanguageMixin.class, new ViolatedAssumptionAnswer());
      javaLanguage0.languageMixin = languageMixin0;
      LanguageMixin languageMixin1 = null;
      javaLanguage0.languageMixin = languageMixin1;
      Class<SpringFactory> class0 = SpringFactory.class;
      javaLanguage0.registerStepDefinitionsFor(class0);
      String string0 = null;
      // Undeclared exception!
      try { 
        javaLanguage0.load(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = "RF?l8/QKPUI6/(|!R";
      try { 
        javaLanguage0.step_definitions_for(string0);
      } catch(ClassNotFoundException e) {
         //
         // Couldn't determine class from file: RF?l8/QKPUI6/(|!R
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Method method0 = null;
      // Undeclared exception!
      try { 
        javaLanguage0.registerAfterMaybe(method0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = "";
      // Undeclared exception!
      try { 
        javaLanguage0.loadClass(string0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = null;
      // Undeclared exception!
      try { 
        javaLanguage0.loadClass(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Method method0 = null;
      // Undeclared exception!
      try { 
        javaLanguage0.registerBeforeMaybe(method0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      String string0 = "?PO";
      // Undeclared exception!
      try { 
        javaLanguage0.load(string0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      String string0 = "JsaX\\^vI-'P~oN5";
      Class<Object> class0 = Object.class;
      LanguageMixin languageMixin0 = mock(LanguageMixin.class, new ViolatedAssumptionAnswer());
      JavaLanguage javaLanguage0 = null;
      try {
        javaLanguage0 = new JavaLanguage(languageMixin0);
      } catch(RuntimeException e) {
         //
         // Missing system property: cuke4duke.objectFactory
         //
         verifyException("cuke4duke.internal.java.JavaLanguage", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      LanguageMixin languageMixin0 = mock(LanguageMixin.class, new ViolatedAssumptionAnswer());
      JavaLanguage javaLanguage0 = new JavaLanguage();
      PicoFactory picoFactory0 = new PicoFactory();
      javaLanguage0.objectFactory = (ObjectFactory) picoFactory0;
      // Undeclared exception!
      try { 
        javaLanguage0.begin_scenario();
      } catch(NoClassDefFoundError e) {
         //
         // org/picocontainer/PicoBuilder
         //
         verifyException("cuke4duke.internal.java.PicoFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      JavaLanguage javaLanguage0 = new JavaLanguage();
      Class<String> class0 = String.class;
      Class<String> class1 = null;
      // Undeclared exception!
      try { 
        javaLanguage0.registerStepDefinitionsFor(class1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.util.ReflectionUtils", e);
      }
  }
}
