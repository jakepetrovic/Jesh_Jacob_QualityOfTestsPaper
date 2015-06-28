/*
 * This file was automatically generated by EvoSuite
 */

package com.google.earth.kml._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.google.earth.kml._2.PlacemarkType;
import com.google.earth.kml._2.PointType;
import oasis.names.tc.ciq.xsdschema.xal._2.AddressDetails;

public class PlacemarkTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.PlacemarkType.setPoint(Lcom/google/earth/kml/_2/PointType;)V: root-Branch
   * 2 com.google.earth.kml._2.PlacemarkType.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      placemarkType0.setPoint((PointType) null);
      assertNull(placemarkType0.getAddress());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PlacemarkType.getPoint()Lcom/google/earth/kml/_2/PointType;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      PointType pointType0 = placemarkType0.getPoint();
      assertNull(pointType0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PlacemarkType.setAddressDetails(Loasis/names/tc/ciq/xsdschema/xal/_2/AddressDetails;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      placemarkType0.setAddressDetails((AddressDetails) null);
      assertNull(placemarkType0.getAddress());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PlacemarkType.getId()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      String string0 = placemarkType0.getId();
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PlacemarkType.setAddress(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      placemarkType0.setAddress("");
      assertEquals("", placemarkType0.getAddress());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PlacemarkType.getAddressDetails()Loasis/names/tc/ciq/xsdschema/xal/_2/AddressDetails;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      AddressDetails addressDetails0 = placemarkType0.getAddressDetails();
      assertNull(addressDetails0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PlacemarkType.setId(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      placemarkType0.setId("");
      assertNull(placemarkType0.getAddress());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.PlacemarkType.getAddress()Ljava/lang/String;: root-Branch
   * 2 com.google.earth.kml._2.PlacemarkType.<init>()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      PlacemarkType placemarkType0 = new PlacemarkType();
      String string0 = placemarkType0.getAddress();
      assertNull(string0);
  }
}