package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBObjectTest</code> contains tests for the class <code>{@link DBObject}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBObjectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBObject fixture21;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBCatalog("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DBCatalog();
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DBPackage("", new DBSchema(""));
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DBProcedure("", new DBPackage("", new DBSchema("")));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DBSchema("");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DBSchema("", new DBCatalog(""));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DBSequence("", "", "");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new DBSequence("0123456789", "0123456789", "0123456789");
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new DBTrigger("", new DBSchema(""));
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBObject
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBObject getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);
		}
		return fixture21;
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
		DBObject fixture = getFixture1();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
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
		DBObject fixture = getFixture2();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
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
		DBObject fixture = getFixture3();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture4_1()
		throws Exception {
		DBObject fixture = getFixture4();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture5_1()
		throws Exception {
		DBObject fixture = getFixture5();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture6_1()
		throws Exception {
		DBObject fixture = getFixture6();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture7_1()
		throws Exception {
		DBObject fixture = getFixture7();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture8_1()
		throws Exception {
		DBObject fixture = getFixture8();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture9_1()
		throws Exception {
		DBObject fixture = getFixture9();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture10_1()
		throws Exception {
		DBObject fixture = getFixture10();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture11_1()
		throws Exception {
		DBObject fixture = getFixture11();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture12_1()
		throws Exception {
		DBObject fixture = getFixture12();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture13_1()
		throws Exception {
		DBObject fixture = getFixture13();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture14_1()
		throws Exception {
		DBObject fixture = getFixture14();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture15_1()
		throws Exception {
		DBObject fixture = getFixture15();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture16_1()
		throws Exception {
		DBObject fixture = getFixture16();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture17_1()
		throws Exception {
		DBObject fixture = getFixture17();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture18_1()
		throws Exception {
		DBObject fixture = getFixture18();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture19_1()
		throws Exception {
		DBObject fixture = getFixture19();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture20_1()
		throws Exception {
		DBObject fixture = getFixture20();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDoc_fixture21_1()
		throws Exception {
		DBObject fixture = getFixture21();

		String result = fixture.getDoc();

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
		DBObject fixture = getFixture1();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("catalog", result);
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
		DBObject fixture = getFixture2();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("catalog", result);
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
		DBObject fixture = getFixture3();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("catalog", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture4_1()
		throws Exception {
		DBObject fixture = getFixture4();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("catalog", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture5_1()
		throws Exception {
		DBObject fixture = getFixture5();

		String result = fixture.getObjectType();

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
	public void testGetObjectType_fixture6_1()
		throws Exception {
		DBObject fixture = getFixture6();

		String result = fixture.getObjectType();

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
	public void testGetObjectType_fixture7_1()
		throws Exception {
		DBObject fixture = getFixture7();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("procedure", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture8_1()
		throws Exception {
		DBObject fixture = getFixture8();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("procedure", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture9_1()
		throws Exception {
		DBObject fixture = getFixture9();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("schema", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture10_1()
		throws Exception {
		DBObject fixture = getFixture10();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("schema", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture11_1()
		throws Exception {
		DBObject fixture = getFixture11();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("schema", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture12_1()
		throws Exception {
		DBObject fixture = getFixture12();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("sequence", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture13_1()
		throws Exception {
		DBObject fixture = getFixture13();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("sequence", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture14_1()
		throws Exception {
		DBObject fixture = getFixture14();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("sequence", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture15_1()
		throws Exception {
		DBObject fixture = getFixture15();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("sequence", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture16_1()
		throws Exception {
		DBObject fixture = getFixture16();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("trigger", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture17_1()
		throws Exception {
		DBObject fixture = getFixture17();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("trigger", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture18_1()
		throws Exception {
		DBObject fixture = getFixture18();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("column", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture19_1()
		throws Exception {
		DBObject fixture = getFixture19();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("column", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture20_1()
		throws Exception {
		DBObject fixture = getFixture20();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("column", result);
	}

	/**
	 * Run the String getObjectType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetObjectType_fixture21_1()
		throws Exception {
		DBObject fixture = getFixture21();

		String result = fixture.getObjectType();

		// add additional test code here
		assertEquals("column", result);
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
		DBObject fixture = getFixture1();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
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
		DBObject fixture = getFixture2();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
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
		DBObject fixture = getFixture3();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("database", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("0123456789", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture4_1()
		throws Exception {
		DBObject fixture = getFixture4();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture5_1()
		throws Exception {
		DBObject fixture = getFixture5();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture6_1()
		throws Exception {
		DBObject fixture = getFixture6();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture7_1()
		throws Exception {
		DBObject fixture = getFixture7();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture8_1()
		throws Exception {
		DBObject fixture = getFixture8();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("0123456789", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture9_1()
		throws Exception {
		DBObject fixture = getFixture9();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture10_1()
		throws Exception {
		DBObject fixture = getFixture10();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture11_1()
		throws Exception {
		DBObject fixture = getFixture11();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("catalog", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture12_1()
		throws Exception {
		DBObject fixture = getFixture12();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture13_1()
		throws Exception {
		DBObject fixture = getFixture13();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture14_1()
		throws Exception {
		DBObject fixture = getFixture14();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture15_1()
		throws Exception {
		DBObject fixture = getFixture15();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture16_1()
		throws Exception {
		DBObject fixture = getFixture16();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture17_1()
		throws Exception {
		DBObject fixture = getFixture17();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture18_1()
		throws Exception {
		DBObject fixture = getFixture18();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture19_1()
		throws Exception {
		DBObject fixture = getFixture19();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture20_1()
		throws Exception {
		DBObject fixture = getFixture20();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("", result.getName());
	}

	/**
	 * Run the CompositeDBObject<DBObject> getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetOwner_fixture21_1()
		throws Exception {
		DBObject fixture = getFixture21();

		CompositeDBObject<DBObject> result = (CompositeDBObject<DBObject>) fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("table", result.getObjectType());
		assertEquals(null, result.getDoc());
		assertEquals("0123456789", result.getName());
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
		DBObject fixture = getFixture1();
		DBObject other = new DBCatalog("");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
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
		DBObject fixture = getFixture2();
		DBObject other = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
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
		DBObject fixture = getFixture3();
		DBObject other = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture4_1()
		throws Exception {
		DBObject fixture = getFixture4();
		DBObject other = new DBCatalog();

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture5_1()
		throws Exception {
		DBObject fixture = getFixture5();
		DBObject other = new DBPackage("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBPackage.isIdentical(DBPackage.java:120)
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
	public void testIsIdentical_fixture6_1()
		throws Exception {
		DBObject fixture = getFixture6();
		DBObject other = new DBPackage("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBPackage.isIdentical(DBPackage.java:120)
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
	public void testIsIdentical_fixture7_1()
		throws Exception {
		DBObject fixture = getFixture7();
		DBObject other = new DBProcedure("", new DBPackage("", new DBSchema("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBProcedure.isIdentical(DBProcedure.java:73)
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
	public void testIsIdentical_fixture8_1()
		throws Exception {
		DBObject fixture = getFixture8();
		DBObject other = new DBProcedure("0123456789", new DBPackage("0123456789", new DBSchema("", new DBCatalog(""))));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBProcedure.isIdentical(DBProcedure.java:73)
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
	public void testIsIdentical_fixture9_1()
		throws Exception {
		DBObject fixture = getFixture9();
		DBObject other = new DBSchema("");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture10_1()
		throws Exception {
		DBObject fixture = getFixture10();
		DBObject other = new DBSchema("", new DBCatalog(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture11_1()
		throws Exception {
		DBObject fixture = getFixture11();
		DBObject other = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture12_1()
		throws Exception {
		DBObject fixture = getFixture12();
		DBObject other = new DBSequence("", "", "");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture13_1()
		throws Exception {
		DBObject fixture = getFixture13();
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
	public void testIsIdentical_fixture14_1()
		throws Exception {
		DBObject fixture = getFixture14();
		DBObject other = new DBSequence("0123456789", "0123456789", "0123456789");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture15_1()
		throws Exception {
		DBObject fixture = getFixture15();
		DBObject other = new DBSequence("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture16_1()
		throws Exception {
		DBObject fixture = getFixture16();
		DBObject other = new DBSequence("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture17_1()
		throws Exception {
		DBObject fixture = getFixture17();
		DBObject other = new DBTrigger("", new DBSchema(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBTrigger.isIdentical(DBTrigger.java:167)
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
	public void testIsIdentical_fixture18_1()
		throws Exception {
		DBObject fixture = getFixture18();
		DBObject other = new DBTrigger("0123456789", new DBSchema("", new DBCatalog("")));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture19_1()
		throws Exception {
		DBObject fixture = getFixture19();
		DBObject other = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
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
	public void testIsIdentical_fixture20_1()
		throws Exception {
		DBObject fixture = getFixture20();
		DBObject other = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
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
	public void testIsIdentical_fixture21_1()
		throws Exception {
		DBObject fixture = getFixture21();
		DBObject other = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
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
		DBObject fixture = getFixture1();
		DBObject other = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
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
		DBObject fixture = getFixture2();
		DBObject other = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
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
		DBObject fixture = getFixture3();
		DBObject other = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture4_2()
		throws Exception {
		DBObject fixture = getFixture4();
		DBObject other = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture5_2()
		throws Exception {
		DBObject fixture = getFixture5();
		DBObject other = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIdentical(DBObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsIdentical_fixture6_2()
		throws Exception {
		DBObject fixture = getFixture6();
		DBObject other = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
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
	public void testIsIdentical_fixture7_2()
		throws Exception {
		DBObject fixture = getFixture7();
		DBObject other = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
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
	public void testIsIdentical_fixture8_2()
		throws Exception {
		DBObject fixture = getFixture8();
		DBObject other = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

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
	public void testIsIdentical_fixture9_2()
		throws Exception {
		DBObject fixture = getFixture9();
		DBObject other = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		boolean result = fixture.isIdentical(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
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
		DBObject fixture = getFixture1();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
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
		DBObject fixture = getFixture2();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
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
		DBObject fixture = getFixture3();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture4_1()
		throws Exception {
		DBObject fixture = getFixture4();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture5_1()
		throws Exception {
		DBObject fixture = getFixture5();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture6_1()
		throws Exception {
		DBObject fixture = getFixture6();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture7_1()
		throws Exception {
		DBObject fixture = getFixture7();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture8_1()
		throws Exception {
		DBObject fixture = getFixture8();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture9_1()
		throws Exception {
		DBObject fixture = getFixture9();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture10_1()
		throws Exception {
		DBObject fixture = getFixture10();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture11_1()
		throws Exception {
		DBObject fixture = getFixture11();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture12_1()
		throws Exception {
		DBObject fixture = getFixture12();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture13_1()
		throws Exception {
		DBObject fixture = getFixture13();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture14_1()
		throws Exception {
		DBObject fixture = getFixture14();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture15_1()
		throws Exception {
		DBObject fixture = getFixture15();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture16_1()
		throws Exception {
		DBObject fixture = getFixture16();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture17_1()
		throws Exception {
		DBObject fixture = getFixture17();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture18_1()
		throws Exception {
		DBObject fixture = getFixture18();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture19_1()
		throws Exception {
		DBObject fixture = getFixture19();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture20_1()
		throws Exception {
		DBObject fixture = getFixture20();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(CompositeDBObject<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetOwner_fixture21_1()
		throws Exception {
		DBObject fixture = getFixture21();
		CompositeDBObject<DBObject> owner = null;

		fixture.setOwner(owner);

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
		new org.junit.runner.JUnitCore().run(DBObjectTest.class);
	}
}