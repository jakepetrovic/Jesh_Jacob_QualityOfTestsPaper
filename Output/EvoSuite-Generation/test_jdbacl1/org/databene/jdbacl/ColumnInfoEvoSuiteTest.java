/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.databene.jdbacl.ColumnInfo;

public class ColumnInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.databene.jdbacl.ColumnInfo.toString()Ljava/lang/String;: root-Branch
   * 2 org.databene.jdbacl.ColumnInfo.<init>(Ljava/lang/String;ILjava/lang/Class;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = ColumnInfo.class;
      ColumnInfo columnInfo0 = new ColumnInfo("", (-1), class0);
      String string0 = columnInfo0.toString();
      assertNotNull(string0);
      assertEquals(": class org.databene.jdbacl.ColumnInfo", string0);
  }
}
