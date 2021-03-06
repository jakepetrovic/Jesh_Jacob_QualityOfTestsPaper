/*
 * This file was automatically generated by EvoSuite
 */

package common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import common.Map;

@RunWith(EvoSuiteRunner.class)
public class MapEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 common.Map.<init>(Ljava/lang/String;ZZZ)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Map map0 = null;
      try {
        map0 = new Map("ua)St5,D=])$Yi)x8j", false, false, false);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class common.MapReader
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 common.Map.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Map map0 = null;
      try {
        map0 = new Map("maps empty?: ");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class common.MapReader
         */
      }
  }
}
