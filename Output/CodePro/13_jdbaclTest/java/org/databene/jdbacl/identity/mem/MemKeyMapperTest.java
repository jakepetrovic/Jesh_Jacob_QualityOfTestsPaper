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
 * The class <code>MemKeyMapperTest</code> contains tests for the class <code>{@link MemKeyMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MemKeyMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MemKeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private MemKeyMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MemKeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private MemKeyMapper fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MemKeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public MemKeyMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MemKeyMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public MemKeyMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_1()
		throws Exception {
		Connection source = new BrokeredConnection30((BrokeredConnectionControl) null);
		String sourceDbId = "";
		Connection target = new BrokeredConnection30((BrokeredConnectionControl) null);
		String targetDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_2()
		throws Exception {
		Connection source = new BrokeredConnection40((BrokeredConnectionControl) null);
		String sourceDbId = "0123456789";
		Connection target = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String targetDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_3()
		throws Exception {
		Connection source = new EmbedConnection30(new Driver169(), "", new Properties());
		String sourceDbId = "";
		Connection target = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_4()
		throws Exception {
		Connection source = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String sourceDbId = "0123456789";
		Connection target = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_5()
		throws Exception {
		Connection source = new EmbedConnection40(new Driver169(), "", new Properties());
		String sourceDbId = "";
		Connection target = new EmbedConnection40(new Driver169(), "", new Properties());
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_6()
		throws Exception {
		Connection source = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String sourceDbId = "0123456789";
		Connection target = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_7()
		throws Exception {
		Connection source = new EmbedConnection40((EmbedConnection) null);
		String sourceDbId = "";
		Connection target = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_8()
		throws Exception {
		Connection source = new FBConnection((FBManagedConnection) null);
		String sourceDbId = "0123456789";
		Connection target = new EmbedConnection40((EmbedConnection) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_9()
		throws Exception {
		Connection source = new JdbcConnection("0123456789", new Properties((Properties) null));
		String sourceDbId = "";
		Connection target = new FBConnection((FBManagedConnection) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_10()
		throws Exception {
		Connection source = new JdbcConnection(new Session(), "", "");
		String sourceDbId = "0123456789";
		Connection target = new JdbcConnection("", new Properties());
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_11()
		throws Exception {
		Connection source = new JdbcConnection((JdbcConnection) null);
		String sourceDbId = "";
		Connection target = new JdbcConnection("0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_12()
		throws Exception {
		Connection source = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String sourceDbId = "0123456789";
		Connection target = new JdbcConnection(new Session(), "", "");
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_13()
		throws Exception {
		Connection source = new jdbcConnection((org.hsqldb.Session) null);
		String sourceDbId = "";
		Connection target = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_14()
		throws Exception {
		Connection source = new BrokeredConnection30((BrokeredConnectionControl) null);
		String sourceDbId = "0123456789";
		Connection target = new JdbcConnection((JdbcConnection) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_15()
		throws Exception {
		Connection source = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String sourceDbId = "";
		Connection target = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_16()
		throws Exception {
		Connection source = new EmbedConnection30(new Driver169(), "", new Properties());
		String sourceDbId = "0123456789";
		Connection target = new jdbcConnection(new HsqlProperties(""));
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_17()
		throws Exception {
		Connection source = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String sourceDbId = "";
		Connection target = new jdbcConnection((org.hsqldb.Session) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_18()
		throws Exception {
		Connection source = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String sourceDbId = "";
		Connection target = new BrokeredConnection30((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_19()
		throws Exception {
		Connection source = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String sourceDbId = "0123456789";
		Connection target = new BrokeredConnection40((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_20()
		throws Exception {
		Connection source = new FBConnection((FBManagedConnection) null);
		String sourceDbId = "";
		Connection target = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_21()
		throws Exception {
		Connection source = new JdbcConnection("", new Properties());
		String sourceDbId = "0123456789";
		Connection target = new EmbedConnection40(new Driver169(), "", new Properties());
		String targetDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_22()
		throws Exception {
		Connection source = new JdbcConnection(new Session(), "", "");
		String sourceDbId = "";
		Connection target = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_23()
		throws Exception {
		Connection source = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String sourceDbId = "0123456789";
		Connection target = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_24()
		throws Exception {
		Connection source = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String sourceDbId = "";
		Connection target = new EmbedConnection40((EmbedConnection) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_25()
		throws Exception {
		Connection source = new jdbcConnection(new HsqlProperties(""));
		String sourceDbId = "0123456789";
		Connection target = new FBConnection((FBManagedConnection) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_26()
		throws Exception {
		Connection source = new BrokeredConnection30((BrokeredConnectionControl) null);
		String sourceDbId = "";
		Connection target = new JdbcConnection("", new Properties());
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_27()
		throws Exception {
		Connection source = new BrokeredConnection40((BrokeredConnectionControl) null);
		String sourceDbId = "0123456789";
		Connection target = new JdbcConnection("0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_28()
		throws Exception {
		Connection source = new EmbedConnection30(new Driver169(), "", new Properties());
		String sourceDbId = "";
		Connection target = new JdbcConnection(new Session(), "", "");
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_29()
		throws Exception {
		Connection source = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String sourceDbId = "0123456789";
		Connection target = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

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
	 * Run the MemKeyMapper(Connection,String,Connection,String,IdentityProvider,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testMemKeyMapper_30()
		throws Exception {
		Connection source = new EmbedConnection40(new Driver169(), "", new Properties());
		String sourceDbId = "";
		Connection target = new JdbcConnection((JdbcConnection) null);
		String targetDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		MemKeyMapper result = new MemKeyMapper(source, sourceDbId, target, targetDbId, identityProvider, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_1()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_1()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_2()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_2()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_3()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_4()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_3()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_4()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_5()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_5()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_6()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_7()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_6()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_7()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_8()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_8()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_9()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_10()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_9()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_10()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_11()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_11()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_12()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_13()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_12()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getNaturalKey(TargetDatabaseMapper.java:65)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_13()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_14()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_14()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		Object sourcePK = new Object();

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_15()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_16()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String dbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		String result = fixture.getNaturalKey(dbId, identity, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getNaturalKey(MemKeyMapper.java:71)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("", "");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NoIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NaturalPkIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NkPkQueryIdentity("", "");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture2();
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NaturalPkIdentity("");
		String naturalKey = "0123456789";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
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
		MemKeyMapper fixture = getFixture1();
		IdentityModel table = new NoIdentity("");
		String naturalKey = "";

		Object result = fixture.getTargetPK(table, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.TargetDatabaseMapper.getTargetPK(TargetDatabaseMapper.java:69)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_9()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_9()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_10()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_10()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_11()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_12()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_11()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_12()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_13()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_13()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_14()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_15()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_14()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_15()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_16()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_16()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_17()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_18()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_17()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_18()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_19()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_19()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_20()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_21()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_20()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No identity defined for table 
		//       at org.databene.jdbacl.identity.NoIdentity.createNkPkIterator(NoIdentity.java:48)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.getTargetPK(SourceDatabaseMapper.java:61)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_21()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_22()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_22()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NoIdentity("");
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_23()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel table = new NaturalPkIdentity("");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(String,IdentityModel,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_24()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourceDbId, table, sourcePK);

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
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getTargetPK(MemKeyMapper.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_1()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_1()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_2()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_2()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_3()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_3()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_4()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_4()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_5()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_5()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_6()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_6()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_7()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_7()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_8()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_8()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_9()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_9()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_10()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_11()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_10()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_11()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_12()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_13()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_12()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_13()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_14()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture2_15()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_14()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
	}

	/**
	 * Run the void registerSource(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRegisterSource_fixture1_15()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		fixture.registerSource(sourceDbId, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_1()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_1()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object sourcePK = null;
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_2()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_3()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_2()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_3()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_4()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_5()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_4()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_5()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_6()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_6()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_7()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_8()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_9()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_7()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_8()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_9()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_10()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_11()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_12()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object sourcePK = null;
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_13()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_10()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_11()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_12()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_14()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_15()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Database not registered: 0123456789
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.getSourceDBMapper(MemKeyMapper.java:115)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_16()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "0123456789";
		Object sourcePK = null;
		Object targetPK = "1";

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_17()
		throws Exception {
		MemKeyMapper fixture = getFixture1();
		String sourceDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		String naturalKey = "0123456789";
		Object sourcePK = new Object();
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(String,IdentityModel,String,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_13()
		throws Exception {
		MemKeyMapper fixture = getFixture2();
		String sourceDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		String naturalKey = "";
		Object sourcePK = null;
		Object targetPK = null;

		fixture.store(sourceDbId, identity, naturalKey, sourcePK, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
		//       at org.databene.jdbacl.identity.mem.SourceDatabaseMapper.store(SourceDatabaseMapper.java:57)
		//       at org.databene.jdbacl.identity.mem.MemKeyMapper.store(MemKeyMapper.java:60)
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
		new org.junit.runner.JUnitCore().run(MemKeyMapperTest.class);
	}
}