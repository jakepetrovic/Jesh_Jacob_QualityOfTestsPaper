package net.sourceforge.schemaspy.view;

import org.junit.*;
import net.sourceforge.schemaspy.util.Dot;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlDiagramFormatterTest</code> contains tests for the class <code>{@link HtmlDiagramFormatter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:20 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlDiagramFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HtmlDiagramFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	private HtmlDiagramFormatter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HtmlDiagramFormatter
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public HtmlDiagramFormatter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new HtmlDiagramFormatter();
		}
		return fixture;
	}

	/**
	 * Run the HtmlDiagramFormatter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testHtmlDiagramFormatter_1()
		throws Exception {

		HtmlDiagramFormatter result = new HtmlDiagramFormatter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Dot getDot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testGetDot_fixture_1()
		throws Exception {
		HtmlDiagramFormatter fixture2 = getFixture();

		Dot result = fixture2.getDot();

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(HtmlDiagramFormatterTest.class);
	}
}