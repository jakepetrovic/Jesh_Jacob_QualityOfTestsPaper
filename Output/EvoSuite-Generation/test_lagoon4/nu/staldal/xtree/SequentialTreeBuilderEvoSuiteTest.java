/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import nu.staldal.xtree.Element;
import nu.staldal.xtree.ElementHandler;
import nu.staldal.xtree.SequentialTreeBuilder;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

public class SequentialTreeBuilderEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.parseXMLSequential(Lorg/xml/sax/InputSource;ZLnu/staldal/xtree/ElementHandler;)Lnu/staldal/xtree/Element;: root-Branch
   * 2 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;)V: root-Branch
   * 3 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;Ljava/net/URL;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      InputSource inputSource0 = new InputSource();
      try {
        SequentialTreeBuilder.parseXMLSequential(inputSource0, true, (ElementHandler) null);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.warning(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.warning((SAXParseException) null);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startDocument()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.startDocument();
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endDocument()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.endDocument();
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.fatalError(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      // Undeclared exception!
      try {
        sequentialTreeBuilder0.fatalError((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.error(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      // Undeclared exception!
      try {
        sequentialTreeBuilder0.error((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endPrefixMapping(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.endPrefixMapping("$f){NR");
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I20 Branch 3 IFNULL L192 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - false
   * 4 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I49 Branch 4 IFNULL L198 - true
   * 5 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I63 Branch 5 IF_ICMPGE L199 - true
   * 6 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - true
   */
  @Test
  public void test7()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      LocatorImpl locatorImpl0 = new LocatorImpl();
      sequentialTreeBuilder0.setDocumentLocator((Locator) locatorImpl0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("", "", "", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.getRootElement()Lnu/staldal/xtree/Element;: I4 Branch 1 IFNONNULL L155 - true
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I20 Branch 3 IFNULL L192 - true
   * 4 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I49 Branch 4 IFNULL L198 - true
   * 5 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I63 Branch 5 IF_ICMPGE L199 - true
   * 6 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - true
   */
  @Test
  public void test8()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("Nw#?x+'C<", "Nw#?x+'C<", "Nw#?x+'C<", (Attributes) attributesImpl0);
      Element element0 = sequentialTreeBuilder0.getRootElement();
      assertNull(element0.getSystemId());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.getRootElement()Lnu/staldal/xtree/Element;: I4 Branch 1 IFNONNULL L155 - false
   */
  @Test
  public void test9()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      try {
        sequentialTreeBuilder0.getRootElement();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No root element
         */
      }
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 9 IFLE L236 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I18 Branch 10 IF_ICMPNE L240 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - true
   */
  @Test
  public void test10()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("25B?^P)pM`", "25B?^P)pM`", "25B?^P)pM`", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("(C~", "$f){NR", "$f){NR", (Attributes) attributesImpl0);
      // Undeclared exception!
      try {
        sequentialTreeBuilder0.endElement("(C~", "(C~", "(C~");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I63 Branch 5 IF_ICMPGE L199 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I88 Branch 6 IFLE L203 - true
   */
  @Test
  public void test11()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      attributes2Impl0.addAttribute("http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", "C;F9~>");
      sequentialTreeBuilder0.startElement("http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", (Attributes) attributes2Impl0);
      assertEquals(1, attributes2Impl0.getLength());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 11 IFNONNULL L263 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFNONNULL L265 - false
   */
  @Test
  public void test12()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.startPrefixMapping("http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", "http://xml.org/sax/features/validation", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 9 IFLE L236 - true
   */
  @Test
  public void test13()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.endElement((String) null, "http://xml.org/sax/features/namespace-prefixes", (String) null);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 11 IFNONNULL L263 - true
   */
  @Test
  public void test14()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("Nw#?x+'C<", "Nw#?x+'C<", "Nw#?x+'C<", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startPrefixMapping("Nw#?x+'C<", "zu$#9'v[GN_4");
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFNONNULL L265 - true
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 11 IFNONNULL L263 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFNONNULL L265 - false
   */
  @Test
  public void test15()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.startPrefixMapping("z:H*l<nht,;xg;u", "z:H*l<nht,;xg;u");
      sequentialTreeBuilder0.startPrefixMapping("z:H*l<nht,;xg;u", "z:H*l<nht,;xg;u");
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.characters([CII)V: I4 Branch 13 IFLE L291 - true
   */
  @Test
  public void test16()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      char[] charArray0 = new char[13];
      sequentialTreeBuilder0.characters(charArray0, (int) '\u0000', (int) '\u0000');
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.characters([CII)V: I4 Branch 13 IFLE L291 - false
   */
  @Test
  public void test17()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("S&j\"S mOrZNg]", "S&j\"S mOrZNg]", "", (Attributes) attributes2Impl0);
      sequentialTreeBuilder0.startElement("S&j\"S mOrZNg]", "S&j\"S mOrZNg]", "S&j\"S mOrZNg]", (Attributes) attributes2Impl0);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try {
        sequentialTreeBuilder0.characters(charArray0, (int) 'o', (-1839));
        fail("Expecting exception: NegativeArraySizeException");
      } catch(NegativeArraySizeException e) {
      }
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.ignorableWhitespace([CII)V: I4 Branch 14 IFLE L298 - true
   */
  @Test
  public void test18()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      char[] charArray0 = new char[9];
      sequentialTreeBuilder0.ignorableWhitespace(charArray0, (-1451), (-577));
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.ignorableWhitespace([CII)V: I4 Branch 14 IFLE L298 - false
   */
  @Test
  public void test19()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("S&j\"S mOrZNg]", "S&j\"S mOrZNg]", "", (Attributes) attributes2Impl0);
      sequentialTreeBuilder0.startElement("S&j\"S mOrZNg]", "S&j\"S mOrZNg]", "S&j\"S mOrZNg]", (Attributes) attributes2Impl0);
      char[] charArray0 = new char[1];
      sequentialTreeBuilder0.ignorableWhitespace(charArray0, (int) 'o', (-1839));
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 15 IFLE L305 - true
   */
  @Test
  public void test20()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.processingInstruction(" J18%", "25B?^P)pM`");
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 15 IFLE L305 - false
   */
  @Test
  public void test21()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("Nw#?x+'C<", "Nw#?x+'C<", "Nw#?x+'C<", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("zu$#9'v[GN_4", "zu$#9'v[GN_4", "zu$#9'v[GN_4", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.processingInstruction("zu$#9'v[GN_4", "zu$#9'v[GN_4");
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.skippedEntity(Ljava/lang/String;)V: I4 Branch 16 IFLE L312 - true
   * 2 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;)V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.skippedEntity("25B?^P)pM`");
  }

  //Test case number: 23
  /*
   * 8 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.skippedEntity(Ljava/lang/String;)V: I4 Branch 16 IFLE L312 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;Ljava/net/URL;)V: root-Branch
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - true
   * 4 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - false
   * 5 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I20 Branch 3 IFNULL L192 - true
   * 6 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I49 Branch 4 IFNULL L198 - true
   * 7 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I63 Branch 5 IF_ICMPGE L199 - true
   * 8 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - true
   */
  @Test
  public void test23()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null, (URL) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("S&j\"S mOrZNg]", "S&j\"S mOrZNg]", "", (Attributes) attributes2Impl0);
      sequentialTreeBuilder0.startElement("S&j\"S mOrZNg]", "S&j\"S mOrZNg]", "S&j\"S mOrZNg]", (Attributes) attributes2Impl0);
      sequentialTreeBuilder0.skippedEntity((String) null);
  }
}
