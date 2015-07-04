package org.saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XPathReaderTest</code> contains tests for the class <code>{@link XPathReader}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XPathReaderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathReader
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathReader fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathReader
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathReader getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new com.werken.saxpath.XPathReader();
		}
		return fixture;
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testParse_fixture_1()
		throws Exception {
		XPathReader fixture2 = getFixture();
		String xpath = "0123456789";

		fixture2.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test(expected = org.saxpath.XPathSyntaxException.class)
	public void testParse_fixture_2()
		throws Exception {
		XPathReader fixture2 = getFixture();
		String xpath = "";

		fixture2.parse(xpath);

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
		new org.junit.runner.JUnitCore().run(XPathReaderTest.class);
	}
}