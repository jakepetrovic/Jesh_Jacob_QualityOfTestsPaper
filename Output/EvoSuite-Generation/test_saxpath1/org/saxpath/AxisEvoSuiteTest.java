/*
 * This file was automatically generated by EvoSuite
 */

package org.saxpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.saxpath.Axis;

public class AxisEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Axis axis0 = new Axis();
      assertNotNull(axis0);
  }

  //Test case number: 1
  /*
   * 14 covered goals:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L115 Case 1 - true
   * 2 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L115 Case 2 - false
   * 3 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L115 Case 3 - false
   * 4 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L115 Case 4 - false
   * 5 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 5 TABLESWITCH L115 Case 5 - false
   * 6 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 6 TABLESWITCH L115 Case 6 - false
   * 7 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 7 TABLESWITCH L115 Case 7 - false
   * 8 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 8 TABLESWITCH L115 Case 8 - false
   * 9 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 9 TABLESWITCH L115 Case 9 - false
   * 10 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 10 TABLESWITCH L115 Case 10 - false
   * 11 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L115 Case 11 - false
   * 12 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L115 Case 12 - false
   * 13 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L115 Case 13 - false
   * 14 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L115 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      String string0 = Axis.lookup(1);
      assertNotNull(string0);
      assertEquals("child", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L115 Case 1 - false
   * 2 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L115 Default-Case - true
   */
  @Test
  public void test2()  throws Throwable  {
      String string0 = Axis.lookup((-1));
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L115 Case 2 - true
   */
  @Test
  public void test3()  throws Throwable  {
      String string0 = Axis.lookup(2);
      assertNotNull(string0);
      assertEquals("descendant", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L115 Case 3 - true
   */
  @Test
  public void test4()  throws Throwable  {
      String string0 = Axis.lookup(3);
      assertNotNull(string0);
      assertEquals("parent", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L115 Case 4 - true
   */
  @Test
  public void test5()  throws Throwable  {
      String string0 = Axis.lookup(4);
      assertNotNull(string0);
      assertEquals("ancestor", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 5 TABLESWITCH L115 Case 5 - true
   */
  @Test
  public void test6()  throws Throwable  {
      String string0 = Axis.lookup(5);
      assertNotNull(string0);
      assertEquals("following-sibling", string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 6 TABLESWITCH L115 Case 6 - true
   */
  @Test
  public void test7()  throws Throwable  {
      String string0 = Axis.lookup(6);
      assertNotNull(string0);
      assertEquals("preceding-sibling", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 7 TABLESWITCH L115 Case 7 - true
   */
  @Test
  public void test8()  throws Throwable  {
      String string0 = Axis.lookup(7);
      assertNotNull(string0);
      assertEquals("following", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 8 TABLESWITCH L115 Case 8 - true
   */
  @Test
  public void test9()  throws Throwable  {
      String string0 = Axis.lookup(8);
      assertEquals("preceding", string0);
      assertNotNull(string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 9 TABLESWITCH L115 Case 9 - true
   */
  @Test
  public void test10()  throws Throwable  {
      String string0 = Axis.lookup(9);
      assertNotNull(string0);
      assertEquals("attribute", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 10 TABLESWITCH L115 Case 10 - true
   */
  @Test
  public void test11()  throws Throwable  {
      String string0 = Axis.lookup(10);
      assertEquals("namespace", string0);
      assertNotNull(string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L115 Case 11 - true
   */
  @Test
  public void test12()  throws Throwable  {
      String string0 = Axis.lookup(11);
      assertEquals("self", string0);
      assertNotNull(string0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L115 Case 12 - true
   * 2 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L115 Case 13 - false
   */
  @Test
  public void test13()  throws Throwable  {
      String string0 = Axis.lookup(12);
      assertEquals("descendant-or-self", string0);
      assertNotNull(string0);
  }

  //Test case number: 14
  /*
   * 14 covered goals:
   * 1 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L115 Case 13 - true
   * 2 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L115 Case 1 - false
   * 3 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L115 Case 2 - false
   * 4 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L115 Case 3 - false
   * 5 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L115 Case 4 - false
   * 6 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 5 TABLESWITCH L115 Case 5 - false
   * 7 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 6 TABLESWITCH L115 Case 6 - false
   * 8 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 7 TABLESWITCH L115 Case 7 - false
   * 9 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 8 TABLESWITCH L115 Case 8 - false
   * 10 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 9 TABLESWITCH L115 Case 9 - false
   * 11 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 10 TABLESWITCH L115 Case 10 - false
   * 12 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L115 Case 11 - false
   * 13 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L115 Case 12 - false
   * 14 org.saxpath.Axis.lookup(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L115 Default-Case - false
   */
  @Test
  public void test14()  throws Throwable  {
      String string0 = Axis.lookup(13);
      assertEquals("ancestor-or-self", string0);
      assertNotNull(string0);
  }

  //Test case number: 15
  /*
   * 13 covered goals:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I5 Branch 15 IFLE L162 - true
   * 2 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I15 Branch 16 IFLE L167 - true
   * 3 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I25 Branch 17 IFLE L172 - true
   * 4 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I35 Branch 18 IFLE L177 - true
   * 5 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I45 Branch 19 IFLE L182 - true
   * 6 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I55 Branch 20 IFLE L187 - true
   * 7 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I65 Branch 21 IFLE L192 - true
   * 8 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I75 Branch 22 IFLE L197 - true
   * 9 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I85 Branch 23 IFLE L202 - true
   * 10 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I95 Branch 24 IFLE L207 - true
   * 11 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I105 Branch 25 IFLE L212 - true
   * 12 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I115 Branch 26 IFLE L217 - true
   * 13 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I125 Branch 27 IFLE L222 - true
   */
  @Test
  public void test15()  throws Throwable  {
      int int0 = Axis.lookup("Q&H#W&O,*6l[>He");
      assertEquals(0, int0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I5 Branch 15 IFLE L162 - false
   */
  @Test
  public void test16()  throws Throwable  {
      int int0 = Axis.lookup("child");
      assertEquals(1, int0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I15 Branch 16 IFLE L167 - false
   */
  @Test
  public void test17()  throws Throwable  {
      int int0 = Axis.lookup("descendant");
      assertEquals(2, int0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I25 Branch 17 IFLE L172 - false
   */
  @Test
  public void test18()  throws Throwable  {
      int int0 = Axis.lookup("parent");
      assertEquals(3, int0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I35 Branch 18 IFLE L177 - false
   */
  @Test
  public void test19()  throws Throwable  {
      int int0 = Axis.lookup("ancestor");
      assertEquals(4, int0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I45 Branch 19 IFLE L182 - false
   */
  @Test
  public void test20()  throws Throwable  {
      int int0 = Axis.lookup("following-sibling");
      assertEquals(5, int0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I55 Branch 20 IFLE L187 - false
   */
  @Test
  public void test21()  throws Throwable  {
      int int0 = Axis.lookup("preceding-sibling");
      assertEquals(6, int0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I65 Branch 21 IFLE L192 - false
   */
  @Test
  public void test22()  throws Throwable  {
      int int0 = Axis.lookup("following");
      assertEquals(7, int0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I75 Branch 22 IFLE L197 - false
   */
  @Test
  public void test23()  throws Throwable  {
      int int0 = Axis.lookup("preceding");
      assertEquals(8, int0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I85 Branch 23 IFLE L202 - false
   */
  @Test
  public void test24()  throws Throwable  {
      int int0 = Axis.lookup("attribute");
      assertEquals(9, int0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I95 Branch 24 IFLE L207 - false
   */
  @Test
  public void test25()  throws Throwable  {
      int int0 = Axis.lookup("namespace");
      assertEquals(10, int0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I105 Branch 25 IFLE L212 - false
   */
  @Test
  public void test26()  throws Throwable  {
      int int0 = Axis.lookup("self");
      assertEquals(11, int0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I115 Branch 26 IFLE L217 - false
   */
  @Test
  public void test27()  throws Throwable  {
      int int0 = Axis.lookup("descendant-or-self");
      assertEquals(12, int0);
  }

  //Test case number: 28
  /*
   * 13 covered goals:
   * 1 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I125 Branch 27 IFLE L222 - false
   * 2 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I5 Branch 15 IFLE L162 - true
   * 3 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I15 Branch 16 IFLE L167 - true
   * 4 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I25 Branch 17 IFLE L172 - true
   * 5 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I35 Branch 18 IFLE L177 - true
   * 6 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I45 Branch 19 IFLE L182 - true
   * 7 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I55 Branch 20 IFLE L187 - true
   * 8 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I65 Branch 21 IFLE L192 - true
   * 9 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I75 Branch 22 IFLE L197 - true
   * 10 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I85 Branch 23 IFLE L202 - true
   * 11 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I95 Branch 24 IFLE L207 - true
   * 12 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I105 Branch 25 IFLE L212 - true
   * 13 org.saxpath.Axis.lookup(Ljava/lang/String;)I: I115 Branch 26 IFLE L217 - true
   */
  @Test
  public void test28()  throws Throwable  {
      int int0 = Axis.lookup("ancestor-or-self");
      assertEquals(13, int0);
  }
}
