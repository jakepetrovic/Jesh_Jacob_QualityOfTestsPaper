package org.databene.jdbacl.model.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;
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
import org.databene.commons.HeavyweightIterator;
import org.databene.commons.iterator.TableRowIterator;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.CompositeDBObject;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBIndex;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPackage;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBProcedure;
import org.databene.jdbacl.model.DBRow;
import org.databene.jdbacl.model.DBRowIterator;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBTableComponent;
import org.databene.jdbacl.model.DBTrigger;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
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
 * The class <code>LazyTableTest</code> contains tests for the class <code>{@link LazyTable}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LazyTableTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LazyTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private LazyTable fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see LazyTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private LazyTable fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see LazyTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private LazyTable fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LazyTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public LazyTable getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LazyTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public LazyTable getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LazyTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public LazyTable getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);
		}
		return fixture3;
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_1()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("");
		DBSchema schema = null;
		String tableName = "";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_2()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("", "", "", "", "", "", "", false);
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_3()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "", true);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_4()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", false);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_5()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", true);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_6()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "0123456789");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_7()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_8()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", false);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_9()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", true);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_10()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new BrokeredConnection30((BrokeredConnectionControl) null), "", "");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_11()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", "0123456789");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_12()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", "An��t-1.0.txt");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_13()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new JDBCConnectData("", "", "", ""));
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_14()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_15()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_16()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_17()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_18()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("", "", "", "", "", "");
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_19()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("", "", "", "", "", "", "", false);
		DBSchema schema = null;
		String tableName = "";
		String doc = "0123456789";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("0123456789", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_20()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "", true);
		DBSchema schema = null;
		String tableName = "";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_21()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789", true);
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_22()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "0123456789");
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_23()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_24()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", false);
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_25()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", true);
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_26()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new BrokeredConnection30((BrokeredConnectionControl) null), "", "");
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_27()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", "0123456789");
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_28()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", "An��t-1.0.txt");
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_29()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter(new JDBCConnectData("", "", "", ""));
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the LazyTable(JDBCDBImporter,DBSchema,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testLazyTable_30()
		throws Exception {
		JDBCDBImporter importer = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
		DBSchema schema = null;
		String tableName = "0123456789";
		String doc = "";

		LazyTable result = new LazyTable(importer, schema, tableName, doc);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals("table", result.getObjectType());
		assertEquals("", result.getDoc());
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_10()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBForeignKeyConstraint fk = null;

		fixture.addForeignKey(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBForeignKeyConstraint fk = null;

		fixture.addForeignKey(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBForeignKeyConstraint fk = null;

		fixture.addForeignKey(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBIndex index = null;

		fixture.addIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBUniqueConstraint uk = null;

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBUniqueConstraint uk = null;

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBUniqueConstraint uk = null;

		fixture.addUniqueConstraint(uk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

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
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testAllRows_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		int result = fixture.countProviders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.countProviders(LazyTable.java:235)
		assertEquals(0, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		int result = fixture.countProviders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.countProviders(LazyTable.java:235)
		assertEquals(0, result);
	}

	/**
	 * Run the int countProviders() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testCountProviders_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		int result = fixture.countProviders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.countProviders(LazyTable.java:235)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object other = "1";

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object other = null;

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object other = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object other = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object other = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object other = null;

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object other = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object other = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object other = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object other = "1";

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object other = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema(""), "0123456789", "0123456789");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object other = new LazyTable(new JDBCDBImporter("", "", "", "", "", "", "", false), new DBSchema("", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object other = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), (String) null, (String) null);

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object other = "1";

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testEquals_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object other = null;

		boolean result = fixture.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCheckConstraints(LazyTable.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCheckConstraints(LazyTable.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCheckConstraints(LazyTable.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumnNames(LazyTable.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumnNames(LazyTable.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumnNames(LazyTable.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getComponents(LazyTable.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getComponents(LazyTable.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBTableComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		List<DBTableComponent> result = fixture.getComponents();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getComponents(LazyTable.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraints(LazyTable.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraints(LazyTable.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraints(LazyTable.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndexes(LazyTable.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndexes(LazyTable.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndexes(LazyTable.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("table", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("table", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("table", result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getOwner(LazyTable.java:89)
		assertNotNull(result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getOwner(LazyTable.java:89)
		assertNotNull(result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getOwner(LazyTable.java:89)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPKColumnNames(LazyTable.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPKColumnNames(LazyTable.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPKColumnNames(LazyTable.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPrimaryKeyConstraint(LazyTable.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPrimaryKeyConstraint(LazyTable.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPrimaryKeyConstraint(LazyTable.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		int index = 0;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		int index = 1;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		int index = 0;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		int index = 1;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		int index = 0;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		int index = 1;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetProvider_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		int index = 7;

		DBTable result = fixture.getProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getProvider(LazyTable.java:239)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBTable getRealTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRealTable_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		DefaultDBTable result = fixture.getRealTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBTable getRealTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRealTable_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		DefaultDBTable result = fixture.getRealTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBTable getRealTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRealTable_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		DefaultDBTable result = fixture.getRealTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getReferrers(LazyTable.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getReferrers(LazyTable.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getReferrers(LazyTable.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new FBConnection((FBManagedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new JdbcConnection("", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new JdbcConnection(new Session(), "", "");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new FBConnection((FBManagedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.toString());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1584875013, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1221710159, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testHashCode_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1886485147, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBCatalog("");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBCatalog();

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBCheckConstraint("", false, "", "");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBCheckConstraint("", true, (String) null, (String) null);

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBPackage("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), "", true, new String[] {"An��t-1.0.txt"});

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBProcedure("", new DBPackage("", new DBSchema("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBSchema("");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBSchema("", new DBCatalog(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBSequence("", "", "");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBSequence("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBSequence("0123456789", "0123456789", "0123456789");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBObject other = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture2_10()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBObject other = new DBTrigger("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBObject other = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.isIdentical(LazyTable.java:247)
		assertTrue(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.query(LazyTable.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.query(LazyTable.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.query(LazyTable.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.query(LazyTable.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.query(LazyTable.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String query = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_12()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		String query = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_13()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_14()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

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
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_15()
		throws Exception {
		LazyTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		String query = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new JdbcConnection("", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_12()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_13()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_14()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

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
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_15()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryByPK_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_16()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_10()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_17()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_11()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_18()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_12()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_19()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_13()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("", new Properties());

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_20()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_11()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_14()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_21()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_12()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_22()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_23()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_13()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_15()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_24()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_14()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_16()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_25()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_15()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_17()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_26()
		throws Exception {
		LazyTable fixture = getFixture1();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_16()
		throws Exception {
		LazyTable fixture = getFixture3();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("", new Properties());

		DBRow result = fixture.queryByPK(idParts, connection);

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
	 * Run the DBRow queryByPK(Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryByPK_fixture2_18()
		throws Exception {
		LazyTable fixture = getFixture2();
		Object[] idParts = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRow result = fixture.queryByPK(idParts, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new FBConnection((FBManagedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new JdbcConnection("", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new JdbcConnection(new Session(), "", "");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

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
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		Connection connection = new FBConnection((FBManagedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRows(LazyTable.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRows(LazyTable.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRows(LazyTable.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRows(LazyTable.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRows(LazyTable.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_12()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_13()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_14()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

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
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_15()
		throws Exception {
		LazyTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryRows_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_5()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_6()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_5()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_5()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_6()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_7()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_7()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_8()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_8()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_6()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_9()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_7()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_9()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_8()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_10()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

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
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_10()
		throws Exception {
		LazyTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_11()
		throws Exception {
		LazyTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryRowsByCellValues_fixture2_9()
		throws Exception {
		LazyTable fixture = getFixture2();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		int index = 0;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		int index = 1;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		int index = 0;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		int index = 1;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		int index = 0;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		int index = 1;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the boolean requiresProvider(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRequiresProvider_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		int index = 7;

		boolean result = fixture.requiresProvider(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.requiresProvider(LazyTable.java:243)
		assertTrue(result);
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setOwner(LazyTable.java:93)
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setOwner(LazyTable.java:93)
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setOwner(LazyTable.java:93)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_2()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_2()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_3()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_2()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_3()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_3()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_4()
		throws Exception {
		LazyTable fixture = getFixture3();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_4()
		throws Exception {
		LazyTable fixture = getFixture1();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:422)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_4()
		throws Exception {
		LazyTable fixture = getFixture2();
		DBPrimaryKeyConstraint pk = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), (DBSchema) null, "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		LazyTable fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		LazyTable fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		LazyTable fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
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
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LazyTableTest.class);
	}
}