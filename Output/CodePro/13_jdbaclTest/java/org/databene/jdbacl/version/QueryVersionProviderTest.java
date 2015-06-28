package org.databene.jdbacl.version;

import java.sql.Connection;
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
import org.databene.commons.version.VersionNumber;
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
 * The class <code>QueryVersionProviderTest</code> contains tests for the class <code>{@link QueryVersionProvider}</code>.
 *
 * @generatedBy CodePro at 6/7/15 7:57 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class QueryVersionProviderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see QueryVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	private QueryVersionProvider fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see QueryVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	private QueryVersionProvider fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see QueryVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	private QueryVersionProvider fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see QueryVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public QueryVersionProvider getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new QueryVersionProvider("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see QueryVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public QueryVersionProvider getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new QueryVersionProvider();
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see QueryVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public QueryVersionProvider getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new QueryVersionProvider();
			fixture3.setQuery("1");
		}
		return fixture3;
	}

	/**
	 * Run the QueryVersionProvider() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testQueryVersionProvider_1()
		throws Exception {

		QueryVersionProvider result = new QueryVersionProvider();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getQuery());
	}

	/**
	 * Run the QueryVersionProvider(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testQueryVersionProvider_2()
		throws Exception {
		String query = "";

		QueryVersionProvider result = new QueryVersionProvider(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getQuery());
	}

	/**
	 * Run the QueryVersionProvider(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testQueryVersionProvider_3()
		throws Exception {
		String query = "0123456789";

		QueryVersionProvider result = new QueryVersionProvider(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getQuery());
	}

	/**
	 * Run the String getQuery() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetQuery_fixture1_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();

		String result = fixture.getQuery();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getQuery() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetQuery_fixture2_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();

		String result = fixture.getQuery();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getQuery() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetQuery_fixture3_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();

		String result = fixture.getQuery();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.queryAndSimplify(DBUtil.java:511)
		//       at org.databene.jdbacl.version.QueryVersionProvider.getVersion(QueryVersionProvider.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: Query text undefined
		//       at org.databene.jdbacl.version.QueryVersionProvider.getVersion(QueryVersionProvider.java:60)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_2()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_2()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_2()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_3()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_3()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_3()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_4()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_4()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new FBConnection((FBManagedConnection) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_4()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new JdbcConnection("", new Properties());

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_5()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_5()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new JdbcConnection(new Session(), "", "");

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_5()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_6()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_6()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_6()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_7()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.queryAndSimplify(DBUtil.java:511)
		//       at org.databene.jdbacl.version.QueryVersionProvider.getVersion(QueryVersionProvider.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_7()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.queryAndSimplify(DBUtil.java:511)
		//       at org.databene.jdbacl.version.QueryVersionProvider.getVersion(QueryVersionProvider.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_8()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.executeQuery(DBUtil.java:547)
		//       at org.databene.jdbacl.DBUtil.queryAndSimplify(DBUtil.java:511)
		//       at org.databene.jdbacl.version.QueryVersionProvider.getVersion(QueryVersionProvider.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_7()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_8()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_9()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_8()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_9()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_10()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture2_9()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		VersionNumber result = fixture.getVersion(connection);

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
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture3_10()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture1_11()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		Connection connection = new FBConnection((FBManagedConnection) null);

		VersionNumber result = fixture.getVersion(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the void setQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testSetQuery_fixture1_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture1();
		String query = null;

		fixture.setQuery(query);

		// add additional test code here
	}

	/**
	 * Run the void setQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testSetQuery_fixture2_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture2();
		String query = null;

		fixture.setQuery(query);

		// add additional test code here
	}

	/**
	 * Run the void setQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testSetQuery_fixture3_1()
		throws Exception {
		QueryVersionProvider fixture = getFixture3();
		String query = null;

		fixture.setQuery(query);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
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
	 * @generatedBy CodePro at 6/7/15 7:57 PM
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
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QueryVersionProviderTest.class);
	}
}