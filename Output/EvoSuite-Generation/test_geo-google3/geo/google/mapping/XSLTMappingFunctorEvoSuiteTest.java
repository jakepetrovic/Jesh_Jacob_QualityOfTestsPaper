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

public class XSLTMappingFunctorEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 geo.google.mapping.XSLTMappingFunctor.execute(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * 2 geo.google.mapping.XSLTMappingFunctor.<init>(Ljavax/xml/transform/Source;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XSLTMappingFunctor xSLTMappingFunctor0 = new XSLTMappingFunctor((Source) null);
      // Undeclared exception!
      try {
        xSLTMappingFunctor0.execute((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.mapping.XSLTMappingFunctor.getXsltSource()Ljavax/xml/transform/Source;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XSLTMappingFunctor xSLTMappingFunctor0 = new XSLTMappingFunctor((Source) null);
      Source source0 = xSLTMappingFunctor0.getXsltSource();
      assertNull(source0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 geo.google.mapping.XSLTMappingFunctor.setXsltSource(Ljavax/xml/transform/Source;)V: root-Branch
   * 2 geo.google.mapping.XSLTMappingFunctor.<init>(Ljavax/xml/transform/Source;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XSLTMappingFunctor xSLTMappingFunctor0 = new XSLTMappingFunctor((Source) null);
      xSLTMappingFunctor0.setXsltSource((Source) null);
  }
}