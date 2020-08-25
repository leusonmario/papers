/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 15:50:02 GMT 2020
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.LazyDBList;
import com.mongodb.LazyDBObject;
import com.mongodb.LazyWriteableDBObject;
import com.mongodb.Mongo;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.TaggableReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.gridfs.GridFSDBFile;
import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.impl.RectangleImpl;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import org.apache.lucene.search.FuzzyTermsEnum;
import org.apache.lucene.util.NamedThreadFactory;
import org.bson.LazyBSONCallback;
import org.bson.LazyBSONList;
import org.bson.io.BSONByteBuffer;
import org.bson.types.ObjectId;
import org.elasticsearch.common.collect.ImmutableList;
import org.elasticsearch.common.joda.time.DateTime;
import org.elasticsearch.common.joda.time.DateTimeZone;
import org.elasticsearch.common.joda.time.LocalTime;
import org.elasticsearch.common.joda.time.chrono.GJChronology;
import org.elasticsearch.common.logging.ESLoggerFactory;
import org.elasticsearch.river.mongodb.MongoDBRiver;
import org.elasticsearch.river.mongodb.MongoDBRiverDefinition;
import org.elasticsearch.river.mongodb.Operation;
import org.elasticsearch.river.mongodb.Slurper;
import org.elasticsearch.river.mongodb.Timestamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Slurper_ESTest extends Slurper_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = null;
      String string1 = "I/;FR|\"a";
      ServerAddress serverAddress0 = new ServerAddress(string1);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      int int0 = (-2928);
      DBCollection dBCollection0 = slurper0.oplogCollection;
      slurper0.oplogCollection = dBCollection0;
      MockInetSocketAddress mockInetSocketAddress0 = null;
      try {
        mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, int0);
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-2928
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[2];
      String string0 = "";
      slurper0.cmdOplogNamespace = string0;
      byte byte0 = (byte) (-23);
      byteArray0[0] = byte0;
      byte byte1 = (byte)7;
      byteArray0[1] = byte1;
      DBCollection dBCollection0 = slurper0.oplogCollection;
      // Undeclared exception!
      try { 
        slurper0.doInitialImport(dBCollection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.run();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)107;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-59);
      byteArray0[1] = byte1;
      byte byte2 = (byte)4;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-81);
      byteArray0[3] = byte3;
      byte byte4 = (byte)84;
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      byte byte6 = (byte)72;
      byteArray0[6] = byte6;
      int int0 = 46;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBList lazyDBList0 = null;
      try {
        lazyDBList0 = new LazyDBList(byteArray0, int0, lazyBSONCallback0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      BasicDBObject basicDBObject0 = null;
      String string0 = "fnwT";
      BasicDBObject basicDBObject1 = slurper0.getFilterForInitialImport(basicDBObject0, string0);
      // Undeclared exception!
      try { 
        slurper0.processFullOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "]zgHRk~KfK(GQ38w*:Q";
      // Undeclared exception!
      try { 
        slurper0.getCollectionFromNamespace(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.isIndexEmpty();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      BasicDBObject basicDBObject0 = new BasicDBObject();
      String string0 = "";
      boolean boolean0 = basicDBObject0.containsField(string0);
      String string1 = "tTiN*qA97N#I|@";
      BasicDBObject basicDBObject1 = slurper0.getFilterForInitialImport(basicDBObject0, string1);
      // Undeclared exception!
      try { 
        slurper0.riverHasIndexedFromOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      ServerAddress serverAddress0 = new ServerAddress(slurper0.cmdOplogNamespace);
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0);
      Slurper slurper1 = null;
      try {
        slurper1 = new Slurper(immutableList0, slurper0.definition, slurper0.context, slurper0.client);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)100;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-3);
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-40);
      byteArray0[2] = byte2;
      byte byte3 = (byte)98;
      byteArray0[3] = byte3;
      BSONByteBuffer bSONByteBuffer0 = BSONByteBuffer.wrap(byteArray0);
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyWriteableDBObject lazyWriteableDBObject0 = new LazyWriteableDBObject(bSONByteBuffer0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.flattenOps(lazyWriteableDBObject0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      DB dB0 = slurper0.oplogDb;
      slurper0.oplogDb = dB0;
      // Undeclared exception!
      try { 
        slurper0.riverHasIndexedFromOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      Mongo mongo0 = slurper0.mongo;
      slurper0.mongo = mongo0;
      // Undeclared exception!
      try { 
        slurper0.getCurrentOplogTimestamp();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)17;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-20);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)46;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-55);
      byteArray0[5] = byte5;
      byte byte6 = (byte)92;
      byteArray0[6] = byte6;
      BSONByteBuffer bSONByteBuffer0 = BSONByteBuffer.wrap(byteArray0);
      int int0 = 1347;
      LazyBSONCallback lazyBSONCallback0 = null;
      LazyDBList lazyDBList0 = new LazyDBList(bSONByteBuffer0, int0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.flattenOps(lazyDBList0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      Slurper.SlurperException slurper_SlurperException0 = slurper0.new SlurperException(slurper0.cmdOplogNamespace);
      // Undeclared exception!
      try { 
        slurper0.isIndexEmpty();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      DBCollection dBCollection0 = slurper0.oplogCollection;
      // Undeclared exception!
      try { 
        slurper0.doInitialImport(dBCollection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "";
      slurper0.cmdOplogNamespace = string0;
      BasicDBObject basicDBObject0 = null;
      slurper0.findKeys = basicDBObject0;
      // Undeclared exception!
      try { 
        slurper0.filterMatch(basicDBObject0, basicDBObject0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-87);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-31);
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      BSONByteBuffer bSONByteBuffer0 = BSONByteBuffer.wrap(byteArray0);
      int int0 = 58;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBObject lazyDBObject0 = new LazyDBObject(bSONByteBuffer0, int0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.filterMatch(lazyDBObject0, lazyDBObject0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.assignCollections();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.run();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "";
      ESLoggerFactory eSLoggerFactory0 = mock(ESLoggerFactory.class, new ViolatedAssumptionAnswer());
      ESLoggerFactory.setDefaultFactory(eSLoggerFactory0);
      slurper0.cmdOplogNamespace = string0;
      // Undeclared exception!
      try { 
        slurper0.processFullOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.assignCollections();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "";
      // Undeclared exception!
      try { 
        slurper0.getCollectionFromNamespace(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)4;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)34;
      byteArray0[3] = byte3;
      byte byte4 = (byte)76;
      byteArray0[4] = byte4;
      byte byte5 = (byte)64;
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-107);
      byteArray0[6] = byte6;
      byte byte7 = (byte)0;
      byteArray0[7] = byte7;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBObject lazyDBObject0 = new LazyDBObject(byteArray0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.filterMatch(lazyDBObject0, lazyDBObject0);
      } catch(RuntimeException e) {
         //
         // Invalid type 76 for field @\uFFFD
         //
         verifyException("org.bson.LazyBSONObject", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "~";
      // Undeclared exception!
      try { 
        slurper0.updateIndexRefresh(string0, string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "Total document inserted [{}]";
      // Undeclared exception!
      try { 
        slurper0.updateIndexRefresh(string0, string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      BasicDBObject basicDBObject0 = slurper0.findKeys;
      // Undeclared exception!
      try { 
        slurper0.applyFieldFilter(basicDBObject0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      BasicDBObject basicDBObject0 = new BasicDBObject();
      FuzzyTermsEnum.LevenshteinAutomataAttributeImpl fuzzyTermsEnum_LevenshteinAutomataAttributeImpl0 = new FuzzyTermsEnum.LevenshteinAutomataAttributeImpl();
      boolean boolean0 = basicDBObject0.remove((Object) fuzzyTermsEnum_LevenshteinAutomataAttributeImpl0, (Object) fuzzyTermsEnum_LevenshteinAutomataAttributeImpl0);
      String string0 = slurper0.getObjectIdFromOplogEntry(basicDBObject0);
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-62);
      byteArray0[0] = byte0;
      byte byte1 = (byte)36;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-95);
      byteArray0[3] = byte3;
      byte byte4 = (byte)46;
      byteArray0[4] = byte4;
      byte byte5 = (byte)96;
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      byte byte7 = (byte)81;
      byteArray0[7] = byte7;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBObject lazyDBObject0 = new LazyDBObject(byteArray0, byte6, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.flattenOps(lazyDBObject0);
      } catch(RuntimeException e) {
         //
         // Invalid type 46 for field `
         //
         verifyException("org.bson.LazyBSONObject", e);
      }
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-1);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)46;
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)11;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-95);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-1);
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-4);
      byteArray0[7] = byte7;
      BSONByteBuffer bSONByteBuffer0 = BSONByteBuffer.wrap(byteArray0);
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyWriteableDBObject lazyWriteableDBObject0 = new LazyWriteableDBObject(bSONByteBuffer0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.applyFieldFilter(lazyWriteableDBObject0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      MongoDBRiver.QueueEntry mongoDBRiver_QueueEntry0 = new MongoDBRiver.QueueEntry(slurper0.findKeys, slurper0.cmdOplogNamespace);
      DBObject dBObject0 = mongoDBRiver_QueueEntry0.getData();
      // Undeclared exception!
      try { 
        slurper0.getObjectIdFromOplogEntry(dBObject0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      Slurper.SlurperException slurper_SlurperException0 = slurper0.new SlurperException();
      DBCollection dBCollection0 = slurper0.oplogCollection;
      // Undeclared exception!
      try { 
        slurper0.doInitialImport(dBCollection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)52;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-85);
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-103);
      byteArray0[2] = byte2;
      byte byte3 = (byte)39;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-49);
      byteArray0[5] = byte5;
      byte byte6 = (byte)103;
      byteArray0[6] = byte6;
      byte byte7 = (byte)3;
      byteArray0[7] = byte7;
      byte byte8 = (byte)0;
      byteArray0[8] = byte8;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBObject lazyDBObject0 = new LazyDBObject(byteArray0, lazyBSONCallback0);
      slurper0.flattenOps(lazyDBObject0);
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)4;
      byteArray0[0] = byte0;
      byte byte1 = (byte)59;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-57);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)50;
      byteArray0[4] = byte4;
      byte byte5 = (byte)11;
      byteArray0[5] = byte5;
      byte byte6 = (byte)28;
      byteArray0[6] = byte6;
      byte byte7 = (byte)100;
      byteArray0[7] = byte7;
      byte byte8 = (byte) (-83);
      byteArray0[8] = byte8;
      LazyBSONCallback lazyBSONCallback0 = null;
      LazyWriteableDBObject lazyWriteableDBObject0 = new LazyWriteableDBObject(byteArray0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.getObjectIdFromOplogEntry(lazyWriteableDBObject0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test33()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      DB dB0 = null;
      slurper0.slurpedDb = dB0;
      BasicDBObject basicDBObject0 = MongoDBRiverDefinition.convertToBasicDBObject(slurper0.gridfsOplogNamespace);
      String string0 = null;
      Map map0 = basicDBObject0.toMap();
      BasicDBObject basicDBObject1 = slurper0.getFilterForInitialImport(basicDBObject0, string0);
      String string1 = "collection: {}";
      Object object0 = basicDBObject1.put(string1, slurper0.slurpedDb);
      slurper0.flattenOps(basicDBObject1);
      // Undeclared exception!
      try { 
        slurper0.riverHasIndexedFromOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }
}
