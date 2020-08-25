/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 06:52:29 GMT 2020
 */

package org.jboss.netty.handler.codec.frame;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;
import org.jboss.netty.buffer.ByteBufferBackedChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBufferFactory;
import org.jboss.netty.buffer.ChannelBufferIndexFinder;
import org.jboss.netty.buffer.CompositeChannelBuffer;
import org.jboss.netty.buffer.DirectChannelBufferFactory;
import org.jboss.netty.buffer.DuplicatedChannelBuffer;
import org.jboss.netty.buffer.DynamicChannelBuffer;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import org.jboss.netty.buffer.LittleEndianHeapChannelBuffer;
import org.jboss.netty.buffer.SlicedChannelBuffer;
import org.jboss.netty.buffer.TruncatedChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LengthFieldBasedFrameDecoder_ESTest extends LengthFieldBasedFrameDecoder_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      int int0 = 1;
      int int1 = 8;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int1, int1, int0);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength (1) must be equal to or greater than lengthFieldOffset (1) + lengthFieldLength (8).
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      int int0 = 2;
      int int1 = 2353;
      int int2 = 0;
      boolean boolean0 = true;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int0, int1, int2, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength (2) must be equal to or greater than lengthFieldOffset (2) + lengthFieldLength (2).
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      int int0 = 4203;
      int int1 = 0;
      int int2 = (-18);
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int2, int2, int2);
      } catch(IllegalArgumentException e) {
         //
         // initialBytesToStrip must be a non-negative integer: -18
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      int int0 = 31;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int0, int0, int0);
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldLength must be either 1, 2, 3, 4, or 8: 31
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      int int0 = 579;
      boolean boolean0 = true;
      ChannelHandlerContext channelHandlerContext0 = null;
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)16;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)108;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-72);
      byteArray0[4] = byteArray0[2];
      byte byte5 = (byte)27;
      byteArray0[5] = byte1;
      byte byte6 = (byte) (-27);
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-23);
      byteArray0[7] = byte7;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      ChannelBuffer channelBuffer0 = bigEndianHeapChannelBuffer0.duplicate();
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      byte[] byteArray0 = new byte[22];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)68;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[3] = byte2;
      byte byte3 = (byte)53;
      byteArray0[4] = byte3;
      byte byte4 = (byte)91;
      byteArray0[5] = byte4;
      byteArray0[6] = byte4;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      ChannelBuffer channelBuffer0 = bigEndianHeapChannelBuffer0.slice();
      int int1 = 106;
      int int2 = 2;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int1, byte0, int2);
      DynamicChannelBuffer dynamicChannelBuffer0 = new DynamicChannelBuffer(byte1);
      ChannelHandlerContext channelHandlerContext0 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      Object object0 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext0, channel0, channelBuffer0);
      int int3 = (-2005);
      // Undeclared exception!
      try { 
        lengthFieldBasedFrameDecoder0.extractFrame(dynamicChannelBuffer0, int3, byte2);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      int int0 = 4;
      int int1 = 1;
      int int2 = 255;
      boolean boolean0 = true;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int2, int1, int0, int0, int0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      int int3 = 0;
      DynamicChannelBuffer dynamicChannelBuffer0 = new DynamicChannelBuffer(byteOrder0, int3);
      int int4 = 7;
      ChannelHandlerContext channelHandlerContext0 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      Object object0 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext0, channel0, dynamicChannelBuffer0);
      ChannelHandlerContext channelHandlerContext1 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel1 = mock(Channel.class, new ViolatedAssumptionAnswer());
      Object object1 = lengthFieldBasedFrameDecoder0.decodeLast(channelHandlerContext1, channel1, dynamicChannelBuffer0);
      String string0 = "";
      int int5 = 0;
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved(string0, int5);
      // Undeclared exception!
      try { 
        SocketChannel.open((SocketAddress) inetSocketAddress0);
      } catch(UnresolvedAddressException e) {
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      int int0 = 3;
      int int1 = 0;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0);
      ChannelHandlerContext channelHandlerContext0 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel0 = null;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-37);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-13);
      byteArray0[1] = byte1;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      // Undeclared exception!
      try { 
        bigEndianHeapChannelBuffer0.readSlice(byteArray0[1]);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.buffer.AbstractChannelBuffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      int int0 = 22;
      int int1 = 65535;
      int int2 = (-878);
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int2);
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldLength must be either 1, 2, 3, 4, or 8: -878
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      int int0 = 8;
      int int1 = (-1344);
      int int2 = 1;
      int int3 = (-2071);
      boolean boolean0 = true;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int2, int3, int1, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldOffset must be a non-negative integer: -1344
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      int int1 = (-56);
      byte[] byteArray0 = new byte[22];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)68;
      byteArray0[1] = byte1;
      byteArray0[2] = byte0;
      byte byte2 = (byte)0;
      byteArray0[3] = byte2;
      byte byte3 = (byte)53;
      byteArray0[4] = byte3;
      byte byte4 = (byte)91;
      byteArray0[5] = byte4;
      byte byte5 = (byte)0;
      byteArray0[6] = byte5;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      ChannelBuffer channelBuffer0 = bigEndianHeapChannelBuffer0.slice();
      int int2 = 106;
      int int3 = 2;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int2, byte0, int3);
      int int4 = 2;
      int int5 = 3666;
      ChannelBuffer channelBuffer1 = lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer0, byteArray0[3], byteArray0[0]);
      // Undeclared exception!
      try { 
        lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer0, int4, int5);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      int int0 = 1;
      int int1 = (-5194);
      int int2 = 1656;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int0, int1, int2);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength (1) must be equal to or greater than lengthFieldOffset (1) + lengthFieldLength (1).
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      int int0 = 1;
      int int1 = 0;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int1);
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldLength must be either 1, 2, 3, 4, or 8: 0
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      int int0 = (-1246);
      int int1 = 255;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength must be a positive integer: -1246
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      int int0 = 4;
      int int1 = 2157;
      int int2 = (-1779);
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int0, int1, int2);
      } catch(IllegalArgumentException e) {
         //
         // initialBytesToStrip must be a non-negative integer: -1779
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      int int0 = (-1057);
      int int1 = 0;
      int int2 = 0;
      int int3 = 0;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0, int2, int3);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength must be a positive integer: -1057
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      int int0 = (-938);
      int int1 = (-1630);
      boolean boolean0 = true;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int1, int1, int0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength must be a positive integer: -938
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      int int0 = (-1884);
      int int1 = 0;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength must be a positive integer: -1884
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      int int0 = 1169;
      int int1 = (-32);
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0);
      } catch(IllegalArgumentException e) {
         //
         // lengthFieldOffset must be a non-negative integer: -32
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      int int0 = 2;
      int int1 = 2345;
      int int2 = 0;
      boolean boolean0 = true;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = null;
      try {
        lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int0, int0, int1, int2, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // maxFrameLength (2) must be equal to or greater than lengthFieldOffset (2) + lengthFieldLength (2).
         //
         verifyException("org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      int int0 = 3;
      int int1 = 1;
      int int2 = (-1);
      boolean boolean0 = false;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int1, int2, int1, boolean0);
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)8;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      int int3 = (-2794);
      // Undeclared exception!
      try { 
        bigEndianHeapChannelBuffer0.readBytes(int3);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.buffer.HeapChannelBuffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      int int0 = 3;
      int int1 = 0;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0);
      ChannelHandlerContext channelHandlerContext0 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel0 = null;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-37);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-13);
      byteArray0[1] = byte1;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      // Undeclared exception!
      try { 
        bigEndianHeapChannelBuffer0.readSlice(byteArray0[1]);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.buffer.AbstractChannelBuffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      int int0 = 4203;
      int int1 = 0;
      int int2 = 3;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int2, int2, int2);
      ChannelHandlerContext channelHandlerContext0 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel0 = mock(Channel.class, new ViolatedAssumptionAnswer());
      ByteOrder byteOrder0 = null;
      DirectChannelBufferFactory directChannelBufferFactory0 = null;
      try {
        directChannelBufferFactory0 = new DirectChannelBufferFactory(byteOrder0);
      } catch(NullPointerException e) {
         //
         // defaultOrder
         //
         verifyException("org.jboss.netty.buffer.AbstractChannelBufferFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      int int0 = 0;
      int int1 = (-56);
      byte[] byteArray0 = new byte[22];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)68;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)53;
      byteArray0[4] = byte4;
      byte byte5 = (byte)91;
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      ChannelBuffer channelBuffer0 = bigEndianHeapChannelBuffer0.slice();
      int int2 = 106;
      int int3 = 2;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int2, byte0, int3);
      // Undeclared exception!
      try { 
        lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer0, byteArray0[2], byteArray0[4]);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      int int0 = 3;
      int int1 = 0;
      LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder0 = new LengthFieldBasedFrameDecoder(int0, int1, int0);
      ChannelHandlerContext channelHandlerContext0 = mock(ChannelHandlerContext.class, new ViolatedAssumptionAnswer());
      Channel channel0 = null;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-37);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-13);
      byteArray0[0] = byte1;
      BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer0 = new BigEndianHeapChannelBuffer(byteArray0);
      ChannelBuffer channelBuffer0 = bigEndianHeapChannelBuffer0.readSlice(byteArray0[1]);
      Object object0 = lengthFieldBasedFrameDecoder0.decode(channelHandlerContext0, channel0, channelBuffer0);
      // Undeclared exception!
      try { 
        lengthFieldBasedFrameDecoder0.extractFrame(channelBuffer0, byteArray0[0], byte1);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.buffer.HeapChannelBuffer", e);
      }
  }
}
