/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.core.ConfigurationManager;

public class ConfigurationManagerEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.core.ConfigurationManager.getInstance()Lcom/allenstudio/ir/core/ConfigurationManager;: I3 Branch 1 IFNULL L65 - false
   */
  @Test
  public void test0()  throws Throwable  {
      ConfigurationManager configurationManager0 = ConfigurationManager.getInstance();
      assertEquals("{}", configurationManager0.toString());
  }
}