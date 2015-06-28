/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.AuthenticationRefusedException;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback;

public class AuthCallbackEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 4 TABLESWITCH L39 Case 1 - true
   * 2 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 5 TABLESWITCH L39 Case 2 - false
   * 3 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 6 TABLESWITCH L39 Case 3 - false
   * 4 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 7 TABLESWITCH L39 Default-Case - false
   * 5 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I11 Branch 8 IFEQ L41 - true
   * 6 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.<init>(ZLjava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      AuthCallback authCallback0 = new AuthCallback(false, "#;6AP6;L");
      AuthenticationReason authenticationReason0 = AuthenticationReason.AUTHORIZATION_REQUIRED;
      // Undeclared exception!
      try {
        authCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/eclipse/swt/widgets/Display
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 4 TABLESWITCH L39 Case 1 - false
   * 2 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 5 TABLESWITCH L39 Case 2 - true
   */
  @Test
  public void test1()  throws Throwable  {
      AuthCallback authCallback0 = new AuthCallback(false, "%");
      AuthenticationReason authenticationReason0 = AuthenticationReason.INVALID_CREDENTIALS;
      // Undeclared exception!
      try {
        authCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/eclipse/swt/widgets/Display
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 6 TABLESWITCH L39 Case 3 - true
   * 2 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 4 TABLESWITCH L39 Case 1 - false
   */
  @Test
  public void test2()  throws Throwable  {
      AuthenticationReason authenticationReason0 = AuthenticationReason.PERMISSION_DENIED;
      AuthCallback authCallback0 = new AuthCallback(false, "");
      // Undeclared exception!
      try {
        authCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/eclipse/swt/widgets/Display
         */
      }
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * 1 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I11 Branch 8 IFEQ L41 - false
   * 2 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.<init>(ZLjava/lang/String;)V: root-Branch
   * 3 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 4 TABLESWITCH L39 Case 1 - true
   * 4 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 5 TABLESWITCH L39 Case 2 - false
   * 5 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 6 TABLESWITCH L39 Case 3 - false
   * 6 com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 7 TABLESWITCH L39 Default-Case - false
   */
  @Test
  public void test3()  throws Throwable  {
      AuthCallback authCallback0 = new AuthCallback(true, "INVALID_CREDE8RZNTA-");
      AuthenticationReason authenticationReason0 = AuthenticationReason.AUTHORIZATION_REQUIRED;
      // Undeclared exception!
      try {
        authCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/eclipse/swt/widgets/Display
         */
      }
  }
}
