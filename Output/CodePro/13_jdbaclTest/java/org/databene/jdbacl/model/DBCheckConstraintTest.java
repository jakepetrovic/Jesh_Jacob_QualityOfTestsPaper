package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBCheckConstraintTest</code> contains tests for the class <code>{@link DBCheckConstraint}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBCheckConstraintTest {
	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_1()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		String tableName = "";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_2()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		String tableName = "0123456789";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 0123456789", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_3()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		String tableName = "0123456789";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_4()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		String tableName = "";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 0123456789", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_5()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		String tableName = "";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_6()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		String tableName = "0123456789";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 0123456789", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_7()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		String tableName = "0123456789";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_8()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		String tableName = "";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 0123456789", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_9()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		String tableName = "";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_10()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		String tableName = "0123456789";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 0123456789", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_11()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		String tableName = "0123456789";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_12()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		String tableName = "";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 0123456789", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_13()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		String tableName = "";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_14()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		String tableName = "0123456789";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 0123456789", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_15()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		String tableName = "0123456789";
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_16()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		String tableName = "";
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, tableName, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 0123456789", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(null, result.getTable());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals(null, result.getOwner());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_17()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("");
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_18()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 0123456789", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_19()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 1", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("1", result.getConditionText());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_20()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable();
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 1", result.toString());
		assertEquals(null, result.getTableName());
		assertEquals("1", result.getConditionText());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_21()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_22()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_23()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_24()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_25()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_26()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 1CHECK 0123456789", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("1", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_27()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable();
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 0123456789", result.toString());
		assertEquals(null, result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_28()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_29()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_30()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_31()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_32()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 1CHECK 1", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("1", result.getConditionText());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("1", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_33()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_34()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable();
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_35()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_36()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_37()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_38()
		throws Exception {
		String name = "1";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_39()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("");
		String conditionText = "0123456789";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 0123456789", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("0123456789", result.getConditionText());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_40()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 1", result.toString());
		assertEquals("", result.getTableName());
		assertEquals("1", result.getConditionText());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_41()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789CHECK 1", result.toString());
		assertEquals("0123456789", result.getTableName());
		assertEquals("1", result.getConditionText());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_42()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable();
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT CHECK 1", result.toString());
		assertEquals(null, result.getTableName());
		assertEquals("1", result.getConditionText());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("check constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_43()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_44()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_45()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String conditionText = "1";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the DBCheckConstraint(String,boolean,DBTable,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCheckConstraint_46()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("");
		String conditionText = "";

		DBCheckConstraint result = new DBCheckConstraint(name, nameDeterministic, owner, conditionText);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
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
		new org.junit.runner.JUnitCore().run(DBCheckConstraintTest.class);
	}
}