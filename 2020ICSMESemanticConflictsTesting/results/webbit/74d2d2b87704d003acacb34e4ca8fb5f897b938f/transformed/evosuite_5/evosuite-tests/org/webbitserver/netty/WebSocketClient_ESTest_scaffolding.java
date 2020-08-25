/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 29 23:44:38 GMT 2020
 */

package org.webbitserver.netty;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class WebSocketClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.webbitserver.netty.WebSocketClient"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/webbit/74d2d2b87704d003acacb34e4ca8fb5f897b938f/evosuite_5"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WebSocketClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.webbitserver.handler.exceptions.SilentExceptionHandler",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoderBuffer",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.webbitserver.wrapper.WebSocketConnectionWrapper",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.webbitserver.stub.StubConnection",
      "org.jboss.netty.channel.socket.oio.OioClientSocketChannel",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.jboss.netty.channel.socket.oio.OioDatagramPipelineSink",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler$1",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "org.webbitserver.WebSocketHandler",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$SendBuffer",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.webbitserver.handler.ReconnectingWebSocketHandler",
      "org.jboss.netty.channel.SimpleChannelHandler",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.jboss.netty.util.internal.ExecutorUtil",
      "org.jboss.netty.channel.socket.DatagramChannel",
      "org.jboss.netty.handler.codec.http.HttpChunk",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.channel.socket.DatagramChannelFactory",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.StaticChannelPipeline",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "org.jboss.netty.handler.codec.embedder.AbstractCodecEmbedder$EmbeddedChannelSink",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.handler.codec.frame.TooLongFrameException",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.WriteCompletionEvent",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$2",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.channel.local.LocalServerChannelFactory",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.handler.codec.http.HttpResponseDecoder",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.handler.codec.embedder.EmbeddedChannel",
      "org.webbitserver.helpers.Base64",
      "org.jboss.netty.channel.socket.nio.NioDatagramPipelineSink",
      "org.jboss.netty.channel.StaticChannelPipeline$StaticChannelHandlerContext",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteRequestQueue",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.webbitserver.stub.StubHttpRequest",
      "org.webbitserver.stub.StubDataHolder",
      "org.jboss.netty.channel.socket.oio.OioDatagramChannel",
      "org.jboss.netty.handler.codec.http.HttpCodecUtil",
      "org.jboss.netty.util.internal.LinkedTransferQueue",
      "org.jboss.netty.channel.socket.SocketChannel",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.channel.socket.oio.OioSocketChannel",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink",
      "org.webbitserver.HttpRequest",
      "org.jboss.netty.buffer.WrappedChannelBuffer",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.socket.nio.NioDatagramChannel",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.webbitserver.netty.HandshakeChannelHandler",
      "org.jboss.netty.channel.ReceiveBufferSizePredictor",
      "org.webbitserver.EventSourceConnection",
      "org.jboss.netty.handler.codec.replay.UnreplayableOperationException",
      "org.webbitserver.netty.WebSocketClient",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.ServerChannelFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.webbitserver.wrapper.HttpRequestWrapper",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.jboss.netty.channel.MessageEvent",
      "org.webbitserver.DataHolder",
      "org.jboss.netty.channel.local.LocalClientChannelFactory",
      "org.jboss.netty.channel.socket.oio.OioAcceptedSocketChannel",
      "org.jboss.netty.channel.ChannelFactory",
      "org.jboss.netty.channel.ChildChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.NioAcceptedSocketChannel",
      "org.webbitserver.netty.NettyWebSocketConnection",
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.webbitserver.WebSocket",
      "org.webbitserver.netty.HandshakeChannelHandler$1",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder$State",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.webbitserver.netty.contrib.EventSourceMessage",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.channel.socket.nio.NioSocketChannelConfig",
      "org.jboss.netty.util.internal.StringUtil",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteTask",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.webbitserver.WebSocketConnection",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketChannel",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.channel.socket.ServerSocketChannelFactory",
      "org.webbitserver.WebbitException",
      "org.jboss.netty.handler.ssl.SslHandler$ClosingChannelFutureListener",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.handler.codec.http.HttpMessageEncoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.handler.timeout.WriteTimeoutHandler$TimeoutCanceller",
      "org.webbitserver.helpers.QueryParameters",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.webbitserver.netty.NettyHttpRequest",
      "org.jboss.netty.buffer.SlicedChannelBuffer",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.webbitserver.helpers.SslFactory",
      "org.jboss.netty.buffer.TruncatedChannelBuffer",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.jboss.netty.channel.socket.ServerSocketChannel",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "org.webbitserver.netty.WebSocketClient$2",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.channel.socket.SocketChannelConfig",
      "org.jboss.netty.channel.ExceptionEvent",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoder",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "org.jboss.netty.handler.codec.http.HttpRequestEncoder",
      "org.webbitserver.handler.exceptions.PrintStackTraceExceptionHandler",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketPipelineSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.util.internal.LinkedTransferQueue$Node",
      "org.jboss.netty.handler.codec.http.HttpHeaders$Entry",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.webbitserver.handler.ReconnectingWebSocketHandler$1",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannel",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.buffer.CompositeChannelBuffer",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferPool",
      "org.jboss.netty.channel.socket.oio.OioClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.ReceiveBufferSizePredictorFactory",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.handler.codec.replay.ReplayError",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannel",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.jboss.netty.handler.codec.http.HttpChunkTrailer",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil$Node",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.channel.DefaultChannelFuture"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, WebSocketClient_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.webbitserver.WebSocketHandler", false, WebSocketClient_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WebSocketClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.webbitserver.netty.WebSocketClient",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.webbitserver.netty.WebSocketClient$2",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.webbitserver.helpers.Base64",
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.handler.codec.http.HttpHeaders$Entry",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.handler.codec.http.HttpCodecUtil",
      "org.jboss.netty.util.internal.StringUtil",
      "org.webbitserver.handler.ReconnectingWebSocketHandler",
      "org.webbitserver.handler.exceptions.PrintStackTraceExceptionHandler",
      "org.webbitserver.handler.exceptions.SilentExceptionHandler",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil$Node",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil",
      "org.jboss.netty.util.internal.LinkedTransferQueue",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder",
      "org.jboss.netty.handler.codec.http.HttpResponseDecoder",
      "org.jboss.netty.handler.codec.http.HttpMessageDecoder$State",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.jboss.netty.handler.codec.http.HttpMessageEncoder",
      "org.jboss.netty.handler.codec.http.HttpRequestEncoder",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "org.webbitserver.netty.HandshakeChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteTask",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel$WriteRequestQueue",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler$1",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$2",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.webbitserver.netty.HandshakeChannelHandler$1",
      "org.jboss.netty.handler.codec.replay.ReplayError",
      "org.jboss.netty.handler.codec.replay.ReplayingDecoderBuffer",
      "org.jboss.netty.util.internal.ExecutorUtil",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.webbitserver.WebbitException",
      "org.webbitserver.stub.StubDataHolder",
      "org.webbitserver.stub.StubConnection",
      "org.webbitserver.stub.StubHttpRequest",
      "org.webbitserver.handler.ReconnectingWebSocketHandler$1",
      "org.webbitserver.helpers.SslFactory",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.webbitserver.wrapper.WebSocketConnectionWrapper",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.webbitserver.netty.NettyHttpRequest",
      "org.webbitserver.netty.contrib.EventSourceMessage",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.webbitserver.wrapper.HttpRequestWrapper",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler"
    );
  }
}
