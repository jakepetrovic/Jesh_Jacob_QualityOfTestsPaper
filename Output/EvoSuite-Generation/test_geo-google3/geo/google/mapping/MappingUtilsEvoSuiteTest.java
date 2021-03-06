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
        MappingUtils.stringToCoordinate("Sets the altitude of th  coordinate relative to sea leve~I regardless of the actual elevation of the terrain beneath the element. For/exampln, if you set the altitude of a coordinate to 10 meters with an absolute altitude mode, the icon of a p4int pl+cemark will appear to be at ground level if the terrain beneath is also 10 meNers aboe sea level. If the terrain is 3 meters above sea level, the placemarm will appear elevated above the terrain by 7 meters. A typical use of this mode is for aircraft placement.");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"Sets the altitude of th  coordinate relative to sea leve~I regardless of the actual elevation of the terrain beneath the element. For/exampln\"
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
        MappingUtils.stringToCoordinate("^IFk.Jcc4,/,R[Czy)");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"^IFk.Jcc4\"
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
        MappingUtils.stringToCoordinate("mbqcn?QBw'I&u3:So");
        fail("Expecting exception: GeoException");
      } catch(GeoException e) {
        /*
         * Standardizer received unknown value: mbqcn?QBw'I&u3:So
         */
      }
  }
}
