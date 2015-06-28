package nu.staldal.xodus;

import java.util.Properties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OutputConfigTest</code> contains tests for the class <code>{@link OutputConfig}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class OutputConfigTest {
	/**
	 * Run the OutputConfig createOutputConfig(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCreateOutputConfig_1()
		throws Exception {
		Properties outputProps = new Properties();

		OutputConfig result = OutputConfig.createOutputConfig(outputProps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Output method must be specified
		//       at nu.staldal.xodus.OutputConfig.<init>(OutputConfig.java:90)
		//       at nu.staldal.xodus.OutputConfig.createOutputConfig(OutputConfig.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the OutputConfig createOutputConfig(Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testCreateOutputConfig_2()
		throws Exception {
		Properties outputProps = new Properties((Properties) null);

		OutputConfig result = OutputConfig.createOutputConfig(outputProps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Output method must be specified
		//       at nu.staldal.xodus.OutputConfig.<init>(OutputConfig.java:90)
		//       at nu.staldal.xodus.OutputConfig.createOutputConfig(OutputConfig.java:81)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OutputConfigTest.class);
	}
}