/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.codec;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.codec.Base64;

public class Base64EvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Base64.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertNotNull(base64_0);
  }

  //Test case number: 1
  /*
   * 34 covered goals:
   * 1 org.jsecurity.codec.Base64.isBase64(B)Z: I17 Branch 3 IF_ICMPNE L164 - true
   * 2 org.jsecurity.codec.Base64.isBase64([B)Z: I13 Branch 4 IFNE L183 - true
   * 3 org.jsecurity.codec.Base64.isBase64([B)Z: I25 Branch 5 IF_ICMPGE L188 - true
   * 4 org.jsecurity.codec.Base64.isBase64([B)Z: I25 Branch 5 IF_ICMPGE L188 - false
   * 5 org.jsecurity.codec.Base64.isBase64([B)Z: I32 Branch 6 IFNE L189 - true
   * 6 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I24 Branch 7 IF_ICMPGE L206 - true
   * 7 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I24 Branch 7 IF_ICMPGE L206 - false
   * 8 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 8 LOOKUPSWITCH L207 Case 9 - false
   * 9 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 9 LOOKUPSWITCH L207 Case 10 - true
   * 10 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 9 LOOKUPSWITCH L207 Case 10 - false
   * 11 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 10 LOOKUPSWITCH L207 Case 13 - true
   * 12 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 10 LOOKUPSWITCH L207 Case 13 - false
   * 13 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 11 LOOKUPSWITCH L207 Case 32 - false
   * 14 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 12 LOOKUPSWITCH L207 Default-Case - true
   * 15 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 12 LOOKUPSWITCH L207 Default-Case - false
   * 16 org.jsecurity.codec.Base64.encodeChunked([B)[B: root-Branch
   * 17 org.jsecurity.codec.Base64.isBase64(B)Z: I4 Branch 1 IF_ICMPNE L162 - true
   * 18 org.jsecurity.codec.Base64.isBase64(B)Z: I4 Branch 1 IF_ICMPNE L162 - false
   * 19 org.jsecurity.codec.Base64.isBase64(B)Z: I12 Branch 2 IFLT L164 - false
   * 20 org.jsecurity.codec.Base64.encode([BZ)[B: I37 Branch 13 IFEQ L273 - false
   * 21 org.jsecurity.codec.Base64.encode([BZ)[B: I56 Branch 14 IFEQ L284 - false
   * 22 org.jsecurity.codec.Base64.encode([BZ)[B: I61 Branch 15 IFNE L286 - true
   * 23 org.jsecurity.codec.Base64.encode([BZ)[B: I89 Branch 16 IFLE L291 - true
   * 24 org.jsecurity.codec.Base64.encode([BZ)[B: I152 Branch 17 IFGE L307 - true
   * 25 org.jsecurity.codec.Base64.encode([BZ)[B: I152 Branch 17 IFGE L307 - false
   * 26 org.jsecurity.codec.Base64.encode([BZ)[B: I200 Branch 18 IFNE L318 - false
   * 27 org.jsecurity.codec.Base64.encode([BZ)[B: I220 Branch 19 IFNE L319 - false
   * 28 org.jsecurity.codec.Base64.encode([BZ)[B: I240 Branch 20 IFNE L320 - false
   * 29 org.jsecurity.codec.Base64.encode([BZ)[B: I309 Branch 21 IFEQ L333 - false
   * 30 org.jsecurity.codec.Base64.encode([BZ)[B: I314 Branch 22 IF_ICMPNE L335 - true
   * 31 org.jsecurity.codec.Base64.encode([BZ)[B: I362 Branch 23 IFNE L347 - false
   * 32 org.jsecurity.codec.Base64.encode([BZ)[B: I381 Branch 24 IFNE L352 - false
   * 33 org.jsecurity.codec.Base64.encode([BZ)[B: I553 Branch 28 IFEQ L373 - false
   * 34 org.jsecurity.codec.Base64.encode([BZ)[B: I558 Branch 29 IF_ICMPGE L375 - false
   */
  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = Base64.encodeChunked(byteArray0);
      assertNotNull(byteArray1);
      
      boolean boolean0 = Base64.isBase64(byteArray1);
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.jsecurity.codec.Base64.decodeToString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.codec.Base64.decodeToString([B)Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I24 Branch 38 IF_ICMPGE L493 - true
   * 4 org.jsecurity.codec.Base64.decode([B)[B: I9 Branch 30 IFNE L428 - false
   */
  @Test
  public void test2()  throws Throwable  {
      String string0 = Base64.decodeToString("");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 org.jsecurity.codec.Base64.encode([BZ)[B: I558 Branch 29 IF_ICMPGE L375 - true
   * 2 org.jsecurity.codec.Base64.decode(Ljava/lang/String;)[B: root-Branch
   * 3 org.jsecurity.codec.Base64.encode([BZ)[B: I37 Branch 13 IFEQ L273 - true
   * 4 org.jsecurity.codec.Base64.encode([BZ)[B: I362 Branch 23 IFNE L347 - true
   * 5 org.jsecurity.codec.Base64.encode([BZ)[B: I439 Branch 25 IFNE L357 - true
   */
  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = Base64.decode("");
      byte[] byteArray1 = Base64.encode(byteArray0, true);
      assertNotSame(byteArray0, byteArray1);
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * 1 org.jsecurity.codec.Base64.isBase64(B)Z: I4 Branch 1 IF_ICMPNE L162 - false
   * 2 org.jsecurity.codec.Base64.decode([B)[B: I9 Branch 30 IFNE L428 - true
   * 3 org.jsecurity.codec.Base64.decode([B)[B: I66 Branch 31 IF_ICMPNE L444 - false
   * 4 org.jsecurity.codec.Base64.decode([B)[B: I71 Branch 32 IFNE L445 - false
   * 5 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I33 Branch 39 IFEQ L494 - false
   * 6 org.jsecurity.codec.Base64.isBase64(B)Z: I17 Branch 3 IF_ICMPNE L164 - false
   * 7 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I24 Branch 38 IF_ICMPGE L493 - false
   * 8 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I33 Branch 39 IFEQ L494 - true
   */
  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)61;
      String string0 = Base64.decodeToString(byteArray0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.jsecurity.codec.Base64.isBase64(B)Z: I12 Branch 2 IFLT L164 - true
   * 2 org.jsecurity.codec.Base64.decode([B)[B: I9 Branch 30 IFNE L428 - false
   */
  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-41);
      byte[] byteArray1 = Base64.decode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Base64.isBase64([B)Z: I13 Branch 4 IFNE L183 - false
   */
  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Base64.discardNonBase64(byteArray0);
      assertNotNull(byteArray1);
      
      boolean boolean0 = Base64.isBase64(byteArray1);
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 8 LOOKUPSWITCH L207 Case 9 - true
   * 2 org.jsecurity.codec.Base64.isBase64([B)Z: I13 Branch 4 IFNE L183 - true
   * 3 org.jsecurity.codec.Base64.isBase64([B)Z: I25 Branch 5 IF_ICMPGE L188 - false
   * 4 org.jsecurity.codec.Base64.isBase64([B)Z: I32 Branch 6 IFNE L189 - false
   */
  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)9;
      boolean boolean0 = Base64.isBase64(byteArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 9 covered goals:
   * 1 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 11 LOOKUPSWITCH L207 Case 32 - true
   * 2 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I24 Branch 7 IF_ICMPGE L206 - true
   * 3 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I24 Branch 7 IF_ICMPGE L206 - false
   * 4 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 8 LOOKUPSWITCH L207 Case 9 - false
   * 5 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 9 LOOKUPSWITCH L207 Case 10 - false
   * 6 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 10 LOOKUPSWITCH L207 Case 13 - false
   * 7 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 11 LOOKUPSWITCH L207 Case 32 - false
   * 8 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 12 LOOKUPSWITCH L207 Default-Case - true
   * 9 org.jsecurity.codec.Base64.discardWhitespace([B)[B: I32 Branch 12 LOOKUPSWITCH L207 Default-Case - false
   */
  @Test
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)32;
      byte[] byteArray1 = Base64.discardWhitespace(byteArray0);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
  }

  //Test case number: 9
  /*
   * 8 covered goals:
   * 1 org.jsecurity.codec.Base64.encode([BZ)[B: I37 Branch 13 IFEQ L273 - true
   * 2 org.jsecurity.codec.Base64.encode([BZ)[B: I362 Branch 23 IFNE L347 - true
   * 3 org.jsecurity.codec.Base64.encode([BZ)[B: I439 Branch 25 IFNE L357 - true
   * 4 org.jsecurity.codec.Base64.encodeToString([B)Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.codec.Base64.encode([B)[B: root-Branch
   * 6 org.jsecurity.codec.Base64.encode([BZ)[B: I56 Branch 14 IFEQ L284 - true
   * 7 org.jsecurity.codec.Base64.encode([BZ)[B: I309 Branch 21 IFEQ L333 - true
   * 8 org.jsecurity.codec.Base64.encode([BZ)[B: I553 Branch 28 IFEQ L373 - true
   */
  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = Base64.encodeChunked(byteArray0);
      assertNotNull(byteArray1);
      
      String string0 = Base64.encodeToString(byteArray1);
      assertEquals("QUFBQUFBQUFBQUFBQUE9PQAA", string0);
      assertNotNull(string0);
  }

  //Test case number: 10
  /*
   * 24 covered goals:
   * 1 org.jsecurity.codec.Base64.encode([BZ)[B: I200 Branch 18 IFNE L318 - true
   * 2 org.jsecurity.codec.Base64.encode([BZ)[B: I220 Branch 19 IFNE L319 - true
   * 3 org.jsecurity.codec.Base64.encode([BZ)[B: I240 Branch 20 IFNE L320 - true
   * 4 org.jsecurity.codec.Base64.encode([BZ)[B: I439 Branch 25 IFNE L357 - false
   * 5 org.jsecurity.codec.Base64.encode([BZ)[B: I473 Branch 26 IFNE L364 - false
   * 6 org.jsecurity.codec.Base64.encode([BZ)[B: I493 Branch 27 IFNE L365 - false
   * 7 org.jsecurity.codec.Base64.decode([B)[B: I66 Branch 31 IF_ICMPNE L444 - true
   * 8 org.jsecurity.codec.Base64.decode([B)[B: I91 Branch 33 IF_ICMPGE L452 - true
   * 9 org.jsecurity.codec.Base64.decode([B)[B: I91 Branch 33 IF_ICMPGE L452 - false
   * 10 org.jsecurity.codec.Base64.decode([B)[B: I136 Branch 34 IF_ICMPEQ L460 - false
   * 11 org.jsecurity.codec.Base64.decode([B)[B: I139 Branch 35 IF_ICMPEQ L460 - true
   * 12 org.jsecurity.codec.Base64.decode([B)[B: I139 Branch 35 IF_ICMPEQ L460 - false
   * 13 org.jsecurity.codec.Base64.decode([B)[B: I202 Branch 36 IF_ICMPNE L468 - true
   * 14 org.jsecurity.codec.Base64.decode([B)[B: I221 Branch 37 IF_ICMPNE L471 - false
   * 15 org.jsecurity.codec.Base64.encodeChunked([B)[B: root-Branch
   * 16 org.jsecurity.codec.Base64.decode(Ljava/lang/String;)[B: root-Branch
   * 17 org.jsecurity.codec.Base64.isBase64(B)Z: I17 Branch 3 IF_ICMPNE L164 - false
   * 18 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I33 Branch 39 IFEQ L494 - true
   * 19 org.jsecurity.codec.Base64.encode([BZ)[B: I56 Branch 14 IFEQ L284 - false
   * 20 org.jsecurity.codec.Base64.encode([BZ)[B: I61 Branch 15 IFNE L286 - true
   * 21 org.jsecurity.codec.Base64.encode([BZ)[B: I309 Branch 21 IFEQ L333 - false
   * 22 org.jsecurity.codec.Base64.encode([BZ)[B: I314 Branch 22 IF_ICMPNE L335 - true
   * 23 org.jsecurity.codec.Base64.encode([BZ)[B: I553 Branch 28 IFEQ L373 - false
   * 24 org.jsecurity.codec.Base64.encode([BZ)[B: I558 Branch 29 IF_ICMPGE L375 - false
   */
  @Test
  public void test10()  throws Throwable  {
      byte[] byteArray0 = Base64.decode("Input array too big, output array would be bigger than Integer.MAX_VALUE=2147483647");
      byte[] byteArray1 = Base64.encodeChunked(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Base64.encode([BZ)[B: I381 Branch 24 IFNE L352 - true
   */
  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[9] = (byte) (-3);
      byte[] byteArray1 = Base64.encode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Base64.encode([BZ)[B: I473 Branch 26 IFNE L364 - true
   */
  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-41);
      String string0 = Base64.encodeToString(byteArray0);
      assertNotNull(string0);
      assertEquals("1wA=", string0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.jsecurity.codec.Base64.encode([BZ)[B: I493 Branch 27 IFNE L365 - true
   * 2 org.jsecurity.codec.Base64.encodeToString([B)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-41);
      String string0 = Base64.encodeToString(byteArray0);
      assertEquals("ANc=", string0);
      assertNotNull(string0);
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 org.jsecurity.codec.Base64.decode([B)[B: I71 Branch 32 IFNE L445 - true
   * 2 org.jsecurity.codec.Base64.decode([B)[B: I139 Branch 35 IF_ICMPEQ L460 - true
   * 3 org.jsecurity.codec.Base64.decode([B)[B: I202 Branch 36 IF_ICMPNE L468 - true
   * 4 org.jsecurity.codec.Base64.decode([B)[B: I221 Branch 37 IF_ICMPNE L471 - false
   */
  @Test
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Base64.encode(byteArray0);
      byte[] byteArray2 = Base64.decode(byteArray1);
      assertNotSame(byteArray1, byteArray2);
  }

  //Test case number: 15
  /*
   * 35 covered goals:
   * 1 org.jsecurity.codec.Base64.decode([B)[B: I136 Branch 34 IF_ICMPEQ L460 - true
   * 2 org.jsecurity.codec.Base64.decode([B)[B: I202 Branch 36 IF_ICMPNE L468 - false
   * 3 org.jsecurity.codec.Base64.decodeToString([B)Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.codec.Base64.encode([B)[B: root-Branch
   * 5 org.jsecurity.codec.Base64.isBase64(B)Z: I4 Branch 1 IF_ICMPNE L162 - true
   * 6 org.jsecurity.codec.Base64.isBase64(B)Z: I4 Branch 1 IF_ICMPNE L162 - false
   * 7 org.jsecurity.codec.Base64.isBase64(B)Z: I12 Branch 2 IFLT L164 - false
   * 8 org.jsecurity.codec.Base64.isBase64(B)Z: I17 Branch 3 IF_ICMPNE L164 - true
   * 9 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I24 Branch 38 IF_ICMPGE L493 - true
   * 10 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I24 Branch 38 IF_ICMPGE L493 - false
   * 11 org.jsecurity.codec.Base64.discardNonBase64([B)[B: I33 Branch 39 IFEQ L494 - false
   * 12 org.jsecurity.codec.Base64.decode([B)[B: I9 Branch 30 IFNE L428 - true
   * 13 org.jsecurity.codec.Base64.decode([B)[B: I66 Branch 31 IF_ICMPNE L444 - true
   * 14 org.jsecurity.codec.Base64.decode([B)[B: I66 Branch 31 IF_ICMPNE L444 - false
   * 15 org.jsecurity.codec.Base64.decode([B)[B: I71 Branch 32 IFNE L445 - true
   * 16 org.jsecurity.codec.Base64.decode([B)[B: I91 Branch 33 IF_ICMPGE L452 - true
   * 17 org.jsecurity.codec.Base64.decode([B)[B: I91 Branch 33 IF_ICMPGE L452 - false
   * 18 org.jsecurity.codec.Base64.decode([B)[B: I136 Branch 34 IF_ICMPEQ L460 - false
   * 19 org.jsecurity.codec.Base64.decode([B)[B: I139 Branch 35 IF_ICMPEQ L460 - false
   * 20 org.jsecurity.codec.Base64.encode([BZ)[B: I37 Branch 13 IFEQ L273 - false
   * 21 org.jsecurity.codec.Base64.encode([BZ)[B: I56 Branch 14 IFEQ L284 - true
   * 22 org.jsecurity.codec.Base64.encode([BZ)[B: I89 Branch 16 IFLE L291 - true
   * 23 org.jsecurity.codec.Base64.encode([BZ)[B: I152 Branch 17 IFGE L307 - true
   * 24 org.jsecurity.codec.Base64.encode([BZ)[B: I152 Branch 17 IFGE L307 - false
   * 25 org.jsecurity.codec.Base64.encode([BZ)[B: I200 Branch 18 IFNE L318 - false
   * 26 org.jsecurity.codec.Base64.encode([BZ)[B: I220 Branch 19 IFNE L319 - false
   * 27 org.jsecurity.codec.Base64.encode([BZ)[B: I240 Branch 20 IFNE L320 - false
   * 28 org.jsecurity.codec.Base64.encode([BZ)[B: I309 Branch 21 IFEQ L333 - true
   * 29 org.jsecurity.codec.Base64.encode([BZ)[B: I362 Branch 23 IFNE L347 - true
   * 30 org.jsecurity.codec.Base64.encode([BZ)[B: I362 Branch 23 IFNE L347 - false
   * 31 org.jsecurity.codec.Base64.encode([BZ)[B: I381 Branch 24 IFNE L352 - false
   * 32 org.jsecurity.codec.Base64.encode([BZ)[B: I439 Branch 25 IFNE L357 - false
   * 33 org.jsecurity.codec.Base64.encode([BZ)[B: I473 Branch 26 IFNE L364 - false
   * 34 org.jsecurity.codec.Base64.encode([BZ)[B: I493 Branch 27 IFNE L365 - false
   * 35 org.jsecurity.codec.Base64.encode([BZ)[B: I553 Branch 28 IFEQ L373 - true
   */
  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Base64.encode(byteArray0);
      assertNotNull(byteArray1);
      
      byte[] byteArray2 = Base64.encode(byteArray1);
      assertNotNull(byteArray2);
      
      String string0 = Base64.decodeToString(byteArray2);
      assertNotNull(string0);
      assertEquals("AAA=", string0);
  }
}
