package org.saxpath;

import org.junit.*;
import static org.junit.Assert.*;
import org.saxpath.conformance.ConformanceXPathHandler;
import org.saxpath.helpers.DefaultXPathHandler;

/**
 * The class <code>SAXPathEventSourceTest</code> contains tests for the class <code>{@link SAXPathEventSource}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SAXPathEventSourceTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SAXPathEventSource
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private SAXPathEventSource fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SAXPathEventSource
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public SAXPathEventSource getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new com.werken.saxpath.XPathReader();
		}
		return fixture;
	}

	/**
	 * Run the XPathHandler getXPathHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetXPathHandler_fixture_1()
		throws Exception {
		SAXPathEventSource fixture2 = getFixture();

		XPathHandler result = fixture2.getXPathHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setXPathHandler(XPathHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetXPathHandler_fixture_1()
		throws Exception {
		SAXPathEventSource fixture2 = getFixture();
		XPathHandler handler = new ConformanceXPathHandler();

		fixture2.setXPathHandler(handler);

		// add additional test code here
	}

	/**
	 * Run the void setXPathHandler(XPathHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetXPathHandler_fixture_2()
		throws Exception {
		SAXPathEventSource fixture2 = getFixture();
		XPathHandler handler = new DefaultXPathHandler();

		fixture2.setXPathHandler(handler);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SAXPathEventSourceTest.class);
	}
}