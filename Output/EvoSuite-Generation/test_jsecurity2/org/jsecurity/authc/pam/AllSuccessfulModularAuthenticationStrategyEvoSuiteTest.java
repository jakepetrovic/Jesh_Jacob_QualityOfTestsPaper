/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.pam;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UnknownAccountException;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy;
import org.jsecurity.authc.pam.UnsupportedTokenException;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;

public class AllSuccessfulModularAuthenticationStrategyEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.afterAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;Lorg/jsecurity/authc/AuthenticationInfo;Ljava/lang/Throwable;)Lorg/jsecurity/authc/AuthenticationInfo;: I46 Branch 4 IFNONNULL L87 - false
   * 2 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.beforeAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;)Lorg/jsecurity/authc/AuthenticationInfo;: I5 Branch 1 IFNE L53 - true
   * 3 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.<init>()V: root-Branch
   * 4 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.afterAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;Lorg/jsecurity/authc/AuthenticationInfo;Ljava/lang/Throwable;)Lorg/jsecurity/authc/AuthenticationInfo;: I3 Branch 2 IFNULL L76 - true
   */
  @Test
  public void test0()  throws Throwable  {
      AllSuccessfulModularAuthenticationStrategy allSuccessfulModularAuthenticationStrategy0 = new AllSuccessfulModularAuthenticationStrategy();
      String string0 = "}I6H$pP(0wM\\uB<l";
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(string0, string0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      AuthenticationInfo authenticationInfo0 = null;
      AuthenticationInfo authenticationInfo1 = allSuccessfulModularAuthenticationStrategy0.beforeAttempt((Realm) simpleAccountRealm0, (AuthenticationToken) usernamePasswordToken0, authenticationInfo0);
      Throwable throwable0 = null;
      try {
        allSuccessfulModularAuthenticationStrategy0.afterAttempt((Realm) simpleAccountRealm0, (AuthenticationToken) usernamePasswordToken0, authenticationInfo1, authenticationInfo1, throwable0);
        fail("Expecting exception: UnknownAccountException");
      } catch(UnknownAccountException e) {
        /*
         * Realm [org.jsecurity.realm.SimpleAccountRealm@7763ea33] could not find any associated account data for the submitted AuthenticationToken [org.jsecurity.authc.UsernamePasswordToken - }I6H$pP(0wM\\uB<l, rememberMe=false].  The [org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy] implementation requires all configured realm(s) to acquire valid account data for a submitted token during the log-in process.
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.beforeAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;)Lorg/jsecurity/authc/AuthenticationInfo;: I5 Branch 1 IFNE L53 - false
   */
  @Test
  public void test1()  throws Throwable  {
      AllSuccessfulModularAuthenticationStrategy allSuccessfulModularAuthenticationStrategy0 = new AllSuccessfulModularAuthenticationStrategy();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("]. Trying altenative implemntations...");
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((Object) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (Object) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
      try {
        allSuccessfulModularAuthenticationStrategy0.beforeAttempt((Realm) simpleAccountRealm0, (AuthenticationToken) null, (AuthenticationInfo) simpleAuthenticationInfo0);
        fail("Expecting exception: UnsupportedTokenException");
      } catch(UnsupportedTokenException e) {
        /*
         * Realm [org.jsecurity.realm.SimpleAccountRealm@39b70af3] of type [org.jsecurity.realm.SimpleAccountRealm] does not support  the submitted AuthenticationToken [null].  The [org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy] implementation requires all configured realm(s) to support and be able to process the submitted AuthenticationToken.
         */
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.afterAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;Lorg/jsecurity/authc/AuthenticationInfo;Ljava/lang/Throwable;)Lorg/jsecurity/authc/AuthenticationInfo;: I3 Branch 2 IFNULL L76 - true
   * 2 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.afterAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;Lorg/jsecurity/authc/AuthenticationInfo;Ljava/lang/Throwable;)Lorg/jsecurity/authc/AuthenticationInfo;: I46 Branch 4 IFNONNULL L87 - true
   * 3 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.afterAttempt(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;Lorg/jsecurity/authc/AuthenticationInfo;Ljava/lang/Throwable;)Lorg/jsecurity/authc/AuthenticationInfo;: I87 Branch 5 IFEQ L97 - true
   * 4 org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      AllSuccessfulModularAuthenticationStrategy allSuccessfulModularAuthenticationStrategy0 = new AllSuccessfulModularAuthenticationStrategy();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      char[] charArray0 = new char[2];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((Object) "\u0000\u0000\u0000\u0000\u0000", (Object) "\u0000\u0000\u0000\u0000\u0000", "");
      allSuccessfulModularAuthenticationStrategy0.afterAttempt((Realm) simpleAccountRealm0, (AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAuthenticationInfo0, (AuthenticationInfo) simpleAuthenticationInfo0, (Throwable) null);
      assertEquals("org.jsecurity.realm.SimpleAccountRealm_52", simpleAccountRealm0.getName());
  }
}