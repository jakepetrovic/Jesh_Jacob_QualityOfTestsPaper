/*
 * This file was automatically generated by EvoSuite
 */

package com.sap.netweaver.porta.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.ApplicationStatus;

public class ApplicationStatusEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 com.sap.netweaver.porta.core.ApplicationStatus.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ApplicationStatus applicationStatus0 = ApplicationStatus.STARTING;
      String string0 = applicationStatus0.toString();
      assertEquals("starting", string0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.ApplicationStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/ApplicationStatus;: I14 Branch 1 IF_ICMPGE L97 - true
   * 2 com.sap.netweaver.porta.core.ApplicationStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/ApplicationStatus;: I14 Branch 1 IF_ICMPGE L97 - false
   * 3 com.sap.netweaver.porta.core.ApplicationStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/ApplicationStatus;: I25 Branch 2 IFLE L98 - true
   */
  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        ApplicationStatus.getByName("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * 
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 com.sap.netweaver.porta.core.ApplicationStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/ApplicationStatus;: I25 Branch 2 IFLE L98 - false
   * 2 com.sap.netweaver.porta.core.ApplicationStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/ApplicationStatus;: I14 Branch 1 IF_ICMPGE L97 - false
   * 3 com.sap.netweaver.porta.core.ApplicationStatus.getByName(Ljava/lang/String;)Lcom/sap/netweaver/porta/core/ApplicationStatus;: I25 Branch 2 IFLE L98 - true
   */
  @Test
  public void test2()  throws Throwable  {
      ApplicationStatus applicationStatus0 = ApplicationStatus.getByName("marked for removal");
      assertEquals(ApplicationStatus.MARKED_FOR_REMOVAL, applicationStatus0);
  }
}
