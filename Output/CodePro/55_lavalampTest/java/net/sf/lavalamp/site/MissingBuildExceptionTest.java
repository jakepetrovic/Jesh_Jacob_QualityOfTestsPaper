package net.sf.lavalamp.site;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MissingBuildExceptionTest</code> contains tests for the class <code>{@link MissingBuildException}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MissingBuildExceptionTest {
	/**
	 * Run the MissingBuildException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testMissingBuildException_1()
		throws Exception {
		String message = "";

		MissingBuildException result = new MissingBuildException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.lavalamp.site.MissingBuildException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the MissingBuildException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testMissingBuildException_2()
		throws Exception {
		String message = "";
		Throwable e = new Throwable();

		MissingBuildException result = new MissingBuildException(message, e);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sf.lavalamp.site.MissingBuildException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MissingBuildExceptionTest.class);
	}
}