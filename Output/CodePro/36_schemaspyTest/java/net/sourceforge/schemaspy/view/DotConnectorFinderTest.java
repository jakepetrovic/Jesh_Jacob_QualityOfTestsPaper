package net.sourceforge.schemaspy.view;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.Set;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DotConnectorFinderTest</code> contains tests for the class <code>{@link DotConnectorFinder}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:20 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DotConnectorFinderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DotConnectorFinder
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private DotConnectorFinder fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DotConnectorFinder
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public DotConnectorFinder getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = DotConnectorFinder.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the DotConnectorFinder getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		DotConnectorFinder result = DotConnectorFinder.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_1()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_2()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_3()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_4()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_5()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_6()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_7()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_8()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_9()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_10()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_11()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = false;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_12()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_13()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_14()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_15()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_16()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean includeExcluded = false;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_17()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_18()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_19()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_20()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_21()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_22()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Failed to load properties for ora: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getMaxDbThreads(Config.java:699)
		//       at net.sourceforge.schemaspy.model.Database.initTables(Database.java:238)
		//       at net.sourceforge.schemaspy.model.Database.<init>(Database.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_23()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_24()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_25()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = false;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_26()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = false;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_27()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeExcluded = false;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_28()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_29()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_30()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_31()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_32()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeExcluded = false;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_33()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_34()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_35()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_36()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeExcluded = false;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_37()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("", "", "")), "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		Table table2 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_38()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database((Config) null, (Connection) null, (DatabaseMetaData) null, "0123456789", "0123456789", "0123456789", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "", (String) null);
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_39()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "", "", "", new SchemaMeta("", "", "")), "", "", "", "");
		Table table2 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		boolean includeExcluded = true;
		boolean includeImplied = true;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Run the Set<DotConnector> getRelatedConnectors(Table,Table,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetRelatedConnectors_fixtureInstance_40()
		throws Exception {
		DotConnectorFinder fixture = getFixtureInstance();
		Table table1 = new Table(new Database(Config.getInstance(), (Connection) null, (DatabaseMetaData) null, "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", new SchemaMeta("0123456789", "0123456789", "0123456789")), "0123456789", "0123456789", "0123456789", "0123456789");
		Table table2 = new Table(new Database(new Config(), (Connection) null, (DatabaseMetaData) null, (String) null, (String) null, (String) null, (SchemaMeta) null), (String) null, (String) null, (String) null, (String) null);
		boolean includeExcluded = true;
		boolean includeImplied = false;

		Set<DotConnector> result = fixture.getRelatedConnectors(table1, table2, includeExcluded, includeImplied);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Specified meta file "0123456789" does not exist
		//       at net.sourceforge.schemaspy.model.xml.SchemaMeta.<init>(SchemaMeta.java:74)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DotConnectorFinderTest.class);
	}
}