/*
 * This file was automatically generated by EvoSuite
 */

package messages.session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import messages.session.SessionStateMsg;
import server.ClientInfo;
import server.ServerGameSession;

@RunWith(EvoSuiteRunner.class)
public class SessionStateMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 messages.session.SessionStateMsg.execute(Lserver/ServerGameSession;Lserver/ClientInfo;)V: I4 Branch 1 LOOKUPSWITCH L28 Case 1 - true
   * 2 messages.session.SessionStateMsg.execute(Lserver/ServerGameSession;Lserver/ClientInfo;)V: I4 Branch 2 LOOKUPSWITCH L28 Default-Case - false
   * 3 messages.session.SessionStateMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SessionStateMsg sessionStateMsg0 = new SessionStateMsg(1);
      // Undeclared exception!
      try {
        sessionStateMsg0.execute((ServerGameSession) null, (ClientInfo) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 messages.session.SessionStateMsg.execute(Lserver/ServerGameSession;Lserver/ClientInfo;)V: I4 Branch 1 LOOKUPSWITCH L28 Case 1 - false
   * 2 messages.session.SessionStateMsg.execute(Lserver/ServerGameSession;Lserver/ClientInfo;)V: I4 Branch 2 LOOKUPSWITCH L28 Default-Case - true
   * 3 messages.session.SessionStateMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SessionStateMsg sessionStateMsg0 = new SessionStateMsg(0);
      sessionStateMsg0.execute((ServerGameSession) null, (ClientInfo) null);
  }
}
