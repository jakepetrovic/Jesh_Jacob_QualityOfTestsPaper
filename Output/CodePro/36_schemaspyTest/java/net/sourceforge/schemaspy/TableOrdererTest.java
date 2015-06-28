package net.sourceforge.schemaspy;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import net.sourceforge.schemaspy.model.TableColumn;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TableOrdererTest</code> contains tests for the class <code>{@link TableOrderer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:21 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableOrdererTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TableOrderer
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	private TableOrderer fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableOrderer
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public TableOrderer getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new TableOrderer();
		}
		return fixture;
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_1()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_2()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_3()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_4()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_5()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_6()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_7()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		ArrayList<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_8()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_9()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_10()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_11()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_12()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_13()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_14()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		HashSet<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_15()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_16()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_17()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_18()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_19()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_20()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_21()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LinkedList<ForeignKeyConstraint> recursiveConstraints = new LinkedList<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_22()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_23()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_24()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), 0, 0));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_25()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		Collection<Table> tables = new ArrayList<Table>();
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null), -1, -1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_26()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		Collection<Table> tables = new HashSet<Table>();
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null)));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_27()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		Collection<Table> tables = new LinkedList<Table>();
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null), 1, 1));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_28()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		Collection<Table> tables = new TreeSet<Table>();
		TreeSet<ForeignKeyConstraint> recursiveConstraints = new TreeSet<ForeignKeyConstraint>();
		recursiveConstraints.add(new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 7, 7));

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.model.ForeignKeyConstraint.<init>(ForeignKeyConstraint.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_29()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the List<Table> getTablesOrderedByRI(Collection<Table>,Collection<ForeignKeyConstraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetTablesOrderedByRI_fixture_30()
		throws Exception {
		TableOrderer fixture2 = getFixture();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		Collection<ForeignKeyConstraint> recursiveConstraints = new HashSet<ForeignKeyConstraint>();

		List<Table> result = fixture2.getTablesOrderedByRI(tables, recursiveConstraints);

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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TableOrdererTest.class);
	}
}