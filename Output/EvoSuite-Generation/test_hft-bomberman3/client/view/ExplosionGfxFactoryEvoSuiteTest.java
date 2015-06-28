/*
 * This file was automatically generated by EvoSuite
 */

package client.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.view.ExplosionGfxFactory;
import java.awt.image.BufferedImage;

@RunWith(EvoSuiteRunner.class)
public class ExplosionGfxFactoryEvoSuiteTest {


  //Test case number: 0
  /*
   * 22 covered goals:
   * 1 client.view.ExplosionGfxFactory.loadImage(Ljava/lang/String;)Ljava/awt/Image;: root-Branch
   * 2 client.view.ExplosionGfxFactory.getTranslation(II)Ljava/awt/Point;: root-Branch
   * 3 client.view.ExplosionGfxFactory.pushTransform(Ljava/awt/geom/AffineTransform;)V: root-Branch
   * 4 client.view.ExplosionGfxFactory.<init>()V: root-Branch
   * 5 client.view.ExplosionGfxFactory.popTransform()Ljava/awt/geom/AffineTransform;: root-Branch
   * 6 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I57 Branch 1 IF_ICMPGE L46 - true
   * 7 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I57 Branch 1 IF_ICMPGE L46 - false
   * 8 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I67 Branch 2 IFNE L48 - true
   * 9 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I67 Branch 2 IFNE L48 - false
   * 10 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I100 Branch 3 IF_ICMPNE L52 - true
   * 11 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I100 Branch 3 IF_ICMPNE L52 - false
   * 12 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I143 Branch 4 IF_ICMPNE L57 - true
   * 13 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I143 Branch 4 IF_ICMPNE L57 - false
   * 14 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I212 Branch 5 IF_ICMPGE L69 - true
   * 15 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I212 Branch 5 IF_ICMPGE L69 - false
   * 16 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I222 Branch 6 IFNE L72 - true
   * 17 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I222 Branch 6 IFNE L72 - false
   * 18 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I267 Branch 7 IF_ICMPNE L77 - true
   * 19 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I267 Branch 7 IF_ICMPNE L77 - false
   * 20 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I310 Branch 8 IF_ICMPNE L83 - true
   * 21 client.view.ExplosionGfxFactory.getExplosionImage(II)Ljava/awt/Image;: I310 Branch 8 IF_ICMPNE L83 - false
   * 22 client.view.ExplosionGfxFactory.loadExplosionImage(ILjava/lang/String;)Ljava/awt/Image;: I24 Branch 9 IFLE L102 - true
   */
  @Test
  public void test0()  throws Throwable  {
      ExplosionGfxFactory explosionGfxFactory0 = new ExplosionGfxFactory();
      BufferedImage bufferedImage0 = (BufferedImage)explosionGfxFactory0.getExplosionImage(40, 1);
      assertEquals(1600, bufferedImage0.getTileWidth());
      assertNotNull(bufferedImage0);
      assertEquals(1600, bufferedImage0.getTileHeight());
  }
}
