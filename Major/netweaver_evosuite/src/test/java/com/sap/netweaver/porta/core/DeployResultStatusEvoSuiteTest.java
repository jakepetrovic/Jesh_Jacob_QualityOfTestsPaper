/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.DeployResultStatus;

public class DeployResultStatusEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.DeployResultStatus.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DeployResultStatus deployResultStatus0 = DeployResultStatus.SUCCESS;
      String string0 = deployResultStatus0.toString();
      assertEquals("Success", string0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.DeployResultStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/DeployResultStatus;: I14 Branch 1 IF_ICMPGE L57 - true
   * 2 com.sap.netweaver.porta.core.DeployResultStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/DeployResultStatus;: I14 Branch 1 IF_ICMPGE L57 - false
   * 3 com.sap.netweaver.porta.core.DeployResultStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/DeployResultStatus;: I25 Branch 2 IFLE L58 - true
   */
  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        DeployResultStatus.getByName("kFkV>-V$LovrS;w)^V");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * kFkV>-V$LovrS;w)^V
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.DeployResultStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/DeployResultStatus;: I25 Branch 2 IFLE L58 - false
   * 2 com.sap.netweaver.porta.core.DeployResultStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/DeployResultStatus;: I14 Branch 1 IF_ICMPGE L57 - false
   * 3 com.sap.netweaver.porta.core.DeployResultStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/DeployResultStatus;: I25 Branch 2 IFLE L58 - true
   */
  @Test
  public void test2()  throws Throwable  {
      DeployResultStatus deployResultStatus0 = DeployResultStatus.getByName("Success");
      assertEquals(DeployResultStatus.SUCCESS, deployResultStatus0);
  }
}