/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.producer.IslandSplit;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.LocatorImpl;

public class IslandSplitEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.IslandSplit.characters([CII)V: root-Branch
   * 2 nu.staldal.lagoon.producer.IslandSplit.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      char[] charArray0 = new char[10];
      // Undeclared exception!
      try {
        islandSplit0.characters(charArray0, (int) '\u0000', (int) '\u0000');
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.skippedEntity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.skippedEntity("AqW- ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.endDocument()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.endDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.endPrefixMapping(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      islandSplit0.endPrefixMapping("");
      assertEquals(0, islandSplit0.getPosition());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.processingInstruction("a>(nQe^..Up", "a>(nQe^..Up");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.ignorableWhitespace([CII)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try {
        islandSplit0.ignorableWhitespace(charArray0, (int) '\u0000', (int) '\u0000');
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.startPrefixMapping("G?H", "G?H");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.hasBeenUpdated(J)Z: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.hasBeenUpdated((-1006L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.startDocument()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      // Undeclared exception!
      try {
        islandSplit0.startDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.IslandSplit.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      LocatorImpl locatorImpl0 = new LocatorImpl();
      // Undeclared exception!
      try {
        islandSplit0.setDocumentLocator((Locator) locatorImpl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 nu.staldal.lagoon.producer.IslandSplit.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I28 Branch 6 IFLE L163 - true
   * 2 nu.staldal.lagoon.producer.IslandSplit.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I41 Branch 7 IFNULL L167 - true
   * 3 nu.staldal.lagoon.producer.IslandSplit.<init>()V: root-Branch
   * 4 nu.staldal.lagoon.producer.IslandSplit.init()V: I34 Branch 1 IFNONNULL L78 - false
   * 5 nu.staldal.lagoon.producer.IslandSplit.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 5 IFNONNULL L156 - false
   */
  @Test
  public void test10()  throws Throwable  {
      IslandSplit islandSplit0 = new IslandSplit();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      islandSplit0.init();
      // Undeclared exception!
      try {
        islandSplit0.startElement("?vH0;zfCxBM", "?vH0;zfCxBM", "?vH0;zfCxBM", (Attributes) attributes2Impl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
