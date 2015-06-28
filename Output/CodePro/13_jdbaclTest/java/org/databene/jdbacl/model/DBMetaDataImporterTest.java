package org.databene.jdbacl.model;

import java.sql.Connection;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.databene.commons.ConnectFailedException;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.cache.CachingDBImporter;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBMetaDataImporterTest</code> contains tests for the class <code>{@link DBMetaDataImporter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBMetaDataImporterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private DBMetaDataImporter fixture11;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new CachingDBImporter((DBMetaDataImporter) null, "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new CachingDBImporter((DBMetaDataImporter) null, "0123456789");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new JDBCDBImporter("", "", "", "", "", "");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new JDBCDBImporter(new BrokeredConnection30((BrokeredConnectionControl) null), "", "");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new JDBCDBImporter(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", "0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new JDBCDBImporter(new JDBCConnectData("", "", "", ""));
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBMetaDataImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public DBMetaDataImporter getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
		}
		return fixture11;
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportDatabase_fixture1_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture1();

		Database result = fixture.importDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importDatabase(CachingDBImporter.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportDatabase_fixture2_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture2();

		Database result = fixture.importDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importDatabase(CachingDBImporter.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportDatabase_fixture8_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture8();

		Database result = fixture.importDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getMetaData(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importDatabase(JDBCDBImporter.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportDatabase_fixture9_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture9();

		Database result = fixture.importDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getRealConnection(Unknown Source)
		//       at org.apache.derby.iapi.jdbc.BrokeredConnection.getMetaData(Unknown Source)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.importDatabase(JDBCDBImporter.java:227)
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture3_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture3();

		Database result = fixture.importDatabase();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture4_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture4();

		Database result = fixture.importDatabase();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture5_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture5();

		Database result = fixture.importDatabase();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture6_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture6();

		Database result = fixture.importDatabase();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture7_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture7();

		Database result = fixture.importDatabase();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture10_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture10();

		Database result = fixture.importDatabase();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test(expected = org.databene.commons.ConnectFailedException.class)
	public void testImportDatabase_fixture11_1()
		throws Exception {
		DBMetaDataImporter fixture = getFixture11();

		Database result = fixture.importDatabase();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DBMetaDataImporterTest.class);
	}
}