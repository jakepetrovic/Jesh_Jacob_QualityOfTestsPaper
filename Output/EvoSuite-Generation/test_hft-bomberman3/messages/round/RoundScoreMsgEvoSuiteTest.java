/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameRound;
import java.util.HashMap;
import messages.round.RoundScoreMsg;

@RunWith(EvoSuiteRunner.class)
public class RoundScoreMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.round.RoundScoreMsg.execute(Lclient/ClientGameRound;)V: root-Branch
   * 2 messages.round.RoundScoreMsg.<init>(Ljava/util/HashMap;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      RoundScoreMsg roundScoreMsg0 = new RoundScoreMsg(hashMap0);
      // Undeclared exception!
      try {
        roundScoreMsg0.execute((ClientGameRound) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
