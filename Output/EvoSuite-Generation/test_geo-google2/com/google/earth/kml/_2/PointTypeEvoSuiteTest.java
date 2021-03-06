/*
 * This file was automatically generated by EvoSuite
 */

package com.google.earth.kml._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.google.earth.kml._2.AltitudeModeType;
import com.google.earth.kml._2.PointType;

public class PointTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.PointType.getAltitudeMode()Lcom/google/earth/kml/_2/AltitudeModeType;: root-Branch
   * 2 com.google.earth.kml._2.PointType.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.getAltitudeMode();
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PointType.setExtrude(Ljava/lang/Boolean;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.setExtrude((Boolean) true);
      assertNull(pointType0.getCoordinates());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PointType.isTessellate()Ljava/lang/Boolean;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.isTessellate();
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PointType.getCoordinates()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      PointType pointType0 = new PointType();
      String string0 = pointType0.getCoordinates();
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PointType.setCoordinates(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.setCoordinates((String) null);
      assertNull(pointType0.getAltitudeMode());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PointType.setTessellate(Ljava/lang/Boolean;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.setTessellate((Boolean) null);
      assertNull(pointType0.getAltitudeMode());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.PointType.isExtrude()Ljava/lang/Boolean;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      PointType pointType0 = new PointType();
      pointType0.isExtrude();
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.PointType.setAltitudeMode(Lcom/google/earth/kml/_2/AltitudeModeType;)V: root-Branch
   * 2 com.google.earth.kml._2.PointType.<init>()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      PointType pointType0 = new PointType();
      AltitudeModeType altitudeModeType0 = AltitudeModeType.ABSOLUTE;
      pointType0.setAltitudeMode(altitudeModeType0);
      assertNull(pointType0.getCoordinates());
  }
}
