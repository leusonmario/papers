/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 15:34:05 GMT 2020
 */

package org.elasticsearch.index.query.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.elasticsearch.index.query.QueryShardContext;
import org.elasticsearch.index.query.support.NestedInnerQueryParseSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NestedInnerQueryParseSupport_ESTest extends NestedInnerQueryParseSupport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport((QueryShardContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }
}
