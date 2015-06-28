package org.databene.jdbacl.dialect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.databene.commons.ConnectFailedException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HSQLUtilTest</code> contains tests for the class <code>{@link HSQLUtil}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HSQLUtilTest {
	/**
	 * Run the HSQLUtil() constructor test.
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testHSQLUtil_1()
		throws Exception {
		HSQLUtil result = new HSQLUtil();
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
		String dbName = "0123456789";

		Connection result = HSQLUtil.connectInMemoryDB(dbName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
	}

	/**
	 * Run the Connection connectInMemoryDB(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testConnectInMemoryDB_2()
		throws Exception {
		String dbName = "";

		Connection result = HSQLUtil.connectInMemoryDB(dbName);

		// add additional test code here
		assertNotNull(result);
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

		Connection result = HSQLUtil.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
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

		Connection result = HSQLUtil.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
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

		Connection result = HSQLUtil.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
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

		Connection result = HSQLUtil.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
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

		Connection result = HSQLUtil.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
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

		Connection result = HSQLUtil.connectInMemoryDB(dbName, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isReadOnly());
		assertEquals(1, result.getHoldability());
		assertEquals(true, result.getAutoCommit());
		assertEquals(2, result.getTransactionIsolation());
		assertEquals(null, result.getWarnings());
		assertEquals(false, result.isClosed());
		assertEquals(null, result.getCatalog());
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

		String result = HSQLUtil.getInMemoryURL(dbName);

		// add additional test code here
		assertEquals("jdbc:hsqldb:mem:", result);
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

		String result = HSQLUtil.getInMemoryURL(dbName);

		// add additional test code here
		assertEquals("jdbc:hsqldb:mem:0123456789", result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_1()
		throws Exception {
		String url = "";
		String user = "";
		String password = "";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_2()
		throws Exception {
		String url = "0123456789";
		String user = "0123456789";
		String password = "0123456789";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_3()
		throws Exception {
		String url = "0123456789";
		String user = "0123456789";
		String password = "";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_4()
		throws Exception {
		String url = "0123456789";
		String user = "";
		String password = "0123456789";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_5()
		throws Exception {
		String url = "0123456789";
		String user = "";
		String password = "";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_6()
		throws Exception {
		String url = "";
		String user = "0123456789";
		String password = "0123456789";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_7()
		throws Exception {
		String url = "";
		String user = "0123456789";
		String password = "";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Statement shutdown(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testShutdown_8()
		throws Exception {
		String url = "";
		String user = "";
		String password = "0123456789";

		Statement result = HSQLUtil.shutdown(url, user, password);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(HSQLUtilTest.class);
	}
}