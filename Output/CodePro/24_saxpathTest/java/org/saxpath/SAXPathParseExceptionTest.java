package org.saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SAXPathParseExceptionTest</code> contains tests for the class <code>{@link SAXPathParseException}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SAXPathParseExceptionTest {
	/**
	 * Run the SAXPathParseException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSAXPathParseException_1()
		throws Exception {
		String msg = "";

		SAXPathParseException result = new SAXPathParseException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.saxpath.SAXPathParseException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the SAXPathParseException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSAXPathParseException_2()
		throws Exception {
		String msg = "0123456789";

		SAXPathParseException result = new SAXPathParseException(msg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("org.saxpath.SAXPathParseException: 0123456789", result.toString());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SAXPathParseExceptionTest.class);
	}
}