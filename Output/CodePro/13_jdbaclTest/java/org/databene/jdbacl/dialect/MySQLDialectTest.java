package org.databene.jdbacl.dialect;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MySQLDialectTest</code> contains tests for the class <code>{@link MySQLDialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MySQLDialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MySQLDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private MySQLDialect fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MySQLDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public MySQLDialect getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new MySQLDialect();
		}
		return fixture;
	}

	/**
	 * Run the MySQLDialect() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMySQLDialect_1()
		throws Exception {

		MySQLDialect result = new MySQLDialect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.supportsRegex());
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals("mysql", result.getSystem());
		assertEquals(false, result.isSequenceSupported());
	}

	/**
	 * Run the boolean isDefaultCatalog(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultCatalog_fixture_1()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String catalog = "";
		String user = "";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultCatalog(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultCatalog_fixture_2()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String catalog = "0123456789";
		String user = "0123456789";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultCatalog(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultCatalog_fixture_3()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String catalog = "0123456789";
		String user = "";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultCatalog(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultCatalog_fixture_4()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String catalog = "";
		String user = "0123456789";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultSchema(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultSchema_fixture_1()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String schema = "";
		String user = "";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultSchema(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultSchema_fixture_2()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String schema = "0123456789";
		String user = "0123456789";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultSchema(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultSchema_fixture_3()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String schema = "0123456789";
		String user = "";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefaultSchema(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultSchema_fixture_4()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String schema = "";
		String user = "0123456789";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDeterministicFKName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicFKName_fixture_1()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String fkName = "";

		boolean result = fixture2.isDeterministicFKName(fkName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicFKName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicFKName_fixture_2()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String fkName = "0123456789";

		boolean result = fixture2.isDeterministicFKName(fkName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicIndexName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicIndexName_fixture_1()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String indexName = "";

		boolean result = fixture2.isDeterministicIndexName(indexName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicIndexName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicIndexName_fixture_2()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String indexName = "0123456789";

		boolean result = fixture2.isDeterministicIndexName(indexName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicPKName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicPKName_fixture_1()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String pkName = "";

		boolean result = fixture2.isDeterministicPKName(pkName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicPKName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicPKName_fixture_2()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String pkName = "0123456789";

		boolean result = fixture2.isDeterministicPKName(pkName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicUKName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicUKName_fixture_1()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String ukName = "";

		boolean result = fixture2.isDeterministicUKName(ukName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicUKName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicUKName_fixture_2()
		throws Exception {
		MySQLDialect fixture2 = getFixture();
		String ukName = "0123456789";

		boolean result = fixture2.isDeterministicUKName(ukName);

		// add additional test code here
		assertEquals(true, result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "";
		boolean not = false;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" REGEXP ''", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = true;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 NOT REGEXP '0123456789'", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = true;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 NOT REGEXP ''", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = false;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 REGEXP '0123456789'", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = false;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("0123456789 REGEXP ''", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "";
		boolean not = true;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" NOT REGEXP '0123456789'", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "";
		boolean not = true;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" NOT REGEXP ''", result);
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
		MySQLDialect fixture2 = getFixture();
		String expression = "";
		boolean not = false;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals(" REGEXP '0123456789'", result);
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
		MySQLDialect fixture2 = getFixture();

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
		new org.junit.runner.JUnitCore().run(MySQLDialectTest.class);
	}
}