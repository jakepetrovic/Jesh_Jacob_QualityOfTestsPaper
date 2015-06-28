/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
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
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: root-Branch
   * 2 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnHeaderWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I8 Branch 1 IFNONNULL L36 - false
   * 3 net.sourceforge.schemaspy.ui.UiUtils.getWidestCellInColumn(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I17 Branch 2 IF_ICMPGE L46 - false
   */
  @Test
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 658);
      JTable jTable0 = new JTable((TableModel) defaultTableModel0);
      TableColumn tableColumn0 = new TableColumn(658, 658);
      // Undeclared exception!
      try {
        UiUtils.getPreferredColumnWidth(jTable0, tableColumn0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 658 >= 1
         */
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.ui.UiUtils.getWidestCellInColumn(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I17 Branch 2 IF_ICMPGE L46 - true
   * 2 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: root-Branch
   * 3 net.sourceforge.schemaspy.ui.UiUtils.getPreferredColumnHeaderWidth(Ljavax/swing/JTable;Ljavax/swing/table/TableColumn;)I: I8 Branch 1 IFNONNULL L36 - false
   */
  @Test
  public void test2()  throws Throwable  {
      JTable jTable0 = new JTable();
      TableColumn tableColumn0 = new TableColumn(972);
      int int0 = UiUtils.getPreferredColumnWidth(jTable0, tableColumn0);
      assertEquals(0, int0);
  }
}