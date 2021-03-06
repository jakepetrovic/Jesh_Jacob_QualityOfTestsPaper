/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.nw7.FaultReasons;

public class FaultReasonsEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.nw7.FaultReasons.getFaultReason()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FaultReasons faultReasons0 = FaultReasons.FAULT_PERMISSION_DENIED;
      String string0 = faultReasons0.getFaultReason();
      assertEquals("Permission denied", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.nw7.FaultReasons.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      FaultReasons faultReasons0 = FaultReasons.FAULT_PERMISSION_DENIED;
      String string0 = faultReasons0.toString();
      assertEquals("Permission denied", string0);
  }
}
