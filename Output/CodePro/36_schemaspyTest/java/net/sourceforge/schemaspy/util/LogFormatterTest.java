package net.sourceforge.schemaspy.util;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LogFormatterTest</code> contains tests for the class <code>{@link LogFormatter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:20 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LogFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LogFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private LogFormatter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LogFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public LogFormatter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new LogFormatter();
		}
		return fixture;
	}

	/**
	 * Run the String format(LogRecord) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testFormat_fixture_1()
		throws Exception {
		LogFormatter fixture2 = getFixture();
		LogRecord record = new LogRecord(Level.ALL, "");

		String result = fixture2.format(record);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.LogFormatter.format(LogFormatter.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the String format(LogRecord) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testFormat_fixture_2()
		throws Exception {
		LogFormatter fixture2 = getFixture();
		LogRecord record = new LogRecord(Level.CONFIG, "0123456789");

		String result = fixture2.format(record);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.LogFormatter.format(LogFormatter.java:111)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LogFormatterTest.class);
	}
}