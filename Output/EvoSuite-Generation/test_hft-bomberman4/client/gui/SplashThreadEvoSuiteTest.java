/*
 * This file was automatically generated by EvoSuite
 */

package client.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.gui.SplashThread;

@RunWith(EvoSuiteRunner.class)
public class SplashThreadEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 client.gui.SplashThread.setRun(Z)V: root-Branch
   * 2 client.gui.SplashThread.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SplashThread splashThread0 = new SplashThread();
      splashThread0.setRun(false);
      assertEquals(7849L, splashThread0.getId());
      assertEquals("Thread[Thread-7823,5,Test Execution]", splashThread0.toString());
  }
}