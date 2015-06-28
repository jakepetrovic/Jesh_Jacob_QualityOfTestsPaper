/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Sha256Hash;

public class Sha256HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha256Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha256Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha256Hash;: root-Branch
   * 3 org.jsecurity.crypto.hash.Sha256Hash.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha256Hash sha256Hash0 = Sha256Hash.fromBase64String("");
      String string0 = sha256Hash0.getAlgorithmName();
      assertEquals("", sha256Hash0.toString());
      assertEquals("SHA-256", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Sha256Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha256Hash sha256Hash0 = new Sha256Hash((Object) "SHA-256", (Object) "SHA-256");
      assertEquals("e68bb6d7aeab039e13e8a44dc54756a764e7f06181c99a07a623ba6c585480fb", sha256Hash0.toString());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha256Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha256Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha256Hash.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        Sha256Hash.fromHexString("%*;e[bY#{mo>J{/KcGC");
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
   * 1 org.jsecurity.crypto.hash.Sha256Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Sha256Hash sha256Hash0 = new Sha256Hash((Object) "", (Object) "SHA-256", (-355));
      assertEquals("SHA-256", sha256Hash0.getAlgorithmName());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha256Hash.<init>(Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha256Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Sha256Hash sha256Hash0 = new Sha256Hash((Object) "SHA-256");
      assertEquals("u9B8T8AsmblxJP6/Qse2O1ARwN8o1An7tIa1qdLmFeo=", sha256Hash0.toBase64());
  }
}
