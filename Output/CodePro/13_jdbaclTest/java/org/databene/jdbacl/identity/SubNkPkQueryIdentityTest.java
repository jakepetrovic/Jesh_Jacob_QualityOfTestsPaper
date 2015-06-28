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
 * The class <code>SubNkPkQueryIdentityTest</code> contains tests for the class <code>{@link SubNkPkQueryIdentity}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SubNkPkQueryIdentityTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private SubNkPkQueryIdentity fixture12;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SubNkPkQueryIdentity("", new String[] {"", "0123456789", "An��t-1.0.txt", null}, new IdentityProvider());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SubNkPkQueryIdentity("", new String[] {"", "0123456789", "An��t-1.0.txt", null}, new IdentityProvider());
			fixture2.setSubNkPkQuery("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new SubNkPkQueryIdentity("", new String[] {"", "0123456789", "An��t-1.0.txt", null}, new IdentityProvider());
			fixture3.setSubNkPkQuery("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new SubNkPkQueryIdentity("", new String[] {"", "0123456789", "An��t-1.0.txt", null}, new IdentityProvider());
			fixture4.setSubNkPkQuery("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new SubNkPkQueryIdentity("0123456789", new String[] {""}, (IdentityProvider) null);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new SubNkPkQueryIdentity("0123456789", new String[] {""}, (IdentityProvider) null);
			fixture6.setSubNkPkQuery("");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new SubNkPkQueryIdentity("0123456789", new String[] {""}, (IdentityProvider) null);
			fixture7.setSubNkPkQuery("0123456789");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new SubNkPkQueryIdentity("0123456789", new String[] {""}, (IdentityProvider) null);
			fixture8.setSubNkPkQuery("An��t-1.0.txt");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new SubNkPkQueryIdentity("An��t-1.0.txt", new String[] {"0123456789"}, (IdentityProvider) null);
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new SubNkPkQueryIdentity("An��t-1.0.txt", new String[] {"0123456789"}, (IdentityProvider) null);
			fixture10.setSubNkPkQuery("");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new SubNkPkQueryIdentity("An��t-1.0.txt", new String[] {"0123456789"}, (IdentityProvider) null);
			fixture11.setSubNkPkQuery("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SubNkPkQueryIdentity
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public SubNkPkQueryIdentity getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new SubNkPkQueryIdentity("An��t-1.0.txt", new String[] {"0123456789"}, (IdentityProvider) null);
			fixture12.setSubNkPkQuery("An��t-1.0.txt");
		}
		return fixture12;
	}

	/**
	 * Run the SubNkPkQueryIdentity(String,String[],IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSubNkPkQueryIdentity_1()
		throws Exception {
		String tableName = "";
		String[] parentTableNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		IdentityProvider identityProvider = new IdentityProvider();

		SubNkPkQueryIdentity result = new SubNkPkQueryIdentity(tableName, parentTableNames, identityProvider);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Sub identity of (, 0123456789, An��t-1.0.txt, ):\nnull", result.getDescription());
		assertEquals("SubNkPkQueryIdentity()", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getTableName());
	}

	/**
	 * Run the SubNkPkQueryIdentity(String,String[],IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSubNkPkQueryIdentity_2()
		throws Exception {
		String tableName = "0123456789";
		String[] parentTableNames = new String[] {""};
		IdentityProvider identityProvider = new IdentityProvider();

		SubNkPkQueryIdentity result = new SubNkPkQueryIdentity(tableName, parentTableNames, identityProvider);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Sub identity of ():\nnull", result.getDescription());
		assertEquals("SubNkPkQueryIdentity(0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getTableName());
	}

	/**
	 * Run the SubNkPkQueryIdentity(String,String[],IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSubNkPkQueryIdentity_3()
		throws Exception {
		String tableName = "";
		String[] parentTableNames = new String[] {"0123456789"};
		IdentityProvider identityProvider = new IdentityProvider();

		SubNkPkQueryIdentity result = new SubNkPkQueryIdentity(tableName, parentTableNames, identityProvider);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Sub identity of (0123456789):\nnull", result.getDescription());
		assertEquals("SubNkPkQueryIdentity()", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getTableName());
	}

	/**
	 * Run the SubNkPkQueryIdentity(String,String[],IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSubNkPkQueryIdentity_4()
		throws Exception {
		String tableName = "";
		String[] parentTableNames = new String[] {""};
		IdentityProvider identityProvider = new IdentityProvider();

		SubNkPkQueryIdentity result = new SubNkPkQueryIdentity(tableName, parentTableNames, identityProvider);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Sub identity of ():\nnull", result.getDescription());
		assertEquals("SubNkPkQueryIdentity()", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getTableName());
	}

	/**
	 * Run the SubNkPkQueryIdentity(String,String[],IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSubNkPkQueryIdentity_5()
		throws Exception {
		String tableName = "0123456789";
		String[] parentTableNames = new String[] {"0123456789"};
		IdentityProvider identityProvider = new IdentityProvider();

		SubNkPkQueryIdentity result = new SubNkPkQueryIdentity(tableName, parentTableNames, identityProvider);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Sub identity of (0123456789):\nnull", result.getDescription());
		assertEquals("SubNkPkQueryIdentity(0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getTableName());
	}

	/**
	 * Run the SubNkPkQueryIdentity(String,String[],IdentityProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSubNkPkQueryIdentity_6()
		throws Exception {
		String tableName = "0123456789";
		String[] parentTableNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		IdentityProvider identityProvider = new IdentityProvider();

		SubNkPkQueryIdentity result = new SubNkPkQueryIdentity(tableName, parentTableNames, identityProvider);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Sub identity of (, 0123456789, An��t-1.0.txt, ):\nnull", result.getDescription());
		assertEquals("SubNkPkQueryIdentity(0123456789)", result.toString());
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
	public void testCreateNkPkIterator_fixture1_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.createParentPkIterator(SubNkPkQueryIdentity.java:99)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.<init>(SubNkPkQueryIdentity.java:94)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity.createNkPkIterator(SubNkPkQueryIdentity.java:76)
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
		SubNkPkQueryIdentity fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.createParentPkIterator(SubNkPkQueryIdentity.java:99)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.<init>(SubNkPkQueryIdentity.java:94)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity.createNkPkIterator(SubNkPkQueryIdentity.java:76)
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
		SubNkPkQueryIdentity fixture = getFixture3();
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
		SubNkPkQueryIdentity fixture = getFixture4();
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
		SubNkPkQueryIdentity fixture = getFixture5();
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
		SubNkPkQueryIdentity fixture = getFixture6();
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
		SubNkPkQueryIdentity fixture = getFixture7();
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
		SubNkPkQueryIdentity fixture = getFixture8();
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
	public void testCreateNkPkIterator_fixture9_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture9();
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
	public void testCreateNkPkIterator_fixture10_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture10();
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
	public void testCreateNkPkIterator_fixture11_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture11();
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
	public void testCreateNkPkIterator_fixture12_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture12();
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
	public void testCreateNkPkIterator_fixture1_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture1();
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
	public void testCreateNkPkIterator_fixture2_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture2();
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
	public void testCreateNkPkIterator_fixture3_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture3();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.createParentPkIterator(SubNkPkQueryIdentity.java:99)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.<init>(SubNkPkQueryIdentity.java:94)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity.createNkPkIterator(SubNkPkQueryIdentity.java:76)
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
		SubNkPkQueryIdentity fixture = getFixture5();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.createParentPkIterator(SubNkPkQueryIdentity.java:99)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.<init>(SubNkPkQueryIdentity.java:94)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity.createNkPkIterator(SubNkPkQueryIdentity.java:76)
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
		SubNkPkQueryIdentity fixture = getFixture6();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);
		String dbId = "0123456789";
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		TableRowIterator result = fixture.createNkPkIterator(connection, dbId, mapper, database);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.createParentPkIterator(SubNkPkQueryIdentity.java:99)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity$RecursiveIterator.<init>(SubNkPkQueryIdentity.java:94)
		//       at org.databene.jdbacl.identity.SubNkPkQueryIdentity.createNkPkIterator(SubNkPkQueryIdentity.java:76)
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
		SubNkPkQueryIdentity fixture = getFixture7();
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
	public void testCreateNkPkIterator_fixture8_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture8();
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
	public void testCreateNkPkIterator_fixture9_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture9();
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
	public void testCreateNkPkIterator_fixture10_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture10();
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
	public void testCreateNkPkIterator_fixture11_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture11();
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
	public void testCreateNkPkIterator_fixture12_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture12();
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
	public void testCreateNkPkIterator_fixture1_3()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture1();
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
	public void testCreateNkPkIterator_fixture2_3()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture2();
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
	public void testCreateNkPkIterator_fixture3_3()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture3();
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
	public void testCreateNkPkIterator_fixture4_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture4();
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
	public void testCreateNkPkIterator_fixture5_3()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture5();
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
	public void testCreateNkPkIterator_fixture6_3()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture6();
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
		SubNkPkQueryIdentity fixture = getFixture8();
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
		SubNkPkQueryIdentity fixture = getFixture1();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (, 0123456789, An��t-1.0.txt, ):\nnull", result);
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
		SubNkPkQueryIdentity fixture = getFixture2();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (, 0123456789, An��t-1.0.txt, ):\n", result);
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
		SubNkPkQueryIdentity fixture = getFixture3();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (, 0123456789, An��t-1.0.txt, ):\n0123456789", result);
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
		SubNkPkQueryIdentity fixture = getFixture4();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (, 0123456789, An��t-1.0.txt, ):\nAn��t-1.0.txt", result);
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
		SubNkPkQueryIdentity fixture = getFixture5();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of ():\nnull", result);
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
		SubNkPkQueryIdentity fixture = getFixture6();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of ():\n", result);
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
		SubNkPkQueryIdentity fixture = getFixture7();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of ():\n0123456789", result);
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
		SubNkPkQueryIdentity fixture = getFixture8();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of ():\nAn��t-1.0.txt", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture9_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture9();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (0123456789):\nnull", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture10_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture10();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (0123456789):\n", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture11_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture11();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (0123456789):\n0123456789", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDescription_fixture12_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture12();

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("Sub identity of (0123456789):\nAn��t-1.0.txt", result);
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture1_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture1();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture2_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture2();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture3_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture3();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture4_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture4();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture5_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture5();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture6_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture6();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture7_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture7();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture8_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture8();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture9_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture9();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture10_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture10();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture11_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture11();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture12_1()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture12();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture2_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture2();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture3_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture3();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture4_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture4();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture5_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture5();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture6_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture6();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture7_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture7();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture8_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture8();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture9_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture9();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture10_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture10();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture11_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture11();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture12_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture12();
		String subNkPkQuery = "";

		fixture.setSubNkPkQuery(subNkPkQuery);

		// add additional test code here
	}

	/**
	 * Run the void setSubNkPkQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetSubNkPkQuery_fixture1_2()
		throws Exception {
		SubNkPkQueryIdentity fixture = getFixture1();
		String subNkPkQuery = "0123456789";

		fixture.setSubNkPkQuery(subNkPkQuery);

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
		new org.junit.runner.JUnitCore().run(SubNkPkQueryIdentityTest.class);
	}
}