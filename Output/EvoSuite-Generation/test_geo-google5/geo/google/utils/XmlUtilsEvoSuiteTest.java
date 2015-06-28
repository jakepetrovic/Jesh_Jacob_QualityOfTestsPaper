/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.utils.XmlUtils;
import java.io.IOException;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XmlUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 geo.google.utils.XmlUtils.parse(Ljava/lang/String;)Lorg/w3c/dom/Document;: root-Branch
   * 2 geo.google.utils.XmlUtils.stringToInputSource(Ljava/lang/String;)Lorg/xml/sax/InputSource;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      try {
        XmlUtils.parse("");
        fail("Expecting exception: SAXParseException");
      } catch(SAXParseException e) {
        /*
         * Premature end of file.
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 geo.google.utils.XmlUtils.newXPath()Ljavax/xml/xpath/XPath;: root-Branch
   * 2 geo.google.utils.XmlUtils.selectValue(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      String string0 = XmlUtils.selectValue((Node) iIOMetadataNode0, "H");
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 geo.google.utils.XmlUtils.selectNode(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Node;: root-Branch
   * 2 geo.google.utils.XmlUtils.newXPath()Ljavax/xml/xpath/XPath;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = XmlUtils.selectNode((Node) iIOMetadataNode0, "H");
      assertNull(node0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 geo.google.utils.XmlUtils.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      XmlUtils xmlUtils0 = new XmlUtils();
      assertNotNull(xmlUtils0);
  }
}
