/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 03:21:19 GMT 2020
 */

package com.relayrides.pushy.apns;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.relayrides.pushy.apns.ApnsEnvironment;
import com.relayrides.pushy.apns.KnownBadPushNotification;
import com.relayrides.pushy.apns.PushManager;
import io.netty.channel.nio.NioEventLoopGroup;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PushManager_ESTest extends PushManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSLContext sSLContext0 = SSLContext.getDefault();
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     java.lang.NoClassDefFoundError : Could not initialize class io.netty.util.concurrent.DefaultPromise
      // Modified Version:
      //     java.lang.IllegalArgumentException : The constructor protected com.relayrides.pushy.apns.PushManager(com.relayrides.pushy.apns.ApnsEnvironment,javax.net.ssl.SSLContext,int,io.netty.channel.nio.NioEventLoopGroup,java.util.concurrent.ExecutorService,java.util.concurrent.BlockingQueue) is not a member of type com.relayrides.pushy.apns.PushManager<com.relayrides.pushy.apns.KnownBadPushNotification>
      PushManager<KnownBadPushNotification> pushManager0 = null;
      try {
        pushManager0 = new PushManager<KnownBadPushNotification>((ApnsEnvironment) null, sSLContext0, (-417), (NioEventLoopGroup) null, (ExecutorService) null, (BlockingQueue<KnownBadPushNotification>) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class io.netty.util.concurrent.DefaultPromise
         //
         verifyException("io.netty.util.concurrent.MultithreadEventExecutorGroup", e);
         assertTrue(e.getMessage().equals("Could not initialize class io.netty.util.concurrent.DefaultPromise"));   
      }
  }
}
