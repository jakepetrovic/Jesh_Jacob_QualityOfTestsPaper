/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.jdbc.DBIndexInfo;

public class DBIndexInfoEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.databene.jdbacl.model.jdbc.DBIndexInfo.toString()Ljava/lang/String;: root-Branch
   * 2 org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;ZSLjava/lang/String;Ljava/lang/Boolean;IILjava/lang/String;)V: I63 Branch 1 IF_ICMPEQ L62 - true
   */
  @Test
  public void test0()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("", "", (short)1, "", true, (short)1, "", (Boolean) true, (int) (short)1, (int) (short)1, "");
      assertNotNull(dBIndexInfo0);
      
      // Undeclared exception!
      try {
        dBIndexInfo0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * org/databene/commons/ArrayFormat
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;ZSLjava/lang/String;Ljava/lang/Boolean;IILjava/lang/String;)V: I63 Branch 1 IF_ICMPEQ L62 - false
   */
  @Test
  public void test1()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = null;
      try {
        dBIndexInfo0 = new DBIndexInfo("yGwOFWUn*9I6'Xo", "yGwOFWUn*9I6'Xo", (short) (-1859), "yGwOFWUn*9I6'Xo", true, (short) (-1859), "yGwOFWUn*9I6'Xo", (Boolean) true, (int) (short) (-1859), (int) (short) (-1859), "yGwOFWUn*9I6'Xo");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * ordinalPosition is expected to be 1, found: -1859
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I12 Branch 2 IF_ICMPNE L68 - true
   * 2 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I27 Branch 3 IF_ICMPGT L71 - false
   * 3 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I36 Branch 4 IFGT L71 - false
   */
  @Test
  public void test2()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("Z69w,+'eo.@wS sm", "Z69w,+'eo.@wS sm", (short)1, (String) null, false, (short)1, "Z69w,+'eo.@wS sm", boolean0, (int) (short)1, (int) (short)1, (String) null);
      assertNotNull(dBIndexInfo0);
      
      // Undeclared exception!
      try {
        dBIndexInfo0.addColumn((short)1, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * ordinalPosition is expected to be 2, found: 1
         */
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I27 Branch 3 IF_ICMPGT L71 - true
   */
  @Test
  public void test3()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("Hxfv6b-`_", "Hxfv6b-`_", (short) (-1524), "Hxfv6b-`_", true, (short)1, "Hxfv6b-`_", (Boolean) true, (int) (short) (-1524), (int) (short) (-1524), "Hxfv6b-`_");
      assertNotNull(dBIndexInfo0);
      
      // Undeclared exception!
      try {
        dBIndexInfo0.addColumn((short)1386, "Hxfv6b-`_");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * ordinalPosition is expected to be 2, found: 1386
         */
      }
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I36 Branch 4 IFGT L71 - true
   * 2 org.databene.jdbacl.model.jdbc.DBIndexInfo.<init>(Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;ZSLjava/lang/String;Ljava/lang/Boolean;IILjava/lang/String;)V: I63 Branch 1 IF_ICMPEQ L62 - true
   * 3 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I12 Branch 2 IF_ICMPNE L68 - true
   * 4 org.databene.jdbacl.model.jdbc.DBIndexInfo.addColumn(SLjava/lang/String;)V: I27 Branch 3 IF_ICMPGT L71 - false
   */
  @Test
  public void test4()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("yGwOFWUn*9I6'Xo", "yGwOFWUn*9I6'Xo", (short) (-1859), "yGwOFWUn*9I6'Xo", true, (short)1, "yGwOFWUn*9I6'Xo", (Boolean) true, (int) (short)1, (int) (short) (-1859), "yGwOFWUn*9I6'Xo");
      assertNotNull(dBIndexInfo0);
      
      dBIndexInfo0.addColumn((short)1, "yGwOFWUn*9I6'Xo");
      assertEquals(1, dBIndexInfo0.cardinality);
      assertEquals(true, dBIndexInfo0.unique);
      assertEquals((short) (-1859), dBIndexInfo0.type);
      assertEquals((-1859), dBIndexInfo0.pages);
  }
}
