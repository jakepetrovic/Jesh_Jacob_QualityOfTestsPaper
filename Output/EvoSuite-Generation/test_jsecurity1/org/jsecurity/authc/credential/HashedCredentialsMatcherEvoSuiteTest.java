/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.Md2CredentialsMatcher;
import org.jsecurity.authc.credential.Sha256CredentialsMatcher;
import org.jsecurity.authc.credential.Sha384CredentialsMatcher;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class HashedCredentialsMatcherEvoSuiteTest {

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
   * 6 covered goals:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.getSalt(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: root-Branch
   * 2 org.jsecurity.authc.credential.HashedCredentialsMatcher.getHashIterations()I: root-Branch
   * 3 org.jsecurity.authc.credential.HashedCredentialsMatcher.isHashSalted()Z: root-Branch
   * 4 org.jsecurity.authc.credential.HashedCredentialsMatcher.<init>()V: root-Branch
   * 5 org.jsecurity.authc.credential.HashedCredentialsMatcher.setHashSalted(Z)V: root-Branch
   * 6 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: I9 Branch 2 IFEQ L209 - false
   */
  @Test
  public void test0()  throws Throwable  {
      Sha384CredentialsMatcher sha384CredentialsMatcher0 = new Sha384CredentialsMatcher();
      assertEquals(false, sha384CredentialsMatcher0.isHashSalted());
      
      sha384CredentialsMatcher0.setHashSalted(true);
      char[] charArray0 = new char[6];
      Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("SHA-1", charArray0, (InetAddress) inet4Address0);
      sha384CredentialsMatcher0.getCredentials((AuthenticationToken) usernamePasswordToken0);
      assertEquals(true, sha384CredentialsMatcher0.isHashSalted());
      assertEquals(1, sha384CredentialsMatcher0.getHashIterations());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.isStoredCredentialsHexEncoded()Z: root-Branch
   * 2 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: I9 Branch 2 IFEQ L209 - true
   * 3 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I15 Branch 3 IFNE L238 - true
   * 4 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I23 Branch 5 IFEQ L241 - false
   */
  @Test
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          Md2CredentialsMatcher md2CredentialsMatcher0 = new Md2CredentialsMatcher();
          Inet4Address inet4Address0 = (Inet4Address)InetAddress.getLocalHost();
          UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("%", "%", (InetAddress) inet4Address0);
          SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
          HashSet<String> hashSet0 = new HashSet<String>();
          SimpleAccount simpleAccount0 = new SimpleAccount((PrincipalCollection) simplePrincipalCollection0, (Object) "%", (Set<String>) hashSet0);
          // Undeclared exception!
          try {
            md2CredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAccount0);
            fail("Expecting exception: IllegalArgumentException");
          } catch(IllegalArgumentException e) {
            /*
             * Odd number of characters.
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.setHashIterations(I)V: I4 Branch 1 IF_ICMPGE L175 - true
   */
  @Test
  public void test2()  throws Throwable  {
      Sha256CredentialsMatcher sha256CredentialsMatcher0 = new Sha256CredentialsMatcher();
      sha256CredentialsMatcher0.setHashIterations(114);
      assertEquals(114, sha256CredentialsMatcher0.getHashIterations());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.setHashIterations(I)V: I4 Branch 1 IF_ICMPGE L175 - false
   */
  @Test
  public void test3()  throws Throwable  {
      Md2CredentialsMatcher md2CredentialsMatcher0 = new Md2CredentialsMatcher();
      md2CredentialsMatcher0.setHashIterations((-8));
      assertEquals(1, md2CredentialsMatcher0.getHashIterations());
      assertEquals(true, md2CredentialsMatcher0.isStoredCredentialsHexEncoded());
      assertEquals(false, md2CredentialsMatcher0.isHashSalted());
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I23 Branch 5 IFEQ L241 - true
   * 2 org.jsecurity.authc.credential.HashedCredentialsMatcher.getHashIterations()I: root-Branch
   * 3 org.jsecurity.authc.credential.HashedCredentialsMatcher.isHashSalted()Z: root-Branch
   * 4 org.jsecurity.authc.credential.HashedCredentialsMatcher.<init>()V: root-Branch
   * 5 org.jsecurity.authc.credential.HashedCredentialsMatcher.setStoredCredentialsHexEncoded(Z)V: root-Branch
   * 6 org.jsecurity.authc.credential.HashedCredentialsMatcher.isStoredCredentialsHexEncoded()Z: root-Branch
   * 7 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: I9 Branch 2 IFEQ L209 - true
   * 8 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I15 Branch 3 IFNE L238 - true
   */
  @Test
  public void test4()  throws Throwable  {
      Sha384CredentialsMatcher sha384CredentialsMatcher0 = new Sha384CredentialsMatcher();
      assertEquals(true, sha384CredentialsMatcher0.isStoredCredentialsHexEncoded());
      
      char[] charArray0 = new char[8];
      sha384CredentialsMatcher0.setStoredCredentialsHexEncoded(false);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("Attempting to load user-specified log class '", charArray0, false);
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((Object) "org.jsecurity.authc.UsernamePasswordToken - Attempting to load user-specified log class ', rememberMe=false", (Object) "org.jsecurity.authc.UsernamePasswordToken - Attempting to load user-specified log class ', rememberMe=false", "Attempting to load user-specified log class '");
      sha384CredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAuthenticationInfo0);
      assertEquals(false, sha384CredentialsMatcher0.isStoredCredentialsHexEncoded());
      assertEquals(1, sha384CredentialsMatcher0.getHashIterations());
  }
}
