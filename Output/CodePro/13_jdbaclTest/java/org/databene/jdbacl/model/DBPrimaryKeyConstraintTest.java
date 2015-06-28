package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBPrimaryKeyConstraintTest</code> contains tests for the class <code>{@link DBPrimaryKeyConstraint}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBPrimaryKeyConstraintTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBPrimaryKeyConstraint
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBPrimaryKeyConstraint fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBPrimaryKeyConstraint
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBPrimaryKeyConstraint fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBPrimaryKeyConstraint
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBPrimaryKeyConstraint fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBPrimaryKeyConstraint
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBPrimaryKeyConstraint getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBPrimaryKeyConstraint
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBPrimaryKeyConstraint getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBPrimaryKeyConstraint
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBPrimaryKeyConstraint getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});
		}
		return fixture3;
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_1()
		throws Exception {
		DBTable table = new DefaultDBTable("");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_2()
		throws Exception {
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_3()
		throws Exception {
		DBTable table = new DefaultDBTable();
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_4()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_5()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_6()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_7()
		throws Exception {
		DBTable table = new DefaultDBTable("");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_8()
		throws Exception {
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_9()
		throws Exception {
		DBTable table = new DefaultDBTable();
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_10()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_11()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_12()
		throws Exception {
		DBTable table = new DefaultDBTable("");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_13()
		throws Exception {
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_14()
		throws Exception {
		DBTable table = new DefaultDBTable();
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_15()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_16()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_17()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_18()
		throws Exception {
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_19()
		throws Exception {
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_20()
		throws Exception {
		DBTable table = new DefaultDBTable();
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_21()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_22()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_23()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_24()
		throws Exception {
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_25()
		throws Exception {
		DBTable table = new DefaultDBTable();
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_26()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_27()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_28()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
		//       at org.databene.jdbacl.model.DBPrimaryKeyConstraint.<init>(DBPrimaryKeyConstraint.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_29()
		throws Exception {
		DBTable table = new DefaultDBTable("");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBPrimaryKeyConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBPrimaryKeyConstraint_30()
		throws Exception {
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBPrimaryKeyConstraint result = new DBPrimaryKeyConstraint(table, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  PRIMARY KEY ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
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
		DBPrimaryKeyConstraint fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("CONSTRAINT  PRIMARY KEY (, 0123456789, An��t-1.0.txt, )", result);
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
		DBPrimaryKeyConstraint fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("CONSTRAINT 0123456789 PRIMARY KEY ()", result);
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
		DBPrimaryKeyConstraint fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("PRIMARY KEY (0123456789)", result);
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
		new org.junit.runner.JUnitCore().run(DBPrimaryKeyConstraintTest.class);
	}
}