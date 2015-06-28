package org.databene.jdbacl.version;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
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
import org.databene.commons.version.StringVersionNumberComponent;
import org.databene.commons.version.VersionNumber;
import org.databene.commons.version.VersionNumberComponent;
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
 * The class <code>ConstantVersionProviderTest</code> contains tests for the class <code>{@link ConstantVersionProvider}</code>.
 *
 * @generatedBy CodePro at 6/7/15 7:57 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ConstantVersionProviderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ConstantVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	private ConstantVersionProvider fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ConstantVersionProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public ConstantVersionProvider getFixture()
		throws Exception {
		if (fixture == null) {
			ArrayList<VersionNumberComponent> list = new ArrayList<VersionNumberComponent>();
			list.add(StringVersionNumberComponent.SNAPSHOT);
			ArrayList<String> list1 = new ArrayList<String>();
			list1.add("");
			VersionNumber versionNumber = new VersionNumber(list, list1);
			fixture = new ConstantVersionProvider(versionNumber);
		}
		return fixture;
	}

	/**
	 * Run the ConstantVersionProvider(VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testConstantVersionProvider_1()
		throws Exception {
		ArrayList<VersionNumberComponent> list = new ArrayList<VersionNumberComponent>();
		list.add(StringVersionNumberComponent.SNAPSHOT);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("");
		VersionNumber versionNumber = new VersionNumber(list, list2);

		ConstantVersionProvider result = new ConstantVersionProvider(versionNumber);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConstantVersionProvider(VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testConstantVersionProvider_2()
		throws Exception {
		LinkedList<VersionNumberComponent> list = new LinkedList<VersionNumberComponent>();
		list.add(StringVersionNumberComponent.SNAPSHOT);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("");
		list2.add("0123456789");
		VersionNumber versionNumber = new VersionNumber(list, list2);

		ConstantVersionProvider result = new ConstantVersionProvider(versionNumber);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConstantVersionProvider(VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testConstantVersionProvider_3()
		throws Exception {
		VersionNumber versionNumber = new VersionNumber(new ArrayList<Object>());

		ConstantVersionProvider result = new ConstantVersionProvider(versionNumber);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ConstantVersionProvider(VersionNumber) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testConstantVersionProvider_4()
		throws Exception {
		VersionNumber versionNumber = VersionNumber.valueOf("");

		ConstantVersionProvider result = new ConstantVersionProvider(versionNumber);

		// add additional test code here
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
	public void testGetVersion_fixture_1()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		VersionNumber result = fixture2.getVersion(connection);

		// add additional test code here
		assertNotNull(result);
		assertEquals("snapshot", result.toString());
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture_2()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		VersionNumber result = fixture2.getVersion(connection);

		// add additional test code here
		assertNotNull(result);
		assertEquals("snapshot", result.toString());
	}

	/**
	 * Run the VersionNumber getVersion(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetVersion_fixture_3()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_4()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_5()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_6()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_7()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_8()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_9()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_10()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_11()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new FBConnection((FBManagedConnection) null);

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_12()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new JdbcConnection("", new Properties());

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_13()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_14()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new JdbcConnection(new Session(), "", "");

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_15()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_16()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_17()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_18()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		VersionNumber result = fixture2.getVersion(connection);

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
	public void testGetVersion_fixture_19()
		throws Exception {
		ConstantVersionProvider fixture2 = getFixture();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		VersionNumber result = fixture2.getVersion(connection);

		// add additional test code here
		assertNotNull(result);
		assertEquals("snapshot", result.toString());
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
		new org.junit.runner.JUnitCore().run(ConstantVersionProviderTest.class);
	}
}