package nu.staldal.lagoon.producer;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MyInputStreamTest</code> contains tests for the class <code>{@link MyInputStream}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:39 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MyInputStreamTest {
	/**
	 * Run the MyInputStream() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	@Test
	public void testMyInputStream_1()
		throws Exception {

		MyInputStream result = new MyInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:39 PM
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
	 * @generatedBy CodePro at 6/28/15 2:39 PM
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
	 * @generatedBy CodePro at 6/28/15 2:39 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MyInputStreamTest.class);
	}
}