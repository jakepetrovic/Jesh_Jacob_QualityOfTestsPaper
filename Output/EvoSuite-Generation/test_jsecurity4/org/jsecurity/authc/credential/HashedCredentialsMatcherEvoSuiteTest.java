/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.SimpleAuthenticationInfo;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authc.credential.Md2CredentialsMatcher;
import org.jsecurity.authc.credential.Md5CredentialsMatcher;
import org.jsecurity.authc.credential.Sha256CredentialsMatcher;
import org.jsecurity.authc.credential.Sha384CredentialsMatcher;
import org.jsecurity.authz.Permission;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;

public class HashedCredentialsMatcherEvoSuiteTest {


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
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      Sha384CredentialsMatcher sha384CredentialsMatcher0 = new Sha384CredentialsMatcher();
      assertEquals(false, sha384CredentialsMatcher0.isHashSalted());
      
      sha384CredentialsMatcher0.setHashSalted(true);
      // Undeclared exception!
      try {
        sha384CredentialsMatcher0.getCredentials((AuthenticationToken) usernamePasswordToken0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument for byte conversion cannot be null.
         */
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I23 Branch 5 IFEQ L241 - true
   * 2 org.jsecurity.authc.credential.HashedCredentialsMatcher.setStoredCredentialsHexEncoded(Z)V: root-Branch
   * 3 org.jsecurity.authc.credential.HashedCredentialsMatcher.isStoredCredentialsHexEncoded()Z: root-Branch
   * 4 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I15 Branch 3 IFNE L238 - true
   */
  @Test
  public void test1()  throws Throwable  {
      Sha256CredentialsMatcher sha256CredentialsMatcher0 = new Sha256CredentialsMatcher();
      assertEquals(true, sha256CredentialsMatcher0.isStoredCredentialsHexEncoded());
      
      sha256CredentialsMatcher0.setStoredCredentialsHexEncoded(false);
      SimplePrincipalCollection simplePrincipalCollection0 = new SimplePrincipalCollection();
      HashSet<String> hashSet0 = new HashSet<String>();
      SimpleAccount simpleAccount0 = new SimpleAccount((PrincipalCollection) simplePrincipalCollection0, (Object) "\u0000", (Set<String>) hashSet0);
      sha256CredentialsMatcher0.getCredentials((AuthenticationInfo) simpleAccount0);
      assertEquals(false, sha256CredentialsMatcher0.isStoredCredentialsHexEncoded());
      assertEquals(false, sha256CredentialsMatcher0.isHashSalted());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.isStoredCredentialsHexEncoded()Z: root-Branch
   * 2 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I15 Branch 3 IFNE L238 - true
   * 3 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationInfo;)Ljava/lang/Object;: I23 Branch 5 IFEQ L241 - false
   */
  @Test
  public void test2()  throws Throwable  {
      Sha256CredentialsMatcher sha256CredentialsMatcher0 = new Sha256CredentialsMatcher();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      SimpleAccount simpleAccount0 = new SimpleAccount((Object) "UTF-8", (Object) "UTF-8", "UTF-8", (Set<String>) linkedHashSet0, (Set<Permission>) null);
      SimplePrincipalCollection simplePrincipalCollection0 = (SimplePrincipalCollection)simpleAccount0.getPrincipals();
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo((PrincipalCollection) simplePrincipalCollection0, (Object) "UTF-8");
      // Undeclared exception!
      try {
        sha256CredentialsMatcher0.getCredentials((AuthenticationInfo) simpleAuthenticationInfo0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Odd number of characters.
         */
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.setHashIterations(I)V: I4 Branch 1 IF_ICMPGE L175 - true
   */
  @Test
  public void test3()  throws Throwable  {
      Md5CredentialsMatcher md5CredentialsMatcher0 = new Md5CredentialsMatcher();
      md5CredentialsMatcher0.setHashIterations(26);
      assertEquals(26, md5CredentialsMatcher0.getHashIterations());
      assertEquals(false, md5CredentialsMatcher0.isHashSalted());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.setHashIterations(I)V: I4 Branch 1 IF_ICMPGE L175 - false
   */
  @Test
  public void test4()  throws Throwable  {
      Md5CredentialsMatcher md5CredentialsMatcher0 = new Md5CredentialsMatcher();
      md5CredentialsMatcher0.setHashIterations((-1031));
      assertEquals(1, md5CredentialsMatcher0.getHashIterations());
      assertEquals(true, md5CredentialsMatcher0.isStoredCredentialsHexEncoded());
      assertEquals(false, md5CredentialsMatcher0.isHashSalted());
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 org.jsecurity.authc.credential.HashedCredentialsMatcher.getCredentials(Lorg/jsecurity/authc/AuthenticationToken;)Ljava/lang/Object;: I9 Branch 2 IFEQ L209 - true
   * 2 org.jsecurity.authc.credential.HashedCredentialsMatcher.getHashIterations()I: root-Branch
   * 3 org.jsecurity.authc.credential.HashedCredentialsMatcher.isHashSalted()Z: root-Branch
   * 4 org.jsecurity.authc.credential.HashedCredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      Md2CredentialsMatcher md2CredentialsMatcher0 = new Md2CredentialsMatcher();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("_9x%]j1I]]p,Z^8", "_9x%]j1I]]p,Z^8", true);
      SimpleAuthenticationInfo simpleAuthenticationInfo0 = new SimpleAuthenticationInfo();
      // Undeclared exception!
      try {
        md2CredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAuthenticationInfo0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument for byte conversion cannot be null.
         */
      }
  }
}
