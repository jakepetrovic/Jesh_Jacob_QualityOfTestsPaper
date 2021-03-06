/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Sha384Hash;

public class Sha384HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "SHA-384", (Object) "J;5I\u0001\uFFFD\uFFFD", (int) (byte)1);
      assertEquals("SHA-384", sha384Hash0.getAlgorithmName());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha384Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha384Hash sha384Hash0 = Sha384Hash.fromBase64String("qMT");
      assertEquals("000000", sha384Hash0.toHex());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "\u0000\u0000");
      assertEquals("1dd6f7b457ad880d840d41c961283bab688e94e4b59359ea45686581e90feccea3c624b1226113f824f315eb60ae0a7c", sha384Hash0.toHex());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha384Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        Sha384Hash.fromHexString("] to byte array using ");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter ] at index 0
         */
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "UTF-8", (Object) "UTF-8");
      assertEquals("8d90623a6c38bd034b95e38e6234ef762f0f5406264889585e66c63fec3ffb309795940375462b51c067412794c8fec9", sha384Hash0.toString());
  }
}
