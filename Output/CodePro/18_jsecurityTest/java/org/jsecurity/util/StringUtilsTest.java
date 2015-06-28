package org.jsecurity.util;

import java.text.ParseException;
import java.util.Collection;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StringUtilsTest</code> contains tests for the class <code>{@link StringUtils}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class StringUtilsTest {
	/**
	 * Run the StringUtils() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStringUtils_1()
		throws Exception {
		StringUtils result = new StringUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String clean(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testClean_1()
		throws Exception {
		String in = "";

		String result = StringUtils.clean(in);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String clean(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testClean_2()
		throws Exception {
		String in = "";

		String result = StringUtils.clean(in);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String clean(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testClean_3()
		throws Exception {
		String in = null;

		String result = StringUtils.clean(in);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasLength(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasLength_1()
		throws Exception {
		String str = "a";

		boolean result = StringUtils.hasLength(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasLength(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasLength_2()
		throws Exception {
		String str = null;

		boolean result = StringUtils.hasLength(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasLength(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasLength_3()
		throws Exception {
		String str = "";

		boolean result = StringUtils.hasLength(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasText_1()
		throws Exception {
		String str = "";

		boolean result = StringUtils.hasText(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasText_2()
		throws Exception {
		String str = "aa";

		boolean result = StringUtils.hasText(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasText_3()
		throws Exception {
		String str = "aa";

		boolean result = StringUtils.hasText(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testHasText_4()
		throws Exception {
		String str = "";

		boolean result = StringUtils.hasText(str);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String[] split(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_1()
		throws Exception {
		String line = "";

		String[] result = StringUtils.split(line);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_2()
		throws Exception {
		String line = "";
		char delimiter = '';

		String[] result = StringUtils.split(line, delimiter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_3()
		throws Exception {
		String line = "";
		char delimiter = '';
		char quoteChar = '';

		String[] result = StringUtils.split(line, delimiter, quoteChar);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_4()
		throws Exception {
		String line = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';

		String[] result = StringUtils.split(line, delimiter, beginQuoteChar, endQuoteChar);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_5()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = true;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_6()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = true;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_7()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_8()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_9()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_10()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_11()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = false;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_12()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_13()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = false;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_14()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = false;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_15()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] split(String,char,char,char,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplit_16()
		throws Exception {
		String aLine = "";
		char delimiter = '';
		char beginQuoteChar = '';
		char endQuoteChar = '';
		boolean retainQuotes = true;
		boolean trimTokens = false;

		String[] result = StringUtils.split(aLine, delimiter, beginQuoteChar, endQuoteChar, retainQuotes, trimTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] splitKeyValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplitKeyValue_1()
		throws Exception {
		String aLine = "";

		String[] result = StringUtils.splitKeyValue(aLine);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] splitKeyValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSplitKeyValue_2()
		throws Exception {
		String aLine = "";

		String[] result = StringUtils.splitKeyValue(aLine);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] splitKeyValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.text.ParseException.class)
	public void testSplitKeyValue_3()
		throws Exception {
		String aLine = "";

		String[] result = StringUtils.splitKeyValue(aLine);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] splitKeyValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.text.ParseException.class)
	public void testSplitKeyValue_4()
		throws Exception {
		String aLine = "";

		String[] result = StringUtils.splitKeyValue(aLine);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] splitKeyValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.text.ParseException.class)
	public void testSplitKeyValue_5()
		throws Exception {
		String aLine = "";

		String[] result = StringUtils.splitKeyValue(aLine);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean startsWithIgnoreCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStartsWithIgnoreCase_1()
		throws Exception {
		String str = null;
		String prefix = "";

		boolean result = StringUtils.startsWithIgnoreCase(str, prefix);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean startsWithIgnoreCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStartsWithIgnoreCase_2()
		throws Exception {
		String str = "";
		String prefix = null;

		boolean result = StringUtils.startsWithIgnoreCase(str, prefix);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean startsWithIgnoreCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStartsWithIgnoreCase_3()
		throws Exception {
		String str = "";
		String prefix = "";

		boolean result = StringUtils.startsWithIgnoreCase(str, prefix);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean startsWithIgnoreCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStartsWithIgnoreCase_4()
		throws Exception {
		String str = "a";
		String prefix = "a";

		boolean result = StringUtils.startsWithIgnoreCase(str, prefix);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean startsWithIgnoreCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStartsWithIgnoreCase_5()
		throws Exception {
		String str = "";
		String prefix = "";

		boolean result = StringUtils.startsWithIgnoreCase(str, prefix);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean startsWithIgnoreCase(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testStartsWithIgnoreCase_6()
		throws Exception {
		String str = "";
		String prefix = "";

		boolean result = StringUtils.startsWithIgnoreCase(str, prefix);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String[] toStringArray(Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToStringArray_1()
		throws Exception {
		Collection collection = null;

		String[] result = StringUtils.toStringArray(collection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] toStringArray(Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToStringArray_2()
		throws Exception {
		Collection collection = new Vector();

		String[] result = StringUtils.toStringArray(collection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenizeToStringArray(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testTokenizeToStringArray_1()
		throws Exception {
		String str = "";
		String delimiters = "";

		String[] result = StringUtils.tokenizeToStringArray(str, delimiters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenizeToStringArray(String,String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testTokenizeToStringArray_2()
		throws Exception {
		String str = null;
		String delimiters = "";
		boolean trimTokens = true;
		boolean ignoreEmptyTokens = true;

		String[] result = StringUtils.tokenizeToStringArray(str, delimiters, trimTokens, ignoreEmptyTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenizeToStringArray(String,String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testTokenizeToStringArray_3()
		throws Exception {
		String str = "";
		String delimiters = "";
		boolean trimTokens = true;
		boolean ignoreEmptyTokens = false;

		String[] result = StringUtils.tokenizeToStringArray(str, delimiters, trimTokens, ignoreEmptyTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenizeToStringArray(String,String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testTokenizeToStringArray_4()
		throws Exception {
		String str = "";
		String delimiters = "";
		boolean trimTokens = true;
		boolean ignoreEmptyTokens = true;

		String[] result = StringUtils.tokenizeToStringArray(str, delimiters, trimTokens, ignoreEmptyTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenizeToStringArray(String,String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testTokenizeToStringArray_5()
		throws Exception {
		String str = "";
		String delimiters = "";
		boolean trimTokens = false;
		boolean ignoreEmptyTokens = true;

		String[] result = StringUtils.tokenizeToStringArray(str, delimiters, trimTokens, ignoreEmptyTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] tokenizeToStringArray(String,String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testTokenizeToStringArray_6()
		throws Exception {
		String str = "";
		String delimiters = "";
		boolean trimTokens = true;
		boolean ignoreEmptyTokens = true;

		String[] result = StringUtils.tokenizeToStringArray(str, delimiters, trimTokens, ignoreEmptyTokens);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StringUtilsTest.class);
	}
}