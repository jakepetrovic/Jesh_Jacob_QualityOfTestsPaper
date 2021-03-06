/*
 * This file was automatically generated by EvoSuite
 */

package common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import common.GameObject;
import common.PowerUp;
import common.Tile;
import java.awt.Point;
import java.util.Collection;

@RunWith(EvoSuiteRunner.class)
public class TileEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 common.Tile.die()V: I9 Branch 1 IFEQ L141 - false
   * 2 common.Tile.setBombable(Z)V: root-Branch
   * 3 common.Tile.<init>(Ljava/awt/Point;)V: root-Branch
   * 4 common.Tile.destroy()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      tile0.setBombable(true);
      tile0.destroy();
      assertEquals(false, tile0.isActive());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 common.Tile.setType(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      tile0.setType("");
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(true, tile0.isVisible());
      assertEquals(true, tile0.isAccessible());
      assertEquals(false, tile0.isBombable());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 common.Tile.getCollisionRectangle()Ljava/awt/Rectangle;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      // Undeclared exception!
      try {
        tile0.getCollisionRectangle();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 common.Tile.collide(Lcommon/GameObject;)Z: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      PowerUp powerUp0 = new PowerUp((Point) null);
      boolean boolean0 = tile0.collide((GameObject) powerUp0);
      assertEquals(false, boolean0);
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(false, tile0.isBombable());
      assertEquals(true, tile0.isVisible());
      assertEquals(true, tile0.isAccessible());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 common.Tile.isAccessible()Z: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      boolean boolean0 = tile0.isAccessible();
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(true, boolean0);
      assertEquals(true, tile0.isVisible());
      assertEquals(false, tile0.isBombable());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 common.Tile.setAccessible(Z)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      assertEquals(true, tile0.isAccessible());
      
      tile0.setAccessible(false);
      assertEquals(false, tile0.isAccessable());
      assertEquals(false, tile0.isAccessible());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 common.Tile.getSpeedFactor()D: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      double double0 = tile0.getSpeedFactor();
      assertEquals(true, tile0.isVisible());
      assertEquals(1.0, double0, 0.01D);
      assertEquals(false, tile0.isBombable());
      assertEquals(true, tile0.isAccessable());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 common.Tile.update()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      tile0.update();
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(true, tile0.isVisible());
      assertEquals(false, tile0.isBombable());
      assertEquals(true, tile0.isAccessible());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 common.Tile.getType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      tile0.getType();
      assertEquals(true, tile0.isVisible());
      assertEquals(true, tile0.isAccessible());
      assertEquals(false, tile0.isBombable());
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 common.Tile.destroy()V: root-Branch
   * 2 common.Tile.die()V: I9 Branch 1 IFEQ L141 - true
   */
  @Test
  public void test9()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      tile0.destroy();
      assertEquals(false, tile0.isActive());
      assertEquals(true, tile0.isAccessable());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 common.Tile.setProperties(Ljava/lang/String;ZZ)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      assertEquals(true, tile0.isAccessable());
      
      tile0.setProperties("", false, false);
      assertEquals(false, tile0.isAccessable());
      assertEquals(false, tile0.isAccessible());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 common.Tile.isAccessable()Z: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      boolean boolean0 = tile0.isAccessable();
      assertEquals(true, tile0.isVisible());
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(true, boolean0);
      assertEquals(false, tile0.isBombable());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 common.Tile.isBombable()Z: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      boolean boolean0 = tile0.isBombable();
      assertEquals(false, boolean0);
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(true, tile0.isVisible());
      assertEquals(true, tile0.isAccessible());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 common.Tile.updateWithCollisionCheck(Ljava/util/Collection;)V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      tile0.updateWithCollisionCheck((Collection<GameObject>) null);
      assertEquals(false, tile0.isBombable());
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(true, tile0.isVisible());
      assertEquals(true, tile0.isAccessable());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 common.Tile.isVisible()Z: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      boolean boolean0 = tile0.isVisible();
      assertEquals(true, boolean0);
      assertEquals(1.0, tile0.getSpeedFactor(), 0.01D);
      assertEquals(false, tile0.isBombable());
      assertEquals(true, tile0.isAccessible());
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 common.Tile.setVisible(Z)V: root-Branch
   * 2 common.Tile.<init>(Ljava/awt/Point;)V: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      Tile tile0 = new Tile((Point) null);
      assertEquals(true, tile0.isVisible());
      
      tile0.setVisible(false);
      assertEquals(false, tile0.isVisible());
      assertEquals(false, tile0.isBombable());
  }
}
