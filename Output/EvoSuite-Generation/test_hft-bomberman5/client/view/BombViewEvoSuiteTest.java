/*
 * This file was automatically generated by EvoSuite
 */

package client.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.view.BombView;
import client.view.GfxFactory;
import common.Bomb;
import java.awt.Graphics;

@RunWith(EvoSuiteRunner.class)
public class BombViewEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 client.view.BombView.paint(Ljava/awt/Graphics;)V: I4 Branch 1 IFNE L47 - true
   * 2 client.view.BombView.<init>(Lcommon/Bomb;Lclient/view/GfxFactory;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      BombView bombView0 = new BombView((Bomb) null, (GfxFactory) null);
      // Undeclared exception!
      try {
        bombView0.paint((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
