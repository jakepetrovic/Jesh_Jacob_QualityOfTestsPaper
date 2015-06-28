/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.DeployResultStatus;
import com.sap.netweaver.porta.core.nw7.DeployResultImpl;

public class DeployResultImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.nw7.DeployResultImpl.getStatus()Lcom/sap/netweaver/porta/core/DeployResultStatus;: root-Branch
   * 2 com.sap.netweaver.porta.core.nw7.DeployResultImpl.<init>(Lcom/sap/netweaver/porta/core/DeployResultStatus;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DeployResultStatus deployResultStatus0 = DeployResultStatus.UNKNOWN;
      DeployResultImpl deployResultImpl0 = new DeployResultImpl(deployResultStatus0, "d}fD");
      DeployResultStatus deployResultStatus1 = deployResultImpl0.getStatus();
      assertEquals(DeployResultStatus.UNKNOWN, deployResultStatus1);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.nw7.DeployResultImpl.getStatusDetails()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.core.nw7.DeployResultImpl.<init>(Lcom/sap/netweaver/porta/core/DeployResultStatus;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DeployResultStatus deployResultStatus0 = DeployResultStatus.UNKNOWN;
      DeployResultImpl deployResultImpl0 = new DeployResultImpl(deployResultStatus0, "d}fD");
      String string0 = deployResultImpl0.getStatusDetails();
      assertEquals("d}fD", string0);
  }
}
