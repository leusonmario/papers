/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 04:17:02 GMT 2020
 */

package com.github.javafaker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.github.javafaker.Address;
import com.github.javafaker.App;
import com.github.javafaker.Book;
import com.github.javafaker.Business;
import com.github.javafaker.Code;
import com.github.javafaker.Color;
import com.github.javafaker.Company;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import com.github.javafaker.Hacker;
import com.github.javafaker.Internet;
import com.github.javafaker.Lorem;
import com.github.javafaker.Name;
import com.github.javafaker.Number;
import com.github.javafaker.Options;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Faker_ESTest extends Faker_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Faker faker0 = new Faker();
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Faker faker0 = new Faker(mockRandom0);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Faker faker0 = new Faker(mockRandom0);
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "iiNYTj";
      Locale locale0 = new Locale(string0);
      long long0 = 3181L;
      MockRandom mockRandom0 = new MockRandom(long0);
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0, mockRandom0);
      } catch(RuntimeException e) {
         //
         // iinytj could not be found, does not have a corresponding yaml file
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      String string0 = locale0.getDisplayCountry();
      String string1 = locale0.getDisplayCountry();
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      Random random0 = null;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1, locale_FilteringMode0);
      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0, locale_FilteringMode1);
      List<Locale> list2 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list1);
      Faker faker0 = new Faker(locale0, random0);
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      Faker faker0 = new Faker(locale0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "E{<dQBtB0pVJt{s0G";
      Locale locale0 = new Locale(string0);
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0);
      } catch(RuntimeException e) {
         //
         // e{<dqbtb0pvjt{s0g could not be found, does not have a corresponding yaml file
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Locale locale0 = null;
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Locale locale0 = null;
      Random random0 = null;
      Faker faker0 = null;
      try {
        faker0 = new Faker(locale0, random0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.github.javafaker.service.FakeValuesService", e);
      }
  }
}
