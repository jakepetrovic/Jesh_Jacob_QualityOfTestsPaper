/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import java.io.OutputStream;
import javax.activation.DataSource;
import nu.staldal.xtree.XTreeXMLDataContentHandler;

public class XTreeXMLDataContentHandlerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.XTreeXMLDataContentHandler.getContent(Ljavax/activation/DataSource;)Ljava/lang/Object;: root-Branch
   * 2 nu.staldal.xtree.XTreeXMLDataContentHandler.<init>()V: root-Branch
   * 3 nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(Ljava/awt/datatransfer/DataFlavor;Ljavax/activation/DataSource;)Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      // Undeclared exception!
      try {
        xTreeXMLDataContentHandler0.getContent((DataSource) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferDataFlavors()[Ljava/awt/datatransfer/DataFlavor;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      DataFlavor[] dataFlavorArray0 = xTreeXMLDataContentHandler0.getTransferDataFlavors();
      assertNotNull(dataFlavorArray0);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 nu.staldal.xtree.XTreeXMLDataContentHandler.writeTo(Ljava/lang/Object;Ljava/lang/String;Ljava/io/OutputStream;)V: I37 Branch 1 IFNONNULL L123 - false
   * 2 nu.staldal.xtree.XTreeXMLDataContentHandler.writeTo(Ljava/lang/Object;Ljava/lang/String;Ljava/io/OutputStream;)V: I41 Branch 2 IFLE L124 - true
   * 3 nu.staldal.xtree.XTreeXMLDataContentHandler.writeTo(Ljava/lang/Object;Ljava/lang/String;Ljava/io/OutputStream;)V: I53 Branch 3 IFEQ L127 - false
   * 4 nu.staldal.xtree.XTreeXMLDataContentHandler.writeTo(Ljava/lang/Object;Ljava/lang/String;Ljava/io/OutputStream;)V: I57 Branch 4 IFNE L127 - true
   * 5 nu.staldal.xtree.XTreeXMLDataContentHandler.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XTreeXMLDataContentHandler xTreeXMLDataContentHandler0 = new XTreeXMLDataContentHandler();
      try {
        xTreeXMLDataContentHandler0.writeTo((Object) "application/x-java-serialized-object", "application/x-java-serialized-object", (OutputStream) null);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * org.xml.sax.SAXException: setResult() must be called prior to startDocument().
         */
      }
  }
}
