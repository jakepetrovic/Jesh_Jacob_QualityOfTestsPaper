/*
 * This file was automatically generated by EvoSuite
 */

package client.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import client.view.GameView;
import client.view.OffGamePainter;

@RunWith(EvoSuiteRunner.class)
public class OffGamePainterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 client.view.OffGamePainter.run()V: I3 Branch 1 IFNE L29 - false
   * 2 client.view.OffGamePainter.<init>(Lclient/view/GameView;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      OffGamePainter offGamePainter0 = new OffGamePainter((GameView) null);
      // Undeclared exception!
      try {
        offGamePainter0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
