/*
 * This file was automatically generated by EvoSuite
 */

package client.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.gui.ImageCache;
import java.awt.Image;

@RunWith(EvoSuiteRunner.class)
public class ImageCacheEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 client.gui.ImageCache.getH()I: root-Branch
   * 2 client.gui.ImageCache.<init>(Ljava/awt/Image;IIII)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ImageCache imageCache0 = new ImageCache((Image) null, 0, 682, 1948, 1321);
      int int0 = imageCache0.getH();
      assertEquals(682, imageCache0.y);
      assertEquals(0, imageCache0.x);
      assertEquals(1948, imageCache0.w);
      assertEquals(1321, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 client.gui.ImageCache.getImg()Ljava/awt/Image;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ImageCache imageCache0 = new ImageCache((Image) null, 0, 682, 1948, 1321);
      imageCache0.getImg();
      assertEquals(1321, imageCache0.h);
      assertEquals(1948, imageCache0.w);
      assertEquals(682, imageCache0.y);
      assertEquals(0, imageCache0.x);
      assertEquals(1948, imageCache0.getW());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 client.gui.ImageCache.setImg(Ljava/awt/Image;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ImageCache imageCache0 = new ImageCache((Image) null, 1803, 0, 1, 0);
      imageCache0.setImg((Image) null);
      assertEquals(0, imageCache0.y);
      assertEquals(0, imageCache0.h);
      assertEquals(1, imageCache0.w);
      assertEquals(1803, imageCache0.x);
      assertEquals(1, imageCache0.getW());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 client.gui.ImageCache.getX()I: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ImageCache imageCache0 = new ImageCache((Image) null, 0, 682, 1948, 1321);
      int int0 = imageCache0.getX();
      assertEquals(0, int0);
      assertEquals(1321, imageCache0.h);
      assertEquals(1948, imageCache0.w);
      assertEquals(682, imageCache0.y);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 client.gui.ImageCache.getY()I: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ImageCache imageCache0 = new ImageCache((Image) null, 0, 682, 1948, 1321);
      int int0 = imageCache0.getY();
      assertEquals(0, imageCache0.x);
      assertEquals(1321, imageCache0.h);
      assertEquals(1948, imageCache0.w);
      assertEquals(682, int0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 client.gui.ImageCache.getW()I: root-Branch
   * 2 client.gui.ImageCache.<init>(Ljava/awt/Image;IIII)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ImageCache imageCache0 = new ImageCache((Image) null, 0, 682, 1948, 1321);
      int int0 = imageCache0.getW();
      assertEquals(1948, int0);
      assertEquals(682, imageCache0.y);
      assertEquals(1321, imageCache0.h);
      assertEquals(0, imageCache0.x);
  }
}