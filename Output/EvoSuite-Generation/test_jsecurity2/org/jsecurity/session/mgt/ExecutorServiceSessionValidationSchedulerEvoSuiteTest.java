/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.session.mgt;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.session.mgt.DefaultSessionManager;
import org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler;
import org.jsecurity.session.mgt.ValidatingSessionManager;

public class ExecutorServiceSessionValidationSchedulerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.getSessionManager()Lorg/jsecurity/session/mgt/ValidatingSessionManager;: root-Branch
   * 2 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      executorServiceSessionValidationScheduler0.getSessionManager();
      assertEquals(false, executorServiceSessionValidationScheduler0.isEnabled());
      assertEquals(3600000L, executorServiceSessionValidationScheduler0.getInterval());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.setSessionManager(Lorg/jsecurity/session/mgt/ValidatingSessionManager;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      executorServiceSessionValidationScheduler0.setSessionManager((ValidatingSessionManager) null);
      assertEquals(3600000L, executorServiceSessionValidationScheduler0.getInterval());
      assertEquals(false, executorServiceSessionValidationScheduler0.isEnabled());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.<init>(Lorg/jsecurity/session/mgt/ValidatingSessionManager;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DefaultSessionManager defaultSessionManager0 = new DefaultSessionManager();
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler((ValidatingSessionManager) defaultSessionManager0);
      assertEquals(3600000L, executorServiceSessionValidationScheduler0.getInterval());
      assertEquals(false, executorServiceSessionValidationScheduler0.isEnabled());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.enableSessionValidation()V: I6 Branch 1 IFLE L77 - true
   * 2 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.setInterval(J)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      executorServiceSessionValidationScheduler0.setInterval((-110L));
      executorServiceSessionValidationScheduler0.enableSessionValidation();
      assertEquals((-110L), executorServiceSessionValidationScheduler0.getInterval());
      assertEquals(false, executorServiceSessionValidationScheduler0.isEnabled());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.disableSessionValidation()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      // Undeclared exception!
      try {
        executorServiceSessionValidationScheduler0.disableSessionValidation();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.isEnabled()Z: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      boolean boolean0 = executorServiceSessionValidationScheduler0.isEnabled();
      assertEquals(false, boolean0);
      assertEquals(3600000L, executorServiceSessionValidationScheduler0.getInterval());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.getInterval()J: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      long long0 = executorServiceSessionValidationScheduler0.getInterval();
      assertEquals(false, executorServiceSessionValidationScheduler0.isEnabled());
      assertEquals(3600000L, long0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.enableSessionValidation()V: I6 Branch 1 IFLE L77 - false
   */
  @Test
  public void test7()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      assertEquals(false, executorServiceSessionValidationScheduler0.isEnabled());
      
      executorServiceSessionValidationScheduler0.enableSessionValidation();
      assertEquals(true, executorServiceSessionValidationScheduler0.isEnabled());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.run()V: I4 Branch 2 IFEQ L85 - true
   * 2 org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      ExecutorServiceSessionValidationScheduler executorServiceSessionValidationScheduler0 = new ExecutorServiceSessionValidationScheduler();
      // Undeclared exception!
      try {
        executorServiceSessionValidationScheduler0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}