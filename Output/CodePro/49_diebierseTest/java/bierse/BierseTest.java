package bierse;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BierseTest</code> contains tests for the class <code>{@link Bierse}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BierseTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		Bierse.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		//       at bierse.Bierse.main(Bierse.java:16)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {""};

		Bierse.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		//       at bierse.Bierse.main(Bierse.java:16)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {"0123456789"};

		Bierse.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.model.Settings.<init>(Settings.java:59)
		//       at bierse.model.Model.<init>(Model.java:69)
		//       at bierse.Bierse.main(Bierse.java:16)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
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
	 * @generatedBy CodePro at 5/31/15 5:22 PM
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
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BierseTest.class);
	}
}