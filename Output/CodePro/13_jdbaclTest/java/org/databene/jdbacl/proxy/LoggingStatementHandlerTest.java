package org.databene.jdbacl.proxy;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.Statement;
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
 * The class <code>LoggingStatementHandlerTest</code> contains tests for the class <code>{@link LoggingStatementHandler}</code>.
 *
 * @generatedBy CodePro at 6/7/15 7:59 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoggingStatementHandlerTest {
	/**
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_1()
		throws Exception {
		Statement realStatement = new TriggerNewTransitionRows();
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_2()
		throws Exception {
		Statement realStatement = new TriggerOldTransitionRows();
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_3()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "");
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_4()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "0123456789");
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_5()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "");
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_6()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "0123456789");
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_7()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "", new Object());
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_8()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "0123456789", (Object) null);
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_9()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_10()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "", new Object());
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_11()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_12()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_13()
		throws Exception {
		Statement realStatement = new TriggerOldTransitionRows();
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_14()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "");
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_15()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "0123456789");
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_16()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "");
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_17()
		throws Exception {
		Statement realStatement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "0123456789");
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_18()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "", new Object());
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_19()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "0123456789", (Object) null);
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_20()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_21()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "", new Object());
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_22()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_23()
		throws Exception {
		Statement realStatement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);
		boolean readOnly = false;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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
	 * Run the LoggingStatementHandler(Statement,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:59 PM
	 */
	@Test
	public void testLoggingStatementHandler_24()
		throws Exception {
		Statement realStatement = new TriggerNewTransitionRows();
		boolean readOnly = true;

		LoggingStatementHandler result = new LoggingStatementHandler(realStatement, readOnly);

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

		boolean result = LoggingStatementHandler.assertAllStatementsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.LoggingStatementHandler.assertAllStatementsClosed(LoggingStatementHandler.java:214)
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

		boolean result = LoggingStatementHandler.assertAllStatementsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.LoggingStatementHandler.assertAllStatementsClosed(LoggingStatementHandler.java:214)
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

		int result = LoggingStatementHandler.getOpenStatementCount();

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

		LoggingStatementHandler.resetMonitors();

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
		new org.junit.runner.JUnitCore().run(LoggingStatementHandlerTest.class);
	}
}