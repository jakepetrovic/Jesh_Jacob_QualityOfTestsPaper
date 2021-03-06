/*
 * This file was automatically generated by EvoSuite
 */

package client.gui.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.gui.components.MyPanel;
import javax.swing.JLabel;

@RunWith(EvoSuiteRunner.class)
public class MyPanelEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 client.gui.components.MyPanel.setTitel(Ljava/lang/String;)V: root-Branch
   * 2 client.gui.components.MyPanel.setFont(Ljava/awt/Font;)V: root-Branch
   * 3 client.gui.components.MyPanel.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MyPanel myPanel0 = new MyPanel();
      myPanel0.setTitel("");
      assertEquals(0, myPanel0.getHeight());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 client.gui.components.MyPanel.setColor(Ljava/awt/Color;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      MyPanel myPanel0 = new MyPanel();
      myPanel0.setColor(myPanel0.col);
      assertEquals(0.5F, myPanel0.getAlignmentY(), 0.01F);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 client.gui.components.MyPanel.setBild(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      MyPanel myPanel0 = new MyPanel();
      myPanel0.setBild("ph_");
      assertEquals(false, myPanel0.isFocusTraversalPolicyProvider());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 client.gui.components.MyPanel.addLabel(Ljavax/swing/JLabel;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      MyPanel myPanel0 = new MyPanel();
      JLabel jLabel0 = new JLabel();
      myPanel0.addLabel(jLabel0);
      assertEquals(true, myPanel0.isOpaque());
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 client.gui.components.MyPanel.setBounds(IIII)V: root-Branch
   * 2 client.gui.components.MyPanel.setFont(Ljava/awt/Font;)V: root-Branch
   * 3 client.gui.components.MyPanel.<init>()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      MyPanel myPanel0 = new MyPanel();
      assertNotNull(myPanel0);
      
      myPanel0.setBounds((-612), (-612), (-759), (-759));
      assertEquals(-759, myPanel0.getHeight());
      assertEquals("client.gui.components.MyPanel[,-612,-612,-759x-759,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", myPanel0.toString());
  }
}
