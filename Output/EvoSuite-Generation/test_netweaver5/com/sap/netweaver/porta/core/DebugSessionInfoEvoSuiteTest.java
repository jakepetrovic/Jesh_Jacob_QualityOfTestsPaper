/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.DebugSessionInfo;

public class DebugSessionInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.DebugSessionInfo.getPort()I: root-Branch
   * 2 com.sap.netweaver.porta.core.DebugSessionInfo.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DebugSessionInfo debugSessionInfo0 = new DebugSessionInfo("w% qZ&B", (-653));
      int int0 = debugSessionInfo0.getPort();
      assertEquals((-653), int0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.DebugSessionInfo.getKey()Ljava/lang/String;: root-Branch
   * 2 com.sap.netweaver.porta.core.DebugSessionInfo.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DebugSessionInfo debugSessionInfo0 = new DebugSessionInfo("w% qZ&B", (-653));
      String string0 = debugSessionInfo0.getKey();
      assertNotNull(string0);
      assertEquals(-653, debugSessionInfo0.getPort());
  }
}
