/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Sha512Hash;

public class Sha512HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha512Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha512Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha512Hash sha512Hash0 = new Sha512Hash((Object) "-feGu8%BsQDXm;$", (Object) null);
      assertEquals("060c644f155540b4f280017b9ab6cf75fc4d1c669e33f0e8120ab46ba60460342b2c5b4aba3d95ac8098a22ec01fd0348479224c84e81385e01aa5edfc6aecf9", sha512Hash0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Sha512Hash.<init>(Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha512Hash sha512Hash0 = new Sha512Hash((Object) "060c644f155540b4f280017b9ab6cf75fc4d1c669e33f0e8120ab46ba60460342b2c5b4aba3d95ac8098a22ec01fd0348479224c84e81385e01aa5edfc6aecf9");
      assertEquals("401f39b0ef9c53142d44d1c41e48a421bfc9d19ce8b8d3bc6b089436bb3aa75ccb3d0925c6633f2e0a848334e129bb631dcb80ab8090174e040829237ecfde1a", sha512Hash0.toString());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha512Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha512Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Sha512Hash sha512Hash0 = new Sha512Hash((Object) "SHA-512", (Object) "21fca8bb0a2e95d96291eb687289ef000000", 1);
      assertEquals("5bf9013a71f38e8ff3d36c2401dce545a2438986ce341be004fa648fd3ef45ab3b47d875e9201a3883d1ba4dcefab7d2c69c7ea5e522ab323da1e4b7b4d388e1", sha512Hash0.toString());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha512Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha512Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha512Hash.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        Sha512Hash.fromHexString("<4t=eJ%[6JD&>R");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter < at index 0
         */
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha512Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha512Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha512Hash.<init>()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Sha512Hash sha512Hash0 = Sha512Hash.fromBase64String("].  If you would like to convert ");
      assertEquals("IfyouwouldliketoconvAAAA", sha512Hash0.toBase64());
  }
}