package org.databene.jdbacl.model;

import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBForeignKeyConstraintTest</code> contains tests for the class <code>{@link DBForeignKeyConstraint}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBForeignKeyConstraintTest {
	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_1()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("");
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new DefaultDBTable("");
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_2()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new DefaultDBTable("", new DBSchema(""));
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY () REFERENCES ()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_3()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY (0123456789) REFERENCES 0123456789(0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_4()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new DefaultDBTable();
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_5()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_6()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

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
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_7()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("");
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES An��t-1.0.txt(0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_8()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY () REFERENCES null(0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_9()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable();
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new DefaultDBTable("", new DBSchema(""));
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES (, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_10()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_11()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new DefaultDBTable();
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

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
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_12()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_13()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("");
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY () REFERENCES 0123456789()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_14()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (0123456789) REFERENCES An��t-1.0.txt()", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_15()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable();
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES null()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_16()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new DefaultDBTable("");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_17()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

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
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_18()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new DefaultDBTable();
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_19()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("");
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_20()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES 0123456789(, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_21()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable();
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY () REFERENCES An��t-1.0.txt(, 0123456789, An��t-1.0.txt, )", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_22()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String[] refereeColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_23()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new DefaultDBTable("");
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

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
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_24()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new DefaultDBTable("", new DBSchema(""));
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
		//       at org.databene.jdbacl.model.DBForeignKeyConstraint.<init>(DBForeignKeyConstraint.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_25()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("", new DBSchema(""));
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES 0123456789(0123456789)", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_26()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = true;
		DBTable owner = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new DefaultDBTable();
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT 0123456789 FOREIGN KEY () REFERENCES null(0123456789)", result.toString());
		assertEquals(true, result.isNameDeterministic());
		assertEquals("0123456789", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_27()
		throws Exception {
		String name = "0123456789";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable();
		String[] fkColumnNames = new String[] {"0123456789"};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_28()
		throws Exception {
		String name = "";
		boolean nameDeterministic = true;
		DBTable owner = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

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
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_29()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] fkColumnNames = new String[] {""};
		DBTable refereeTable = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		String[] refereeColumnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

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
	 * Run the DBForeignKeyConstraint(String,boolean,DBTable,String[],DBTable,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testDBForeignKeyConstraint_30()
		throws Exception {
		String name = "";
		boolean nameDeterministic = false;
		DBTable owner = new DefaultDBTable("");
		String[] fkColumnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		DBTable refereeTable = new DefaultDBTable("");
		String[] refereeColumnNames = new String[] {""};

		DBForeignKeyConstraint result = new DBForeignKeyConstraint(name, nameDeterministic, owner, fkColumnNames, refereeTable, refereeColumnNames);

		// add additional test code here
		assertNotNull(result);
		assertEquals("CONSTRAINT  FOREIGN KEY (, 0123456789, An��t-1.0.txt, ) REFERENCES ()", result.toString());
		assertEquals(false, result.isNameDeterministic());
		assertEquals("", result.getName());
		assertEquals("foreign key constraint", result.getObjectType());
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
		new org.junit.runner.JUnitCore().run(DBForeignKeyConstraintTest.class);
	}
}