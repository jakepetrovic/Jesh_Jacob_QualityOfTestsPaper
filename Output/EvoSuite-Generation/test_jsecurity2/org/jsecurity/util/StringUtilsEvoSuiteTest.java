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
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      assertNotNull(stringUtils0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - true
   * 2 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I21 Branch 2 IF_ICMPGE L76 - false
   * 3 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I28 Branch 3 IFNE L77 - false
   * 4 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I3 Branch 4 IFNULL L100 - false
   * 5 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I6 Branch 5 IFLE L100 - false
   */
  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText("IQK!a^~l~r;>:Q; ");
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - false
   * 2 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I6 Branch 5 IFLE L100 - true
   */
  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText("");
      assertEquals(false, boolean0);
  }

  //Test case number: 3
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
  public void test3()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText(" ");
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.hasLength(Ljava/lang/String;)Z: I3 Branch 4 IFNULL L100 - true
   * 2 org.jsecurity.util.StringUtils.hasText(Ljava/lang/String;)Z: I4 Branch 1 IFNE L72 - false
   */
  @Test
  public void test4()  throws Throwable  {
      boolean boolean0 = StringUtils.hasText((String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I3 Branch 6 IFNULL L116 - true
   */
  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase((String) null, (String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I3 Branch 6 IFNULL L116 - false
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I5 Branch 7 IFNONNULL L116 - false
   */
  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("", (String) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I5 Branch 7 IFNONNULL L116 - true
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I16 Branch 8 IFLE L119 - false
   */
  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("", "");
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I16 Branch 8 IFLE L119 - true
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I27 Branch 9 IF_ICMPGE L122 - true
   */
  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("] to form a key/value pair.", "48s ");
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I27 Branch 9 IF_ICMPGE L122 - false
   * 2 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I3 Branch 6 IFNULL L116 - false
   * 3 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I5 Branch 7 IFNONNULL L116 - true
   * 4 org.jsecurity.util.StringUtils.startsWithIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Z: I16 Branch 8 IFLE L119 - true
   */
  @Test
  public void test9()  throws Throwable  {
      boolean boolean0 = StringUtils.startsWithIgnoreCase("{sb]o5cagqq`s<cl", "48s ] to form a key/value pair.");
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I7 Branch 10 IFNULL L149 - true
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I8 Branch 24 IFNONNULL L316 - false
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CC)[Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCC)[Ljava/lang/String;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      String[] stringArray0 = StringUtils.split((String) null, 'r', 'Z');
      assertNull(stringArray0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I3 Branch 12 IFNONNULL L205 - false
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray((String) null, "] to form a key/value pair.");
      assertNull(stringArray0);
  }

  //Test case number: 12
  /*
   * 6 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - false
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I35 Branch 14 IFEQ L212 - true
   * 3 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I44 Branch 15 IFEQ L215 - true
   * 4 org.jsecurity.util.StringUtils.toStringArray(Ljava/util/Collection;)[Ljava/lang/String;: I3 Branch 17 IFNONNULL L234 - true
   * 5 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I3 Branch 12 IFNONNULL L205 - true
   * 6 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - true
   */
  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray("] to form a key/value pair.", "48s ", false, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I35 Branch 14 IFEQ L212 - false
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I44 Branch 15 IFEQ L215 - true
   */
  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray("48s ", "] to form a key/value pair.", true, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 14
  /*
   * 9 covered goals:
   * 1 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I47 Branch 16 IFLE L215 - true
   * 2 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.util.StringUtils.toStringArray(Ljava/util/Collection;)[Ljava/lang/String;: I3 Branch 17 IFNONNULL L234 - true
   * 4 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I3 Branch 12 IFNONNULL L205 - true
   * 5 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - true
   * 6 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I26 Branch 13 IFEQ L210 - false
   * 7 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I35 Branch 14 IFEQ L212 - false
   * 8 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I44 Branch 15 IFEQ L215 - false
   * 9 org.jsecurity.util.StringUtils.tokenizeToStringArray(Ljava/lang/String;Ljava/lang/String;ZZ)[Ljava/lang/String;: I47 Branch 16 IFLE L215 - false
   */
  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = StringUtils.tokenizeToStringArray(" )BA ", "mp^Rr)E[S");
      assertNotNull(stringArray0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.StringUtils.toStringArray(Ljava/util/Collection;)[Ljava/lang/String;: I3 Branch 17 IFNONNULL L234 - false
   */
  @Test
  public void test15()  throws Throwable  {
      String[] stringArray0 = StringUtils.toStringArray((Collection) null);
      assertNull(stringArray0);
  }

  //Test case number: 16
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I8 Branch 18 IFNONNULL L242 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - false
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I38 Branch 20 IF_ICMPEQ L249 - false
   * 4 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I7 Branch 10 IFNULL L149 - false
   * 5 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - true
   */
  @Test
  public void test16()  throws Throwable  {
      try {
        StringUtils.splitKeyValue("IQK!a^~l~r;>:Q;");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
        /*
         * Unable to determine Key/Value pair from line [IQK!a^~l~r;>:Q;].  There is no space from which the split location could be determined.
         */
      }
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I8 Branch 18 IFNONNULL L242 - false
   * 2 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - false
   */
  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = StringUtils.splitKeyValue("");
      assertNull(stringArray0);
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I88 Branch 21 IFLE L259 - false
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I105 Branch 22 IFNONNULL L265 - true
   * 4 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I132 Branch 23 IFNONNULL L269 - false
   */
  @Test
  public void test18()  throws Throwable  {
      try {
        StringUtils.splitKeyValue("vS97WR@Kr_Y  =");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
        /*
         * No corresponding value could be found in line [vS97WR@Kr_Y  =] for key [vS97WR@Kr_Y]
         */
      }
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I38 Branch 20 IF_ICMPEQ L249 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I88 Branch 21 IFLE L259 - true
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I105 Branch 22 IFNONNULL L265 - false
   * 4 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - false
   * 5 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - false
   */
  @Test
  public void test19()  throws Throwable  {
      try {
        StringUtils.splitKeyValue("=an0SVqo><xO8G*6y^Upb");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
        /*
         * No valid key could be found in line [=an0SVqo><xO8G*6y^Upb] to form a key/value pair.
         */
      }
  }

  //Test case number: 20
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I132 Branch 23 IFNONNULL L269 - true
   * 2 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I8 Branch 18 IFNONNULL L242 - true
   * 3 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I25 Branch 19 IF_ICMPEQ L246 - true
   * 4 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I88 Branch 21 IFLE L259 - true
   * 5 org.jsecurity.util.StringUtils.splitKeyValue(Ljava/lang/String;)[Ljava/lang/String;: I105 Branch 22 IFNONNULL L265 - true
   */
  @Test
  public void test20()  throws Throwable  {
      String[] stringArray0 = StringUtils.splitKeyValue("] to form a key/value pair.");
      assertNotNull(stringArray0);
  }

  //Test case number: 21
  /*
   * 16 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I58 Branch 28 IF_ICMPLE L330 - true
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;)[Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;C)[Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I8 Branch 24 IFNONNULL L316 - true
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - true
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - false
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - true
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - false
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - true
   * 10 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - false
   * 11 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - true
   * 12 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - false
   * 13 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I93 Branch 31 IFEQ L339 - true
   * 14 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - true
   * 15 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - true
   * 16 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - false
   */
  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("H$Gxu l:0ZM/3(\"H$Gxu l:0ZM/3(\"");
      assertNotNull(stringArray0);
  }

  //Test case number: 22
  /*
   * 7 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I93 Branch 31 IFEQ L339 - false
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - false
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - true
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - false
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I119 Branch 34 IFEQ L345 - false
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I58 Branch 28 IF_ICMPLE L330 - false
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I65 Branch 29 IF_ICMPNE L330 - true
   */
  @Test
  public void test22()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("No corresponding value could be found in line [", 'p', 'p', 'e', true, true);
      assertNotNull(stringArray0);
  }

  //Test case number: 23
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I119 Branch 34 IFEQ L345 - true
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - true
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - false
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - true
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I109 Branch 33 IFNE L344 - false
   */
  @Test
  public void test23()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("] to form a key/value pair.", '-', 'x', 'r', false, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 24
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - false
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I133 Branch 36 IFNE L348 - false
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I142 Branch 37 IFEQ L350 - true
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - true
   */
  @Test
  public void test24()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("IQK!a^~l~r;>:Q; ", '~', 'v', 'D', false, false);
      assertNotNull(stringArray0);
  }

  //Test case number: 25
  /*
   * 12 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I133 Branch 36 IFNE L348 - true
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CC)[Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;)[Ljava/lang/String;: root-Branch
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;C)[Ljava/lang/String;: root-Branch
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - false
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - true
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I52 Branch 27 IFEQ L330 - false
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I58 Branch 28 IF_ICMPLE L330 - false
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I65 Branch 29 IF_ICMPNE L330 - true
   * 10 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - true
   * 11 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I83 Branch 30 IFNE L338 - false
   * 12 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I93 Branch 31 IFEQ L339 - true
   */
  @Test
  public void test25()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("3&dHB@qG\"fn,\"yl");
      assertNotNull(stringArray0);
  }

  //Test case number: 26
  /*
   * 13 covered goals:
   * 1 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I142 Branch 37 IFEQ L350 - false
   * 2 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCC)[Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I8 Branch 24 IFNONNULL L316 - true
   * 4 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - true
   * 5 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I37 Branch 25 IF_ICMPGE L324 - false
   * 6 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I48 Branch 26 IF_ICMPNE L327 - true
   * 7 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I105 Branch 32 IF_ICMPNE L343 - true
   * 8 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - true
   * 9 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I131 Branch 35 IF_ICMPNE L348 - false
   * 10 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I133 Branch 36 IFNE L348 - false
   * 11 org.jsecurity.util.StringUtils.split(Ljava/lang/String;CCCZZ)[Ljava/lang/String;: I181 Branch 38 IFEQ L360 - false
   * 12 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I7 Branch 10 IFNULL L149 - false
   * 13 org.jsecurity.util.StringUtils.clean(Ljava/lang/String;)Ljava/lang/String;: I18 Branch 11 IFLE L151 - true
   */
  @Test
  public void test26()  throws Throwable  {
      String[] stringArray0 = StringUtils.split("{sb]o5cagqq`s<cl", '`', '[', 'k');
      assertNotNull(stringArray0);
  }
}
