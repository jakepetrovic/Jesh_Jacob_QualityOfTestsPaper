/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.codec;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.codec.Hex;

public class HexEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Hex.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Hex hex0 = new Hex();
      assertNotNull(hex0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.jsecurity.codec.Hex.decode([B)[B: root-Branch
   * 2 org.jsecurity.codec.Hex.decode(Ljava/lang/String;)[B: root-Branch
   * 3 org.jsecurity.codec.Hex.decode([C)[B: I10 Branch 2 IFEQ L128 - true
   * 4 org.jsecurity.codec.Hex.decode([C)[B: I35 Branch 3 IF_ICMPGE L135 - true
   */
  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = Hex.decode("");
      byte[] byteArray1 = Hex.decode(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jsecurity.codec.Hex.encodeToString([B)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.codec.Hex.encode([B)[C: I22 Branch 1 IF_ICMPGE L72 - true
   * 3 org.jsecurity.codec.Hex.decode(Ljava/lang/String;)[B: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = Hex.decode("");
      String string0 = Hex.encodeToString(byteArray0);
      assertEquals("", string0);
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * 1 org.jsecurity.codec.Hex.decode([C)[B: I35 Branch 3 IF_ICMPGE L135 - false
   * 2 org.jsecurity.codec.Hex.toDigit(CI)I: I10 Branch 4 IF_ICMPNE L156 - true
   * 3 org.jsecurity.codec.Hex.encode([B)[C: I22 Branch 1 IF_ICMPGE L72 - true
   * 4 org.jsecurity.codec.Hex.encode([B)[C: I22 Branch 1 IF_ICMPGE L72 - false
   * 5 org.jsecurity.codec.Hex.decode([C)[B: I10 Branch 2 IFEQ L128 - true
   * 6 org.jsecurity.codec.Hex.decode([C)[B: I35 Branch 3 IF_ICMPGE L135 - true
   */
  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = Hex.encode(byteArray0);
      byte[] byteArray1 = Hex.decode(charArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Hex.decode([C)[B: I10 Branch 2 IFEQ L128 - false
   */
  @Test
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[9];
      try {
        Hex.decode(charArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Odd number of characters.
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.codec.Hex.toDigit(CI)I: I10 Branch 4 IF_ICMPNE L156 - false
   */
  @Test
  public void test5()  throws Throwable  {
      try {
        Hex.toDigit('@', (int) (byte)111);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter @ at index 111
         */
      }
  }
}