/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xmlutil;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import org.xml.sax.Attributes;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

public class DocumentHandlerAdapterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endPrefixMapping(Ljava/lang/String;)V: root-Branch
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.<init>(Lorg/xml/sax/DocumentHandler;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.endPrefixMapping(">KN<");
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.processingInstruction("", "");
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.skippedEntity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) null);
      documentHandlerAdapter0.skippedEntity("");
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startDocument()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) null);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.startDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.characters([CII)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      char[] charArray0 = new char[5];
      documentHandlerAdapter0.characters(charArray0, 1924, (-1027));
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      LocatorImpl locatorImpl0 = new LocatorImpl();
      documentHandlerAdapter0.setDocumentLocator((Locator) locatorImpl0);
      assertNull(locatorImpl0.getSystemId());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace([CII)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      char[] charArray0 = new char[8];
      documentHandlerAdapter0.ignorableWhitespace(charArray0, (-8), (int) '5');
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endDocument()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) null);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endDocument();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 2 IFNULL L109 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - false
   */
  @Test
  public void test8()  throws Throwable  {
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try {
        documentHandlerAdapter0.startElement((String) null, (String) null, (String) null, (Attributes) attributes2Impl0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 3 IFLE L109 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I38 Branch 4 IFNONNULL L114 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I42 Branch 5 IFNULL L116 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I46 Branch 6 IF_ICMPGE L116 - true
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I62 Branch 7 IFNULL L123 - true
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 2 IFNULL L109 - false
   */
  @Test
  public void test9()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try {
        documentHandlerAdapter0.startElement(">KN<", ">KN<", "", (Attributes) attributes2Impl0);
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for '>KN<'
         */
      }
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I46 Branch 6 IF_ICMPGE L116 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I95 Branch 9 IFNE L130 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I127 Branch 10 IF_ICMPGE L134 - true
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - true
   */
  @Test
  public void test10()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      documentHandlerAdapter0.startElement("", "", "", (Attributes) attributesImpl0);
      assertEquals(0, attributesImpl0.getLength());
  }

  //Test case number: 11
  /*
   * 6 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I127 Branch 10 IF_ICMPGE L134 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I137 Branch 11 IFNULL L137 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I140 Branch 12 IFNE L137 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I157 Branch 13 IFNE L141 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - false
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 3 IFLE L109 - false
   */
  @Test
  public void test11()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      attributes2Impl0.addAttribute("", ">KN<", "", "", ">KN<");
      documentHandlerAdapter0.startElement(">KN<", "", ">KN<", (Attributes) attributes2Impl0);
      assertEquals(1, attributes2Impl0.getLength());
  }

  //Test case number: 12
  /*
   * 7 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I140 Branch 12 IFNE L137 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I245 Branch 16 IFNE L161 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - true
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I62 Branch 7 IFNULL L123 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I66 Branch 8 IFLE L123 - false
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - false
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 25 IFNE L217 - false
   */
  @Test
  public void test12()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      attributes2Impl0.addAttribute("", "", ">KN<", ">KN<", "");
      documentHandlerAdapter0.startPrefixMapping("", ">KN<");
      documentHandlerAdapter0.startElement(">KN<", ">KN<", "", (Attributes) attributes2Impl0);
      assertEquals(1, attributes2Impl0.getLength());
  }

  //Test case number: 13
  /*
   * 8 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I157 Branch 13 IFNE L141 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I173 Branch 14 IFNONNULL L148 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I38 Branch 4 IFNONNULL L114 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I42 Branch 5 IFNULL L116 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I46 Branch 6 IF_ICMPGE L116 - true
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I62 Branch 7 IFNULL L123 - false
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I66 Branch 8 IFLE L123 - false
   * 8 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I95 Branch 9 IFNE L130 - false
   */
  @Test
  public void test13()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      documentHandlerAdapter0.startPrefixMapping("", ">KN<");
      attributes2Impl0.addAttribute(">KN<", "", "", "", ">KN<");
      // Undeclared exception!
      try {
        documentHandlerAdapter0.startElement(">KN<", ">KN<", "", (Attributes) attributes2Impl0);
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no attribute prefix for '>KN<'
         */
      }
  }

  //Test case number: 14
  /*
   * 14 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I173 Branch 14 IFNONNULL L148 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - true
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 2 IFNULL L109 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 3 IFLE L109 - true
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I38 Branch 4 IFNONNULL L114 - true
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I95 Branch 9 IFNE L130 - true
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I127 Branch 10 IF_ICMPGE L134 - true
   * 8 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I127 Branch 10 IF_ICMPGE L134 - false
   * 9 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I137 Branch 11 IFNULL L137 - false
   * 10 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I140 Branch 12 IFNE L137 - false
   * 11 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I157 Branch 13 IFNE L141 - true
   * 12 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - true
   * 13 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - false
   * 14 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I245 Branch 16 IFNE L161 - true
   */
  @Test
  public void test14()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      documentHandlerAdapter0.startPrefixMapping(">KN<", ">KN<");
      attributes2Impl0.addAttribute(">KN<", "", "", "", ">KN<");
      documentHandlerAdapter0.startElement(">KN<", ">KN<", "", (Attributes) attributes2Impl0);
      assertEquals(1, attributes2Impl0.getLength());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I3 Branch 17 IFNULL L182 - true
   */
  @Test
  public void test15()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement((String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 16
  /*
   * 6 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I3 Branch 17 IFNULL L182 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I6 Branch 18 IFLE L182 - true
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 19 IFNONNULL L187 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I27 Branch 20 IFNULL L189 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I31 Branch 21 IF_ICMPGE L189 - true
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - true
   */
  @Test
  public void test16()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement(">KN<", ">KN<", "");
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for '>KN<'
         */
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I6 Branch 18 IFLE L182 - false
   */
  @Test
  public void test17()  throws Throwable  {
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) null);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("`LS,o230", "`LS,o230", "`LS,o230");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 19 IFNONNULL L187 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 24 IFNE L203 - true
   */
  @Test
  public void test18()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("CDATA", "CDATA");
      documentHandlerAdapter0.endElement("CDATA", "CDATA", "");
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I31 Branch 21 IF_ICMPGE L189 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 24 IFNE L203 - false
   */
  @Test
  public void test19()  throws Throwable  {
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) null);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("", "", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 20
  /*
   * 3 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I51 Branch 23 IFLE L196 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 24 IFNE L203 - false
   */
  @Test
  public void test20()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", ">KN<");
      documentHandlerAdapter0.endElement(">KN<", ">KN<", "");
  }

  //Test case number: 21
  /*
   * 7 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I51 Branch 23 IFLE L196 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I3 Branch 17 IFNULL L182 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I6 Branch 18 IFLE L182 - true
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 19 IFNONNULL L187 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I27 Branch 20 IFNULL L189 - false
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I31 Branch 21 IF_ICMPGE L189 - true
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - false
   */
  @Test
  public void test21()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", ">KN<");
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("Z", ">KN<", "");
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for 'Z'
         */
      }
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 25 IFNE L217 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.<init>(Lorg/xml/sax/DocumentHandler;)V: root-Branch
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 25 IFNE L217 - false
   */
  @Test
  public void test22()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("CDATA", "CDATA");
      documentHandlerAdapter0.startPrefixMapping("CDATA", "xmlns:");
  }
}
