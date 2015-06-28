/*
 * This file was automatically generated by EvoSuite
 */

package messages.session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameSession;
import messages.session.SessionChatMsg;
import server.ClientInfo;
import server.ServerGameSession;

@RunWith(EvoSuiteRunner.class)
public class SessionChatMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.session.SessionChatMsg.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 2 messages.session.SessionChatMsg.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      SessionChatMsg sessionChatMsg0 = new SessionChatMsg("");
      assertNotNull(sessionChatMsg0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 messages.session.SessionChatMsg.execute(Lclient/ClientGameSession;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SessionChatMsg sessionChatMsg0 = new SessionChatMsg("+9(Gu1BHt,CS", "+9(Gu1BHt,CS");
      // Undeclared exception!
      try {
        sessionChatMsg0.execute((ClientGameSession) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 messages.session.SessionChatMsg.execute(Lserver/ServerGameSession;Lserver/ClientInfo;)V: root-Branch
   * 2 messages.session.SessionChatMsg.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SessionChatMsg sessionChatMsg0 = new SessionChatMsg("<4btKU?VS\"3kq<?q", "<4btKU?VS\"3kq<?q");
      // Undeclared exception!
      try {
        sessionChatMsg0.execute((ServerGameSession) null, (ClientInfo) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}