package org.databene.jdbacl.dialect;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UnknownDialectTest</code> contains tests for the class <code>{@link UnknownDialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class UnknownDialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see UnknownDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private UnknownDialect fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see UnknownDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public UnknownDialect getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new UnknownDialect("");
		}
		return fixture;
	}

	/**
	 * Run the UnknownDialect(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testUnknownDialect_1()
		throws Exception {
		String system = "";

		UnknownDialect result = new UnknownDialect(system);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals(false, result.supportsRegex());
		assertEquals("", result.getSystem());
		assertEquals(false, result.isSequenceSupported());
	}

	/**
	 * Run the UnknownDialect(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testUnknownDialect_2()
		throws Exception {
		String system = "0123456789";

		UnknownDialect result = new UnknownDialect(system);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals(false, result.supportsRegex());
		assertEquals("0123456789", result.getSystem());
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
		UnknownDialect fixture2 = getFixture();
		String catalog = "";
		String user = "";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String catalog = "0123456789";
		String user = "0123456789";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String catalog = "0123456789";
		String user = "";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String catalog = "";
		String user = "0123456789";

		boolean result = fixture2.isDefaultCatalog(catalog, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String schema = "";
		String user = "";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String schema = "0123456789";
		String user = "0123456789";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String schema = "0123456789";
		String user = "";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(true, result);
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
		UnknownDialect fixture2 = getFixture();
		String schema = "";
		String user = "0123456789";

		boolean result = fixture2.isDefaultSchema(schema, user);

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
	public void testIsDeterministicFKName_fixture_1()
		throws Exception {
		UnknownDialect fixture2 = getFixture();
		String pkName = "";

		boolean result = fixture2.isDeterministicFKName(pkName);

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
		UnknownDialect fixture2 = getFixture();
		String pkName = "0123456789";

		boolean result = fixture2.isDeterministicFKName(pkName);

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
		UnknownDialect fixture2 = getFixture();
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
		UnknownDialect fixture2 = getFixture();
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
		UnknownDialect fixture2 = getFixture();
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
		UnknownDialect fixture2 = getFixture();
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
		UnknownDialect fixture2 = getFixture();
		String pkName = "";

		boolean result = fixture2.isDeterministicUKName(pkName);

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
		UnknownDialect fixture2 = getFixture();
		String pkName = "0123456789";

		boolean result = fixture2.isDeterministicUKName(pkName);

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
		new org.junit.runner.JUnitCore().run(UnknownDialectTest.class);
	}
}