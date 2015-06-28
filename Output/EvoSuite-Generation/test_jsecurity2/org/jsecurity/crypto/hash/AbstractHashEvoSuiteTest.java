/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Md2Hash;
import org.jsecurity.crypto.hash.Md5Hash;
import org.jsecurity.crypto.hash.Sha1Hash;
import org.jsecurity.crypto.hash.Sha256Hash;
import org.jsecurity.crypto.hash.Sha384Hash;
import org.jsecurity.crypto.hash.Sha512Hash;

public class AbstractHashEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.jsecurity.crypto.hash.AbstractHash.hashCode()I: root-Branch
   * 2 org.jsecurity.crypto.hash.AbstractHash.<init>()V: root-Branch
   * 3 org.jsecurity.crypto.hash.AbstractHash.getBytes()[B: root-Branch
   * 4 org.jsecurity.crypto.hash.AbstractHash.toHex()Ljava/lang/String;: I4 Branch 4 IFNONNULL L224 - false
   */
  @Test
  public void test0()  throws Throwable  {
      Sha512Hash sha512Hash0 = new Sha512Hash();
      // Undeclared exception!
      try {
        sha512Hash0.hashCode();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.AbstractHash.getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;: root-Branch
   * 3 org.jsecurity.crypto.hash.AbstractHash.setBytes([B)V: root-Branch
   * 4 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: I32 Branch 1 IFNULL L121 - false
   * 5 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I10 Branch 2 IFNULL L200 - false
   * 6 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I39 Branch 3 IF_ICMPGE L207 - true
   */
  @Test
  public void test1()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "6mtO7R5bB2gqcu9YklVEpA==", (Object) "UTF-8");
      assertNotNull(md5Hash0);
      assertEquals("Hh8mDP+Cdr5bMQN+NrqbQQ==", md5Hash0.toBase64());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.AbstractHash.hash([B[B)[B: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Sha256Hash sha256Hash0 = new Sha256Hash();
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = sha256Hash0.hash(byteArray0, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotNull(byteArray1);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 org.jsecurity.crypto.hash.AbstractHash.hash([B)[B: root-Branch
   * 2 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;)V: root-Branch
   * 3 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: I32 Branch 1 IFNULL L121 - true
   * 4 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I10 Branch 2 IFNULL L200 - true
   */
  @Test
  public void test3()  throws Throwable  {
      Sha512Hash sha512Hash0 = new Sha512Hash((Object) "SHA-512");
      assertNotNull(sha512Hash0);
      
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = sha512Hash0.hash(byteArray0);
      assertNotNull(byteArray1);
      assertEquals("M/Y7w3T0KPWX1/e6fMHiGgtLRPqnJ/fAUsWtCxqlMDiE6lkZpTwNMrVZH03tOB2ha2f2ohcNgQWNfpuyrUohWw==", sha512Hash0.toBase64());
      assertEquals("33f63bc374f428f597d7f7ba7cc1e21a0b4b44faa727f7c052c5ad0b1aa5303884ea5919a53c0d32b5591f4ded381da16b67f6a2170d81058d7e9bb2ad4a215b", sha512Hash0.toString());
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 org.jsecurity.crypto.hash.AbstractHash.toHex()Ljava/lang/String;: I4 Branch 4 IFNONNULL L224 - true
   * 2 org.jsecurity.crypto.hash.AbstractHash.toString()Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.crypto.hash.AbstractHash.toHex()Ljava/lang/String;: I4 Branch 4 IFNONNULL L224 - false
   */
  @Test
  public void test4()  throws Throwable  {
      Sha384Hash sha384Hash0 = Sha384Hash.fromBase64String("");
      String string0 = sha384Hash0.toString();
      String string1 = sha384Hash0.toString();
      assertSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 org.jsecurity.crypto.hash.AbstractHash.toBase64()Ljava/lang/String;: I4 Branch 5 IFNONNULL L240 - true
   * 2 org.jsecurity.crypto.hash.AbstractHash.toBase64()Ljava/lang/String;: I4 Branch 5 IFNONNULL L240 - false
   * 3 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I10 Branch 2 IFNULL L200 - false
   * 4 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I39 Branch 3 IF_ICMPGE L207 - false
   * 5 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: I32 Branch 1 IFNULL L121 - false
   */
  @Test
  public void test5()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "UTF-8", (Object) "SHA-384", 1711);
      assertNotNull(md5Hash0);
      
      String string0 = md5Hash0.toBase64();
      assertNotNull(string0);
      
      String string1 = md5Hash0.toBase64();
      assertEquals("6mtO7R5bB2gqcu9YklVEpA==", string1);
      assertSame(string1, string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.crypto.hash.AbstractHash.equals(Ljava/lang/Object;)Z: I4 Branch 6 IFEQ L265 - true
   */
  @Test
  public void test6()  throws Throwable  {
      Sha384Hash sha384Hash0 = Sha384Hash.fromBase64String("{b. g^wZPo");
      boolean boolean0 = sha384Hash0.equals((Object) "SHA-512");
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 9 covered goals:
   * 1 org.jsecurity.crypto.hash.AbstractHash.equals(Ljava/lang/Object;)Z: I4 Branch 6 IFEQ L265 - false
   * 2 org.jsecurity.crypto.hash.AbstractHash.<init>()V: root-Branch
   * 3 org.jsecurity.crypto.hash.AbstractHash.getBytes()[B: root-Branch
   * 4 org.jsecurity.crypto.hash.AbstractHash.getDigest(Ljava/lang/String;)Ljava/security/MessageDigest;: root-Branch
   * 5 org.jsecurity.crypto.hash.AbstractHash.setBytes([B)V: root-Branch
   * 6 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;)V: root-Branch
   * 7 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I10 Branch 2 IFNULL L200 - true
   * 8 org.jsecurity.crypto.hash.AbstractHash.hash([B[BI)[B: I39 Branch 3 IF_ICMPGE L207 - true
   * 9 org.jsecurity.crypto.hash.AbstractHash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: I32 Branch 1 IFNULL L121 - true
   */
  @Test
  public void test7()  throws Throwable  {
      Sha1Hash sha1Hash0 = new Sha1Hash();
      Md2Hash md2Hash0 = new Md2Hash((Object) "SHA-512");
      assertNotNull(md2Hash0);
      
      boolean boolean0 = md2Hash0.equals((Object) sha1Hash0);
      assertEquals(false, boolean0);
      assertEquals("d19924bd0c212185fd872658c984aae7", md2Hash0.toString());
  }
}
