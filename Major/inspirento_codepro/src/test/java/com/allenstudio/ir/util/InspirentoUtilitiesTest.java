package com.allenstudio.ir.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InspirentoUtilitiesTest</code> contains tests for the class <code>{@link InspirentoUtilities}</code>.
 *
 * @generatedBy CodePro at 4/8/14 12:31 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class InspirentoUtilitiesTest {
	/**
	 * Run the String escapeText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testEscapeText_1()
		throws Exception {
		String str = "";

		String result = InspirentoUtilities.escapeText(str);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringBuffer stringReplaceAll(StringBuffer,char,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testStringReplaceAll_1()
		throws Exception {
		StringBuffer source = new StringBuffer();
		char token = '';
		String replacement = "";

		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringBuffer stringReplaceAll(StringBuffer,char,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testStringReplaceAll_2()
		throws Exception {
		StringBuffer source = new StringBuffer();
		char token = '';
		String replacement = "";

		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StringBuffer stringReplaceAll(StringBuffer,char,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testStringReplaceAll_3()
		throws Exception {
		StringBuffer source = new StringBuffer();
		char token = '';
		String replacement = "";

		StringBuffer result = InspirentoUtilities.stringReplaceAll(source, token, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testTokenize_1()
		throws Exception {
		String input = "";

		String[] result = InspirentoUtilities.tokenize(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testTokenize_2()
		throws Exception {
		String input = "";

		String[] result = InspirentoUtilities.tokenize(input);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenize(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testTokenize_3()
		throws Exception {
		String input = "";
		String delim = "";

		String[] result = InspirentoUtilities.tokenize(input, delim);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenize(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testTokenize_4()
		throws Exception {
		String input = "";
		String delim = "";

		String[] result = InspirentoUtilities.tokenize(input, delim);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
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
	 * @generatedBy CodePro at 4/8/14 12:31 PM
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
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InspirentoUtilitiesTest.class);
	}
}