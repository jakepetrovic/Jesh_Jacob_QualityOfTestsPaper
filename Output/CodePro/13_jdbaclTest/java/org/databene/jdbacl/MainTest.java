package org.databene.jdbacl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MainTest</code> contains tests for the class <code>{@link Main}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:02 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MainTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		Main.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: Error parsing pom.xml
		//       at org.databene.commons.xml.XMLUtil.parse(XMLUtil.java:242)
		//       at org.databene.commons.xml.XMLUtil.parse(XMLUtil.java:233)
		//       at org.databene.commons.version.VersionInfo.readVersionInfo(VersionInfo.java:131)
		//       at org.databene.commons.version.VersionInfo.<init>(VersionInfo.java:75)
		//       at org.databene.commons.version.VersionInfo.getInfo(VersionInfo.java:66)
		//       at org.databene.jdbacl.Main.printHelp(Main.java:67)
		//       at org.databene.jdbacl.Main.printErrorAndHelpAndExit(Main.java:57)
		//       at org.databene.jdbacl.Main.main(Main.java:50)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {""};

		Main.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		//       at org.databene.jdbacl.DBUtil.getMetaData(DBUtil.java:660)
		//       at org.databene.jdbacl.Main.main(Main.java:51)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {"0123456789"};

		Main.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '0123456789.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		//       at org.databene.jdbacl.DBUtil.getMetaData(DBUtil.java:660)
		//       at org.databene.jdbacl.Main.main(Main.java:51)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:02 PM
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
	 * @generatedBy CodePro at 6/7/15 8:02 PM
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
	 * @generatedBy CodePro at 6/7/15 8:02 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MainTest.class);
	}
}