package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.URI;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import net.sourceforge.schemaspy.model.Database;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.util.TreeSet;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import net.sourceforge.schemaspy.model.TableColumn;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlTablePageTest</code> contains tests for the class <code>{@link HtmlTablePage}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:21 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlTablePageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlTablePage
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	private HtmlTablePage fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlTablePage
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public HtmlTablePage getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = HtmlTablePage.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the HtmlTablePage getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		HtmlTablePage result = HtmlTablePage.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPathToRoot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetPathToRoot_fixtureInstance_1()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();

		String result = fixture.getPathToRoot();

		// add additional test code here
		assertEquals("../", result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_1()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = File.createTempFile("", "");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter("", "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_2()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		File outputDir = File.createTempFile("", "", (File) null);
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter("", 0, "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_3()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		File outputDir = File.createTempFile("0123456789", "0123456789", (File) null);
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter("0123456789", "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_4()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		File outputDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_5()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		File outputDir = new File("", "");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_6()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = new File("0123456789", "0123456789");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_7()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		File outputDir = new File((File) null, "");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_8()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		File outputDir = new File((File) null, "0123456789");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_9()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		File outputDir = File.createTempFile("", "", (File) null);
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_10()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = File.createTempFile("0123456789", "0123456789");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_11()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		File outputDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_12()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		File outputDir = new File("");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_13()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		File outputDir = new File("0123456789", "0123456789");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_14()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		File outputDir = new File(URI.create(""));
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_15()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = new File((File) null, "0123456789");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_16()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		File outputDir = File.createTempFile("", "", (File) null);
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter("", "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_17()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		File outputDir = File.createTempFile("0123456789", "0123456789");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter("", 0, "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_18()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		File outputDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter("0123456789", "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_19()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = new File("");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_20()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		File outputDir = new File("0123456789", "0123456789");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_21()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		File outputDir = new File(URI.create(""));
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_22()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		File outputDir = new File((File) null, "0123456789");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_23()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = File.createTempFile("", "");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_24()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		File outputDir = File.createTempFile("0123456789", "0123456789");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_25()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		File outputDir = File.createTempFile("0123456789", "0123456789", (File) null);
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_26()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		File outputDir = new File("");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_27()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		File outputDir = new File("", "");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_28()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		File outputDir = new File(URI.create(""));
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_29()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		File outputDir = new File((File) null, "");
		WriteStats stats = new WriteStats((WriteStats) null);
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the WriteStats write(Database,Table,File,WriteStats,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWrite_fixtureInstance_30()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		File outputDir = File.createTempFile("", "");
		ArrayList<Table> list = new ArrayList<Table>();
		list.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		WriteStats stats = new WriteStats(list);
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		WriteStats result = fixture.write(db, table, outputDir, stats, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_1()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter("", "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_2()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter("", 0, "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_3()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_4()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_5()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_6()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		Set<TableColumn> primaries = new HashSet<TableColumn>();
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_7()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		Set<TableColumn> primaries = new TreeSet<TableColumn>();
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_8()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_9()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new HashSet<TableColumn>();
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_10()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_11()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_12()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_13()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		Set<TableColumn> primaries = new HashSet<TableColumn>();
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_14()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		Set<TableColumn> primaries = new TreeSet<TableColumn>();
		Set<TableColumn> indexedColumns = new HashSet<TableColumn>();
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_15()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_16()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter("", "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_17()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter("", 0, "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_18()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new HashSet<TableColumn>();
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_19()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_20()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		Set<TableColumn> primaries = new TreeSet<TableColumn>();
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_21()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_22()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_23()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new HashSet<TableColumn>();
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_24()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_25()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_26()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = "1";
		Set<TableColumn> primaries = new HashSet<TableColumn>();
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_27()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		Set<TableColumn> primaries = new TreeSet<TableColumn>();
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = true;
		boolean showIds = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_28()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = null;
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Set<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		boolean slim = true;
		boolean showIds = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_29()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null);
		String tableName = "1";
		HashSet<TableColumn> primaries = new HashSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		HashSet<TableColumn> indexedColumns = new HashSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = true;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeColumn(TableColumn,String,Set<TableColumn>,Set<TableColumn>,boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteColumn_fixtureInstance_30()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		TableColumn column = new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null);
		String tableName = null;
		TreeSet<TableColumn> primaries = new TreeSet<TableColumn>();
		primaries.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		TreeSet<TableColumn> indexedColumns = new TreeSet<TableColumn>();
		indexedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		boolean slim = false;
		boolean showIds = false;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeColumn(column, tableName, primaries, indexedColumns, slim, showIds, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_1()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter out = new LineWriter("", "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_2()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter out = new LineWriter("", 0, "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_3()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_4()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_5()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_6()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_7()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_8()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_9()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_10()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_11()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_12()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_13()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_14()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_15()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_16()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter out = new LineWriter("", "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_17()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter out = new LineWriter("", 0, "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_18()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_19()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_20()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_21()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_22()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_23()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_24()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_25()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_26()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_27()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_28()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_29()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeMainTable(Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testWriteMainTable_fixtureInstance_30()
		throws Exception {
		HtmlTablePage fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture.writeMainTable(table, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
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
		new org.junit.runner.JUnitCore().run(HtmlTablePageTest.class);
	}
}