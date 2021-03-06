/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.datamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.datamodel.GeoAddressAccuracy;
import geo.google.datamodel.GeoAltitude;
import geo.google.datamodel.GeoCoordinate;
import geo.google.datamodel.GeoUsAddress;

public class GeoUsAddressEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoUsAddress.setAccuracy(Lgeo/google/datamodel/GeoAddressAccuracy;)V: root-Branch
   * 2 geo.google.datamodel.GeoUsAddress.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.INTERSECTION_LEVEL;
      geoUsAddress0.setAccuracy(geoAddressAccuracy0);
      assertEquals(GeoAddressAccuracy.INTERSECTION_LEVEL, geoUsAddress0.getAccuracy());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setPostalCode(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setPostalCode("USp");
      assertEquals("", geoUsAddress0.getCity());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.toAddressLine()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.toAddressLine();
      assertNotNull(string0);
      assertEquals(", ,  ", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setCoordinate(Lgeo/google/datamodel/GeoCoordinate;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, (GeoAltitude) null);
      geoUsAddress0.setCoordinate(geoCoordinate0);
      assertEquals("", geoUsAddress0.getAddressLine2());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getAddressLine1()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getAddressLine1();
      assertEquals("", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.hashCode()I: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      // Undeclared exception!
      try {
        geoUsAddress0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/HashCodeBuilder
         */
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCoordinate()Lgeo/google/datamodel/GeoCoordinate;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      GeoCoordinate geoCoordinate0 = geoUsAddress0.getCoordinate();
      assertEquals((-1.0), geoCoordinate0.getLongitude(), 0.01D);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setState(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setState(";5}hh&YHxqcXJf6");
      assertEquals("", geoUsAddress0.getCity());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCity()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getCity();
      assertEquals("", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCounty()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getCounty();
      assertEquals("", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setCounty(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setCounty("");
      assertEquals(", ,  ", geoUsAddress0.toAddressLine());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getState()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getState();
      assertEquals("", string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setAddressLine1(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setAddressLine1("");
      assertEquals(GeoAddressAccuracy.UNKNOWN_LOCATION, geoUsAddress0.getAccuracy());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      // Undeclared exception!
      try {
        geoUsAddress0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/ToStringStyle
         */
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setAddressLine2(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setAddressLine2((String) null);
      assertEquals("", geoUsAddress0.getState());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getPostalCode()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getPostalCode();
      assertEquals("", string0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgeo/google/datamodel/GeoCoordinate;Lgeo/google/datamodel/GeoAddressAccuracy;)V: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude(0.0);
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 1460.4528995013773, geoAltitude0);
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.INTERSECTION_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("+", "+", "+", "+", "+", "+", "+", geoCoordinate0, geoAddressAccuracy0);
      assertEquals(GeoAddressAccuracy.UNKNOWN_LOCATION, geoUsAddress0.getAccuracy());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.equals(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      // Undeclared exception!
      try {
        geoUsAddress0.equals((Object) "");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/EqualsBuilder
         */
      }
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setCity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setCity("");
      assertEquals("", geoUsAddress0.getState());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getAddressLine2()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getAddressLine2();
      assertEquals("", string0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getAccuracy()Lgeo/google/datamodel/GeoAddressAccuracy;: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      GeoAddressAccuracy geoAddressAccuracy0 = geoUsAddress0.getAccuracy();
      assertEquals("UNKNOWN_LOCATION", geoAddressAccuracy0.toString());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCountry()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getCountry();
      assertEquals("", string0);
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoUsAddress.setCountry(Ljava/lang/String;)V: root-Branch
   * 2 geo.google.datamodel.GeoUsAddress.<init>()V: root-Branch
   */
  @Test
  public void test22()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setCountry("");
      assertEquals(", ,  ", geoUsAddress0.toAddressLine());
  }
}
