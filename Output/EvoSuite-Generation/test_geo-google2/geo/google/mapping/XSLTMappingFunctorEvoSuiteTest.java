/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.mapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.GeoException;
import geo.google.mapping.XSLTMappingFunctor;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;

public class XSLTMappingFunctorEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 geo.google.mapping.XSLTMappingFunctor.setXsltSource(Ljavax/xml/transform/Source;)V: root-Branch
   * 2 geo.google.mapping.XSLTMappingFunctor.<init>(Ljavax/xml/transform/Source;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XSLTMappingFunctor xSLTMappingFunctor0 = new XSLTMappingFunctor((Source) dOMSource0);
      xSLTMappingFunctor0.setXsltSource((Source) dOMSource0);
      assertNull(dOMSource0.getSystemId());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.mapping.XSLTMappingFunctor.execute(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XSLTMappingFunctor xSLTMappingFunctor0 = new XSLTMappingFunctor((Source) sAXSource0);
      try {
        xSLTMappingFunctor0.execute("");
        fail("Expecting exception: GeoException");
      } catch(GeoException e) {
        /*
         * javax.xml.transform.TransformerConfigurationException: Source object passed to 'TransformerFactory.newTemplates()' has no contents.
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 geo.google.mapping.XSLTMappingFunctor.getXsltSource()Ljavax/xml/transform/Source;: root-Branch
   * 2 geo.google.mapping.XSLTMappingFunctor.<init>(Ljavax/xml/transform/Source;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XSLTMappingFunctor xSLTMappingFunctor0 = new XSLTMappingFunctor((Source) null);
      Source source0 = xSLTMappingFunctor0.getXsltSource();
      assertNull(source0);
  }
}
