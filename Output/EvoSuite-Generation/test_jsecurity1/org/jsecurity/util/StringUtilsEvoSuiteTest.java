/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.util.Collection;
import org.jsecurity.util.StringUtils;

public class StringUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 13 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;)[Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CC)[Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCC)[Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;C)[Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I8 Branch 24 IFNONNULL L316 - true
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - true
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - false
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - true
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - true
   * 10 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - true
   * 11 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - false
   * 12 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I7 Branch 10 IFNULL L149 - false
   * 13 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - true
   */
  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("=");
      assertNotNull(stringArray0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      assertNotNull(stringUtils0);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - true
   * 2 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I21 Branch 2 IF_ICMPGE L76 - false
   * 3 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I28 Branch 3 IFNE L77 - false
   * 4 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I3 Branch 4 IFNULL L100 - false
   * 5 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I6 Branch 5 IFLE L100 - false
   */
  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText("]");
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - false
   * 2 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I6 Branch 5 IFLE L100 - true
   */
  @Test
  public void test3()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText("");
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I21 Branch 2 IF_ICMPGE L76 - true
   * 2 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I28 Branch 3 IFNE L77 - true
   * 3 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - true
   * 4 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I21 Branch 2 IF_ICMPGE L76 - false
   * 5 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I3 Branch 4 IFNULL L100 - false
   * 6 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I6 Branch 5 IFLE L100 - false
   */
  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText(" ");
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I3 Branch 4 IFNULL L100 - true
   * 2 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - false
   */
  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText((String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I3 Branch 6 IFNULL L116 - true
   */
  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase((String) null, (String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I3 Branch 6 IFNULL L116 - false
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I5 Branch 7 IFNONNULL L116 - false
   */
  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("]", (String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I5 Branch 7 IFNONNULL L116 - true
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I16 Branch 8 IFLE L119 - false
   */
  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("No corresponding value coud be found in line [", "No corresponding value coud be found in line [");
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I16 Branch 8 IFLE L119 - true
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I27 Branch 9 IF_ICMPGE L122 - false
   */
  @Test
  public void test9()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("ud%]?Ic{Tn", "Unable to determine Key/Value pair from line [");
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I27 Branch 9 IF_ICMPGE L122 - true
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I3 Branch 6 IFNULL L116 - false
   * 3 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I5 Branch 7 IFNONNULL L116 - true
   * 4 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I16 Branch 8 IFLE L119 - true
   */
  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("Unable to determine Key/Value pair from line [", "Zgz`xt6|M]\"#x>Z&X8");
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I7 Branch 10 IFNULL L149 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I8 Branch 18 IFNONNULL L242 - false
   */
  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = StringUtils.splitKeyValue((String) null);
      assertNull(stringArray0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I3 Branch 12 IFNONNULL L205 - false
   */
  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray((String) null, "B,.s >q:s%C;", false, false);
      assertNull(stringArray0);
  }

  //Test case number: 13
  /*
   * 6 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - false
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I35 Branch 14 IFEQ L212 - false
   * 3 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I44 Branch 15 IFEQ L215 - true
   * 4 org.jsecurity.util.StringUtils.toStringArray(Ljava/util/Collection;)[Ljava/lang/String;: I3 Branch 17 IFNONNULL L234 - true
   * 5 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I3 Branch 12 IFNONNULL L205 - true
   * 6 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - true
   */
  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray("ud%]?Ic{Tn", "Unable to determine Key/Value pair from line [", true, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 14
  /*
   * 3 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I35 Branch 14 IFEQ L212 - true
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I44 Branch 15 IFEQ L215 - false
   * 3 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I47 Branch 16 IFLE L215 - false
   */
  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray("Unable to determine Key/Value pair from line [", "ud%]?Ic{Tn", false, true);
      assertNotNull(stringArray0);
  }

  //Test case number: 15
  /*
   * 8 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I47 Branch 16 IFLE L215 - true
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.util.StringUtils.toStringArray(Ljava/util/Collection;)[Ljava/lang/String;: I3 Branch 17 IFNONNULL L234 - true
   * 4 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I3 Branch 12 IFNONNULL L205 - true
   * 5 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - true
   * 6 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - false
   * 7 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I35 Branch 14 IFEQ L212 - false
   * 8 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I44 Branch 15 IFEQ L215 - false
   */
  @Test
  public void test15()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray(" ", "hbY:Ib");
      assertNotNull(stringArray0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.toStringArray(Ljava/util/Collection;)[Ljava/lang/String;: I3 Branch 17 IFNONNULL L234 - false
   */
  @Test
  public void test16()  throws Throwable  {
      String[] stringArray0 = StringUtils.toStringArray((Collection) null);
      assertNull(stringArray0);
  }

  //Test case number: 17
  /*
   * 6 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I8 Branch 18 IFNONNULL L242 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - false
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I38 Branch 20 IF_ICMPEQ L249 - true
   * 4 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I88 Branch 21 IFLE L259 - false
   * 5 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I105 Branch 22 IFNONNULL L265 - true
   * 6 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I132 Branch 23 IFNONNULL L269 - true
   */
  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = StringUtils.splitKeyValue("onX2==PY=OD5iy");
      assertNotNull(stringArray0);
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I88 Branch 21 IFLE L259 - true
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I105 Branch 22 IFNONNULL L265 - true
   * 4 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I132 Branch 23 IFNONNULL L269 - true
   */
  @Test
  public void test18()  throws Throwable  {
      String[] stringArray0 = StringUtils.splitKeyValue("B,.s >q:s%C;");
      assertNotNull(stringArray0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I38 Branch 20 IF_ICMPEQ L249 - false
   */
  @Test
  public void test19()  throws Throwable  {
      try {
        StringUtils.splitKeyValue("hbY:Ib");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
        /*
         * Unable to determine Key/Value pair from line [hbY:Ib].  There is no space from which the split location could be determined.
         */
      }
  }

  //Test case number: 20
  /*
   * 6 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I105 Branch 22 IFNONNULL L265 - false
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I8 Branch 18 IFNONNULL L242 - true
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - false
   * 4 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I38 Branch 20 IF_ICMPEQ L249 - true
   * 5 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I88 Branch 21 IFLE L259 - true
   * 6 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - false
   */
  @Test
  public void test20()  throws Throwable  {
      try {
        StringUtils.splitKeyValue("=8M?");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
        /*
         * No valid key could be found in line [=8M?] to form a key/value pair.
         */
      }
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I8 Branch 24 IFNONNULL L316 - false
   * 2 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - false
   */
  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("", '%', '%', '%', true, false);
      assertNull(stringArray0);
  }

  //Test case number: 22
  /*
   * 12 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - false
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - true
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - false
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I58 Branch 28 IF_ICMPLE L330 - false
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I65 Branch 29 IF_ICMPNE L330 - true
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - true
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - false
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I93 Branch 31 IFEQ L339 - false
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - false
   * 10 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - true
   * 11 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - false
   * 12 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I119 Branch 34 IFEQ L345 - false
   */
  @Test
  public void test22()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("No corresponding value coud be found in line [", 'l', 'l', 'n', true, true);
      assertNotNull(stringArray0);
  }

  //Test case number: 23
  /*
   * 7 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I58 Branch 28 IF_ICMPLE L330 - true
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I93 Branch 31 IFEQ L339 - true
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I119 Branch 34 IFEQ L345 - true
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - true
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - false
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - false
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - true
   */
  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("Zq_'G:", 'Q', ':', 'G', false, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 24
  /*
   * 9 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - false
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I133 Branch 36 IFNE L348 - true
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I133 Branch 36 IFNE L348 - false
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I142 Branch 37 IFEQ L350 - true
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - false
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - true
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - false
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I119 Branch 34 IFEQ L345 - false
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - true
   */
  @Test
  public void test24()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("No corresponding value coud be found in line [", 'i', 'U', 'l', true, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 25
  /*
   * 12 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I142 Branch 37 IFEQ L350 - false
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I8 Branch 24 IFNONNULL L316 - true
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - true
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - false
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - true
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - true
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - true
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - false
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I133 Branch 36 IFNE L348 - false
   * 10 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - false
   * 11 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I7 Branch 10 IFNULL L149 - false
   * 12 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - true
   */
  @Test
  public void test25()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("No corresponding value could be found in line [", 'u', 'S', '|', true, true);
      assertNotNull(stringArray0);
  }
}