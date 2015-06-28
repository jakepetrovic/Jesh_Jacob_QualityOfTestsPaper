package org.databene.jdbacl.dialect;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>Firebird2_5DialectTest</code> contains tests for the class <code>{@link Firebird2_5Dialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class Firebird2_5DialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Firebird2_5Dialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private Firebird2_5Dialect fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Firebird2_5Dialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public Firebird2_5Dialect getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new Firebird2_5Dialect();
		}
		return fixture;
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_1()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "";
		boolean not = false;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" SIMILAR TO ''", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_2()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = true;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 NOT SIMILAR TO '0123456789'", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_3()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = true;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 NOT SIMILAR TO ''", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_4()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = false;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 SIMILAR TO '0123456789'", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_5()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = false;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 SIMILAR TO ''", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_6()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "";
		boolean not = true;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" NOT SIMILAR TO '0123456789'", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_7()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "";
		boolean not = true;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" NOT SIMILAR TO ''", result);
	}

	/**
	 * Run the String regexQuery(String,boolean,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegexQuery_fixture_8()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();
		String expression = "";
		boolean not = false;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" SIMILAR TO '0123456789'", result);
	}

	/**
	 * Run the boolean supportsRegex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSupportsRegex_fixture_1()
		throws Exception {
		Firebird2_5Dialect fixture2 = getFixture();

		boolean result = fixture2.supportsRegex();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(Firebird2_5DialectTest.class);
	}
}