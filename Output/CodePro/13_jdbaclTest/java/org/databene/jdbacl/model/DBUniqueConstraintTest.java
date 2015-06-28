package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBUniqueConstraintTest</code> contains tests for the class <code>{@link DBUniqueConstraint}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBUniqueConstraintTest {
	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_1()
		throws Exception {
		DBTable owner = new DefaultDBTable("");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_2()
		throws Exception {
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_3()
		throws Exception {
		DBTable owner = new DefaultDBTable();
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE (0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_4()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_5()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_6()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_7()
		throws Exception {
		DBTable owner = new DefaultDBTable("");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_8()
		throws Exception {
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_9()
		throws Exception {
		DBTable owner = new DefaultDBTable();
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_10()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_11()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_12()
		throws Exception {
		DBTable owner = new DefaultDBTable("");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_13()
		throws Exception {
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_14()
		throws Exception {
		DBTable owner = new DefaultDBTable();
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_15()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_16()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_17()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_18()
		throws Exception {
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_19()
		throws Exception {
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_20()
		throws Exception {
		DBTable owner = new DefaultDBTable();
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE (0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_21()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_22()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "0123456789";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_23()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_24()
		throws Exception {
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String name = "0123456789";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 UNIQUE ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_25()
		throws Exception {
		DBTable owner = new DefaultDBTable();
		String name = "";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_26()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String name = "0123456789";
		boolean nameDeterministic = true;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_27()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_28()
		throws Exception {
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
		//       at org.databene.jdbacl.model.DBUniqueConstraint.<init>(DBUniqueConstraint.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_29()
		throws Exception {
		DBTable owner = new DefaultDBTable("");
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBUniqueConstraint(DBTable,String,boolean,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBUniqueConstraint_30()
		throws Exception {
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String name = "";
		boolean nameDeterministic = false;
		String columnName1 = "";

		DBUniqueConstraint result = new DBUniqueConstraint(owner, name, nameDeterministic, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  UNIQUE ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("unique constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
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
		new org.junit.runner.JUnitCore().run(DBUniqueConstraintTest.class);
	}
}