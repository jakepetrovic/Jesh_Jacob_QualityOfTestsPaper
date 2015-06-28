package nu.staldal.lagoon;

import org.junit.*;
import nu.staldal.lsp.compiledexpr.BuiltInFunctionCall;
import static org.junit.Assert.*;
import org.xml.sax.Locator;
import nu.staldal.lsp.compile.LSPForEach;
import nu.staldal.lsp.compile.LSPIf;
import nu.staldal.lsp.compiler.LSPExpr;
import org.xml.sax.SAXParseException;
import nu.staldal.lsp.compiledexpr.ExtensionFunctionCall;
import nu.staldal.lsp.compile.LSPNode;

/**
 * The class <code>MyParserTest</code> contains tests for the class <code>{@link MyParser}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:36 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MyParserTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MyParser
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	private MyParser fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MyParser
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	public MyParser getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new MyParser();
		}
		return fixture;
	}

	/**
	 * Run the MyParser() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testMyParser_1()
		throws Exception {

		MyParser result = new MyParser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_1()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_2()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_3()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_4()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_5()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_6()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_7()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_8()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_9()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_10()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_11()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_12()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_13()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_14()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_15()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testError_fixture_16()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture2.error(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_1()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_2()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_3()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_4()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_5()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_6()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_7()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_8()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_9()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_10()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_11()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_12()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_13()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_14()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_15()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testFatalError_fixture_16()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture2.fatalError(e);

		// add additional test code here
	}

	/**
	 * Run the boolean parse(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testParse_fixture_1()
		throws Exception {
		MyParser fixture2 = getFixture();
		String input = "";
		boolean validate = false;

		boolean result = fixture2.parse(input, validate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean parse(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testParse_fixture_2()
		throws Exception {
		MyParser fixture2 = getFixture();
		String input = "0123456789";
		boolean validate = true;

		boolean result = fixture2.parse(input, validate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean parse(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testParse_fixture_3()
		throws Exception {
		MyParser fixture2 = getFixture();
		String input = "0123456789";
		boolean validate = false;

		boolean result = fixture2.parse(input, validate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean parse(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testParse_fixture_4()
		throws Exception {
		MyParser fixture2 = getFixture();
		String input = "";
		boolean validate = true;

		boolean result = fixture2.parse(input, validate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_1()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", "", "", 0, 0);

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_2()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", "", "", 0, 0, new Exception(""));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_3()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_4()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("", new LSPForEach(new BuiltInFunctionCall(""), "", "", new LSPIf(new BuiltInFunctionCall(""), (LSPNode) null, (Locator) null), (Locator) null), new Exception(""));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_5()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_6()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "", Integer.MAX_VALUE, Integer.MAX_VALUE, new Exception(new Throwable("")));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_7()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1);

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_8()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", "0123456789", "0123456789", 1, 1, new Exception("", new Throwable("")));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_9()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_10()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("0123456789", new LSPForEach(new ExtensionFunctionCall("", ""), "0123456789", "0123456789", new LSPIf(new ExtensionFunctionCall("", ""), (LSPNode) null, (Locator) null), (Locator) null), new Exception("", new Throwable("")));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_11()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, (Exception) null);

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_12()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7);

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_13()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", 7, 7, new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_14()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException("An��t-1.0.txt", new LSPForEach(new ExtensionFunctionCall("0123456789", "0123456789"), "An��t-1.0.txt", "An��t-1.0.txt", new LSPIf(new ExtensionFunctionCall("0123456789", "0123456789"), (LSPNode) null, (Locator) null), (Locator) null), new Exception("0123456789", new Throwable("", (Throwable) null)));

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_15()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1);

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testWarning_fixture_16()
		throws Exception {
		MyParser fixture2 = getFixture();
		SAXParseException e = new SAXParseException((String) null, (String) null, (String) null, -1, -1, new Exception());

		fixture2.warning(e);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
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
	 * @generatedBy CodePro at 6/28/15 2:36 PM
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
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MyParserTest.class);
	}
}