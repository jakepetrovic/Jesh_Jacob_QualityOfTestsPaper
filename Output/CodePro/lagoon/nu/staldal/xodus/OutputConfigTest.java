package nu.staldal.xodus;

import java.util.Properties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OutputConfigTest</code> contains tests for the class <code>{@link OutputConfig}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OutputConfigTest {
	/**
	 * Run the OutputConfig createOutputConfig(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testCreateOutputConfig_1()
		throws Exception {
		Properties outputProps = new Properties();

		OutputConfig result = OutputConfig.createOutputConfig(outputProps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OutputConfig createOutputConfig(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateOutputConfig_2()
		throws Exception {
		Properties outputProps = new Properties();

		OutputConfig result = OutputConfig.createOutputConfig(outputProps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OutputConfigTest.class);
	}
}