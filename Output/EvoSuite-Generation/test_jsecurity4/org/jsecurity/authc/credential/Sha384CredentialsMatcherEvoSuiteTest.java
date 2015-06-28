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
import org.jsecurity.authc.credential.Sha384CredentialsMatcher;
import org.jsecurity.crypto.hash.Sha384Hash;

public class Sha384CredentialsMatcherEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Sha384CredentialsMatcher.newHashInstance()Lorg/jsecurity/crypto/hash/AbstractHash;: root-Branch
   * 2 org.jsecurity.authc.credential.Sha384CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha384CredentialsMatcher sha384CredentialsMatcher0 = new Sha384CredentialsMatcher();
      Sha384Hash sha384Hash0 = (Sha384Hash)sha384CredentialsMatcher0.newHashInstance();
      assertNotNull(sha384Hash0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Sha384CredentialsMatcher.hashProvidedCredentials(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/jsecurity/crypto/hash/Hash;: root-Branch
   * 2 org.jsecurity.authc.credential.Sha384CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha384CredentialsMatcher sha384CredentialsMatcher0 = new Sha384CredentialsMatcher();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      SimpleAccount simpleAccount0 = new SimpleAccount();
      // Undeclared exception!
      try {
        sha384CredentialsMatcher0.doCredentialsMatch((AuthenticationToken) usernamePasswordToken0, (AuthenticationInfo) simpleAccount0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument for byte conversion cannot be null.
         */
      }
  }
}
