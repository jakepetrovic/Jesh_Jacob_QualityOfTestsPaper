package org.databene.jdbacl.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.apache.derby.impl.jdbc.EmbedConnection;
import org.apache.derby.impl.jdbc.EmbedConnection30;
import org.apache.derby.impl.jdbc.EmbedConnection40;
import org.apache.derby.jdbc.Driver169;
import org.apache.derby.jdbc.Driver30;
import org.apache.derby.jdbc.Driver40;
import org.apache.derby.jdbc.InternalDriver;
import org.databene.commons.HeavyweightIterator;
import org.databene.commons.iterator.TableRowIterator;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.jdbc.LazyTable;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBConnection;
import org.h2.engine.Session;
import org.h2.engine.SessionInterface;
import org.h2.engine.SessionRemote;
import org.h2.jdbc.JdbcConnection;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBTableTest</code> contains tests for the class <code>{@link DBTable}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBTableTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBTable fixture7;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDBTable("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDBTable("", new DBSchema(""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultDBTable();
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBTable
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBTable getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);
		}
		return fixture7;
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		DBCheckConstraint checkConstraint = new DBCheckConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), "An��t-1.0.txt");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL at line 1, column 2 of An��t-1.0.txt
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:118)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, "", "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", false, new DefaultDBTable(""), "");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    Error parsing SQL in 
		//       at org.databene.jdbacl.sql.SQLParserUtil.mapToParseException(SQLParserUtil.java:478)
		//       at org.databene.jdbacl.sql.SQLParserUtil.parseExpression(SQLParserUtil.java:122)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, new DefaultDBTable(), (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:51)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture3_5()
		throws Exception {
		DBTable fixture = getFixture3();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("", true, (String) null, (String) null);

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
		//       at org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream.<init>(ANTLRNoCaseStringStream.java:40)
		//       at org.databene.jdbacl.model.DBCheckConstraint.<init>(DBCheckConstraint.java:59)
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, "0123456789", "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addCheckConstraint(DBCheckConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCheckConstraint_fixture5_5()
		throws Exception {
		DBTable fixture = getFixture5();
		DBCheckConstraint checkConstraint = new DBCheckConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), "0123456789");

		fixture.addCheckConstraint(checkConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addCheckConstraint(LazyTable.java:178)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0), new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addColumn(LazyTable.java:158)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("An��t-1.0.txt", new DefaultDBTable(), DBDataType.getInstance(""), new Integer(1), new Integer(1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		DBColumn column = new DefaultDBColumn((String) null, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), (DBDataType) null, new Integer(Integer.MAX_VALUE), new Integer(Integer.MAX_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		DBColumn column = new DefaultDBColumn("", new DefaultDBTable(""), DBDataType.getInstance(""), new Integer(-1), new Integer(-1));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		DBColumn column = new DefaultDBColumn("", new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), DBDataType.getInstance(""), new Integer(Integer.MIN_VALUE), new Integer(Integer.MIN_VALUE));

		fixture.addColumn(column);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DBDataType.jdbcTypeFor(DBDataType.java:160)
		//       at org.databene.jdbacl.model.DBDataType.getInstance(DBDataType.java:122)
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture3_5()
		throws Exception {
		DBTable fixture = getFixture3();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null);

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addColumn(DBColumn) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddColumn_fixture4_5()
		throws Exception {
		DBTable fixture = getFixture4();
		DBColumn column = new DefaultDBColumn("0123456789", new DefaultDBTable("", new DBSchema("")), (DBDataType) null, new Integer(0));

		fixture.addColumn(column);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

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
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

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
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

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
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

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
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture6_4()
		throws Exception {
		DBTable fixture = getFixture6();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("0123456789", true, new DefaultDBTable("", new DBSchema("")), new String[] {""}, new DefaultDBTable("", new DBSchema("")), new String[] {""});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("An��t-1.0.txt", false, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null}, new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, false, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"}, new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), new String[] {"0123456789"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint((String) null, true, new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt"), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789"), new String[] {null});

		fixture.addForeignKey(dbForeignKeyConstraint);

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
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture5_5()
		throws Exception {
		DBTable fixture = getFixture5();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", false, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null}, new DefaultDBTable(""), new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addForeignKey(DBForeignKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddForeignKey_fixture6_5()
		throws Exception {
		DBTable fixture = getFixture6();
		DBForeignKeyConstraint dbForeignKeyConstraint = new DBForeignKeyConstraint("", true, new DefaultDBTable(), new String[] {"An��t-1.0.txt"}, new DefaultDBTable(), new String[] {"An��t-1.0.txt"});

		fixture.addForeignKey(dbForeignKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addForeignKey(LazyTable.java:105)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.addIndex(DefaultDBTable.java:191)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
	}

	/**
	 * Run the void addIndex(DBIndex) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddIndex_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBIndex dbIndex = null;

		fixture.addIndex(dbIndex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addIndex(LazyTable.java:109)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", ""), new DBSchema("0123456789", new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")))), "An��t-1.0.txt", "An��t-1.0.txt");

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		DBTable table = new LazyTable(new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789"), (DBSchema) null, (String) null, (String) null);

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		DBTable table = new DefaultDBTable("");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		DBTable table = new DefaultDBTable("", new DBSchema(""));

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		DBTable table = new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog("")));

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture3_5()
		throws Exception {
		DBTable fixture = getFixture3();
		DBTable table = new DefaultDBTable();

		fixture.addReferrer(table);

		// add additional test code here
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		DBTable table = new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", "");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addReferrer(DBTable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddReferrer_fixture5_5()
		throws Exception {
		DBTable fixture = getFixture5();
		DBTable table = new LazyTable(new JDBCDBImporter("", "", "", "", "", ""), new DBSchema("", new DBCatalog("")), "0123456789", "0123456789");

		fixture.addReferrer(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addReferrer(LazyTable.java:214)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture6_4()
		throws Exception {
		DBTable fixture = getFixture6();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.addUniqueConstraint(LazyTable.java:101)
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
	}

	/**
	 * Run the void addUniqueConstraint(DBUniqueConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddUniqueConstraint_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		DBUniqueConstraint uniqueConstraint = new DBUniqueConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.addUniqueConstraint(uniqueConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.allRows(LazyTable.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.allRows(DefaultDBTable.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAllRows_fixture3_5()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator allRows(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testAllRows_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.allRows(connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getCatalog(DefaultDBTable.java:111)
		assertNotNull(result);
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals("", result.toString());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		DBCatalog result = fixture.getCatalog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCheckConstraints(LazyTable.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCheckConstraints(LazyTable.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBCheckConstraint> getCheckConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCheckConstraints_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		List<DBCheckConstraint> result = fixture.getCheckConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCheckConstraints(LazyTable.java:174)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table 'null'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table 'null'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String columnName = "";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumn(LazyTable.java:150)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn getColumn(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumn_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String columnName = "0123456789";

		DBColumn result = fixture.getColumn(columnName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBColumn> getColumns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		List<DBColumn> result = fixture.getColumns();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table 'null'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table 'null'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table 'null'
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture6_4()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getColumns(LazyTable.java:162)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {""};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the DBColumn[] getColumns(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetColumns_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};

		DBColumn[] result = fixture.getColumns(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Column '0123456789' not found in table ''
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumn(DefaultDBTable.java:170)
		//       at org.databene.jdbacl.model.DefaultDBTable.getColumns(DefaultDBTable.java:158)
		assertNotNull(result);
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
		DBTable fixture = getFixture1();

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
		DBTable fixture = getFixture2();

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
		DBTable fixture = getFixture3();

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
		DBTable fixture = getFixture4();

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
		DBTable fixture = getFixture5();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals("0123456789", result);
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
		DBTable fixture = getFixture6();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
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
		DBTable fixture = getFixture7();

		String result = fixture.getDoc();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (, 0123456789, An��t-1.0.txt, )
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns ()
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table 'null' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (, 0123456789, An��t-1.0.txt, )
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns ()
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table 'null' has no foreign key with the columns ()
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789' has no foreign key with the columns (, 0123456789, An��t-1.0.txt, )
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table 'null' has no foreign key with the columns (, 0123456789, An��t-1.0.txt, )
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraint(LazyTable.java:170)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {""};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns ()
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the DBForeignKeyConstraint getForeignKeyConstraint(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraint_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};

		DBForeignKeyConstraint result = fixture.getForeignKeyConstraint(columnNames);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '' has no foreign key with the columns (0123456789)
		//       at org.databene.jdbacl.model.DefaultDBTable.getForeignKeyConstraint(DefaultDBTable.java:247)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraints(LazyTable.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraints(LazyTable.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBForeignKeyConstraint> getForeignKeyConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetForeignKeyConstraints_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		Set<DBForeignKeyConstraint> result = fixture.getForeignKeyConstraints();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getForeignKeyConstraints(LazyTable.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String indexName = "";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndex(LazyTable.java:182)
		assertNotNull(result);
	}

	/**
	 * Run the DBIndex getIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndex_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String indexName = "0123456789";

		DBIndex result = fixture.getIndex(indexName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndexes(LazyTable.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndexes(LazyTable.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBIndex> getIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetIndexes_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		List<DBIndex> result = fixture.getIndexes();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getIndexes(LazyTable.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetName_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPKColumnNames(LazyTable.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPKColumnNames(LazyTable.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPKColumnNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPKColumnNames_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		String[] result = fixture.getPKColumnNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPKColumnNames(LazyTable.java:190)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPrimaryKeyConstraint(LazyTable.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPrimaryKeyConstraint(LazyTable.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the DBPrimaryKeyConstraint getPrimaryKeyConstraint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPrimaryKeyConstraint_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		DBPrimaryKeyConstraint result = fixture.getPrimaryKeyConstraint();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getPrimaryKeyConstraint(LazyTable.java:194)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getReferrers(LazyTable.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getReferrers(LazyTable.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the Collection<DBTable> getReferrers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetReferrers_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		Collection<DBTable> result = fixture.getReferrers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getReferrers(LazyTable.java:210)
		assertNotNull(result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:385)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:385)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new FBConnection((FBManagedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new JdbcConnection("", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new JdbcConnection(new Session(), "", "");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRowCount(LazyTable.java:198)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.createStatement(Unknown Source)
		//       at org.databene.jdbacl.DBUtil.queryScalar(DBUtil.java:385)
		//       at org.databene.jdbacl.DBUtil.queryLong(DBUtil.java:380)
		//       at org.databene.jdbacl.DBUtil.countRows(DBUtil.java:343)
		//       at org.databene.jdbacl.model.DefaultDBTable.getRowCount(DefaultDBTable.java:297)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getRowCount(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetRowCount_fixture3_5()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new FBConnection((FBManagedConnection) null);

		long result = fixture.getRowCount(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertEquals(0L, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getCatalog());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.toString());
		assertEquals("schema", result.getObjectType());
		assertEquals(null, result.getDoc());
	}

	/**
	 * Run the DBSchema getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();

		DBSchema result = fixture.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String name = "";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraint(LazyTable.java:206)
		assertNotNull(result);
	}

	/**
	 * Run the DBUniqueConstraint getUniqueConstraint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraint_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String name = "0123456789";

		DBUniqueConstraint result = fixture.getUniqueConstraint(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.getUniqueConstraint(DefaultDBTable.java:218)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		boolean includePK = false;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getUniqueConstraints(LazyTable.java:202)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DBUniqueConstraint> getUniqueConstraints(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUniqueConstraints_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		boolean includePK = true;

		Set<DBUniqueConstraint> result = fixture.getUniqueConstraints(includePK);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:329)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String query = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String query = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String query = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String query = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String query = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String query = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String query = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		String query = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		String query = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		String query = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		String query = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.query(LazyTable.java:122)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		String query = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:329)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		String query = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.ArrayResultSetIterator.<init>(ArrayResultSetIterator.java:39)
		//       at org.databene.jdbacl.model.DefaultDBTable.query(DefaultDBTable.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		String query = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		String query = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		String query = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture5_5()
		throws Exception {
		DBTable fixture = getFixture5();
		String query = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		String query = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		String query = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the TableRowIterator query(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQuery_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		String query = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		TableRowIterator result = fixture.query(query, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:301)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:301)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		Object pk = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		Object pk = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		Object pk = new Object();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		Object pk = null;
		Connection connection = new JdbcConnection("", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		Object pk = new Object();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		Object pk = null;
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		Object pk = new Object();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		Object pk = new Object();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryByPK(LazyTable.java:126)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		Object pk = new Object();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:301)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		Object pk = null;
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.DefaultDBTable.queryByPK(DefaultDBTable.java:301)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		Object pk = new Object();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		Object pk = null;
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		Object pk = null;
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		Object pk = new Object();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		Object pk = null;
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryByPK_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		Object pk = new Object();
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow queryByPK(Object,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryByPK_fixture5_5()
		throws Exception {
		DBTable fixture = getFixture5();
		Object pk = null;
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRow result = fixture.queryByPK(pk, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new FBConnection((FBManagedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new JdbcConnection("", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new JdbcConnection(new Session(), "", "");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new JdbcConnection((JdbcConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.sql.SQLException: Invalid argument in JDBC call
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.Util.sqlException(Unknown Source)
		//       at org.hsqldb.jdbc.jdbcConnection.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryPKs(LazyTable.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.QueryIterator.createSource(QueryIterator.java:46)
		//       at org.databene.jdbacl.QueryIterator.<init>(QueryIterator.java:41)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryPKs(DefaultDBTable.java:323)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the HeavyweightIterator<Object> queryPKs(Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryPKs_fixture3_5()
		throws Exception {
		DBTable fixture = getFixture3();
		Connection connection = new FBConnection((FBManagedConnection) null);

		HeavyweightIterator<Object> result = fixture.queryPKs(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String whereClause = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String whereClause = "";
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		String whereClause = "";
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		String whereClause = "";
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRows(LazyTable.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		String whereClause = "";
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		String whereClause = "0123456789";
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRows(DefaultDBTable.java:293)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		String whereClause = "";
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture2_5()
		throws Exception {
		DBTable fixture = getFixture2();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		String whereClause = "";
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		String whereClause = "0123456789";
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRows_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		String whereClause = "";
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRows(String,Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryRows_fixture5_5()
		throws Exception {
		DBTable fixture = getFixture5();
		String whereClause = "0123456789";
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.queryRows(whereClause, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at org.databene.jdbacl.SQLUtil.renderWhereClause(SQLUtil.java:212)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:315)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.statementHoldabilityCheck(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection30.createStatement(Unknown Source)
		//       at org.databene.jdbacl.model.DBRowIterator.<init>(DBRowIterator.java:59)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:316)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value  for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection("0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.h2.message.DbException: Invalid value "0123456789" for parameter "url" [90008-136]
		//       at org.h2.message.DbException.get(DbException.java:167)
		//       at org.h2.message.DbException.getInvalidValueException(DbException.java:213)
		//       at org.h2.engine.ConnectionInfo.<init>(ConnectionInfo.java:64)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new Session(), "", "");

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.Session.getTrace(Session.java:695)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection(new SessionRemote(), "0123456789", "0123456789");

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.engine.SessionRemote.getTrace(SessionRemote.java:498)
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((JdbcConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new JdbcConnection((SessionInterface) null, "An��t-1.0.txt", "An��t-1.0.txt");

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.h2.jdbc.JdbcConnection.<init>(JdbcConnection.java:146)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection((org.hsqldb.Session) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at org.databene.jdbacl.SQLUtil.renderWhereClause(SQLUtil.java:212)
		//       at org.databene.jdbacl.model.DefaultDBTable.queryRowsByCellValues(DefaultDBTable.java:315)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection30((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new BrokeredConnection40((BrokeredConnectionControl) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.queryRowsByCellValues(LazyTable.java:219)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties()));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_4()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver169(), "", new Properties());

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver30(), "0123456789", new Properties((Properties) null));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40(new Driver40(), "An��t-1.0.txt", (Properties) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture6_5()
		throws Exception {
		DBTable fixture = getFixture6();
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new EmbedConnection40((EmbedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.impl.jdbc.EmbedConnection.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection30.<init>(Unknown Source)
		//       at org.apache.derby.impl.jdbc.EmbedConnection40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testQueryRowsByCellValues_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		String[] columnNames = new String[] {"0123456789"};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new FBConnection((FBManagedConnection) null);

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.firebirdsql.jdbc.AbstractConnection.<init>(AbstractConnection.java:75)
		//       at org.firebirdsql.jdbc.FBConnection.<init>(FBConnection.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the DBRowIterator queryRowsByCellValues(String[],Object[],Connection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testQueryRowsByCellValues_fixture1_5()
		throws Exception {
		DBTable fixture = getFixture1();
		String[] columnNames = new String[] {""};
		Object[] values = new Object[] {new Object(), null};
		Connection connection = new jdbcConnection(new HsqlProperties(""));

		DBRowIterator result = fixture.queryRowsByCellValues(columnNames, values, connection);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_1()
		throws Exception {
		DBTable fixture = getFixture1();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_1()
		throws Exception {
		DBTable fixture = getFixture2();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_1()
		throws Exception {
		DBTable fixture = getFixture3();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture4_1()
		throws Exception {
		DBTable fixture = getFixture4();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture5_1()
		throws Exception {
		DBTable fixture = getFixture5();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture6_1()
		throws Exception {
		DBTable fixture = getFixture6();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture7_1()
		throws Exception {
		DBTable fixture = getFixture7();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_2()
		throws Exception {
		DBTable fixture = getFixture2();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_2()
		throws Exception {
		DBTable fixture = getFixture3();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture4_2()
		throws Exception {
		DBTable fixture = getFixture4();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture5_2()
		throws Exception {
		DBTable fixture = getFixture5();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture6_2()
		throws Exception {
		DBTable fixture = getFixture6();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture7_2()
		throws Exception {
		DBTable fixture = getFixture7();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_2()
		throws Exception {
		DBTable fixture = getFixture1();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_3()
		throws Exception {
		DBTable fixture = getFixture3();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture4_3()
		throws Exception {
		DBTable fixture = getFixture4();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture5_3()
		throws Exception {
		DBTable fixture = getFixture5();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture6_3()
		throws Exception {
		DBTable fixture = getFixture6();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture7_3()
		throws Exception {
		DBTable fixture = getFixture7();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_3()
		throws Exception {
		DBTable fixture = getFixture1();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_3()
		throws Exception {
		DBTable fixture = getFixture2();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture4_4()
		throws Exception {
		DBTable fixture = getFixture4();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture5_4()
		throws Exception {
		DBTable fixture = getFixture5();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture6_4()
		throws Exception {
		DBTable fixture = getFixture6();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importColumns(JDBCDBImporter.java:430)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTableDetails(JDBCDBImporter.java:389)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importTable(JDBCDBImporter.java:384)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture7_4()
		throws Exception {
		DBTable fixture = getFixture7();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable(""), "", false, new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getCatalog(LazyTable.java:130)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.getRealTable(LazyTable.java:256)
		//       at org.databene.jdbacl.model.jdbc.LazyTable.setPrimaryKey(LazyTable.java:97)
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture1_4()
		throws Exception {
		DBTable fixture = getFixture1();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("", new DBSchema("")), "0123456789", true, new String[] {""});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture2_4()
		throws Exception {
		DBTable fixture = getFixture2();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new DefaultDBTable("0123456789", new DBSchema("", new DBCatalog(""))), (String) null, false, new String[] {"0123456789"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
	}

	/**
	 * Run the void setPrimaryKey(DBPrimaryKeyConstraint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetPrimaryKey_fixture3_4()
		throws Exception {
		DBTable fixture = getFixture3();
		DBPrimaryKeyConstraint dbPrimaryKeyConstraint = new DBPrimaryKeyConstraint(new LazyTable(new JDBCDBImporter(""), new DBSchema(""), "", ""), "", true, new String[] {"An��t-1.0.txt"});

		fixture.setPrimaryKey(dbPrimaryKeyConstraint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
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
		new org.junit.runner.JUnitCore().run(DBTableTest.class);
	}
}