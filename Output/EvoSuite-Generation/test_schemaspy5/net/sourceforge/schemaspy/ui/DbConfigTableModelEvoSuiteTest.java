/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sourceforge.schemaspy.ui.DbConfigTableModel;
import net.sourceforge.schemaspy.util.DbSpecificConfig;

public class DbConfigTableModelEvoSuiteTest {


  //Test case number: 0
  /*
   * 7 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescription(I)Ljava/lang/String;: root-Branch
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.<init>()V: root-Branch
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.getConfigProps()[Ljava/beans/PropertyDescriptor;: root-Branch
   * 4 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I3 Branch 4 IFNONNULL L85 - true
   * 5 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I17 Branch 5 IF_ICMPGE L88 - false
   * 6 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I30 Branch 6 IFLE L90 - true
   * 7 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I30 Branch 6 IFLE L90 - false
   */
  @Test
  public void test0()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      String string0 = dbConfigTableModel0.getDescription(0);
      assertEquals(5, dbConfigTableModel0.getRowCount());
      assertNotNull(string0);
      assertEquals("Directory to generate HTML output to", string0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getColumnCount()I: root-Branch
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.getColumnName(I)Ljava/lang/String;: I3 Branch 2 LOOKUPSWITCH L70 Case 0 - true
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.getColumnName(I)Ljava/lang/String;: I3 Branch 2 LOOKUPSWITCH L70 Case 0 - false
   * 4 net.sourceforge.schemaspy.ui.DbConfigTableModel.getColumnName(I)Ljava/lang/String;: I3 Branch 3 LOOKUPSWITCH L70 Default-Case - true
   * 5 net.sourceforge.schemaspy.ui.DbConfigTableModel.getColumnName(I)Ljava/lang/String;: I3 Branch 3 LOOKUPSWITCH L70 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      dbConfigTableModel0.findColumn("D(Veylg&@;");
      assertEquals(5, dbConfigTableModel0.getRowCount());
      assertEquals(2, dbConfigTableModel0.getColumnCount());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getClass(I)Ljava/lang/Class;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      // Undeclared exception!
      try {
        dbConfigTableModel0.getClass(860);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 860, Size: 5
         */
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getRowCount()I: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      int int0 = dbConfigTableModel0.getRowCount();
      assertEquals(5, int0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.setDbSpecificConfig(Lnet/sourceforge/schemaspy/util/DbSpecificConfig;)V: I29 Branch 1 IFEQ L59 - true
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.removeDbSpecificOptions()V: I10 Branch 7 IFEQ L112 - true
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.removeDbSpecificOptions()V: I10 Branch 7 IFEQ L112 - false
   * 4 net.sourceforge.schemaspy.ui.DbConfigTableModel.removeDbSpecificOptions()V: I22 Branch 8 IFNULL L114 - true
   */
  @Test
  public void test4()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      DbSpecificConfig dbSpecificConfig0 = new DbSpecificConfig("");
      dbConfigTableModel0.setDbSpecificConfig(dbSpecificConfig0);
      assertEquals(5, dbConfigTableModel0.getRowCount());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.isCellEditable(II)Z: I4 Branch 9 IF_ICMPEQ L135 - true
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.isCellEditable(II)Z: I17 Branch 10 IFNULL L138 - false
   */
  @Test
  public void test5()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      boolean boolean0 = dbConfigTableModel0.isCellEditable(1, 1);
      assertEquals(5, dbConfigTableModel0.getRowCount());
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.isCellEditable(II)Z: I4 Branch 9 IF_ICMPEQ L135 - false
   */
  @Test
  public void test6()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      boolean boolean0 = dbConfigTableModel0.isCellEditable(1091, 0);
      assertEquals(false, boolean0);
      assertEquals(5, dbConfigTableModel0.getRowCount());
  }

  //Test case number: 7
  /*
   * 9 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 11 LOOKUPSWITCH L146 Case 0 - true
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 12 LOOKUPSWITCH L146 Case 1 - false
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 13 LOOKUPSWITCH L146 Default-Case - false
   * 4 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I11 Branch 15 IF_ACMPEQ L169 - false
   * 5 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I13 Branch 16 IFNULL L169 - false
   * 6 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I15 Branch 17 IFNULL L169 - false
   * 7 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I19 Branch 18 IFNE L169 - false
   * 8 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I32 Branch 19 IFEQ L173 - false
   * 9 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I37 Branch 20 IFEQ L173 - true
   */
  @Test
  public void test7()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      // Undeclared exception!
      try {
        dbConfigTableModel0.setValueAt((Object) "media", 0, 0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * java.lang.IllegalArgumentException: java.lang.ClassCastException@163ad9e2
         */
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 11 LOOKUPSWITCH L146 Case 0 - false
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 13 LOOKUPSWITCH L146 Default-Case - true
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I11 Branch 15 IF_ACMPEQ L169 - true
   */
  @Test
  public void test8()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      dbConfigTableModel0.setValueAt((Object) null, 0, 127);
      assertEquals(5, dbConfigTableModel0.getRowCount());
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 12 LOOKUPSWITCH L146 Case 1 - true
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I40 Branch 14 IFEQ L155 - false
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I15 Branch 17 IFNULL L169 - true
   * 4 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I32 Branch 19 IFEQ L173 - true
   * 5 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I13 Branch 16 IFNULL L169 - false
   * 6 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 11 LOOKUPSWITCH L146 Case 0 - false
   */
  @Test
  public void test9()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      // Undeclared exception!
      try {
        dbConfigTableModel0.setValueAt((Object) dbConfigTableModel0, 2, 1);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * java.lang.IllegalArgumentException: java.lang.ClassCastException@23bd18ea
         */
      }
  }

  //Test case number: 10
  /*
   * 12 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I13 Branch 16 IFNULL L169 - true
   * 2 net.sourceforge.schemaspy.ui.DbConfigTableModel.<init>()V: root-Branch
   * 3 net.sourceforge.schemaspy.ui.DbConfigTableModel.getConfigProps()[Ljava/beans/PropertyDescriptor;: root-Branch
   * 4 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I3 Branch 4 IFNONNULL L85 - true
   * 5 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I17 Branch 5 IF_ICMPGE L88 - false
   * 6 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I30 Branch 6 IFLE L90 - true
   * 7 net.sourceforge.schemaspy.ui.DbConfigTableModel.getDescriptor(Ljava/lang/String;Ljava/lang/String;[Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyDescriptor;: I30 Branch 6 IFLE L90 - false
   * 8 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I11 Branch 15 IF_ACMPEQ L169 - false
   * 9 net.sourceforge.schemaspy.ui.DbConfigTableModel.setValueAt(Ljava/lang/Object;II)V: I32 Branch 19 IFEQ L173 - true
   * 10 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 11 LOOKUPSWITCH L146 Case 0 - true
   * 11 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 12 LOOKUPSWITCH L146 Case 1 - false
   * 12 net.sourceforge.schemaspy.ui.DbConfigTableModel.getValueAt(II)Ljava/lang/Object;: I11 Branch 13 LOOKUPSWITCH L146 Default-Case - false
   */
  @Test
  public void test10()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      assertNotNull(dbConfigTableModel0);
      
      dbConfigTableModel0.setValueAt((Object) null, 0, 0);
      assertEquals(5, dbConfigTableModel0.getRowCount());
  }
}
