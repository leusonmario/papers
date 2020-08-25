/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 22:11:08 GMT 2020
 */

package org.jboss.netty.handler.codec.frame;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;
import org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LengthFieldBasedFrameDecoder_ESTest extends LengthFieldBasedFrameDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     org.evosuite.testcase.execution.CodeUnderTestException : java.lang.IllegalArgumentException: Cannot assignable: false of class class java.lang.Boolean to field public boolean org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder.lengthFieldIncludedInFrameLength of variable VariableReference: Statement 0, type org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder
      lengthFieldBasedFrameDecoder0.lengthFieldIncludedInFrameLength = false;
      byte[] byteArray0 = new byte[0];
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     java.lang.ArrayIndexOutOfBoundsException : 0
      // Undeclared exception!
      try { 
        bigEndianHeapChannelBuffer0.writeLong(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jboss.netty.buffer.BigEndianHeapChannelBuffer", e);
         assertTrue(e.getMessage().equals("0"));   
      }
  }
}
