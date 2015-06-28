package server;

import org.junit.*;
import messages.Message;
import static org.junit.Assert.*;

/**
 * The class <code>StopServerTest</code> contains tests for the class <code>{@link StopServer}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class StopServerTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public StopServerTest(String name) {
	}

	/**
	 * Run the StopServer() constructor test.
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testStopServer_1()
		throws Exception {
		StopServer result = new StopServer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {"", "0123456789", "An��t-1.0.txt", null};

		StopServer.main(args);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StopServerTest.class);
	}
}