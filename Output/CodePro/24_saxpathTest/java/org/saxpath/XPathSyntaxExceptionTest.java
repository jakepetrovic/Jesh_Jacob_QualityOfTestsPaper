package org.saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XPathSyntaxExceptionTest</code> contains tests for the class <code>{@link XPathSyntaxException}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XPathSyntaxExceptionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathSyntaxException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathSyntaxException fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathSyntaxException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathSyntaxException fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathSyntaxException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathSyntaxException fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathSyntaxException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathSyntaxException getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new XPathSyntaxException("", 0, "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathSyntaxException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathSyntaxException getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new XPathSyntaxException("0123456789", 3, "0123456789");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathSyntaxException
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathSyntaxException getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new XPathSyntaxException((String) null, 0, "An��t-1.0.txt");
		}
		return fixture3;
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_1()
		throws Exception {
		String xpath = "";
		int position = 0;
		String message = "";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 0: ", result.toString());
		assertEquals("", result.getXPath());
		assertEquals("^", result.getPositionMarker());
		assertEquals("\n\n^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_2()
		throws Exception {
		String xpath = "0123456789";
		int position = 3;
		String message = "0123456789";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 3: 0123456789", result.toString());
		assertEquals("0123456789", result.getXPath());
		assertEquals("   ^", result.getPositionMarker());
		assertEquals("0123456789\n0123456789\n   ^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_3()
		throws Exception {
		String xpath = "0123456789";
		int position = 3;
		String message = "";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 3: ", result.toString());
		assertEquals("0123456789", result.getXPath());
		assertEquals("   ^", result.getPositionMarker());
		assertEquals("\n0123456789\n   ^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_4()
		throws Exception {
		String xpath = "0123456789";
		int position = 0;
		String message = "0123456789";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 0: 0123456789", result.toString());
		assertEquals("0123456789", result.getXPath());
		assertEquals("^", result.getPositionMarker());
		assertEquals("0123456789\n0123456789\n^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_5()
		throws Exception {
		String xpath = "0123456789";
		int position = 0;
		String message = "";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 0: ", result.toString());
		assertEquals("0123456789", result.getXPath());
		assertEquals("^", result.getPositionMarker());
		assertEquals("\n0123456789\n^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_6()
		throws Exception {
		String xpath = "";
		int position = 3;
		String message = "0123456789";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 3: 0123456789", result.toString());
		assertEquals("", result.getXPath());
		assertEquals("   ^", result.getPositionMarker());
		assertEquals("0123456789\n\n   ^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_7()
		throws Exception {
		String xpath = "";
		int position = 3;
		String message = "";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 3: ", result.toString());
		assertEquals("", result.getXPath());
		assertEquals("   ^", result.getPositionMarker());
		assertEquals("\n\n   ^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the XPathSyntaxException(String,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathSyntaxException_8()
		throws Exception {
		String xpath = "";
		int position = 0;
		String message = "0123456789";

		XPathSyntaxException result = new XPathSyntaxException(xpath, position, message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getPosition());
		assertEquals("com.werken.saxpath.XPathSyntaxException: 0: 0123456789", result.toString());
		assertEquals("", result.getXPath());
		assertEquals("^", result.getPositionMarker());
		assertEquals("0123456789\n\n^", result.getMultilineMessage());
		assertEquals(null, result.getCause());
		assertEquals("0123456789", result.getMessage());
		assertEquals("0123456789", result.getLocalizedMessage());
	}

	/**
	 * Run the String getMultilineMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetMultilineMessage_fixture1_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture1();

		String result = fixture.getMultilineMessage();

		// add additional test code here
		assertEquals("\n\n^", result);
	}

	/**
	 * Run the String getMultilineMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetMultilineMessage_fixture2_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture2();

		String result = fixture.getMultilineMessage();

		// add additional test code here
		assertEquals("0123456789\n0123456789\n   ^", result);
	}

	/**
	 * Run the String getMultilineMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetMultilineMessage_fixture3_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture3();

		String result = fixture.getMultilineMessage();

		// add additional test code here
		assertEquals("An��t-1.0.txt\nnull\n^", result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetPosition_fixture1_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture1();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetPosition_fixture2_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture2();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetPosition_fixture3_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture3();

		int result = fixture.getPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getPositionMarker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetPositionMarker_fixture1_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture1();

		String result = fixture.getPositionMarker();

		// add additional test code here
		assertEquals("^", result);
	}

	/**
	 * Run the String getPositionMarker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetPositionMarker_fixture2_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture2();

		String result = fixture.getPositionMarker();

		// add additional test code here
		assertEquals("   ^", result);
	}

	/**
	 * Run the String getPositionMarker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetPositionMarker_fixture3_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture3();

		String result = fixture.getPositionMarker();

		// add additional test code here
		assertEquals("^", result);
	}

	/**
	 * Run the String getXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetXPath_fixture1_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture1();

		String result = fixture.getXPath();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetXPath_fixture2_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture2();

		String result = fixture.getXPath();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetXPath_fixture3_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture3();

		String result = fixture.getXPath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("com.werken.saxpath.XPathSyntaxException: 0: ", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("com.werken.saxpath.XPathSyntaxException: 3: 0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		XPathSyntaxException fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("com.werken.saxpath.XPathSyntaxException: 0: An��t-1.0.txt", result);
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
		new org.junit.runner.JUnitCore().run(XPathSyntaxExceptionTest.class);
	}
}