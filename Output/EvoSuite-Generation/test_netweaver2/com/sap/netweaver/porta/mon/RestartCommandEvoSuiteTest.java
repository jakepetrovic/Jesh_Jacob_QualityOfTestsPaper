/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.mon;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.mon.RestartCommand;

public class RestartCommandEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.mon.RestartCommand.execute()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.mon.RestartCommand.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      RestartCommand restartCommand0 = new RestartCommand();
      // Undeclared exception!
      try {
        restartCommand0.execute();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * properties cannot be null
         */
      }
  }
}
