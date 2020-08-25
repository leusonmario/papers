/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 13:00:10 GMT 2020
 */

package com.netflix.appinfo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.CloudInstanceConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ApplicationInfoManager_ESTest extends ApplicationInfoManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApplicationInfoManager applicationInfoManager0 = ApplicationInfoManager.getInstance();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      applicationInfoManager0.unregisterStatusChangeListener("r@");
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     java.lang.NoClassDefFoundError : Could not initialize class com.netflix.appinfo.CloudInstanceConfig
      CloudInstanceConfig cloudInstanceConfig0 = null;
      try {
        cloudInstanceConfig0 = new CloudInstanceConfig("rpP][hJo*LrU2yBRJ@D");
       //  fail("Expecting exception: NoClassDefFoundError");
       // Unstable assertion
      } catch(NoClassDefFoundError e) {
         assertTrue(e.getMessage().equals("Could not initialize class com.netflix.appinfo.CloudInstanceConfig"));   
      }
  }
}
