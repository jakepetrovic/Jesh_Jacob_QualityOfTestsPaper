/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.mon;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.AuthenticationRefusedException;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback;

public class LifecycleManagerAuthenticationCallbackEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 1 LOOKUPSWITCH L26 Case 1 - true
   * 2 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 2 LOOKUPSWITCH L26 Case 2 - false
   * 3 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 3 LOOKUPSWITCH L26 Default-Case - false
   * 4 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LifecycleManagerAuthenticationCallback lifecycleManagerAuthenticationCallback0 = new LifecycleManagerAuthenticationCallback();
      AuthenticationReason authenticationReason0 = AuthenticationReason.AUTHORIZATION_REQUIRED;
      // Undeclared exception!
      try {
        lifecycleManagerAuthenticationCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 1 LOOKUPSWITCH L26 Case 1 - false
   * 2 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 2 LOOKUPSWITCH L26 Case 2 - true
   * 3 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 3 LOOKUPSWITCH L26 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      LifecycleManagerAuthenticationCallback lifecycleManagerAuthenticationCallback0 = new LifecycleManagerAuthenticationCallback();
      AuthenticationReason authenticationReason0 = AuthenticationReason.INVALID_CREDENTIALS;
      // Undeclared exception!
      try {
        lifecycleManagerAuthenticationCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 3 LOOKUPSWITCH L26 Default-Case - true
   * 2 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.<init>()V: root-Branch
   * 3 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 1 LOOKUPSWITCH L26 Case 1 - false
   * 4 com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback.getCredentials(Lcom/sap/netweaver/porta/core/AuthenticationReason;)Lcom/sap/netweaver/porta/core/Credentials;: I6 Branch 2 LOOKUPSWITCH L26 Case 2 - false
   */
  @Test
  public void test2()  throws Throwable  {
      LifecycleManagerAuthenticationCallback lifecycleManagerAuthenticationCallback0 = new LifecycleManagerAuthenticationCallback();
      AuthenticationReason authenticationReason0 = AuthenticationReason.PERMISSION_DENIED;
      // Undeclared exception!
      try {
        lifecycleManagerAuthenticationCallback0.getCredentials(authenticationReason0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
