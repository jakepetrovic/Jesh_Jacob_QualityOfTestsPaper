/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.sourceforge.schemaspy.ui.DbConfigTableModel;
import net.sourceforge.schemaspy.ui.DirectoryCellEditor;

public class DirectoryCellEditorEvoSuiteTest {


  //Test case number: 0
  /*
   * 7 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DirectoryCellEditor$1.removeUpdate(Ljavax/swing/event/DocumentEvent;)V: root-Branch
   * 2 net.sourceforge.schemaspy.ui.DirectoryCellEditor$1.insertUpdate(Ljavax/swing/event/DocumentEvent;)V: root-Branch
   * 3 net.sourceforge.schemaspy.ui.DirectoryCellEditor$1.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;)V: root-Branch
   * 4 net.sourceforge.schemaspy.ui.DirectoryCellEditor$2.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Ljavax/swing/JFileChooser;)V: root-Branch
   * 5 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getTableCellRendererComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;: root-Branch
   * 6 net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;Ljava/io/File;)V: root-Branch
   * 7 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getTableCellEditorComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZII)Ljava/awt/Component;: I22 Branch 2 IFNONNULL L99 - true
   */
  @Test
  public void test0()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      DirectoryCellEditor directoryCellEditor0 = new DirectoryCellEditor(dbConfigTableModel0, (File) null);
      File file0 = new File((File) null, "DWgwmleap2U");
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) file0;
      Object[][] objectArray1 = new Object[2][6];
      objectArray1[0] = objectArray0;
      JTable jTable0 = new JTable(objectArray1, objectArray1[0]);
      directoryCellEditor0.getTableCellEditorComponent((JTable) null, objectArray0[0], true, 0, 0);
      // Undeclared exception!
      try {
        directoryCellEditor0.getTableCellRendererComponent(jTable0, objectArray0[0], false, false, (-1304), 1539);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getCellEditorValue()Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DirectoryCellEditor directoryCellEditor0 = new DirectoryCellEditor((DbConfigTableModel) null, (File) null);
      // Undeclared exception!
      try {
        directoryCellEditor0.getCellEditorValue();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getTableCellEditorComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZII)Ljava/awt/Component;: I22 Branch 2 IFNONNULL L99 - false
   * 2 net.sourceforge.schemaspy.ui.DirectoryCellEditor$1.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;)V: root-Branch
   * 3 net.sourceforge.schemaspy.ui.DirectoryCellEditor$2.<init>(Lnet/sourceforge/schemaspy/ui/DirectoryCellEditor;Ljavax/swing/JFileChooser;)V: root-Branch
   * 4 net.sourceforge.schemaspy.ui.DirectoryCellEditor.getTableCellRendererComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;: root-Branch
   * 5 net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(Lnet/sourceforge/schemaspy/ui/DbConfigTableModel;Ljava/io/File;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
      DirectoryCellEditor directoryCellEditor0 = new DirectoryCellEditor(dbConfigTableModel0, (File) null);
      assertNotNull(directoryCellEditor0);
      
      JTable jTable0 = new JTable(580, 0);
      JPanel jPanel0 = (JPanel)directoryCellEditor0.getTableCellRendererComponent(jTable0, (Object) null, false, false, 0, 1);
      assertEquals("Directory to generate HTML output to", jPanel0.getToolTipText());
      assertNotNull(jPanel0);
  }
}
