package bierse;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BierseTest</code> contains tests for the class <code>{@link Bierse}</code>.
 *
 * @generatedBy CodePro at 4/23/14 8:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BierseTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 8:12 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {"", "0123456789", "An??t-1.0.txt", null};

		Bierse.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 8:12 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {""};

		Bierse.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 8:12 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {"0123456789"};

		Bierse.main(args);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 8:12 PM
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
	 * @generatedBy CodePro at 4/23/14 8:12 PM
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
	 * @generatedBy CodePro at 4/23/14 8:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BierseTest.class);
	}
}