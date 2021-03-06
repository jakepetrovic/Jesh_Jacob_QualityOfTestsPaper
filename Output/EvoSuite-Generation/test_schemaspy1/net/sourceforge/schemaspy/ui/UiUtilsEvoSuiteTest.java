/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.awt.RenderingHints;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import net.sourceforge.schemaspy.ui.UiUtils;

public class UiUtilsEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      UiUtils uiUtils0 = new UiUtils();
      assertNotNull(uiUtils0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: root-Branch
   * 2 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnHeaderWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I8 Branch 1 IFNONNULL L36 - false
   */
  @Test
  public void test1()  throws Throwable  {
      TableColumn tableColumn0 = new TableColumn(510);
      // Undeclared exception!
      try {
        UiUtils.getPreferredColumnWidth((JTable) null, tableColumn0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnHeaderWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I8 Branch 1 IFNONNULL L36 - true
   * 2 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TableColumn tableColumn0 = new TableColumn(510);
      DefaultTableCellRenderer defaultTableCellRenderer0 = new DefaultTableCellRenderer();
      tableColumn0.setHeaderRenderer((TableCellRenderer) defaultTableCellRenderer0);
      // Undeclared exception!
      try {
        UiUtils.getPreferredColumnWidth((JTable) null, tableColumn0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.getWidestCellInColumn(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I17 Branch 2 IF_ICMPGE L46 - true
   */
  @Test
  public void test3()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      JTable jTable0 = new JTable(vector0, vector0);
      TableColumn tableColumn0 = new TableColumn(510);
      int int0 = UiUtils.getWidestCellInColumn(jTable0, tableColumn0);
      assertEquals(0, int0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.getWidestCellInColumn(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I17 Branch 2 IF_ICMPGE L46 - false
   */
  @Test
  public void test4()  throws Throwable  {
      Object[][] objectArray0 = new Object[9][7];
      Object[] objectArray1 = new Object[7];
      Object object0 = RenderingHints.VALUE_COLOR_RENDER_QUALITY;
      objectArray1[0] = object0;
      objectArray1[1] = object0;
      objectArray1[2] = objectArray1[1];
      objectArray1[3] = objectArray1[2];
      objectArray1[4] = objectArray1[0];
      objectArray1[5] = objectArray1[3];
      objectArray1[6] = objectArray1[3];
      objectArray0[0] = objectArray1;
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = objectArray0[1];
      JTable jTable0 = new JTable(objectArray0, objectArray0[2]);
      TableColumn tableColumn0 = new TableColumn(1855);
      // Undeclared exception!
      try {
        UiUtils.getWidestCellInColumn(jTable0, tableColumn0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1855 >= 7
         */
      }
  }
}
