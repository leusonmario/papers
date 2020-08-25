/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 26 03:27:43 GMT 2020
 */

package com.relayrides.pushy.apns;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PushManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.relayrides.pushy.apns.PushManager"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/pushy/58901c846e4f0874977c5aabbc34bcb4de3670e0/evosuite_10"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PushManager_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.AttributeKey",
      "io.netty.util.concurrent.ScheduledFutureTask",
      "io.netty.util.concurrent.DefaultPromise$1",
      "io.netty.util.AttributeMap",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.util.concurrent.ScheduledFuture",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelInboundHandler",
      "io.netty.util.internal.PlatformDependent0",
      "com.relayrides.pushy.apns.PushManager$4",
      "com.relayrides.pushy.apns.PushManager$3",
      "com.relayrides.pushy.apns.PushManager$2",
      "io.netty.channel.sctp.SctpChannel",
      "com.relayrides.pushy.apns.PushManager$1",
      "io.netty.channel.local.LocalAddress",
      "com.relayrides.pushy.apns.ApnsEnvironment",
      "io.netty.channel.socket.DatagramChannel",
      "io.netty.channel.rxtx.RxtxDeviceAddress",
      "io.netty.channel.FailedChannelFuture",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.channel.udt.UdtChannel",
      "io.netty.channel.DefaultChannelHandlerContext",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.channel.socket.SocketChannel",
      "io.netty.util.concurrent.GenericProgressiveFutureListener",
      "com.relayrides.pushy.apns.RejectedNotificationListener",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.channel.ChannelFlushPromiseNotifier$DefaultFlushCheckpoint",
      "io.netty.channel.ChannelHandler$Sharable",
      "io.netty.channel.rxtx.RxtxChannelOption",
      "io.netty.channel.oio.AbstractOioMessageChannel",
      "io.netty.channel.ChannelPipeline",
      "com.relayrides.pushy.apns.ApnsPushNotification",
      "io.netty.channel.ServerChannel",
      "io.netty.channel.oio.OioByteStreamChannel",
      "io.netty.util.concurrent.DefaultProgressivePromise",
      "com.relayrides.pushy.apns.ExpiredToken",
      "io.netty.channel.ChannelException",
      "io.netty.channel.embedded.EmbeddedChannel$DefaultUnsafe",
      "io.netty.channel.ChannelFlushPromiseNotifier",
      "io.netty.channel.ChannelProgressiveFutureListener",
      "io.netty.util.concurrent.ProgressivePromise",
      "io.netty.util.internal.logging.InternalLogger",
      "com.relayrides.pushy.apns.FailedConnectionListener",
      "io.netty.channel.CompleteChannelFuture",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.channel.ChannelOption",
      "io.netty.channel.SucceededChannelFuture",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.ProgressiveFuture",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.channel.AbstractChannel",
      "io.netty.util.internal.ThreadLocalRandom$2",
      "com.relayrides.pushy.apns.RejectedNotificationReason",
      "io.netty.util.concurrent.PromiseTask",
      "io.netty.channel.MessageSizeEstimator$Handle",
      "io.netty.channel.socket.ServerSocketChannel",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.internal.EmptyArrays",
      "com.relayrides.pushy.apns.SendableApnsPushNotification",
      "io.netty.channel.DefaultChannelPipeline$HeadHandler",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.ChannelFlushPromiseNotifier$FlushCheckpoint",
      "io.netty.util.Attribute",
      "io.netty.util.concurrent.GlobalEventExecutor$TaskRunner",
      "com.relayrides.pushy.apns.ApnsConnection",
      "io.netty.util.concurrent.AbstractFuture",
      "com.relayrides.pushy.apns.PushManager",
      "io.netty.util.concurrent.Promise",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe",
      "io.netty.util.concurrent.SingleThreadEventExecutor",
      "io.netty.channel.ChannelOutboundHandler",
      "io.netty.util.internal.logging.Slf4JLoggerFactory$1",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.ReferenceCounted",
      "io.netty.channel.oio.AbstractOioChannel$DefaultOioUnsafe",
      "io.netty.util.concurrent.DefaultFutureListeners",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultEventExecutor",
      "io.netty.channel.SimpleChannelInboundHandler",
      "io.netty.channel.rxtx.RxtxChannelConfig",
      "io.netty.channel.nio.NioEventLoop",
      "io.netty.channel.local.LocalChannel$LocalUnsafe",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.Future",
      "com.relayrides.pushy.apns.SentNotificationBuffer",
      "io.netty.channel.nio.AbstractNioByteChannel",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "io.netty.util.internal.JavassistTypeParameterMatcherGenerator",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.util.UniqueName",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.channel.embedded.EmbeddedEventLoop",
      "io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe",
      "io.netty.channel.DefaultChannelProgressivePromise",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.channel.ChannelPropertyAccess",
      "io.netty.channel.MessageSizeEstimator",
      "io.netty.channel.ChannelProgressiveFuture",
      "io.netty.channel.ChannelPromise",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.channel.local.LocalChannel",
      "io.netty.channel.DefaultChannelPipeline$TailHandler",
      "io.netty.channel.sctp.SctpServerChannel",
      "io.netty.channel.DefaultChannelPromise",
      "io.netty.channel.rxtx.RxtxChannel",
      "io.netty.channel.ChannelDuplexHandler",
      "com.relayrides.pushy.apns.PushManager$DispatchThreadExceptionHandler",
      "io.netty.channel.rxtx.RxtxChannel$RxtxUnsafe",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelInitializer",
      "io.netty.util.concurrent.FutureListener",
      "io.netty.channel.oio.AbstractOioChannel",
      "com.relayrides.pushy.apns.KnownBadPushNotification",
      "io.netty.channel.AbstractChannel$AbstractUnsafe",
      "io.netty.channel.EventLoop",
      "io.netty.channel.nio.AbstractNioMessageChannel",
      "io.netty.channel.nio.NioEventLoopGroup",
      "io.netty.util.concurrent.PromiseTask$RunnableAdapter",
      "io.netty.channel.ChannelOutboundBuffer",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.channel.embedded.EmbeddedSocketAddress",
      "io.netty.channel.SingleThreadEventLoop",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.channel.local.LocalChannel$1",
      "io.netty.channel.DefaultChannelPipeline",
      "com.relayrides.pushy.apns.FeedbackServiceClient",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "com.relayrides.pushy.apns.ApnsConnectionPool",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.channel.ChannelHandlerContext",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.channel.ChannelFutureListener",
      "io.netty.util.concurrent.BlockingOperationException",
      "com.relayrides.pushy.apns.FeedbackConnectionException",
      "io.netty.channel.nio.AbstractNioChannel",
      "io.netty.channel.FileRegion",
      "io.netty.channel.nio.AbstractNioChannel$NioUnsafe",
      "io.netty.channel.udt.UdtServerChannel",
      "io.netty.channel.ChannelProgressivePromise",
      "io.netty.channel.EventLoopGroup",
      "io.netty.channel.AbstractServerChannel$DefaultServerUnsafe",
      "io.netty.channel.embedded.EmbeddedChannel",
      "com.relayrides.pushy.apns.ApnsConnectionListener",
      "io.netty.util.concurrent.GenericFutureListener",
      "io.netty.channel.oio.OioByteStreamChannel$2",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.ChannelInboundInvoker",
      "io.netty.channel.oio.OioByteStreamChannel$1",
      "io.netty.channel.ChannelPromiseNotifier",
      "io.netty.channel.Channel$Unsafe",
      "io.netty.channel.ChannelFuture",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.AbstractChannel$CloseFuture",
      "io.netty.channel.VoidChannelPromise",
      "io.netty.channel.oio.AbstractOioByteChannel",
      "io.netty.channel.ChannelConfig",
      "io.netty.channel.ChannelHandler",
      "io.netty.channel.ChannelPromiseAggregator",
      "io.netty.util.Signal",
      "io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe",
      "io.netty.util.concurrent.GlobalEventExecutor$PurgeTask"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PushManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.relayrides.pushy.apns.PushManager",
      "com.relayrides.pushy.apns.PushManager$1",
      "com.relayrides.pushy.apns.PushManager$DispatchThreadExceptionHandler",
      "com.relayrides.pushy.apns.PushManager$2",
      "com.relayrides.pushy.apns.PushManager$3",
      "com.relayrides.pushy.apns.PushManager$4",
      "com.relayrides.pushy.apns.ApnsEnvironment",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory$1",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.nio.NioEventLoopGroup",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.concurrent.DefaultPromise$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "com.relayrides.pushy.apns.ApnsConnectionPool",
      "com.relayrides.pushy.apns.FeedbackServiceClient",
      "com.relayrides.pushy.apns.KnownBadPushNotification",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.local.LocalChannel$1",
      "io.netty.channel.local.LocalChannel",
      "io.netty.util.internal.ThreadLocalRandom$2",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.channel.embedded.EmbeddedChannel",
      "com.relayrides.pushy.apns.ExpiredToken"
    );
  }
}
