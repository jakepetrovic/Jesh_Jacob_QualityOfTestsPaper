package org.databene.jdbacl.model;

import java.util.List;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBColumnTest</code> contains tests for the class <code>{@link DBColumn}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBColumnTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBColumn fixture8;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), DBDataType.getInstance(0, ""));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), DBDataType.getInstance(0, ""), new Integer(0));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), DBDataType.getInstance(0, ""), new Integer(0), new Integer(0));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), DBDataType.getInstance(1, "0123456789"));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), DBDataType.getInstance(1, "0123456789"), new Integer(1));
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), DBDataType.getInstance(1, "0123456789"), new Integer(1), new Integer(1));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DefaultDBColumn((String) null, new DefaultDBTable(), (DBDataType) null, new Integer(Integer.MAX_VALUE));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBColumn
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBColumn getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DefaultDBColumn((String) null, new DefaultDBTable(), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));
		}
		return fixture8;
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture3_3()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture4_3()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture5_3()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture6_3()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture7_3()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture8_3()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture1_3()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture2_3()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUkConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture4_4()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture5_4()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture6_4()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture7_4()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture8_4()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the void addUkConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUkConstraint_fixture1_4()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBUniqueConstraint constraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUkConstraint(constraint);

		// add additional test code here
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDefaultValue_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getFractionDigits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFractionDigits_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		Integer result = fixture.getFractionDigits();

		// add additional test code here
		assertNotNull(result);
		assertEquals("2147483647", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(Integer.MAX_VALUE, result.intValue());
		assertEquals(2147483647L, result.longValue());
		assertEquals(2.14748365E9f, result.floatValue(), 1.0f);
		assertEquals(2.147483647E9, result.doubleValue(), 1.0);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBNotNullConstraint getNotNullConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetNotNullConstraint_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		DBNotNullConstraint result = fixture.getNotNullConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		Integer result = fixture.getSize();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		Integer result = fixture.getSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		Integer result = fixture.getSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		Integer result = fixture.getSize();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		Integer result = fixture.getSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		Integer result = fixture.getSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		Integer result = fixture.getSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("2147483647", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(Integer.MAX_VALUE, result.intValue());
		assertEquals(2147483647L, result.longValue());
		assertEquals(2.14748365E9f, result.floatValue(), 1.0f);
		assertEquals(2.147483647E9, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSize_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		Integer result = fixture.getSize();

		// add additional test code here
		assertNotNull(result);
		assertEquals("2147483647", result.toString());
		assertEquals((byte) -1, result.byteValue());
		assertEquals((short) -1, result.shortValue());
		assertEquals(Integer.MAX_VALUE, result.intValue());
		assertEquals(2147483647L, result.longValue());
		assertEquals(2.14748365E9f, result.floatValue(), 1.0f);
		assertEquals(2.147483647E9, result.doubleValue(), 1.0);
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(0, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(0, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(0, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(1, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(1, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isAlpha());
		assertEquals(false, result.isNumber());
		assertEquals(false, result.isLOB());
		assertEquals(1, result.getJdbcType());
		assertEquals(false, result.isTemporal());
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBDataType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetType_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		DBDataType result = fixture.getType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBUniqueConstraint> getUkConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUkConstraints_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		List<DBUniqueConstraint> result = fixture.getUkConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNullable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsNullable_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		boolean result = fixture.isNullable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsUnique_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		boolean result = fixture.isUnique();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVersionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsVersionColumn_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();

		boolean result = fixture.isVersionColumn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDefaultValue_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		String defaultValue = "0123456789";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture3_3()
		throws Exception {
		DBColumn fixture = getFixture3();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture4_3()
		throws Exception {
		DBColumn fixture = getFixture4();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture5_3()
		throws Exception {
		DBColumn fixture = getFixture5();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture6_3()
		throws Exception {
		DBColumn fixture = getFixture6();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture7_3()
		throws Exception {
		DBColumn fixture = getFixture7();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture8_3()
		throws Exception {
		DBColumn fixture = getFixture8();
		Integer fractionDigits = new Integer(-1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture1_3()
		throws Exception {
		DBColumn fixture = getFixture1();
		Integer fractionDigits = new Integer(0);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setFractionDigits(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFractionDigits_fixture2_3()
		throws Exception {
		DBColumn fixture = getFixture2();
		Integer fractionDigits = new Integer(1);

		fixture.setFractionDigits(fractionDigits);

		// add additional test code here
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture3_3()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture4_3()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture5_3()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture6_3()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture7_3()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture8_3()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture1_3()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, "An��t-1.0.txt");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column 'An��t-1.0.txt' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture2_3()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, (String) null);

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture4_4()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture5_4()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture6_4()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture7_4()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture8_4()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable(""), "", false, "");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNotNullConstraint(DBNotNullConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNotNullConstraint_fixture1_4()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBNotNullConstraint constraint = new DBNotNullConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, "0123456789");

		fixture.setNotNullConstraint(constraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:49)
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: column name is not supposed to be null
		//       at org.databene.commons.Assert.notNull(Assert.java:61)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:46)
		//       at org.databene.jdbacl.model.DefaultDBColumn.setNullable(DefaultDBColumn.java:156)
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		boolean nullable = false;

		fixture.setNullable(nullable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: column name is not supposed to be null
		//       at org.databene.commons.Assert.notNull(Assert.java:61)
		//       at org.databene.jdbacl.model.DBNotNullConstraint.<init>(DBNotNullConstraint.java:46)
		//       at org.databene.jdbacl.model.DefaultDBColumn.setNullable(DefaultDBColumn.java:156)
	}

	/**
	 * Run the void setNullable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetNullable_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		boolean nullable = true;

		fixture.setNullable(nullable);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture3_3()
		throws Exception {
		DBColumn fixture = getFixture3();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture4_3()
		throws Exception {
		DBColumn fixture = getFixture4();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture5_3()
		throws Exception {
		DBColumn fixture = getFixture5();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture6_3()
		throws Exception {
		DBColumn fixture = getFixture6();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture7_3()
		throws Exception {
		DBColumn fixture = getFixture7();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture8_3()
		throws Exception {
		DBColumn fixture = getFixture8();
		Integer size = new Integer(-1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture1_3()
		throws Exception {
		DBColumn fixture = getFixture1();
		Integer size = new Integer(0);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetSize_fixture2_3()
		throws Exception {
		DBColumn fixture = getFixture2();
		Integer size = new Integer(1);

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture3_3()
		throws Exception {
		DBColumn fixture = getFixture3();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture4_3()
		throws Exception {
		DBColumn fixture = getFixture4();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture5_3()
		throws Exception {
		DBColumn fixture = getFixture5();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture6_3()
		throws Exception {
		DBColumn fixture = getFixture6();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture7_3()
		throws Exception {
		DBColumn fixture = getFixture7();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture8_3()
		throws Exception {
		DBColumn fixture = getFixture8();
		DBDataType type = DBDataType.getInstance("");

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture1_3()
		throws Exception {
		DBColumn fixture = getFixture1();
		DBDataType type = DBDataType.getInstance(0, "");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(DBDataType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetType_fixture2_3()
		throws Exception {
		DBColumn fixture = getFixture2();
		DBDataType type = DBDataType.getInstance(1, "0123456789");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture1_1()
		throws Exception {
		DBColumn fixture = getFixture1();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture2_1()
		throws Exception {
		DBColumn fixture = getFixture2();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture3_1()
		throws Exception {
		DBColumn fixture = getFixture3();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture4_1()
		throws Exception {
		DBColumn fixture = getFixture4();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture5_1()
		throws Exception {
		DBColumn fixture = getFixture5();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture6_1()
		throws Exception {
		DBColumn fixture = getFixture6();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture7_1()
		throws Exception {
		DBColumn fixture = getFixture7();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture8_1()
		throws Exception {
		DBColumn fixture = getFixture8();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture2_2()
		throws Exception {
		DBColumn fixture = getFixture2();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture3_2()
		throws Exception {
		DBColumn fixture = getFixture3();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture4_2()
		throws Exception {
		DBColumn fixture = getFixture4();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture5_2()
		throws Exception {
		DBColumn fixture = getFixture5();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture6_2()
		throws Exception {
		DBColumn fixture = getFixture6();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture7_2()
		throws Exception {
		DBColumn fixture = getFixture7();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture8_2()
		throws Exception {
		DBColumn fixture = getFixture8();
		boolean versionColumn = false;

		fixture.setVersionColumn(versionColumn);

		// add additional test code here
	}

	/**
	 * Run the void setVersionColumn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetVersionColumn_fixture1_2()
		throws Exception {
		DBColumn fixture = getFixture1();
		boolean versionColumn = true;

		fixture.setVersionColumn(versionColumn);

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
		new org.junit.runner.JUnitCore().run(DBColumnTest.class);
	}
}