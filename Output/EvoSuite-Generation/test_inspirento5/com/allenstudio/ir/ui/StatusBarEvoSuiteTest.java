/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.StatusBar;

public class StatusBarEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.ui.StatusBar.displayTooltip(Ljava/lang/String;)V: root-Branch
   * 2 com.allenstudio.ir.ui.StatusBar.initComponents()V: root-Branch
   * 3 com.allenstudio.ir.ui.StatusBar.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      StatusBar statusBar0 = new StatusBar();
      assertNotNull(statusBar0);
      
      statusBar0.displayTooltip((String) null);
      assertEquals(1, statusBar0.getComponentCount());
      assertEquals("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", statusBar0.toString());
  }
}
