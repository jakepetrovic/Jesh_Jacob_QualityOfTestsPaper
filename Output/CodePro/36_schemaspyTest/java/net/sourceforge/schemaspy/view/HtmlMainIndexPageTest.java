package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
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
 * The class <code>HtmlMainIndexPageTest</code> contains tests for the class <code>{@link HtmlMainIndexPage}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:20 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlMainIndexPageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlMainIndexPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private HtmlMainIndexPage fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlMainIndexPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public HtmlMainIndexPage getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = HtmlMainIndexPage.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the HtmlMainIndexPage getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		HtmlMainIndexPage result = HtmlMainIndexPage.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isMainIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testIsMainIndex_fixtureInstance_1()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();

		boolean result = fixture.isMainIndex();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_1()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LineWriter html = new LineWriter("", "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_2()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter("", 0, "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_3()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_4()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_5()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_6()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_7()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_8()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_9()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_10()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_11()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_12()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_13()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LinkedList<Table> remotes = new LinkedList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_14()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LinkedList<Table> remotes = new LinkedList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_15()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LinkedList<Table> remotes = new LinkedList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_16()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<Table> remotes = new LinkedList<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_17()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LinkedList<Table> remotes = new LinkedList<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_18()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		LinkedList<Table> tables = new LinkedList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LinkedList<Table> remotes = new LinkedList<Table>();
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_19()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		TreeSet<Table> remotes = new TreeSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_20()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		TreeSet<Table> remotes = new TreeSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_21()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		TreeSet<Table> remotes = new TreeSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_22()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		TreeSet<Table> remotes = new TreeSet<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_23()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		TreeSet<Table> remotes = new TreeSet<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_24()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		TreeSet<Table> tables = new TreeSet<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		TreeSet<Table> remotes = new TreeSet<Table>();
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_25()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter("", "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_26()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		LineWriter html = new LineWriter("", 0, "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_27()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_28()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_29()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		ArrayList<Table> remotes = new ArrayList<Table>();
		remotes.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void write(Database,Collection<Table>,Collection<Table>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWrite_fixtureInstance_30()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		Database database = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		HashSet<Table> tables = new HashSet<Table>();
		tables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		HashSet<Table> remotes = new HashSet<Table>();
		remotes.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.write(database, tables, remotes, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_1()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 0;
		int numViews = 0;
		int numViewCols = 0;
		long numRows = -1L;
		LineWriter html = new LineWriter("", "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_2()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 1;
		int numViews = 1;
		int numViewCols = 1;
		long numRows = 0L;
		LineWriter html = new LineWriter("", 0, "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_3()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 0;
		int numViews = 0;
		int numViewCols = 7;
		long numRows = 1L;
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_4()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 7;
		int numViews = 0;
		int numViewCols = 1;
		long numRows = -1L;
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_5()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 0;
		int numViews = 1;
		int numViewCols = 7;
		long numRows = 0L;
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_6()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 7;
		int numViews = 1;
		int numViewCols = 0;
		long numRows = 1L;
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_7()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 1;
		int numViews = 0;
		int numViewCols = 7;
		long numRows = -1L;
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_8()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 0;
		int numViews = 0;
		int numViewCols = 0;
		long numRows = 0L;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_9()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 1;
		int numViews = 1;
		int numViewCols = 1;
		long numRows = 1L;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_10()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 0;
		int numViews = 1;
		int numViewCols = 0;
		long numRows = -1L;
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_11()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 1;
		int numViews = 0;
		int numViewCols = 7;
		long numRows = 0L;
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_12()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 0;
		int numViews = 0;
		int numViewCols = 0;
		long numRows = 1L;
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_13()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 1;
		int numViews = 1;
		int numViewCols = 7;
		long numRows = 0L;
		LineWriter html = new LineWriter("", "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_14()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 0;
		int numViews = 1;
		int numViewCols = 0;
		long numRows = 1L;
		LineWriter html = new LineWriter("", 0, "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_15()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 7;
		int numViews = 0;
		int numViewCols = 7;
		long numRows = -1L;
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_16()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 1;
		int numViews = 0;
		int numViewCols = 0;
		long numRows = 0L;
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_17()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 7;
		int numViews = 1;
		int numViewCols = 1;
		long numRows = 1L;
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_18()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 1;
		int numViews = 1;
		int numViewCols = 0;
		long numRows = -1L;
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_19()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 0;
		int numViews = 0;
		int numViewCols = 1;
		long numRows = 0L;
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_20()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 1;
		int numViews = 1;
		int numViewCols = 7;
		long numRows = 1L;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_21()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 0;
		int numViews = 1;
		int numViewCols = 1;
		long numRows = -1L;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_22()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 7;
		int numViews = 0;
		int numViewCols = 7;
		long numRows = 0L;
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_23()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 0;
		int numViews = 0;
		int numViewCols = 1;
		long numRows = 1L;
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteLocalsFooter_fixtureInstance_24()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 7;
		int numViews = 0;
		int numViewCols = 0;
		long numRows = -1L;
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteLocalsFooter_fixtureInstance_25()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 7;
		int numViews = 0;
		int numViewCols = 1;
		long numRows = 0L;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteLocalsFooter_fixtureInstance_26()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 0;
		int numViews = 1;
		int numViewCols = 7;
		long numRows = 1L;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteLocalsFooter_fixtureInstance_27()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 7;
		int numViews = 1;
		int numViewCols = 1;
		long numRows = -1L;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteLocalsFooter_fixtureInstance_28()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 1;
		int numTableCols = 1;
		int numViews = 0;
		int numViewCols = 0;
		long numRows = 1L;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteLocalsFooter_fixtureInstance_29()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 7;
		int numViews = 1;
		int numViewCols = 7;
		long numRows = -1L;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
	}

	/**
	 * Run the void writeLocalsFooter(int,int,int,int,long,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteLocalsFooter_fixtureInstance_30()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		int numTables = 0;
		int numTableCols = 1;
		int numViews = 1;
		int numViewCols = 0;
		long numRows = 0L;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeLocalsFooter(numTables, numTableCols, numViews, numViewCols, numRows, html);

		// add additional test code here
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_1()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("", "");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_2()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("", 0, "");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_3()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:40)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_4()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_5()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:110)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:44)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_6()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_7()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_8()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_9()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_10()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:209)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:52)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_11()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:56)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testWriteRemotesFooter_fixtureInstance_12()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeRemotesFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.io.Writer.<init>(Writer.java:88)
		//       at java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:97)
		//       at net.sourceforge.schemaspy.util.LineWriter.<init>(LineWriter.java:60)
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteRemotesFooter_fixtureInstance_13()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeRemotesFooter(html);

		// add additional test code here
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteRemotesFooter_fixtureInstance_14()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeRemotesFooter(html);

		// add additional test code here
	}

	/**
	 * Run the void writeRemotesFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWriteRemotesFooter_fixtureInstance_15()
		throws Exception {
		HtmlMainIndexPage fixture = getFixtureInstance();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeRemotesFooter(html);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HtmlMainIndexPageTest.class);
	}
}