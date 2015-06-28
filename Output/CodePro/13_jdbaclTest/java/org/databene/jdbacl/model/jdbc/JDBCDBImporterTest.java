package org.databene.jdbacl.model.jdbc;

import java.sql.Connection;
import java.util.regex.Pattern;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JDBCDBImporterTest</code> contains tests for the class <code>{@link JDBCDBImporter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class JDBCDBImporterTest {
	/**
	 * Run the JDBCDBImporter(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_1()
		throws Exception {
		String environment = "";

		JDBCDBImporter result = new JDBCDBImporter(environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the JDBCDBImporter(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_2()
		throws Exception {
		String environment = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '0123456789.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_3()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "1", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_4()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "1", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_5()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "1", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_6()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "1", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_7()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "12", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_8()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "12", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_9()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "12", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_10()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "1", "12", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_11()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "1", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_12()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "1", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_13()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "1", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_14()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "1", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_15()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "12", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_16()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "12", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_17()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "12", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_18()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "1", "12", "12", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_19()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "1", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_20()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "1", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_21()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "1", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_22()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "1", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_23()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "12", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_24()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "12", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_25()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "12", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_26()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "1", "12", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_27()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "12", "1", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_28()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "12", "1", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_29()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "12", "1", "12", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_30()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "12", "1", "12", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_31()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "12", "12", "1", "1");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(JDBCConnectData) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_32()
		throws Exception {
		JDBCConnectData cd = new JDBCConnectData("1", "12", "12", "12", "1", "12");

		JDBCDBImporter result = new JDBCDBImporter(cd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(Connection,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_33()
		throws Exception {
		Connection connection = null;
		String user = "";
		String schemaName = "";

		JDBCDBImporter result = new JDBCDBImporter(connection, user, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(Connection,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_34()
		throws Exception {
		Connection connection = null;
		String user = "0123456789";
		String schemaName = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(connection, user, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(Connection,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_35()
		throws Exception {
		Connection connection = null;
		String user = "0123456789";
		String schemaName = "";

		JDBCDBImporter result = new JDBCDBImporter(connection, user, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(Connection,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_36()
		throws Exception {
		Connection connection = null;
		String user = "";
		String schemaName = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(connection, user, schemaName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_37()
		throws Exception {
		String url = "";
		String driver = "";
		String user = "";
		String password = "";
		String catalog = "";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_38()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_39()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "1";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_40()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_41()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "1";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_42()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_43()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "1";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_44()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_45()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "0123456789";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_46()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_47()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "0123456789";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_48()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "1";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_49()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "0123456789";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_50()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "1";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_51()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_52()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "1";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_53()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_54()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_55()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "1";
		String catalog = "";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_56()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_57()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "0123456789";
		String catalog = "1";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_58()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_59()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "0123456789";
		String catalog = "1";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_60()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_61()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "0123456789";
		String catalog = "1";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_62()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_63()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_64()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_65()
		throws Exception {
		String url = "1";
		String driver = "1";
		String user = "1";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_66()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "";
		String password = "1";
		String catalog = "1";
		String schema = "1";

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_67()
		throws Exception {
		String url = "";
		String driver = "";
		String user = "";
		String password = "";
		String catalog = "";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_68()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_69()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_70()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_71()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_72()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_73()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_74()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_75()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_76()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_77()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_78()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_79()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_80()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_81()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_82()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_83()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "0123456789";
		String catalog = "";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_84()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_85()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_86()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_87()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_88()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_89()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_90()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_91()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "0123456789";
		String schema = "";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_92()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_93()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = null;
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_94()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_95()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "0123456789";
		String tablePattern = "1";
		boolean importingIndexes = false;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(false, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Run the JDBCDBImporter(String,String,String,String,String,String,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testJDBCDBImporter_96()
		throws Exception {
		String url = "0123456789";
		String driver = "0123456789";
		String user = "0123456789";
		String password = "";
		String catalog = "";
		String schema = "";
		String tablePattern = null;
		boolean importingIndexes = true;

		JDBCDBImporter result = new JDBCDBImporter(url, driver, user, password, catalog, schema, tablePattern, importingIndexes);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JDBCDBImporter", result.toString());
		assertEquals(null, result.getDatabaseProductName());
		assertEquals(true, result.isImportingIndexes());
		assertEquals(false, result.isImportingPackages());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JDBCDBImporterTest.class);
	}
}