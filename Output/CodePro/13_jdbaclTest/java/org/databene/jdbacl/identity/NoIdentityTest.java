package org.databene.jdbacl.identity;

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
import org.databene.commons.iterator.TableRowIterator;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.identity.mem.MemKeyMapper;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDatabase;
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
 * The class <code>NoIdentityTest</code> contains tests for the class <code>{@link NoIdentity}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class NoIdentityTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see NoIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NoIdentity fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NoIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NoIdentity getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new NoIdentity("");
		}
		return fixture;
	}

	/**
	 * Run the NoIdentity(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNoIdentity_1()
		throws Exception {
		String tableName = "";

		NoIdentity result = new NoIdentity(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("No identity defined for table ", result.getDescription());
		assertEquals("NoIdentity()", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getTableName());
	}

	/**
	 * Run the NoIdentity(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNoIdentity_2()
		throws Exception {
		String tableName = "0123456789";

		NoIdentity result = new NoIdentity(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("No identity defined for table 0123456789", result.getDescription());
		assertEquals("NoIdentity(0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getTableName());
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_1()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_2()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_3()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_4()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_5()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_6()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_7()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_8()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_9()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_10()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_11()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_12()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection((JdbcConnection) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_13()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_14()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_15()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_16()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_17()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_18()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_19()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_20()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_21()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_22()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_23()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new FBConnection((FBManagedConnection) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_24()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

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
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_25()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_26()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_27()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_28()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_29()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture_30()
		throws Exception {
		NoIdentity fixture2 = getFixture();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture2.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture_1()
		throws Exception {
		NoIdentity fixture2 = getFixture();

		String result = fixture2.getDescription();

		// add additional test code here
		assertEquals("No identity defined for table ", result);
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
		new org.junit.runner.JUnitCore().run(NoIdentityTest.class);
	}
}