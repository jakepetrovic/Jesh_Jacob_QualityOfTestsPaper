/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameRound;
import messages.round.TileHitPlayerMsg;

@RunWith(EvoSuiteRunner.class)
public class TileHitPlayerMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.round.TileHitPlayerMsg.execute(Lclient/ClientGameRound;)V: root-Branch
   * 2 messages.round.TileHitPlayerMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TileHitPlayerMsg tileHitPlayerMsg0 = new TileHitPlayerMsg((-1));
      // Undeclared exception!
      try {
        tileHitPlayerMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
