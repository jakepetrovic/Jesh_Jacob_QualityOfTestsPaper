/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.producer.XMLParse;

public class XMLParseEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.XMLParse.init()V: root-Branch
   * 2 nu.staldal.lagoon.producer.XMLParse.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XMLParse xMLParse0 = new XMLParse();
      xMLParse0.init();
      assertNull(xMLParse0.getEntryName());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.XMLParse.run()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      XMLParse xMLParse0 = new XMLParse();
      // Undeclared exception!
      try {
        xMLParse0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.producer.XMLParse.hasBeenUpdated(J)Z: root-Branch
   * 2 nu.staldal.lagoon.producer.XMLParse.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      XMLParse xMLParse0 = new XMLParse();
      // Undeclared exception!
      try {
        xMLParse0.hasBeenUpdated(807L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
