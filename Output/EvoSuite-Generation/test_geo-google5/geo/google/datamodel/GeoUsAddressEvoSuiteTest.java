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
   * 2 geo.google.datamodel.GeoUsAddress.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgeo/google/datamodel/GeoCoordinate;Lgeo/google/datamodel/GeoAddressAccuracy;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.POST_CODE_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "", (GeoCoordinate) null, geoAddressAccuracy0);
      geoUsAddress0.setAccuracy(geoAddressAccuracy0);
      assertEquals("", geoUsAddress0.getAddressLine2());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoUsAddress.setPostalCode(Ljava/lang/String;)V: root-Branch
   * 2 geo.google.datamodel.GeoUsAddress.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setPostalCode("ADDRESS_LEVEL");
      assertEquals("", geoUsAddress0.getAddressLine1());
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
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      geoUsAddress0.setCoordinate(geoCoordinate0);
      assertEquals(GeoAddressAccuracy.UNKNOWN_LOCATION, geoUsAddress0.getAccuracy());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getAddressLine1()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.TOWN_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", (GeoCoordinate) null, geoAddressAccuracy0);
      String string0 = geoUsAddress0.getAddressLine1();
      assertEquals("ADDRESS_LEVEL", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.hashCode()I: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate((-203.86465169166019), (-364.014349606778), geoAltitude0);
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.POST_CODE_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", geoCoordinate0, geoAddressAccuracy0);
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
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.POST_CODE_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "", (GeoCoordinate) null, geoAddressAccuracy0);
      GeoCoordinate geoCoordinate0 = geoUsAddress0.getCoordinate();
      assertNull(geoCoordinate0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setState(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate((-203.86465169166019), (-364.014349606778), geoAltitude0);
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.POST_CODE_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", "UNKNOWN_LOCATION", geoCoordinate0, geoAddressAccuracy0);
      geoUsAddress0.setState("UNKNOWN_LOCATION");
      assertEquals("UNKNOWN_LOCATION", geoUsAddress0.getCounty());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCity()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.TOWN_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", (GeoCoordinate) null, geoAddressAccuracy0);
      String string0 = geoUsAddress0.getCity();
      assertEquals("ADDRESS_LEVEL", string0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCounty()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.UNKNOWN_LOCATION;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "c~rc3P3g", geoCoordinate0, geoAddressAccuracy0);
      String string0 = geoUsAddress0.getCounty();
      assertEquals(", ,  ", geoUsAddress0.toAddressLine());
      assertEquals("", geoUsAddress0.getAddressLine2());
      assertNotNull(string0);
      assertEquals("c~rc3P3g", geoUsAddress0.getCountry());
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
      geoUsAddress0.setCounty("XZQ_0rHK");
      assertEquals("", geoUsAddress0.getAddressLine2());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getState()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.UNKNOWN_LOCATION;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "c~rc3P3g", geoCoordinate0, geoAddressAccuracy0);
      String string0 = geoUsAddress0.getState();
      assertEquals("", geoUsAddress0.getCounty());
      assertNotNull(string0);
      assertEquals("c~rc3P3g", geoUsAddress0.getCountry());
      assertEquals(", ,  ", geoUsAddress0.toAddressLine());
      assertEquals("", geoUsAddress0.getAddressLine2());
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
      assertEquals("", geoUsAddress0.getCountry());
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
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.TOWN_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", (GeoCoordinate) null, geoAddressAccuracy0);
      geoUsAddress0.setAddressLine2("<mN++3O");
      assertEquals("ADDRESS_LEVEL", geoUsAddress0.getCity());
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
   * 1 geo.google.datamodel.GeoUsAddress.equals(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.UNKNOWN_LOCATION;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "c~rc3P3g", geoCoordinate0, geoAddressAccuracy0);
      // Undeclared exception!
      try {
        geoUsAddress0.equals((Object) ".p(p,XmX9(");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/EqualsBuilder
         */
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.setCity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      geoUsAddress0.setCity(",)i|`#&umHs!E$nU(.P");
      assertEquals(",)i|`#&umHs!E$nU(.P", geoUsAddress0.getCity());
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoUsAddress.getAddressLine2()Ljava/lang/String;: root-Branch
   * 2 geo.google.datamodel.GeoUsAddress.<init>()V: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      GeoUsAddress geoUsAddress0 = new GeoUsAddress();
      String string0 = geoUsAddress0.getAddressLine2();
      assertEquals("", string0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getAccuracy()Lgeo/google/datamodel/GeoAddressAccuracy;: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.TOWN_LEVEL;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", "ADDRESS_LEVEL", (GeoCoordinate) null, geoAddressAccuracy0);
      GeoAddressAccuracy geoAddressAccuracy1 = geoUsAddress0.getAccuracy();
      assertEquals("UNKNOWN_LOCATION", geoAddressAccuracy1.name());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoUsAddress.getCountry()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test20()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.UNKNOWN_LOCATION;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "c~rc3P3g", geoCoordinate0, geoAddressAccuracy0);
      String string0 = geoUsAddress0.getCountry();
      assertEquals("", geoUsAddress0.getAddressLine2());
      assertEquals("", geoUsAddress0.getCounty());
      assertNotNull(string0);
      assertEquals("c~rc3P3g", string0);
      assertEquals(", ,  ", geoUsAddress0.toAddressLine());
  }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoUsAddress.setCountry(Ljava/lang/String;)V: root-Branch
   * 2 geo.google.datamodel.GeoUsAddress.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgeo/google/datamodel/GeoCoordinate;Lgeo/google/datamodel/GeoAddressAccuracy;)V: root-Branch
   */
  @Test
  public void test21()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      GeoAddressAccuracy geoAddressAccuracy0 = GeoAddressAccuracy.UNKNOWN_LOCATION;
      GeoUsAddress geoUsAddress0 = new GeoUsAddress("", "", "", "", "", "", "c~rc3P3g", geoCoordinate0, geoAddressAccuracy0);
      assertEquals("c~rc3P3g", geoUsAddress0.getCountry());
      
      geoUsAddress0.setCountry(".p(p,XmX9(");
      assertEquals("", geoUsAddress0.getState());
  }
}
