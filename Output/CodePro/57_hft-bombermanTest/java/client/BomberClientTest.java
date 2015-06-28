package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import messages.global.MapInfo;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.SessionDetailsMsg;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BomberClientTest</code> contains tests for the class <code>{@link BomberClient}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BomberClientTest {
	/**
	 * Run the BomberClient getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		BomberClient result = BomberClient.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.BomberClient
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BomberClientTest.class);
	}
}