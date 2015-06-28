package org.databene.jdbacl.model;

import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBSchemaTest</code> contains tests for the class <code>{@link DBSchema}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBSchemaTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBSchema fixture12;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture1()
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
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBSchema("");
			fixture2.addTable(new DefaultDBTable(""));
			fixture2.addTable(new DefaultDBTable(""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBSchema("");
			fixture3.addTable(new DefaultDBTable(""));
			fixture3.addTable(new DefaultDBTable("", new DBSchema("")));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DBSchema("");
			fixture4.addTable(new DefaultDBTable(""));
			fixture4.addTable(new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null)));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DBSchema("", (DBCatalog) null);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DBSchema("", (DBCatalog) null);
			fixture6.addTable(new DefaultDBTable(""));
			fixture6.addTable(new DefaultDBTable(""));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DBSchema("", (DBCatalog) null);
			fixture7.addTable(new DefaultDBTable(""));
			fixture7.addTable(new DefaultDBTable("", new DBSchema("")));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DBSchema("", (DBCatalog) null);
			fixture8.addTable(new DefaultDBTable(""));
			fixture8.addTable(new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null)));
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DBSchema("0123456789", new DBCatalog(""));
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DBSchema("0123456789", new DBCatalog(""));
			fixture10.addTable(new DefaultDBTable(""));
			fixture10.addTable(new DefaultDBTable(""));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DBSchema("0123456789", new DBCatalog(""));
			fixture11.addTable(new DefaultDBTable(""));
			fixture11.addTable(new DefaultDBTable("", new DBSchema("")));
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBSchema
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBSchema getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DBSchema("0123456789", new DBCatalog(""));
			fixture12.addTable(new DefaultDBTable(""));
			fixture12.addTable(new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null)));
		}
		return fixture12;
	}

	/**
	 * Run the DBSchema(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBSchema_1()
		throws Exception {
		String name = "";

		DBSchema result = new DBSchema(name);

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
	 * Run the DBSchema(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBSchema_2()
		throws Exception {
		String name = "0123456789";

		DBSchema result = new DBSchema(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("0123456789", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBSchema_3()
		throws Exception {
		String name = "1";

		DBSchema result = new DBSchema(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("1", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema(String,DBCatalog) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBSchema_4()
		throws Exception {
		String name = "";
		DBCatalog catalog = null;

		DBSchema result = new DBSchema(name, catalog);

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
	 * Run the DBSchema(String,DBCatalog) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBSchema_5()
		throws Exception {
		String name = "0123456789";
		DBCatalog catalog = null;

		DBSchema result = new DBSchema(name, catalog);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("0123456789", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBPackage pkg = new DBPackage("", new DBSchema(""));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addPackage(DBPackage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddPackage_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBPackage pkg = new DBPackage("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addPackage(pkg);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBSequence sequence = new DBSequence("", "", "");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBSequence sequence = new DBSequence("", new DBSchema(""));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBSequence sequence = new DBSequence("", "", "");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBSequence sequence = new DBSequence("", new DBSchema(""));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBSequence sequence = new DBSequence("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBSequence sequence = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture3_3()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBSequence sequence = new DBSequence("", "", "");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture4_3()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBSequence sequence = new DBSequence("", new DBSchema(""));

		fixture.addSequence(sequence);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSequence.setOwner(DBSequence.java:65)
		//       at org.databene.jdbacl.model.AbstractDBObject.<init>(AbstractDBObject.java:52)
		//       at org.databene.jdbacl.model.DBSequence.<init>(DBSequence.java:50)
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture5_3()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture6_3()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture7_3()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addSequence(DBSequence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddSequence_fixture8_3()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBSequence sequence = new DBSequence("0123456789", "0123456789", "0123456789");

		fixture.addSequence(sequence);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTable table = new DefaultDBTable();

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", (DBCatalog) null), "0123456789", "0123456789");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBTable table = new DefaultDBTable("");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBTable table = new DefaultDBTable();

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", (DBCatalog) null), "0123456789", "0123456789");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture3_3()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture4_3()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture5_3()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture6_3()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBTable table = new DefaultDBTable();

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture7_3()
		throws Exception {
		DBSchema fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTable_fixture8_3()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", (DBCatalog) null), "0123456789", "0123456789");

		fixture.addTable(table);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBTrigger trigger = new DBTrigger("", new DBSchema(""));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the void addTrigger(DBTrigger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddTrigger_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBTrigger trigger = new DBTrigger("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.addTrigger(trigger);

		// add additional test code here
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCatalog_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBObject> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetComponents_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		List<DBObject> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		Database result = fixture.getDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBSchema.getDatabase(DBSchema.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetDatabase_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetName_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetPackages_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetSequences_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		boolean recursive = true;

		List<DBSequence> result = fixture.getSequences(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getCatalog());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getCatalog());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		String tableName = "0123456789";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getCatalog());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getCatalog());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getCatalog());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getCatalog());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		String tableName = "";

		DBTable result = fixture.getTable(tableName);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals("", result.getName());
		assertEquals(null, result.getPrimaryKeyConstraint());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getOwner());
		assertEquals("table", result.getObjectType());
		assertEquals(0, result.countProviders());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTable_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture2_3()
		throws Exception {
		DBSchema fixture = getFixture2();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture3_3()
		throws Exception {
		DBSchema fixture = getFixture3();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture4_3()
		throws Exception {
		DBSchema fixture = getFixture4();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture5_3()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture6_3()
		throws Exception {
		DBSchema fixture = getFixture6();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture7_3()
		throws Exception {
		DBSchema fixture = getFixture7();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture8_3()
		throws Exception {
		DBSchema fixture = getFixture8();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture9_3()
		throws Exception {
		DBSchema fixture = getFixture9();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture10_3()
		throws Exception {
		DBSchema fixture = getFixture10();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture11_3()
		throws Exception {
		DBSchema fixture = getFixture11();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture12_3()
		throws Exception {
		DBSchema fixture = getFixture12();
		boolean recursive = false;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the List<DBTable> getTables(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTables_fixture1_3()
		throws Exception {
		DBSchema fixture = getFixture1();
		boolean recursive = true;

		List<DBTable> result = fixture.getTables(recursive);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetTriggers_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTable table = new DefaultDBTable();

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", (DBCatalog) null), "0123456789", "0123456789");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBTable table = new DefaultDBTable("");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBTable table = new DefaultDBTable();

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", (DBCatalog) null), "0123456789", "0123456789");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("")), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture3_3()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture4_3()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture5_3()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", (DBCatalog) null));

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture6_3()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBTable table = new DefaultDBTable();

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture7_3()
		throws Exception {
		DBSchema fixture = getFixture7();
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testRemoveTable_fixture8_3()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", (DBCatalog) null), "0123456789", "0123456789");

		fixture.removeTable(table);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture1_1()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("");

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture2_1()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture3_1()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture4_1()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture5_1()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture6_1()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture7_1()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture8_1()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture9_1()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture10_1()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture11_1()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture12_1()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture2_2()
		throws Exception {
		DBSchema fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("");

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture3_2()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture4_2()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture5_2()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture6_2()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture7_2()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture8_2()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture9_2()
		throws Exception {
		DBSchema fixture = getFixture9();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture10_2()
		throws Exception {
		DBSchema fixture = getFixture10();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture11_2()
		throws Exception {
		DBSchema fixture = getFixture11();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture12_2()
		throws Exception {
		DBSchema fixture = getFixture12();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture1_2()
		throws Exception {
		DBSchema fixture = getFixture1();
		DBCatalog catalog = new DBCatalog();

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture3_3()
		throws Exception {
		DBSchema fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("");

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture4_3()
		throws Exception {
		DBSchema fixture = getFixture4();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture5_3()
		throws Exception {
		DBSchema fixture = getFixture5();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture6_3()
		throws Exception {
		DBSchema fixture = getFixture6();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture7_3()
		throws Exception {
		DBSchema fixture = getFixture7();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testSetCatalog_fixture8_3()
		throws Exception {
		DBSchema fixture = getFixture8();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.setCatalog(catalog);

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
		new org.junit.runner.JUnitCore().run(DBSchemaTest.class);
	}
}