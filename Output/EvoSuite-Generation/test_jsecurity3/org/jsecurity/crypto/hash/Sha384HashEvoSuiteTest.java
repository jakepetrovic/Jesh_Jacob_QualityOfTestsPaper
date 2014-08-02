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
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "08ddafea8e4b457d5d9a7dd777b898219ccf1ac2ae6be48e358b3598df1e0688c5c504c964460f134c3633dcd6f9dd57", (Object) "\u0000\uFFFD\u0000\uFFFD\u0000\u0000\uFFFD", (int) (byte)0);
      assertEquals("5edf4598df6dd358365813a10b04486cfed77faee9377b27a7e3fa530b96e22955e4163975e0a6bbb2399d6893e4efcb", sha384Hash0.toString());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha384Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha384Hash sha384Hash0 = Sha384Hash.fromBase64String("");
      assertEquals("", sha384Hash0.toBase64());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "] to byte array using ");
      assertEquals("SHA-384", sha384Hash0.getAlgorithmName());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha384Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Sha384Hash sha384Hash0 = Sha384Hash.fromHexString("");
      assertEquals("", sha384Hash0.toBase64());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "", (Object) "SHA-384");
      assertEquals("hvBSozjLlOaVtvauuj2hx9xBjysJNBnP3l1X/QJebNjNrXAtFDX5LNTdBOR1ap+x", sha384Hash0.toBase64());
  }
}
