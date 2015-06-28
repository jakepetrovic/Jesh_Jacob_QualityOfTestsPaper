package net.sf.lavalamp.properties;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MissingPropertyExceptionTest</code> contains tests for the class <code>{@link MissingPropertyException}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MissingPropertyExceptionTest {
	/**
	 * Run the MissingPropertyException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testMissingPropertyException_1()
		throws Exception {
		String message = "";

		MissingPropertyException result = new MissingPropertyException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.lavalamp.properties.MissingPropertyException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the MissingPropertyException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testMissingPropertyException_2()
		throws Exception {
		String message = "";
		Throwable e = new Throwable();

		MissingPropertyException result = new MissingPropertyException(message, e);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sf.lavalamp.properties.MissingPropertyException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MissingPropertyExceptionTest.class);
	}
}