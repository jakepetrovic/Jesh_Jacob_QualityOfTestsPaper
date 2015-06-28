package nu.staldal.lagoon.core;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SourceManagerProviderTest</code> contains tests for the class <code>{@link SourceManagerProvider}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SourceManagerProviderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SourceManagerProvider
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private SourceManagerProvider fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SourceManagerProvider
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public SourceManagerProvider getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new OutputEntry();
		}
		return fixture;
	}

	/**
	 * Run the SourceManager getSourceManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetSourceManager_fixture_1()
		throws Exception {
		SourceManagerProvider fixture2 = getFixture();

		SourceManager result = fixture2.getSourceManager();

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(SourceManagerProviderTest.class);
	}
}