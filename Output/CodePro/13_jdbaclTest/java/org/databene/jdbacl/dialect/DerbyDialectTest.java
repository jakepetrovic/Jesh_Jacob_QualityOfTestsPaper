package org.databene.jdbacl.dialect;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DerbyDialectTest</code> contains tests for the class <code>{@link DerbyDialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DerbyDialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DerbyDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DerbyDialect fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DerbyDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DerbyDialect fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DerbyDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DerbyDialect getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DerbyDialect();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DerbyDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DerbyDialect getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DerbyDialect(false);
		}
		return fixture2;
	}

	/**
	 * Run the DerbyDialect() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDerbyDialect_1()
		throws Exception {

		DerbyDialect result = new DerbyDialect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals(false, result.supportsRegex());
		assertEquals("derby", result.getSystem());
		assertEquals(false, result.isSequenceSupported());
	}

	/**
	 * Run the DerbyDialect(boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDerbyDialect_2()
		throws Exception {
		boolean sequenceSupported = false;

		DerbyDialect result = new DerbyDialect(sequenceSupported);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals(false, result.supportsRegex());
		assertEquals("derby", result.getSystem());
		assertEquals(false, result.isSequenceSupported());
	}

	/**
	 * Run the DerbyDialect(boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDerbyDialect_3()
		throws Exception {
		boolean sequenceSupported = true;

		DerbyDialect result = new DerbyDialect(sequenceSupported);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isSequenceBoundarySupported());
		assertEquals(false, result.supportsRegex());
		assertEquals("derby", result.getSystem());
		assertEquals(true, result.isSequenceSupported());
	}

	/**
	 * Run the boolean isDefaultCatalog(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDefaultCatalog_fixture1_1()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String catalog = "";
		String user = "";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture2_1()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String catalog = "0123456789";
		String user = "0123456789";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture2_2()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String catalog = "0123456789";
		String user = "";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture2_3()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String catalog = "";
		String user = "0123456789";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture2_4()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String catalog = "";
		String user = "";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture1_2()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String catalog = "0123456789";
		String user = "0123456789";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture1_3()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String catalog = "0123456789";
		String user = "";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultCatalog_fixture1_4()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String catalog = "";
		String user = "0123456789";

		boolean result = fixture.isDefaultCatalog(catalog, user);

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
	public void testIsDefaultSchema_fixture1_1()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String schema = "APP";
		String user = "";

		boolean result = fixture.isDefaultSchema(schema, user);

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
	public void testIsDefaultSchema_fixture1_2()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String schema = "APP";
		String user = "0123456789";

		boolean result = fixture.isDefaultSchema(schema, user);

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
	public void testIsDefaultSchema_fixture2_1()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String schema = "APP";
		String user = "";

		boolean result = fixture.isDefaultSchema(schema, user);

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
	public void testIsDefaultSchema_fixture2_2()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String schema = "APP";
		String user = "0123456789";

		boolean result = fixture.isDefaultSchema(schema, user);

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
	public void testIsDeterministicFKName_fixture1_1()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String fkName = "";

		boolean result = fixture.isDeterministicFKName(fkName);

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
	public void testIsDeterministicFKName_fixture2_1()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String fkName = "0123456789";

		boolean result = fixture.isDeterministicFKName(fkName);

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
	public void testIsDeterministicFKName_fixture2_2()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String fkName = "";

		boolean result = fixture.isDeterministicFKName(fkName);

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
	public void testIsDeterministicFKName_fixture1_2()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String fkName = "0123456789";

		boolean result = fixture.isDeterministicFKName(fkName);

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
	public void testIsDeterministicIndexName_fixture1_1()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String indexName = "";

		boolean result = fixture.isDeterministicIndexName(indexName);

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
	public void testIsDeterministicIndexName_fixture2_1()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String indexName = "0123456789";

		boolean result = fixture.isDeterministicIndexName(indexName);

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
	public void testIsDeterministicIndexName_fixture2_2()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String indexName = "";

		boolean result = fixture.isDeterministicIndexName(indexName);

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
	public void testIsDeterministicIndexName_fixture1_2()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String indexName = "0123456789";

		boolean result = fixture.isDeterministicIndexName(indexName);

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
	public void testIsDeterministicPKName_fixture1_1()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String pkName = "";

		boolean result = fixture.isDeterministicPKName(pkName);

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
	public void testIsDeterministicPKName_fixture2_1()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String pkName = "0123456789";

		boolean result = fixture.isDeterministicPKName(pkName);

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
	public void testIsDeterministicPKName_fixture2_2()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String pkName = "";

		boolean result = fixture.isDeterministicPKName(pkName);

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
	public void testIsDeterministicPKName_fixture1_2()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String pkName = "0123456789";

		boolean result = fixture.isDeterministicPKName(pkName);

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
	public void testIsDeterministicUKName_fixture1_1()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String ukName = "";

		boolean result = fixture.isDeterministicUKName(ukName);

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
	public void testIsDeterministicUKName_fixture2_1()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String ukName = "0123456789";

		boolean result = fixture.isDeterministicUKName(ukName);

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
	public void testIsDeterministicUKName_fixture2_2()
		throws Exception {
		DerbyDialect fixture = getFixture2();
		String ukName = "";

		boolean result = fixture.isDeterministicUKName(ukName);

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
	public void testIsDeterministicUKName_fixture1_2()
		throws Exception {
		DerbyDialect fixture = getFixture1();
		String ukName = "0123456789";

		boolean result = fixture.isDeterministicUKName(ukName);

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
		new org.junit.runner.JUnitCore().run(DerbyDialectTest.class);
	}
}