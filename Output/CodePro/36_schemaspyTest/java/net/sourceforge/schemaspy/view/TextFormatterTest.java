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
import java.util.LinkedList;
import java.util.TreeSet;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.Config;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TextFormatterTest</code> contains tests for the class <code>{@link TextFormatter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TextFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TextFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private TextFormatter fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TextFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public TextFormatter getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = TextFormatter.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the TextFormatter getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		TextFormatter result = TextFormatter.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_1()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean includeViews = false;
		LineWriter out = new LineWriter("", "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_2()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter("", 0, "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_3()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean includeViews = false;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_4()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_5()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean includeViews = false;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_6()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_7()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean includeViews = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_8()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_9()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean includeViews = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_10()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_11()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean includeViews = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_12()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_13()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean includeViews = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_14()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_15()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean includeViews = false;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_16()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_17()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_18()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		Collection<Table> tables = new ArrayList<Table>();
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_19()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		Collection<Table> tables = new HashSet<Table>();
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_20()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		Collection<Table> tables = new LinkedList<Table>();
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_21()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		Collection<Table> tables = new TreeSet<Table>();
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_22()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_23()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_24()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_25()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_26()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_27()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_28()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		boolean includeViews = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_29()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		boolean includeViews = true;
		LineWriter out = new LineWriter("", "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Collection<Table>,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_30()
		throws Exception {
		TextFormatter fixture = getFixtureInstance();
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		boolean includeViews = false;
		LineWriter out = new LineWriter("", 0, "");

		fixture.write(tables, includeViews, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
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
		new org.junit.runner.JUnitCore().run(TextFormatterTest.class);
	}
}