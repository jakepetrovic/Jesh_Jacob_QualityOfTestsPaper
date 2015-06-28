/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.SimpleCredentialsMatcher;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class SimpleCredentialsMatcherEvoSuiteTest {


  //Test case number: 0
  /*
   * 10 covered goals:
   * 1 org.jsecurity.authc.credential.SimpleCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: root-Branch
   * 2 org.jsecurity.authc.credential.SimpleCredentialsMatcher.doCredentialsMatch(Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;)Z: root-Branch
   * 3 org.jsecurity.authc.credential.SimpleCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: root-Branch
   * 4 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I4 Branch 1 IFEQ L96 - true
   * 5 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I31 Branch 2 IFNE L101 - false
   * 6 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I34 Branch 3 IFNE L101 - true
   * 7 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I41 Branch 5 IFNE L101 - false
   * 8 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I44 Branch 6 IFNE L101 - true
   * 9 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I52 Branch 8 IFEQ L103 - true
   * 10 org.jsecurity.authc.credential.SimpleCredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SimpleCredentialsMatcher simpleCredentialsMatcher0 = new SimpleCredentialsMatcher();
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("'Y", charArray0, false);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimpleAccount simpleAccount0 = new SimpleAccount((PrincipalCollection) simplePrincipalCollection0, (Object) charArray0);
      boolean boolean0 = simpleCredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAccount0);
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I34 Branch 3 IFNE L101 - false
   * 2 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I37 Branch 4 IFEQ L101 - false
   * 3 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I44 Branch 6 IFNE L101 - false
   * 4 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I47 Branch 7 IFEQ L101 - false
   * 5 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I52 Branch 8 IFEQ L103 - true
   */
  @Test
  public void test1()  throws Throwable  {
      SimpleCredentialsMatcher simpleCredentialsMatcher0 = new SimpleCredentialsMatcher();
      boolean boolean0 = simpleCredentialsMatcher0.equals((Object) "localhost/127.0.0.1", (Object) "localhost/127.0.0.1");
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I37 Branch 4 IFEQ L101 - true
   * 2 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I34 Branch 3 IFNE L101 - false
   */
  @Test
  public void test2()  throws Throwable  {
      SimpleCredentialsMatcher simpleCredentialsMatcher0 = new SimpleCredentialsMatcher();
      Object object0 = new Object();
      boolean boolean0 = simpleCredentialsMatcher0.equals(object0, object0);
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * 1 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I47 Branch 7 IFEQ L101 - true
   * 2 org.jsecurity.authc.credential.SimpleCredentialsMatcher.<init>()V: root-Branch
   * 3 org.jsecurity.authc.credential.SimpleCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: root-Branch
   * 4 org.jsecurity.authc.credential.SimpleCredentialsMatcher.doCredentialsMatch(Lorg/jsecurity/authc/AuthenticationToken;Lorg/jsecurity/authc/AuthenticationInfo;)Z: root-Branch
   * 5 org.jsecurity.authc.credential.SimpleCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: root-Branch
   * 6 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I4 Branch 1 IFEQ L96 - true
   * 7 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I31 Branch 2 IFNE L101 - false
   * 8 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I34 Branch 3 IFNE L101 - true
   * 9 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I41 Branch 5 IFNE L101 - false
   * 10 org.jsecurity.authc.credential.SimpleCredentialsMatcher.equals(Ljava/lang/Object;Ljava/lang/Object;)Z: I44 Branch 6 IFNE L101 - false
   */
  @Test
  public void test3()  throws Throwable  {
      SimpleCredentialsMatcher simpleCredentialsMatcher0 = new SimpleCredentialsMatcher();
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("'Y", charArray0, false);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      SimpleAccount simpleAccount0 = new SimpleAccount((PrincipalCollection) simplePrincipalCollection0, (Object) false);
      boolean boolean0 = simpleCredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAccount0);
      assertEquals(false, boolean0);
  }
}
