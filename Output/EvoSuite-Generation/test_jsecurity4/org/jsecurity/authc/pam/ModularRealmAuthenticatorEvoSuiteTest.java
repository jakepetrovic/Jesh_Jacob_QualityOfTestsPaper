/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.pam;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.pam.FirstSuccessfulAuthenticationStrategy;
import org.jsecurity.authc.pam.ModularAuthenticationStrategy;
import org.jsecurity.authc.pam.ModularRealmAuthenticator;
import org.jsecurity.authc.pam.UnsupportedTokenException;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class ModularRealmAuthenticatorEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I11 Branch 2 IFLE L191 - false
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealms(Ljava/util/Collection;)V: root-Branch
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Ljava/util/List;)V: root-Branch
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.getRealms()Ljava/util/Collection;: root-Branch
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - false
   */
  @Test
  public void test0()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((List<Realm>) linkedList0);
      try {
        modularRealmAuthenticator0.assertRealmsConfigured();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authentication attempt.
         */
      }
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doSingleRealmAuthentication(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I5 Branch 3 IFNE L207 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.doAuthenticate(Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I14 Branch 11 IF_ICMPNE L302 - false
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealm(Lorg/jsecurity/realm/Realm;)V: root-Branch
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>()V: root-Branch
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.setModularAuthenticationStrategy(Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;)V: root-Branch
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I11 Branch 2 IFLE L191 - true
   */
  @Test
  public void test1()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm(";");
      modularRealmAuthenticator0.setRealm((Realm) simpleAccountRealm0);
      Inet4Address inet4Address0 = (Inet4Address)InetAddress.getByName("");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false, (InetAddress) inet4Address0);
      try {
        modularRealmAuthenticator0.authenticate((AuthenticationToken) usernamePasswordToken0);
        fail("Expecting exception: AuthenticationException");
      } catch(AuthenticationException e) {
        /*
         * Authentication failed for token submission [org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (localhost/127.0.0.1)].  Possible unexpected error? (Typical or expected login exceptions should extend from AuthenticationException).
         */
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Lorg/jsecurity/realm/Realm;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((Realm) simpleAccountRealm0);
      assertNotNull(modularRealmAuthenticator0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - true
   */
  @Test
  public void test3()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      try {
        modularRealmAuthenticator0.assertRealmsConfigured();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Configuration error:  No realms have been configured!  One or more realms must be present to execute an authentication attempt.
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doSingleRealmAuthentication(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I5 Branch 3 IFNE L207 - false
   */
  @Test
  public void test4()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      // Undeclared exception!
      try {
        modularRealmAuthenticator0.doSingleRealmAuthentication((Realm) simpleAccountRealm0, (AuthenticationToken) null);
        fail("Expecting exception: UnsupportedTokenException");
      } catch(UnsupportedTokenException e) {
        /*
         * Realm [org.jsecurity.realm.SimpleAccountRealm@45e26fd] does not support authentication token [null].  Please ensure that the appropriate Realm implementation is configured correctly or that the realm accepts AuthenticationTokens of this type.
         */
      }
  }

  //Test case number: 5
  /*
   * 11 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I16 Branch 5 IFEQ L237 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - true
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - false
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I50 Branch 7 IFEQ L243 - false
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I55 Branch 8 IFEQ L245 - true
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I104 Branch 9 IFEQ L256 - true
   * 7 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Ljava/util/List;)V: root-Branch
   * 8 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - false
   * 9 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I11 Branch 2 IFLE L191 - true
   * 10 org.jsecurity.authc.pam.ModularRealmAuthenticator.doAuthenticate(Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I14 Branch 11 IF_ICMPNE L302 - true
   * 11 org.jsecurity.authc.pam.ModularRealmAuthenticator.getModularAuthenticationStrategy()Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("byte[] if the source is of type byte[], char[] or String.  The instance provided as a method ");
      linkedList0.add((Realm) simpleAccountRealm0);
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((List<Realm>) linkedList0);
      linkedList0.addLast((Realm) simpleAccountRealm0);
      char[] charArray0 = new char[10];
      FirstSuccessfulAuthenticationStrategy firstSuccessfulAuthenticationStrategy0 = new FirstSuccessfulAuthenticationStrategy();
      modularRealmAuthenticator0.setModularAuthenticationStrategy((ModularAuthenticationStrategy) firstSuccessfulAuthenticationStrategy0);
      Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("byte[] if the source is of type byte[], char[] or String.  The instance provided as a method ", charArray0, true, (InetAddress) inet4Address0);
      AuthenticationInfo authenticationInfo0 = modularRealmAuthenticator0.doAuthenticate((AuthenticationToken) usernamePasswordToken0);
      assertNull(authenticationInfo0);
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I50 Branch 7 IFEQ L243 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I141 Branch 10 IFEQ L265 - true
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.getModularAuthenticationStrategy()Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;: root-Branch
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I16 Branch 5 IFEQ L237 - true
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - true
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - false
   */
  @Test
  public void test6()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm(";");
      modularRealmAuthenticator0.setRealm((Realm) simpleAccountRealm0);
      Collection<Realm> collection0 = modularRealmAuthenticator0.getRealms();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = (SimpleAuthenticationInfo)modularRealmAuthenticator0.doMultiRealmAuthentication(collection0, (AuthenticationToken) null);
      assertNotNull(simpleAuthenticationInfo0);
      assertEquals(false, collection0.isEmpty());
      assertEquals(1, collection0.size());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I13 Branch 12 IFNULL L323 - true
   */
  @Test
  public void test7()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      modularRealmAuthenticator0.onLogout((PrincipalCollection) null);
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I13 Branch 12 IFNULL L323 - false
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I16 Branch 13 IFGT L323 - false
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - true
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - false
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I34 Branch 15 IFEQ L325 - false
   */
  @Test
  public void test8()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm(";");
      modularRealmAuthenticator0.setRealm((Realm) simpleAccountRealm0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      modularRealmAuthenticator0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I16 Branch 13 IFGT L323 - true
   */
  @Test
  public void test9()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      modularRealmAuthenticator0.setRealms((Collection<Realm>) linkedList0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection((Object) "UTF-8", "UTF-8");
      modularRealmAuthenticator0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 10
  /*
   * 10 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I34 Branch 15 IFEQ L325 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealms(Ljava/util/Collection;)V: root-Branch
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealm(Lorg/jsecurity/realm/Realm;)V: root-Branch
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>()V: root-Branch
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.setModularAuthenticationStrategy(Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;)V: root-Branch
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.getRealms()Ljava/util/Collection;: root-Branch
   * 7 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I13 Branch 12 IFNULL L323 - false
   * 8 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I16 Branch 13 IFGT L323 - false
   * 9 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - true
   * 10 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - false
   */
  @Test
  public void test10()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      modularRealmAuthenticator0.setRealm((Realm) null);
      modularRealmAuthenticator0.onLogout((PrincipalCollection) null);
  }
}
