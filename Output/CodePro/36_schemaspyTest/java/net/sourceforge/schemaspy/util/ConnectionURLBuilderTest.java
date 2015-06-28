package net.sourceforge.schemaspy.util;

import java.util.List;
import java.util.Properties;
import net.sourceforge.schemaspy.Config;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConnectionURLBuilderTest</code> contains tests for the class <code>{@link ConnectionURLBuilder}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ConnectionURLBuilderTest {
	/**
	 * Run the ConnectionURLBuilder(Config,Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionURLBuilder_1()
		throws Exception {
		Config config = Config.getInstance();
		Properties properties = new Properties();

		ConnectionURLBuilder result = new ConnectionURLBuilder(config, properties);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getConnectionURL());
	}

	/**
	 * Run the ConnectionURLBuilder(Config,Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionURLBuilder_2()
		throws Exception {
		Config config = new Config();
		Properties properties = new Properties((Properties) null);

		ConnectionURLBuilder result = new ConnectionURLBuilder(config, properties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getDbProperties(Config.java:1332)
		assertNotNull(result);
	}

	/**
	 * Run the ConnectionURLBuilder(Config,Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionURLBuilder_3()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Properties properties = new Properties((Properties) null);

		ConnectionURLBuilder result = new ConnectionURLBuilder(config, properties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the ConnectionURLBuilder(Config,Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionURLBuilder_4()
		throws Exception {
		Config config = new Config();
		Properties properties = new Properties();

		ConnectionURLBuilder result = new ConnectionURLBuilder(config, properties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getDbProperties(Config.java:1332)
		assertNotNull(result);
	}

	/**
	 * Run the ConnectionURLBuilder(Config,Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionURLBuilder_5()
		throws Exception {
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Properties properties = new Properties();

		ConnectionURLBuilder result = new ConnectionURLBuilder(config, properties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the ConnectionURLBuilder(Config,Properties) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testConnectionURLBuilder_6()
		throws Exception {
		Config config = Config.getInstance();
		Properties properties = new Properties((Properties) null);

		ConnectionURLBuilder result = new ConnectionURLBuilder(config, properties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.getRemainingParameters(Config.java:1440)
		//       at net.sourceforge.schemaspy.util.ConnectionURLBuilder.<init>(ConnectionURLBuilder.java:46)
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
		new org.junit.runner.JUnitCore().run(ConnectionURLBuilderTest.class);
	}
}