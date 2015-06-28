package net.sourceforge.schemaspy.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DatabaseTest</code> contains tests for the class <code>{@link Database}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DatabaseTest {
	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_1()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_2()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_3()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_4()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_5()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_6()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_7()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_8()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "0123456789";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_9()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_10()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_11()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_12()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_13()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_14()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_15()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_16()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_17()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_18()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_19()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_20()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "0123456789";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_21()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_22()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_23()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_24()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "An��t-1.0.txt" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_25()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_26()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_27()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_28()
		throws Exception {
		Config config = Config.getInstance();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("", "", "");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_29()
		throws Exception {
		Config config = new Config();
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		SchemaMeta schemaMeta = new SchemaMeta("0123456789", "0123456789", "0123456789");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database(Config,Connection,DatabaseMetaData,String,String,String,SchemaMeta) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDatabase_30()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Connection connection = null;
		DatabaseMetaData meta = null;
		String name = "0123456789";
		String catalog = "";
		String schema = "";
		SchemaMeta schemaMeta = new SchemaMeta("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		Database result = new Database(config, connection, meta, name, catalog, schema, schemaMeta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
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
		new org.junit.runner.JUnitCore().run(DatabaseTest.class);
	}
}