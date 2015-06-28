/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.sourceforge.schemaspy.ui.DbConfigTableModel;
import net.sourceforge.schemaspy.ui.DirectoryCellEditor;

public class DirectoryCellEditorEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getCellEditorValue()Ljava/lang/Object;: root-Branch
   * 2 net.sourceforge.schemaspy.ui.DirectoryCellEditor$1.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;)V: root-Branch
   * 3 net.sourceforge.schemaspy.ui.DirectoryCellEditor$2.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Ljavax/swing/JFileChooser;)V: root-Branch
   * 4 net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;Ljava/io/File;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      DirectoryCellEditor directoryCellEditor0 = new DirectoryCellEditor(dbConfigTableModel0, (File) null);
      assertNotNull(directoryCellEditor0);
      
      String string0 = (String)directoryCellEditor0.getCellEditorValue();
      assertEquals("outputDir", string0);
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getTableCellEditorComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZII)Ljava/awt/Component;: I22 Branch 2 IFNONNULL L99 - false
   * 2 net.sourceforge.schemaspy.ui.DirectoryCellEditor$1.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;)V: root-Branch
   * 3 net.sourceforge.schemaspy.ui.DirectoryCellEditor$2.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Ljavax/swing/JFileChooser;)V: root-Branch
   * 4 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getTableCellRendererComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;: root-Branch
   * 5 net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;Ljava/io/File;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      File file0 = new File("W=^x2Txwo$6", "W=^x2Txwo$6");
      DirectoryCellEditor directoryCellEditor0 = new DirectoryCellEditor(dbConfigTableModel0, file0);
      JTable jTable0 = new JTable((TableModel) dbConfigTableModel0);
      // Undeclared exception!
      try {
        directoryCellEditor0.getTableCellRendererComponent(jTable0, (Object) null, false, false, 621, 1611);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 621, Size: 5
         */
      }
  }
}