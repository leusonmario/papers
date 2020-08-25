/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 00:00:16 GMT 2020
 */

package org.webbitserver.netty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.webbitserver.netty.WebSocketClient;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketClient_ESTest extends WebSocketClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.webbitserver.WebbitException : java.io.IOException: Pipe not connected
      // Modified Version:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      // Undeclared exception!
      try { 
        webSocketClient0.setupSsl(pipedInputStream0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.webbitserver.helpers.SslFactory", e);
         assertTrue(e.getMessage().equals("java.io.IOException: Pipe not connected"));   
      }
  }
}
