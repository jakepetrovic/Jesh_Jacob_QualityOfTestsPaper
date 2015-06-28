package logging;

import org.apache.log4j.Level;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LoggingTest</code> contains tests for the class <code>{@link Logging}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoggingTest {
	/**
	 * Run the Logging getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		Logging result = Logging.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:103)
		//       at logging.Logging.init(Logging.java:60)
		//       at logging.Logging.<init>(Logging.java:54)
		//       at logging.Logging.getInstance(Logging.java:76)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(LoggingTest.class);
	}
}