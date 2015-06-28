package net.sourceforge.schemaspy.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.Map;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RemoteTableTest</code> contains tests for the class <code>{@link RemoteTable}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class RemoteTableTest {
	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_1()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_2()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "0123456789";
		String schema = "0123456789";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_3()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "0123456789";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_4()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "0123456789";
		String schema = "";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_5()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_6()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_7()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_8()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_9()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "0123456789";
		String schema = "0123456789";
		String name = "0123456789";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_10()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "0123456789";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_11()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_12()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_13()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_14()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_15()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "0123456789";
		String schema = "0123456789";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_16()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "0123456789";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_17()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_18()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_19()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_20()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_21()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_22()
		throws Exception {
		Database db = new Database(new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null}), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "0123456789";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_23()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_24()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", ""));
		String catalog = "";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_25()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_26()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null);
		String catalog = "";
		String schema = "";
		String name = "0123456789";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_27()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "";
		String schema = "";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_28()
		throws Exception {
		Database db = new Database((Config) null, (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));
		String catalog = "0123456789";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_29()
		throws Exception {
		Database db = new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789"));
		String catalog = "";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the RemoteTable(Database,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRemoteTable_30()
		throws Exception {
		Database db = new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", ""));
		String catalog = "";
		String schema = "0123456789";
		String name = "";
		String baseContainer = "0123456789";

		RemoteTable result = new RemoteTable(db, catalog, schema, name, baseContainer);

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
		new org.junit.runner.JUnitCore().run(RemoteTableTest.class);
	}
}