/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.mon;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.mon.ExitCommand;

public class ExitCommandEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.mon.ExitCommand.execute()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.mon.ExitCommand.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ExitCommand exitCommand0 = new ExitCommand();
      // Undeclared exception!
      try {
        exitCommand0.execute();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
