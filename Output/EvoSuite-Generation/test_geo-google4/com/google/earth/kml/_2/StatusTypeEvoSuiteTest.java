/*
 * This file was automatically generated by EvoSuite
 */

package com.google.earth.kml._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.google.earth.kml._2.StatusType;

public class StatusTypeEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.StatusType.setRequest(Ljava/lang/String;)V: root-Branch
   * 2 com.google.earth.kml._2.StatusType.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      StatusType statusType0 = new StatusType();
      statusType0.setRequest("T$3c5oA3T<Ii!C");
      assertEquals("T$3c5oA3T<Ii!C", statusType0.getRequest());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.StatusType.getRequest()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      StatusType statusType0 = new StatusType();
      String string0 = statusType0.getRequest();
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.google.earth.kml._2.StatusType.getCode()I: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      StatusType statusType0 = new StatusType();
      int int0 = statusType0.getCode();
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 com.google.earth.kml._2.StatusType.setCode(I)V: root-Branch
   * 2 com.google.earth.kml._2.StatusType.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      StatusType statusType0 = new StatusType();
      statusType0.setCode((-1752));
      assertEquals(-1752, statusType0.getCode());
  }
}
