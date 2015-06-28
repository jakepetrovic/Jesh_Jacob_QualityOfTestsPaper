package org.databene.jdbacl.model;

import java.util.Map;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBRowTest</code> contains tests for the class <code>{@link DBRow}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBRowTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBRow
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBRow fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBRow
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBRow getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DBRow(new DefaultDBTable(""));
		}
		return fixture;
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_1()
		throws Exception {
		DBTable table = new DefaultDBTable("");

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[]", result.toString());
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_2()
		throws Exception {
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[]", result.toString());
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_3()
		throws Exception {
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789[]", result.toString());
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_4()
		throws Exception {
		DBTable table = new DefaultDBTable();

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null[]", result.toString());
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_5()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		DBRow result = new DBRow(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_6()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789[]", result.toString());
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_7()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("An��t-1.0.txt[]", result.toString());
	}

	/**
	 * Run the DBRow(DBTable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBRow_8()
		throws Exception {
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		DBRow result = new DBRow(table);

		// add additional test code here
		assertNotNull(result);
		assertEquals("null[]", result.toString());
	}

	/**
	 * Run the Object getCellValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCellValue_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		String columnName = "";

		Object result = fixture2.getCellValue(columnName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getCellValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCellValue_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		String columnName = "0123456789";

		Object result = fixture2.getCellValue(columnName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, Object> getCells() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCells_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();

		Map<String, Object> result = fixture2.getCells();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Object[] getFKComponents(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKComponents_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		Object[] result = fixture2.getFKComponents(fk);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals(null, result[0]);
		assertEquals(null, result[1]);
		assertEquals(null, result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the Object[] getFKComponents(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKComponents_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		Object[] result = fixture2.getFKComponents(fk);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the Object[] getFKComponents(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKComponents_fixture_3()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		Object[] result = fixture2.getFKComponents(fk);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the Object[] getFKComponents(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKComponents_fixture_4()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		Object[] result = fixture2.getFKComponents(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getFKComponents(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKComponents_fixture_5()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		Object[] result = fixture2.getFKComponents(fk);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the Object[] getFKComponents(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKComponents_fixture_6()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		Object[] result = fixture2.getFKComponents(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the Object getFKValue(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKValue_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		Object result = fixture2.getFKValue(fk);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFKValue(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKValue_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		Object result = fixture2.getFKValue(fk);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getFKValue(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKValue_fixture_3()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		Object result = fixture2.getFKValue(fk);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getFKValue(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKValue_fixture_4()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		Object result = fixture2.getFKValue(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the Object getFKValue(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKValue_fixture_5()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		Object result = fixture2.getFKValue(fk);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getFKValue(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetFKValue_fixture_6()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fk = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		Object result = fixture2.getFKValue(fk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the Object getPKValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKValue_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();

		Object result = fixture2.getPKValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getPKValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKValues_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();

		Object[] result = fixture2.getPKValues();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the DBTable getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();

		DBTable result = fixture2.getTable();

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
	 * Run the void setCellValue(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValue_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		String columnName = "";
		Object value = new Object();

		fixture2.setCellValue(columnName, value);

		// add additional test code here
	}

	/**
	 * Run the void setCellValue(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValue_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		String columnName = "0123456789";
		Object value = null;

		fixture2.setCellValue(columnName, value);

		// add additional test code here
	}

	/**
	 * Run the void setCellValue(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValue_fixture_3()
		throws Exception {
		DBRow fixture2 = getFixture();
		String columnName = "0123456789";
		Object value = new Object();

		fixture2.setCellValue(columnName, value);

		// add additional test code here
	}

	/**
	 * Run the void setCellValue(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValue_fixture_4()
		throws Exception {
		DBRow fixture2 = getFixture();
		String columnName = "";
		Object value = null;

		fixture2.setCellValue(columnName, value);

		// add additional test code here
	}

	/**
	 * Run the void setCellValues(String[],Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValues_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] cellValues = new Object[] {new Object(), null};

		fixture2.setCellValues(columnNames, cellValues);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: mismatch of column and value counts
		//       at org.databene.commons.Assert.equals(Assert.java:82)
		//       at org.databene.jdbacl.model.DBRow.setCellValues(DBRow.java:91)
	}

	/**
	 * Run the void setCellValues(String[],Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValues_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		String[] columnNames = new String[] {""};
		Object[] cellValues = new Object[] {new Object(), null};

		fixture2.setCellValues(columnNames, cellValues);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: mismatch of column and value counts
		//       at org.databene.commons.Assert.equals(Assert.java:82)
		//       at org.databene.jdbacl.model.DBRow.setCellValues(DBRow.java:91)
	}

	/**
	 * Run the void setCellValues(String[],Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetCellValues_fixture_3()
		throws Exception {
		DBRow fixture2 = getFixture();
		String[] columnNames = new String[] {"0123456789"};
		Object[] cellValues = new Object[] {new Object(), null};

		fixture2.setCellValues(columnNames, cellValues);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: mismatch of column and value counts
		//       at org.databene.commons.Assert.equals(Assert.java:82)
		//       at org.databene.jdbacl.model.DBRow.setCellValues(DBRow.java:91)
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Object fkValue = new Object();

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to [Ljava.lang.Object;
		//       at org.databene.jdbacl.model.DBRow.setFKValue(DBRow.java:81)
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});
		Object fkValue = null;

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_3()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});
		Object fkValue = null;

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_4()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});
		Object fkValue = null;

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_5()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});
		Object fkValue = null;

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_6()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});
		Object fkValue = null;

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_7()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});
		Object fkValue = new Object();

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_8()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});
		Object fkValue = new Object();

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_9()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});
		Object fkValue = new Object();

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_10()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});
		Object fkValue = new Object();

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_11()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});
		Object fkValue = new Object();

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
	}

	/**
	 * Run the void setFKValue(DBForeignKeyConstraint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetFKValue_fixture_12()
		throws Exception {
		DBRow fixture2 = getFixture();
		DBForeignKeyConstraint fkConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});
		Object fkValue = null;

		fixture2.setFKValue(fkConstraint, fkValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBRow.setCellValues(DBRow.java:91)
		//       at org.databene.jdbacl.model.DBRow.setFKValue(DBRow.java:82)
	}

	/**
	 * Run the void setPKValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPKValue_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();
		Object newPK = new Object();

		fixture2.setPKValue(newPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to [Ljava.lang.Object;
		//       at org.databene.jdbacl.model.DBRow.setPKValue(DBRow.java:121)
	}

	/**
	 * Run the void setPKValue(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPKValue_fixture_2()
		throws Exception {
		DBRow fixture2 = getFixture();
		Object newPK = null;

		fixture2.setPKValue(newPK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBRow.setCellValues(DBRow.java:91)
		//       at org.databene.jdbacl.model.DBRow.setPKValue(DBRow.java:121)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		DBRow fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("[]", result);
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
		new org.junit.runner.JUnitCore().run(DBRowTest.class);
	}
}