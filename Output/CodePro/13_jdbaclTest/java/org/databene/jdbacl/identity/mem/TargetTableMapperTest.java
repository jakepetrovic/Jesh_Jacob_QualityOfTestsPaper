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
 * The class <code>TargetTableMapperTest</code> contains tests for the class <code>{@link TargetTableMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TargetTableMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TargetTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private TargetTableMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TargetTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private TargetTableMapper fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TargetTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public TargetTableMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new TargetTableMapper(new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf(""))), new BrokeredConnection30((BrokeredConnectionControl) null), "", new NaturalPkIdentity(""), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TargetTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public TargetTableMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new TargetTableMapper(new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null)), new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new NkPkQueryIdentity("", ""), new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_1()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new BrokeredConnection30((BrokeredConnectionControl) null);
		String targetDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_2()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new BrokeredConnection40((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_3()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new EmbedConnection30(new Driver169(), "", new Properties());
		String targetDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_4()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_5()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection40(new Driver169(), "", new Properties());
		String targetDbId = "0123456789";
		IdentityModel identity = new NaturalPkIdentity("");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

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
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_6()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);
		String targetDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_7()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new EmbedConnection40((EmbedConnection) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_8()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new FBConnection((FBManagedConnection) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_9()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new JdbcConnection("", new Properties());
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_10()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new JdbcConnection("0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_11()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection(new Session(), "", "");
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

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
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_12()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_13()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new JdbcConnection((JdbcConnection) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_14()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_15()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new jdbcConnection(new HsqlProperties(""));
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_16()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new jdbcConnection((org.hsqldb.Session) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_17()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new BrokeredConnection30((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_18()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new BrokeredConnection40((BrokeredConnectionControl) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_19()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_20()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_21()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new EmbedConnection40(new Driver169(), "", new Properties());
		String targetDbId = "";
		IdentityModel identity = new NaturalPkIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_22()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));
		String targetDbId = "0123456789";
		IdentityModel identity = new NkPkQueryIdentity("", "");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

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
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_23()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new EmbedConnection40((EmbedConnection) null);
		String targetDbId = "";
		IdentityModel identity = new NkPkQueryIdentity("0123456789", "0123456789");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_24()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new FBConnection((FBManagedConnection) null);
		String targetDbId = "0123456789";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_25()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Connection target = new JdbcConnection("0123456789", new Properties((Properties) null));
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

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
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_26()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));
		Connection target = new JdbcConnection(new Session(), "", "");
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_27()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);
		Connection target = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_28()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection((JdbcConnection) null);
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

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
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_29()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);
		Connection target = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TargetTableMapper(KeyMapper,Connection,String,IdentityModel,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTargetTableMapper_30()
		throws Exception {
		KeyMapper root = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Connection target = new jdbcConnection(new HsqlProperties(""));
		String targetDbId = "";
		IdentityModel identity = new NoIdentity("");
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TargetTableMapper result = new TargetTableMapper(root, target, targetDbId, identity, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetId_fixture1_1()
		throws Exception {
		TargetTableMapper fixture = getFixture1();
		String naturalKey = "";

		Object result = fixture.getTargetId(naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetId_fixture2_1()
		throws Exception {
		TargetTableMapper fixture = getFixture2();
		String naturalKey = "0123456789";

		Object result = fixture.getTargetId(naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetId_fixture2_2()
		throws Exception {
		TargetTableMapper fixture = getFixture2();
		String naturalKey = "";

		Object result = fixture.getTargetId(naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTargetId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTargetId_fixture1_2()
		throws Exception {
		TargetTableMapper fixture = getFixture1();
		String naturalKey = "0123456789";

		Object result = fixture.getTargetId(naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.getTargetId(TargetTableMapper.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_1()
		throws Exception {
		TargetTableMapper fixture = getFixture1();
		Object targetPK = new Object();
		String naturalKey = "";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_1()
		throws Exception {
		TargetTableMapper fixture = getFixture2();
		Object targetPK = null;
		String naturalKey = "0123456789";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_2()
		throws Exception {
		TargetTableMapper fixture = getFixture2();
		Object targetPK = null;
		String naturalKey = "";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_3()
		throws Exception {
		TargetTableMapper fixture = getFixture2();
		Object targetPK = new Object();
		String naturalKey = "0123456789";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_4()
		throws Exception {
		TargetTableMapper fixture = getFixture2();
		Object targetPK = new Object();
		String naturalKey = "";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_2()
		throws Exception {
		TargetTableMapper fixture = getFixture1();
		Object targetPK = null;
		String naturalKey = "0123456789";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_3()
		throws Exception {
		TargetTableMapper fixture = getFixture1();
		Object targetPK = null;
		String naturalKey = "";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_4()
		throws Exception {
		TargetTableMapper fixture = getFixture1();
		Object targetPK = new Object();
		String naturalKey = "0123456789";

		Object result = fixture.store(targetPK, naturalKey);

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(TargetTableMapperTest.class);
	}
}