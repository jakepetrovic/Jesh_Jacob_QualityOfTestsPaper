package net.sourceforge.schemaspy;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import net.sourceforge.schemaspy.model.ImpliedForeignKeyConstraint;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import net.sourceforge.schemaspy.model.RailsForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import java.util.LinkedList;
import java.util.List;
import net.sourceforge.schemaspy.model.Database;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;
import net.sourceforge.schemaspy.model.TableColumn;
import org.junit.*;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import static org.junit.Assert.*;

/**
 * The class <code>DbAnalyzerTest</code> contains tests for the class <code>{@link DbAnalyzer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DbAnalyzerTest {
	/**
	 * Run the void dumpResultSetRow(ResultSet,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDumpResultSetRow_1()
		throws Exception {
		ResultSet rs = null;
		String description = "";

		DbAnalyzer.dumpResultSetRow(rs, description);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.dumpResultSetRow(DbAnalyzer.java:401)
	}

	/**
	 * Run the void dumpResultSetRow(ResultSet,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDumpResultSetRow_2()
		throws Exception {
		ResultSet rs = null;
		String description = "0123456789";

		DbAnalyzer.dumpResultSetRow(rs, description);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.dumpResultSetRow(DbAnalyzer.java:401)
	}

	/**
	 * Run the List<String> getCatalogs(DatabaseMetaData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetCatalogs_1()
		throws Exception {
		DatabaseMetaData meta = null;

		List<String> result = DbAnalyzer.getCatalogs(meta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getCatalogs(DbAnalyzer.java:318)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getDefaultNullStringColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDefaultNullStringColumns_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<TableColumn> result = DbAnalyzer.getDefaultNullStringColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ForeignKeyConstraint> getForeignKeyConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<ForeignKeyConstraint> result = DbAnalyzer.getForeignKeyConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ImpliedForeignKeyConstraint> getImpliedConstraints(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetImpliedConstraints_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<ImpliedForeignKeyConstraint> result = DbAnalyzer.getImpliedConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> getMustBeUniqueNullableColumns(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMustBeUniqueNullableColumns_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<TableColumn> result = DbAnalyzer.getMustBeUniqueNullableColumns(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getOrphans(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetOrphans_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<Table> result = DbAnalyzer.getOrphans(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getPopulatedSchemas(DatabaseMetaData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPopulatedSchemas_1()
		throws Exception {
		DatabaseMetaData meta = null;

		List<String> result = DbAnalyzer.getPopulatedSchemas(meta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getSchemas(DbAnalyzer.java:335)
		//       at net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(DbAnalyzer.java:365)
		//       at net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(DbAnalyzer.java:350)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getPopulatedSchemas(DatabaseMetaData,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPopulatedSchemas_2()
		throws Exception {
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		boolean isCatalog = false;

		List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getSchemas(DbAnalyzer.java:335)
		//       at net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(DbAnalyzer.java:365)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getPopulatedSchemas(DatabaseMetaData,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPopulatedSchemas_3()
		throws Exception {
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		boolean isCatalog = true;

		List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getCatalogs(DbAnalyzer.java:318)
		//       at net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(DbAnalyzer.java:365)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getPopulatedSchemas(DatabaseMetaData,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPopulatedSchemas_4()
		throws Exception {
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		boolean isCatalog = false;

		List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getSchemas(DbAnalyzer.java:335)
		//       at net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(DbAnalyzer.java:365)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getPopulatedSchemas(DatabaseMetaData,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPopulatedSchemas_5()
		throws Exception {
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		boolean isCatalog = true;

		List<String> result = DbAnalyzer.getPopulatedSchemas(meta, schemaSpec, isCatalog);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getCatalogs(DbAnalyzer.java:318)
		//       at net.sourceforge.schemaspy.DbAnalyzer.getPopulatedSchemas(DbAnalyzer.java:365)
		assertNotNull(result);
	}

	/**
	 * Run the List<RailsForeignKeyConstraint> getRailsConstraints(Map<String,Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRailsConstraints_1()
		throws Exception {
		HashMap<String, Table> tables = new HashMap<String, Table>();
		tables.put("", new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<RailsForeignKeyConstraint> result = DbAnalyzer.getRailsConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<RailsForeignKeyConstraint> getRailsConstraints(Map<String,Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRailsConstraints_2()
		throws Exception {
		HashMap<String, Table> tables = new HashMap<String, Table>();
		tables.put("", new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.put("0123456789", new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<RailsForeignKeyConstraint> result = DbAnalyzer.getRailsConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<RailsForeignKeyConstraint> getRailsConstraints(Map<String,Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRailsConstraints_3()
		throws Exception {
		HashMap<String, Table> tables = new HashMap<String, Table>();
		tables.put("0123456789", new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<RailsForeignKeyConstraint> result = DbAnalyzer.getRailsConstraints(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<RailsForeignKeyConstraint> getRailsConstraints(Map<String,Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetRailsConstraints_4()
		throws Exception {
		Map<String, Table> tables = new HashMap<String, Table>();

		List<RailsForeignKeyConstraint> result = DbAnalyzer.getRailsConstraints(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getSchemas(DatabaseMetaData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetSchemas_1()
		throws Exception {
		DatabaseMetaData meta = null;

		List<String> result = DbAnalyzer.getSchemas(meta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.DbAnalyzer.getSchemas(DbAnalyzer.java:335)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithIncrementingColumnNames(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithIncrementingColumnNames_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<Table> result = DbAnalyzer.getTablesWithIncrementingColumnNames(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithOneColumn(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithOneColumn_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<Table> result = DbAnalyzer.getTablesWithOneColumn(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_7()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_8()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_9()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_10()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_11()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_12()
		throws Exception {
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_13()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_14()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_15()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_16()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_17()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_18()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_19()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_20()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_21()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_22()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_23()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_24()
		throws Exception {
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_25()
		throws Exception {
		Collection<Table> tables = new ArrayList<Table>();

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_26()
		throws Exception {
		Collection<Table> tables = new HashSet<Table>();

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_27()
		throws Exception {
		Collection<Table> tables = new LinkedList<Table>();

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> getTablesWithoutIndexes(Collection<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetTablesWithoutIndexes_28()
		throws Exception {
		Collection<Table> tables = new TreeSet<Table>();

		List<Table> result = DbAnalyzer.getTablesWithoutIndexes(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_1()
		throws Exception {
		ArrayList<TableColumn> columns = new ArrayList<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_2()
		throws Exception {
		ArrayList<TableColumn> columns = new ArrayList<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_3()
		throws Exception {
		ArrayList<TableColumn> columns = new ArrayList<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_4()
		throws Exception {
		LinkedList<TableColumn> columns = new LinkedList<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_5()
		throws Exception {
		LinkedList<TableColumn> columns = new LinkedList<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_6()
		throws Exception {
		LinkedList<TableColumn> columns = new LinkedList<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_7()
		throws Exception {
		Vector<TableColumn> columns = new Vector<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_8()
		throws Exception {
		Vector<TableColumn> columns = new Vector<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_9()
		throws Exception {
		Vector<TableColumn> columns = new Vector<TableColumn>();
		columns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_10()
		throws Exception {
		List<TableColumn> columns = new ArrayList<TableColumn>();

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_11()
		throws Exception {
		List<TableColumn> columns = new LinkedList<TableColumn>();

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<TableColumn> sortColumnsByTable(List<TableColumn>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortColumnsByTable_12()
		throws Exception {
		List<TableColumn> columns = new Vector<TableColumn>();

		List<TableColumn> result = DbAnalyzer.sortColumnsByTable(columns);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_1()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_2()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_3()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_4()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_5()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_6()
		throws Exception {
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_7()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_8()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_9()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_10()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_11()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_12()
		throws Exception {
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_13()
		throws Exception {
		Vector<Table> tables = new Vector<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_14()
		throws Exception {
		Vector<Table> tables = new Vector<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_15()
		throws Exception {
		Vector<Table> tables = new Vector<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_16()
		throws Exception {
		Vector<Table> tables = new Vector<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_17()
		throws Exception {
		Vector<Table> tables = new Vector<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_18()
		throws Exception {
		Vector<Table> tables = new Vector<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_19()
		throws Exception {
		List<Table> tables = new ArrayList<Table>();

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_20()
		throws Exception {
		List<Table> tables = new LinkedList<Table>();

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Table> sortTablesByName(List<Table>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSortTablesByName_21()
		throws Exception {
		List<Table> tables = new Vector<Table>();

		List<Table> result = DbAnalyzer.sortTablesByName(tables);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(DbAnalyzerTest.class);
	}
}