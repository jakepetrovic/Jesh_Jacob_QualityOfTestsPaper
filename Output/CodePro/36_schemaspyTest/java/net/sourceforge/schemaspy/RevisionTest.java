package net.sourceforge.schemaspy;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RevisionTest</code> contains tests for the class <code>{@link Revision}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class RevisionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Revision
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private Revision fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Revision
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public Revision getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new Revision();
		}
		return fixture;
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		Revision fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("Unknown", result);
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
		new org.junit.runner.JUnitCore().run(RevisionTest.class);
	}
}