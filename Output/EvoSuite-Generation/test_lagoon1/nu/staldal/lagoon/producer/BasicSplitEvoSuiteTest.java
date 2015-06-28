/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.Target;
import nu.staldal.lagoon.producer.BasicSplit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

public class BasicSplitEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.BasicSplit.run()V: root-Branch
   * 2 nu.staldal.lagoon.producer.BasicSplit.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      // Undeclared exception!
      try {
        basicSplit0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      LocatorImpl locatorImpl0 = new LocatorImpl();
      basicSplit0.setDocumentLocator((Locator) locatorImpl0);
      assertNull(basicSplit0.getEntryName());
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 nu.staldal.lagoon.producer.BasicSplit.sleepUntilInterrupted()V: root-Branch
   * 2 nu.staldal.lagoon.producer.BasicSplit.start(Lorg/xml/sax/ContentHandler;Lnu/staldal/lagoon/core/Target;)V: I19 Branch 5 IFNONNULL L104 - false
   * 3 nu.staldal.lagoon.producer.BasicSplit.start(Lorg/xml/sax/ContentHandler;Lnu/staldal/lagoon/core/Target;)V: I76 Branch 6 IFNULL L126 - false
   * 4 nu.staldal.lagoon.producer.BasicSplit.start(Lorg/xml/sax/ContentHandler;Lnu/staldal/lagoon/core/Target;)V: I82 Branch 7 IFEQ L128 - true
   */
  @Test
  public void test2()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      try {
        basicSplit0.start((ContentHandler) xMLReaderAdapter0, (Target) null);
        fail("Expecting exception: SAXException");
      } catch(SAXException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.endDocument()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      // Undeclared exception!
      try {
        basicSplit0.endDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.hasBeenUpdated(J)Z: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      // Undeclared exception!
      try {
        basicSplit0.hasBeenUpdated(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.startDocument()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      basicSplit0.startDocument();
      assertEquals(0, basicSplit0.getPosition());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.init()V: I16 Branch 2 IFNONNULL L80 - false
   */
  @Test
  public void test6()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      try {
        basicSplit0.init();
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * parameter 'namespace' must be set
         */
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.BasicSplit.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 8 IFEQ L180 - true
   * 2 nu.staldal.lagoon.producer.BasicSplit.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 9 IFLE L182 - true
   */
  @Test
  public void test7()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      basicSplit0.startElement("", "", "", (Attributes) attributes2Impl0);
      assertNull(basicSplit0.getEntryName());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.BasicSplit.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 12 IFEQ L203 - true
   * 2 nu.staldal.lagoon.producer.BasicSplit.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I17 Branch 13 IFLE L204 - true
   */
  @Test
  public void test8()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      basicSplit0.endElement("vQ)Pc-3#sQ#oN4", "vQ)Pc-3#sQ#oN4", "NB=~U$YjyC[0uqt");
      assertNull(basicSplit0.getEntryName());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 16 IFEQ L219 - true
   */
  @Test
  public void test9()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      // Undeclared exception!
      try {
        basicSplit0.startPrefixMapping(":", ":");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.endPrefixMapping(Ljava/lang/String;)V: I4 Branch 17 IFEQ L230 - true
   */
  @Test
  public void test10()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      // Undeclared exception!
      try {
        basicSplit0.endPrefixMapping("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.characters([CII)V: I4 Branch 18 IFEQ L240 - true
   */
  @Test
  public void test11()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      char[] charArray0 = new char[19];
      basicSplit0.characters(charArray0, (int) '\u0000', (int) '}');
      assertEquals(0, basicSplit0.getPosition());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.ignorableWhitespace([CII)V: I4 Branch 19 IFEQ L246 - true
   */
  @Test
  public void test12()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      char[] charArray0 = new char[19];
      basicSplit0.ignorableWhitespace(charArray0, 45, 45);
      assertEquals(0, basicSplit0.getPosition());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.BasicSplit.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 20 IFEQ L252 - true
   */
  @Test
  public void test13()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      basicSplit0.processingInstruction("Jf_Zw6gg9", "Jf_Zw6gg9");
      assertEquals(0, basicSplit0.getPosition());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.BasicSplit.skippedEntity(Ljava/lang/String;)V: I4 Branch 21 IFEQ L258 - true
   * 2 nu.staldal.lagoon.producer.BasicSplit.<init>()V: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      BasicSplit basicSplit0 = new BasicSplit();
      basicSplit0.skippedEntity("NB=~U$YjyC[0uqt");
      assertEquals(0, basicSplit0.getPosition());
  }
}
