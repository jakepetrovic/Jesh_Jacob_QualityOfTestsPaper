package client;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TestDriverTest</code> contains tests for the class <code>{@link TestDriver}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TestDriverTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		TestDriver.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.BomberClient.<clinit>(BomberClient.java:36)
		//       at client.TestDriver.main(TestDriver.java:24)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {""};

		TestDriver.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.BomberClient
		//       at client.TestDriver.main(TestDriver.java:24)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {"0123456789"};

		TestDriver.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.BomberClient
		//       at client.TestDriver.main(TestDriver.java:24)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TestDriverTest.class);
	}
}