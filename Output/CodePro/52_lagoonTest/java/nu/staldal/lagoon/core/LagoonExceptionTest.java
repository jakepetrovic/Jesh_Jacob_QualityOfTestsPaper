package nu.staldal.lagoon.core;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LagoonExceptionTest</code> contains tests for the class <code>{@link LagoonException}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LagoonExceptionTest {
	/**
	 * Run the LagoonException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonException_1()
		throws Exception {
		String msg = "";

		LagoonException result = new LagoonException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.core.LagoonException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals(null, result.getException());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the LagoonException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testLagoonException_2()
		throws Exception {
		String msg = "0123456789";

		LagoonException result = new LagoonException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.lagoon.core.LagoonException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals(null, result.getException());
		assertEquals("0123456789", result.getLocalizedMessage());
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
		new org.junit.runner.JUnitCore().run(LagoonExceptionTest.class);
	}
}