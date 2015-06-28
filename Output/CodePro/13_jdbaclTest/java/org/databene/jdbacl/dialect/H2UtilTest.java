package org.databene.jdbacl.dialect;

import java.sql.Connection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>H2UtilTest</code> contains tests for the class <code>{@link H2Util}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class H2UtilTest {
	/**
	 * Run the H2Util() constructor test.
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testH2Util_1()
		throws Exception {
		H2Util result = new H2Util();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Connection connectInMemoryDB(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_1()
		throws Exception {
		String dbName = "";

		Connection result = H2Util.connectInMemoryDB(dbName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("UNNAMED", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_2()
		throws Exception {
		String dbName = "0123456789";

		Connection result = H2Util.connectInMemoryDB(dbName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("0123456789", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_3()
		throws Exception {
		String dbName = "";
		int port = 0;

		Connection result = H2Util.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("0", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_4()
		throws Exception {
		String dbName = "0123456789";
		int port = 1;

		Connection result = H2Util.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("1", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_5()
		throws Exception {
		String dbName = "";
		int port = 7;

		Connection result = H2Util.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("7", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_6()
		throws Exception {
		String dbName = "";
		int port = 1;

		Connection result = H2Util.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("1", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_7()
		throws Exception {
		String dbName = "0123456789";
		int port = 7;

		Connection result = H2Util.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("7", result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testConnectInMemoryDB_8()
		throws Exception {
		String dbName = "0123456789";
		int port = 0;

		Connection result = H2Util.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getTypeMap());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals("0", result.getCatalog());
	}

	/**
	 * Run the String getInMemoryURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetInMemoryURL_1()
		throws Exception {
		String dbName = "";

		String result = H2Util.getInMemoryURL(dbName);

		// add additional test code here
		assertEquals("jdbc:h2:mem:", result);
	}

	/**
	 * Run the String getInMemoryURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetInMemoryURL_2()
		throws Exception {
		String dbName = "0123456789";

		String result = H2Util.getInMemoryURL(dbName);

		// add additional test code here
		assertEquals("jdbc:h2:mem:0123456789", result);
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
		new org.junit.runner.JUnitCore().run(H2UtilTest.class);
	}
}