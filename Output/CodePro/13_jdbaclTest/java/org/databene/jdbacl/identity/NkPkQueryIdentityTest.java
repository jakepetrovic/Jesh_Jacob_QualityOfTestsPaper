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
 * The class <code>NkPkQueryIdentityTest</code> contains tests for the class <code>{@link NkPkQueryIdentity}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class NkPkQueryIdentityTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NkPkQueryIdentity fixture8;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new NkPkQueryIdentity("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new NkPkQueryIdentity("", "");
			fixture2.setNkPkQuery("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new NkPkQueryIdentity("", "");
			fixture3.setNkPkQuery("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new NkPkQueryIdentity("", "");
			fixture4.setNkPkQuery("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new NkPkQueryIdentity("0123456789", "0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new NkPkQueryIdentity("0123456789", "0123456789");
			fixture6.setNkPkQuery("");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new NkPkQueryIdentity("0123456789", "0123456789");
			fixture7.setNkPkQuery("0123456789");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NkPkQueryIdentity getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new NkPkQueryIdentity("0123456789", "0123456789");
			fixture8.setNkPkQuery("An��t-1.0.txt");
		}
		return fixture8;
	}

	/**
	 * Run the NkPkQueryIdentity(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNkPkQueryIdentity_1()
		throws Exception {
		String tableName = "";
		String nkPkQuery = "";

		NkPkQueryIdentity result = new NkPkQueryIdentity(tableName, nkPkQuery);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Identity definition by NK-PK query: ", result.getDescription());
		assertEquals("NkPkQueryIdentity()", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getTableName());
	}

	/**
	 * Run the NkPkQueryIdentity(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNkPkQueryIdentity_2()
		throws Exception {
		String tableName = "0123456789";
		String nkPkQuery = "0123456789";

		NkPkQueryIdentity result = new NkPkQueryIdentity(tableName, nkPkQuery);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Identity definition by NK-PK query: 0123456789", result.getDescription());
		assertEquals("NkPkQueryIdentity(0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getTableName());
	}

	/**
	 * Run the NkPkQueryIdentity(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNkPkQueryIdentity_3()
		throws Exception {
		String tableName = "0123456789";
		String nkPkQuery = "";

		NkPkQueryIdentity result = new NkPkQueryIdentity(tableName, nkPkQuery);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Identity definition by NK-PK query: ", result.getDescription());
		assertEquals("NkPkQueryIdentity(0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getTableName());
	}

	/**
	 * Run the NkPkQueryIdentity(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNkPkQueryIdentity_4()
		throws Exception {
		String tableName = "";
		String nkPkQuery = "0123456789";

		NkPkQueryIdentity result = new NkPkQueryIdentity(tableName, nkPkQuery);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Identity definition by NK-PK query: 0123456789", result.getDescription());
		assertEquals("NkPkQueryIdentity()", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getTableName());
	}

	/**
	 * Run the TableRowIterator createNkPkIterator(Connection,String,KeyMapper,Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCreateNkPkIterator_fixture1_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
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
	public void testCreateNkPkIterator_fixture2_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
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
	public void testCreateNkPkIterator_fixture3_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture4_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture5_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture6_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture7_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture7();
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture8_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture8();
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture1_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture2_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture3_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture4_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();
		Connection connection = new JdbcConnection((JdbcConnection) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture5_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture6_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture7_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture7();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.hsqldb.jdbc.jdbcStatement.fetchResult(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcStatement.executeQuery(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:49)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
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
	public void testCreateNkPkIterator_fixture1_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
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
	public void testCreateNkPkIterator_fixture2_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
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
	public void testCreateNkPkIterator_fixture3_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture4_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture5_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture6_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture7_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture8_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture8();
		Connection connection = new FBConnection((FBManagedConnection) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture1_4()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture2_4()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture3_4()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture4_4()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture5_4()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture6_4()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testCreateNkPkIterator_fixture8_3()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture8();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

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
	public void testGetDescription_fixture1_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: ", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture2_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: ", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture3_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: 0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture4_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: An��t-1.0.txt", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture5_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: 0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture6_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: ", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture7_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture7();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: 0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture8_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture8();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Identity definition by NK-PK query: An��t-1.0.txt", result);
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture1_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture2_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture3_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture4_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture5_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture6_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture7_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture7();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture8_1()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture8();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture2_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture2();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture3_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture3();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture4_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture4();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture5_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture5();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture6_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture6();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture7_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture7();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture8_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture8();
		String nkPkQuery = "";

		fixture.setNkPkQuery(nkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetNkPkQuery_fixture1_2()
		throws Exception {
		NkPkQueryIdentity fixture = getFixture1();
		String nkPkQuery = "0123456789";

		fixture.setNkPkQuery(nkPkQuery);

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
		new org.junit.runner.JUnitCore().run(NkPkQueryIdentityTest.class);
	}
}