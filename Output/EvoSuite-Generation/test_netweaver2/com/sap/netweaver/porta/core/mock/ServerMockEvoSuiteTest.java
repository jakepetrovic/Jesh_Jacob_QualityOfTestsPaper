/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.mock.DeployManagerMock;
import com.sap.netweaver.porta.core.mock.LifecycleManagerMock;
import com.sap.netweaver.porta.core.mock.ServerMock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ServerMockEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = false; 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
  } 

  @Before 
  public void initTestCase(){ 
  } 

  @After 
  public void doneWithTestCase(){ 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.ServerMock.getSystemName()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.ServerMock.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ServerMock serverMock0 = new ServerMock();
      String string0 = serverMock0.getSystemName();
      assertEquals("MCK", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ServerMock.ping()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ServerMock serverMock0 = new ServerMock();
      serverMock0.ping();
      assertEquals("MCK", serverMock0.getSystemName());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.mock.ServerMock.getHttpAccessPoint()Ljava/net/InetSocketAddress;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ServerMock serverMock0 = new ServerMock();
          // Undeclared exception!
          try {
            serverMock0.getHttpAccessPoint();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.net.SocketPermission\" \"localhost\" \"resolve\")
             * java.lang.Thread.getStackTrace(Thread.java:1589)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkConnect(SecurityManager.java:1048)
             * java.net.InetAddress.getAllByName0(InetAddress.java:1238)
             * java.net.InetAddress.getAllByName(InetAddress.java:1162)
             * java.net.InetAddress.getAllByName(InetAddress.java:1098)
             * java.net.InetAddress.getByName(InetAddress.java:1048)
             * java.net.InetSocketAddress.<init>(InetSocketAddress.java:220)
             * com.sap.netweaver.porta.core.mock.ServerMock.getHttpAccessPoint(ServerMock.java:48)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * java.lang.reflect.Method.invoke(Method.java:606)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask.run(FutureTask.java:262)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
             * java.lang.Thread.run(Thread.java:745)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.ServerMock.getLifecycleManager()Lcom/sap/netweaver/porta/core/LifecycleManager;: I4 Branch 1 IFNONNULL L26 - true
   * 2 com.sap.netweaver.porta.core.mock.ServerMock.getLifecycleManager()Lcom/sap/netweaver/porta/core/LifecycleManager;: I4 Branch 1 IFNONNULL L26 - false
   */
  @Test
  public void test3()  throws Throwable  {
      ServerMock serverMock0 = new ServerMock();
      LifecycleManagerMock lifecycleManagerMock0 = (LifecycleManagerMock)serverMock0.getLifecycleManager();
      LifecycleManagerMock lifecycleManagerMock1 = (LifecycleManagerMock)serverMock0.getLifecycleManager();
      assertSame(lifecycleManagerMock1, lifecycleManagerMock0);
      assertNotNull(lifecycleManagerMock1);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.ServerMock.getDeployManager()Lcom/sap/netweaver/porta/core/DeployManager;: I4 Branch 2 IFNONNULL L33 - true
   * 2 com.sap.netweaver.porta.core.mock.ServerMock.getDeployManager()Lcom/sap/netweaver/porta/core/DeployManager;: I4 Branch 2 IFNONNULL L33 - false
   * 3 com.sap.netweaver.porta.core.mock.ServerMock.<init>()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ServerMock serverMock0 = new ServerMock();
      DeployManagerMock deployManagerMock0 = (DeployManagerMock)serverMock0.getDeployManager();
      DeployManagerMock deployManagerMock1 = (DeployManagerMock)serverMock0.getDeployManager();
      assertSame(deployManagerMock1, deployManagerMock0);
      assertNotNull(deployManagerMock1);
  }
}
