/*
 * This file was automatically generated by EvoSuite
 */

package client.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.view.GameCanvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

@RunWith(EvoSuiteRunner.class)
public class GameCanvasEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 client.view.GameCanvas.update()V: root-Branch
   * 2 client.view.GameCanvas.<init>(II)V: root-Branch
   * 3 client.view.GameCanvas.prepare()V: root-Branch
   * 4 client.view.GameCanvas.paint(Ljava/awt/Graphics;)V: I3 Branch 1 IFNONNULL L60 - false
   */
  @Test
  public void test0()  throws Throwable  {
      GameCanvas gameCanvas0 = new GameCanvas(2027, 2027);
      assertNotNull(gameCanvas0);
      
      gameCanvas0.update();
      assertEquals("client.view.GameCanvas[canvas191,0,0,0x0,invalid]", gameCanvas0.toString());
      assertEquals("canvas191", gameCanvas0.getName());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 client.view.GameCanvas.paint(Ljava/awt/Graphics;)V: I3 Branch 1 IFNONNULL L60 - true
   * 2 client.view.GameCanvas.getCanvas()Ljava/awt/Graphics2D;: I4 Branch 2 IFNE L68 - false
   * 3 client.view.GameCanvas.<init>(II)V: root-Branch
   * 4 client.view.GameCanvas.prepare()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      GameCanvas gameCanvas0 = new GameCanvas(14, 14);
      assertNotNull(gameCanvas0);
      
      Graphics2D graphics2D0 = gameCanvas0.getCanvas();
      gameCanvas0.paint((Graphics) graphics2D0);
      assertEquals("client.view.GameCanvas[canvas264,0,0,0x0,invalid]", gameCanvas0.toString());
      assertEquals("canvas264", gameCanvas0.getName());
  }
}
