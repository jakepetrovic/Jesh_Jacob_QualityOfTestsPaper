package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MultiColumnObjectTest</code> contains tests for the class <code>{@link MultiColumnObject}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MultiColumnObjectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private MultiColumnObject fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDBTable("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDBTable("", new DBSchema(""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDBTable();
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultiColumnObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public MultiColumnObject getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		}
		return fixture7;
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
		MultiColumnObject fixture = getFixture1();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
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
		MultiColumnObject fixture = getFixture2();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
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
		MultiColumnObject fixture = getFixture3();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture4_1()
		throws Exception {
		MultiColumnObject fixture = getFixture4();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumnNames_fixture5_1()
		throws Exception {
		MultiColumnObject fixture = getFixture5();

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
	public void testGetColumnNames_fixture6_1()
		throws Exception {
		MultiColumnObject fixture = getFixture6();

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
	public void testGetColumnNames_fixture7_1()
		throws Exception {
		MultiColumnObject fixture = getFixture7();

		String[] result = fixture.getColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumnNames(LazyTable.java:146)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(MultiColumnObjectTest.class);
	}
}