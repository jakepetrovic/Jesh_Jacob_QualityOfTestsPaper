/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.datamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.datamodel.GeoAltitude;

public class GeoAltitudeEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 geo.google.datamodel.GeoAltitude.<init>(DLgeo/google/datamodel/GeoAltitude$GeoAltitudeMode;)V: root-Branch
   * 2 geo.google.datamodel.GeoAltitude.getMode()Lgeo/google/datamodel/GeoAltitude$GeoAltitudeMode;: root-Branch
   * 3 geo.google.datamodel.GeoAltitude.<init>(D)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude((-1204.6095638175311));
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = geoAltitude0.getMode();
      GeoAltitude geoAltitude1 = new GeoAltitude(541.6380072001366, geoAltitude_GeoAltitudeMode0);
      assertEquals(541.6380072001366, geoAltitude1.getAltitude(), 0.01D);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.clone()Lgeo/google/datamodel/GeoAltitude;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = GeoAltitude.GeoAltitudeMode.CLAMP_TO_GROUND;
      GeoAltitude geoAltitude0 = new GeoAltitude((-1178.7079557812076), geoAltitude_GeoAltitudeMode0);
      GeoAltitude geoAltitude1 = geoAltitude0.clone();
      assertEquals((-1178.7079557812076), geoAltitude1.getAltitude(), 0.01D);
      assertEquals((-1178.7079557812076), geoAltitude0.getAltitude(), 0.01D);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.getAltitude()D: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude((-1367.6347179197903));
      double double0 = geoAltitude0.getAltitude();
      assertEquals((-1367.6347179197903), double0, 0.01D);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.setMode(Lgeo/google/datamodel/GeoAltitude$GeoAltitudeMode;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude(0.0);
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = GeoAltitude.GeoAltitudeMode.RELATIVE_TO_GROUND;
      geoAltitude0.setMode(geoAltitude_GeoAltitudeMode0);
      assertEquals(0.0, geoAltitude0.getAltitude(), 0.01D);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude(0.0);
      // Undeclared exception!
      try {
        geoAltitude0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/ToStringBuilder
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.setAltitude(D)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude((-1204.6095638175311));
      geoAltitude0.setAltitude(541.6380072001366);
      assertEquals(541.6380072001366, geoAltitude0.getAltitude(), 0.01D);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.hashCode()I: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude((-1204.6095638175311));
      // Undeclared exception!
      try {
        geoAltitude0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/HashCodeBuilder
         */
      }
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 geo.google.datamodel.GeoAltitude.equals(Ljava/lang/Object;)Z: root-Branch
   * 2 geo.google.datamodel.GeoAltitude.<init>(D)V: root-Branch
   * 3 geo.google.datamodel.GeoAltitude.<init>(DLgeo/google/datamodel/GeoAltitude$GeoAltitudeMode;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = GeoAltitude.GeoAltitudeMode.RELATIVE_TO_GROUND;
      GeoAltitude geoAltitude0 = new GeoAltitude(0.0, geoAltitude_GeoAltitudeMode0);
      Object object0 = new Object();
      // Undeclared exception!
      try {
        geoAltitude0.equals(object0);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/apache/commons/lang/builder/EqualsBuilder
         */
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude.<init>()V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      GeoAltitude geoAltitude0 = new GeoAltitude();
      assertEquals(0.0, geoAltitude0.getAltitude(), 0.01D);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude$GeoAltitudeMode.getName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = GeoAltitude.GeoAltitudeMode.CLAMP_TO_GROUND;
      String string0 = geoAltitude_GeoAltitudeMode0.getName();
      assertNotNull(string0);
      assertEquals("CLAMP_TO_GROUND", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoAltitude$GeoAltitudeMode.getDescription(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      GeoAltitude.GeoAltitudeMode geoAltitude_GeoAltitudeMode0 = GeoAltitude.GeoAltitudeMode.CLAMP_TO_GROUND;
      String string0 = geoAltitude_GeoAltitudeMode0.getDescription("CLAMP_TO_GROUND");
      assertEquals("(default) Indicates to ignore an altitude specification", string0);
  }
}
