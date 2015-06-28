/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.mapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.GeoException;
import geo.google.mapping.XmlToAddressFunctor;

public class XmlToAddressFunctorEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 geo.google.mapping.XmlToAddressFunctor.getUnmarshaller()Ljavax/xml/bind/Unmarshaller;: I3 Branch 6 IFNONNULL L74 - true
   * 2 geo.google.mapping.XmlToAddressFunctor.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XmlToAddressFunctor xmlToAddressFunctor0 = new XmlToAddressFunctor();
      // Undeclared exception!
      try {
        xmlToAddressFunctor0.execute("The GDirections object could not compute directions between the points mentioned in the query. This is usually because there is no route available between the two points, or because we do not have data for routing in that region. (Since 2.81)");
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Unable to parse xml string using JAXB
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.mapping.XmlToAddressFunctor.getInstance()Lgeo/google/mapping/XmlToAddressFunctor;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XmlToAddressFunctor xmlToAddressFunctor0 = XmlToAddressFunctor.getInstance();
      assertNotNull(xmlToAddressFunctor0);
  }
}