/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authc.credential.Sha512CredentialsMatcher;
import org.jsecurity.crypto.hash.Sha512Hash;

public class Sha512CredentialsMatcherEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Sha512CredentialsMatcher.newHashInstance()Lorg/jsecurity/crypto/hash/AbstractHash;: root-Branch
   * 2 org.jsecurity.authc.credential.Sha512CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha512CredentialsMatcher sha512CredentialsMatcher0 = new Sha512CredentialsMatcher();
      Sha512Hash sha512Hash0 = (Sha512Hash)sha512CredentialsMatcher0.newHashInstance();
      assertNotNull(sha512Hash0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Sha512CredentialsMatcher.hashProvidedCredentials(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/jsecurity/crypto/hash/Hash;: root-Branch
   * 2 org.jsecurity.authc.credential.Sha512CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha512CredentialsMatcher sha512CredentialsMatcher0 = new Sha512CredentialsMatcher();
      Sha512Hash sha512Hash0 = (Sha512Hash)sha512CredentialsMatcher0.hashProvidedCredentials((Object) "org.jsecurity.subject.SimplePrincipalCollection@0", (Object) "lo", 0);
      assertEquals("390dc0f3ea164a07267601e1813b4fbca154411aef9be2ca88373397f6ad96f826cbdfc88055f98eabb1aed19993df8fe4363556424ee54aca05764696cf032b", sha512Hash0.toString());
  }
}
