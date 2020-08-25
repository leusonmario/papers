/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 17:21:17 GMT 2020
 */

package org.activiti.engine.impl.persistence.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.script.Bindings;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;
import org.activiti.engine.impl.DeploymentQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.RuntimeServiceImpl;
import org.activiti.engine.impl.TaskServiceImpl;
import org.activiti.engine.impl.cfg.CommandExecutorImpl;
import org.activiti.engine.impl.cfg.JtaProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.engine.impl.el.NoExecutionVariableScope;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandConfig;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.CommandContextFactory;
import org.activiti.engine.impl.interceptor.CommandInvoker;
import org.activiti.engine.impl.persistence.entity.DeploymentEntity;
import org.activiti.engine.impl.persistence.entity.DeploymentEntityManager;
import org.activiti.engine.impl.pvm.runtime.ExecutionImpl;
import org.activiti.engine.impl.repository.DeploymentBuilderImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ExecutionQuery;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityManager_ESTest extends DeploymentEntityManager_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "org.activiti.engine.impl.juel.AstProperty";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.getDeploymentResourceNames(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      NoExecutionVariableScope noExecutionVariableScope0 = new NoExecutionVariableScope();
      Map<String, Object> map0 = noExecutionVariableScope0.getVariablesLocal();
      int int0 = (-1);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByNativeQuery(map0, int0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "";
      String string1 = "v&m";
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.deleteDeployment(string1, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentEntity deploymentEntity0 = new DeploymentEntity();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.insertDeployment(deploymentEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      CommandContext commandContext0 = null;
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandContext0);
      String string0 = "Tr^KBv8k";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentTenantIdLike(string0);
      JtaProcessEngineConfiguration jtaProcessEngineConfiguration0 = new JtaProcessEngineConfiguration();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.flush();
      deploymentEntityManager0.flush();
      CommandConfig commandConfig0 = new CommandConfig();
      CommandInvoker commandInvoker0 = new CommandInvoker();
      CommandExecutorImpl commandExecutorImpl0 = new CommandExecutorImpl(commandConfig0, commandInvoker0);
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl(commandExecutorImpl0);
      String string0 = "selectDeploymentByNativeQuery";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentName(string0);
      int int0 = 617;
      Page page0 = new Page(int0, int0);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl1, page0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      String string0 = ";K|He-\"a>jN-rQ;}";
      String string1 = null;
      String string2 = "1Rmr_\\>$zLP@Xd>?n";
      boolean boolean0 = false;
      TaskServiceImpl taskServiceImpl0 = new TaskServiceImpl();
      String string3 = "selectDeploymentById";
      // Undeclared exception!
      try { 
        taskServiceImpl0.getVariablesLocal(string3);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.TaskServiceImpl", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "\"B>$L";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentById(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      deploymentEntityManager0.close();
      String string0 = "[";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      ScriptEngineManager scriptEngineManager0 = new ScriptEngineManager();
      Bindings bindings0 = scriptEngineManager0.getBindings();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(bindings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = ",<VjlQ6";
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.deleteDeployment(string0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      ScriptEngineManager scriptEngineManager0 = new ScriptEngineManager();
      Bindings bindings0 = scriptEngineManager0.getBindings();
      int int0 = Integer.MAX_VALUE;
      String string0 = "selectDeploymentsByQueryCriteria";
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.deleteDeployment(string0, boolean0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentTenantId(string0);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentCategory(deploymentQueryImpl0.SORTORDER_ASC);
      String string1 = "org.activiti.engine.impl.event.logger.handler.ProcessInstanceStartedEventHandler";
      DeploymentQueryImpl deploymentQueryImpl3 = deploymentQueryImpl2.processDefinitionKeyLike(string1);
      DeploymentQueryImpl deploymentQueryImpl4 = deploymentQueryImpl3.deploymentId(deploymentQueryImpl2.SORTORDER_ASC);
      int int0 = 0;
      int int1 = (-1);
      Page page0 = new Page(int0, int1);
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl4, page0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "";
      MockThread mockThread0 = new MockThread(string0);
      ClassLoader classLoader0 = mockThread0.getContextClassLoader();
      boolean boolean0 = true;
      classLoader0.setDefaultAssertionStatus(boolean0);
      ScriptEngineManager scriptEngineManager0 = new ScriptEngineManager(classLoader0);
      Bindings bindings0 = scriptEngineManager0.getBindings();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByNativeQuery(bindings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      RepositoryServiceImpl repositoryServiceImpl0 = new RepositoryServiceImpl();
      DeploymentBuilderImpl deploymentBuilderImpl0 = new DeploymentBuilderImpl(repositoryServiceImpl0);
      DeploymentBuilder deploymentBuilder0 = deploymentBuilderImpl0.disableBpmnValidation();
      DeploymentEntity deploymentEntity0 = deploymentBuilderImpl0.getDeployment();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.insertDeployment(deploymentEntity0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      DeploymentQueryImpl deploymentQueryImpl0 = new DeploymentQueryImpl();
      String string0 = "c|4:/Cu";
      DeploymentQueryImpl deploymentQueryImpl1 = deploymentQueryImpl0.deploymentCategory(string0);
      DeploymentQueryImpl deploymentQueryImpl2 = deploymentQueryImpl1.deploymentWithoutTenantId();
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "javax.script.engine_version";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      String string0 = "ig4E";
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findLatestDeploymentByName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      DeploymentEntityManager deploymentEntityManager0 = new DeploymentEntityManager();
      ExecutionImpl executionImpl0 = new ExecutionImpl();
      Map<String, Object> map0 = executionImpl0.getVariables();
      int int0 = 0;
      // Undeclared exception!
      try { 
        deploymentEntityManager0.findDeploymentsByNativeQuery(map0, int0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.activiti.engine.impl.persistence.AbstractManager", e);
      }
  }
}
