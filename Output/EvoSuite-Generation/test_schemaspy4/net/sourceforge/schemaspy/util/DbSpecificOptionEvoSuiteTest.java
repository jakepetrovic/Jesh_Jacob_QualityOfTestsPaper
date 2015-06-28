/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sourceforge.schemaspy.util.DbSpecificOption;

public class DbSpecificOptionEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.util.DbSpecificOption.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 2 net.sourceforge.schemaspy.util.DbSpecificOption.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DbSpecificOption dbSpecificOption0 = new DbSpecificOption("", "");
      assertEquals("DbSpecificOption name: '' value: 'null' description: ''", dbSpecificOption0.toString());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.util.DbSpecificOption.getName()Ljava/lang/String;: root-Branch
   * 2 net.sourceforge.schemaspy.util.DbSpecificOption.toString()Ljava/lang/String;: root-Branch
   * 3 net.sourceforge.schemaspy.util.DbSpecificOption.getDescription()Ljava/lang/String;: root-Branch
   * 4 net.sourceforge.schemaspy.util.DbSpecificOption.getValue()Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DbSpecificOption dbSpecificOption0 = new DbSpecificOption("EL~I", "EL~I", "EL~I");
      String string0 = dbSpecificOption0.toString();
      assertNotNull(string0);
      assertEquals("DbSpecificOption name: 'EL~I' value: 'EL~I' description: 'EL~I'", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.util.DbSpecificOption.setValue(Ljava/lang/Object;)V: root-Branch
   * 2 net.sourceforge.schemaspy.util.DbSpecificOption.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DbSpecificOption dbSpecificOption0 = new DbSpecificOption("EL~I", "EL~I", "EL~I");
      dbSpecificOption0.setValue((Object) "");
      assertEquals("EL~I", dbSpecificOption0.getName());
  }
}
