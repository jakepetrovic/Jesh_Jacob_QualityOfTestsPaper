/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core.nw7;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationCallback;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.nw7.DeployManagerImpl;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

public class CoreModuleImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.checkInitialized()V: I4 Branch 1 IFNE L38 - false
   * 2 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DeployManagerImpl deployManagerImpl0 = new DeployManagerImpl("<dPss", 15);
      // Undeclared exception!
      try {
        deployManagerImpl0.getApplications();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_ServiceLocator
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.setAuthenticationCallback(Lcom/sap/netweaver/porta/core/AuthenticationCallback;)V: root-Branch
   * 2 com.sap.netweaver.porta.core.nw7.CoreModuleImpl.<init>(Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DeployManagerImpl deployManagerImpl0 = new DeployManagerImpl("]yk@k>wux{ 7L>", (-1756));
      SnippetUseDeployManager snippetUseDeployManager0 = new SnippetUseDeployManager();
      deployManagerImpl0.setAuthenticationCallback((AuthenticationCallback) snippetUseDeployManager0);
      assertEquals(false, deployManagerImpl0.initialized());
  }
}