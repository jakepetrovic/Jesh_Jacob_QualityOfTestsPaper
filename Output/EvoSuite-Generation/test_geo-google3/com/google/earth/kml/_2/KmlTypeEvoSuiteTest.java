/*
 * This file was automatically generated by EvoSuite
 */

package com.google.earth.kml._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.google.earth.kml._2.KmlType;
import com.google.earth.kml._2.ResponseType;

public class KmlTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.KmlType.getResponse()Lcom/google/earth/kml/_2/ResponseType;: root-Branch
   * 2 com.google.earth.kml._2.KmlType.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      KmlType kmlType0 = new KmlType();
      ResponseType responseType0 = kmlType0.getResponse();
      assertNull(responseType0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.KmlType.setResponse(Lcom/google/earth/kml/_2/ResponseType;)V: root-Branch
   * 2 com.google.earth.kml._2.KmlType.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      KmlType kmlType0 = new KmlType();
      kmlType0.setResponse((ResponseType) null);
  }
}
