package org.databene.jdbacl.model;

import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultDBColumnTest</code> contains tests for the class <code>{@link DefaultDBColumn}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultDBColumnTest {
	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_1()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_2()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_3()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_4()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable();
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_5()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_6()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_7()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_8()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_9()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_10()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_11()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable();
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_12()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_13()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_14()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_15()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_16()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_17()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_18()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable();
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_19()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_20()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_21()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_22()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_23()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable("");
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_24()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		DBDataType type = DBDataType.getInstance("");

		DefaultDBColumn result = new DefaultDBColumn(name, table, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_25()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("");
		int jdbcType = 0;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(" : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_26()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		int jdbcType = 1;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789 : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_27()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		int jdbcType = 7;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("1", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_28()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_29()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_30()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_31()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_32()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("");
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("1", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_33()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		int jdbcType = 7;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(" : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_34()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable();
		int jdbcType = 0;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789 : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_35()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		int jdbcType = 1;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_36()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		int jdbcType = 1;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_37()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		int jdbcType = 1;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_38()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		int jdbcType = 1;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_39()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable("");
		int jdbcType = 1;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789 : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_40()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("", new DBSchema(""));
		int jdbcType = 7;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("1", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_41()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable();
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(" : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_42()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		int jdbcType = 1;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_43()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		int jdbcType = 1;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_44()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		int jdbcType = 1;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_45()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		int jdbcType = 1;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_46()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("");
		int jdbcType = 1;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(" : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_47()
		throws Exception {
		String name = "0123456789";
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		int jdbcType = 0;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789 : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_48()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable();
		int jdbcType = 1;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("1", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_49()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		int jdbcType = 7;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_50()
		throws Exception {
		String name = "0123456789";
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		int jdbcType = 7;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_51()
		throws Exception {
		String name = "1";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		int jdbcType = 7;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_52()
		throws Exception {
		String name = "";
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		int jdbcType = 7;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:75)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:69)
		//       at org.databene.jdbacl.model.DefaultDBColumn.<init>(DefaultDBColumn.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_53()
		throws Exception {
		String name = "1";
		DBTable table = new DefaultDBTable("");
		int jdbcType = 7;
		String typeAndSize = "";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1 : ", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("1", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,int,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_54()
		throws Exception {
		String name = "";
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		int jdbcType = 0;
		String typeAndSize = "0123456789";

		DefaultDBColumn result = new DefaultDBColumn(name, table, jdbcType, typeAndSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(" : 0123456789", result.toString());
		assertEquals(null, result.getDefaultValue());
		assertEquals(null, result.getSize());
		assertEquals(true, result.isNullable());
		assertEquals(null, result.getForeignKeyConstraint());
		assertEquals(null, result.getFractionDigits());
		assertEquals(false, result.isVersionColumn());
		assertEquals(false, result.isUnique());
		assertEquals(null, result.getNotNullConstraint());
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("column", result.getObjectType());
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_55()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_56()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_57()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_58()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_59()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_60()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_61()
		throws Exception {
		String name = "1";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_62()
		throws Exception {
		String name = "1";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_63()
		throws Exception {
		String name = "1";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_64()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);
		Integer fractionDigits = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_65()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);
		Integer fractionDigits = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_66()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);
		Integer fractionDigits = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_67()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);
		Integer fractionDigits = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_68()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);
		Integer fractionDigits = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_69()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);
		Integer fractionDigits = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_70()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);
		Integer fractionDigits = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_71()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);
		Integer fractionDigits = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_72()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);
		Integer fractionDigits = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_73()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);
		Integer fractionDigits = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_74()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);
		Integer fractionDigits = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_75()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);
		Integer fractionDigits = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_76()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);
		Integer fractionDigits = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_77()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);
		Integer fractionDigits = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_78()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);
		Integer fractionDigits = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_79()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(1);
		Integer fractionDigits = new Integer(-1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_80()
		throws Exception {
		String name = "0123456789";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(-1);
		Integer fractionDigits = new Integer(0);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the DefaultDBColumn(String,DBTable,DBDataType,Integer,Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDefaultDBColumn_81()
		throws Exception {
		String name = "";
		DBTable table = null;
		DBDataType type = DBDataType.getInstance("");
		Integer size = new Integer(0);
		Integer fractionDigits = new Integer(1);

		DefaultDBColumn result = new DefaultDBColumn(name, table, type, size, fractionDigits);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DefaultDBColumnTest.class);
	}
}