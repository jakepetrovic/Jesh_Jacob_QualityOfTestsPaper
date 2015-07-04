package org.saxpath.helpers;

import org.junit.*;
import static org.junit.Assert.*;
import org.saxpath.SAXPathException;
import org.saxpath.XPathReader;

/**
 * The class <code>XPathReaderFactoryTest</code> contains tests for the class <code>{@link XPathReaderFactory}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XPathReaderFactoryTest {
	/**
	 * Run the XPathReaderFactory() constructor test.
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathReaderFactory_1()
		throws Exception {
		XPathReaderFactory result = new XPathReaderFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the XPathReader createReader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testCreateReader_1()
		throws Exception {

		XPathReader result = XPathReaderFactory.createReader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XPathReader createReader(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test(expected = org.saxpath.SAXPathException.class)
	public void testCreateReader_2()
		throws Exception {
		String className = "";

		XPathReader result = XPathReaderFactory.createReader(className);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XPathReader createReader(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test(expected = org.saxpath.SAXPathException.class)
	public void testCreateReader_3()
		throws Exception {
		String className = "0123456789";

		XPathReader result = XPathReaderFactory.createReader(className);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(XPathReaderFactoryTest.class);
	}
}