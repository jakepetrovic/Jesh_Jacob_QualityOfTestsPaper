/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.EmptyStackException;
import nu.staldal.xtree.Element;
import nu.staldal.xtree.TreeBuilder;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

public class TreeBuilderEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.ignorableWhitespace([CII)V: root-Branch
   * 2 nu.staldal.xtree.TreeBuilder.<init>(Ljava/net/URL;)V: root-Branch
   * 3 nu.staldal.xtree.TreeBuilder.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      char[] charArray0 = new char[6];
      treeBuilder0.ignorableWhitespace(charArray0, (int) '\u0000', (int) 'r');
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.reset()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      treeBuilder0.reset();
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.startDocument()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder((URL) null);
      treeBuilder0.startDocument();
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.endPrefixMapping(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      treeBuilder0.endPrefixMapping("");
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.skippedEntity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      treeBuilder0.skippedEntity("+zfjgkc*");
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.fatalError(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      // Undeclared exception!
      try {
        treeBuilder0.fatalError((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.parseXML(Lorg/xml/sax/InputSource;Z)Lnu/staldal/xtree/Element;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      InputSource inputSource0 = new InputSource();
      try {
        TreeBuilder.parseXML(inputSource0, true);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.warning(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      treeBuilder0.warning((SAXParseException) null);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.error(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder((URL) null);
      // Undeclared exception!
      try {
        treeBuilder0.error((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.endDocument()V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      treeBuilder0.endDocument();
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.fileToInputSource(Ljava/io/File;)Lorg/xml/sax/InputSource;: I19 Branch 1 IF_ICMPNE L90 - false
   * 2 nu.staldal.xtree.TreeBuilder.fileToInputSource(Ljava/io/File;)Lorg/xml/sax/InputSource;: I34 Branch 2 IFNE L93 - false
   */
  @Test
  public void test10()  throws Throwable  {
      File file0 = new File("+zfjgkc*", "+zfjgkc*");
      try {
        TreeBuilder.fileToInputSource(file0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * file:///home/jeshkracht/+zfjgkc*_/+zfjgkc*
         */
      }
  }

  //Test case number: 11
  /*
   * 9 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.getTree()Lnu/staldal/xtree/Element;: I5 Branch 3 IFNE L171 - true
   * 2 nu.staldal.xtree.TreeBuilder.getTree()Lnu/staldal/xtree/Element;: I17 Branch 4 IFNONNULL L174 - true
   * 3 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 7 IFNULL L239 - true
   * 4 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I44 Branch 8 IFNONNULL L245 - false
   * 5 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I54 Branch 9 IFNULL L248 - true
   * 6 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I81 Branch 10 IF_ICMPGE L256 - true
   * 7 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I149 Branch 13 IFNULL L275 - true
   * 8 nu.staldal.xtree.TreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 9 nu.staldal.xtree.TreeBuilder.addCharacters()V: I4 Branch 5 IFNULL L196 - true
   */
  @Test
  public void test11()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      treeBuilder0.startElement("", "", "", (Attributes) attributesImpl0);
      treeBuilder0.endElement("", "", "");
      Element element0 = treeBuilder0.getTree();
      assertEquals("", element0.getNamespaceURI());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.getTree()Lnu/staldal/xtree/Element;: I5 Branch 3 IFNE L171 - false
   */
  @Test
  public void test12()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      treeBuilder0.startElement("http://xml.org/sax/features/validation", "J`", (String) null, (Attributes) attributesImpl0);
      try {
        treeBuilder0.getTree();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * All elements are not yet ended
         */
      }
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.getTree()Lnu/staldal/xtree/Element;: I17 Branch 4 IFNONNULL L174 - false
   * 2 nu.staldal.xtree.TreeBuilder.getTree()Lnu/staldal/xtree/Element;: I5 Branch 3 IFNE L171 - true
   */
  @Test
  public void test13()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      try {
        treeBuilder0.getTree();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No root element
         */
      }
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.addCharacters()V: I4 Branch 5 IFNULL L196 - false
   * 2 nu.staldal.xtree.TreeBuilder.addCharacters()V: I8 Branch 6 IFLE L196 - true
   * 3 nu.staldal.xtree.TreeBuilder.characters([CII)V: I4 Branch 15 IFNONNULL L326 - false
   * 4 nu.staldal.xtree.TreeBuilder.characters([CII)V: I26 Branch 16 IFNULL L332 - true
   */
  @Test
  public void test14()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      char[] charArray0 = new char[6];
      treeBuilder0.characters(charArray0, 0, 0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      treeBuilder0.startElement("+zfjgkc*", "+zfjgkc*", "+zfjgkc*", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.addCharacters()V: I8 Branch 6 IFLE L196 - false
   * 2 nu.staldal.xtree.TreeBuilder.addCharacters()V: I4 Branch 5 IFNULL L196 - false
   */
  @Test
  public void test15()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      char[] charArray0 = new char[4];
      treeBuilder0.characters(charArray0, 0, 1);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      // Undeclared exception!
      try {
        treeBuilder0.startElement("zsfU,x#5]`Hl", "@{J{/ ;Ku^jK-R6", "@{J{/ ;Ku^jK-R6", (Attributes) attributesImpl0);
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 17 IFNULL L355 - false
   * 2 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 7 IFNULL L239 - false
   * 3 nu.staldal.xtree.TreeBuilder.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      LocatorImpl locatorImpl0 = new LocatorImpl();
      treeBuilder0.setDocumentLocator((Locator) locatorImpl0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      treeBuilder0.startElement("{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"", (Attributes) attributes2Impl0);
      treeBuilder0.processingInstruction("{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"");
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I44 Branch 8 IFNONNULL L245 - true
   */
  @Test
  public void test17()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      treeBuilder0.startElement("{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"", (Attributes) attributes2Impl0);
      treeBuilder0.startElement("{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"", "{%fl!y{~E2Lt\"", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I54 Branch 9 IFNULL L248 - false
   */
  @Test
  public void test18()  throws Throwable  {
      URL uRL0 = new URL((URL) null, "http://xml.org/sax/features/validation");
      TreeBuilder treeBuilder0 = new TreeBuilder(uRL0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      treeBuilder0.startElement("http://xml.org/sax/features/validation", "J`", (String) null, (Attributes) attributesImpl0);
      assertEquals(0, attributesImpl0.getLength());
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I149 Branch 13 IFNULL L275 - false
   * 2 nu.staldal.xtree.TreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 14 IFNONNULL L305 - false
   */
  @Test
  public void test19()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      treeBuilder0.startPrefixMapping("+zfjgkc*", "+zfjgkc*");
      treeBuilder0.startElement("+zfjgkc*", "+zfjgkc*", "+zfjgkc*", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 14 IFNONNULL L305 - true
   * 2 nu.staldal.xtree.TreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 14 IFNONNULL L305 - false
   */
  @Test
  public void test20()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      treeBuilder0.startPrefixMapping("J`", "J`");
      treeBuilder0.startPrefixMapping("J`", "J`");
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.characters([CII)V: I4 Branch 15 IFNONNULL L326 - true
   * 2 nu.staldal.xtree.TreeBuilder.characters([CII)V: I26 Branch 16 IFNULL L332 - true
   */
  @Test
  public void test21()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      char[] charArray0 = new char[4];
      treeBuilder0.characters(charArray0, 0, 0);
      treeBuilder0.characters(charArray0, 0, 1);
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.characters([CII)V: I26 Branch 16 IFNULL L332 - false
   * 2 nu.staldal.xtree.TreeBuilder.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   * 3 nu.staldal.xtree.TreeBuilder.characters([CII)V: I4 Branch 15 IFNONNULL L326 - false
   */
  @Test
  public void test22()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      char[] charArray0 = new char[4];
      Element element0 = new Element("@{J{/ ;Ku^jK-R6", "zsfU,x#5]`Hl");
      treeBuilder0.setDocumentLocator((Locator) element0);
      treeBuilder0.characters(charArray0, 0, 1);
  }

  //Test case number: 23
  /*
   * 9 covered goals:
   * 1 nu.staldal.xtree.TreeBuilder.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 17 IFNULL L355 - true
   * 2 nu.staldal.xtree.TreeBuilder.<init>(Ljava/net/URL;)V: root-Branch
   * 3 nu.staldal.xtree.TreeBuilder.<init>()V: root-Branch
   * 4 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 7 IFNULL L239 - true
   * 5 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I44 Branch 8 IFNONNULL L245 - false
   * 6 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I54 Branch 9 IFNULL L248 - true
   * 7 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I81 Branch 10 IF_ICMPGE L256 - true
   * 8 nu.staldal.xtree.TreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I149 Branch 13 IFNULL L275 - true
   * 9 nu.staldal.xtree.TreeBuilder.addCharacters()V: I4 Branch 5 IFNULL L196 - true
   */
  @Test
  public void test23()  throws Throwable  {
      TreeBuilder treeBuilder0 = new TreeBuilder();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      treeBuilder0.startElement("", "", "", (Attributes) attributes2Impl0);
      treeBuilder0.processingInstruction("", "");
  }
}
