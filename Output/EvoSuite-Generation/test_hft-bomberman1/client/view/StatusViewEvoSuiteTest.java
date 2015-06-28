/*
 * This file was automatically generated by EvoSuite
 */

package client.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.view.GfxFactory;
import client.view.StatusView;
import common.GameObject;
import common.PowerUp;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

@RunWith(EvoSuiteRunner.class)
public class StatusViewEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 client.view.StatusView.paint(Ljava/awt/Graphics;)V: root-Branch
   * 2 client.view.StatusView.<init>(Lcommon/GameObject;Lclient/view/GfxFactory;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JPanel jPanel0 = new JPanel();
      Point point0 = jPanel0.getLocation();
      PowerUp powerUp0 = new PowerUp(point0);
      StatusView statusView0 = new StatusView((GameObject) powerUp0, (GfxFactory) null);
      statusView0.paint((Graphics) null);
  }
}