/*
 * This file was automatically generated by EvoSuite
 */

package org.saxpath.conformance;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.saxpath.conformance.ConformanceXPathHandler;

public class ConformanceXPathHandlerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startUnionExpr()V: root-Branch
   * 2 org.saxpath.conformance.ConformanceXPathHandler.<init>()V: root-Branch
   * 3 org.saxpath.conformance.ConformanceXPathHandler.addEvent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startUnionExpr();
      assertEquals("(0) startUnionExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endAndExpr(Z)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endAndExpr(true);
      assertEquals("(0) endAndExpr(true)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startXPath()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startXPath();
      assertEquals("(0) startXPath()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endAllNodeStep()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endAllNodeStep();
      assertEquals("(0) endAllNodeStep()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.number(I)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.number((-1438));
      assertEquals("(0) number(-1438)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.variableReference(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.variableReference("W*9X!mQH\"89i", "W*9X!mQH\"89i");
      assertEquals("(0) variableReference(\"W*9X!mQH\"89i:W*9X!mQH\"89i\")\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endUnionExpr(Z)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endUnionExpr(false);
      assertEquals("(0) endUnionExpr(false)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endMultiplicativeExpr(I)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endMultiplicativeExpr(92);
      assertEquals("(0) endMultiplicativeExpr(92)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.literal(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.literal("H3i&[%vExM");
      assertEquals("(0) literal(\"H3i&[%vExM\")\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startAdditiveExpr()V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startAdditiveExpr();
      assertEquals("(0) startAdditiveExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endXPath()V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endXPath();
      assertEquals("(0) endXPath()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startRelativeLocationPath()V: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startRelativeLocationPath();
      assertEquals("(0) startRelativeLocationPath()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endOrExpr(Z)V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endOrExpr(false);
      assertEquals("(0) endOrExpr(false)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startTextNodeStep(I)V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startTextNodeStep((-1809));
      assertEquals("(0) startTextNodeStep(-1809)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endUnaryExpr(I)V: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endUnaryExpr((-1));
      assertEquals("(0) endUnaryExpr(-1)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startOrExpr()V: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startOrExpr();
      assertEquals("(0) startOrExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startProcessingInstructionNodeStep(ILjava/lang/String;)V: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startProcessingInstructionNodeStep((-1), "");
      assertEquals("(0) startProcessingInstructionNodeStep(-1, \"\")\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endFunction()V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endFunction();
      assertEquals("(0) endFunction()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endNameStep()V: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endNameStep();
      assertEquals("(0) endNameStep()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endCommentNodeStep()V: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endCommentNodeStep();
      assertEquals("(0) endCommentNodeStep()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startPredicate()V: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startPredicate();
      assertEquals("(0) startPredicate()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endProcessingInstructionNodeStep()V: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endProcessingInstructionNodeStep();
      assertEquals("(0) endProcessingInstructionNodeStep()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startNameStep(ILjava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startNameStep(747, "W*9X!mQH\"89i", "startAdditiveExpr()");
      assertEquals("(0) startNameStep(747, \"W*9X!mQH\"89i\", \"startAdditiveExpr()\")\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startMultiplicativeExpr()V: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startMultiplicativeExpr();
      assertEquals("(0) startMultiplicativeExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.toString()Ljava/lang/String;: I20 Branch 2 IFEQ L327 - false
   * 2 org.saxpath.conformance.ConformanceXPathHandler.endAdditiveExpr(I)V: root-Branch
   * 3 org.saxpath.conformance.ConformanceXPathHandler.toString()Ljava/lang/String;: I20 Branch 2 IFEQ L327 - true
   */
  @Test
  public void test24()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endAdditiveExpr(0);
      String string0 = conformanceXPathHandler0.toString();
      assertEquals("(0) endAdditiveExpr(0)\n", conformanceXPathHandler0.toString());
      assertNotNull(string0);
      assertEquals("(0) endAdditiveExpr(0)\n", string0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endEqualityExpr(I)V: root-Branch
   */
  @Test
  public void test25()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endEqualityExpr(0);
      assertEquals("(0) endEqualityExpr(0)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startUnaryExpr()V: root-Branch
   */
  @Test
  public void test26()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startUnaryExpr();
      assertEquals("(0) startUnaryExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endRelationalExpr(I)V: root-Branch
   */
  @Test
  public void test27()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endRelationalExpr(373);
      assertEquals("(0) endRelationalExpr(373)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 28
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startRelationalExpr()V: root-Branch
   */
  @Test
  public void test28()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startRelationalExpr();
      assertEquals("(0) startRelationalExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startAndExpr()V: root-Branch
   */
  @Test
  public void test29()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startAndExpr();
      assertEquals("(0) startAndExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startPathExpr()V: root-Branch
   */
  @Test
  public void test30()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startPathExpr();
      assertEquals("(0) startPathExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 31
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endPredicate()V: root-Branch
   */
  @Test
  public void test31()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endPredicate();
      assertEquals("(0) endPredicate()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 32
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startFunction(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test32()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startFunction("", "");
      assertEquals("(0) startFunction(\":\")\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 33
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endAbsoluteLocationPath()V: root-Branch
   */
  @Test
  public void test33()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endAbsoluteLocationPath();
      assertEquals("(0) endAbsoluteLocationPath()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 34
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startAbsoluteLocationPath()V: root-Branch
   */
  @Test
  public void test34()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startAbsoluteLocationPath();
      assertEquals("(0) startAbsoluteLocationPath()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 35
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startAllNodeStep(I)V: root-Branch
   */
  @Test
  public void test35()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startAllNodeStep((-1438));
      assertEquals("(0) startAllNodeStep(-1438)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 36
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.number(D)V: root-Branch
   */
  @Test
  public void test36()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.number(322.8382932740033);
      assertEquals("(0) number(322.8382932740033)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 37
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startEqualityExpr()V: root-Branch
   */
  @Test
  public void test37()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startEqualityExpr();
      assertEquals("(0) startEqualityExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 38
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endPathExpr()V: root-Branch
   */
  @Test
  public void test38()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endPathExpr();
      assertEquals("(0) endPathExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 39
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endRelativeLocationPath()V: root-Branch
   */
  @Test
  public void test39()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endRelativeLocationPath();
      assertEquals("(0) endRelativeLocationPath()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 40
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startCommentNodeStep(I)V: root-Branch
   */
  @Test
  public void test40()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startCommentNodeStep(0);
      assertEquals("(0) startCommentNodeStep(0)\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 41
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endTextNodeStep()V: root-Branch
   */
  @Test
  public void test41()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endTextNodeStep();
      assertEquals("(0) endTextNodeStep()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 42
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.endFilterExpr()V: root-Branch
   */
  @Test
  public void test42()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.endFilterExpr();
      assertEquals("(0) endFilterExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 43
  /*
   * 2 covered goals:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.startFilterExpr()V: root-Branch
   * 2 org.saxpath.conformance.ConformanceXPathHandler.addEvent(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test43()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      conformanceXPathHandler0.startFilterExpr();
      assertEquals("(0) startFilterExpr()\n", conformanceXPathHandler0.toString());
  }

  //Test case number: 44
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.equals(Ljava/lang/Object;)Z: I4 Branch 1 IFEQ L310 - true
   */
  @Test
  public void test44()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      boolean boolean0 = conformanceXPathHandler0.equals((Object) "(0) endProcessingInstructionNodeStep()\n(1) endUnaryExpr(-1)\n");
      assertEquals(false, boolean0);
  }

  //Test case number: 45
  /*
   * 1 covered goal:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.equals(Ljava/lang/Object;)Z: I4 Branch 1 IFEQ L310 - false
   */
  @Test
  public void test45()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      boolean boolean0 = conformanceXPathHandler0.equals((Object) conformanceXPathHandler0);
      assertEquals(true, boolean0);
  }

  //Test case number: 46
  /*
   * 2 covered goals:
   * 1 org.saxpath.conformance.ConformanceXPathHandler.toString()Ljava/lang/String;: I20 Branch 2 IFEQ L327 - true
   * 2 org.saxpath.conformance.ConformanceXPathHandler.<init>()V: root-Branch
   */
  @Test
  public void test46()  throws Throwable  {
      ConformanceXPathHandler conformanceXPathHandler0 = new ConformanceXPathHandler();
      String string0 = conformanceXPathHandler0.toString();
      assertEquals("", string0);
  }
}
