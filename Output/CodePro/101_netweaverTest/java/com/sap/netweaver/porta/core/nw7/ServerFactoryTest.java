package com.sap.netweaver.porta.core.nw7;

import java.util.Properties;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.Server;

/**
 * The class <code>ServerFactoryTest</code> contains tests for the class <code>{@link ServerFactory}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:08 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ServerFactoryTest {
	/**
	 * Run the ServerFactory() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 11:08 AM
	 */
	@Test
	public void testServerFactory_1()
		throws Exception {
		ServerFactory result = new ServerFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Server createServer(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:08 AM
	 */
	@Test
	public void testCreateServer_1()
		throws Exception {
		Properties props = new Properties();

		Server result = ServerFactory.createServer(props);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server createServer(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:08 AM
	 */
	@Test
	public void testCreateServer_2()
		throws Exception {
		Properties props = new Properties();

		Server result = ServerFactory.createServer(props);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server createServer(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:08 AM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testCreateServer_3()
		throws Exception {
		Properties props = new Properties();

		Server result = ServerFactory.createServer(props);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:08 AM
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
	 * @generatedBy CodePro at 4/8/14 11:08 AM
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
	 * @generatedBy CodePro at 4/8/14 11:08 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerFactoryTest.class);
	}
}