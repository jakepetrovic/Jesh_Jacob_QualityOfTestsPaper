package net.sourceforge.schemaspy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Vector;
import net.sourceforge.schemaspy.model.InvalidConfigurationException;
import net.sourceforge.schemaspy.view.SqlFormatter;
import java.util.logging.Level;
import java.util.regex.Pattern;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConfigTest</code> contains tests for the class <code>{@link Config}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:23 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ConfigTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Config
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	private Config fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Config
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	private Config fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Config
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	public Config getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = Config.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Config
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	public Config getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new Config();
		}
		return fixture;
	}

	/**
	 * Run the Config() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testConfig_1()
		throws Exception {

		Config result = new Config();

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
	 * Run the Config(String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testConfig_2()
		throws Exception {
		String[] argv = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		Config result = new Config(argv);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Config(String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testConfig_3()
		throws Exception {
		String[] argv = new String[] {""};

		Config result = new Config(argv);

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
	 * Run the Config(String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testConfig_4()
		throws Exception {
		String[] argv = new String[] {"0123456789"};

		Config result = new Config(argv);

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
	 * Run the List<String> asList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsList_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		List<String> result = fixture2.asList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-u' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getUser(Config.java:387)
		//       at net.sourceforge.schemaspy.Config.asList(Config.java:1785)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> asList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsList_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		List<String> result = fixture2.asList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-u' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getUser(Config.java:387)
		//       at net.sourceforge.schemaspy.Config.asList(Config.java:1785)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_1()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		java.util.ResourceBundle.Control resourceBundle$Control = java.util.ResourceBundle.Control.getControl(list);
		ResourceBundle bundle = ResourceBundle.getBundle("", Locale.CANADA, ClassLoader.getSystemClassLoader(), resourceBundle$Control);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.ResourceBundle$Control.getControl(ResourceBundle.java:2041)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_2()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		java.util.ResourceBundle.Control resourceBundle$Control = java.util.ResourceBundle.Control.getControl(list);
		ResourceBundle bundle = ResourceBundle.getBundle("", Locale.CANADA, resourceBundle$Control);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.ResourceBundle$Control.getControl(ResourceBundle.java:2041)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_3()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		java.util.ResourceBundle.Control resourceBundle$Control = java.util.ResourceBundle.Control.getControl(list);
		ResourceBundle bundle = ResourceBundle.getBundle("", resourceBundle$Control);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.ResourceBundle$Control.getControl(ResourceBundle.java:2041)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_4()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		java.util.ResourceBundle.Control resourceBundle$Control = java.util.ResourceBundle.Control.getNoFallbackControl(list);
		ResourceBundle bundle = ResourceBundle.getBundle("0123456789", Locale.CANADA_FRENCH, (ClassLoader) null, resourceBundle$Control);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.ResourceBundle$Control.getNoFallbackControl(ResourceBundle.java:2076)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_5()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		java.util.ResourceBundle.Control resourceBundle$Control = java.util.ResourceBundle.Control.getNoFallbackControl(list);
		ResourceBundle bundle = ResourceBundle.getBundle("0123456789", Locale.CANADA_FRENCH, resourceBundle$Control);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.ResourceBundle$Control.getNoFallbackControl(ResourceBundle.java:2076)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_6()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		java.util.ResourceBundle.Control resourceBundle$Control = java.util.ResourceBundle.Control.getNoFallbackControl(list);
		ResourceBundle bundle = ResourceBundle.getBundle("0123456789", resourceBundle$Control);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.ResourceBundle$Control.getNoFallbackControl(ResourceBundle.java:2076)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_7()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("");

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find bundle for base name , locale en_US
		//       at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1499)
		//       at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1322)
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:721)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_8()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("", Locale.CANADA);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find bundle for base name , locale en_CA
		//       at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1499)
		//       at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1322)
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:795)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_9()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("", Locale.CANADA, ClassLoader.getSystemClassLoader());

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find bundle for base name , locale en_CA
		//       at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1499)
		//       at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1322)
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:1028)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_10()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("0123456789", Locale.CANADA_FRENCH);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.MissingResourceException: Can't find bundle for base name 0123456789, locale fr_CA
		//       at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1499)
		//       at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1322)
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:795)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_11()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("0123456789", Locale.CANADA_FRENCH, (ClassLoader) null);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:1026)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_12()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("An��t-1.0.txt", Locale.CHINA, (java.util.ResourceBundle.Control) null);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1252)
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:841)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_13()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("An��t-1.0.txt", Locale.CHINESE, ClassLoader.getSystemClassLoader(), (java.util.ResourceBundle.Control) null);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:1244)
		assertNotNull(result);
	}

	/**
	 * Run the Properties asProperties(ResourceBundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testAsProperties_14()
		throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle((String) null, Locale.ENGLISH, (ClassLoader) null, (java.util.ResourceBundle.Control) null);

		Properties result = Config.asProperties(bundle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.ResourceBundle.getBundle(ResourceBundle.java:1244)
		assertNotNull(result);
	}

	/**
	 * Run the Properties determineDbProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testDetermineDbProperties_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String type = "";

		Properties result = fixture2.determineDbProperties(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Properties determineDbProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testDetermineDbProperties_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String type = "0123456789";

		Properties result = fixture2.determineDbProperties(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Properties determineDbProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testDetermineDbProperties_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String type = "";

		Properties result = fixture2.determineDbProperties(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Properties determineDbProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testDetermineDbProperties_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String type = "0123456789";

		Properties result = fixture2.determineDbProperties(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String errorMessage = "1";
		boolean detailedDb = false;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String errorMessage = null;
		boolean detailedDb = true;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String errorMessage = null;
		boolean detailedDb = false;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		String errorMessage = "1";
		boolean detailedDb = true;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixture_4()
		throws Exception {
		Config fixture2 = getFixture();
		String errorMessage = "1";
		boolean detailedDb = false;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String errorMessage = null;
		boolean detailedDb = true;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String errorMessage = null;
		boolean detailedDb = false;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the void dumpUsage(String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testDumpUsage_fixtureInstance_4()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String errorMessage = "1";
		boolean detailedDb = true;

		fixture2.dumpUsage(errorMessage, detailedDb);

		// add additional test code here
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		ArrayList<String> args = new ArrayList<String>();
		args.add("");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		LinkedList<String> args = new LinkedList<String>();
		args.add("");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_4()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		Vector<String> args = new Vector<String>();
		args.add("");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_4()
		throws Exception {
		Config fixture2 = getFixture();
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_5()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		Vector<String> args = new Vector<String>();
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_5()
		throws Exception {
		Config fixture2 = getFixture();
		List<String> args = new ArrayList<String>();

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_6()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		List<String> args = new LinkedList<String>();

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_6()
		throws Exception {
		Config fixture2 = getFixture();
		List<String> args = new Vector<String>();

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_7()
		throws Exception {
		Config fixture2 = getFixture();
		ArrayList<String> args = new ArrayList<String>();
		args.add("");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_7()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_8()
		throws Exception {
		Config fixture2 = getFixture();
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_8()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		LinkedList<String> args = new LinkedList<String>();
		args.add("");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_9()
		throws Exception {
		Config fixture2 = getFixture();
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_9()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_10()
		throws Exception {
		Config fixture2 = getFixture();
		Vector<String> args = new Vector<String>();
		args.add("");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains(""));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_10()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains(""));
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_11()
		throws Exception {
		Config fixture2 = getFixture();
		Vector<String> args = new Vector<String>();
		args.add("0123456789");

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertTrue(result.contains("0123456789"));
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_11()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		List<String> args = new ArrayList<String>();

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixture_12()
		throws Exception {
		Config fixture2 = getFixture();
		List<String> args = new LinkedList<String>();

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> fixupArgs(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testFixupArgs_fixtureInstance_12()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		List<String> args = new Vector<String>();

		List<String> result = fixture2.fixupArgs(args);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<String> getBuiltInDatabaseTypes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetBuiltInDatabaseTypes_1()
		throws Exception {
		String loadedFromJar = "";

		Set<String> result = Config.getBuiltInDatabaseTypes(loadedFromJar);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Set<String> getBuiltInDatabaseTypes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetBuiltInDatabaseTypes_2()
		throws Exception {
		String loadedFromJar = "0123456789";

		Set<String> result = Config.getBuiltInDatabaseTypes(loadedFromJar);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetCatalog_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetCatalog_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getCatalog();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getCharset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetCharset_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getCharset();

		// add additional test code here
		assertEquals("ISO-8859-1", result);
	}

	/**
	 * Run the String getCharset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetCharset_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getCharset();

		// add additional test code here
		assertEquals("ISO-8859-1", result);
	}

	/**
	 * Run the List<String> getColumnDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetColumnDetails_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		List<String> result = fixture2.getColumnDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
		assertTrue(result.contains("id"));
		assertTrue(result.contains("table"));
		assertTrue(result.contains("column"));
		assertTrue(result.contains("type"));
		assertTrue(result.contains("size"));
		assertTrue(result.contains("nulls"));
		assertTrue(result.contains("auto"));
		assertTrue(result.contains("default"));
	}

	/**
	 * Run the List<String> getColumnDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetColumnDetails_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		List<String> result = fixture2.getColumnDetails();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
		assertTrue(result.contains("id"));
		assertTrue(result.contains("table"));
		assertTrue(result.contains("column"));
		assertTrue(result.contains("type"));
		assertTrue(result.contains("size"));
		assertTrue(result.contains("nulls"));
		assertTrue(result.contains("auto"));
		assertTrue(result.contains("default"));
	}

	/**
	 * Run the Pattern getColumnExclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetColumnExclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Pattern result = fixture2.getColumnExclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[^.]", result.pattern());
		assertEquals("[^.]", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Pattern getColumnExclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetColumnExclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Pattern result = fixture2.getColumnExclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[^.]", result.pattern());
		assertEquals("[^.]", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Properties getConnectionProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetConnectionProperties_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Properties result = fixture2.getConnectionProperties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Properties getConnectionProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetConnectionProperties_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Properties result = fixture2.getConnectionProperties();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getConnectionPropertiesFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetConnectionPropertiesFile_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getConnectionPropertiesFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getConnectionPropertiesFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetConnectionPropertiesFile_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getConnectionPropertiesFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getCss() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetCss_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getCss();

		// add additional test code here
		assertEquals("schemaSpy.css", result);
	}

	/**
	 * Run the String getCss() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetCss_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getCss();

		// add additional test code here
		assertEquals("schemaSpy.css", result);
	}

	/**
	 * Run the String getDb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDb_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getDb();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDb_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getDb();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Properties getDbProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testGetDbProperties_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Properties result = fixture2.getDbProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Properties getDbProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testGetDbProperties_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Properties result = fixture2.getDbProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDbPropertiesLoadedFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetDbPropertiesLoadedFrom_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getDbPropertiesLoadedFrom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDbPropertiesLoadedFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetDbPropertiesLoadedFrom_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getDbPropertiesLoadedFrom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getDbSpecificOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDbSpecificOptions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Map<String, String> result = fixture2.getDbSpecificOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, String> getDbSpecificOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDbSpecificOptions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Map<String, String> result = fixture2.getDbSpecificOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getDbType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDbType_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getDbType();

		// add additional test code here
		assertEquals("ora", result);
	}

	/**
	 * Run the String getDbType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDbType_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getDbType();

		// add additional test code here
		assertEquals("ora", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDescription_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getDescription();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDescription_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getDescription();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDriverPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDriverPath_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getDriverPath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getDriverPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetDriverPath_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getDriverPath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getFont() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetFont_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getFont();

		// add additional test code here
		assertEquals("Helvetica", result);
	}

	/**
	 * Run the String getFont() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetFont_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getFont();

		// add additional test code here
		assertEquals("Helvetica", result);
	}

	/**
	 * Run the int getFontSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetFontSize_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		int result = fixture2.getFontSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getFontSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetFontSize_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		int result = fixture2.getFontSize();

		// add additional test code here
		assertEquals(11, result);
	}

	/**
	 * Run the File getGraphvizDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetGraphvizDir_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		File result = fixture2.getGraphvizDir();

		// add additional test code here
		assertNotNull(result);
		assertEquals("x", result.toString());
		assertEquals("x", result.getName());
		assertEquals(0L, result.length());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isAbsolute());
		assertEquals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/Eclipse.app/Contents/MacOS/x", result.getCanonicalPath());
		assertEquals(null, result.list());
		assertEquals(false, result.exists());
		assertEquals("x", result.getPath());
		assertEquals(null, result.getParentFile());
		assertEquals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/eclipse/Eclipse.app/Contents/MacOS/x", result.getAbsolutePath());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
		assertEquals(false, result.canExecute());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(0L, result.getUsableSpace());
	}

	/**
	 * Run the File getGraphvizDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetGraphvizDir_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		File result = fixture2.getGraphvizDir();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetHost_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getHost();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetHost_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getHost();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Pattern getIndirectColumnExclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetIndirectColumnExclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Pattern result = fixture2.getIndirectColumnExclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[^.]", result.pattern());
		assertEquals("[^.]", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Pattern getIndirectColumnExclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetIndirectColumnExclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Pattern result = fixture2.getIndirectColumnExclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[^.]", result.pattern());
		assertEquals("[^.]", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Config getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		Config result = Config.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getSchema());
		assertEquals(null, result.getHost());
		assertEquals(null, result.getPort());
		assertEquals(null, result.getCatalog());
		assertEquals(null, result.getUser());
		assertEquals(null, result.getDescription());
		assertEquals("ISO-8859-1", result.getCharset());
		assertEquals(null, result.getDb());
		assertEquals(true, result.isEncodeCommentsEnabled());
		assertEquals(true, result.isPromptForPasswordEnabled());
		assertEquals(null, result.getConnectionPropertiesFile());
		assertEquals(true, result.isImpliedConstraintsEnabled());
		assertEquals(true, result.isHtmlGenerationEnabled());
		assertEquals("Helvetica", result.getFont());
		assertEquals("", result.getRenderer());
		assertEquals(false, result.isOneOfMultipleSchemas());
		assertEquals(1, result.getFontSize());
		assertEquals(true, result.isViewsEnabled());
		assertEquals(true, result.isRankDirBugEnabled());
		assertEquals(1, result.getMaxDbThreads());
		assertEquals(true, result.isNumRowsEnabled());
		assertEquals(false, result.hasOrphans());
		assertEquals(true, result.hasRoutines());
		assertEquals(null, result.getGraphvizDir());
		assertEquals(null, result.getMeta());
		assertEquals("ora", result.getDbType());
		assertEquals(false, result.isSchemaDisabled());
		assertEquals(null, result.getServer());
		assertEquals(true, result.isSingleSignOn());
		assertEquals(1, result.getMaxDetailedTables());
		assertEquals(null, result.getDriverPath());
		assertEquals("schemaSpy.css", result.getCss());
		assertEquals(true, result.isLogoEnabled());
		assertEquals(true, result.isRailsEnabled());
		assertEquals(false, result.isMeterEnabled());
		assertEquals(null, result.getSchemas());
		assertEquals(true, result.isEvaluateAllEnabled());
		assertEquals(null, result.getSchemaSpec());
		assertEquals(false, result.isHighQuality());
		assertEquals(true, result.isLowQuality());
		assertEquals(false, result.isHelpRequired());
		assertEquals(false, result.isDbHelpRequired());
	}

	/**
	 * Run the String getLoadedFromJar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetLoadedFromJar_1()
		throws Exception {

		String result = Config.getLoadedFromJar();

		// add additional test code here
		assertEquals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/eclipse/Eclipse.app/Contents/MacOS//../../../plugins/org.eclipse.equinox.launcher_1.2.0.v20110502.jar", result);
	}

	/**
	 * Run the Level getLogLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetLogLevel_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Level result = fixture2.getLogLevel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("WARNING", result.toString());
		assertEquals(900, result.intValue());
		assertEquals("WARNING", result.getName());
		assertEquals("WARNING", result.getLocalizedName());
		assertEquals("sun.util.logging.resources.logging", result.getResourceBundleName());
	}

	/**
	 * Run the Level getLogLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetLogLevel_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Level result = fixture2.getLogLevel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("WARNING", result.toString());
		assertEquals(900, result.intValue());
		assertEquals("WARNING", result.getName());
		assertEquals("WARNING", result.getLocalizedName());
		assertEquals("sun.util.logging.resources.logging", result.getResourceBundleName());
	}

	/**
	 * Run the int getMaxDbThreads() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testGetMaxDbThreads_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		int result = fixture2.getMaxDbThreads();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMaxDbThreads() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testGetMaxDbThreads_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		int result = fixture2.getMaxDbThreads();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMaxDetailedTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetMaxDetailedTables_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		int result = fixture2.getMaxDetailedTables();

		// add additional test code here
		assertEquals(300, result);
	}

	/**
	 * Run the int getMaxDetailedTables() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetMaxDetailedTables_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		int result = fixture2.getMaxDetailedTables();

		// add additional test code here
		assertEquals(300, result);
	}

	/**
	 * Run the String getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetMeta_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getMeta();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetMeta_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getMeta();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File getOutputDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetOutputDir_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		File result = fixture2.getOutputDir();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		assertNotNull(result);
	}

	/**
	 * Run the File getOutputDir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetOutputDir_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		File result = fixture2.getOutputDir();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		assertNotNull(result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetParam_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String paramName = "";

		String result = fixture2.getParam(paramName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetParam_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String paramName = "0123456789";

		String result = fixture2.getParam(paramName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetParam_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String paramName = "";

		String result = fixture2.getParam(paramName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetParam_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String paramName = "0123456789";

		String result = fixture2.getParam(paramName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetPassword_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getPassword();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetPassword_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getPassword();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetPort_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Integer result = fixture2.getPort();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Integer getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetPort_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Integer result = fixture2.getPort();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getRemainingParameters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetRemainingParameters_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		List<String> result = fixture2.getRemainingParameters();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getDbProperties(Config.java:1332)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getRemainingParameters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetRemainingParameters_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		List<String> result = fixture2.getRemainingParameters();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: java.io.FileNotFoundException: ora (No such file or directory)
		//       at net.sourceforge.schemaspy.Config.getDbProperties(Config.java:1332)
		assertNotNull(result);
	}

	/**
	 * Run the String getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetRenderer_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getRenderer();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetRenderer_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getRenderer();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSchema_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSchema() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSchema_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getSchema();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSchemaSpec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSchemaSpec_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getSchemaSpec();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getSchemaSpec() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSchemaSpec_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getSchemaSpec();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSchemas_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		List<String> result = fixture2.getSchemas();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSchemas_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		List<String> result = fixture2.getSchemas();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetServer_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getServer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetServer_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getServer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SqlFormatter getSqlFormatter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSqlFormatter_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		SqlFormatter result = fixture2.getSqlFormatter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1490)
		//       at net.sourceforge.schemaspy.Config.getSqlFormatter(Config.java:1031)
		assertNotNull(result);
	}

	/**
	 * Run the SqlFormatter getSqlFormatter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetSqlFormatter_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		SqlFormatter result = fixture2.getSqlFormatter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Pattern getTableExclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetTableExclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Pattern result = fixture2.getTableExclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.pattern());
		assertEquals("", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Pattern getTableExclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetTableExclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Pattern result = fixture2.getTableExclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.pattern());
		assertEquals("", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Pattern getTableInclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetTableInclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		Pattern result = fixture2.getTableInclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(".*", result.pattern());
		assertEquals(".*", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the Pattern getTableInclusions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetTableInclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		Pattern result = fixture2.getTableInclusions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(".*", result.pattern());
		assertEquals(".*", result.toString());
		assertEquals(0, result.flags());
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetUser_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		String result = fixture2.getUser();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-u' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getUser(Config.java:387)
		assertNotNull(result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testGetUser_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		String result = fixture2.getUser();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-u' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getUser(Config.java:387)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasOrphans() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testHasOrphans_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.hasOrphans();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasOrphans() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testHasOrphans_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.hasOrphans();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasRoutines() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testHasRoutines_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.hasRoutines();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasRoutines() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testHasRoutines_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.hasRoutines();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDbHelpRequired() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsDbHelpRequired_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isDbHelpRequired();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDbHelpRequired() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsDbHelpRequired_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isDbHelpRequired();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEncodeCommentsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsEncodeCommentsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isEncodeCommentsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEncodeCommentsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsEncodeCommentsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isEncodeCommentsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEvaluateAllEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsEvaluateAllEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isEvaluateAllEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEvaluateAllEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsEvaluateAllEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isEvaluateAllEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHelpRequired() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsHelpRequired_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isHelpRequired();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHelpRequired() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsHelpRequired_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isHelpRequired();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHighQuality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsHighQuality_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isHighQuality();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHighQuality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsHighQuality_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isHighQuality();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHtmlGenerationEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsHtmlGenerationEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isHtmlGenerationEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isHtmlGenerationEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsHtmlGenerationEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isHtmlGenerationEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImpliedConstraintsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsImpliedConstraintsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isImpliedConstraintsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isImpliedConstraintsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsImpliedConstraintsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isImpliedConstraintsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLogoEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsLogoEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isLogoEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLogoEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsLogoEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isLogoEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLowQuality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsLowQuality_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isLowQuality();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLowQuality() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsLowQuality_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isLowQuality();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isMeterEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsMeterEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isMeterEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isMeterEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsMeterEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isMeterEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNumRowsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsNumRowsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isNumRowsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNumRowsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsNumRowsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isNumRowsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isOneOfMultipleSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsOneOfMultipleSchemas_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isOneOfMultipleSchemas();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOneOfMultipleSchemas() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsOneOfMultipleSchemas_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isOneOfMultipleSchemas();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPromptForPasswordEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsPromptForPasswordEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isPromptForPasswordEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isPromptForPasswordEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsPromptForPasswordEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isPromptForPasswordEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRailsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsRailsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isRailsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isRailsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsRailsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isRailsEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRankDirBugEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsRankDirBugEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isRankDirBugEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isRankDirBugEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsRankDirBugEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isRankDirBugEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSchemaDisabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsSchemaDisabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isSchemaDisabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSchemaDisabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsSchemaDisabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isSchemaDisabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSingleSignOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsSingleSignOn_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isSingleSignOn();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSingleSignOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsSingleSignOn_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isSingleSignOn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isViewsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsViewsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();

		boolean result = fixture2.isViewsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isViewsEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testIsViewsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();

		boolean result = fixture2.isViewsEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetCatalog_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String catalog = null;

		fixture2.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCatalog(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetCatalog_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String catalog = null;

		fixture2.setCatalog(catalog);

		// add additional test code here
	}

	/**
	 * Run the void setCharset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetCharset_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String charset = null;

		fixture2.setCharset(charset);

		// add additional test code here
	}

	/**
	 * Run the void setCharset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetCharset_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String charset = null;

		fixture2.setCharset(charset);

		// add additional test code here
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String columnDetails = "";

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String columnDetails = "0";

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: 'column' is a required column detail
		//       at net.sourceforge.schemaspy.Config.setColumnDetails(Config.java:1086)
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String columnDetails = "1";

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: 'column' is a required column detail
		//       at net.sourceforge.schemaspy.Config.setColumnDetails(Config.java:1086)
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String columnDetails = null;

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		String columnDetails = "";

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String columnDetails = "0";

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: 'column' is a required column detail
		//       at net.sourceforge.schemaspy.Config.setColumnDetails(Config.java:1086)
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixture_4()
		throws Exception {
		Config fixture2 = getFixture();
		String columnDetails = "1";

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: 'column' is a required column detail
		//       at net.sourceforge.schemaspy.Config.setColumnDetails(Config.java:1086)
	}

	/**
	 * Run the void setColumnDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixtureInstance_4()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String columnDetails = null;

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
	}

	/**
	 * Run the void setColumnDetails(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixtureInstance_5()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		List<String> columnDetails = null;

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
	}

	/**
	 * Run the void setColumnDetails(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnDetails_fixture_5()
		throws Exception {
		Config fixture2 = getFixture();
		List<String> columnDetails = null;

		fixture2.setColumnDetails(columnDetails);

		// add additional test code here
	}

	/**
	 * Run the void setColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnExclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String columnExclusions = "";

		fixture2.setColumnExclusions(columnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnExclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String columnExclusions = "0123456789";

		fixture2.setColumnExclusions(columnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnExclusions_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String columnExclusions = "";

		fixture2.setColumnExclusions(columnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetColumnExclusions_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String columnExclusions = "0123456789";

		fixture2.setColumnExclusions(columnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetConnectionProperties_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String properties = "";

		fixture2.setConnectionProperties(properties);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetConnectionProperties_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String properties = "0123456789";

		fixture2.setConnectionProperties(properties);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetConnectionProperties_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String properties = "";

		fixture2.setConnectionProperties(properties);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionProperties(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetConnectionProperties_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String properties = "0123456789";

		fixture2.setConnectionProperties(properties);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionPropertiesFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetConnectionPropertiesFile_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String propertiesFilename = null;

		fixture2.setConnectionPropertiesFile(propertiesFilename);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: name can't be null
		//       at java.io.FilePermission.init(FilePermission.java:197)
		//       at java.io.FilePermission.<init>(FilePermission.java:285)
		//       at java.lang.SecurityManager.checkRead(SecurityManager.java:888)
		//       at java.io.FileInputStream.<init>(FileInputStream.java:135)
		//       at java.io.FileInputStream.<init>(FileInputStream.java:101)
		//       at net.sourceforge.schemaspy.Config.setConnectionPropertiesFile(Config.java:497)
	}

	/**
	 * Run the void setConnectionPropertiesFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetConnectionPropertiesFile_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String propertiesFilename = null;

		fixture2.setConnectionPropertiesFile(propertiesFilename);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException: name can't be null
		//       at java.io.FilePermission.init(FilePermission.java:197)
		//       at java.io.FilePermission.<init>(FilePermission.java:285)
		//       at java.lang.SecurityManager.checkRead(SecurityManager.java:888)
		//       at java.io.FileInputStream.<init>(FileInputStream.java:135)
		//       at java.io.FileInputStream.<init>(FileInputStream.java:101)
		//       at net.sourceforge.schemaspy.Config.setConnectionPropertiesFile(Config.java:497)
	}

	/**
	 * Run the void setCss(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetCss_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String css = null;

		fixture2.setCss(css);

		// add additional test code here
	}

	/**
	 * Run the void setCss(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetCss_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String css = null;

		fixture2.setCss(css);

		// add additional test code here
	}

	/**
	 * Run the void setDb(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDb_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String db = null;

		fixture2.setDb(db);

		// add additional test code here
	}

	/**
	 * Run the void setDb(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDb_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String db = null;

		fixture2.setDb(db);

		// add additional test code here
	}

	/**
	 * Run the void setDbSpecificOptions(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDbSpecificOptions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		Map<String, String> dbSpecificOptions = null;

		fixture2.setDbSpecificOptions(dbSpecificOptions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.HashMap.<init>(HashMap.java:294)
		//       at net.sourceforge.schemaspy.Config.setDbSpecificOptions(Config.java:1456)
	}

	/**
	 * Run the void setDbSpecificOptions(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDbSpecificOptions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		Map<String, String> dbSpecificOptions = null;

		fixture2.setDbSpecificOptions(dbSpecificOptions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.util.HashMap.<init>(HashMap.java:294)
		//       at net.sourceforge.schemaspy.Config.setDbSpecificOptions(Config.java:1456)
	}

	/**
	 * Run the void setDbType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDbType_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String dbType = null;

		fixture2.setDbType(dbType);

		// add additional test code here
	}

	/**
	 * Run the void setDbType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDbType_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String dbType = null;

		fixture2.setDbType(dbType);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDescription_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String description = null;

		fixture2.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDescription_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String description = null;

		fixture2.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDriverPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDriverPath_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String driverPath = null;

		fixture2.setDriverPath(driverPath);

		// add additional test code here
	}

	/**
	 * Run the void setDriverPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetDriverPath_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String driverPath = null;

		fixture2.setDriverPath(driverPath);

		// add additional test code here
	}

	/**
	 * Run the void setEncodeCommentsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEncodeCommentsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setEncodeCommentsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEncodeCommentsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEncodeCommentsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setEncodeCommentsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setEncodeCommentsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEncodeCommentsEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setEncodeCommentsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEncodeCommentsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEncodeCommentsEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setEncodeCommentsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setEncodeCommentsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEncodeCommentsEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setEncodeCommentsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEncodeCommentsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEncodeCommentsEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setEncodeCommentsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEvaluateAllEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEvaluateAllEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setEvaluateAllEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEvaluateAllEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEvaluateAllEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setEvaluateAllEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setEvaluateAllEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEvaluateAllEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setEvaluateAllEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEvaluateAllEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEvaluateAllEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setEvaluateAllEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setEvaluateAllEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEvaluateAllEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setEvaluateAllEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setEvaluateAllEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetEvaluateAllEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setEvaluateAllEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setFont(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFont_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String font = null;

		fixture2.setFont(font);

		// add additional test code here
	}

	/**
	 * Run the void setFont(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFont_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String font = null;

		fixture2.setFont(font);

		// add additional test code here
	}

	/**
	 * Run the void setFontSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFontSize_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int fontSize = 0;

		fixture2.setFontSize(fontSize);

		// add additional test code here
	}

	/**
	 * Run the void setFontSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFontSize_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		int fontSize = 1;

		fixture2.setFontSize(fontSize);

		// add additional test code here
	}

	/**
	 * Run the void setFontSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFontSize_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int fontSize = 7;

		fixture2.setFontSize(fontSize);

		// add additional test code here
	}

	/**
	 * Run the void setFontSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFontSize_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int fontSize = 1;

		fixture2.setFontSize(fontSize);

		// add additional test code here
	}

	/**
	 * Run the void setFontSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFontSize_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		int fontSize = 7;

		fixture2.setFontSize(fontSize);

		// add additional test code here
	}

	/**
	 * Run the void setFontSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetFontSize_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		int fontSize = 0;

		fixture2.setFontSize(fontSize);

		// add additional test code here
	}

	/**
	 * Run the void setGraphvizDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetGraphvizDir_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		File graphvizDir = null;

		fixture2.setGraphvizDir(graphvizDir);

		// add additional test code here
	}

	/**
	 * Run the void setGraphvizDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetGraphvizDir_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		File graphvizDir = null;

		fixture2.setGraphvizDir(graphvizDir);

		// add additional test code here
	}

	/**
	 * Run the void setGraphvizDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetGraphvizDir_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String graphvizDir = "x\"";

		fixture2.setGraphvizDir(graphvizDir);

		// add additional test code here
	}

	/**
	 * Run the void setGraphvizDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetGraphvizDir_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String graphvizDir = "x\"";

		fixture2.setGraphvizDir(graphvizDir);

		// add additional test code here
	}

	/**
	 * Run the void setHasOrphans(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasOrphans_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean hasOrphans = false;

		fixture2.setHasOrphans(hasOrphans);

		// add additional test code here
	}

	/**
	 * Run the void setHasOrphans(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasOrphans_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean hasOrphans = true;

		fixture2.setHasOrphans(hasOrphans);

		// add additional test code here
	}

	/**
	 * Run the void setHasOrphans(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasOrphans_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean hasOrphans = false;

		fixture2.setHasOrphans(hasOrphans);

		// add additional test code here
	}

	/**
	 * Run the void setHasOrphans(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasOrphans_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean hasOrphans = true;

		fixture2.setHasOrphans(hasOrphans);

		// add additional test code here
	}

	/**
	 * Run the void setHasRoutines(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasRoutines_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean hasRoutines = false;

		fixture2.setHasRoutines(hasRoutines);

		// add additional test code here
	}

	/**
	 * Run the void setHasRoutines(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasRoutines_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean hasRoutines = true;

		fixture2.setHasRoutines(hasRoutines);

		// add additional test code here
	}

	/**
	 * Run the void setHasRoutines(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasRoutines_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean hasRoutines = false;

		fixture2.setHasRoutines(hasRoutines);

		// add additional test code here
	}

	/**
	 * Run the void setHasRoutines(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHasRoutines_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean hasRoutines = true;

		fixture2.setHasRoutines(hasRoutines);

		// add additional test code here
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHighQuality_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean highQuality = false;

		fixture2.setHighQuality(highQuality);

		// add additional test code here
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHighQuality_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean highQuality = (Boolean) null;

		fixture2.setHighQuality(highQuality);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHighQuality_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean highQuality = true;

		fixture2.setHighQuality(highQuality);

		// add additional test code here
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHighQuality_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean highQuality = (Boolean) null;

		fixture2.setHighQuality(highQuality);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHighQuality_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean highQuality = true;

		fixture2.setHighQuality(highQuality);

		// add additional test code here
	}

	/**
	 * Run the void setHighQuality(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHighQuality_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean highQuality = false;

		fixture2.setHighQuality(highQuality);

		// add additional test code here
	}

	/**
	 * Run the void setHost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHost_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String host = null;

		fixture2.setHost(host);

		// add additional test code here
	}

	/**
	 * Run the void setHost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHost_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String host = null;

		fixture2.setHost(host);

		// add additional test code here
	}

	/**
	 * Run the void setHtmlGenerationEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHtmlGenerationEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean generateHtml = false;

		fixture2.setHtmlGenerationEnabled(generateHtml);

		// add additional test code here
	}

	/**
	 * Run the void setHtmlGenerationEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHtmlGenerationEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean generateHtml = (Boolean) null;

		fixture2.setHtmlGenerationEnabled(generateHtml);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setHtmlGenerationEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHtmlGenerationEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean generateHtml = true;

		fixture2.setHtmlGenerationEnabled(generateHtml);

		// add additional test code here
	}

	/**
	 * Run the void setHtmlGenerationEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHtmlGenerationEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean generateHtml = (Boolean) null;

		fixture2.setHtmlGenerationEnabled(generateHtml);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setHtmlGenerationEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHtmlGenerationEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean generateHtml = true;

		fixture2.setHtmlGenerationEnabled(generateHtml);

		// add additional test code here
	}

	/**
	 * Run the void setHtmlGenerationEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetHtmlGenerationEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean generateHtml = false;

		fixture2.setHtmlGenerationEnabled(generateHtml);

		// add additional test code here
	}

	/**
	 * Run the void setImpliedConstraintsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetImpliedConstraintsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean includeImpliedConstraints = false;

		fixture2.setImpliedConstraintsEnabled(includeImpliedConstraints);

		// add additional test code here
	}

	/**
	 * Run the void setImpliedConstraintsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetImpliedConstraintsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean includeImpliedConstraints = (Boolean) null;

		fixture2.setImpliedConstraintsEnabled(includeImpliedConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setImpliedConstraintsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetImpliedConstraintsEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean includeImpliedConstraints = true;

		fixture2.setImpliedConstraintsEnabled(includeImpliedConstraints);

		// add additional test code here
	}

	/**
	 * Run the void setImpliedConstraintsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetImpliedConstraintsEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean includeImpliedConstraints = (Boolean) null;

		fixture2.setImpliedConstraintsEnabled(includeImpliedConstraints);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setImpliedConstraintsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetImpliedConstraintsEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean includeImpliedConstraints = true;

		fixture2.setImpliedConstraintsEnabled(includeImpliedConstraints);

		// add additional test code here
	}

	/**
	 * Run the void setImpliedConstraintsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetImpliedConstraintsEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean includeImpliedConstraints = false;

		fixture2.setImpliedConstraintsEnabled(includeImpliedConstraints);

		// add additional test code here
	}

	/**
	 * Run the void setIndirectColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetIndirectColumnExclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String fullColumnExclusions = "";

		fixture2.setIndirectColumnExclusions(fullColumnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setIndirectColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetIndirectColumnExclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String fullColumnExclusions = "0123456789";

		fixture2.setIndirectColumnExclusions(fullColumnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setIndirectColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetIndirectColumnExclusions_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String fullColumnExclusions = "";

		fixture2.setIndirectColumnExclusions(fullColumnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setIndirectColumnExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetIndirectColumnExclusions_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String fullColumnExclusions = "0123456789";

		fixture2.setIndirectColumnExclusions(fullColumnExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setInstance(Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetInstance_1()
		throws Exception {
		Config config = null;

		Config.setInstance(config);

		// add additional test code here
	}

	/**
	 * Run the void setLogLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetLogLevel_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String logLevel = "1";

		fixture2.setLogLevel(logLevel);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Invalid logLevel: '1'. Must be one of: [severe, warning, info, config, fine, finer, finest]
		//       at net.sourceforge.schemaspy.Config.setLogLevel(Config.java:1246)
	}

	/**
	 * Run the void setLogLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetLogLevel_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String logLevel = null;

		fixture2.setLogLevel(logLevel);

		// add additional test code here
	}

	/**
	 * Run the void setLogLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetLogLevel_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String logLevel = "1";

		fixture2.setLogLevel(logLevel);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.model.InvalidConfigurationException: Invalid logLevel: '1'. Must be one of: [severe, warning, info, config, fine, finer, finest]
		//       at net.sourceforge.schemaspy.Config.setLogLevel(Config.java:1246)
	}

	/**
	 * Run the void setLogLevel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetLogLevel_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String logLevel = null;

		fixture2.setLogLevel(logLevel);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDbThreads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDbThreads_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int maxDbThreads = 0;

		fixture2.setMaxDbThreads(maxDbThreads);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDbThreads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDbThreads_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		int maxDbThreads = 1;

		fixture2.setMaxDbThreads(maxDbThreads);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDbThreads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDbThreads_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int maxDbThreads = 7;

		fixture2.setMaxDbThreads(maxDbThreads);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDbThreads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDbThreads_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int maxDbThreads = 1;

		fixture2.setMaxDbThreads(maxDbThreads);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDbThreads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDbThreads_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		int maxDbThreads = 7;

		fixture2.setMaxDbThreads(maxDbThreads);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDbThreads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDbThreads_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		int maxDbThreads = 0;

		fixture2.setMaxDbThreads(maxDbThreads);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDetailedTabled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDetailedTabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int maxDetailedTables = 0;

		fixture2.setMaxDetailedTabled(maxDetailedTables);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDetailedTabled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDetailedTabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		int maxDetailedTables = 1;

		fixture2.setMaxDetailedTabled(maxDetailedTables);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDetailedTabled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDetailedTabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int maxDetailedTables = 7;

		fixture2.setMaxDetailedTabled(maxDetailedTables);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDetailedTabled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDetailedTabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		int maxDetailedTables = 1;

		fixture2.setMaxDetailedTabled(maxDetailedTables);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDetailedTabled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDetailedTabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		int maxDetailedTables = 7;

		fixture2.setMaxDetailedTabled(maxDetailedTables);

		// add additional test code here
	}

	/**
	 * Run the void setMaxDetailedTabled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMaxDetailedTabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		int maxDetailedTables = 0;

		fixture2.setMaxDetailedTabled(maxDetailedTables);

		// add additional test code here
	}

	/**
	 * Run the void setMeta(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMeta_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String meta = null;

		fixture2.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the void setMeta(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetMeta_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String meta = null;

		fixture2.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the void setNumRowsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetNumRowsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setNumRowsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setNumRowsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetNumRowsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setNumRowsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setNumRowsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetNumRowsEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setNumRowsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setNumRowsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetNumRowsEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setNumRowsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setNumRowsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetNumRowsEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setNumRowsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setNumRowsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetNumRowsEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setNumRowsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setOutputDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetOutputDir_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		File outputDir = null;

		fixture2.setOutputDir(outputDir);

		// add additional test code here
	}

	/**
	 * Run the void setOutputDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetOutputDir_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		File outputDir = null;

		fixture2.setOutputDir(outputDir);

		// add additional test code here
	}

	/**
	 * Run the void setOutputDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetOutputDir_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String outputDirName = "x\"";

		fixture2.setOutputDir(outputDirName);

		// add additional test code here
	}

	/**
	 * Run the void setOutputDir(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetOutputDir_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String outputDirName = "x\"";

		fixture2.setOutputDir(outputDirName);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPassword_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String password = null;

		fixture2.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPassword_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String password = null;

		fixture2.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setPort(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPort_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		Integer port = null;

		fixture2.setPort(port);

		// add additional test code here
	}

	/**
	 * Run the void setPort(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPort_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		Integer port = null;

		fixture2.setPort(port);

		// add additional test code here
	}

	/**
	 * Run the void setPromptForPasswordEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPromptForPasswordEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean promptForPassword = false;

		fixture2.setPromptForPasswordEnabled(promptForPassword);

		// add additional test code here
	}

	/**
	 * Run the void setPromptForPasswordEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPromptForPasswordEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean promptForPassword = (Boolean) null;

		fixture2.setPromptForPasswordEnabled(promptForPassword);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setPromptForPasswordEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPromptForPasswordEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean promptForPassword = true;

		fixture2.setPromptForPasswordEnabled(promptForPassword);

		// add additional test code here
	}

	/**
	 * Run the void setPromptForPasswordEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPromptForPasswordEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean promptForPassword = (Boolean) null;

		fixture2.setPromptForPasswordEnabled(promptForPassword);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setPromptForPasswordEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPromptForPasswordEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean promptForPassword = true;

		fixture2.setPromptForPasswordEnabled(promptForPassword);

		// add additional test code here
	}

	/**
	 * Run the void setPromptForPasswordEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetPromptForPasswordEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean promptForPassword = false;

		fixture2.setPromptForPasswordEnabled(promptForPassword);

		// add additional test code here
	}

	/**
	 * Run the void setRailsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRailsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setRailsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRailsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRailsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setRailsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setRailsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRailsEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setRailsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRailsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRailsEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setRailsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setRailsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRailsEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setRailsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRailsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRailsEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setRailsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRankDirBugEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRankDirBugEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setRankDirBugEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRankDirBugEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRankDirBugEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setRankDirBugEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setRankDirBugEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRankDirBugEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setRankDirBugEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRankDirBugEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRankDirBugEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setRankDirBugEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setRankDirBugEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRankDirBugEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setRankDirBugEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRankDirBugEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRankDirBugEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setRankDirBugEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRenderer_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String renderer = "";

		fixture2.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRenderer_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String renderer = "0123456789";

		fixture2.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRenderer_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String renderer = "";

		fixture2.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetRenderer_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String renderer = "0123456789";

		fixture2.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSchema_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String schema = null;

		fixture2.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchema(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSchema_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String schema = null;

		fixture2.setSchema(schema);

		// add additional test code here
	}

	/**
	 * Run the void setSchemaSpec(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSchemaSpec_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String schemaSpec = null;

		fixture2.setSchemaSpec(schemaSpec);

		// add additional test code here
	}

	/**
	 * Run the void setSchemaSpec(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSchemaSpec_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String schemaSpec = null;

		fixture2.setSchemaSpec(schemaSpec);

		// add additional test code here
	}

	/**
	 * Run the void setServer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetServer_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String server = null;

		fixture2.setServer(server);

		// add additional test code here
	}

	/**
	 * Run the void setServer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetServer_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String server = null;

		fixture2.setServer(server);

		// add additional test code here
	}

	/**
	 * Run the void setSingleSignOn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSingleSignOn_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setSingleSignOn(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setSingleSignOn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSingleSignOn_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setSingleSignOn(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setSingleSignOn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSingleSignOn_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setSingleSignOn(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setSingleSignOn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSingleSignOn_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setSingleSignOn(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setSingleSignOn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSingleSignOn_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setSingleSignOn(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setSingleSignOn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSingleSignOn_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setSingleSignOn(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setSqlFormatter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSqlFormatter_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String formatterClassName = "";

		fixture2.setSqlFormatter(formatterClassName);

		// add additional test code here
	}

	/**
	 * Run the void setSqlFormatter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSqlFormatter_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String formatterClassName = "0123456789";

		fixture2.setSqlFormatter(formatterClassName);

		// add additional test code here
	}

	/**
	 * Run the void setSqlFormatter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSqlFormatter_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String formatterClassName = "";

		fixture2.setSqlFormatter(formatterClassName);

		// add additional test code here
	}

	/**
	 * Run the void setSqlFormatter(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSqlFormatter_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String formatterClassName = "0123456789";

		fixture2.setSqlFormatter(formatterClassName);

		// add additional test code here
	}

	/**
	 * Run the void setSqlFormatter(SqlFormatter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSqlFormatter_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		SqlFormatter sqlFormatter = null;

		fixture2.setSqlFormatter(sqlFormatter);

		// add additional test code here
	}

	/**
	 * Run the void setSqlFormatter(SqlFormatter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetSqlFormatter_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		SqlFormatter sqlFormatter = null;

		fixture2.setSqlFormatter(sqlFormatter);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableExclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String tableExclusions = "";

		fixture2.setTableExclusions(tableExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableExclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String tableExclusions = "0123456789";

		fixture2.setTableExclusions(tableExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableExclusions_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String tableExclusions = "";

		fixture2.setTableExclusions(tableExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableExclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableExclusions_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String tableExclusions = "0123456789";

		fixture2.setTableExclusions(tableExclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableInclusions_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String tableInclusions = "";

		fixture2.setTableInclusions(tableInclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableInclusions_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String tableInclusions = "0123456789";

		fixture2.setTableInclusions(tableInclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableInclusions_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		String tableInclusions = "";

		fixture2.setTableInclusions(tableInclusions);

		// add additional test code here
	}

	/**
	 * Run the void setTableInclusions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetTableInclusions_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String tableInclusions = "0123456789";

		fixture2.setTableInclusions(tableInclusions);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetUser_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		String user = null;

		fixture2.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetUser_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		String user = null;

		fixture2.setUser(user);

		// add additional test code here
	}

	/**
	 * Run the void setViewsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetViewsEnabled_fixtureInstance_1()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = false;

		fixture2.setViewsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setViewsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetViewsEnabled_fixture_1()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = (Boolean) null;

		fixture2.setViewsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setViewsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetViewsEnabled_fixtureInstance_2()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = true;

		fixture2.setViewsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setViewsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetViewsEnabled_fixtureInstance_3()
		throws Exception {
		Config fixture2 = getFixtureInstance();
		boolean enabled = (Boolean) null;

		fixture2.setViewsEnabled(enabled);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
	}

	/**
	 * Run the void setViewsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetViewsEnabled_fixture_2()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = true;

		fixture2.setViewsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Run the void setViewsEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	@Test
	public void testSetViewsEnabled_fixture_3()
		throws Exception {
		Config fixture2 = getFixture();
		boolean enabled = false;

		fixture2.setViewsEnabled(enabled);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:23 PM
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
	 * @generatedBy CodePro at 6/7/15 4:23 PM
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
	 * @generatedBy CodePro at 6/7/15 4:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConfigTest.class);
	}
}