/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameRound;
import messages.round.RoundStateMsg;

@RunWith(EvoSuiteRunner.class)
public class RoundStateMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 messages.round.RoundStateMsg.execute(Lclient/ClientGameRound;)V: I4 Branch 1 LOOKUPSWITCH L42 Case 1 - false
   * 2 messages.round.RoundStateMsg.execute(Lclient/ClientGameRound;)V: I4 Branch 3 LOOKUPSWITCH L42 Default-Case - true
   * 3 messages.round.RoundStateMsg.<init>(I)V: root-Branch
   * 4 messages.round.RoundStateMsg.execute(Lclient/ClientGameRound;)V: I4 Branch 2 LOOKUPSWITCH L42 Case 2 - false
   */
  @Test
  public void test0()  throws Throwable  {
      RoundStateMsg roundStateMsg0 = new RoundStateMsg(0);
      // Undeclared exception!
      try {
        roundStateMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unknown RoundStateMsg type: 0
         */
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 messages.round.RoundStateMsg.execute(Lclient/ClientGameRound;)V: I4 Branch 1 LOOKUPSWITCH L42 Case 1 - true
   * 2 messages.round.RoundStateMsg.execute(Lclient/ClientGameRound;)V: I4 Branch 2 LOOKUPSWITCH L42 Case 2 - false
   * 3 messages.round.RoundStateMsg.execute(Lclient/ClientGameRound;)V: I4 Branch 3 LOOKUPSWITCH L42 Default-Case - false
   * 4 messages.round.RoundStateMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      RoundStateMsg roundStateMsg0 = new RoundStateMsg(1);
      // Undeclared exception!
      try {
        roundStateMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class client.gui.StartFrame
         */
      }
  }
}
