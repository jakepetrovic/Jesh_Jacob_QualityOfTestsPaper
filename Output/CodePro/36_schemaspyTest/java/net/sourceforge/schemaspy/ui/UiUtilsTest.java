package net.sourceforge.schemaspy.ui;

import java.io.File;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UiUtilsTest</code> contains tests for the class <code>{@link UiUtils}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class UiUtilsTest {
	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_1()
		throws Exception {
		JTable table = new JTable();
		TableColumn col = new TableColumn();

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_2()
		throws Exception {
		JTable table = new JTable(0, 0);
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_3()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_4()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_5()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0, 0, new DefaultTableCellRenderer(), new DefaultCellEditor(new JCheckBox("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_6()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(1, 1);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_7()
		throws Exception {
		JTable table = new JTable(new Vector(0), new Vector(0));
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_8()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_9()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_10()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), new DefaultListSelectionModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_11()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), (ListSelectionModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_12()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_13()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null, (ListSelectionModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_14()
		throws Exception {
		JTable table = new JTable(0, 0);
		TableColumn col = new TableColumn();

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_15()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_16()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_17()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_18()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(0, 0, new DefaultTableCellRenderer(), new DefaultCellEditor(new JCheckBox("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_19()
		throws Exception {
		JTable table = new JTable(new Vector(0), new Vector(0));
		TableColumn col = new TableColumn(1, 1);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_20()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_21()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_22()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), new DefaultListSelectionModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_23()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), (ListSelectionModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_24()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_25()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null, (ListSelectionModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_26()
		throws Exception {
		JTable table = new JTable();
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_27()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn();

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_28()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_29()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnHeaderWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnHeaderWidth_30()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getPreferredColumnHeaderWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_1()
		throws Exception {
		JTable table = new JTable();
		TableColumn col = new TableColumn();

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_2()
		throws Exception {
		JTable table = new JTable(0, 0);
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_3()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_4()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_5()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0, 0, new DefaultTableCellRenderer(), new DefaultCellEditor(new JCheckBox("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(164, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_6()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(1, 1);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_7()
		throws Exception {
		JTable table = new JTable(new Vector(0), new Vector(0));
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_8()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_9()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_10()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), new DefaultListSelectionModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_11()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), (ListSelectionModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_12()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_13()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null, (ListSelectionModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_14()
		throws Exception {
		JTable table = new JTable(0, 0);
		TableColumn col = new TableColumn();

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_15()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_16()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_17()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(168, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_18()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(0, 0, new DefaultTableCellRenderer(), new DefaultCellEditor(new JCheckBox("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_19()
		throws Exception {
		JTable table = new JTable(new Vector(0), new Vector(0));
		TableColumn col = new TableColumn(1, 1);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_20()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_21()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_22()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), new DefaultListSelectionModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_23()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), (ListSelectionModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_24()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(25, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_25()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null, (ListSelectionModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(25, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_26()
		throws Exception {
		JTable table = new JTable();
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_27()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn();

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_28()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_29()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(166, result);
	}

	/**
	 * Run the int getPreferredColumnWidth(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPreferredColumnWidth_30()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getPreferredColumnWidth(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_1()
		throws Exception {
		JTable table = new JTable();
		TableColumn col = new TableColumn();

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_2()
		throws Exception {
		JTable table = new JTable(0, 0);
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_3()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_4()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_5()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0, 0, new DefaultTableCellRenderer(), new DefaultCellEditor(new JCheckBox("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(169, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_6()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(1, 1);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_7()
		throws Exception {
		JTable table = new JTable(new Vector(0), new Vector(0));
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_8()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_9()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_10()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), new DefaultListSelectionModel());
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_11()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), (ListSelectionModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_12()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_13()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null, (ListSelectionModel) null);
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_14()
		throws Exception {
		JTable table = new JTable(0, 0);
		TableColumn col = new TableColumn();

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_15()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_16()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_17()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(163, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_18()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(0, 0, new DefaultTableCellRenderer(), new DefaultCellEditor(new JCheckBox("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_19()
		throws Exception {
		JTable table = new JTable(new Vector(0), new Vector(0));
		TableColumn col = new TableColumn(1, 1);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_20()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_21()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_22()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), new DefaultListSelectionModel());
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_23()
		throws Exception {
		JTable table = new JTable(new DefaultTableModel(), new DefaultTableColumnModel(), (ListSelectionModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_24()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(25, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_25()
		throws Exception {
		JTable table = new JTable(new DbConfigTableModel(), (TableColumnModel) null, (ListSelectionModel) null);
		TableColumn col = new TableColumn(1, 1, new javax.swing.table.DefaultTableCellRenderer.UIResource(), new DefaultCellEditor(new JTextField("")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(25, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_26()
		throws Exception {
		JTable table = new JTable();
		TableColumn col = new TableColumn(7, 7, new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")), new DirectoryCellEditor(new DbConfigTableModel(), File.createTempFile("", "")));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_27()
		throws Exception {
		JTable table = new JTable(1, 1);
		TableColumn col = new TableColumn();

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_28()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object(), null}}, new Object[] {new Object(), null});
		TableColumn col = new TableColumn(-1, -1, new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)), new DirectoryCellEditor((DbConfigTableModel) null, File.createTempFile("", "", (File) null)));

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.swing.JTable$1.getColumnName(JTable.java:687)
		//       at javax.swing.JTable.addColumn(JTable.java:2801)
		//       at javax.swing.JTable.createDefaultColumnsFromModel(JTable.java:1289)
		//       at javax.swing.JTable.tableChanged(JTable.java:4386)
		//       at javax.swing.JTable.setModel(JTable.java:3688)
		//       at javax.swing.JTable.<init>(JTable.java:634)
		//       at javax.swing.JTable.<init>(JTable.java:575)
		//       at javax.swing.JTable.<init>(JTable.java:686)
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_29()
		throws Exception {
		JTable table = new JTable(new Object[][] {{new Object()}}, new Object[] {new Object()});
		TableColumn col = new TableColumn(0);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(170, result);
	}

	/**
	 * Run the int getWidestCellInColumn(JTable,TableColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetWidestCellInColumn_30()
		throws Exception {
		JTable table = new JTable(new Vector(), new Vector());
		TableColumn col = new TableColumn(0, 0);

		int result = UiUtils.getWidestCellInColumn(table, col);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UiUtilsTest.class);
	}
}