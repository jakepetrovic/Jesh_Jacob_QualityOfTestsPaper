package common;

import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.NodeList;

/**
 * The class <code>XmlFunctionsTest</code> contains tests for the class <code>{@link XmlFunctions}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XmlFunctionsTest {
	/**
	 * Run the XmlFunctions(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testXmlFunctions_1()
		throws Exception {
		String XmlFileName = "";

		XmlFunctions result = new XmlFunctions(XmlFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.XmlFunctions
		assertNotNull(result);
	}

	/**
	 * Run the XmlFunctions(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testXmlFunctions_2()
		throws Exception {
		String XmlFileName = "0123456789";

		XmlFunctions result = new XmlFunctions(XmlFileName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.XmlFunctions
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XmlFunctionsTest.class);
	}
}