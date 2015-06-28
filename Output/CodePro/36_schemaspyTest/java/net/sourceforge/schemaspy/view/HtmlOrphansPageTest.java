package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.net.URI;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.model.Database;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.Table;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlOrphansPageTest</code> contains tests for the class <code>{@link HtmlOrphansPage}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlOrphansPageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlOrphansPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private HtmlOrphansPage fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlOrphansPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public HtmlOrphansPage getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = HtmlOrphansPage.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the HtmlOrphansPage getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		HtmlOrphansPage result = HtmlOrphansPage.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isOrphansPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsOrphansPage_fixtureInstance_1()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();

		boolean result = fixture.isOrphansPage();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_1()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		File diagramDir = File.createTempFile("", "");
		LineWriter html = new LineWriter("", "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_2()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = File.createTempFile("", "", (File) null);
		LineWriter html = new LineWriter("", 0, "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_3()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("0123456789", "0123456789");
		LineWriter html = new LineWriter("0123456789", "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_4()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = File.createTempFile("0123456789", "0123456789", (File) null);
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_5()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		File diagramDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_6()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = new File("");
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_7()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		File diagramDir = new File("", "");
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_8()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = new File("0123456789", "0123456789");
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_9()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		File diagramDir = new File(URI.create(""));
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_10()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File((File) null, "");
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_11()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		File diagramDir = new File((File) null, "0123456789");
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_12()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Vector<Table> orphanTables = new Vector<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		File diagramDir = File.createTempFile("", "");
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_13()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Vector<Table> orphanTables = new Vector<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = File.createTempFile("", "", (File) null);
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_14()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Vector<Table> orphanTables = new Vector<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("0123456789", "0123456789");
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_15()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Vector<Table> orphanTables = new Vector<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = File.createTempFile("0123456789", "0123456789", (File) null);
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_16()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Vector<Table> orphanTables = new Vector<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		File diagramDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_17()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Vector<Table> orphanTables = new Vector<Table>();
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = new File("");
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_18()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		List<Table> orphanTables = new ArrayList<Table>();
		File diagramDir = new File("", "");
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_19()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		List<Table> orphanTables = new LinkedList<Table>();
		File diagramDir = new File("0123456789", "0123456789");
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_20()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		List<Table> orphanTables = new Vector<Table>();
		File diagramDir = new File(URI.create(""));
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_21()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		File diagramDir = new File((File) null, "");
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_22()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("", "");
		LineWriter html = new LineWriter("", "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_23()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = File.createTempFile("", "", (File) null);
		LineWriter html = new LineWriter("", 0, "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_24()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		File diagramDir = File.createTempFile("0123456789", "0123456789");
		LineWriter html = new LineWriter("0123456789", "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_25()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		ArrayList<Table> orphanTables = new ArrayList<Table>();
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = File.createTempFile("0123456789", "0123456789", (File) null);
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_26()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		File diagramDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_27()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""));
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		orphanTables.add(new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null));
		File diagramDir = new File("");
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_28()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"));
		File diagramDir = new File("", "");
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_29()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File("0123456789", "0123456789");
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,List<Table>,File,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_30()
		throws Exception {
		HtmlOrphansPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		LinkedList<Table> orphanTables = new LinkedList<Table>();
		orphanTables.add(new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null));
		File diagramDir = new File(URI.create(""));
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		boolean result = fixture.write(db, orphanTables, diagramDir, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(HtmlOrphansPageTest.class);
	}
}