/*
 * This file was automatically generated by EvoSuite
 */

package ch.bluepenguin.email.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import ch.bluepenguin.email.client.IDGenerator;

public class IDGeneratorEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.IDGenerator.next()Ljava/lang/Integer;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Integer integer0 = IDGenerator.next();
      assertEquals(0, (int)integer0);
  }
}
