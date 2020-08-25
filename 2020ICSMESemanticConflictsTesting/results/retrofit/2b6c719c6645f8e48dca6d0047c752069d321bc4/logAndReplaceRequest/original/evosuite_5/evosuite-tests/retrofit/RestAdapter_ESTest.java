/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 06:37:55 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.gesture.Gesture;
import com.google.gson.Gson;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.lang.reflect.Array;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.DefaultedHttpParams;
import org.apache.http.protocol.HttpRequestExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import retrofit.ErrorHandler;
import retrofit.Profiler;
import retrofit.RequestInterceptor;
import retrofit.RequestInterceptorTape;
import retrofit.RestAdapter;
import retrofit.Server;
import retrofit.android.AndroidLog;
import retrofit.client.ApacheClient;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.OkClient;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;
import retrofit.converter.ProtoConverter;
import retrofit.converter.WireConverter;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RestAdapter_ESTest extends RestAdapter_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Gson gson0 = null;
      String string0 = "S&>j8";
      GsonConverter gsonConverter0 = new GsonConverter(gson0, string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setConverter(gsonConverter0);
      Executor executor0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setExecutors(executor0, executor0);
      } catch(NullPointerException e) {
         //
         // HTTP executor may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      OkClient okClient0 = new OkClient();
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient((Client) okClient0);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setLogLevel(restAdapter_LogLevel0);
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setConverter(gsonConverter0);
      int int0 = 2;
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0, threadPoolExecutor_DiscardOldestPolicy0);
      boolean boolean0 = false;
      scheduledThreadPoolExecutor0.setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean0);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder2.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder1.setClient(client_Provider0);
      boolean boolean1 = scheduledThreadPoolExecutor0.isShutdown();
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder3.setLog(restAdapter_Log0);
      RestAdapter.Builder restAdapter_Builder7 = restAdapter_Builder4.setRequestInterceptor(requestInterceptor0);
      String string0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder2.setServer(string0);
      } catch(NullPointerException e) {
         //
         // Server may not be blank.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      // Undeclared exception!
      try { 
        restAdapter_Builder0.build();
      } catch(IllegalArgumentException e) {
         //
         // Server may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "4 rl'5-";
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(string0);
      RestAdapter restAdapter0 = restAdapter_Builder0.build();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.HEADERS;
      restAdapter0.setLogLevel(restAdapter_LogLevel0);
      RestAdapter.LogLevel restAdapter_LogLevel1 = restAdapter0.getLogLevel();
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder0.setServer(string0);
      RestAdapter.LogLevel[] restAdapter_LogLevelArray0 = RestAdapter.LogLevel.values();
      BasicHttpParams basicHttpParams0 = new BasicHttpParams();
      DefaultedHttpParams defaultedHttpParams0 = new DefaultedHttpParams(basicHttpParams0, basicHttpParams0);
      String string1 = "Kk\\_-0DleLmjR?";
      boolean boolean0 = basicHttpParams0.isParameterTrue(string1);
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder1.setServer(server0);
      DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient(defaultedHttpParams0);
      ApacheClient apacheClient0 = new ApacheClient(defaultHttpClient0);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder1.setClient((Client) apacheClient0);
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder2.setLog(restAdapter_Log0);
      Client.Provider client_Provider0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setClient(client_Provider0);
      } catch(NullPointerException e) {
         //
         // Client provider may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "~?3JZQ?Gdlnj%cq:r>";
      AndroidLog androidLog0 = new AndroidLog(string0);
      String string1 = "";
      String string2 = "";
      androidLog0.log(string2);
      androidLog0.log(string2);
      androidLog0.log(string1);
      androidLog0.log(string1);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      String string3 = "";
      // Undeclared exception!
      try { 
        RestAdapter.LogLevel.valueOf(string3);
      } catch(IllegalArgumentException e) {
         //
         // No enum constant retrofit.RestAdapter.LogLevel.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "com.fasterxml.jackson.core.JsonStreamContext";
      Server server0 = new Server(string0, string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      RestAdapter.Log restAdapter_Log0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setLog(restAdapter_Log0);
      } catch(NullPointerException e) {
         //
         // Log may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.FULL;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      RestAdapter.LogLevel restAdapter_LogLevel1 = RestAdapter.LogLevel.FULL;
      ProtoConverter protoConverter0 = new ProtoConverter();
      ForkJoinPool forkJoinPool0 = ForkJoinTask.getPool();
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setExecutors(forkJoinPool0, forkJoinPool0);
      } catch(NullPointerException e) {
         //
         // HTTP executor may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      HttpClient httpClient0 = null;
      ApacheClient apacheClient0 = new ApacheClient(httpClient0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient((Client) apacheClient0);
      RequestInterceptor requestInterceptor0 = RequestInterceptor.NONE;
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setRequestInterceptor(requestInterceptor0);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      Class<Object> class1 = Object.class;
      classArray0[1] = class1;
      Wire wire0 = new Wire(classArray0);
      WireConverter wireConverter0 = new WireConverter(wire0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder0.setConverter(wireConverter0);
      TypedInput typedInput0 = null;
      // Undeclared exception!
      try { 
        wireConverter0.fromBody(typedInput0, classArray0[0]);
      } catch(IllegalArgumentException e) {
         //
         // Expected a proto message but was java.lang.Object
         //
         verifyException("retrofit.converter.WireConverter", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.HEADERS;
      boolean boolean0 = restAdapter_LogLevel0.log();
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setErrorHandler(errorHandler0);
      String string0 = "";
      Server server0 = new Server(string0);
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder1.setServer(server0);
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder2.setClient(client_Provider0);
      RestAdapter restAdapter0 = restAdapter_Builder4.build();
      Profiler<Integer> profiler0 = (Profiler<Integer>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder4.setProfiler(profiler0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        restAdapter0.create(class0);
      } catch(IllegalArgumentException e) {
         //
         // Only interface endpoint definitions are supported.
         //
         verifyException("retrofit.RestAdapter", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<RouteInfo.TunnelType> profiler0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setProfiler(profiler0);
      } catch(NullPointerException e) {
         //
         // Profiler may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      RestAdapter.LogLevel[] restAdapter_LogLevelArray0 = RestAdapter.LogLevel.values();
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = null;
      AndroidLog androidLog0 = new AndroidLog(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLog(androidLog0);
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setClient(client_Provider0);
      ProtoConverter protoConverter0 = new ProtoConverter();
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setConverter(protoConverter0);
      String string1 = "\\I&%,kNgMu{np$";
      Server server0 = new Server(string0, string1);
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder3.setServer(server0);
      RestAdapter restAdapter0 = restAdapter_Builder4.build();
      Class<Delayed> class0 = Delayed.class;
      Delayed delayed0 = restAdapter0.create(class0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "p^Eu~-";
      Server server0 = new Server(string0, string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setServer(server0);
      Profiler<String> profiler0 = (Profiler<String>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setProfiler(profiler0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder3 = restAdapter_Builder2.setErrorHandler(errorHandler0);
      int int0 = 1308;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0, threadFactory0, threadPoolExecutor_DiscardOldestPolicy0);
      UrlConnectionClient urlConnectionClient0 = new UrlConnectionClient();
      RestAdapter.Builder restAdapter_Builder4 = restAdapter_Builder2.setClient((Client) urlConnectionClient0);
      RestAdapter.Builder restAdapter_Builder5 = restAdapter_Builder3.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      RestAdapter.Builder restAdapter_Builder6 = restAdapter_Builder5.setExecutors(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      RestAdapter restAdapter0 = restAdapter_Builder3.build();
      Class<Delayed> class0 = Delayed.class;
      Delayed delayed0 = restAdapter0.create(class0);
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.FULL;
      RestAdapter.Builder restAdapter_Builder7 = restAdapter_Builder3.setLogLevel(restAdapter_LogLevel0);
      RestAdapter restAdapter1 = restAdapter_Builder3.build();
      Class<String> class1 = String.class;
      // Undeclared exception!
      try { 
        restAdapter1.create(class1);
      } catch(IllegalArgumentException e) {
         //
         // Only interface endpoint definitions are supported.
         //
         verifyException("retrofit.RestAdapter", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Converter converter0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setConverter(converter0);
      } catch(NullPointerException e) {
         //
         // Converter may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      RestAdapter.Log restAdapter_Log0 = RestAdapter.Log.NONE;
      String string0 = "retrofit.RestAdapter$1";
      restAdapter_Log0.log(string0);
      String string1 = null;
      restAdapter_Log0.log(string1);
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = " (through reference chain: ";
      AndroidLog androidLog0 = new AndroidLog(string0);
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLog(androidLog0);
      Client client0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setClient(client0);
      } catch(NullPointerException e) {
         //
         // Client may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.BASIC;
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setLogLevel(restAdapter_LogLevel0);
      RequestInterceptor requestInterceptor0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setRequestInterceptor(requestInterceptor0);
      } catch(NullPointerException e) {
         //
         // Request interceptor may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      String string0 = "";
      // Undeclared exception!
      try { 
        restAdapter_Builder0.setServer(string0);
      } catch(NullPointerException e) {
         //
         // Server may not be blank.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      WireConverter wireConverter0 = new WireConverter();
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setConverter(wireConverter0);
      ErrorHandler errorHandler0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setErrorHandler(errorHandler0);
      } catch(NullPointerException e) {
         //
         // Error handler may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Client.Provider client_Provider0 = mock(Client.Provider.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setClient(client_Provider0);
      Server server0 = null;
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setServer(server0);
      } catch(NullPointerException e) {
         //
         // Server may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      RestAdapter.LogLevel restAdapter_LogLevel0 = RestAdapter.LogLevel.NONE;
      boolean boolean0 = restAdapter_LogLevel0.log();
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      RestAdapter.Builder restAdapter_Builder0 = new RestAdapter.Builder();
      Profiler<Gesture> profiler0 = (Profiler<Gesture>) mock(Profiler.class, new ViolatedAssumptionAnswer());
      RestAdapter.Builder restAdapter_Builder1 = restAdapter_Builder0.setProfiler(profiler0);
      ErrorHandler errorHandler0 = mock(ErrorHandler.class, new ViolatedAssumptionAnswer());
      Profiler<TypedByteArray> profiler1 = null;
      int int0 = 2170;
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0);
      String string0 = "}?2`<W";
      MockThread mockThread0 = new MockThread(string0);
      MockThread mockThread1 = new MockThread(mockThread0);
      MockThread mockThread2 = new MockThread(mockThread1, string0);
      long long0 = 1L;
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      ScheduledFuture<?> scheduledFuture0 = scheduledThreadPoolExecutor0.scheduleWithFixedDelay(mockThread2, long0, int0, timeUnit0);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      RestAdapter.Builder restAdapter_Builder2 = restAdapter_Builder1.setExecutors(scheduledThreadPoolExecutor0, forkJoinPool0);
      // Undeclared exception!
      try { 
        restAdapter_Builder1.setProfiler(profiler1);
      } catch(NullPointerException e) {
         //
         // Profiler may not be null.
         //
         verifyException("retrofit.RestAdapter$Builder", e);
      }
  }
}
