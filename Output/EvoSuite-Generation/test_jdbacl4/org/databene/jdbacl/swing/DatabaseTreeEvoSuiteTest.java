/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Vector;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import org.databene.jdbacl.swing.DatabaseTree;

public class DatabaseTreeEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.databene.jdbacl.swing.DatabaseTree.<init>(Ljavax/swing/tree/TreeModel;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 0);
      Vector<Object> vector0 = defaultTableModel0.getDataVector();
      JTree jTree0 = new JTree(vector0);
      DefaultTreeModel defaultTreeModel0 = (DefaultTreeModel)jTree0.getModel();
      DatabaseTree databaseTree0 = new DatabaseTree((TreeModel) defaultTreeModel0);
  }
}
