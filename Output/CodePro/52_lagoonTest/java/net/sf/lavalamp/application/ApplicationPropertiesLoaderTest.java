package net.sf.lavalamp.application;

import java.io.FileNotFoundException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ApplicationPropertiesLoaderTest</code> contains tests for the class <code>{@link ApplicationPropertiesLoader}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ApplicationPropertiesLoaderTest {
	/**
	 * Run the ApplicationProperties load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		ApplicationPropertiesLoader fixture = new ApplicationPropertiesLoader();
		String fileName = "";

		ApplicationProperties result = fixture.load(fileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ApplicationProperties load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testLoad_2()
		throws Exception {
		ApplicationPropertiesLoader fixture = new ApplicationPropertiesLoader();
		String fileName = "";

		ApplicationProperties result = fixture.load(fileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ApplicationPropertiesLoaderTest.class);
	}
}