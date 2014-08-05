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
      Sha512Hash sha512Hash0 = (Sha512Hash)sha512CredentialsMatcher0.hashProvidedCredentials((Object) "u\u0000", (Object) "u\u0000", (int) (byte)117);
      assertEquals("4f82511b68d3da9218bba41c41ddd9697f5074a6093dfb252380c47e2d85263fc8dabf9f1e717e3cf2cafa61da02ae61f77ffa5cacb23d22fb78d086648746b8", sha512Hash0.toHex());
  }
}