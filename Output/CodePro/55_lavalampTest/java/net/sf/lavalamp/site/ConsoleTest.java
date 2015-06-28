package net.sf.lavalamp.site;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConsoleTest</code> contains tests for the class <code>{@link Console}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ConsoleTest {
	/**
	 * Run the String readLine(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testReadLine_1()
		throws Exception {
		Console fixture = new Console();
		String fmt = "";

		String result = fixture.readLine(fmt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.Console.readLine(Console.java:8)
		assertNotNull(result);
	}

	/**
	 * Run the char[] readPassword(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testReadPassword_1()
		throws Exception {
		Console fixture = new Console();
		String fmt = "";

		char[] result = fixture.readPassword(fmt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.Console.readPassword(Console.java:5)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConsoleTest.class);
	}
}