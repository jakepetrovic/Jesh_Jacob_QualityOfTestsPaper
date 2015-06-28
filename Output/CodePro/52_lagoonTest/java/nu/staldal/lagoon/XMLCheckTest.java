package nu.staldal.lagoon;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XMLCheckTest</code> contains tests for the class <code>{@link XMLCheck}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:36 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLCheckTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		XMLCheck.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.XMLCheck.main(XMLCheck.java:68)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {""};

		XMLCheck.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Runtime.java:107)
		//       at java.lang.System.exit(System.java:962)
		//       at nu.staldal.lagoon.XMLCheck.main(XMLCheck.java:85)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {"0123456789"};

		XMLCheck.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Runtime.java:107)
		//       at java.lang.System.exit(System.java:962)
		//       at nu.staldal.lagoon.XMLCheck.main(XMLCheck.java:85)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:36 PM
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
	 * @generatedBy CodePro at 6/28/15 2:36 PM
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
	 * @generatedBy CodePro at 6/28/15 2:36 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XMLCheckTest.class);
	}
}