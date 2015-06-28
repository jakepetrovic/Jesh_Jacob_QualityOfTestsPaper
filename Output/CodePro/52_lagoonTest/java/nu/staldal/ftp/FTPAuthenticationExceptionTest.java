package nu.staldal.ftp;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FTPAuthenticationExceptionTest</code> contains tests for the class <code>{@link FTPAuthenticationException}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FTPAuthenticationExceptionTest {
	/**
	 * Run the FTPAuthenticationException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testFTPAuthenticationException_1()
		throws Exception {

		FTPAuthenticationException result = new FTPAuthenticationException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("nu.staldal.ftp.FTPAuthenticationException: Invalid password", result.toString());
		assertEquals("Invalid password", result.getMessage());
		assertEquals("Invalid password", result.getLocalizedMessage());
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
		new org.junit.runner.JUnitCore().run(FTPAuthenticationExceptionTest.class);
	}
}