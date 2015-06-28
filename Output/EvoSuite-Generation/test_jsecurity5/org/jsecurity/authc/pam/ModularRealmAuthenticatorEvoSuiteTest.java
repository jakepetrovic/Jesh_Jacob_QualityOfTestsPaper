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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.pam.ModularRealmAuthenticator;
import org.jsecurity.authc.pam.UnsupportedTokenException;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ModularRealmAuthenticatorEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = false; 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
  } 

  @Before 
  public void initTestCase(){ 
  } 

  @After 
  public void doneWithTestCase(){ 
  } 


  //Test case number: 0
  /*
   * 8 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doSingleRealmAuthentication(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I5 Branch 3 IFNE L207 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.doAuthenticate(Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I14 Branch 11 IF_ICMPNE L302 - false
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealms(Ljava/util/Collection;)V: root-Branch
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealm(Lorg/jsecurity/realm/Realm;)V: root-Branch
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Lorg/jsecurity/realm/Realm;)V: root-Branch
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.getRealms()Ljava/util/Collection;: root-Branch
   * 7 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - false
   * 8 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I11 Branch 2 IFLE L191 - true
   */
  @Test
  public void test0()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((Realm) simpleAccountRealm0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("s0(4J&(", "s0(4J&(");
      // Undeclared exception!
      try {
        modularRealmAuthenticator0.doAuthenticate((AuthenticationToken) usernamePasswordToken0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>()V: root-Branch
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.setModularAuthenticationStrategy(Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
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

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.getRealms()Ljava/util/Collection;: root-Branch
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - false
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I11 Branch 2 IFLE L191 - false
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
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

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doSingleRealmAuthentication(Lorg/jsecurity/realm/Realm;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I5 Branch 3 IFNE L207 - false
   */
  @Test
  public void test3()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((List<Realm>) null);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm((String) null);
      // Undeclared exception!
      try {
        modularRealmAuthenticator0.doSingleRealmAuthentication((Realm) simpleAccountRealm0, (AuthenticationToken) null);
        fail("Expecting exception: UnsupportedTokenException");
      } catch(UnsupportedTokenException e) {
        /*
         * Realm [org.jsecurity.realm.SimpleAccountRealm@3fcb80] does not support authentication token [null].  Please ensure that the appropriate Realm implementation is configured correctly or that the realm accepts AuthenticationTokens of this type.
         */
      }
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - false
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I50 Branch 7 IFEQ L243 - true
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I141 Branch 10 IFEQ L265 - true
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - true
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.getModularAuthenticationStrategy()Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;: root-Branch
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I16 Branch 5 IFEQ L237 - true
   */
  @Test
  public void test4()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedList0.addLast((Realm) simpleAccountRealm0);
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = (SimpleAuthenticationInfo)modularRealmAuthenticator0.doMultiRealmAuthentication((Collection<Realm>) linkedList0, (AuthenticationToken) null);
      assertNotNull(simpleAuthenticationInfo0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I50 Branch 7 IFEQ L243 - false
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I55 Branch 8 IFEQ L245 - true
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I104 Branch 9 IFEQ L256 - true
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I16 Branch 5 IFEQ L237 - true
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.doMultiRealmAuthentication(Ljava/util/Collection;Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I40 Branch 6 IFEQ L241 - false
   */
  @Test
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
          LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
          Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLocalHost();
          SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
          linkedList0.add((Realm) simpleAccountRealm0);
          UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", false, (InetAddress) inet4Address0);
          // Undeclared exception!
          try {
            modularRealmAuthenticator0.doMultiRealmAuthentication((Collection<Realm>) linkedList0, (AuthenticationToken) usernamePasswordToken0);
            fail("Expecting exception: AuthenticationException");
          } catch(AuthenticationException e) {
            /*
             * Unable to acquire account data from realm [org.jsecurity.realm.SimpleAccountRealm@1237b44f].  The [org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy implementation requires all configured realm(s) to operate successfully for a successful authentication.
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.doAuthenticate(Lorg/jsecurity/authc/AuthenticationToken;)Lorg/jsecurity/authc/AuthenticationInfo;: I14 Branch 11 IF_ICMPNE L302 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.getModularAuthenticationStrategy()Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;: root-Branch
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I8 Branch 1 IFNULL L191 - false
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.assertRealmsConfigured()V: I11 Branch 2 IFLE L191 - true
   */
  @Test
  public void test6()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((List<Realm>) linkedList0);
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm();
      linkedList0.add((Realm) simpleAccountRealm0);
      linkedList0.add((Realm) simpleAccountRealm0);
      Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("g", "g", (InetAddress) inet4Address0);
      try {
        modularRealmAuthenticator0.authenticate((AuthenticationToken) usernamePasswordToken0);
        fail("Expecting exception: AuthenticationException");
      } catch(AuthenticationException e) {
        /*
         * Authentication failed for token submission [org.jsecurity.authc.UsernamePasswordToken - g, rememberMe=false (localhost/127.0.0.1)].  Possible unexpected error? (Typical or expected login exceptions should extend from AuthenticationException).
         */
      }
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I13 Branch 12 IFNULL L323 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>()V: root-Branch
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.setModularAuthenticationStrategy(Lorg/jsecurity/authc/pam/ModularAuthenticationStrategy;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator();
      modularRealmAuthenticator0.onLogout((PrincipalCollection) null);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I13 Branch 12 IFNULL L323 - false
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I16 Branch 13 IFGT L323 - true
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      LinkedList<Realm> linkedList0 = new LinkedList<Realm>();
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((List<Realm>) linkedList0);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      modularRealmAuthenticator0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I16 Branch 13 IFGT L323 - false
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - true
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - false
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I34 Branch 15 IFEQ L325 - false
   */
  @Test
  public void test9()  throws Throwable  {
      SimpleAccountRealm simpleAccountRealm0 = new SimpleAccountRealm("3d#d?Ai@Czj|>l");
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((Realm) simpleAccountRealm0);
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((Object) "\u0000\u0000\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000", (Object) "[]", "3d#d?Ai@Czj|>l");
      SimplePrincipalCollection simplePrincipalCollection0 = (SimplePrincipalCollection)simpleAuthenticationInfo0.getPrincipals();
      modularRealmAuthenticator0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(false, simplePrincipalCollection0.isEmpty());
  }

  //Test case number: 10
  /*
   * 9 covered goals:
   * 1 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I34 Branch 15 IFEQ L325 - true
   * 2 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealms(Ljava/util/Collection;)V: root-Branch
   * 3 org.jsecurity.authc.pam.ModularRealmAuthenticator.setRealm(Lorg/jsecurity/realm/Realm;)V: root-Branch
   * 4 org.jsecurity.authc.pam.ModularRealmAuthenticator.<init>(Lorg/jsecurity/realm/Realm;)V: root-Branch
   * 5 org.jsecurity.authc.pam.ModularRealmAuthenticator.getRealms()Ljava/util/Collection;: root-Branch
   * 6 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I13 Branch 12 IFNULL L323 - false
   * 7 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I16 Branch 13 IFGT L323 - false
   * 8 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - true
   * 9 org.jsecurity.authc.pam.ModularRealmAuthenticator.onLogout(Lorg/jsecurity/subject/PrincipalCollection;)V: I25 Branch 14 IFEQ L324 - false
   */
  @Test
  public void test10()  throws Throwable  {
      ModularRealmAuthenticator modularRealmAuthenticator0 = new ModularRealmAuthenticator((Realm) null);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      modularRealmAuthenticator0.onLogout((PrincipalCollection) simplePrincipalCollection0);
      assertEquals(true, simplePrincipalCollection0.isEmpty());
  }
}
