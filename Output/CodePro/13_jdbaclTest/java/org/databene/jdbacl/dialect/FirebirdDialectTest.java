package org.databene.jdbacl.dialect;

import java.sql.Connection;
import java.sql.SQLException;
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
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
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
 * The class <code>FirebirdDialectTest</code> contains tests for the class <code>{@link FirebirdDialect}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FirebirdDialectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FirebirdDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private FirebirdDialect fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FirebirdDialect
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public FirebirdDialect getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new FirebirdDialect();
		}
		return fixture;
	}

	/**
	 * Run the FirebirdDialect() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testFirebirdDialect_1()
		throws Exception {

		FirebirdDialect result = new FirebirdDialect();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isSequenceBoundarySupported());
		assertEquals("org.firebirdsql.jdbc.FBDriver", result.getJDBCDriverClass());
		assertEquals(false, result.supportsRegex());
		assertEquals("firebird", result.getSystem());
		assertEquals(true, result.isSequenceSupported());
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.createSequence(FirebirdDialect.java:83)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_2()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 0L;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.createSequence(FirebirdDialect.java:83)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_3()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 1L;
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_4()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_5()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 0L;
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_6()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 1L;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_7()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_8()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 0L;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_9()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 1L;
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_10()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_11()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 0L;
		Connection connection = new FBConnection((FBManagedConnection) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_12()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 1L;
		Connection connection = new JdbcConnection("", new Properties());

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_13()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_14()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 0L;
		Connection connection = new JdbcConnection(new Session(), "", "");

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_15()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 1L;
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_16()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_17()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 0L;
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_18()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = -1L;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeUpdate(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:484)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.createSequence(FirebirdDialect.java:83)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_19()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 1L;
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.createSequence(FirebirdDialect.java:83)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_20()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = -1L;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.createSequence(FirebirdDialect.java:83)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_21()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 0L;
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_22()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 1L;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_23()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = -1L;
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_24()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 0L;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_25()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 1L;
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_26()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = -1L;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_27()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 0L;
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_28()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = 1L;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateSequence_fixture_29()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";
		long initialValue = -1L;
		Connection connection = new FBConnection((FBManagedConnection) null);

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
	}

	/**
	 * Run the void createSequence(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testCreateSequence_fixture_30()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";
		long initialValue = 1L;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		fixture2.createSequence(name, initialValue, connection);

		// add additional test code here
	}

	/**
	 * Run the String getJDBCDriverClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetJDBCDriverClass_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();

		String result = fixture2.getJDBCDriverClass();

		// add additional test code here
		assertEquals("org.firebirdsql.jdbc.FBDriver", result);
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
		String ukName = "0123456789";

		boolean result = fixture2.isDeterministicUKName(ukName);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSequenceBoundarySupported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testIsSequenceBoundarySupported_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();

		boolean result = fixture2.isSequenceBoundarySupported();

		// add additional test code here
		assertEquals(false, result);
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
		FirebirdDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.DBUtil.getStatement(DBUtil.java:276)
		//       at org.databene.jdbacl.DBUtil.closeResultSetAndStatement(DBUtil.java:293)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.querySequences(FirebirdDialect.java:122)
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
		FirebirdDialect fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.DBUtil.getStatement(DBUtil.java:276)
		//       at org.databene.jdbacl.DBUtil.closeResultSetAndStatement(DBUtil.java:293)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.querySequences(FirebirdDialect.java:122)
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
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
		FirebirdDialect fixture2 = getFixture();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.DBUtil.getStatement(DBUtil.java:276)
		//       at org.databene.jdbacl.DBUtil.closeResultSetAndStatement(DBUtil.java:293)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.querySequences(FirebirdDialect.java:122)
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
		FirebirdDialect fixture2 = getFixture();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBSequence[] result = fixture2.querySequences(connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String renderCreateSequence(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "";

		String result = fixture2.renderCreateSequence(name);

		// add additional test code here
		assertEquals("CREATE GENERATOR ", result);
	}

	/**
	 * Run the String renderCreateSequence(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_2()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String name = "0123456789";

		String result = fixture2.renderCreateSequence(name);

		// add additional test code here
		assertEquals("CREATE GENERATOR 0123456789", result);
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
		FirebirdDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("", "", "");

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE GENERATOR ", result);
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
		FirebirdDialect fixture2 = getFixture();
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
	public void testRenderCreateSequence_fixture_5()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE GENERATOR 0123456789", result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_6()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE GENERATOR 0123456789", result);
	}

	/**
	 * Run the String renderCreateSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderCreateSequence_fixture_7()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		String result = fixture2.renderCreateSequence(sequence);

		// add additional test code here
		assertEquals("CREATE GENERATOR An��t-1.0.txt", result);
	}

	/**
	 * Run the String renderDropSequence(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderDropSequence_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";

		String result = fixture2.renderDropSequence(sequenceName);

		// add additional test code here
		assertEquals("drop generator ", result);
	}

	/**
	 * Run the String renderDropSequence(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderDropSequence_fixture_2()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";

		String result = fixture2.renderDropSequence(sequenceName);

		// add additional test code here
		assertEquals("drop generator 0123456789", result);
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
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";

		String result = fixture2.renderFetchSequenceValue(sequenceName);

		// add additional test code here
		assertEquals("select gen_id(, 1) from RDB$DATABASE;", result);
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
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";

		String result = fixture2.renderFetchSequenceValue(sequenceName);

		// add additional test code here
		assertEquals("select gen_id(0123456789, 1) from RDB$DATABASE;", result);
	}

	/**
	 * Run the String renderSetSequenceValue(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSetSequenceValue_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;

		String result = fixture2.renderSetSequenceValue(sequenceName, value);

		// add additional test code here
		assertEquals("SET GENERATOR  TO -2", result);
	}

	/**
	 * Run the String renderSetSequenceValue(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSetSequenceValue_fixture_2()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;

		String result = fixture2.renderSetSequenceValue(sequenceName, value);

		// add additional test code here
		assertEquals("SET GENERATOR 0123456789 TO -1", result);
	}

	/**
	 * Run the String renderSetSequenceValue(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSetSequenceValue_fixture_3()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;

		String result = fixture2.renderSetSequenceValue(sequenceName, value);

		// add additional test code here
		assertEquals("SET GENERATOR  TO 0", result);
	}

	/**
	 * Run the String renderSetSequenceValue(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSetSequenceValue_fixture_4()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 0L;

		String result = fixture2.renderSetSequenceValue(sequenceName, value);

		// add additional test code here
		assertEquals("SET GENERATOR  TO -1", result);
	}

	/**
	 * Run the String renderSetSequenceValue(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSetSequenceValue_fixture_5()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 1L;

		String result = fixture2.renderSetSequenceValue(sequenceName, value);

		// add additional test code here
		assertEquals("SET GENERATOR 0123456789 TO 0", result);
	}

	/**
	 * Run the String renderSetSequenceValue(String,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRenderSetSequenceValue_fixture_6()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = -1L;

		String result = fixture2.renderSetSequenceValue(sequenceName, value);

		// add additional test code here
		assertEquals("SET GENERATOR 0123456789 TO -2", result);
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_1()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.setNextSequenceValue(FirebirdDialect.java:128)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_2()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.setNextSequenceValue(FirebirdDialect.java:128)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_3()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_4()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_5()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_6()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_7()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_8()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_9()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_10()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_11()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;
		Connection connection = new FBConnection((FBManagedConnection) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_12()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;
		Connection connection = new JdbcConnection("", new Properties());

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_13()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_14()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;
		Connection connection = new JdbcConnection(new Session(), "", "");

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_15()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_16()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_17()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 0L;
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_18()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = -1L;
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeUpdate(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:484)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.setNextSequenceValue(FirebirdDialect.java:128)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_19()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 1L;
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.setNextSequenceValue(FirebirdDialect.java:128)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_20()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = -1L;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeUpdate(DBUtil.java:483)
		//       at org.databene.jdbacl.dialect.FirebirdDialect.setNextSequenceValue(FirebirdDialect.java:128)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_21()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 0L;
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_22()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 1L;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_23()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = -1L;
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_24()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 0L;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_25()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 1L;
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_26()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = -1L;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_27()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 0L;
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_28()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = 1L;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNextSequenceValue_fixture_29()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "0123456789";
		long value = -1L;
		Connection connection = new FBConnection((FBManagedConnection) null);

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
	}

	/**
	 * Run the void setNextSequenceValue(String,long,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testSetNextSequenceValue_fixture_30()
		throws Exception {
		FirebirdDialect fixture2 = getFixture();
		String sequenceName = "";
		long value = 1L;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		fixture2.setNextSequenceValue(sequenceName, value, connection);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(FirebirdDialectTest.class);
	}
}