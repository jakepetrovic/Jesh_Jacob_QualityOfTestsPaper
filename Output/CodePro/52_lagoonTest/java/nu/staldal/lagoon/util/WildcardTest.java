package nu.staldal.lagoon.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WildcardTest</code> contains tests for the class <code>{@link Wildcard}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class WildcardTest {
	/**
	 * Run the String instantiateWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testInstantiateWildcard_1()
		throws Exception {
		String pattern = "";
		String part = "";

		String result = Wildcard.instantiateWildcard(pattern, part);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String instantiateWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testInstantiateWildcard_2()
		throws Exception {
		String pattern = "0123456789";
		String part = "0123456789";

		String result = Wildcard.instantiateWildcard(pattern, part);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String instantiateWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testInstantiateWildcard_3()
		throws Exception {
		String pattern = "0123456789";
		String part = "";

		String result = Wildcard.instantiateWildcard(pattern, part);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String instantiateWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testInstantiateWildcard_4()
		throws Exception {
		String pattern = "";
		String part = "0123456789";

		String result = Wildcard.instantiateWildcard(pattern, part);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isWildcard(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIsWildcard_1()
		throws Exception {
		String pattern = "";

		boolean result = Wildcard.isWildcard(pattern);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isWildcard(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testIsWildcard_2()
		throws Exception {
		String pattern = "0123456789";

		boolean result = Wildcard.isWildcard(pattern);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String matchWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testMatchWildcard_1()
		throws Exception {
		String pattern = "";
		String filename = "";

		String result = Wildcard.matchWildcard(pattern, filename);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String matchWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testMatchWildcard_2()
		throws Exception {
		String pattern = "0123456789";
		String filename = "0";

		String result = Wildcard.matchWildcard(pattern, filename);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String matchWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testMatchWildcard_3()
		throws Exception {
		String pattern = "";
		String filename = "0123456";

		String result = Wildcard.matchWildcard(pattern, filename);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String matchWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testMatchWildcard_4()
		throws Exception {
		String pattern = "";
		String filename = "0";

		String result = Wildcard.matchWildcard(pattern, filename);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String matchWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testMatchWildcard_5()
		throws Exception {
		String pattern = "0123456789";
		String filename = "0123456";

		String result = Wildcard.matchWildcard(pattern, filename);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String matchWildcard(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testMatchWildcard_6()
		throws Exception {
		String pattern = "0123456789";
		String filename = "";

		String result = Wildcard.matchWildcard(pattern, filename);

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(WildcardTest.class);
	}
}