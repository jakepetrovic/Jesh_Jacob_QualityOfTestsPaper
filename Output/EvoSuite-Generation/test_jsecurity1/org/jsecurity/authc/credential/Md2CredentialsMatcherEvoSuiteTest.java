/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authc.credential.Md2CredentialsMatcher;
import org.jsecurity.crypto.hash.Md2Hash;

public class Md2CredentialsMatcherEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Md2CredentialsMatcher.hashProvidedCredentials(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/jsecurity/crypto/hash/Hash;: root-Branch
   * 2 org.jsecurity.authc.credential.Md2CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Md2CredentialsMatcher md2CredentialsMatcher0 = new Md2CredentialsMatcher();
      // Undeclared exception!
      try {
        md2CredentialsMatcher0.hashProvidedCredentials((Object) null, (Object) "UTF-8", 491);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument for byte conversion cannot be null.
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Md2CredentialsMatcher.newHashInstance()Lorg/jsecurity/crypto/hash/AbstractHash;: root-Branch
   * 2 org.jsecurity.authc.credential.Md2CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Md2CredentialsMatcher md2CredentialsMatcher0 = new Md2CredentialsMatcher();
      Md2Hash md2Hash0 = (Md2Hash)md2CredentialsMatcher0.newHashInstance();
      assertNotNull(md2Hash0);
  }
}
