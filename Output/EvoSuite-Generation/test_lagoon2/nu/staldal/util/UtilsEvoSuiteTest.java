/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.util.Utils;

public class UtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 14 covered goals:
   * 1 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I16 Branch 1 IF_ICMPGE L64 - false
   * 2 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 2 LOOKUPSWITCH L67 Case 36 - false
   * 3 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 3 LOOKUPSWITCH L67 Case 42 - false
   * 4 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 4 LOOKUPSWITCH L67 Case 45 - true
   * 5 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 4 LOOKUPSWITCH L67 Case 45 - false
   * 6 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 5 LOOKUPSWITCH L67 Case 47 - false
   * 7 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 6 LOOKUPSWITCH L67 Case 58 - false
   * 8 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 7 LOOKUPSWITCH L67 Case 63 - false
   * 9 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 8 LOOKUPSWITCH L67 Case 92 - false
   * 10 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 9 LOOKUPSWITCH L67 Case 95 - false
   * 11 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 10 LOOKUPSWITCH L67 Case 126 - false
   * 12 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 11 LOOKUPSWITCH L67 Default-Case - true
   * 13 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 11 LOOKUPSWITCH L67 Default-Case - false
   * 14 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I16 Branch 1 IF_ICMPGE L64 - true
   */
  @Test
  public void test0()  throws Throwable  {
      String string0 = Utils.encodePath("-Ys^9ML");
      assertEquals("--Ys^9ML", string0);
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 2 LOOKUPSWITCH L67 Case 36 - true
   * 2 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 3 LOOKUPSWITCH L67 Case 42 - true
   * 3 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 5 LOOKUPSWITCH L67 Case 47 - true
   * 4 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 9 LOOKUPSWITCH L67 Case 95 - true
   */
  @Test
  public void test1()  throws Throwable  {
      String string0 = Utils.encodePath("$<\"/q_z^;*(dW");
      assertNotNull(string0);
      assertEquals("$$<\"-q__z^;_(dW", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 6 LOOKUPSWITCH L67 Case 58 - true
   * 2 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 10 LOOKUPSWITCH L67 Case 126 - true
   */
  @Test
  public void test2()  throws Throwable  {
      String string0 = Utils.encodePath(":~hWDS@Ko%gA:)L3");
      assertEquals("~~~hWDS@Ko%gA~)L3", string0);
      assertNotNull(string0);
  }

  //Test case number: 3
  /*
   * 14 covered goals:
   * 1 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 7 LOOKUPSWITCH L67 Case 63 - true
   * 2 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I16 Branch 1 IF_ICMPGE L64 - true
   * 3 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I16 Branch 1 IF_ICMPGE L64 - false
   * 4 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 2 LOOKUPSWITCH L67 Case 36 - false
   * 5 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 3 LOOKUPSWITCH L67 Case 42 - false
   * 6 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 4 LOOKUPSWITCH L67 Case 45 - false
   * 7 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 5 LOOKUPSWITCH L67 Case 47 - false
   * 8 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 6 LOOKUPSWITCH L67 Case 58 - false
   * 9 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 7 LOOKUPSWITCH L67 Case 63 - false
   * 10 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 8 LOOKUPSWITCH L67 Case 92 - false
   * 11 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 9 LOOKUPSWITCH L67 Case 95 - false
   * 12 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 10 LOOKUPSWITCH L67 Case 126 - false
   * 13 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 11 LOOKUPSWITCH L67 Default-Case - true
   * 14 nu.staldal.util.Utils.encodePath(Ljava/lang/String;)Ljava/lang/String;: I26 Branch 11 LOOKUPSWITCH L67 Default-Case - false
   */
  @Test
  public void test3()  throws Throwable  {
      String string0 = Utils.encodePath("V6I^79<y?d9` ``[");
      assertEquals("V6I^79<y$d9` ``[", string0);
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 12 IFEQ L116 - true
   * 2 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I49 Branch 13 IF_ICMPGE L121 - true
   * 3 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I49 Branch 13 IF_ICMPGE L121 - false
   * 4 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I60 Branch 14 IFEQ L124 - false
   */
  @Test
  public void test4()  throws Throwable  {
      String string0 = Utils.encodePathAsIdentifier("0alKmP");
      assertEquals("_48_alKmP", string0);
      assertNotNull(string0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 12 IFEQ L116 - false
   * 2 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I60 Branch 14 IFEQ L124 - true
   * 3 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I49 Branch 13 IF_ICMPGE L121 - true
   * 4 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I49 Branch 13 IF_ICMPGE L121 - false
   * 5 nu.staldal.util.Utils.encodePathAsIdentifier(Ljava/lang/String;)Ljava/lang/String;: I60 Branch 14 IFEQ L124 - false
   */
  @Test
  public void test5()  throws Throwable  {
      String string0 = Utils.encodePathAsIdentifier("$<\"/q_z^;*(dW");
      assertEquals("$_60__34__47_q_z_94__59__42__40_dW", string0);
      assertNotNull(string0);
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I9 Branch 15 IFGE L143 - true
   * 2 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I21 Branch 16 IFGE L146 - true
   * 3 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I28 Branch 17 IF_ICMPGE L148 - false
   */
  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = Utils.absoluteURL(":*XM-U@y4LNBJ'e/~");
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I9 Branch 15 IFGE L143 - false
   */
  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = Utils.absoluteURL("");
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I21 Branch 16 IFGE L146 - false
   */
  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = Utils.absoluteURL(":~hWDS@Ko%gA:)L3");
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I28 Branch 17 IF_ICMPGE L148 - true
   * 2 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I9 Branch 15 IFGE L143 - true
   * 3 nu.staldal.util.Utils.absoluteURL(Ljava/lang/String;)Z: I21 Branch 16 IFGE L146 - true
   */
  @Test
  public void test9()  throws Throwable  {
      boolean boolean0 = Utils.absoluteURL("BEPFdwobf)/F:w2h");
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 nu.staldal.util.Utils.pseudoAbsoluteURL(Ljava/lang/String;)Z: I4 Branch 18 IFLE L158 - true
   */
  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = Utils.pseudoAbsoluteURL("");
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 nu.staldal.util.Utils.pseudoAbsoluteURL(Ljava/lang/String;)Z: I4 Branch 18 IFLE L158 - false
   * 2 nu.staldal.util.Utils.pseudoAbsoluteURL(Ljava/lang/String;)Z: I9 Branch 19 IF_ICMPNE L158 - true
   */
  @Test
  public void test11()  throws Throwable  {
      boolean boolean0 = Utils.pseudoAbsoluteURL("-Ys^9ML");
      assertEquals(false, boolean0);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 nu.staldal.util.Utils.pseudoAbsoluteURL(Ljava/lang/String;)Z: I9 Branch 19 IF_ICMPNE L158 - false
   * 2 nu.staldal.util.Utils.pseudoAbsoluteURL(Ljava/lang/String;)Z: I4 Branch 18 IFLE L158 - false
   */
  @Test
  public void test12()  throws Throwable  {
      boolean boolean0 = Utils.pseudoAbsoluteURL("/3EZZTpnx'x:?3");
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 nu.staldal.util.Utils.nChars(IC)Ljava/lang/String;: I14 Branch 20 IF_ICMPGE L169 - false
   * 2 nu.staldal.util.Utils.nChars(IC)Ljava/lang/String;: I14 Branch 20 IF_ICMPGE L169 - true
   */
  @Test
  public void test13()  throws Throwable  {
      String string0 = Utils.nChars(1, 'R');
      assertEquals("R", string0);
      assertNotNull(string0);
  }
}
