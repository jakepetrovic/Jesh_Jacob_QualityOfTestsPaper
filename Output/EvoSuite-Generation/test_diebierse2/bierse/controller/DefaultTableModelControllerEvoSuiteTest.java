/*
 * This file was automatically generated by EvoSuite
 */

package bierse.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.controller.DefaultTableModelController;
import bierse.model.Model;
import bierse.view.IDrinkSellView;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DefaultTableModelControllerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 bierse.controller.DefaultTableModelController.tableChanged(Ljavax/swing/event/TableModelEvent;)V: I8 Branch 1 IFLT L24 - true
   * 2 bierse.controller.DefaultTableModelController.<init>(Lbierse/model/Model;Lbierse/view/IDrinkSellView;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Object[][] objectArray0 = new Object[10][4];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[4]);
      TableModelEvent tableModelEvent0 = new TableModelEvent((TableModel) defaultTableModel0, (-817), (-817), (-817), (-817));
      defaultTableModelController0.tableChanged(tableModelEvent0);
      assertEquals(-817, tableModelEvent0.getColumn());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 bierse.controller.DefaultTableModelController.tableChanged(Ljavax/swing/event/TableModelEvent;)V: I8 Branch 1 IFLT L24 - false
   * 2 bierse.controller.DefaultTableModelController.<init>(Lbierse/model/Model;Lbierse/view/IDrinkSellView;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Object[][] objectArray0 = new Object[10][4];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[4]);
      TableModelEvent tableModelEvent0 = new TableModelEvent((TableModel) defaultTableModel0);
      // Undeclared exception!
      try {
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}