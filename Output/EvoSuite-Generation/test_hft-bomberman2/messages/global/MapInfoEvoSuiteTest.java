/*
 * This file was automatically generated by EvoSuite
 */

package messages.global;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.swing.ImageIcon;
import messages.global.MapInfo;

@RunWith(EvoSuiteRunner.class)
public class MapInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.global.MapInfo.getMaxPlayers()I: root-Branch
   * 2 messages.global.MapInfo.<init>(Ljava/lang/String;Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo("AV64v", "AV64v", 1);
      int int0 = mapInfo0.getMaxPlayers();
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 messages.global.MapInfo.getFile()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo("AV64v", "AV64v", 1);
      String string0 = mapInfo0.getFile();
      assertNotNull(string0);
      assertEquals(1, mapInfo0.getMaxPlayers());
      assertEquals("(1) AV64v", mapInfo0.toString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 messages.global.MapInfo.getName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo("5zG.NcKsszEP)~_2G", (String) null, (-887));
      mapInfo0.getName();
      assertEquals("(-887) null", mapInfo0.toString());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 messages.global.MapInfo.setPreview(Ljavax/swing/ImageIcon;)V: root-Branch
   * 2 messages.global.MapInfo.getPreview()Ljavax/swing/ImageIcon;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo("AV64v", "AV64v", 1);
      ImageIcon imageIcon0 = mapInfo0.getPreview();
      mapInfo0.setPreview(imageIcon0);
      assertEquals(1, mapInfo0.getMaxPlayers());
      assertEquals("(1) AV64v", mapInfo0.toString());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 messages.global.MapInfo.toString()Ljava/lang/String;: root-Branch
   * 2 messages.global.MapInfo.<init>(Ljava/lang/String;Ljava/lang/String;I)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      MapInfo mapInfo0 = new MapInfo("AV64v", "AV64v", 1);
      String string0 = mapInfo0.toString();
      assertNotNull(string0);
      assertEquals("(1) AV64v", string0);
  }
}
