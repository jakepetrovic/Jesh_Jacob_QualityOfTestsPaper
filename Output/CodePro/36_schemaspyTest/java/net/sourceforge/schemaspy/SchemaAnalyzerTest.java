package net.sourceforge.schemaspy;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import net.sourceforge.schemaspy.model.Database;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SchemaAnalyzerTest</code> contains tests for the class <code>{@link SchemaAnalyzer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SchemaAnalyzerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SchemaAnalyzer
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private SchemaAnalyzer fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SchemaAnalyzer
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public SchemaAnalyzer getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SchemaAnalyzer();
		}
		return fixture;
	}

	/**
	 * Run the Database analyze(Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testAnalyze_fixture_1()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();

		Database result = fixture2.analyze(config);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Database analyze(Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testAnalyze_fixture_2()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();

		Database result = fixture2.analyze(config);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database analyze(Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testAnalyze_fixture_3()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		Database result = fixture2.analyze(config);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_1()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "0123456789";
		String driverClass = "";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_2()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "";
		String driverClass = "";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getDbType(Config.java:288)
		//       at net.sourceforge.schemaspy.Config.getDbPropertiesLoadedFrom(Config.java:1425)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(SchemaAnalyzer.java:563)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_3()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "";
		String driverClass = "";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_4()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "0123456789";
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getDbType(Config.java:288)
		//       at net.sourceforge.schemaspy.Config.getDbPropertiesLoadedFrom(Config.java:1425)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(SchemaAnalyzer.java:563)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_5()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "0123456789";
		String driverClass = "";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_6()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "";
		String driverClass = "0123456789";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getDbType(Config.java:288)
		//       at net.sourceforge.schemaspy.Config.getDbPropertiesLoadedFrom(Config.java:1425)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(SchemaAnalyzer.java:563)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_7()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "";
		String driverClass = "";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_8()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "0123456789";
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_9()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "0123456789";
		String driverClass = "";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getDbType(Config.java:288)
		//       at net.sourceforge.schemaspy.Config.getDbPropertiesLoadedFrom(Config.java:1425)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(SchemaAnalyzer.java:563)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_10()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "";
		String driverClass = "0123456789";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_11()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "";
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getDbType(Config.java:288)
		//       at net.sourceforge.schemaspy.Config.getDbPropertiesLoadedFrom(Config.java:1425)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(SchemaAnalyzer.java:563)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_12()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "";
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_13()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "0123456789";
		String driverClass = "0123456789";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getDbType(Config.java:288)
		//       at net.sourceforge.schemaspy.Config.getDbPropertiesLoadedFrom(Config.java:1425)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getConnection(SchemaAnalyzer.java:563)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetConnection_fixture_14()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		String connectionURL = "0123456789";
		String driverClass = "0123456789";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_15()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "";
		String driverClass = "";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_16()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "0123456789";
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_17()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = Config.getInstance();
		String connectionURL = "0123456789";
		String driverClass = "";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_18()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "";
		String driverClass = "0123456789";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_19()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "0123456789";
		String driverClass = "";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_20()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "";
		String driverClass = "";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_21()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "0123456789";
		String driverClass = "";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_22()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "";
		String driverClass = "";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_23()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "";
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Connection getConnection(Config,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetConnection_fixture_24()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Config config = new Config();
		String connectionURL = "0123456789";
		String driverClass = "0123456789";
		String driverPath = "";

		Connection result = fixture2.getConnection(config, connectionURL, driverClass, driverPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Driver getDriver(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriver_fixture_1()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String driverClass = "";
		String driverPath = "";

		Driver result = fixture2.getDriver(driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.ClassNotFoundException: 
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(SchemaAnalyzer.java:650)
		assertNotNull(result);
	}

	/**
	 * Run the Driver getDriver(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriver_fixture_2()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String driverClass = "0123456789";
		String driverPath = "0123456789";

		Driver result = fixture2.getDriver(driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.ClassNotFoundException: 0123456789
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(SchemaAnalyzer.java:650)
		assertNotNull(result);
	}

	/**
	 * Run the Driver getDriver(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriver_fixture_3()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String driverClass = "0123456789";
		String driverPath = "";

		Driver result = fixture2.getDriver(driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.ClassNotFoundException: 0123456789
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(SchemaAnalyzer.java:650)
		assertNotNull(result);
	}

	/**
	 * Run the Driver getDriver(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriver_fixture_4()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String driverClass = "";
		String driverPath = "0123456789";

		Driver result = fixture2.getDriver(driverClass, driverPath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.ConnectionFailure: java.lang.ClassNotFoundException: 
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.getDriver(SchemaAnalyzer.java:650)
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getDriverClassLoader(List<URL>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriverClassLoader_fixture_1()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		ArrayList<URL> classpath = new ArrayList<URL>();
		classpath.add(new URL("http://www.eclipse.org"));

		ClassLoader result = fixture2.getDriverClassLoader(classpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getDriverClassLoader(List<URL>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriverClassLoader_fixture_2()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		LinkedList<URL> classpath = new LinkedList<URL>();
		classpath.add(new URL("http://www.eclipse.org"));

		ClassLoader result = fixture2.getDriverClassLoader(classpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getDriverClassLoader(List<URL>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriverClassLoader_fixture_3()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		Vector<URL> classpath = new Vector<URL>();
		classpath.add(new URL("http://www.eclipse.org"));

		ClassLoader result = fixture2.getDriverClassLoader(classpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getDriverClassLoader(List<URL>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriverClassLoader_fixture_4()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		List<URL> classpath = new ArrayList<URL>();

		ClassLoader result = fixture2.getDriverClassLoader(classpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getDriverClassLoader(List<URL>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriverClassLoader_fixture_5()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		List<URL> classpath = new LinkedList<URL>();

		ClassLoader result = fixture2.getDriverClassLoader(classpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClassLoader getDriverClassLoader(List<URL>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetDriverClassLoader_fixture_6()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		List<URL> classpath = new Vector<URL>();

		ClassLoader result = fixture2.getDriverClassLoader(classpath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<URL> getExistingUrls(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetExistingUrls_fixture_1()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String path = "";

		List<URL> result = fixture2.getExistingUrls(path);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<URL> getExistingUrls(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetExistingUrls_fixture_2()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String path = "0123456789";

		List<URL> result = fixture2.getExistingUrls(path);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<File> getMissingFiles(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMissingFiles_fixture_1()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String path = "";

		List<File> result = fixture2.getMissingFiles(path);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<File> getMissingFiles(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMissingFiles_fixture_2()
		throws Exception {
		SchemaAnalyzer fixture2 = getFixture();
		String path = "0123456789";

		List<File> result = fixture2.getMissingFiles(path);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_1()
		throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.remove(ArrayList.java:474)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_2()
		throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.remove(ArrayList.java:474)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_3()
		throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.remove(ArrayList.java:474)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_4()
		throws Exception {
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_5()
		throws Exception {
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
		//       at java.util.LinkedList.remove(LinkedList.java:523)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_6()
		throws Exception {
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
		//       at java.util.LinkedList.remove(LinkedList.java:523)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_7()
		throws Exception {
		Vector<String> args = new Vector<String>();
		args.add("");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_8()
		throws Exception {
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 1
		//       at java.util.Vector.remove(Vector.java:827)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_9()
		throws Exception {
		Vector<String> args = new Vector<String>();
		args.add("0123456789");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 0
		//       at java.util.Vector.remove(Vector.java:827)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_10()
		throws Exception {
		List<String> args = new ArrayList<String>();
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_11()
		throws Exception {
		List<String> args = new LinkedList<String>();
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_12()
		throws Exception {
		List<String> args = new Vector<String>();
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_13()
		throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_14()
		throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_15()
		throws Exception {
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
		//       at java.util.LinkedList.remove(LinkedList.java:523)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_16()
		throws Exception {
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_17()
		throws Exception {
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_18()
		throws Exception {
		Vector<String> args = new Vector<String>();
		args.add("");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 0
		//       at java.util.Vector.remove(Vector.java:827)
		//       at net.sourceforge.schemaspy.SchemaAnalyzer.yankParam(SchemaAnalyzer.java:788)
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_19()
		throws Exception {
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_20()
		throws Exception {
		Vector<String> args = new Vector<String>();
		args.add("0123456789");
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_21()
		throws Exception {
		List<String> args = new ArrayList<String>();
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_22()
		throws Exception {
		List<String> args = new LinkedList<String>();
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_23()
		throws Exception {
		List<String> args = new Vector<String>();
		String paramId = "";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
	}

	/**
	 * Run the void yankParam(List<String>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testYankParam_24()
		throws Exception {
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		String paramId = "0123456789";

		SchemaAnalyzer.yankParam(args, paramId);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SchemaAnalyzerTest.class);
	}
}