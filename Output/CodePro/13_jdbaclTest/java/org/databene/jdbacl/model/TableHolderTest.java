package org.databene.jdbacl.model;

import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TableHolderTest</code> contains tests for the class <code>{@link TableHolder}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableHolderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private TableHolder fixture8;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBSchema("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBSchema("", new DBCatalog(""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new TableContainer("");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TableHolder
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public TableHolder getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new TableContainerSupport();
		}
		return fixture8;
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
		TableHolder fixture = getFixture1();
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
		TableHolder fixture = getFixture2();
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
		TableHolder fixture = getFixture3();
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
	public void testGetTable_fixture4_1()
		throws Exception {
		TableHolder fixture = getFixture4();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture5_1()
		throws Exception {
		TableHolder fixture = getFixture5();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture6_1()
		throws Exception {
		TableHolder fixture = getFixture6();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture7_1()
		throws Exception {
		TableHolder fixture = getFixture7();
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
	public void testGetTable_fixture8_1()
		throws Exception {
		TableHolder fixture = getFixture8();
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
		TableHolder fixture = getFixture2();
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
		TableHolder fixture = getFixture3();
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
	public void testGetTable_fixture4_2()
		throws Exception {
		TableHolder fixture = getFixture4();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture5_2()
		throws Exception {
		TableHolder fixture = getFixture5();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture6_2()
		throws Exception {
		TableHolder fixture = getFixture6();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture7_2()
		throws Exception {
		TableHolder fixture = getFixture7();
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
	public void testGetTable_fixture8_2()
		throws Exception {
		TableHolder fixture = getFixture8();
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
		TableHolder fixture = getFixture1();
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
		TableHolder fixture = getFixture1();

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
		TableHolder fixture = getFixture2();

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
		TableHolder fixture = getFixture3();

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
	public void testGetTables_fixture4_1()
		throws Exception {
		TableHolder fixture = getFixture4();

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
	public void testGetTables_fixture5_1()
		throws Exception {
		TableHolder fixture = getFixture5();

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
	public void testGetTables_fixture6_1()
		throws Exception {
		TableHolder fixture = getFixture6();

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
	public void testGetTables_fixture7_1()
		throws Exception {
		TableHolder fixture = getFixture7();

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
	public void testGetTables_fixture8_1()
		throws Exception {
		TableHolder fixture = getFixture8();

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
		TableHolder fixture = getFixture1();
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
		TableHolder fixture = getFixture2();
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
		TableHolder fixture = getFixture3();
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
	public void testGetTables_fixture4_2()
		throws Exception {
		TableHolder fixture = getFixture4();
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
	public void testGetTables_fixture5_2()
		throws Exception {
		TableHolder fixture = getFixture5();
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
	public void testGetTables_fixture6_2()
		throws Exception {
		TableHolder fixture = getFixture6();
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
	public void testGetTables_fixture7_2()
		throws Exception {
		TableHolder fixture = getFixture7();
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
	public void testGetTables_fixture8_2()
		throws Exception {
		TableHolder fixture = getFixture8();
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
		TableHolder fixture = getFixture2();
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
		TableHolder fixture = getFixture3();
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
	public void testGetTables_fixture4_3()
		throws Exception {
		TableHolder fixture = getFixture4();
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
	public void testGetTables_fixture5_3()
		throws Exception {
		TableHolder fixture = getFixture5();
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
	public void testGetTables_fixture6_3()
		throws Exception {
		TableHolder fixture = getFixture6();
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
	public void testGetTables_fixture7_3()
		throws Exception {
		TableHolder fixture = getFixture7();
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
	public void testGetTables_fixture8_3()
		throws Exception {
		TableHolder fixture = getFixture8();
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
		TableHolder fixture = getFixture1();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(TableHolderTest.class);
	}
}