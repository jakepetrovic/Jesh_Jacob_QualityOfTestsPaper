package org.databene.jdbacl.dialect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.apache.derby.impl.jdbc.EmbedConnection;
import org.apache.derby.impl.jdbc.EmbedConnection30;
import org.apache.derby.impl.jdbc.EmbedConnection40;
import org.apache.derby.jdbc.Driver169;
import org.apache.derby.jdbc.Driver30;
import org.apache.derby.jdbc.Driver40;
import org.apache.derby.jdbc.InternalDriver;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBPackage;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTrigger;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBConnection;
import org.h2.engine.Session;
import org.h2.engine.SessionInterface;
import org.h2.engine.SessionRemote;
import org.h2.jdbc.JdbcConnection;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OracleDialectTest</code> contains tests for the class <code>{@link OracleDialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class OracleDialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see OracleDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private OracleDialect fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see OracleDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public OracleDialect getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new OracleDialect();
		}
		return fixture;
	}

	/**
	 * Run the OracleDialect() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testOracleDialect_1()
		throws Exception {

		OracleDialect result = new OracleDialect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.supportsRegex());
		assertEquals(true, result.isSequenceBoundarySupported());
		assertEquals(true, result.isSequenceSupported());
		assertEquals("oracle", result.getSystem());
	}

	/**
	 * Run the String formatTimestamp(Timestamp) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testFormatTimestamp_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Timestamp value = new Timestamp(1591115236000L);

		String result = fixture2.formatTimestamp(value);

		// add additional test code here
		assertEquals("to_timestamp('2020-06-02 10:27:16.000000000', 'yyyy-mm-dd HH24:mi:ss.FF')", result);
	}

	/**
	 * Run the String formatTimestamp(Timestamp) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testFormatTimestamp_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Timestamp value = new Timestamp(644344036000L);

		String result = fixture2.formatTimestamp(value);

		// add additional test code here
		assertEquals("to_timestamp('1990-06-02 10:27:16.000000000', 'yyyy-mm-dd HH24:mi:ss.FF')", result);
	}

	/**
	 * Run the String formatTimestamp(Timestamp) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testFormatTimestamp_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Timestamp value = new Timestamp(946713599000L);

		String result = fixture2.formatTimestamp(value);

		// add additional test code here
		assertEquals("to_timestamp('2000-01-01 00:59:59.000000000', 'yyyy-mm-dd HH24:mi:ss.FF')", result);
	}

	/**
	 * Run the String formatTimestamp(Timestamp) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testFormatTimestamp_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Timestamp value = new Timestamp(946713600000L);

		String result = fixture2.formatTimestamp(value);

		// add additional test code here
		assertEquals("to_timestamp('2000-01-01 01:00:00.000000000', 'yyyy-mm-dd HH24:mi:ss.FF')", result);
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
		OracleDialect fixture2 = getFixture();
		String catalog = "1";
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
		OracleDialect fixture2 = getFixture();
		String catalog = null;
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
		OracleDialect fixture2 = getFixture();
		String catalog = null;
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
		OracleDialect fixture2 = getFixture();
		String catalog = "1";
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
		String schema = "";
		String user = "0123456789";

		boolean result = fixture2.isDefaultSchema(schema, user);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDeterministicCheckName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicCheckName_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		String checkName = "";

		boolean result = fixture2.isDeterministicCheckName(checkName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDeterministicCheckName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsDeterministicCheckName_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		String checkName = "0123456789";

		boolean result = fixture2.isDeterministicCheckName(checkName);

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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
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
		OracleDialect fixture2 = getFixture();
		String ukName = "0123456789";

		boolean result = fixture2.isDeterministicUKName(ukName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryCheckConstraints(OracleDialect.java:159)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryCheckConstraints(OracleDialect.java:159)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_5()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_6()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_7()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_8()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_9()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_10()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_11()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new FBConnection((FBManagedConnection) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_12()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection("", new Properties());
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_13()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_14()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection(new Session(), "", "");
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_15()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_16()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection((JdbcConnection) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_17()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_18()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryCheckConstraints(OracleDialect.java:165)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_19()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryCheckConstraints(OracleDialect.java:159)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_20()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_21()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_22()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_23()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_24()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_25()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_26()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_27()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_28()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new FBConnection((FBManagedConnection) null);
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryCheckConstraints_fixture_29()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection("", new Properties());
		String schemaName = "1";

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint[] queryCheckConstraints(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryCheckConstraints_fixture_30()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String schemaName = null;

		DBCheckConstraint[] result = fixture2.queryCheckConstraints(connection, schemaName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.query(DBUtil.java:522)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryPackages(OracleDialect.java:306)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.query(DBUtil.java:522)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryPackages(OracleDialect.java:306)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_5()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_6()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_7()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_8()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_9()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_10()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_11()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new FBConnection((FBManagedConnection) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_12()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection("", new Properties());

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_13()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_14()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection(new Session(), "", "");

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_15()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_16()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_17()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryPackages_fixture_18()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.query(DBUtil.java:522)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryPackages(OracleDialect.java:306)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBPackage> queryPackages(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryPackages_fixture_19()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		List<DBPackage> result = fixture2.queryPackages(schema, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.querySequences(OracleDialect.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.querySequences(OracleDialect.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_5()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_6()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_7()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_8()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_9()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_10()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_11()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_12()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection("", new Properties());

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_13()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_14()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_15()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_16()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_17()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQuerySequences_fixture_18()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.dialect.OracleDialect.querySequences(OracleDialect.java:134)
		assertNotNull(result);
	}

	/**
	 * Run the DBSequence[] querySequences(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQuerySequences_fixture_19()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.query(DBUtil.java:522)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryTriggers(OracleDialect.java:275)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.query(DBUtil.java:522)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryTriggers(OracleDialect.java:275)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_5()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_6()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_7()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_8()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_9()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_10()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_11()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new FBConnection((FBManagedConnection) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_12()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection("", new Properties());

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_13()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_14()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection(new Session(), "", "");

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_15()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_16()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_17()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryTriggers_fixture_18()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.query(DBUtil.java:522)
		//       at org.databene.jdbacl.dialect.OracleDialect.queryTriggers(OracleDialect.java:275)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTrigger> queryTriggers(DBSchema,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryTriggers_fixture_19()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSchema schema = null;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		List<DBTrigger> result = fixture2.queryTriggers(schema, connection);

		// add additional test code here
		assertNotNull(result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "";
		boolean not = false;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("REGEXP_LIKE(, '')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = true;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("NOT REGEXP_LIKE(0123456789, '0123456789')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = true;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("NOT REGEXP_LIKE(0123456789, '')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = false;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("REGEXP_LIKE(0123456789, '0123456789')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "0123456789";
		boolean not = false;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("REGEXP_LIKE(0123456789, '')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "";
		boolean not = true;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("NOT REGEXP_LIKE(, '0123456789')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "";
		boolean not = true;
		String regex = "";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("NOT REGEXP_LIKE(, '')", result);
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
		OracleDialect fixture2 = getFixture();
		String expression = "";
		boolean not = false;
		String regex = "0123456789";

		String result = fixture2.regexQuery(expression, not, regex);

		// add additional test code here
		assertEquals("REGEXP_LIKE(, '0123456789')", result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", "", "");

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE SEQUENCE \"\".\"\"", result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", new DBSchema(""));

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE SEQUENCE \"0123456789\".\"0123456789\"", result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE SEQUENCE \"\".\"0123456789\"", result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_5()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE SEQUENCE \"An��t-1.0.txt\".\"An��t-1.0.txt\"", result);
	}

	/**
	 * Run the String renderFetchSequenceValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderFetchSequenceValue_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		String sequenceName = "";

		String result = fixture2.renderFetchSequenceValue(sequenceName);

		// add additional test code here
		assertEquals("select .nextval from dual", result);
	}

	/**
	 * Run the String renderFetchSequenceValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderFetchSequenceValue_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		String sequenceName = "0123456789";

		String result = fixture2.renderFetchSequenceValue(sequenceName);

		// add additional test code here
		assertEquals("select 0123456789.nextval from dual", result);
	}

	/**
	 * Run the String renderSequenceNameAndType(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSequenceNameAndType_fixture_1()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", "", "");

		String result = fixture2.renderSequenceNameAndType(sequence);

		// add additional test code here
		assertEquals("\"\".\"\"", result);
	}

	/**
	 * Run the String renderSequenceNameAndType(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSequenceNameAndType_fixture_2()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", new DBSchema(""));

		String result = fixture2.renderSequenceNameAndType(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result);
	}

	/**
	 * Run the String renderSequenceNameAndType(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSequenceNameAndType_fixture_3()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		String result = fixture2.renderSequenceNameAndType(sequence);

		// add additional test code here
		assertEquals("\"0123456789\".\"0123456789\"", result);
	}

	/**
	 * Run the String renderSequenceNameAndType(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSequenceNameAndType_fixture_4()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		String result = fixture2.renderSequenceNameAndType(sequence);

		// add additional test code here
		assertEquals("\"\".\"0123456789\"", result);
	}

	/**
	 * Run the String renderSequenceNameAndType(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSequenceNameAndType_fixture_5()
		throws Exception {
		OracleDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		String result = fixture2.renderSequenceNameAndType(sequence);

		// add additional test code here
		assertEquals("\"An��t-1.0.txt\".\"An��t-1.0.txt\"", result);
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
		OracleDialect fixture2 = getFixture();

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
		new org.junit.runner.JUnitCore().run(OracleDialectTest.class);
	}
}