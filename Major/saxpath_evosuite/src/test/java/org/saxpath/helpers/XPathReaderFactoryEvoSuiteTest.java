/*
 * This file was automatically generated by EvoSuite
 */

package org.saxpath.helpers;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.werken.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.saxpath.helpers.XPathReaderFactory;

public class XPathReaderFactoryEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.saxpath.helpers.XPathReaderFactory.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XPathReaderFactory xPathReaderFactory0 = new XPathReaderFactory();
      assertNotNull(xPathReaderFactory0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 org.saxpath.helpers.XPathReaderFactory.createReader()Lorg/saxpath/XPathReader;: I26 Branch 1 IFNULL L118 - true
   * 2 org.saxpath.helpers.XPathReaderFactory.createReader()Lorg/saxpath/XPathReader;: I34 Branch 3 IFEQ L122 - false
   * 3 org.saxpath.helpers.XPathReaderFactory.createReader(Ljava/lang/String;)Lorg/saxpath/XPathReader;: I21 Branch 5 IFNE L171 - true
   * 4 org.saxpath.helpers.XPathReaderFactory.createReader(Ljava/lang/String;)Lorg/saxpath/XPathReader;: I86 Branch 6 IFNONNULL L194 - true
   */
  @Test
  public void test1()  throws Throwable  {
      XPathReader xPathReader0 = (XPathReader)XPathReaderFactory.createReader();
      assertNotNull(xPathReader0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.saxpath.helpers.XPathReaderFactory.createReader(Ljava/lang/String;)Lorg/saxpath/XPathReader;: I21 Branch 5 IFNE L171 - false
   */
  @Test
  public void test2()  throws Throwable  {
      try {
        XPathReaderFactory.createReader("[C");
        fail("Expecting exception: SAXPathException");
      } catch(SAXPathException e) {
        /*
         * Class [[C] does not implement the org.saxpath.XPathReader interface.
         */
      }
  }
}
