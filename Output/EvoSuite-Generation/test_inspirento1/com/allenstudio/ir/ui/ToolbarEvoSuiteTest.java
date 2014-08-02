/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.Toolbar;

public class ToolbarEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 com.allenstudio.ir.ui.Toolbar.<init>()V: root-Branch
   * 2 com.allenstudio.ir.ui.Toolbar.createButtons()V: I20 Branch 1 IF_ICMPGE L45 - true
   * 3 com.allenstudio.ir.ui.Toolbar.createButtons()V: I20 Branch 1 IF_ICMPGE L45 - false
   * 4 com.allenstudio.ir.ui.Toolbar.createButtons()V: I42 Branch 2 IFGT L47 - false
   * 5 com.allenstudio.ir.ui.Toolbar.createButtons()V: I53 Branch 3 IFNULL L49 - false
   */
  @Test
  public void test0()  throws Throwable  {
      Toolbar toolbar0 = new Toolbar();
      assertEquals(0.5F, toolbar0.getAlignmentY(), 0.01F);
      assertEquals(false, toolbar0.isFloatable());
      assertNotNull(toolbar0);
      assertEquals(3, toolbar0.getComponentCount());
  }
}
