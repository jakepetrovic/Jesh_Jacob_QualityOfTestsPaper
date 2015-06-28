package net.sf.xisemele.impl;

import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Locator;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Locator2Impl;

/**
 * The class <code>NullErrorHandlerTest</code> contains tests for the class <code>{@link NullErrorHandler}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class NullErrorHandlerTest {
	/**
	 * Run the NullErrorHandler() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testNullErrorHandler_1()
		throws Exception {
		NullErrorHandler result = new NullErrorHandler();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testError_1()
		throws Exception {
		NullErrorHandler fixture = new NullErrorHandler();
		SAXParseException exception = new SAXParseException("", new Locator2Impl());

		fixture.error(exception);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testFatalError_1()
		throws Exception {
		NullErrorHandler fixture = new NullErrorHandler();
		SAXParseException exception = new SAXParseException("", new Locator2Impl());

		fixture.fatalError(exception);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWarning_1()
		throws Exception {
		NullErrorHandler fixture = new NullErrorHandler();
		SAXParseException exception = new SAXParseException("", new Locator2Impl());

		fixture.warning(exception);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NullErrorHandlerTest.class);
	}
}