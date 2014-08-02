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
   * 3 covered goals:
   * 1 org.jsecurity.codec.Hex.decode([B)[B: root-Branch
   * 2 org.jsecurity.codec.Hex.decode(Ljava/lang/String;)[B: root-Branch
   * 3 org.jsecurity.codec.Hex.decode([C)[B: I10 Branch 2 IFEQ L128 - false
   */
  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      try {
        Hex.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Odd number of characters.
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.jsecurity.codec.Hex.encodeToString([B)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.codec.Hex.encode([B)[C: I22 Branch 1 IF_ICMPGE L72 - true
   * 3 org.jsecurity.codec.Hex.encode([B)[C: I22 Branch 1 IF_ICMPGE L72 - false
   */
  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Hex.encodeToString(byteArray0);
      assertEquals("0000", string0);
      assertNotNull(string0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.jsecurity.codec.Hex.decode([C)[B: I10 Branch 2 IFEQ L128 - true
   * 2 org.jsecurity.codec.Hex.decode([C)[B: I35 Branch 3 IF_ICMPGE L135 - true
   * 3 org.jsecurity.codec.Hex.decode(Ljava/lang/String;)[B: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = Hex.decode("");
      assertNotNull(byteArray0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 org.jsecurity.codec.Hex.toDigit(CI)I: I10 Branch 4 IF_ICMPNE L156 - true
   * 2 org.jsecurity.codec.Hex.toDigit(CI)I: I10 Branch 4 IF_ICMPNE L156 - false
   * 3 org.jsecurity.codec.Hex.decode([C)[B: I10 Branch 2 IFEQ L128 - true
   * 4 org.jsecurity.codec.Hex.decode([C)[B: I35 Branch 3 IF_ICMPGE L135 - false
   */
  @Test
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[10];
      charArray0[0] = 'C';
      try {
        Hex.decode(charArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Illegal hexadecimal charcter \u0000 at index 1
         */
      }
  }
}
