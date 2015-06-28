/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
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
      Sha384Hash sha384Hash0 = (Sha384Hash)sha384CredentialsMatcher0.hashProvidedCredentials((Object) "\uFFFD", (Object) "[]", (int) (byte) (-44));
      assertEquals("e0e9b73638acf892665e60e49f5331221627034b38931458f3c5cc0a2b9871656b74763997209533d36b46f9026658be", sha384Hash0.toHex());
  }
}
