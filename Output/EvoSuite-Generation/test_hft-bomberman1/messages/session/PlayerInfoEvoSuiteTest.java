/*
 * This file was automatically generated by EvoSuite
 */

package messages.session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Point;
import messages.session.PlayerInfo;

@RunWith(EvoSuiteRunner.class)
public class PlayerInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.session.PlayerInfo.getPosition()Ljava/awt/Point;: root-Branch
   * 2 messages.session.PlayerInfo.<init>(ILjava/awt/Point;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Point point0 = new Point();
      PlayerInfo playerInfo0 = new PlayerInfo(1, point0, "s");
      Point point1 = playerInfo0.getPosition();
      assertEquals(1, playerInfo0.getId());
      assertNotNull(point1);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 messages.session.PlayerInfo.getId()I: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Point point0 = new Point();
      PlayerInfo playerInfo0 = new PlayerInfo(1, point0, "s");
      int int0 = playerInfo0.getId();
      assertEquals(1, int0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 messages.session.PlayerInfo.getName()Ljava/lang/String;: root-Branch
   * 2 messages.session.PlayerInfo.<init>(ILjava/awt/Point;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Point point0 = new Point((-1938), 0);
      PlayerInfo playerInfo0 = new PlayerInfo((-1938), point0, "");
      String string0 = playerInfo0.getName();
      assertEquals(-1938, playerInfo0.getId());
      assertNotNull(string0);
  }
}