package net.sf.lavalamp.site;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LoginRequiredExceptionTest</code> contains tests for the class <code>{@link LoginRequiredException}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoginRequiredExceptionTest {
	/**
	 * Run the LoginRequiredException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testLoginRequiredException_1()
		throws Exception {

		LoginRequiredException result = new LoginRequiredException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.lavalamp.site.LoginRequiredException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the LoginRequiredException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testLoginRequiredException_2()
		throws Exception {
		String message = "";

		LoginRequiredException result = new LoginRequiredException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.lavalamp.site.LoginRequiredException: ", result.toString());
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
		new org.junit.runner.JUnitCore().run(LoginRequiredExceptionTest.class);
	}
}