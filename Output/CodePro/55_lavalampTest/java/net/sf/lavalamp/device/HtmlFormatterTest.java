package net.sf.lavalamp.device;

import java.util.List;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HtmlFormatterTest</code> contains tests for the class <code>{@link HtmlFormatter}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HtmlFormatterTest {
	/**
	 * Run the HtmlFormatter(List<Device>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testHtmlFormatter_1()
		throws Exception {
		List<Device> devices = new Vector();

		HtmlFormatter result = new HtmlFormatter(devices);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toHtml());
	}

	/**
	 * Run the String toHtml() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testToHtml_1()
		throws Exception {
		HtmlFormatter fixture = new HtmlFormatter(new Vector());

		String result = fixture.toHtml();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toHtml() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testToHtml_2()
		throws Exception {
		HtmlFormatter fixture = new HtmlFormatter(new Vector());

		String result = fixture.toHtml();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HtmlFormatterTest.class);
	}
}