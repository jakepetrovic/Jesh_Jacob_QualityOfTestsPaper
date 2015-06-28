package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractDBTableComponentTest</code> contains tests for the class <code>{@link AbstractDBTableComponent}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AbstractDBTableComponentTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private AbstractDBTableComponent fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private AbstractDBTableComponent fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private AbstractDBTableComponent fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private AbstractDBTableComponent fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public AbstractDBTableComponent getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public AbstractDBTableComponent getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public AbstractDBTableComponent getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractDBTableComponent
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public AbstractDBTableComponent getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);
		}
		return fixture4;
	}

	/**
	 * Run the DBTable getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();

		DBTable result = fixture.getTable();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();

		DBTable result = fixture.getTable();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();

		DBTable result = fixture.getTable();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture4_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();

		DBTable result = fixture.getTable();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_1()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new DefaultDBTable();

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_2()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.setTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_2()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_2()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_2()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_3()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new DefaultDBTable("");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_3()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_3()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_3()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new DefaultDBTable();

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_4()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.setTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_4()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_4()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_4()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_5()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_5()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_5()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_5()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new DefaultDBTable();

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_6()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.setTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_6()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_6()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_6()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_7()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new DefaultDBTable("");

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_7()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture2_7()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture2();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture3_7()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture3();
		DBTable table = new DefaultDBTable();

		fixture.setTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture4_8()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture4();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.setTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetTable_fixture1_8()
		throws Exception {
		AbstractDBTableComponent fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.setTable(table);

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
		new org.junit.runner.JUnitCore().run(AbstractDBTableComponentTest.class);
	}
}