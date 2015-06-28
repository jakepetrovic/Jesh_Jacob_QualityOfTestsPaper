package net.sf.lavalamp.site;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LoginFailedExceptionTest</code> contains tests for the class <code>{@link LoginFailedException}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoginFailedExceptionTest {
	/**
	 * Run the LoginFailedException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testLoginFailedException_1()
		throws Exception {

		LoginFailedException result = new LoginFailedException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.lavalamp.site.LoginFailedException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the LoginFailedException(Exception) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testLoginFailedException_2()
		throws Exception {
		Exception e = new Exception();

		LoginFailedException result = new LoginFailedException(e);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.sf.lavalamp.site.LoginFailedException: java.lang.Exception", result.toString());
		assertEquals("java.lang.Exception", result.getMessage());
		assertEquals("java.lang.Exception", result.getLocalizedMessage());
	}

	/**
	 * Run the LoginFailedException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testLoginFailedException_3()
		throws Exception {
		String message = "";

		LoginFailedException result = new LoginFailedException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.sf.lavalamp.site.LoginFailedException: ", result.toString());
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
		new org.junit.runner.JUnitCore().run(LoginFailedExceptionTest.class);
	}
}