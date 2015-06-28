package net.sourceforge.schemaspy.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InflectionTest</code> contains tests for the class <code>{@link Inflection}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:18 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class InflectionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private Inflection fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private Inflection fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private Inflection fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private Inflection fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private Inflection fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	private Inflection fixture6;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public Inflection getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Inflection("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public Inflection getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Inflection("", "");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public Inflection getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Inflection("", "", false);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public Inflection getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Inflection("0123456789", "0123456789");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public Inflection getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Inflection("0123456789", "0123456789", true);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Inflection
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public Inflection getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Inflection("An��t-1.0.txt", "An��t-1.0.txt", true);
		}
		return fixture6;
	}

	/**
	 * Run the Inflection(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_1()
		throws Exception {
		String pattern = "";

		Inflection result = new Inflection(pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_2()
		throws Exception {
		String pattern = "0123456789";

		Inflection result = new Inflection(pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_3()
		throws Exception {
		String pattern = "1";

		Inflection result = new Inflection(pattern);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_4()
		throws Exception {
		String pattern = "";
		String replacement = "";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_5()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "0123456789";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_6()
		throws Exception {
		String pattern = "1";
		String replacement = "1";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_7()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_8()
		throws Exception {
		String pattern = "1";
		String replacement = "0123456789";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_9()
		throws Exception {
		String pattern = "";
		String replacement = "1";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_10()
		throws Exception {
		String pattern = "1";
		String replacement = "";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_11()
		throws Exception {
		String pattern = "";
		String replacement = "0123456789";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_12()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "1";

		Inflection result = new Inflection(pattern, replacement);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_13()
		throws Exception {
		String pattern = "";
		String replacement = "";
		boolean ignoreCase = false;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_14()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "0123456789";
		boolean ignoreCase = true;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_15()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "0123456789";
		boolean ignoreCase = false;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_16()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "";
		boolean ignoreCase = true;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_17()
		throws Exception {
		String pattern = "0123456789";
		String replacement = "";
		boolean ignoreCase = false;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_18()
		throws Exception {
		String pattern = "";
		String replacement = "0123456789";
		boolean ignoreCase = true;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_19()
		throws Exception {
		String pattern = "";
		String replacement = "0123456789";
		boolean ignoreCase = false;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Inflection(String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testInflection_20()
		throws Exception {
		String pattern = "";
		String replacement = "";
		boolean ignoreCase = true;

		Inflection result = new Inflection(pattern, replacement, ignoreCase);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isUncountable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testIsUncountable_1()
		throws Exception {
		String word = "";

		boolean result = Inflection.isUncountable(word);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUncountable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testIsUncountable_2()
		throws Exception {
		String word = "0123456789";

		boolean result = Inflection.isUncountable(word);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture1_1()
		throws Exception {
		Inflection fixture = getFixture1();
		String word = "";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture2_1()
		throws Exception {
		Inflection fixture = getFixture2();
		String word = "0123456789";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture3_1()
		throws Exception {
		Inflection fixture = getFixture3();
		String word = "0123456789";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture4_1()
		throws Exception {
		Inflection fixture = getFixture4();
		String word = "0123456789";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture5_1()
		throws Exception {
		Inflection fixture = getFixture5();
		String word = "0123456789";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture6_1()
		throws Exception {
		Inflection fixture = getFixture6();
		String word = "0123456789";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture2_2()
		throws Exception {
		Inflection fixture = getFixture2();
		String word = "";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture3_2()
		throws Exception {
		Inflection fixture = getFixture3();
		String word = "";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture4_2()
		throws Exception {
		Inflection fixture = getFixture4();
		String word = "";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture5_2()
		throws Exception {
		Inflection fixture = getFixture5();
		String word = "";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture6_2()
		throws Exception {
		Inflection fixture = getFixture6();
		String word = "";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean match(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testMatch_fixture1_2()
		throws Exception {
		Inflection fixture = getFixture1();
		String word = "0123456789";

		boolean result = fixture.match(word);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String pluralize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testPluralize_1()
		throws Exception {
		String word = "";

		String result = Inflection.pluralize(word);

		// add additional test code here
		assertEquals("s", result);
	}

	/**
	 * Run the String pluralize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testPluralize_2()
		throws Exception {
		String word = "0123456789";

		String result = Inflection.pluralize(word);

		// add additional test code here
		assertEquals("0123456789s", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture1_1()
		throws Exception {
		Inflection fixture = getFixture1();
		String word = "";

		String result = fixture.replace(word);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.regex.Matcher.appendReplacement(Matcher.java:758)
		//       at java.util.regex.Matcher.replaceAll(Matcher.java:906)
		//       at net.sourceforge.schemaspy.util.Inflection.replace(Inflection.java:164)
		assertNotNull(result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture2_1()
		throws Exception {
		Inflection fixture = getFixture2();
		String word = "0123456789";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture3_1()
		throws Exception {
		Inflection fixture = getFixture3();
		String word = "0123456789";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture4_1()
		throws Exception {
		Inflection fixture = getFixture4();
		String word = "0123456789";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture5_1()
		throws Exception {
		Inflection fixture = getFixture5();
		String word = "0123456789";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture6_1()
		throws Exception {
		Inflection fixture = getFixture6();
		String word = "0123456789";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture2_2()
		throws Exception {
		Inflection fixture = getFixture2();
		String word = "";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture3_2()
		throws Exception {
		Inflection fixture = getFixture3();
		String word = "";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture4_2()
		throws Exception {
		Inflection fixture = getFixture4();
		String word = "";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture5_2()
		throws Exception {
		Inflection fixture = getFixture5();
		String word = "";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture6_2()
		throws Exception {
		Inflection fixture = getFixture6();
		String word = "";

		String result = fixture.replace(word);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testReplace_fixture1_2()
		throws Exception {
		Inflection fixture = getFixture1();
		String word = "0123456789";

		String result = fixture.replace(word);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.regex.Matcher.appendReplacement(Matcher.java:758)
		//       at java.util.regex.Matcher.replaceAll(Matcher.java:906)
		//       at net.sourceforge.schemaspy.util.Inflection.replace(Inflection.java:164)
		assertNotNull(result);
	}

	/**
	 * Run the String singularize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testSingularize_1()
		throws Exception {
		String word = "";

		String result = Inflection.singularize(word);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String singularize(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	@Test
	public void testSingularize_2()
		throws Exception {
		String word = "0123456789";

		String result = Inflection.singularize(word);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:18 PM
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
	 * @generatedBy CodePro at 6/7/15 4:18 PM
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
	 * @generatedBy CodePro at 6/7/15 4:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InflectionTest.class);
	}
}