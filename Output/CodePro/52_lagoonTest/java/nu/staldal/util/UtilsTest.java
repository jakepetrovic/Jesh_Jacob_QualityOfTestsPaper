package nu.staldal.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UtilsTest</code> contains tests for the class <code>{@link Utils}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class UtilsTest {
	/**
	 * Run the boolean absoluteURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAbsoluteURL_1()
		throws Exception {
		String url = "";

		boolean result = Utils.absoluteURL(url);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean absoluteURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testAbsoluteURL_2()
		throws Exception {
		String url = "0123456789";

		boolean result = Utils.absoluteURL(url);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String encodePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEncodePath_1()
		throws Exception {
		String path = "";

		String result = Utils.encodePath(path);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String encodePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEncodePath_2()
		throws Exception {
		String path = "0";

		String result = Utils.encodePath(path);

		// add additional test code here
		assertEquals("0", result);
	}

	/**
	 * Run the String encodePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEncodePath_3()
		throws Exception {
		String path = "0123456";

		String result = Utils.encodePath(path);

		// add additional test code here
		assertEquals("0123456", result);
	}

	/**
	 * Run the String encodePathAsIdentifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEncodePathAsIdentifier_1()
		throws Exception {
		String path = "";

		String result = Utils.encodePathAsIdentifier(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(String.java:658)
		//       at nu.staldal.util.Utils.encodePathAsIdentifier(Utils.java:115)
		assertNotNull(result);
	}

	/**
	 * Run the String encodePathAsIdentifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEncodePathAsIdentifier_2()
		throws Exception {
		String path = "0";

		String result = Utils.encodePathAsIdentifier(path);

		// add additional test code here
		assertEquals("_48_", result);
	}

	/**
	 * Run the String encodePathAsIdentifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testEncodePathAsIdentifier_3()
		throws Exception {
		String path = "0123456";

		String result = Utils.encodePathAsIdentifier(path);

		// add additional test code here
		assertEquals("_48_123456", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_1()
		throws Exception {
		int n = 0;
		char c = ' ';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_2()
		throws Exception {
		int n = 3;
		char c = '\n';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("\n\n\n", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_3()
		throws Exception {
		int n = 0;
		char c = 'a';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_4()
		throws Exception {
		int n = 3;
		char c = '�';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("���", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_5()
		throws Exception {
		int n = 3;
		char c = ' ';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("   ", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_6()
		throws Exception {
		int n = 0;
		char c = '\n';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_7()
		throws Exception {
		int n = 3;
		char c = 'a';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("aaa", result);
	}

	/**
	 * Run the String nChars(int,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testNChars_8()
		throws Exception {
		int n = 0;
		char c = '�';

		String result = Utils.nChars(n, c);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean pseudoAbsoluteURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPseudoAbsoluteURL_1()
		throws Exception {
		String url = "";

		boolean result = Utils.pseudoAbsoluteURL(url);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean pseudoAbsoluteURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testPseudoAbsoluteURL_2()
		throws Exception {
		String url = "0";

		boolean result = Utils.pseudoAbsoluteURL(url);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UtilsTest.class);
	}
}