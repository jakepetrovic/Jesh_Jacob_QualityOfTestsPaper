package org.databene.jdbacl.model;

import java.util.Date;
import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DatabaseTest</code> contains tests for the class <code>{@link Database}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DatabaseTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Database
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private Database fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Database
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private Database fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Database
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private Database fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Database
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public Database getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultDatabase("", "", VersionNumber.valueOf(""));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Database
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public Database getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Database
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public Database getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);
		}
		return fixture3;
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("");

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture1_2()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture3_2()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("");

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture1_3()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture2_2()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture3_3()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture2_3()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("");

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture3_4()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture1_4()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void addCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddCatalog_fixture2_4()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog();

		fixture.addCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();
		String catalogName = "";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture2_2()
		throws Exception {
		Database fixture = getFixture2();
		String catalogName = "";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture3_2()
		throws Exception {
		Database fixture = getFixture3();
		String catalogName = "";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBCatalog getCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalog_fixture1_2()
		throws Exception {
		Database fixture = getFixture1();
		String catalogName = "0123456789";

		DBCatalog result = fixture.getCatalog(catalogName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBCatalog> getCatalogs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetCatalogs_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		List<DBCatalog> result = fixture.getCatalogs();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getDatabaseProductName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductName_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		String result = fixture.getDatabaseProductName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VersionNumber getDatabaseProductVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabaseProductVersion_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		VersionNumber result = fixture.getDatabaseProductVersion();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getImportDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetImportDate_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		Date result = fixture.getImportDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetPackages_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		List<DBPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table 'An��t-1.0.txt'
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture2_2()
		throws Exception {
		Database fixture = getFixture2();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture3_2()
		throws Exception {
		Database fixture = getFixture3();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table 'An��t-1.0.txt'
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture1_2()
		throws Exception {
		Database fixture = getFixture1();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getSchema(DefaultDatabase.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSequence> getSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSequences_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		List<DBSequence> result = fixture.getSequences();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_2()
		throws Exception {
		Database fixture = getFixture2();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_2()
		throws Exception {
		Database fixture = getFixture3();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_2()
		throws Exception {
		Database fixture = getFixture1();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_3()
		throws Exception {
		Database fixture = getFixture1();
		String name = "";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_3()
		throws Exception {
		Database fixture = getFixture2();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_4()
		throws Exception {
		Database fixture = getFixture1();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_3()
		throws Exception {
		Database fixture = getFixture3();
		String name = "";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_5()
		throws Exception {
		Database fixture = getFixture1();
		String name = "0123456789";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_4()
		throws Exception {
		Database fixture = getFixture3();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture1_6()
		throws Exception {
		Database fixture = getFixture1();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_5()
		throws Exception {
		Database fixture = getFixture3();
		String name = "0123456789";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_4()
		throws Exception {
		Database fixture = getFixture2();
		String name = "";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture3_6()
		throws Exception {
		Database fixture = getFixture3();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_5()
		throws Exception {
		Database fixture = getFixture2();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		assertNotNull(result);
	}

	/**
	 * Run the DBTable getTable(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTable_fixture2_6()
		throws Exception {
		Database fixture = getFixture2();
		String name = "0123456789";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableExclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableExclusionPattern_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		String result = fixture.getTableExclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTableInclusionPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTableInclusionPattern_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		String result = fixture.getTableInclusionPattern();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTable> getTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTables_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBTrigger> getTriggers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetTriggers_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		List<DBTrigger> result = fixture.getTriggers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetUser_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		String result = fixture.getUser();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedChecks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedChecks_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		boolean result = fixture.isImportedChecks();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedIndexes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedIndexes_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		boolean result = fixture.isImportedIndexes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedSequences() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedSequences_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		boolean result = fixture.isImportedSequences();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isImportedUKs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testIsImportedUKs_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();

		boolean result = fixture.isImportedUKs();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("");

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture1_2()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture3_2()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("");

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture1_3()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture2_2()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture3_3()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture2_3()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog("");

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture3_4()
		throws Exception {
		Database fixture = getFixture3();
		DBCatalog catalog = new DBCatalog("", new DefaultDatabase("", "", VersionNumber.valueOf("")));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture1_4()
		throws Exception {
		Database fixture = getFixture1();
		DBCatalog catalog = new DBCatalog("0123456789", new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeCatalog(DBCatalog) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveCatalog_fixture2_4()
		throws Exception {
		Database fixture = getFixture2();
		DBCatalog catalog = new DBCatalog();

		fixture.removeCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_1()
		throws Exception {
		Database fixture = getFixture1();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_1()
		throws Exception {
		Database fixture = getFixture2();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_1()
		throws Exception {
		Database fixture = getFixture3();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture2_2()
		throws Exception {
		Database fixture = getFixture2();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture3_2()
		throws Exception {
		Database fixture = getFixture3();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture1_2()
		throws Exception {
		Database fixture = getFixture1();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.removeTable(DefaultDatabase.java:206)
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
		new org.junit.runner.JUnitCore().run(DatabaseTest.class);
	}
}