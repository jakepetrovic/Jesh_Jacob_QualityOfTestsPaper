package org.databene.jdbacl.proxy;

import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.derby.catalog.TriggerNewTransitionRows;
import org.apache.derby.catalog.TriggerOldTransitionRows;
import org.apache.derby.iapi.jdbc.BrokeredCallableStatement30;
import org.apache.derby.iapi.jdbc.BrokeredCallableStatement40;
import org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30;
import org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40;
import org.apache.derby.iapi.jdbc.BrokeredStatementControl;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LoggingPreparedStatementHandlerTest</code> contains tests for the class <code>{@link LoggingPreparedStatementHandler}</code>.
 *
 * @generatedBy CodePro at 6/7/15 7:59 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoggingPreparedStatementHandlerTest {
	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_1()
		throws Exception {
		PreparedStatement realStatement = new TriggerNewTransitionRows();
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: No current connection.
		//       at org.apache.derby.iapi.sql.conn.ConnectionUtil.getCurrentLCC(Unknown Source)
		//       at org.apache.derby.iapi.db.Factory.getTriggerExecutionContext(Unknown Source)
		//       at org.apache.derby.catalog.TriggerNewTransitionRows.initializeResultSet(Unknown Source)
		//       at org.apache.derby.catalog.TriggerNewTransitionRows.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_2()
		throws Exception {
		PreparedStatement realStatement = new TriggerOldTransitionRows();
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: No current connection.
		//       at org.apache.derby.iapi.sql.conn.ConnectionUtil.getCurrentLCC(Unknown Source)
		//       at org.apache.derby.iapi.db.Factory.getTriggerExecutionContext(Unknown Source)
		//       at org.apache.derby.catalog.TriggerOldTransitionRows.initializeResultSet(Unknown Source)
		//       at org.apache.derby.catalog.TriggerOldTransitionRows.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_3()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "");
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_4()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "0123456789");
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_5()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "");
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_6()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "0123456789");
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_7()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "", new Object());
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_8()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "0123456789", (Object) null);
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_9()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_10()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "", new Object());
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_11()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_12()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_13()
		throws Exception {
		PreparedStatement realStatement = new TriggerOldTransitionRows();
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: No current connection.
		//       at org.apache.derby.iapi.sql.conn.ConnectionUtil.getCurrentLCC(Unknown Source)
		//       at org.apache.derby.iapi.db.Factory.getTriggerExecutionContext(Unknown Source)
		//       at org.apache.derby.catalog.TriggerOldTransitionRows.initializeResultSet(Unknown Source)
		//       at org.apache.derby.catalog.TriggerOldTransitionRows.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_14()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "");
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_15()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "0123456789");
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_16()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "");
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_17()
		throws Exception {
		PreparedStatement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "0123456789");
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getCallableStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredCallableStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_18()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "", new Object());
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_19()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "0123456789", (Object) null);
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_20()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_21()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "", new Object());
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_22()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_23()
		throws Exception {
		PreparedStatement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		String sql = "";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getPreparedStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.getStatement(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.getResultSetType(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30.<init>(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingPreparedStatementHandler(PreparedStatement,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingPreparedStatementHandler_24()
		throws Exception {
		PreparedStatement realStatement = new TriggerNewTransitionRows();
		String sql = "0123456789";

		LoggingPreparedStatementHandler result = new LoggingPreparedStatementHandler(realStatement, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: No current connection.
		//       at org.apache.derby.iapi.sql.conn.ConnectionUtil.getCurrentLCC(Unknown Source)
		//       at org.apache.derby.iapi.db.Factory.getTriggerExecutionContext(Unknown Source)
		//       at org.apache.derby.catalog.TriggerNewTransitionRows.initializeResultSet(Unknown Source)
		//       at org.apache.derby.catalog.TriggerNewTransitionRows.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the boolean assertAllStatementsClosed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testAssertAllStatementsClosed_1()
		throws Exception {
		boolean critical = false;

		boolean result = LoggingPreparedStatementHandler.assertAllStatementsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.LoggingPreparedStatementHandler.assertAllStatementsClosed(LoggingPreparedStatementHandler.java:222)
		assertTrue(result);
	}

	/**
	 * Run the boolean assertAllStatementsClosed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testAssertAllStatementsClosed_2()
		throws Exception {
		boolean critical = true;

		boolean result = LoggingPreparedStatementHandler.assertAllStatementsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.LoggingPreparedStatementHandler.assertAllStatementsClosed(LoggingPreparedStatementHandler.java:222)
		assertTrue(result);
	}

	/**
	 * Run the int getOpenStatementCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testGetOpenStatementCount_1()
		throws Exception {

		int result = LoggingPreparedStatementHandler.getOpenStatementCount();

		// add additional test code here
		assertEquals(0, result);
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

		LoggingPreparedStatementHandler.resetMonitors();

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
		new org.junit.runner.JUnitCore().run(LoggingPreparedStatementHandlerTest.class);
	}
}