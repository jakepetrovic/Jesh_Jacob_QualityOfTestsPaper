/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.mapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.google.earth.kml._2.AltitudeModeType;
import com.google.earth.kml._2.PointType;
import geo.google.GeoException;
import geo.google.datamodel.GeoCoordinate;
import geo.google.mapping.PointToCoordinateFunctor;

public class PointToCoordinateFunctorEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I18 Branch 1 IFNULL L25 - true
   * 2 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I40 Branch 2 IFNULL L30 - true
   * 3 geo.google.mapping.PointToCoordinateFunctor.getInstance()Lgeo/google/mapping/PointToCoordinateFunctor;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PointType pointType0 = new PointType();
      PointToCoordinateFunctor pointToCoordinateFunctor0 = PointToCoordinateFunctor.getInstance();
      GeoCoordinate geoCoordinate0 = pointToCoordinateFunctor0.execute(pointType0);
      assertEquals((-1.0), geoCoordinate0.getLatitude(), 0.01D);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I18 Branch 1 IFNULL L25 - false
   * 2 geo.google.mapping.PointToCoordinateFunctor.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.setCoordinates("L");
      PointToCoordinateFunctor pointToCoordinateFunctor0 = new PointToCoordinateFunctor();
      try {
        pointToCoordinateFunctor0.execute(pointType0);
        fail("Expecting exception: GeoException");
      } catch(GeoException e) {
        /*
         * Standardizer received unknown value: L
         */
      }
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I40 Branch 2 IFNULL L30 - false
   * 2 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 3 TABLESWITCH L31 Case 1 - false
   * 3 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 4 TABLESWITCH L31 Case 2 - true
   * 4 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 5 TABLESWITCH L31 Case 3 - false
   * 5 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 6 TABLESWITCH L31 Default-Case - false
   */
  @Test
  public void test2()  throws Throwable  {
      PointType pointType0 = new PointType();
      AltitudeModeType altitudeModeType0 = AltitudeModeType.RELATIVE_TO_GROUND;
      pointType0.setAltitudeMode(altitudeModeType0);
      PointToCoordinateFunctor pointToCoordinateFunctor0 = PointToCoordinateFunctor.getInstance();
      GeoCoordinate geoCoordinate0 = pointToCoordinateFunctor0.execute(pointType0);
      assertEquals((-1.0), geoCoordinate0.getLatitude(), 0.01D);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 3 TABLESWITCH L31 Case 1 - true
   * 2 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 4 TABLESWITCH L31 Case 2 - false
   * 3 geo.google.mapping.PointToCoordinateFunctor.<init>()V: root-Branch
   * 4 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 5 TABLESWITCH L31 Case 3 - false
   */
  @Test
  public void test3()  throws Throwable  {
      PointType pointType0 = new PointType();
      PointToCoordinateFunctor pointToCoordinateFunctor0 = new PointToCoordinateFunctor();
      AltitudeModeType altitudeModeType0 = AltitudeModeType.CLAMP_TO_GROUND;
      pointType0.setAltitudeMode(altitudeModeType0);
      GeoCoordinate geoCoordinate0 = pointToCoordinateFunctor0.execute(pointType0);
      assertEquals((-1.0), geoCoordinate0.getLatitude(), 0.01D);
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * 1 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 5 TABLESWITCH L31 Case 3 - true
   * 2 geo.google.mapping.PointToCoordinateFunctor.getInstance()Lgeo/google/mapping/PointToCoordinateFunctor;: root-Branch
   * 3 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I18 Branch 1 IFNULL L25 - true
   * 4 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I40 Branch 2 IFNULL L30 - false
   * 5 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 3 TABLESWITCH L31 Case 1 - false
   * 6 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 4 TABLESWITCH L31 Case 2 - false
   * 7 geo.google.mapping.PointToCoordinateFunctor.execute(Lcom/google/earth/kml/_2/PointType;)Lgeo/google/datamodel/GeoCoordinate;: I47 Branch 6 TABLESWITCH L31 Default-Case - false
   */
  @Test
  public void test4()  throws Throwable  {
      PointType pointType0 = new PointType();
      PointToCoordinateFunctor pointToCoordinateFunctor0 = PointToCoordinateFunctor.getInstance();
      AltitudeModeType altitudeModeType0 = AltitudeModeType.ABSOLUTE;
      pointType0.setAltitudeMode(altitudeModeType0);
      GeoCoordinate geoCoordinate0 = pointToCoordinateFunctor0.execute(pointType0);
      assertEquals((-1.0), geoCoordinate0.getLongitude(), 0.01D);
  }
}
