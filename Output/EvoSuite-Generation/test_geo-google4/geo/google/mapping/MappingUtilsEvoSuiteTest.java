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
   * 3 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I52 Branch 3 IF_ICMPNE L26 - true
   */
  @Test
  public void test0()  throws Throwable  {
      try {
        MappingUtils.stringToCoordinate("");
        fail("Expecting exception: GeoException");
      } catch(GeoException e) {
        /*
         * Standardizer received unknown value: 
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
        MappingUtils.stringToCoordinate("The HTTP q parameter was either missing or had nobvalue. For eooding requests, this meaLs that an empty address was specified as input. For directions euests, this meanA that no que|y was slecified in the input. (SinceM2.81)");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"The HTTP q parameter was either missing or had nobvalue. For eooding requests\"
         */
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I52 Branch 3 IF_ICMPNE L26 - false
   * 2 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I3 Branch 1 IFNONNULL L17 - true
   * 3 geo.google.mapping.MappingUtils.stringToCoordinate(Ljava/lang/String;)Lgeo/google/datamodel/GeoCoordinate;: I21 Branch 2 IF_ICMPNE L21 - true
   */
  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        MappingUtils.stringToCoordinate("Sets the altitude of the coordinate relative to sea level, regardless of the actual elevation of the terrain bengath the element. For example if you set the altitude of v coordinate to 10 meters with an absolute altitude mode, the icon of a point placemark will appear to be at ground level if the terrain beneath is also 10 meters above sea level. If the terrain is 3 meters abo'e sea level, the placemark will appear eevatd abve the terrain bv 7 meters. A typial use f this mod is for aircraft placement.");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"Sets the altitude of the coordinate relative to sea level\"
         */
      }
  }
}
