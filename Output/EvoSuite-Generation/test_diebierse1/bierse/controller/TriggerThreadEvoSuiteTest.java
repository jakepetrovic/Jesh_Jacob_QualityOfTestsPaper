/*
 * This file was automatically generated by EvoSuite
 */

package bierse.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.controller.TriggerThread;
import bierse.model.Model;

public class TriggerThreadEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 bierse.controller.TriggerThread.<init>(Ljava/lang/String;Lbierse/model/Model;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TriggerThread triggerThread0 = new TriggerThread((String) null, (Model) null);
      assertEquals("Thread[Thread-6331,5,Test Execution]", triggerThread0.toString());
  }
}
