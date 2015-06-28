package org.databene.jdbacl.proxy;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;
import javax.sql.ConnectionEventListener;
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
 * The class <code>PooledConnectionHandlerTest</code> contains tests for the class <code>{@link PooledConnectionHandler}</code>.
 *
 * @generatedBy CodePro at 6/7/15 7:59 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PooledConnectionHandlerTest {
	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_1()
		throws Exception {
		Connection realConnection = new BrokeredConnection30((BrokeredConnectionControl) null);
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.toString(Unknown Source)
		//       at java.lang.String.valueOf(String.java:2849)
		//       at java.lang.StringBuilder.append(StringBuilder.java:128)
		//       at org.databene.jdbacl.proxy.PooledConnectionHandler.<init>(PooledConnectionHandler.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_2()
		throws Exception {
		Connection realConnection = new BrokeredConnection40((BrokeredConnectionControl) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.toString(Unknown Source)
		//       at java.lang.String.valueOf(String.java:2849)
		//       at java.lang.StringBuilder.append(StringBuilder.java:128)
		//       at org.databene.jdbacl.proxy.PooledConnectionHandler.<init>(PooledConnectionHandler.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_3()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_4()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new Driver169(), "", new Properties());
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_5()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_6()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_7()
		throws Exception {
		Connection realConnection = new EmbedConnection40(new Driver169(), "", new Properties());
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_8()
		throws Exception {
		Connection realConnection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_9()
		throws Exception {
		Connection realConnection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_10()
		throws Exception {
		Connection realConnection = new EmbedConnection40((EmbedConnection) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_11()
		throws Exception {
		Connection realConnection = new FBConnection((FBManagedConnection) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_12()
		throws Exception {
		Connection realConnection = new JdbcConnection("", new Properties());
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_13()
		throws Exception {
		Connection realConnection = new JdbcConnection("0123456789", new Properties((Properties) null));
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_14()
		throws Exception {
		Connection realConnection = new JdbcConnection(new Session(), "", "");
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_15()
		throws Exception {
		Connection realConnection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_16()
		throws Exception {
		Connection realConnection = new JdbcConnection((JdbcConnection) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_17()
		throws Exception {
		Connection realConnection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_18()
		throws Exception {
		Connection realConnection = new jdbcConnection(new HsqlProperties(""));
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_19()
		throws Exception {
		Connection realConnection = new jdbcConnection((org.hsqldb.Session) null);
		boolean readOnly = true;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_20()
		throws Exception {
		Connection realConnection = new BrokeredConnection40((BrokeredConnectionControl) null);
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.toString(Unknown Source)
		//       at java.lang.String.valueOf(String.java:2849)
		//       at java.lang.StringBuilder.append(StringBuilder.java:128)
		//       at org.databene.jdbacl.proxy.PooledConnectionHandler.<init>(PooledConnectionHandler.java:84)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_21()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_22()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new Driver169(), "", new Properties());
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_23()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_24()
		throws Exception {
		Connection realConnection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_25()
		throws Exception {
		Connection realConnection = new EmbedConnection40(new Driver169(), "", new Properties());
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_26()
		throws Exception {
		Connection realConnection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_27()
		throws Exception {
		Connection realConnection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_28()
		throws Exception {
		Connection realConnection = new EmbedConnection40((EmbedConnection) null);
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_29()
		throws Exception {
		Connection realConnection = new FBConnection((FBManagedConnection) null);
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the PooledConnectionHandler(Connection,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testPooledConnectionHandler_30()
		throws Exception {
		Connection realConnection = new JdbcConnection("", new Properties());
		boolean readOnly = false;

		PooledConnectionHandler result = new PooledConnectionHandler(realConnection, readOnly);

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
	 * Run the boolean assertAllConnectionsClosed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testAssertAllConnectionsClosed_1()
		throws Exception {
		boolean critical = false;

		boolean result = PooledConnectionHandler.assertAllConnectionsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.PooledConnectionHandler.assertAllConnectionsClosed(PooledConnectionHandler.java:176)
		assertTrue(result);
	}

	/**
	 * Run the boolean assertAllConnectionsClosed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testAssertAllConnectionsClosed_2()
		throws Exception {
		boolean critical = true;

		boolean result = PooledConnectionHandler.assertAllConnectionsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.PooledConnectionHandler.assertAllConnectionsClosed(PooledConnectionHandler.java:176)
		assertTrue(result);
	}

	/**
	 * Run the int getOpenConnectionCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testGetOpenConnectionCount_1()
		throws Exception {

		int result = PooledConnectionHandler.getOpenConnectionCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void resetMonitors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testResetMonitors_1()
		throws Exception {

		PooledConnectionHandler.resetMonitors();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
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
	 * @generatedBy CodePro at 6/7/15 7:59 PM
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
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PooledConnectionHandlerTest.class);
	}
}