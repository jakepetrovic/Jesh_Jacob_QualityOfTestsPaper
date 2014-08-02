/*
 * This file was automatically generated by EvoSuite
 */

package com.werken.saxpath;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.werken.saxpath.Token;
import com.werken.saxpath.XPathLexer;

public class XPathLexerEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 com.werken.saxpath.XPathLexer.currentPosition()I: root-Branch
   * 2 com.werken.saxpath.XPathLexer.endPosition()I: root-Branch
   * 3 com.werken.saxpath.XPathLexer.<init>()V: root-Branch
   * 4 com.werken.saxpath.XPathLexer.hasMoreChars()Z: I6 Branch 224 IF_ICMPGE L986 - true
   */
  @Test
  public void test0()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertEquals(false, boolean0);
      assertEquals(0, xPathLexer0.endPosition());
      assertEquals(0, xPathLexer0.currentPosition());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 com.werken.saxpath.XPathLexer.getXPath()Ljava/lang/String;: root-Branch
   * 2 com.werken.saxpath.XPathLexer.LA(I)C: I10 Branch 223 IF_ICMPLT L946 - true
   * 3 com.werken.saxpath.XPathLexer.setXPath(Ljava/lang/String;)V: root-Branch
   * 4 com.werken.saxpath.XPathLexer.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("HM=!'E[ve)e");
      char char0 = xPathLexer0.LA(1);
      assertEquals(11, xPathLexer0.endPosition());
      assertEquals(0, xPathLexer0.currentPosition());
      assertEquals('H', char0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.werken.saxpath.XPathLexer.setPreviousToken(Lcom/werken/saxpath/Token;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.setPreviousToken((Token) null);
      assertEquals(0, xPathLexer0.currentPosition());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.werken.saxpath.XPathLexer.consume(I)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.consume(0);
      assertEquals(0, xPathLexer0.currentPosition());
      assertEquals(false, xPathLexer0.hasMoreChars());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.werken.saxpath.XPathLexer.consume()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.consume();
      assertEquals(1, xPathLexer0.currentPosition());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.werken.saxpath.XPathLexer.LA(I)C: I10 Branch 223 IF_ICMPLT L946 - false
   */
  @Test
  public void test5()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      char char0 = xPathLexer0.LA((int) ']');
      assertEquals('\uFFFF', char0);
      assertEquals(0, xPathLexer0.endPosition());
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 com.werken.saxpath.XPathLexer.hasMoreChars()Z: I6 Branch 224 IF_ICMPGE L986 - false
   * 2 com.werken.saxpath.XPathLexer.currentPosition()I: root-Branch
   * 3 com.werken.saxpath.XPathLexer.setXPath(Ljava/lang/String;)V: root-Branch
   * 4 com.werken.saxpath.XPathLexer.endPosition()I: root-Branch
   * 5 com.werken.saxpath.XPathLexer.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("HM=!'E[ve)e");
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertEquals(11, xPathLexer0.endPosition());
      assertEquals(true, boolean0);
      assertEquals(0, xPathLexer0.currentPosition());
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 225 LOOKUPSWITCH L991 Case 45 - true
   * 2 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 226 LOOKUPSWITCH L991 Case 46 - false
   * 3 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 227 LOOKUPSWITCH L991 Default-Case - false
   */
  @Test
  public void test7()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.isIdentifierChar('-');
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 225 LOOKUPSWITCH L991 Case 45 - false
   * 2 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 227 LOOKUPSWITCH L991 Default-Case - true
   * 3 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 226 LOOKUPSWITCH L991 Case 46 - false
   */
  @Test
  public void test8()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.isIdentifierChar('H');
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 226 LOOKUPSWITCH L991 Case 46 - true
   * 2 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 225 LOOKUPSWITCH L991 Case 45 - false
   * 3 com.werken.saxpath.XPathLexer.isIdentifierChar(C)Z: I3 Branch 227 LOOKUPSWITCH L991 Default-Case - false
   */
  @Test
  public void test9()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.isIdentifierChar('.');
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 com.werken.saxpath.XPathLexer.isIdentifierStartChar(C)Z: I4 Branch 228 IF_ICMPEQ L1003 - true
   */
  @Test
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('_');
      assertEquals(true, boolean0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 com.werken.saxpath.XPathLexer.isIdentifierStartChar(C)Z: I4 Branch 228 IF_ICMPEQ L1003 - false
   * 2 com.werken.saxpath.XPathLexer.isIdentifierStartChar(C)Z: I7 Branch 229 IFEQ L1003 - false
   */
  @Test
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('u');
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 com.werken.saxpath.XPathLexer.isIdentifierStartChar(C)Z: I7 Branch 229 IFEQ L1003 - true
   * 2 com.werken.saxpath.XPathLexer.<init>()V: root-Branch
   * 3 com.werken.saxpath.XPathLexer.isIdentifierStartChar(C)Z: I4 Branch 228 IF_ICMPEQ L1003 - false
   */
  @Test
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      boolean boolean0 = xPathLexer0.isIdentifierStartChar(']');
      assertEquals(false, boolean0);
  }
}
