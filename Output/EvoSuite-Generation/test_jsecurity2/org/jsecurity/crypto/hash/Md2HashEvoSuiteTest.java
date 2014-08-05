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
   * 3 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md2Hash;: root-Branch
   * 3 org.jsecurity.crypto.hash.Md2Hash.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromBase64String("'.");
      String string0 = md2Hash0.getAlgorithmName();
      assertEquals("", md2Hash0.toHex());
      assertEquals("MD2", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md2Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromHexString("");
      assertEquals("", md2Hash0.toHex());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "");
      assertEquals("MD2", md2Hash0.getAlgorithmName());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "MD2", (Object) "hNrt0Hyo4VNvAA==", (-1));
      assertEquals("c754JXj9vb3JVUXsH8ax2g==", md2Hash0.toBase64());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "", (Object) "8350e5a3e24c153df2275c9f80692773");
      assertEquals("MD2", md2Hash0.getAlgorithmName());
  }
}