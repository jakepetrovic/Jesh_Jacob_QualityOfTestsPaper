/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.snippets;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.AuthenticationRefusedException;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.Credentials;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

public class SnippetUseDeployManagerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I9 Branch 1 IFEQ L34 - true
   * 2 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I25 Branch 2 IFEQ L37 - false
   * 3 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      AuthenticationReason authenticationReason0 = AuthenticationReason.INVALID_CREDENTIALS;
      Credentials credentials0 = snippetUseDeployManager0.getCredentials(authenticationReason0);
      assertEquals("<user>", credentials0.getUser());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I9 Branch 1 IFEQ L34 - false
   */
  @Test
  public void test1()  throws Throwable  {
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      AuthenticationReason authenticationReason0 = AuthenticationReason.AUTHORIZATION_REQUIRED;
      Credentials credentials0 = snippetUseDeployManager0.getCredentials(authenticationReason0);
      assertEquals("<user>", credentials0.getUser());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I25 Branch 2 IFEQ L37 - true
   * 2 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.<init>()V: root-Branch
   * 3 com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I9 Branch 1 IFEQ L34 - true
   */
  @Test
  public void test2()  throws Throwable  {
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      AuthenticationReason authenticationReason0 = AuthenticationReason.PERMISSION_DENIED;
      Credentials credentials0 = snippetUseDeployManager0.getCredentials(authenticationReason0);
      assertNull(credentials0);
  }
}
