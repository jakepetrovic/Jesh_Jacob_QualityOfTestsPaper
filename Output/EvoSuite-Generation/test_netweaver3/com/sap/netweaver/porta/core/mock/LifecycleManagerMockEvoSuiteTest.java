/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.DebugSessionInfo;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.ServerState;
import com.sap.netweaver.porta.core.mock.LifecycleManagerMock;

public class LifecycleManagerMockEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.enableDebugging()Lcom/sap/netweaver/porta/core/DebugSessionInfo;: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LifecycleManagerMock lifecycleManagerMock0 = new LifecycleManagerMock();
      DebugSessionInfo debugSessionInfo0 = lifecycleManagerMock0.enableDebugging();
      assertNull(debugSessionInfo0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.getState()Lcom/sap/netweaver/porta/core/ServerState;: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.isStartingOrStopping()Z: I6 Branch 6 IFEQ L108 - true
   * 3 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.updateState()V: I4 Branch 7 IFNE L112 - false
   */
  @Test
  public void test1()  throws Throwable  {
      LifecycleManagerMock lifecycleManagerMock0 = new LifecycleManagerMock();
      ServerState serverState0 = lifecycleManagerMock0.getState();
      assertEquals(ServerState.STOPPED, serverState0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.disableDebugging(Ljava/lang/String;)V: root-Branch
   * 2 com.sap.netweaver.porta.core.mock.LifecycleManagerMock.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      LifecycleManagerMock lifecycleManagerMock0 = new LifecycleManagerMock();
      lifecycleManagerMock0.disableDebugging("Running");
      assertEquals(ServerState.STOPPED, lifecycleManagerMock0.getState());
  }
}
