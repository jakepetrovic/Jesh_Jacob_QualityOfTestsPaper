/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xmlutil;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import nu.staldal.xmlutil.ContentHandlerSnooper;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

public class ContentHandlerSnooperEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.skippedEntity(Ljava/lang/String;)V: root-Branch
   * 2 nu.staldal.xmlutil.ContentHandlerSnooper.<init>(Lorg/xml/sax/ContentHandler;Ljava/io/PrintWriter;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLReaderAdapter0, printWriter0);
      contentHandlerSnooper0.skippedEntity("1v#6_m vI");
      assertEquals(51, byteArrayOutputStream0.size());
      assertEquals("New ContentHandlerSnooper\nskippedEntity(1v#6_m vI)\n", byteArrayOutputStream0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) pipedOutputStream0, false);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      contentHandlerSnooper0.processingInstruction("endDocument", "endDocument");
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.ignorableWhitespace([CII)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLReaderAdapter0, printWriter0);
      char[] charArray0 = new char[4];
      contentHandlerSnooper0.ignorableWhitespace(charArray0, 290, (int) 'w');
      assertEquals("New ContentHandlerSnooper\nignorableWhitespace\n", byteArrayOutputStream0.toString());
      assertEquals(46, byteArrayOutputStream0.size());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.endDocument()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLReaderAdapter0, printWriter0);
      contentHandlerSnooper0.endDocument();
      assertEquals("New ContentHandlerSnooper\nendDocument\n", byteArrayOutputStream0.toString());
      assertEquals(38, byteArrayOutputStream0.size());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) pipedOutputStream0, false);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      LocatorImpl locatorImpl0 = new LocatorImpl();
      contentHandlerSnooper0.setDocumentLocator((Locator) locatorImpl0);
      assertEquals(true, printWriter0.checkError());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.startDocument()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLReaderAdapter0, printWriter0);
      contentHandlerSnooper0.startDocument();
      assertEquals(40, byteArrayOutputStream0.size());
      assertEquals("New ContentHandlerSnooper\nstartDocument\n", byteArrayOutputStream0.toString());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLReaderAdapter0, printWriter0);
      contentHandlerSnooper0.endElement("1v#6_m vI", "U)eOTc", "1v#6_m vI");
      assertEquals("New ContentHandlerSnooper\nendElement(1v#6_m vI,U)eOTc,1v#6_m vI)\n", byteArrayOutputStream0.toString());
      assertEquals(65, byteArrayOutputStream0.size());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) pipedOutputStream0, false);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      contentHandlerSnooper0.startElement("endDocument", "endDocument", "endDocument", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.characters([CII)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) pipedOutputStream0, false);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      char[] charArray0 = new char[3];
      contentHandlerSnooper0.characters(charArray0, 1343, 931);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I11 Branch 1 IFNE L121 - true
   */
  @Test
  public void test9()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) pipedOutputStream0, false);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      contentHandlerSnooper0.startPrefixMapping("endDocument", "endDocument");
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I11 Branch 1 IFNE L121 - false
   */
  @Test
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter((Writer) stringWriter0);
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) null, printWriter0);
      // Undeclared exception!
      try {
        contentHandlerSnooper0.startPrefixMapping("", "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.endPrefixMapping(Ljava/lang/String;)V: I11 Branch 2 IFNE L130 - true
   */
  @Test
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      contentHandlerSnooper0.endPrefixMapping("{~E5");
      assertEquals(49, byteArrayOutputStream0.size());
      assertEquals("New ContentHandlerSnooper\nendPrefixMapping({~E5)\n", byteArrayOutputStream0.toString());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.ContentHandlerSnooper.endPrefixMapping(Ljava/lang/String;)V: I11 Branch 2 IFNE L130 - false
   * 2 nu.staldal.xmlutil.ContentHandlerSnooper.<init>(Lorg/xml/sax/ContentHandler;Ljava/io/PrintWriter;)V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintWriter printWriter0 = new PrintWriter((OutputStream) byteArrayOutputStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerSnooper contentHandlerSnooper0 = new ContentHandlerSnooper((ContentHandler) xMLFilterImpl0, printWriter0);
      contentHandlerSnooper0.endPrefixMapping("");
      assertEquals(54, byteArrayOutputStream0.size());
      assertEquals("New ContentHandlerSnooper\nendPrefixMapping(<default>)\n", byteArrayOutputStream0.toString());
  }
}