package net.sourceforge.schemaspy.view;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import net.sourceforge.schemaspy.model.Database;
import org.junit.*;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import static org.junit.Assert.*;

/**
 * The class <code>DotConnectorTest</code> contains tests for the class <code>{@link DotConnector}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DotConnectorTest {
	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_1()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		boolean implied = false;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_2()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		boolean implied = true;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_3()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		boolean implied = false;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_4()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		boolean implied = true;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_5()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		boolean implied = false;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_6()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		boolean implied = true;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_7()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		boolean implied = false;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the DotConnector(TableColumn,TableColumn,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDotConnector_8()
		throws Exception {
		TableColumn parentColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		TableColumn childColumn = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		boolean implied = true;

		DotConnector result = new DotConnector(parentColumn, childColumn, implied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DotConnectorTest.class);
	}
}