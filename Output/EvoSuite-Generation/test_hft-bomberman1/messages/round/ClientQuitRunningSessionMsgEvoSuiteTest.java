/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import messages.round.ClientQuitRunningSessionMsg;
import server.ClientInfo;
import server.ServerGameRound;

@RunWith(EvoSuiteRunner.class)
public class ClientQuitRunningSessionMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.round.ClientQuitRunningSessionMsg.execute(Lserver/ServerGameRound;Lserver/ClientInfo;)V: root-Branch
   * 2 messages.round.ClientQuitRunningSessionMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ClientQuitRunningSessionMsg clientQuitRunningSessionMsg0 = new ClientQuitRunningSessionMsg(0);
      // Undeclared exception!
      try {
        clientQuitRunningSessionMsg0.execute((ServerGameRound) null, (ClientInfo) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
