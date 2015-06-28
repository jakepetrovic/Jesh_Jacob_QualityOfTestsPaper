package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBNonUniqueIndexTest</code> contains tests for the class <code>{@link DBNonUniqueIndex}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBNonUniqueIndexTest {
	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_1()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new DefaultDBTable("");
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_2()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 ()", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_3()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 (0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_4()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable();
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" (0123456789)", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_5()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_6()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_7()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_8()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_9()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_10()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" ()", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_11()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable();
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 ()", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_12()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_13()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_14()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_15()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_16()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable("");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 (0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_17()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_18()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable();
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_19()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_20()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_21()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_22()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_23()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable("");
		String columnName1 = "";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" ()", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_24()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals(" (0123456789)", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_25()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 (0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_26()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable table = new DefaultDBTable();
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 (0123456789)", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_27()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_28()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_29()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String columnName1 = "0123456789";

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
		//       at org.databene.jdbacl.model.DBIndex.<init>(DBIndex.java:53)
		//       at org.databene.jdbacl.model.DBNonUniqueIndex.<init>(DBNonUniqueIndex.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the DBNonUniqueIndex(String,boolean,DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBNonUniqueIndex_30()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable table = new DefaultDBTable("");
		String columnName1 = "";
		String columnName2 = "0123456789";
		String columnName3 = "An��t-1.0.txt";
		String columnName4 = null;

		DBNonUniqueIndex result = new DBNonUniqueIndex(name, nameDeterministic, table, columnName1, columnName2, columnName3, columnName4);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isUnique());
		assertEquals("0123456789 (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals("0123456789", result.getName());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("index", result.getObjectType());
		assertEquals(null, result.getDoc());
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
		new org.junit.runner.JUnitCore().run(DBNonUniqueIndexTest.class);
	}
}