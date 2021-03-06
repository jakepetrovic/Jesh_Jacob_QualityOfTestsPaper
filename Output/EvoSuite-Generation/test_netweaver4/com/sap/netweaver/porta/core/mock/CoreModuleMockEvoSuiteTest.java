/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationCallback;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.mock.CoreModuleMock;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

public class CoreModuleMockEvoSuiteTest {


  //Test case number: 0
  /*
   * 9 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.CoreModuleMock.checkCredentials()V: I4 Branch 1 IFNONNULL L34 - true
   * 2 com.sap.netweaver.porta.core.mock.CoreModuleMock.checkCredentials()V: I21 Branch 2 IFNE L41 - false
   * 3 com.sap.netweaver.porta.core.mock.CoreModuleMock.checkCredentials()V: I25 Branch 3 IFNE L42 - true
   * 4 com.sap.netweaver.porta.core.mock.CoreModuleMock.checkCredentials()V: I25 Branch 3 IFNE L42 - false
   * 5 com.sap.netweaver.porta.core.mock.CoreModuleMock.checkCredentials()V: I40 Branch 4 IFGT L48 - true
   * 6 com.sap.netweaver.porta.core.mock.CoreModuleMock.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)V: I4 Branch 5 IFNONNULL L52 - true
   * 7 com.sap.netweaver.porta.core.mock.CoreModuleMock.verifyCredentials()Z: I7 Branch 6 IFLE L63 - true
   * 8 com.sap.netweaver.porta.core.mock.CoreModuleMock.setAuthenticationCallback(Lcom/sap/netweaver/porta/core/AuthenticationCallback;)V: root-Branch
   * 9 com.sap.netweaver.porta.core.mock.CoreModuleMock.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CoreModuleMock coreModuleMock0 = new CoreModuleMock();
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      coreModuleMock0.setAuthenticationCallback((AuthenticationCallback) snippetUseDeployManager0);
      AuthenticationReason authenticationReason0 = AuthenticationReason.AUTHORIZATION_REQUIRED;
      coreModuleMock0.getCredentials(authenticationReason0);
      try {
        coreModuleMock0.checkCredentials();
        fail("Expecting exception: NotAuthorizedException");
      } catch(NotAuthorizedException e) {
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.mock.CoreModuleMock.checkCredentials()V: I4 Branch 1 IFNONNULL L34 - false
   * 2 com.sap.netweaver.porta.core.mock.CoreModuleMock.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)V: I4 Branch 5 IFNONNULL L52 - false
   * 3 com.sap.netweaver.porta.core.mock.CoreModuleMock.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CoreModuleMock coreModuleMock0 = new CoreModuleMock();
      try {
        coreModuleMock0.checkCredentials();
        fail("Expecting exception: NotAuthorizedException");
      } catch(NotAuthorizedException e) {
      }
  }
}
