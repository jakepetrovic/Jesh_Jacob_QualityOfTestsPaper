package org.databene.jdbacl.dialect;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SqlServerDialectTest</code> contains tests for the class <code>{@link SqlServerDialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SqlServerDialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SqlServerDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SqlServerDialect fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SqlServerDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SqlServerDialect getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SqlServerDialect();
		}
		return fixture;
	}

	/**
	 * Run the SqlServerDialect() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSqlServerDialect_1()
		throws Exception {

		SqlServerDialect result = new SqlServerDialect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isSequenceSupported());
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals(false, result.supportsRegex());
		assertEquals("sql_server", result.getSystem());
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
		String schema = "DBO";
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
		SqlServerDialect fixture2 = getFixture();
		String schema = "DBO";
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
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
		SqlServerDialect fixture2 = getFixture();
		String pkName = "0123456789";

		boolean result = fixture2.isDeterministicUKName(pkName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_1()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "";
		String elseExpression = "";
		String whenThenExpressionPair1 = "";
		String whenThenExpressionPair2 = "0123456789";
		String whenThenExpressionPair3 = "An��t-1.0.txt";
		String whenThenExpressionPair4 = null;

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1, whenThenExpressionPair2, whenThenExpressionPair3, whenThenExpressionPair4);

		// add additional test code here
		assertEquals(" = CASE WHEN  THEN 0123456789 WHEN An��t-1.0.txt THEN null END", result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_2()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "0123456789";
		String elseExpression = "0123456789";
		String whenThenExpressionPair1 = "";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_3()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "0123456789";
		String elseExpression = "";
		String whenThenExpressionPair1 = "0123456789";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_4()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "0123456789";
		String elseExpression = "";
		String whenThenExpressionPair1 = "";
		String whenThenExpressionPair2 = "0123456789";
		String whenThenExpressionPair3 = "An��t-1.0.txt";
		String whenThenExpressionPair4 = null;

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1, whenThenExpressionPair2, whenThenExpressionPair3, whenThenExpressionPair4);

		// add additional test code here
		assertEquals("0123456789 = CASE WHEN  THEN 0123456789 WHEN An��t-1.0.txt THEN null END", result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_5()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "";
		String elseExpression = "0123456789";
		String whenThenExpressionPair1 = "";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_6()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "";
		String elseExpression = "";
		String whenThenExpressionPair1 = "0123456789";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_7()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "";
		String elseExpression = "";
		String whenThenExpressionPair1 = "";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_8()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "0123456789";
		String elseExpression = "0123456789";
		String whenThenExpressionPair1 = "0123456789";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_9()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "0123456789";
		String elseExpression = "0123456789";
		String whenThenExpressionPair1 = "";
		String whenThenExpressionPair2 = "0123456789";
		String whenThenExpressionPair3 = "An��t-1.0.txt";
		String whenThenExpressionPair4 = null;

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1, whenThenExpressionPair2, whenThenExpressionPair3, whenThenExpressionPair4);

		// add additional test code here
		assertEquals("0123456789 = CASE WHEN  THEN 0123456789 WHEN An��t-1.0.txt THEN null ELSE 0123456789 END", result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_10()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "0123456789";
		String elseExpression = "";
		String whenThenExpressionPair1 = "";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_11()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "";
		String elseExpression = "0123456789";
		String whenThenExpressionPair1 = "0123456789";

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at org.databene.jdbacl.dialect.SqlServerDialect.renderCase(SqlServerDialect.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCase(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCase_fixture_12()
		throws Exception {
		SqlServerDialect fixture2 = getFixture();
		String columnName = "";
		String elseExpression = "0123456789";
		String whenThenExpressionPair1 = "";
		String whenThenExpressionPair2 = "0123456789";
		String whenThenExpressionPair3 = "An��t-1.0.txt";
		String whenThenExpressionPair4 = null;

		String result = fixture2.renderCase(columnName, elseExpression, whenThenExpressionPair1, whenThenExpressionPair2, whenThenExpressionPair3, whenThenExpressionPair4);

		// add additional test code here
		assertEquals(" = CASE WHEN  THEN 0123456789 WHEN An��t-1.0.txt THEN null ELSE 0123456789 END", result);
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
		new org.junit.runner.JUnitCore().run(SqlServerDialectTest.class);
	}
}