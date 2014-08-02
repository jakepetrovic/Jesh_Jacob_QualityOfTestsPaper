/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.util.JavaEnvironment;

public class JavaEnvironmentEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.JavaEnvironment.getMajorVersion()I: root-Branch
   * 2 org.jsecurity.util.JavaEnvironment.isAtLeastVersion15()Z: I4 Branch 2 IF_ICMPLT L149 - false
   */
  @Test
  public void test0()  throws Throwable  {
      boolean boolean0 = JavaEnvironment.isAtLeastVersion15();
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.JavaEnvironment.getVersion()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      String string0 = JavaEnvironment.getVersion();
      assertEquals("1.7.0_51", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.JavaEnvironment.isAtLeastVersion14()Z: I4 Branch 1 IF_ICMPLT L135 - false
   * 2 org.jsecurity.util.JavaEnvironment.getMajorVersion()I: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = JavaEnvironment.isAtLeastVersion14();
      assertEquals(true, boolean0);
  }
}
