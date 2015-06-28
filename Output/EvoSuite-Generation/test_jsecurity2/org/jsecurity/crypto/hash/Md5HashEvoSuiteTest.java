/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Md5Hash;

public class Md5HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "MD5", (Object) "MD5");
      assertEquals("M1KlmKBU1H1YiCGYUvwQRg==", md5Hash0.toBase64());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Md5Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "MD5", (Object) "MD5", 1);
      assertEquals("3352a598a054d47d5888219852fc1046", md5Hash0.toHex());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md5Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Md5Hash md5Hash0 = Md5Hash.fromBase64String("Nz");
      assertEquals("AAA=", md5Hash0.toBase64());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.<init>(Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "M1KlmKBU1H1YiCGYUvwQRg==");
      assertEquals("bphb3juPWkYOT71QtzB0bQ==", md5Hash0.toBase64());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md5Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.<init>()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        Md5Hash.fromHexString("^usLETRq+&Edfm8\"|3");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter ^ at index 0
         */
      }
  }
}
