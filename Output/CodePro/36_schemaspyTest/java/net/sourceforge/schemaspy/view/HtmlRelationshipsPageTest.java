package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.net.URI;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.HashSet;
import java.util.Set;
import net.sourceforge.schemaspy.model.Table;
import java.util.TreeSet;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.Database;
import org.junit.*;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import net.sourceforge.schemaspy.model.TableColumn;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlRelationshipsPageTest</code> contains tests for the class <code>{@link HtmlRelationshipsPage}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlRelationshipsPageTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlRelationshipsPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private HtmlRelationshipsPage fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlRelationshipsPage
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public HtmlRelationshipsPage getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = HtmlRelationshipsPage.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the HtmlRelationshipsPage getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		HtmlRelationshipsPage result = HtmlRelationshipsPage.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRelationshipsPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsRelationshipsPage_fixtureInstance_1()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();

		boolean result = fixture.isRelationshipsPage();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_1()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("", "");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter("", "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_2()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("", "", (File) null);
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("", 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_3()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("0123456789", "0123456789", (File) null);
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("0123456789", "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_4()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		File diagramDir = new File("");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_5()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File("0123456789", "0123456789");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_6()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = new File((File) null, "");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_7()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("", "");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_8()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("0123456789", "0123456789");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_9()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_10()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		File diagramDir = new File("", "");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_11()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File("0123456789", "0123456789");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_12()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = new File((File) null, "");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_13()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("", "");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_14()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("0123456789", "0123456789");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		LineWriter html = new LineWriter("", "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_15()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		LineWriter html = new LineWriter("", 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_16()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		File diagramDir = new File("", "");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter("0123456789", "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_17()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File(URI.create(""));
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_18()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = new File((File) null, "0123456789");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_19()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("", "", (File) null);
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_20()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("0123456789", "0123456789");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_21()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_22()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		File diagramDir = new File("", "");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_23()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File(URI.create(""));
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_24()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = new File((File) null, "0123456789");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_25()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		File diagramDir = File.createTempFile("", "", (File) null);
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_26()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = File.createTempFile("0123456789", "0123456789", (File) null);
		String dotBaseFilespec = "";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_27()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		File diagramDir = new File("");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = true;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("", "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_28()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		File diagramDir = new File("0123456789", "0123456789");
		String dotBaseFilespec = "";
		boolean hasRealRelationships = false;
		boolean hasImpliedRelationships = false;
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		LineWriter html = new LineWriter("", 0, "");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_29()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		File diagramDir = new File(URI.create(""));
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = true;
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertTrue(result);
	}

	/**
	 * Run the boolean write(Database,File,String,boolean,boolean,Set<TableColumn>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWrite_fixtureInstance_30()
		throws Exception {
		HtmlRelationshipsPage fixture = getFixtureInstance();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		File diagramDir = new File((File) null, "0123456789");
		String dotBaseFilespec = "0123456789";
		boolean hasRealRelationships = true;
		boolean hasImpliedRelationships = false;
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		boolean result = fixture.write(db, diagramDir, dotBaseFilespec, hasRealRelationships, hasImpliedRelationships, excludedColumns, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
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
		new org.junit.runner.JUnitCore().run(HtmlRelationshipsPageTest.class);
	}
}