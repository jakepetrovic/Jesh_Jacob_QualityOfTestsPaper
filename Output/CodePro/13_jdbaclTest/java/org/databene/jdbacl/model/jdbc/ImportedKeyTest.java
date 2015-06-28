package org.databene.jdbacl.model.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.derby.catalog.AliasInfo;
import org.apache.derby.catalog.GetProcedureColumns;
import org.apache.derby.catalog.types.MethodAliasInfo;
import org.apache.derby.diag.ContainedRoles;
import org.apache.derby.diag.ErrorLogReader;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.diag.LockTable;
import org.apache.derby.diag.SpaceTable;
import org.apache.derby.diag.StatementCache;
import org.apache.derby.diag.StatementDuration;
import org.apache.derby.diag.TransactionTable;
import org.apache.derby.impl.jdbc.EmbedSQLException;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.h2.jdbc.JdbcSQLException;
import org.h2.tools.SimpleResultSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImportedKeyTest</code> contains tests for the class <code>{@link ImportedKey}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ImportedKeyTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private ImportedKey fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private ImportedKey fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private ImportedKey fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private ImportedKey fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public ImportedKey getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ImportedKey();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public ImportedKey getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ImportedKey();
			fixture2.addForeignKeyColumn("", "");
			fixture2.addForeignKeyColumn("", "");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public ImportedKey getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new ImportedKey();
			fixture3.addForeignKeyColumn("", "");
			fixture3.addForeignKeyColumn("0123456789", "0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ImportedKey
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public ImportedKey getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new ImportedKey();
			fixture4.addForeignKeyColumn("", "");
			fixture4.addForeignKeyColumn("An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture1_1()
		throws Exception {
		ImportedKey fixture = getFixture1();
		String foreignKeyColumnName = "";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture2_1()
		throws Exception {
		ImportedKey fixture = getFixture2();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture4_1()
		throws Exception {
		ImportedKey fixture = getFixture4();
		String foreignKeyColumnName = "";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture1_2()
		throws Exception {
		ImportedKey fixture = getFixture1();
		String foreignKeyColumnName = "";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture3_1()
		throws Exception {
		ImportedKey fixture = getFixture3();
		String foreignKeyColumnName = "";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture4_2()
		throws Exception {
		ImportedKey fixture = getFixture4();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture1_3()
		throws Exception {
		ImportedKey fixture = getFixture1();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture3_2()
		throws Exception {
		ImportedKey fixture = getFixture3();
		String foreignKeyColumnName = "";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture4_3()
		throws Exception {
		ImportedKey fixture = getFixture4();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture1_4()
		throws Exception {
		ImportedKey fixture = getFixture1();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture3_3()
		throws Exception {
		ImportedKey fixture = getFixture3();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture2_2()
		throws Exception {
		ImportedKey fixture = getFixture2();
		String foreignKeyColumnName = "";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture3_4()
		throws Exception {
		ImportedKey fixture = getFixture3();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture2_3()
		throws Exception {
		ImportedKey fixture = getFixture2();
		String foreignKeyColumnName = "";
		String targetColumnName = "0123456789";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture4_4()
		throws Exception {
		ImportedKey fixture = getFixture4();
		String foreignKeyColumnName = "";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKeyColumn(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKeyColumn_fixture2_4()
		throws Exception {
		ImportedKey fixture = getFixture2();
		String foreignKeyColumnName = "0123456789";
		String targetColumnName = "";

		fixture.addForeignKeyColumn(foreignKeyColumnName, targetColumnName);

		// add additional test code here
	}

	/**
	 * Run the List<String> getForeignKeyColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyColumnNames_fixture1_1()
		throws Exception {
		ImportedKey fixture = getFixture1();

		List<String> result = fixture.getForeignKeyColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getForeignKeyColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyColumnNames_fixture2_1()
		throws Exception {
		ImportedKey fixture = getFixture2();

		List<String> result = fixture.getForeignKeyColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> getForeignKeyColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyColumnNames_fixture3_1()
		throws Exception {
		ImportedKey fixture = getFixture3();

		List<String> result = fixture.getForeignKeyColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> getForeignKeyColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyColumnNames_fixture4_1()
		throws Exception {
		ImportedKey fixture = getFixture4();

		List<String> result = fixture.getForeignKeyColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("An��t-1.0.txt"));
	}

	/**
	 * Run the DBTable getPkTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPkTable_fixture1_1()
		throws Exception {
		ImportedKey fixture = getFixture1();

		DBTable result = fixture.getPkTable();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getPkTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPkTable_fixture2_1()
		throws Exception {
		ImportedKey fixture = getFixture2();

		DBTable result = fixture.getPkTable();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getPkTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPkTable_fixture3_1()
		throws Exception {
		ImportedKey fixture = getFixture3();

		DBTable result = fixture.getPkTable();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getPkTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPkTable_fixture4_1()
		throws Exception {
		ImportedKey fixture = getFixture4();

		DBTable result = fixture.getPkTable();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getRefereeColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRefereeColumnNames_fixture1_1()
		throws Exception {
		ImportedKey fixture = getFixture1();

		List<String> result = fixture.getRefereeColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getRefereeColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRefereeColumnNames_fixture2_1()
		throws Exception {
		ImportedKey fixture = getFixture2();

		List<String> result = fixture.getRefereeColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> getRefereeColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRefereeColumnNames_fixture3_1()
		throws Exception {
		ImportedKey fixture = getFixture3();

		List<String> result = fixture.getRefereeColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> getRefereeColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRefereeColumnNames_fixture4_1()
		throws Exception {
		ImportedKey fixture = getFixture4();

		List<String> result = fixture.getRefereeColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("An��t-1.0.txt"));
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_1()
		throws Exception {
		ResultSet resultSet = new GetProcedureColumns(new MethodAliasInfo(""), "");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_2()
		throws Exception {
		ResultSet resultSet = new ErrorLogReader();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.ErrorLogReader.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_3()
		throws Exception {
		ResultSet resultSet = new SpaceTable("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new DefaultDBTable();

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.SpaceTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_4()
		throws Exception {
		ResultSet resultSet = new SpaceTable("0123456789", "0123456789");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("", new DBCatalog(""));
		DBTable fkTable = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_5()
		throws Exception {
		ResultSet resultSet = new StatementDuration("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.StatementDuration.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_6()
		throws Exception {
		ResultSet resultSet = new GetProcedureColumns(new MethodAliasInfo(""), "");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("", new DBCatalog(""));
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_7()
		throws Exception {
		ResultSet resultSet = new LockTable();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.LockTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_8()
		throws Exception {
		ResultSet resultSet = new SpaceTable("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.SpaceTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_9()
		throws Exception {
		ResultSet resultSet = new SpaceTable("", "");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.SpaceTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_10()
		throws Exception {
		ResultSet resultSet = new SpaceTable("0123456789", "0123456789");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.SpaceTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_11()
		throws Exception {
		ResultSet resultSet = new StatementDuration("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.StatementDuration.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_12()
		throws Exception {
		ResultSet resultSet = new TransactionTable();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.TransactionTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_13()
		throws Exception {
		ResultSet resultSet = new GetProcedureColumns(new MethodAliasInfo(""), "");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new DefaultDBTable("", new DBSchema(""));

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_14()
		throws Exception {
		ResultSet resultSet = new ErrorLogReader();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable();

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.ErrorLogReader.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_15()
		throws Exception {
		ResultSet resultSet = new SpaceTable("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_16()
		throws Exception {
		ResultSet resultSet = new SpaceTable("0123456789", "0123456789");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("", new DBCatalog(""));
		DBTable fkTable = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.SpaceTable.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_17()
		throws Exception {
		ResultSet resultSet = new StatementDuration("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.StatementDuration.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_18()
		throws Exception {
		ResultSet resultSet = new GetProcedureColumns(new MethodAliasInfo(""), "");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_19()
		throws Exception {
		ResultSet resultSet = new GetProcedureColumns(new MethodAliasInfo(), "0123456789");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.apache.derby.catalog.types.MethodAliasInfo cannot be cast to org.apache.derby.catalog.types.RoutineAliasInfo
		//       at org.apache.derby.catalog.GetProcedureColumns.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_20()
		throws Exception {
		ResultSet resultSet = new ErrorLogReader("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.ErrorLogReader.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testParse_21()
		throws Exception {
		ResultSet resultSet = new ErrorLogReader();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.diag.ErrorLogReader.getString(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.ImportedKey.parse(ImportedKey.java:136)
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testParse_22()
		throws Exception {
		ResultSet resultSet = new ErrorMessages();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testParse_23()
		throws Exception {
		ResultSet resultSet = new StatementCache();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testParse_24()
		throws Exception {
		ResultSet resultSet = new ErrorMessages();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = org.apache.derby.impl.jdbc.EmbedSQLException.class)
	public void testParse_25()
		throws Exception {
		ResultSet resultSet = new ContainedRoles("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("", new DBCatalog(""));
		DBTable fkTable = new DefaultDBTable("", new DBSchema(""));

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = org.apache.derby.impl.jdbc.EmbedSQLException.class)
	public void testParse_26()
		throws Exception {
		ResultSet resultSet = new ContainedRoles("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = org.apache.derby.impl.jdbc.EmbedSQLException.class)
	public void testParse_27()
		throws Exception {
		ResultSet resultSet = new ContainedRoles("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("", new DBCatalog(""));
		DBTable fkTable = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = org.apache.derby.impl.jdbc.EmbedSQLException.class)
	public void testParse_28()
		throws Exception {
		ResultSet resultSet = new ContainedRoles("");
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf(""))));
		DBTable fkTable = new DefaultDBTable("");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = org.h2.jdbc.JdbcSQLException.class)
	public void testParse_29()
		throws Exception {
		ResultSet resultSet = new SimpleResultSet();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ImportedKey parse(ResultSet,DBCatalog,DBSchema,DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = org.h2.jdbc.JdbcSQLException.class)
	public void testParse_30()
		throws Exception {
		ResultSet resultSet = new SimpleResultSet();
		DBCatalog catalog = null;
		DBSchema schema = new DBSchema("");
		DBTable fkTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		ImportedKey result = ImportedKey.parse(resultSet, catalog, schema, fkTable);

		// add additional test code here
		assertNotNull(result);
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
		ImportedKey fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("null.null.null.null -> null.null.null.null", result);
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
		ImportedKey fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("null.null.null.null -> null.null.null.null", result);
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
		ImportedKey fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("null.null.null.null -> null.null.null.null", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		ImportedKey fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("null.null.null.null -> null.null.null.null", result);
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
		new org.junit.runner.JUnitCore().run(ImportedKeyTest.class);
	}
}