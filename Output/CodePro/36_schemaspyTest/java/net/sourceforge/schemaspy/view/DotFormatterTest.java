package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.Config;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DotFormatterTest</code> contains tests for the class <code>{@link DotFormatter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:18 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DotFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DotFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private DotFormatter fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DotFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public DotFormatter getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = DotFormatter.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the DotFormatter getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		DotFormatter result = DotFormatter.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_1()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("", "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_2()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", 0, "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_3()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_4()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_5()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_6()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_7()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_8()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_9()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_10()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_11()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_12()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_13()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_14()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_15()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_16()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("", "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_17()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", 0, "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_18()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_19()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_20()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_21()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_22()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_23()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_24()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_25()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_26()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_27()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_28()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_29()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeAllRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_30()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeAllRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_31()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = false;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter("", "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_32()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", 0, "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_33()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = true;
		boolean showColumns = true;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_34()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_35()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_36()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_37()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_38()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_39()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = false;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_40()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = true;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_41()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = true;
		boolean showColumns = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_42()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		boolean compact = true;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_43()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = true;
		boolean showColumns = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_44()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Collection<Table> tables = new ArrayList<Table>();
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_45()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Collection<Table> tables = new LinkedList<Table>();
		boolean compact = false;
		boolean showColumns = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_46()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_47()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_48()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_49()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_50()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_51()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_52()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_53()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_54()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_55()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_56()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_57()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_58()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_59()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean writeAllRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteAllRelationships_fixtureInstance_60()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter("", 0, "");

		boolean result = fixture.writeAllRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_1()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter dot = new LineWriter("", "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_2()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter dot = new LineWriter("", 0, "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_3()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_4()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_5()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_6()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_7()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_8()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_9()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_10()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_11()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_12()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_13()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_14()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_15()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_16()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter dot = new LineWriter("", "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_17()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter dot = new LineWriter("", 0, "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_18()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_19()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_20()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_21()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_22()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_23()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_24()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_25()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_26()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_27()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_28()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_29()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeOrphan(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteOrphan_fixtureInstance_30()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeOrphan(table, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_1()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("", "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_2()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", 0, "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_3()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_4()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_5()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_6()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_7()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_8()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_9()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_10()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_11()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_12()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_13()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_14()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_15()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_16()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("", "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_17()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", 0, "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_18()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_19()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_20()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_21()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_22()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_23()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_24()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_25()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_26()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_27()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean twoDegreesOfSeparation = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_28()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean twoDegreesOfSeparation = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_29()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<ForeignKeyConstraint> writeRealRelationships(Table,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_30()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean twoDegreesOfSeparation = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		Set<ForeignKeyConstraint> result = fixture.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_31()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = false;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter("", "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_32()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", 0, "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_33()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = true;
		boolean showColumns = true;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter("0123456789", "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_34()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_35()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_36()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_37()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_38()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_39()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = false;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_40()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = true;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_41()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = true;
		boolean showColumns = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_42()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		boolean compact = true;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_43()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = true;
		boolean showColumns = false;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_44()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Collection<Table> tables = new ArrayList<Table>();
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_45()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Collection<Table> tables = new LinkedList<Table>();
		boolean compact = false;
		boolean showColumns = true;
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_46()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = false;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_47()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = true;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_48()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_49()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_50()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_51()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_52()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_53()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_54()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_55()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_56()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_57()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_58()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_59()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean compact = false;
		boolean showColumns = true;
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter dot = new LineWriter("", "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeRealRelationships(Database,Collection<Table>,boolean,boolean,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testWriteRealRelationships_fixtureInstance_60()
		throws Exception {
		DotFormatter fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean compact = false;
		boolean showColumns = true;
		ArrayList<Table> list2 = new ArrayList<Table>();
		list2.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list2);
		LineWriter dot = new LineWriter("", 0, "");

		fixture.writeRealRelationships(db, tables, compact, showColumns, stats, dot);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
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
	 * @generatedBy CodePro at 6/7/15 4:18 PM
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
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DotFormatterTest.class);
	}
}