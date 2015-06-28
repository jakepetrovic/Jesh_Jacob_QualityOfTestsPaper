package org.databene.jdbacl.proxy;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.derby.catalog.AliasInfo;
import org.apache.derby.catalog.GetProcedureColumns;
import org.apache.derby.catalog.TriggerNewTransitionRows;
import org.apache.derby.catalog.TriggerOldTransitionRows;
import org.apache.derby.catalog.types.MethodAliasInfo;
import org.apache.derby.diag.ContainedRoles;
import org.apache.derby.diag.ErrorLogReader;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.diag.LockTable;
import org.apache.derby.diag.SpaceTable;
import org.apache.derby.diag.StatementCache;
import org.apache.derby.diag.StatementDuration;
import org.apache.derby.diag.TransactionTable;
import org.apache.derby.iapi.jdbc.BrokeredCallableStatement30;
import org.apache.derby.iapi.jdbc.BrokeredCallableStatement40;
import org.apache.derby.iapi.jdbc.BrokeredPreparedStatement30;
import org.apache.derby.iapi.jdbc.BrokeredPreparedStatement40;
import org.apache.derby.iapi.jdbc.BrokeredStatementControl;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.tools.SimpleRowSource;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LoggingResultSetHandlerTest</code> contains tests for the class <code>{@link LoggingResultSetHandler}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LoggingResultSetHandlerTest {
	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_1()
		throws Exception {
		ResultSet realResultSet = new GetProcedureColumns(new MethodAliasInfo(""), "");
		Statement statement = new TriggerNewTransitionRows();

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_2()
		throws Exception {
		ResultSet realResultSet = new GetProcedureColumns(new MethodAliasInfo(), "0123456789");
		Statement statement = new TriggerOldTransitionRows();

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_3()
		throws Exception {
		ResultSet realResultSet = new ContainedRoles("");
		Statement statement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid identifier.
		//       at org.apache.derby.impl.jdbc.EmbedSQLException.wrapStandardException(Unknown Source)
		//       at org.apache.derby.iapi.error.PublicAPI.wrapStandardException(Unknown Source)
		//       at org.apache.derby.diag.ContainedRoles.<init>(Unknown Source)
		//       at org.apache.derby.diag.ContainedRoles.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_4()
		throws Exception {
		ResultSet realResultSet = new ErrorLogReader("");
		Statement statement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "0123456789");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_5()
		throws Exception {
		ResultSet realResultSet = new ErrorLogReader();
		Statement statement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_6()
		throws Exception {
		ResultSet realResultSet = new ErrorMessages();
		Statement statement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "0123456789");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_7()
		throws Exception {
		ResultSet realResultSet = new LockTable();
		Statement statement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "", new Object());

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_8()
		throws Exception {
		ResultSet realResultSet = new SpaceTable("");
		Statement statement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_9()
		throws Exception {
		ResultSet realResultSet = new SpaceTable("", "");
		Statement statement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_10()
		throws Exception {
		ResultSet realResultSet = new SpaceTable("0123456789", "0123456789");
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "", new Object());

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_11()
		throws Exception {
		ResultSet realResultSet = new StatementCache();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: No current connection.
		//       at org.apache.derby.iapi.sql.conn.ConnectionUtil.getCurrentLCC(Unknown Source)
		//       at org.apache.derby.diag.StatementCache.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_12()
		throws Exception {
		ResultSet realResultSet = new StatementDuration("");
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_13()
		throws Exception {
		ResultSet realResultSet = new StatementDuration();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_14()
		throws Exception {
		ResultSet realResultSet = new TransactionTable();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_15()
		throws Exception {
		ResultSet realResultSet = new SimpleResultSet();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_16()
		throws Exception {
		ResultSet realResultSet = new SimpleResultSet(Csv.getInstance());
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_17()
		throws Exception {
		ResultSet realResultSet = new GetProcedureColumns(new MethodAliasInfo(), "0123456789");
		Statement statement = new TriggerNewTransitionRows();

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_18()
		throws Exception {
		ResultSet realResultSet = new ContainedRoles("");
		Statement statement = new TriggerOldTransitionRows();

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid identifier.
		//       at org.apache.derby.impl.jdbc.EmbedSQLException.wrapStandardException(Unknown Source)
		//       at org.apache.derby.iapi.error.PublicAPI.wrapStandardException(Unknown Source)
		//       at org.apache.derby.diag.ContainedRoles.<init>(Unknown Source)
		//       at org.apache.derby.diag.ContainedRoles.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_19()
		throws Exception {
		ResultSet realResultSet = new ErrorLogReader("");
		Statement statement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_20()
		throws Exception {
		ResultSet realResultSet = new ErrorLogReader();
		Statement statement = new BrokeredCallableStatement30((BrokeredStatementControl) null, "0123456789");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_21()
		throws Exception {
		ResultSet realResultSet = new ErrorMessages();
		Statement statement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_22()
		throws Exception {
		ResultSet realResultSet = new LockTable();
		Statement statement = new BrokeredCallableStatement40((BrokeredStatementControl) null, "0123456789");

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_23()
		throws Exception {
		ResultSet realResultSet = new SpaceTable("");
		Statement statement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "", new Object());

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_24()
		throws Exception {
		ResultSet realResultSet = new SpaceTable("", "");
		Statement statement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_25()
		throws Exception {
		ResultSet realResultSet = new SpaceTable("0123456789", "0123456789");
		Statement statement = new BrokeredPreparedStatement30((BrokeredStatementControl) null, "An��t-1.0.txt", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_26()
		throws Exception {
		ResultSet realResultSet = new StatementCache();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "", new Object());

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: No current connection.
		//       at org.apache.derby.iapi.sql.conn.ConnectionUtil.getCurrentLCC(Unknown Source)
		//       at org.apache.derby.diag.StatementCache.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_27()
		throws Exception {
		ResultSet realResultSet = new StatementDuration("");
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_28()
		throws Exception {
		ResultSet realResultSet = new StatementDuration();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_29()
		throws Exception {
		ResultSet realResultSet = new TransactionTable();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the LoggingResultSetHandler(ResultSet,Statement) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testLoggingResultSetHandler_30()
		throws Exception {
		ResultSet realResultSet = new SimpleResultSet();
		Statement statement = new BrokeredPreparedStatement40((BrokeredStatementControl) null, "0123456789", (Object) null);

		LoggingResultSetHandler result = new LoggingResultSetHandler(realResultSet, statement);

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
	 * Run the boolean assertAllResultSetsClosed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAssertAllResultSetsClosed_1()
		throws Exception {
		boolean critical = false;

		boolean result = LoggingResultSetHandler.assertAllResultSetsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.LoggingResultSetHandler.assertAllResultSetsClosed(LoggingResultSetHandler.java:115)
		assertTrue(result);
	}

	/**
	 * Run the boolean assertAllResultSetsClosed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAssertAllResultSetsClosed_2()
		throws Exception {
		boolean critical = true;

		boolean result = LoggingResultSetHandler.assertAllResultSetsClosed(critical);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.proxy.LoggingResultSetHandler.assertAllResultSetsClosed(LoggingResultSetHandler.java:115)
		assertTrue(result);
	}

	/**
	 * Run the int getOpenResultSetCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetOpenResultSetCount_1()
		throws Exception {

		int result = LoggingResultSetHandler.getOpenResultSetCount();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void resetMonitors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResetMonitors_1()
		throws Exception {

		LoggingResultSetHandler.resetMonitors();

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
		new org.junit.runner.JUnitCore().run(LoggingResultSetHandlerTest.class);
	}
}