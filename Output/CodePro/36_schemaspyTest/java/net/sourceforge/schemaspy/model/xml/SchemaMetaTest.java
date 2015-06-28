package net.sourceforge.schemaspy.model.xml;

import java.io.File;
import java.util.List;
import org.junit.*;
import net.sourceforge.schemaspy.model.InvalidConfigurationException;
import static org.junit.Assert.*;

/**
 * The class <code>SchemaMetaTest</code> contains tests for the class <code>{@link SchemaMeta}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SchemaMetaTest {
	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_1()
		throws Exception {
		String xmlMeta = "";
		String dbName = "";
		String schema = "1";

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_2()
		throws Exception {
		String xmlMeta = "0123456789";
		String dbName = "0123456789";
		String schema = null;

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_3()
		throws Exception {
		String xmlMeta = "0123456789";
		String dbName = "0123456789";
		String schema = "1";

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_4()
		throws Exception {
		String xmlMeta = "0123456789";
		String dbName = "";
		String schema = null;

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_5()
		throws Exception {
		String xmlMeta = "0123456789";
		String dbName = "";
		String schema = "1";

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_6()
		throws Exception {
		String xmlMeta = "";
		String dbName = "0123456789";
		String schema = null;

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_7()
		throws Exception {
		String xmlMeta = "";
		String dbName = "0123456789";
		String schema = "1";

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SchemaMeta(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test(expected = net.sourceforge.schemaspy.model.InvalidConfigurationException.class)
	public void testSchemaMeta_8()
		throws Exception {
		String xmlMeta = "";
		String dbName = "";
		String schema = null;

		SchemaMeta result = new SchemaMeta(xmlMeta, dbName, schema);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SchemaMetaTest.class);
	}
}