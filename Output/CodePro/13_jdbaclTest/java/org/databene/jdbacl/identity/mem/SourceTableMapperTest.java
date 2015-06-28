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
 * The class <code>SourceTableMapperTest</code> contains tests for the class <code>{@link SourceTableMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SourceTableMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SourceTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SourceTableMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SourceTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SourceTableMapper fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SourceTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SourceTableMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SourceTableMapper(new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf(""))), new BrokeredConnection30((BrokeredConnectionControl) null), "", new NaturalPkIdentity(""), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SourceTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SourceTableMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SourceTableMapper(new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null)), new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new NkPkQueryIdentity("", ""), new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_1()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		IdentityModel table = new NaturalPkIdentity("");
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_2()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_3()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());
		String dbId = "";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_4()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_5()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "0123456789";
		IdentityModel table = new NaturalPkIdentity("");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

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
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_6()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String dbId = "";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_7()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_8()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new FBConnection((FBManagedConnection) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_9()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new JdbcConnection("", new Properties());
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_10()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_11()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

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
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_12()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_13()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new JdbcConnection((JdbcConnection) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_14()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_15()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_16()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_17()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_18()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_19()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_20()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_21()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());
		String dbId = "";
		IdentityModel table = new NaturalPkIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_22()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String dbId = "0123456789";
		IdentityModel table = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

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
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_23()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new EmbedConnection40((EmbedConnection) null);
		String dbId = "";
		IdentityModel table = new NkPkQueryIdentity("0123456789", "0123456789");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_24()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new FBConnection((FBManagedConnection) null);
		String dbId = "0123456789";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_25()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

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
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_26()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection connection = new JdbcConnection(new Session(), "", "");
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_27()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_28()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection((JdbcConnection) null);
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

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
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_29()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the SourceTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSourceTableMapper_30()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection connection = new jdbcConnection(new HsqlProperties(""));
		String dbId = "";
		IdentityModel table = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		SourceTableMapper result = new SourceTableMapper(root, connection, dbId, table, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_1()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_1()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture2_2()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = new Object();

		Object result = fixture.getTargetPK(sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetPK(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetPK_fixture1_2()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = null;

		Object result = fixture.getTargetPK(sourcePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.getTargetPK(SourceTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_1()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_1()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_2()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_3()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_4()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_5()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_6()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_7()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_8()
		throws Exception {
		SourceTableMapper fixture = getFixture2();
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_2()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_3()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = null;
		String naturalKey = "0123456789";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_4()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_5()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = null;
		String naturalKey = "";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.SourceTableMapper.store(SourceTableMapper.java:48)
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_6()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_7()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = new Object();
		String naturalKey = "0123456789";
		Object targetPK = "1";

		fixture.store(sourcePK, naturalKey, targetPK);

		// add additional test code here
	}

	/**
	 * Run the void store(Object,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_8()
		throws Exception {
		SourceTableMapper fixture = getFixture1();
		Object sourcePK = new Object();
		String naturalKey = "";
		Object targetPK = null;

		fixture.store(sourcePK, naturalKey, targetPK);

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
		new org.junit.runner.JUnitCore().run(SourceTableMapperTest.class);
	}
}