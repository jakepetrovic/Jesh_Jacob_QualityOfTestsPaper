/*
 * This file was automatically generated by EvoSuite
 */

package messages.round;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import messages.round.MagicKillMsg;

@RunWith(EvoSuiteRunner.class)
public class MagicKillMsgEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 messages.round.MagicKillMsg.<init>(I)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MagicKillMsg magicKillMsg0 = new MagicKillMsg(12);
      assertNotNull(magicKillMsg0);
  }
}
