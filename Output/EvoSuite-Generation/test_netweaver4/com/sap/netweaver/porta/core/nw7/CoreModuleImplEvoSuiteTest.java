/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationCallback;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.nw7.DeployManagerImpl;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

public class CoreModuleImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.setAuthenticationCallback(Lcom/sap/netweaver/porta/core/AuthenticationCallback;)V: root-Branch
   * 2 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DeployManagerImpl deployManagerImpl0 = new DeployManagerImpl("", (-1887));
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      deployManagerImpl0.setAuthenticationCallback((AuthenticationCallback) snippetUseDeployManager0);
      assertEquals(false, deployManagerImpl0.initialized());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.checkInitialized()V: I4 Branch 1 IFNE L38 - false
   * 2 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DeployManagerImpl deployManagerImpl0 = new DeployManagerImpl("", (-1887));
      try {
        deployManagerImpl0.checkInitialized();
        fail("Expecting exception: CoreException");
      } catch(CoreException e) {
        /*
         * java.net.MalformedURLException: Invalid port number :-138687
         */
      }
  }
}
