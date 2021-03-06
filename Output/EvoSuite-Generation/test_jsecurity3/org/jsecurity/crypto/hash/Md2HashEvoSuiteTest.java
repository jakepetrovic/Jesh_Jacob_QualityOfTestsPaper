/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Md2Hash;

public class Md2HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "", (Object) "", 1246);
      assertEquals("279206390e096e87b248a7f28a73ec03", md2Hash0.toString());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md2Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromBase64String("");
      assertEquals("", md2Hash0.toString());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md2Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromHexString("");
      assertEquals("", md2Hash0.toBase64());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) ".)R7yDC@v5c\"'YW");
      assertEquals("MD2", md2Hash0.getAlgorithmName());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "0031aae12d39d9e306b1e63fea0ddcb5", (Object) "MD2");
      assertEquals("d9778fc40caf62494a54907a0112f290", md2Hash0.toString());
  }
}
