package net.sourceforge.schemaspy.util;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResultSetDumperTest</code> contains tests for the class <code>{@link ResultSetDumper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ResultSetDumperTest {
	/**
	 * Run the String dump(ResultSet) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDump_1()
		throws Exception {
		ResultSet rs = null;

		String result = ResultSetDumper.dump(rs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.util.ResultSetDumper.dump(ResultSetDumper.java:33)
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
		new org.junit.runner.JUnitCore().run(ResultSetDumperTest.class);
	}
}