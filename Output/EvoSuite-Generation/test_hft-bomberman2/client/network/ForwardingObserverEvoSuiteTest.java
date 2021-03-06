/*
 * This file was automatically generated by EvoSuite
 */

package client.network;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.BomberClient;
import client.ClientGameRound;
import client.network.ForwardingObserver;
import java.util.Observable;

@RunWith(EvoSuiteRunner.class)
public class ForwardingObserverEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 client.network.ForwardingObserver.update(Ljava/util/Observable;Ljava/lang/Object;)V: I5 Branch 1 IFEQ L64 - true
   * 2 client.network.ForwardingObserver.update(Ljava/util/Observable;Ljava/lang/Object;)V: I84 Branch 3 IFEQ L80 - true
   * 3 client.network.ForwardingObserver.<init>(Lclient/BomberClient;Lclient/ClientGameRound;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ForwardingObserver forwardingObserver0 = new ForwardingObserver((BomberClient) null, (ClientGameRound) null);
      forwardingObserver0.update((Observable) null, (Object) "GMT+00:00");
  }
}
