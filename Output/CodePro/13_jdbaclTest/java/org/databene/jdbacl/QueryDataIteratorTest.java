package org.databene.jdbacl;

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
 * The class <code>QueryDataIteratorTest</code> contains tests for the class <code>{@link QueryDataIterator}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class QueryDataIteratorTest {
	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_1()
		throws Exception {
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		int fetchSize = 0;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryDataIterator.createSource(QueryDataIterator.java:46)
		//       at org.databene.jdbacl.QueryDataIterator.<init>(QueryDataIterator.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_2()
		throws Exception {
		String query = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryDataIterator.createSource(QueryDataIterator.java:46)
		//       at org.databene.jdbacl.QueryDataIterator.<init>(QueryDataIterator.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_3()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_4()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_5()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_6()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_7()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_8()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_9()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_10()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_11()
		throws Exception {
		String query = "";
		Connection connection = new FBConnection((FBManagedConnection) null);
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_12()
		throws Exception {
		String query = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_13()
		throws Exception {
		String query = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_14()
		throws Exception {
		String query = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_15()
		throws Exception {
		String query = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_16()
		throws Exception {
		String query = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_17()
		throws Exception {
		String query = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_18()
		throws Exception {
		String query = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_19()
		throws Exception {
		String query = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		int fetchSize = 7;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryDataIterator.createSource(QueryDataIterator.java:49)
		//       at org.databene.jdbacl.QueryDataIterator.<init>(QueryDataIterator.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_20()
		throws Exception {
		String query = "";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		int fetchSize = 0;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryDataIterator.createSource(QueryDataIterator.java:46)
		//       at org.databene.jdbacl.QueryDataIterator.<init>(QueryDataIterator.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_21()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_22()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_23()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_24()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_25()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_26()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_27()
		throws Exception {
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_28()
		throws Exception {
		String query = "";
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_29()
		throws Exception {
		String query = "0123456789";
		Connection connection = new FBConnection((FBManagedConnection) null);
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the QueryDataIterator(String,Connection,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testQueryDataIterator_30()
		throws Exception {
		String query = "";
		Connection connection = new JdbcConnection("", new Properties());
		int fetchSize = 1;

		QueryDataIterator result = new QueryDataIterator(query, connection, fetchSize);

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
		new org.junit.runner.JUnitCore().run(QueryDataIteratorTest.class);
	}
}