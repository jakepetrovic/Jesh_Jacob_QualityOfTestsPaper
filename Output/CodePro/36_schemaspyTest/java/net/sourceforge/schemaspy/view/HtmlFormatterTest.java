package net.sourceforge.schemaspy.view;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.HashSet;
import net.sourceforge.schemaspy.model.Table;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.Database;
import org.junit.*;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import net.sourceforge.schemaspy.model.TableColumn;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlFormatterTest</code> contains tests for the class <code>{@link HtmlFormatter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private HtmlFormatter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public HtmlFormatter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new HtmlFormatter();
		}
		return fixture;
	}

	/**
	 * Run the HtmlFormatter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testHtmlFormatter_1()
		throws Exception {

		HtmlFormatter result = new HtmlFormatter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_16()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_17()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_18()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = null;
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_19()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_20()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_21()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_22()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_23()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_24()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_25()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_26()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_27()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = null;
		boolean hoverHelp = true;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Database,Table,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDescription_fixture_28()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "1";
		boolean hoverHelp = false;

		String result = fixture2.getDescription(db, table, text, hoverHelp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the String getPathToRoot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetPathToRoot_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		String result = fixture2.getPathToRoot();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAnomaliesPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsAnomaliesPage_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isAnomaliesPage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isColumnsPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsColumnsPage_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isColumnsPage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isConstraintsPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsConstraintsPage_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isConstraintsPage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMainIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsMainIndex_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isMainIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOrphansPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsOrphansPage_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isOrphansPage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRelationshipsPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsRelationshipsPage_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isRelationshipsPage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoutinesPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testIsRoutinesPage_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.isRoutinesPage();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean sourceForgeLogoEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSourceForgeLogoEnabled_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();

		boolean result = fixture2.sourceForgeLogoEnabled();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
		assertTrue(result);
	}

	/**
	 * Run the String urlEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testUrlEncode_1()
		throws Exception {
		String string = "";

		String result = HtmlFormatter.urlEncode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String urlEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testUrlEncode_2()
		throws Exception {
		String string = "0123456789";

		String result = HtmlFormatter.urlEncode(string);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("", "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new HashSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_16()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter("", "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_17()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_18()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_19()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_20()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_21()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_22()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_23()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_24()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_25()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_26()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_27()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_28()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Set<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		Table table = null;
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_29()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		HashSet<TableColumn> excludedColumns = new HashSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789"), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeExcludedColumns(Set<TableColumn>,Table,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteExcludedColumns_fixture_30()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		TreeSet<TableColumn> excludedColumns = new TreeSet<TableColumn>();
		excludedColumns.add(new TableColumn(new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", ""), (TableColumnMeta) null));
		Table table = null;
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeExcludedColumns(excludedColumns, table, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("", "");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeFooter(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteFooter_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeFooter(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter("", "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_16()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_17()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_18()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_19()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_20()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_21()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_22()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_23()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_24()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_25()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_26()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_27()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_28()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "";
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_29()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeGeneratedOn(String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteGeneratedOn_fixture_30()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		String connectTime = "0123456789";
		LineWriter html = new LineWriter("", "");

		fixture2.writeGeneratedOn(connectTime, html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		String text = "";
		LineWriter out = new LineWriter("", "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "0123456789";
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		String text = "";
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "0123456789";
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "";
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String text = "0123456789";
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "";
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		String text = "0123456789";
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String text = "";
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		String text = "0123456789";
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		String text = "";
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "0123456789";
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		String text = "";
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "0123456789";
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "";
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_16()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		String text = "";
		LineWriter out = new LineWriter("", "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_17()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "0123456789";
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_18()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "";
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_19()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String text = "0123456789";
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_20()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "";
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_21()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		String text = "0123456789";
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_22()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String text = "";
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_23()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		String text = "0123456789";
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_24()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		String text = "";
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_25()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "0123456789";
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_26()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		String text = "";
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_27()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "0123456789";
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_28()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		String text = "";
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_29()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String text = "0123456789";
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_30()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		String text = "";
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeHeader(db, table, text, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_31()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter("", "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_32()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_33()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_34()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_35()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_36()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_37()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_38()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_39()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_40()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_41()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_42()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_43()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_44()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_45()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "";
		List<String> javascript = null;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_46()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter("", "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_47()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_48()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_49()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_50()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_51()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_52()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_53()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_54()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_55()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_56()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_57()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_58()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_59()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeHeader(Database,Table,String,List<String>,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteHeader_fixture_60()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		Table table = null;
		String text = "0123456789";
		List<String> javascript = null;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeHeader(db, table, text, javascript, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("", "");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeInvalidGraphvizInstallation(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteInvalidGraphvizInstallation_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeInvalidGraphvizInstallation(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter("", "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_16()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_17()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_18()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_19()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_20()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_21()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_22()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_23()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_24()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_25()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_26()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_27()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_28()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_29()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_30()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		LineWriter out = new LineWriter("", "");

		fixture2.writeLegend(tableDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_31()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter("", "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_32()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_33()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_34()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_35()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_36()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_37()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_38()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_39()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_40()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_41()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_42()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_43()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_44()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_45()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_46()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter("", "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_47()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter("", 0, "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_48()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter("0123456789", "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_49()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_50()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_51()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_52()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_53()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_54()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_55()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_56()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_57()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_58()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = true;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_59()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = true;
		LineWriter out = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeLegend(boolean,boolean,LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteLegend_fixture_60()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		boolean tableDetails = false;
		boolean diagramDetails = false;
		LineWriter out = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeLegend(tableDetails, diagramDetails, out);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_1()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("", "");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_2()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("", 0, "");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_3()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("0123456789", "0123456789");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_4()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("0123456789", 1, "0123456789");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_5()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter("An��t-1.0.txt", 7, "An��t-1.0.txt");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_6()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", ""), "");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_7()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", ""), 0, "");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_8()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), "0123456789");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_9()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("", "", (File) null), 1, "0123456789");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_10()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(File.createTempFile("0123456789", "0123456789"), 7, "An��t-1.0.txt");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_11()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), "");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_12()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 0, "");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_13()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter(new ByteArrayOutputStream(), 7, "An��t-1.0.txt");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_14()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter((OutputStream) null, "0123456789");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
	}

	/**
	 * Run the void writeTableOfContents(LineWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testWriteTableOfContents_fixture_15()
		throws Exception {
		HtmlFormatter fixture2 = getFixture();
		LineWriter html = new LineWriter((OutputStream) null, 1, "0123456789");

		fixture2.writeTableOfContents(html);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.isEncodeCommentsEnabled(Config.java:791)
		//       at net.sourceforge.schemaspy.view.HtmlFormatter.<init>(HtmlFormatter.java:38)
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
		new org.junit.runner.JUnitCore().run(HtmlFormatterTest.class);
	}
}