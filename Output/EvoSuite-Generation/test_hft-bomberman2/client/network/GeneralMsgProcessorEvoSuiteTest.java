/*
 * This file was automatically generated by EvoSuite
 */

package client.network;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.network.GeneralMsgProcessor;
import messages.Message;
import messages.global.GlobalStateMsg;

@RunWith(EvoSuiteRunner.class)
public class GeneralMsgProcessorEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 client.network.GeneralMsgProcessor.processMsg(Lmessages/Message;)V: root-Branch
   * 2 client.network.GeneralMsgProcessor.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      GeneralMsgProcessor generalMsgProcessor0 = new GeneralMsgProcessor();
      GlobalStateMsg globalStateMsg0 = new GlobalStateMsg(1);
      generalMsgProcessor0.processMsg((Message) globalStateMsg0);
  }
}
