/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.util.DbSpecificConfig;

public class DbSpecificConfigEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.util.DbSpecificConfig.getOptions()Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.util.DbSpecificConfig.<init>(Ljava/lang/String;)V: root-Branch
   * 3 net.sourceforge.schemaspy.util.DbSpecificConfig.dumpUsage()V: I41 Branch 5 IFEQ L107 - true
   */
  @Test
  public void test0()  throws Throwable  {
      DbSpecificConfig dbSpecificConfig0 = new DbSpecificConfig("b");
      dbSpecificConfig0.dumpUsage();
      assertEquals("java.io.FileNotFoundException: b (No such file or directory)", dbSpecificConfig0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.util.DbSpecificConfig.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DbSpecificConfig dbSpecificConfig0 = new DbSpecificConfig("b");
      String string0 = dbSpecificConfig0.toString();
      assertEquals("java.io.FileNotFoundException: b (No such file or directory)", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.util.DbSpecificConfig.getConfig()Lnet/sourceforge/schemaspy/Config;: root-Branch
   * 2 net.sourceforge.schemaspy.util.DbSpecificConfig.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DbSpecificConfig dbSpecificConfig0 = new DbSpecificConfig("b");
      Config config0 = dbSpecificConfig0.getConfig();
      assertEquals("", config0.getRenderer());
  }
}
