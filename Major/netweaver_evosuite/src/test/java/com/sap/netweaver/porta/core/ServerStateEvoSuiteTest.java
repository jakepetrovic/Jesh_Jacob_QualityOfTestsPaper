/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.ServerState;

public class ServerStateEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.ServerState.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ServerState serverState0 = ServerState.UNKNOWN;
      String string0 = serverState0.toString();
      assertEquals("Unknown", string0);
  }
}