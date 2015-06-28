package net.sourceforge.schemaspy;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MultipleSchemaAnalyzerTest</code> contains tests for the class <code>{@link MultipleSchemaAnalyzer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:24 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MultipleSchemaAnalyzerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MultipleSchemaAnalyzer
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	private MultipleSchemaAnalyzer fixtureInstance;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MultipleSchemaAnalyzer
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	public MultipleSchemaAnalyzer getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = MultipleSchemaAnalyzer.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_1()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("");
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_2()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("");
		schemas.add("0123456789");
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_3()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("0123456789");
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_4()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("");
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_5()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("");
		schemas.add("0123456789");
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_6()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("0123456789");
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_7()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> schemas = new Vector<String>();
		schemas.add("");
		Vector<String> args = new Vector<String>();
		args.add("");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_8()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> schemas = new Vector<String>();
		schemas.add("");
		schemas.add("0123456789");
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_9()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> schemas = new Vector<String>();
		schemas.add("0123456789");
		Vector<String> args = new Vector<String>();
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_10()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> schemas = new ArrayList<String>();
		List<String> args = new ArrayList<String>();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_11()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		List<String> schemas = new LinkedList<String>();
		List<String> args = new LinkedList<String>();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_12()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> schemas = new Vector<String>();
		List<String> args = new Vector<String>();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_13()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("");
		schemas.add("0123456789");
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_14()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("0123456789");
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_15()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("");
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_16()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("");
		schemas.add("0123456789");
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_17()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("0123456789");
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_18()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> schemas = new Vector<String>();
		schemas.add("");
		Vector<String> args = new Vector<String>();
		args.add("");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_19()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> schemas = new Vector<String>();
		schemas.add("");
		schemas.add("0123456789");
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_20()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> schemas = new Vector<String>();
		schemas.add("0123456789");
		Vector<String> args = new Vector<String>();
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_21()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> schemas = new ArrayList<String>();
		List<String> args = new ArrayList<String>();
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_22()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		List<String> schemas = new LinkedList<String>();
		List<String> args = new LinkedList<String>();
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_23()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		List<String> schemas = new Vector<String>();
		List<String> args = new Vector<String>();
		Config config = new Config();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_24()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("");
		schemas.add("0123456789");
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_25()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		ArrayList<String> schemas = new ArrayList<String>();
		schemas.add("0123456789");
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_26()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("");
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_27()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("");
		schemas.add("0123456789");
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_28()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		LinkedList<String> schemas = new LinkedList<String>();
		schemas.add("0123456789");
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_29()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "";
		Vector<String> schemas = new Vector<String>();
		schemas.add("");
		Vector<String> args = new Vector<String>();
		args.add("");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_30()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "0123456789";
		Vector<String> schemas = new Vector<String>();
		schemas.add("");
		schemas.add("0123456789");
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:170)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_31()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_32()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_33()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_34()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_35()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_36()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_37()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_38()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_39()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("0123456789");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_40()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		List<String> args = new ArrayList<String>();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_41()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		List<String> args = new LinkedList<String>();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_42()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		List<String> args = new Vector<String>();
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_43()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_44()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_45()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_46()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_47()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_48()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_49()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_50()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("0123456789");
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_51()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		List<String> args = new ArrayList<String>();
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_52()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		List<String> args = new LinkedList<String>();
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_53()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "0123456789";
		List<String> schemas = null;
		List<String> args = new Vector<String>();
		Config config = new Config();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.Config$MissingRequiredParameterException: Required parameter '-o' was not specified.
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1509)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_54()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("");
		Config config = new Config(new String[] {"", "0123456789", "An��t-1.0.txt", null});

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.fixupArgs(Config.java:1554)
		//       at net.sourceforge.schemaspy.Config.<init>(Config.java:149)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_55()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		ArrayList<String> args = new ArrayList<String>();
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_56()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_57()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("");
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_58()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		LinkedList<String> args = new LinkedList<String>();
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_59()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = null;
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the void analyze(String,DatabaseMetaData,String,List<String>,List<String>,Config) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testAnalyze_fixtureInstance_60()
		throws Exception {
		MultipleSchemaAnalyzer fixture = getFixtureInstance();
		String dbName = "1";
		DatabaseMetaData meta = null;
		String schemaSpec = "";
		List<String> schemas = null;
		Vector<String> args = new Vector<String>();
		args.add("");
		args.add("0123456789");
		Config config = Config.getInstance();

		fixture.analyze(dbName, meta, schemaSpec, schemas, args, config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.Config.pullParam(Config.java:1506)
		//       at net.sourceforge.schemaspy.Config.pullRequiredParam(Config.java:1494)
		//       at net.sourceforge.schemaspy.Config.getOutputDir(Config.java:213)
		//       at net.sourceforge.schemaspy.MultipleSchemaAnalyzer.analyze(MultipleSchemaAnalyzer.java:61)
	}

	/**
	 * Run the MultipleSchemaAnalyzer getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		MultipleSchemaAnalyzer result = MultipleSchemaAnalyzer.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
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
	 * @generatedBy CodePro at 6/7/15 4:24 PM
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
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MultipleSchemaAnalyzerTest.class);
	}
}