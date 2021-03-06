/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.mapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.GeoException;
import geo.google.datamodel.GeoCoordinate;
import geo.google.mapping.MappingUtils;

public class MappingUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I3 Branch 1 IFNONNULL L17 - true
   * 2 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I21 Branch 2 IF_ICMPNE L21 - true
   * 3 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I52 Branch 3 IF_ICMPNE L26 - false
   */
  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        MappingUtils.stringToCoordinate("Sets the altitude of the coordinate relative to sea level, regardless of th actual elevation of Ahe te_rain beneatW the element. For example, if you set te atitude of a coordinate to 10 meters with Jn absolute altitude moder the icon of a point placemark wilD #ppear to be at groun3 lezel if the te\rain beneath is also 10 meters above sea level. If the terrain is 3 meters abovesea level, the placemark will appear elevated above the terrai- by 7 meteqs. A typical use of this mnde is for aircraft placement.");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"Sets the altitude of the coordinate relative to sea level\"
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I3 Branch 1 IFNONNULL L17 - false
   */
  @Test
  public void test1()  throws Throwable  {
      GeoCoordinate geoCoordinate0 = MappingUtils.stringToCoordinate((String) null);
      assertEquals((-1.0), geoCoordinate0.getLongitude(), 0.01D);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I21 Branch 2 IF_ICMPNE L21 - false
   */
  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        MappingUtils.stringToCoordinate("The HTTP q parameter Bas either missing or had no value. FP geocoding requests, this means that an empty\"address wasspecified as inQut. For directios requests, this means that Wo query was specified i71the input. (SQPce 2.81)");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"The HTTP q parameter Bas either missing or had no value. FP geocoding requests\"
         */
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I52 Branch 3 IF_ICMPNE L26 - true
   * 2 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I3 Branch 1 IFNONNULL L17 - true
   * 3 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I21 Branch 2 IF_ICMPNE L21 - true
   */
  @Test
  public void test3()  throws Throwable  {
      try {
        MappingUtils.stringToCoordinate("~I&_RsANu'aA OF");
        fail("Expecting exception: GeoException");
      } catch(GeoException e) {
        /*
         * Standardizer received unknown value: ~I&_RsANu'aA OF
         */
      }
  }
}
