package net.sourceforge.schemaspy.view;

import org.junit.*;
import net.sourceforge.schemaspy.util.LineWriter;
import static org.junit.Assert.*;

/**
 * The class <code>StyleSheetTest</code> contains tests for the class <code>{@link StyleSheet}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class StyleSheetTest {
	/**
	 * Run the StyleSheet getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		StyleSheet result = StyleSheet.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    net.sourceforge.schemaspy.view.StyleSheet$ParseException: Unable to find requested style sheet: schemaSpy.css
		//       at net.sourceforge.schemaspy.view.StyleSheet.getReader(StyleSheet.java:153)
		//       at net.sourceforge.schemaspy.view.StyleSheet.getInstance(StyleSheet.java:120)
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
		new org.junit.runner.JUnitCore().run(StyleSheetTest.class);
	}
}