package net.sf.lavalamp.properties;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OffTest</code> contains tests for the class <code>{@link Off}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OffTest {
	/**
	 * Run the Off() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testOff_1()
		throws Exception {
		Off result = new Off();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getEnd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetEnd_1()
		throws Exception {
		Off fixture = new Off();
		fixture.setEnd("");
		fixture.setStart("");

		String result = fixture.getEnd();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetStart_1()
		throws Exception {
		Off fixture = new Off();
		fixture.setEnd("");
		fixture.setStart("");

		String result = fixture.getStart();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setEnd(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetEnd_1()
		throws Exception {
		Off fixture = new Off();
		fixture.setEnd("");
		fixture.setStart("");
		String end = "";

		fixture.setEnd(end);

		// add additional test code here
	}

	/**
	 * Run the void setStart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetStart_1()
		throws Exception {
		Off fixture = new Off();
		fixture.setEnd("");
		fixture.setStart("");
		String start = "";

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Off fixture = new Off();
		fixture.setEnd("");
		fixture.setStart("");

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OffTest.class);
	}
}