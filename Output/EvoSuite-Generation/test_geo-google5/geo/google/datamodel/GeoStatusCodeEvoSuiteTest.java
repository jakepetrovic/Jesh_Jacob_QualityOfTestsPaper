/*
 * This file was automatically generated by EvoSuite
 */

package geo.google.datamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import geo.google.datamodel.GeoStatusCode;

public class GeoStatusCodeEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getCode()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.G_GEO_BAD_REQUEST;
      int int0 = geoStatusCode0.getCode();
      assertEquals(400, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getCodeName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.G_GEO_MISSING_QUERY;
      String string0 = geoStatusCode0.getCodeName();
      assertEquals("G_GEO_MISSING_QUERY", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getDescription()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.G_GEO_BAD_REQUEST;
      String string0 = geoStatusCode0.getDescription();
      assertEquals("A directions request could not be successfully parsed. (Since 2.81)", string0);
  }

  //Test case number: 3
  /*
   * 10 covered goals:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 1 LOOKUPSWITCH L39 Case 200 - true
   * 2 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 2 LOOKUPSWITCH L39 Case 400 - false
   * 3 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 3 LOOKUPSWITCH L39 Case 500 - false
   * 4 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 4 LOOKUPSWITCH L39 Case 601 - false
   * 5 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 5 LOOKUPSWITCH L39 Case 602 - false
   * 6 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 6 LOOKUPSWITCH L39 Case 603 - false
   * 7 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 7 LOOKUPSWITCH L39 Case 604 - false
   * 8 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 8 LOOKUPSWITCH L39 Case 610 - false
   * 9 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 9 LOOKUPSWITCH L39 Case 620 - false
   * 10 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 10 LOOKUPSWITCH L39 Default-Case - false
   */
  @Test
  public void test3()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(200);
      assertEquals(GeoStatusCode.G_GEO_SUCCESS, geoStatusCode0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 1 LOOKUPSWITCH L39 Case 200 - false
   * 2 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 10 LOOKUPSWITCH L39 Default-Case - true
   */
  @Test
  public void test4()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(248701670);
      assertEquals(GeoStatusCode.G_GEO_UNKOWN_STATUS, geoStatusCode0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 2 LOOKUPSWITCH L39 Case 400 - true
   */
  @Test
  public void test5()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(400);
      assertEquals(GeoStatusCode.G_GEO_BAD_REQUEST, geoStatusCode0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 3 LOOKUPSWITCH L39 Case 500 - true
   */
  @Test
  public void test6()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(500);
      assertEquals(GeoStatusCode.G_GEO_SERVER_ERROR, geoStatusCode0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 4 LOOKUPSWITCH L39 Case 601 - true
   */
  @Test
  public void test7()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(601);
      assertEquals(GeoStatusCode.G_GEO_MISSING_QUERY, geoStatusCode0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 5 LOOKUPSWITCH L39 Case 602 - true
   */
  @Test
  public void test8()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(602);
      assertEquals(GeoStatusCode.G_GEO_UNKNOWN_ADDRESS, geoStatusCode0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 6 LOOKUPSWITCH L39 Case 603 - true
   */
  @Test
  public void test9()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(603);
      assertEquals(GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS, geoStatusCode0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 7 LOOKUPSWITCH L39 Case 604 - true
   */
  @Test
  public void test10()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(604);
      assertEquals(GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS, geoStatusCode0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 8 LOOKUPSWITCH L39 Case 610 - true
   * 2 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 9 LOOKUPSWITCH L39 Case 620 - false
   */
  @Test
  public void test11()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(610);
      assertEquals(GeoStatusCode.G_GEO_BAD_KEY, geoStatusCode0);
  }

  //Test case number: 12
  /*
   * 10 covered goals:
   * 1 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 9 LOOKUPSWITCH L39 Case 620 - true
   * 2 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 1 LOOKUPSWITCH L39 Case 200 - false
   * 3 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 2 LOOKUPSWITCH L39 Case 400 - false
   * 4 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 3 LOOKUPSWITCH L39 Case 500 - false
   * 5 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 4 LOOKUPSWITCH L39 Case 601 - false
   * 6 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 5 LOOKUPSWITCH L39 Case 602 - false
   * 7 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 6 LOOKUPSWITCH L39 Case 603 - false
   * 8 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 7 LOOKUPSWITCH L39 Case 604 - false
   * 9 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 8 LOOKUPSWITCH L39 Case 610 - false
   * 10 geo.google.datamodel.GeoStatusCode.getStatusCode(I)Lgeo/google/datamodel/GeoStatusCode;: I3 Branch 10 LOOKUPSWITCH L39 Default-Case - false
   */
  @Test
  public void test12()  throws Throwable  {
      GeoStatusCode geoStatusCode0 = GeoStatusCode.getStatusCode(620);
      assertEquals(GeoStatusCode.G_GEO_TOO_MANY_QUERIES, geoStatusCode0);
  }
}
