/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 22:12:56 GMT 2020
 */

package org.jboss.netty.handler.codec.frame;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LengthFieldBasedFrameDecoder_ESTest extends LengthFieldBasedFrameDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : lengthFieldOffset must be a non-negative integer: -649
      // Modified Version:
      //     java.lang.IllegalArgumentException : The constructor public org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(int,int,int,int,int,boolean) is not a member of type class org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(3, (-649), 1980, 5967, (-649), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldOffset must be a non-negative integer: -649
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
         assertTrue(e.getMessage().equals("lengthFieldOffset must be a non-negative integer: -649"));   
      }
  }
}
