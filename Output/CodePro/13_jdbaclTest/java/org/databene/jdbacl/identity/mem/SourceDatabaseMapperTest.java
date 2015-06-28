package org.databene.jdbacl.identity.mem;

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
import org.databene.jdbacl.identity.IdentityModel;
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.jdbacl.identity.KeyMapper;
import org.databene.jdbacl.identity.NaturalPkIdentity;
import org.databene.jdbacl.identity.NkPkQueryIdentity;
import org.databene.jdbacl.identity.NoIdentity;
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
 * The class <code>SourceDatabaseMapperTest</code> contains tests for the class <code>{@link SourceDatabaseMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SourceDatabaseMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SourceDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SourceDatabaseMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SourceDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SourceDatabaseMapper fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SourceDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SourceDatabaseMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SourceDatabaseMapper(new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf(""))), new BrokeredConnection30((BrokeredConnectionControl) null), "", new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SourceDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SourceDatabaseMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SourceDatabaseMapper(new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null)), new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_1()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_2()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_3()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String dbId = "";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_4()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_5()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_6()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_7()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_8()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_9()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_10()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new FBConnection((FBManagedConnection) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_11()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_12()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_13()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_14()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_15()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new JdbcConnection((JdbcConnection) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_16()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_17()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_18()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_19()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_20()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_21()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_22()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_23()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_24()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_25()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_26()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_27()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new FBConnection((FBManagedConnection) null);
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_28()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

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
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_29()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceDatabaseMapper_30()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceDatabaseMapper result = new SourceDatabaseMapper(root, connection, dbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_1()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_1()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_2()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_2()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_3()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_3()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_4()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_5()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_4()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_6()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_7()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_5()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_8()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_6()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_7()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_8()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getNaturalKey(SourceDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_1()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_1()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_2()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_2()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_3()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_3()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_4()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_5()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_4()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_6()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_7()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_5()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_8()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:104)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_6()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_7()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_8()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_1()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_1()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_2()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_3()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_2()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_3()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_4()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_5()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_4()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_6()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_7()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_5()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_6()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_8()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_9()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_7()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_10()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_11()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_8()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_9()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_12()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_13()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_10()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_11()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_14()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_12()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_13()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_15()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_16()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
	}

	/**
	 * Run the void store(IdentityModel,Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_14()
		throws Exception {
		SourceDatabaseMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(table, sourcePK, naturalKey, targetPK);

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
		new org.junit.runner.JUnitCore().run(SourceDatabaseMapperTest.class);
	}
}