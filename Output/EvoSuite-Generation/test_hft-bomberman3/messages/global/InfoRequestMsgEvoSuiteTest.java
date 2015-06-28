/*
 * This file was automatically generated by EvoSuite
 */

package messages.global;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import messages.global.InfoRequestMsg;
import server.BomberServer;
import server.ClientInfo;

@RunWith(EvoSuiteRunner.class)
public class InfoRequestMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 1 TABLESWITCH L57 Case 1 - true
   * 2 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 2 TABLESWITCH L57 Case 2 - false
   * 3 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 3 TABLESWITCH L57 Case 3 - false
   * 4 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 4 TABLESWITCH L57 Default-Case - false
   * 5 messages.global.InfoRequestMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      InfoRequestMsg infoRequestMsg0 = new InfoRequestMsg(1);
      // Undeclared exception!
      try {
        infoRequestMsg0.execute((BomberServer) null, (ClientInfo) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 1 TABLESWITCH L57 Case 1 - false
   * 2 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 4 TABLESWITCH L57 Default-Case - true
   * 3 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 2 TABLESWITCH L57 Case 2 - false
   */
  @Test
  public void test1()  throws Throwable  {
      InfoRequestMsg infoRequestMsg0 = new InfoRequestMsg(1748);
      infoRequestMsg0.execute((BomberServer) null, (ClientInfo) null);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 2 TABLESWITCH L57 Case 2 - true
   * 2 messages.global.InfoRequestMsg.<init>(I)V: root-Branch
   * 3 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 1 TABLESWITCH L57 Case 1 - false
   * 4 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 3 TABLESWITCH L57 Case 3 - false
   * 5 messages.global.InfoRequestMsg.execute(Lserver/BomberServer;Lserver/ClientInfo;)V: I4 Branch 4 TABLESWITCH L57 Default-Case - false
   */
  @Test
  public void test2()  throws Throwable  {
      InfoRequestMsg infoRequestMsg0 = new InfoRequestMsg(2);
      // Undeclared exception!
      try {
        infoRequestMsg0.execute((BomberServer) null, (ClientInfo) null);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class common.MapFilesLister
         */
      }
  }
}