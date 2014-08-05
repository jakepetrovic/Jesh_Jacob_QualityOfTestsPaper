/*
 * This file was automatically generated by EvoSuite
 */

package bierse.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.view.RunningMessagePanel;
import java.awt.event.ActionEvent;

public class RunningMessagePanelEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 bierse.view.RunningMessagePanel.getStringHeight()I: root-Branch
   * 2 bierse.view.RunningMessagePanel.<init>(Ljava/lang/String;I)V: I55 Branch 1 IFNONNULL L40 - true
   */
  @Test
  public void test0()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("2", (-1525));
      assertNotNull(runningMessagePanel0);
      
      int int0 = runningMessagePanel0.getStringHeight();
      assertEquals(24, int0);
      assertEquals(12, runningMessagePanel0.getStringWidth());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 bierse.view.RunningMessagePanel.setSpeed(I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("<C%}NM<1N.:", 1199);
      assertNotNull(runningMessagePanel0);
      
      runningMessagePanel0.setSpeed(1199);
      assertEquals(24, runningMessagePanel0.getStringHeight());
      assertEquals(132, runningMessagePanel0.getStringWidth());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 bierse.view.RunningMessagePanel.setMessage(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("?GG,#v)", (-264));
      assertNotNull(runningMessagePanel0);
      
      runningMessagePanel0.setMessage("?GG,#v)");
      assertEquals(24, runningMessagePanel0.getStringHeight());
      assertEquals(84, runningMessagePanel0.getStringWidth());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 bierse.view.RunningMessagePanel.getStringWidth()I: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("E7x&~j", 0);
      assertNotNull(runningMessagePanel0);
      
      int int0 = runningMessagePanel0.getStringWidth();
      assertEquals(24, runningMessagePanel0.getStringHeight());
      assertEquals(72, int0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 bierse.view.RunningMessagePanel.actionPerformed(Ljava/awt/event/ActionEvent;)V: I26 Branch 3 IFGE L60 - true
   * 2 bierse.view.RunningMessagePanel.<init>(Ljava/lang/String;I)V: I55 Branch 1 IFNONNULL L40 - true
   */
  @Test
  public void test4()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("lH(r7'ay[x4[f.", 43);
      assertNotNull(runningMessagePanel0);
      
      runningMessagePanel0.actionPerformed((ActionEvent) null);
      assertEquals(24, runningMessagePanel0.getStringHeight());
      assertEquals(168, runningMessagePanel0.getStringWidth());
  }
}