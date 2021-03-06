/*
 * This file was automatically generated by EvoSuite
 */

package messages.session;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.ClientGameSession;
import common.Map;
import java.util.Vector;
import messages.session.InitializeRoundMsg;
import messages.session.PlayerInfo;

@RunWith(EvoSuiteRunner.class)
public class InitializeRoundMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 messages.session.InitializeRoundMsg.execute(Lclient/ClientGameSession;)V: root-Branch
   * 2 messages.session.InitializeRoundMsg.<init>(Ljava/util/Vector;Lcommon/Map;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      InitializeRoundMsg initializeRoundMsg0 = new InitializeRoundMsg((Vector<PlayerInfo>) null, (Map) null);
      // Undeclared exception!
      try {
        initializeRoundMsg0.execute((ClientGameSession) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
