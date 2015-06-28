package org.databene.jdbacl.model;

import java.util.List;
import org.databene.commons.version.VersionNumber;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DBCatalogTest</code> contains tests for the class <code>{@link DBCatalog}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DBCatalogTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBCatalog fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBCatalog fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBCatalog fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	private DBCatalog fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBCatalog getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DBCatalog("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBCatalog getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DBCatalog("", (Database) null);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBCatalog getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DBCatalog("0123456789", new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DBCatalog
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	public DBCatalog getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DBCatalog();
		}
		return fixture4;
	}

	/**
	 * Run the DBCatalog() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCatalog_1()
		throws Exception {

		DBCatalog result = new DBCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals(null, result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCatalog_2()
		throws Exception {
		String name = "";

		DBCatalog result = new DBCatalog(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCatalog_3()
		throws Exception {
		String name = "0123456789";

		DBCatalog result = new DBCatalog(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("0123456789", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCatalog_4()
		throws Exception {
		String name = "1";

		DBCatalog result = new DBCatalog(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("1", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog(String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCatalog_5()
		throws Exception {
		String name = "";
		Database owner = null;

		DBCatalog result = new DBCatalog(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the DBCatalog(String,Database) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testDBCatalog_6()
		throws Exception {
		String name = "0123456789";
		Database owner = null;

		DBCatalog result = new DBCatalog(name, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(null, result.getDoc());
		assertEquals(null, result.getDatabase());
		assertEquals("0123456789", result.toString());
		assertEquals(null, result.getOwner());
		assertEquals("catalog", result.getObjectType());
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();
		DBSchema schema = new DBSchema("");

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture2_2()
		throws Exception {
		DBCatalog fixture = getFixture2();
		DBSchema schema = new DBSchema("");

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture3_2()
		throws Exception {
		DBCatalog fixture = getFixture3();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture1_2()
		throws Exception {
		DBCatalog fixture = getFixture1();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture3_3()
		throws Exception {
		DBCatalog fixture = getFixture3();
		DBSchema schema = new DBSchema("");

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture4_3()
		throws Exception {
		DBCatalog fixture = getFixture4();
		DBSchema schema = new DBSchema("");

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture1_3()
		throws Exception {
		DBCatalog fixture = getFixture1();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void addSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testAddSchema_fixture2_3()
		throws Exception {
		DBCatalog fixture = getFixture2();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.addSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the List<DBSchema> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();

		List<DBSchema> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSchema> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();

		List<DBSchema> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSchema> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();

		List<DBSchema> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSchema> getComponents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetComponents_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();

		List<DBSchema> result = fixture.getComponents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabase_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabase_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabase_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();

		Database result = fixture.getDatabase();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getDatabaseProductName());
		assertEquals(null, result.getTableExclusionPattern());
		assertEquals(null, result.getTableInclusionPattern());
		assertEquals(false, result.isImportedChecks());
		assertEquals(false, result.isImportedSequences());
		assertEquals(false, result.isImportedIndexes());
		assertEquals(false, result.isImportedUKs());
		assertEquals(null, result.getImportDate());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getDoc());
		assertEquals("database", result.getObjectType());
		assertEquals("", result.getName());
	}

	/**
	 * Run the Database getDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetDatabase_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();

		Database result = fixture.getDatabase();

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
	public void testGetDoc_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();

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
		DBCatalog fixture = getFixture2();

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
		DBCatalog fixture = getFixture3();

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
		DBCatalog fixture = getFixture4();

		String result = fixture.getDoc();

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
	public void testGetName_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();

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
		DBCatalog fixture = getFixture2();

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
		DBCatalog fixture = getFixture3();

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
		DBCatalog fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
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
		DBCatalog fixture = getFixture1();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
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
		DBCatalog fixture = getFixture2();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
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
		DBCatalog fixture = getFixture3();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
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
		DBCatalog fixture = getFixture2();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
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
		DBCatalog fixture = getFixture3();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DBSchema getSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchema_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String schemaName = "";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
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
		DBCatalog fixture = getFixture1();
		String schemaName = "0123456789";

		DBSchema result = fixture.getSchema(schemaName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<DBSchema> getSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemas_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();

		List<DBSchema> result = fixture.getSchemas();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSchema> getSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemas_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();

		List<DBSchema> result = fixture.getSchemas();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSchema> getSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemas_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();

		List<DBSchema> result = fixture.getSchemas();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<DBSchema> getSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testGetSchemas_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();

		List<DBSchema> result = fixture.getSchemas();

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
	public void testGetSequences_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();

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
		DBCatalog fixture = getFixture2();

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
		DBCatalog fixture = getFixture3();

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
	public void testGetSequences_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();

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
		DBCatalog fixture = getFixture1();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
		DBCatalog fixture = getFixture2();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
		DBCatalog fixture = getFixture3();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
	public void testGetTable_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
		DBCatalog fixture = getFixture2();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
		DBCatalog fixture = getFixture3();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
	public void testGetTable_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String name = "";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
		DBCatalog fixture = getFixture1();
		String name = "0123456789";

		DBTable result = fixture.getTable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
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
		DBCatalog fixture = getFixture1();
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
		DBCatalog fixture = getFixture2();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
	public void testGetTable_fixture4_3()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
		DBCatalog fixture = getFixture1();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
		DBCatalog fixture = getFixture3();
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
	public void testGetTable_fixture4_4()
		throws Exception {
		DBCatalog fixture = getFixture4();
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
	public void testGetTable_fixture1_5()
		throws Exception {
		DBCatalog fixture = getFixture1();
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
		DBCatalog fixture = getFixture3();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
	public void testGetTable_fixture4_5()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
		DBCatalog fixture = getFixture1();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
		DBCatalog fixture = getFixture3();
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
		DBCatalog fixture = getFixture2();
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
		DBCatalog fixture = getFixture3();
		String name = "0123456789";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
		DBCatalog fixture = getFixture2();
		String name = "";
		boolean required = true;

		DBTable result = fixture.getTable(name, required);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
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
	public void testGetTable_fixture4_6()
		throws Exception {
		DBCatalog fixture = getFixture4();
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
	public void testGetTable_fixture2_6()
		throws Exception {
		DBCatalog fixture = getFixture2();
		String name = "0123456789";
		boolean required = false;

		DBTable result = fixture.getTable(name, required);

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
		DBCatalog fixture = getFixture1();

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
		DBCatalog fixture = getFixture2();

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
		DBCatalog fixture = getFixture3();

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
	public void testGetTables_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();

		List<DBTable> result = fixture.getTables();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();
		DBSchema schema = new DBSchema("");

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture2_2()
		throws Exception {
		DBCatalog fixture = getFixture2();
		DBSchema schema = new DBSchema("");

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture3_2()
		throws Exception {
		DBCatalog fixture = getFixture3();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture1_2()
		throws Exception {
		DBCatalog fixture = getFixture1();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture3_3()
		throws Exception {
		DBCatalog fixture = getFixture3();
		DBSchema schema = new DBSchema("");

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture4_3()
		throws Exception {
		DBCatalog fixture = getFixture4();
		DBSchema schema = new DBSchema("");

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture1_3()
		throws Exception {
		DBCatalog fixture = getFixture1();
		DBSchema schema = new DBSchema("", new DBCatalog(""));

		fixture.removeSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void removeSchema(DBSchema) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveSchema_fixture2_3()
		throws Exception {
		DBCatalog fixture = getFixture2();
		DBSchema schema = new DBSchema("0123456789", new DBCatalog("", (Database) null));

		fixture.removeSchema(schema);

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
		DBCatalog fixture = getFixture1();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
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
		DBCatalog fixture = getFixture2();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
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
		DBCatalog fixture = getFixture3();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
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
		DBCatalog fixture = getFixture2();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
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
		DBCatalog fixture = getFixture3();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
	}

	/**
	 * Run the void removeTable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testRemoveTable_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String tableName = "";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
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
		DBCatalog fixture = getFixture1();
		String tableName = "0123456789";

		fixture.removeTable(tableName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table '0123456789'
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:136)
		//       at org.databene.jdbacl.model.DBCatalog.getTable(DBCatalog.java:127)
		//       at org.databene.jdbacl.model.DBCatalog.removeTable(DBCatalog.java:142)
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture2_2()
		throws Exception {
		DBCatalog fixture = getFixture2();
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture3_2()
		throws Exception {
		DBCatalog fixture = getFixture3();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture1_2()
		throws Exception {
		DBCatalog fixture = getFixture1();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture3_3()
		throws Exception {
		DBCatalog fixture = getFixture3();
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture4_3()
		throws Exception {
		DBCatalog fixture = getFixture4();
		Database database = new DefaultDatabase("", "", VersionNumber.valueOf(""));

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture1_3()
		throws Exception {
		DBCatalog fixture = getFixture1();
		Database database = new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDatabase(Database) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDatabase_fixture2_3()
		throws Exception {
		DBCatalog fixture = getFixture2();
		Database database = new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null);

		fixture.setDatabase(database);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();
		String doc = "";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture2_2()
		throws Exception {
		DBCatalog fixture = getFixture2();
		String doc = "";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture3_2()
		throws Exception {
		DBCatalog fixture = getFixture3();
		String doc = "";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String doc = "";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setDoc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetDoc_fixture1_2()
		throws Exception {
		DBCatalog fixture = getFixture1();
		String doc = "0123456789";

		fixture.setDoc(doc);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture1_1()
		throws Exception {
		DBCatalog fixture = getFixture1();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture2_1()
		throws Exception {
		DBCatalog fixture = getFixture2();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture3_1()
		throws Exception {
		DBCatalog fixture = getFixture3();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture4_1()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture2_2()
		throws Exception {
		DBCatalog fixture = getFixture2();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture3_2()
		throws Exception {
		DBCatalog fixture = getFixture3();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture4_2()
		throws Exception {
		DBCatalog fixture = getFixture4();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:00 PM
	 */
	@Test
	public void testSetName_fixture1_2()
		throws Exception {
		DBCatalog fixture = getFixture1();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DBCatalogTest.class);
	}
}