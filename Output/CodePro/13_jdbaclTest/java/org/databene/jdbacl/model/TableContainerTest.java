package org.databene.jdbacl.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TableContainerTest</code> contains tests for the class <code>{@link TableContainer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableContainerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TableContainer
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableContainer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableContainer
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableContainer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableContainer
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableContainer fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableContainer
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableContainer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new TableContainer("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableContainer
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableContainer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new TableContainer("", (CompositeDBObject<? extends DBObject>) null);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableContainer
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableContainer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new TableContainer("0123456789", (CompositeDBObject<? extends DBObject>) null);
		}
		return fixture3;
	}

	/**
	 * Run the TableContainer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_1()
		throws Exception {
		String name = "";

		TableContainer result = new TableContainer(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_2()
		throws Exception {
		String name = "0123456789";

		TableContainer result = new TableContainer(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_3()
		throws Exception {
		String name = "1";

		TableContainer result = new TableContainer(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("1", result.toString());
		assertEquals("1", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String,CompositeDBObject<? extends DBObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_4()
		throws Exception {
		String name = "";
		CompositeDBObject<? extends DBObject> parent = new TableContainer("");

		TableContainer result = new TableContainer(name, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String,CompositeDBObject<? extends DBObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_5()
		throws Exception {
		String name = "0123456789";
		CompositeDBObject<? extends DBObject> parent = new TableContainer("", (CompositeDBObject<? extends DBObject>) null);

		TableContainer result = new TableContainer(name, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String,CompositeDBObject<? extends DBObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_6()
		throws Exception {
		String name = "";
		CompositeDBObject<? extends DBObject> parent = new TableContainer("0123456789", (CompositeDBObject<? extends DBObject>) null);

		TableContainer result = new TableContainer(name, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String,CompositeDBObject<? extends DBObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_7()
		throws Exception {
		String name = "";
		CompositeDBObject<? extends DBObject> parent = new TableContainer("", (CompositeDBObject<? extends DBObject>) null);

		TableContainer result = new TableContainer(name, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String,CompositeDBObject<? extends DBObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_8()
		throws Exception {
		String name = "0123456789";
		CompositeDBObject<? extends DBObject> parent = new TableContainer("0123456789", (CompositeDBObject<? extends DBObject>) null);

		TableContainer result = new TableContainer(name, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the TableContainer(String,CompositeDBObject<? extends DBObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testTableContainer_9()
		throws Exception {
		String name = "0123456789";
		CompositeDBObject<? extends DBObject> parent = new TableContainer("");

		TableContainer result = new TableContainer(name, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("container", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_1()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_1()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_1()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_2()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable();

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_2()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_2()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_3()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_3()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_4()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_4()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_3()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable();

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_5()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_5()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_4()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_6()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_5()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_7()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_6()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable();

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_6()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture1_8()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_7()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_7()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture2_8()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable("");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddTable_fixture3_8()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addTable(table);

		// add additional test code here
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
		TableContainer fixture = getFixture1();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.TableContainer.getCatalog(TableContainer.java:64)
		assertNotNull(result);
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
		TableContainer fixture = getFixture2();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.TableContainer.getCatalog(TableContainer.java:64)
		assertNotNull(result);
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
		TableContainer fixture = getFixture3();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.TableContainer.getCatalog(TableContainer.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the List<ContainerComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture1_1()
		throws Exception {
		TableContainer fixture = getFixture1();

		List<ContainerComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ContainerComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture2_1()
		throws Exception {
		TableContainer fixture = getFixture2();

		List<ContainerComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<ContainerComponent> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture3_1()
		throws Exception {
		TableContainer fixture = getFixture3();

		List<ContainerComponent> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		TableContainer fixture = getFixture1();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
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
		TableContainer fixture = getFixture2();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
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
		TableContainer fixture = getFixture3();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_1()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_1()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_1()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_2()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_2()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_2()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_3()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_3()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_4()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_4()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_5()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_5()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_6()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_6()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_7()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_7()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_8()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_8()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_9()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_9()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_10()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_10()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_11()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_11()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBSequence> result = new Vector<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_12()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		List<DBSequence> result = new ArrayList<DBSequence>();

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_12()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		List<DBSequence> result = new LinkedList<DBSequence>();

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_13()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		List<DBSequence> result = new Vector<DBSequence>();

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_3()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_14()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_4()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_15()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_5()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_16()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = true;
		ArrayList<DBSequence> result = new ArrayList<DBSequence>();
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_6()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_17()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = true;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", "", ""));
		result.add(new DBSequence("", new DBSchema("")));
		result.add(new DBSequence("0123456789", "0123456789", "0123456789"));
		result.add(new DBSequence("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean,List<DBSequence>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_7()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;
		LinkedList<DBSequence> result = new LinkedList<DBSequence>();
		result.add(new DBSequence("", new DBSchema("")));

		List<DBSequence> result2 = fixture.getSequences(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
		assertNotNull(result2);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_1()
		throws Exception {
		TableContainer fixture = getFixture1();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_1()
		throws Exception {
		TableContainer fixture = getFixture2();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_1()
		throws Exception {
		TableContainer fixture = getFixture3();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_2()
		throws Exception {
		TableContainer fixture = getFixture2();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_2()
		throws Exception {
		TableContainer fixture = getFixture3();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_2()
		throws Exception {
		TableContainer fixture = getFixture1();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_1()
		throws Exception {
		TableContainer fixture = getFixture1();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_1()
		throws Exception {
		TableContainer fixture = getFixture2();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture3_1()
		throws Exception {
		TableContainer fixture = getFixture3();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_2()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_2()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture3_2()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_3()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture3_3()
		throws Exception {
		TableContainer fixture = getFixture3();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_3()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_4()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable(""));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_4()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable(""));
		result.add(new DefaultDBTable("", new DBSchema("")));
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DefaultDBTable());
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_5()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable("", new DBSchema("")));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_5()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_6()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new DefaultDBTable());

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_6()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_7()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_7()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_8()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		ArrayList<DBTable> result = new ArrayList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_8()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable(""));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_9()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable(""));
		result.add(new DefaultDBTable("", new DBSchema("")));
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DefaultDBTable());
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_9()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable("", new DBSchema("")));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_10()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_10()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new DefaultDBTable());

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_11()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_11()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_12()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_12()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		LinkedList<DBTable> result = new LinkedList<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_13()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable(""));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_13()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable(""));
		result.add(new DefaultDBTable("", new DBSchema("")));
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));
		result.add(new DefaultDBTable());
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_14()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable("", new DBSchema("")));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_14()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_15()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new DefaultDBTable());

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_15()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result2);
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_16()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_16()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_17()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		Vector<DBTable> result = new Vector<DBTable>();
		result.add(new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null));

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(1, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_17()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		List<DBTable> result = new ArrayList<DBTable>();

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_18()
		throws Exception {
		TableContainer fixture = getFixture1();
		boolean recursive = false;
		List<DBTable> result = new LinkedList<DBTable>();

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean,List<DBTable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_18()
		throws Exception {
		TableContainer fixture = getFixture2();
		boolean recursive = true;
		List<DBTable> result = new Vector<DBTable>();

		List<DBTable> result2 = fixture.getTables(recursive, result);

		// add additional test code here
		assertNotNull(result2);
		assertEquals(0, result2.size());
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_1()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_1()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_1()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_2()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable();

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_2()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.removeTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_2()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_3()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_3()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_4()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_4()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_3()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable();

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_5()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.removeTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_5()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_4()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_6()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_5()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_7()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_6()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable();

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_6()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.removeTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_8()
		throws Exception {
		TableContainer fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_7()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_7()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_8()
		throws Exception {
		TableContainer fixture = getFixture2();
		DBTable table = new DefaultDBTable("");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_8()
		throws Exception {
		TableContainer fixture = getFixture3();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.removeTable(table);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(TableContainerTest.class);
	}
}