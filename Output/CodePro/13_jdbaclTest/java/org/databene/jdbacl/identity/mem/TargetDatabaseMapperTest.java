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
 * The class <code>TargetDatabaseMapperTest</code> contains tests for the class <code>{@link TargetDatabaseMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TargetDatabaseMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TargetDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private TargetDatabaseMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TargetDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private TargetDatabaseMapper fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TargetDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public TargetDatabaseMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new TargetDatabaseMapper(new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf(""))), new BrokeredConnection30((BrokeredConnectionControl) null), "", new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TargetDatabaseMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public TargetDatabaseMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new TargetDatabaseMapper(new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null)), new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_1()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new BrokeredConnection30((BrokeredConnectionControl) null);
		String targetDbId = "";
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getDbId());
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_2()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new BrokeredConnection40((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getDbId());
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_3()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new EmbedConnection30(new Driver169(), "", new Properties());
		String targetDbId = "";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_4()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_5()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_6()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection40(new Driver169(), "", new Properties());
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_7()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_8()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_9()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new EmbedConnection40((EmbedConnection) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_10()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new FBConnection((FBManagedConnection) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_11()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection("", new Properties());
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_12()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection("0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_13()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new JdbcConnection(new Session(), "", "");
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_14()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_15()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new JdbcConnection((JdbcConnection) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_16()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_17()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new jdbcConnection(new HsqlProperties(""));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_18()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new jdbcConnection((org.hsqldb.Session) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_19()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new BrokeredConnection30((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getDbId());
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_20()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_21()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_22()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_23()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection40(new Driver169(), "", new Properties());
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_24()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_25()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_26()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new EmbedConnection40((EmbedConnection) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_27()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new FBConnection((FBManagedConnection) null);
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_28()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection("", new Properties());
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

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
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_29()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection("0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetDatabaseMapper(KeyMapper,Connection,String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetDatabaseMapper_30()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new JdbcConnection(new Session(), "", "");
		String targetDbId = "0123456789";
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetDatabaseMapper result = new TargetDatabaseMapper(root, target, targetDbId, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the String getDbId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDbId_fixture1_1()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();

		String result = fixture.getDbId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDbId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDbId_fixture2_1()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();

		String result = fixture.getDbId();

		// add additional test code here
		assertEquals("0123456789", result);
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture2();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
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
		TargetDatabaseMapper fixture = getFixture1();
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
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_1()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_1()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_2()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_2()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_3()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_3()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_4()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_5()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_4()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_6()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_7()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_5()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_8()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_6()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_7()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(IdentityModel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_8()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(identity, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_1()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_1()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_2()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_3()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_2()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_4()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_5()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_3()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_6()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_7()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_4()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_5()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_8()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_6()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_7()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_9()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_8()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_9()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_10()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_10()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_11()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_11()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_12()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_13()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_12()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_14()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_15()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture2();
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_13()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_14()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object targetPK = new Object();

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(IdentityModel,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_15()
		throws Exception {
		TargetDatabaseMapper fixture = getFixture1();
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(identity, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.store(TargetDatabaseMapper.java:61)
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
		new org.junit.runner.JUnitCore().run(TargetDatabaseMapperTest.class);
	}
}