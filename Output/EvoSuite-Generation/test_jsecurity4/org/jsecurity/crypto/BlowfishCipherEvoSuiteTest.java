/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import org.jsecurity.crypto.BlowfishCipher;

public class BlowfishCipherEvoSuiteTest {


  //Test case number: 0
  /*
   * 7 covered goals:
   * 1 org.jsecurity.crypto.BlowfishCipher.crypt(Ljavax/crypto/Cipher;[B)[B: root-Branch
   * 2 org.jsecurity.crypto.BlowfishCipher.newCipherInstance()Ljavax/crypto/Cipher;: root-Branch
   * 3 org.jsecurity.crypto.BlowfishCipher.getKey()Ljava/security/Key;: root-Branch
   * 4 org.jsecurity.crypto.BlowfishCipher.init(Ljavax/crypto/Cipher;ILjava/security/Key;)V: root-Branch
   * 5 org.jsecurity.crypto.BlowfishCipher.decrypt([B[B)[B: I4 Branch 4 IFEQ L135 - true
   * 6 org.jsecurity.crypto.BlowfishCipher.crypt([BI[B)[B: I8 Branch 6 IFNONNULL L207 - false
   * 7 org.jsecurity.crypto.BlowfishCipher.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      BlowfishCipher blowfishCipher0 = new BlowfishCipher();
      // Undeclared exception!
      try {
        blowfishCipher0.decrypt((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Unable to crypt bytes with cipher [javax.crypto.Cipher@6b8fc82f].
         */
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 org.jsecurity.crypto.BlowfishCipher.setKey(Ljava/security/Key;)V: root-Branch
   * 2 org.jsecurity.crypto.BlowfishCipher.generateNewKey(I)Ljava/security/Key;: root-Branch
   * 3 org.jsecurity.crypto.BlowfishCipher.generateNewKey()Ljava/security/Key;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      BlowfishCipher blowfishCipher0 = new BlowfishCipher();
      SecretKeySpec secretKeySpec0 = (SecretKeySpec)BlowfishCipher.generateNewKey();
      blowfishCipher0.setKey((Key) secretKeySpec0);
      assertEquals("RAW", secretKeySpec0.getFormat());
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * 1 org.jsecurity.crypto.BlowfishCipher.encrypt([B[B)[B: I12 Branch 1 IFEQ L123 - true
   * 2 org.jsecurity.crypto.BlowfishCipher.crypt([BI[B)[B: I8 Branch 6 IFNONNULL L207 - true
   * 3 org.jsecurity.crypto.BlowfishCipher.<init>()V: root-Branch
   * 4 org.jsecurity.crypto.BlowfishCipher.crypt(Ljavax/crypto/Cipher;[B)[B: root-Branch
   * 5 org.jsecurity.crypto.BlowfishCipher.newCipherInstance()Ljavax/crypto/Cipher;: root-Branch
   * 6 org.jsecurity.crypto.BlowfishCipher.init(Ljavax/crypto/Cipher;ILjava/security/Key;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      BlowfishCipher blowfishCipher0 = new BlowfishCipher();
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = blowfishCipher0.encrypt(byteArray0, byteArray0);
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }
}
