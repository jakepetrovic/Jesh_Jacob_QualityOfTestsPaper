package net.sourceforge.schemaspy.util;

import java.util.List;
import org.junit.*;
import net.sourceforge.schemaspy.Config;
import static org.junit.Assert.*;

/**
 * The class <code>DbSpecificConfigTest</code> contains tests for the class <code>{@link DbSpecificConfig}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:21 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DbSpecificConfigTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DbSpecificConfig
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	private DbSpecificConfig fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbSpecificConfig
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public DbSpecificConfig getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DbSpecificConfig("");
		}
		return fixture;
	}

	/**
	 * Run the DbSpecificConfig(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testDbSpecificConfig_1()
		throws Exception {
		String dbType = "";

		DbSpecificConfig result = new DbSpecificConfig(dbType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.io.FileNotFoundException:  (No such file or directory)", result.toString());
	}

	/**
	 * Run the DbSpecificConfig(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testDbSpecificConfig_2()
		throws Exception {
		String dbType = "0123456789";

		DbSpecificConfig result = new DbSpecificConfig(dbType);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.io.FileNotFoundException: 0123456789 (No such file or directory)", result.toString());
	}

	/**
	 * Run the void dumpUsage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testDumpUsage_fixture_1()
		throws Exception {
		DbSpecificConfig fixture2 = getFixture();

		fixture2.dumpUsage();

		// add additional test code here
	}

	/**
	 * Run the Config getConfig() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetConfig_fixture_1()
		throws Exception {
		DbSpecificConfig fixture2 = getFixture();

		Config result = fixture2.getConfig();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getHost());
		assertEquals(null, result.getPort());
		assertEquals(null, result.getCatalog());
		assertEquals(null, result.getDescription());
		assertEquals("ISO-8859-1", result.getCharset());
		assertEquals(null, result.getDb());
		assertEquals(null, result.getPassword());
		assertEquals(true, result.isEncodeCommentsEnabled());
		assertEquals(false, result.isPromptForPasswordEnabled());
		assertEquals(null, result.getConnectionPropertiesFile());
		assertEquals(true, result.isImpliedConstraintsEnabled());
		assertEquals(true, result.isHtmlGenerationEnabled());
		assertEquals("Helvetica", result.getFont());
		assertEquals("", result.getRenderer());
		assertEquals(false, result.isOneOfMultipleSchemas());
		assertEquals(11, result.getFontSize());
		assertEquals(true, result.isViewsEnabled());
		assertEquals(false, result.isRankDirBugEnabled());
		assertEquals(true, result.isNumRowsEnabled());
		assertEquals(false, result.hasOrphans());
		assertEquals(false, result.hasRoutines());
		assertEquals(null, result.getGraphvizDir());
		assertEquals(null, result.getMeta());
		assertEquals("ora", result.getDbType());
		assertEquals(false, result.isSchemaDisabled());
		assertEquals(null, result.getServer());
		assertEquals(false, result.isSingleSignOn());
		assertEquals(300, result.getMaxDetailedTables());
		assertEquals(null, result.getDriverPath());
		assertEquals("schemaSpy.css", result.getCss());
		assertEquals(true, result.isLogoEnabled());
		assertEquals(false, result.isRailsEnabled());
		assertEquals(false, result.isMeterEnabled());
		assertEquals(null, result.getSchemas());
		assertEquals(false, result.isEvaluateAllEnabled());
		assertEquals(null, result.getSchemaSpec());
		assertEquals(false, result.isHighQuality());
		assertEquals(true, result.isLowQuality());
		assertEquals(false, result.isHelpRequired());
		assertEquals(false, result.isDbHelpRequired());
	}

	/**
	 * Run the List<DbSpecificOption> getOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testGetOptions_fixture_1()
		throws Exception {
		DbSpecificConfig fixture2 = getFixture();

		List<DbSpecificOption> result = fixture2.getOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		DbSpecificConfig fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("java.io.FileNotFoundException:  (No such file or directory)", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
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
	 * @generatedBy CodePro at 6/7/15 4:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DbSpecificConfigTest.class);
	}
}