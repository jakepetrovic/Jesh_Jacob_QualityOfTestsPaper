/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerImpl;
import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import net.sf.xisemele.api.Attribute;
import net.sf.xisemele.api.Element;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.Reader;
import net.sf.xisemele.api.Value;
import net.sf.xisemele.api.ValueList;
import net.sf.xisemele.exception.XisemeleIOException;
import net.sf.xisemele.impl.FactoryImpl;
import net.sf.xisemele.impl.FormatterProvider;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class FactoryImplEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = false; 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
  } 

  @Before 
  public void initTestCase(){ 
  } 

  @After 
  public void doneWithTestCase(){ 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createStringWriter()Ljava/io/StringWriter;: root-Branch
   * 2 net.sf.xisemele.impl.FactoryImpl.<init>(Lnet/sf/xisemele/impl/FormatterProvider;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      StringWriter stringWriter0 = factoryImpl0.createStringWriter();
      assertEquals("", stringWriter0.toString());
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createEditor(Lorg/w3c/dom/Document;)Lnet/sf/xisemele/api/Editor;: root-Branch
   * 2 net.sf.xisemele.impl.FactoryImpl.createResult(Lorg/w3c/dom/Document;)Lnet/sf/xisemele/api/Result;: root-Branch
   * 3 net.sf.xisemele.impl.FactoryImpl.createOperations()Lnet/sf/xisemele/impl/Operations;: root-Branch
   * 4 net.sf.xisemele.impl.FactoryImpl.createWithinContext()Lnet/sf/xisemele/impl/WithinContext;: root-Branch
   * 5 net.sf.xisemele.impl.FactoryImpl.createValidations()Lnet/sf/xisemele/impl/Validations;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      // Undeclared exception!
      try {
        factoryImpl0.createEditor((Document) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createStreamResult(Ljava/io/Writer;)Ljavax/xml/transform/stream/StreamResult;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(0);
      StreamResult streamResult0 = factoryImpl0.createStreamResult((Writer) charArrayWriter0);
      assertNull(streamResult0.getSystemId());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      DocumentBuilderImpl documentBuilderImpl0 = (DocumentBuilderImpl)factoryImpl0.createDocumentBuilder();
      assertEquals(true, documentBuilderImpl0.isNamespaceAware());
      assertEquals(false, documentBuilderImpl0.isValidating());
      assertNotNull(documentBuilderImpl0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createDOMSource(Lorg/w3c/dom/Document;)Ljavax/xml/transform/dom/DOMSource;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      DOMSource dOMSource0 = factoryImpl0.createDOMSource((Document) null);
      assertNull(dOMSource0.getSystemId());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createDateFormatter(Ljava/lang/String;)Lnet/sf/xisemele/api/Formatter;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      Formatter<Date> formatter0 = factoryImpl0.createDateFormatter("");
      assertNotNull(formatter0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createWriter(Lorg/w3c/dom/Document;Ljava/lang/String;)Lnet/sf/xisemele/api/Writer;: root-Branch
   * 2 net.sf.xisemele.impl.FactoryImpl.createResult(Lorg/w3c/dom/Document;)Lnet/sf/xisemele/api/Result;: root-Branch
   * 3 net.sf.xisemele.impl.FactoryImpl.createWithinContext()Lnet/sf/xisemele/impl/WithinContext;: root-Branch
   * 4 net.sf.xisemele.impl.FactoryImpl.createValidations()Lnet/sf/xisemele/impl/Validations;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      // Undeclared exception!
      try {
        factoryImpl0.createWriter((Document) null, "3biTO6V-$/pa7&A8");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createNullValue()Lnet/sf/xisemele/api/Value;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      Value value0 = factoryImpl0.createNullValue();
      assertNull(value0.asString());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createTransformer()Ljavax/xml/transform/Transformer;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      TransformerImpl transformerImpl0 = (TransformerImpl)factoryImpl0.createTransformer();
      assertEquals(true, transformerImpl0.useServicesMechnism());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createValue(Ljava/lang/String;)Lnet/sf/xisemele/api/Value;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      Value value0 = factoryImpl0.createValue("ePfG\u0004IRO^BbeU");
      assertNotNull(value0);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createElement(Lorg/w3c/dom/Node;)Lnet/sf/xisemele/api/Element;: root-Branch
   * 2 net.sf.xisemele.impl.FactoryImpl.createElements(Ljava/util/List;)Ljava/util/List;: I14 Branch 2 IFEQ L131 - true
   * 3 net.sf.xisemele.impl.FactoryImpl.createElements(Ljava/util/List;)Ljava/util/List;: I14 Branch 2 IFEQ L131 - false
   */
  @Test
  public void test10()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("messages");
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      linkedList0.offerFirst((Node) iIOMetadataNode0);
      List<Element> list0 = factoryImpl0.createElements((List<Node>) linkedList0);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createPrintWriter(Ljava/io/File;)Ljava/io/PrintWriter;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("|,ts<]<|w:1;]{W<Z7G", "|,ts<]<|w:1;]{W<Z7G");
          FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
          try {
            factoryImpl0.createPrintWriter(file0);
            fail("Expecting exception: XisemeleIOException");
          } catch(XisemeleIOException e) {
            /*
             * Erro ao tentar ler ou escrever o arquivo \"|,ts<]<|w:1;]{W<Z7G\"
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createReader(Lorg/w3c/dom/Document;)Lnet/sf/xisemele/api/Reader;: root-Branch
   * 2 net.sf.xisemele.impl.FactoryImpl.createOperations()Lnet/sf/xisemele/impl/Operations;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      Reader reader0 = factoryImpl0.createReader((Document) null);
      assertNotNull(reader0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createAttributes(Ljava/util/List;)Ljava/util/List;: I14 Branch 1 IFEQ L68 - false
   * 2 net.sf.xisemele.impl.FactoryImpl.createAttributes(Ljava/util/List;)Ljava/util/List;: I14 Branch 1 IFEQ L68 - true
   */
  @Test
  public void test13()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("messages");
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      linkedList0.offerFirst((Node) iIOMetadataNode0);
      List<Attribute> list0 = factoryImpl0.createAttributes((List<Node>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertEquals(1, list0.size());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.FactoryImpl.createValueList(Ljava/util/List;)Lnet/sf/xisemele/api/ValueList;: I14 Branch 3 IFEQ L202 - true
   */
  @Test
  public void test14()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      ValueList valueList0 = factoryImpl0.createValueList((List<Node>) linkedList0);
      assertNotNull(valueList0);
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.FactoryImpl.createValueList(Ljava/util/List;)Lnet/sf/xisemele/api/ValueList;: I14 Branch 3 IFEQ L202 - false
   * 2 net.sf.xisemele.impl.FactoryImpl.<init>(Lnet/sf/xisemele/impl/FormatterProvider;)V: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      FactoryImpl factoryImpl0 = new FactoryImpl((FormatterProvider) null);
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      linkedList0.add((Node) null);
      // Undeclared exception!
      try {
        factoryImpl0.createValueList((List<Node>) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
