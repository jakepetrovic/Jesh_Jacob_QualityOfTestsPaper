/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.datamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.datamodel.GeoAltitude;
import geo.google.datamodel.GeoCoordinate;

public class GeoCoordinateEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 geo.google.datamodel.GeoCoordinate.getLongitude()D: root-Branch
   * 2 geo.google.datamodel.GeoCoordinate.<init>(DDLgeo/google/datamodel/GeoAltitude;)V: root-Branch
   * 3 geo.google.datamodel.GeoCoordinate.distanceTo(Lgeo/google/datamodel/GeoCoordinate;)D: root-Branch
   * 4 geo.google.datamodel.GeoCoordinate.getLatitude()D: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, geoAltitude0);
      geoCoordinate0.distanceTo(geoCoordinate0);
      assertEquals(0.0, geoCoordinate0.getLatitude(), 0.01D);
      assertEquals(0.0, geoCoordinate0.getLongitude(), 0.01D);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoCoordinate.setLongitude(D)V: root-Branch
   * 2 geo.google.datamodel.GeoCoordinate.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      geoCoordinate0.setLongitude(85.56414464842277);
      assertEquals(85.56414464842277, geoCoordinate0.getLongitude(), 0.01D);
      assertEquals((-1.0), geoCoordinate0.getLatitude(), 0.01D);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoCoordinate.getAltitude()Lgeo/google/datamodel/GeoAltitude;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, geoAltitude0);
      GeoAltitude geoAltitude1 = geoCoordinate0.getAltitude();
      assertEquals(0.0, geoCoordinate0.getLatitude(), 0.01D);
      assertNotNull(geoAltitude1);
      assertEquals(0.0, geoCoordinate0.getLongitude(), 0.01D);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoCoordinate.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, geoAltitude0);
      // Undeclared exception!
      try {
        geoCoordinate0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/ToStringBuilder
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoCoordinate.setLatitude(D)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, geoAltitude0);
      geoCoordinate0.setLatitude((-1.0));
      assertEquals((-1.0), geoCoordinate0.getLatitude(), 0.01D);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoCoordinate.equals(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = GeoAltitude.GeoAltitudeMode.ABSOLUTE;
      GeoAltitude geoAltitude0 = new GeoAltitude((-1.0), geoAltitude_GeoAltitudeMode0);
      GeoCoordinate geoCoordinate0 = new GeoCoordinate((-1996.4070529765602), (-1570.1120155078236), geoAltitude0);
      Object object0 = new Object();
      // Undeclared exception!
      try {
        geoCoordinate0.equals(object0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/EqualsBuilder
         */
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoCoordinate.clone()Lgeo/google/datamodel/GeoCoordinate;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, geoAltitude0);
      GeoCoordinate geoCoordinate1 = geoCoordinate0.clone();
      assertEquals(0.0, geoCoordinate0.getLongitude(), 0.01D);
      assertEquals(0.0, geoCoordinate1.getLatitude(), 0.01D);
      assertEquals(0.0, geoCoordinate1.getLongitude(), 0.01D);
      assertEquals(0.0, geoCoordinate0.getLatitude(), 0.01D);
      assertNotNull(geoCoordinate1);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoCoordinate.setAltitude(Lgeo/google/datamodel/GeoAltitude;)V: root-Branch
   * 2 geo.google.datamodel.GeoCoordinate.<init>(DDLgeo/google/datamodel/GeoAltitude;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      GeoCoordinate geoCoordinate0 = new GeoCoordinate(0.0, 0.0, geoAltitude0);
      geoCoordinate0.setAltitude(geoAltitude0);
      assertEquals(0.0, geoCoordinate0.getLatitude(), 0.01D);
      assertEquals(0.0, geoCoordinate0.getLongitude(), 0.01D);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoCoordinate.hashCode()I: root-Branch
   * 2 geo.google.datamodel.GeoCoordinate.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = new GeoCoordinate();
      // Undeclared exception!
      try {
        geoCoordinate0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/HashCodeBuilder
         */
      }
  }
}