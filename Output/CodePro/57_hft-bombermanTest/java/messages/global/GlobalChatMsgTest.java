package messages.global;

import org.junit.*;
import server.ClientInfo;
import client.BomberClient;
import server.BomberServer;
import static org.junit.Assert.*;

/**
 * The class <code>GlobalChatMsgTest</code> contains tests for the class <code>{@link GlobalChatMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GlobalChatMsgTest {
	/**
	 * Run the GlobalChatMsg(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_1()
		throws Exception {
		String msg = "";

		GlobalChatMsg result = new GlobalChatMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
		assertNotNull(result);
	}

	/**
	 * Run the GlobalChatMsg(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_2()
		throws Exception {
		String msg = "0123456789";

		GlobalChatMsg result = new GlobalChatMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
		assertNotNull(result);
	}

	/**
	 * Run the GlobalChatMsg(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_3()
		throws Exception {
		String msg = "1";

		GlobalChatMsg result = new GlobalChatMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
		assertNotNull(result);
	}

	/**
	 * Run the GlobalChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_4()
		throws Exception {
		String sender = "";
		String msg = "";

		GlobalChatMsg result = new GlobalChatMsg(sender, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
		assertNotNull(result);
	}

	/**
	 * Run the GlobalChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_5()
		throws Exception {
		String sender = "0123456789";
		String msg = "0123456789";

		GlobalChatMsg result = new GlobalChatMsg(sender, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
		assertNotNull(result);
	}

	/**
	 * Run the GlobalChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_6()
		throws Exception {
		String sender = "0123456789";
		String msg = "";

		GlobalChatMsg result = new GlobalChatMsg(sender, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
		assertNotNull(result);
	}

	/**
	 * Run the GlobalChatMsg(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGlobalChatMsg_7()
		throws Exception {
		String sender = "";
		String msg = "0123456789";

		GlobalChatMsg result = new GlobalChatMsg(sender, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
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
		new org.junit.runner.JUnitCore().run(GlobalChatMsgTest.class);
	}
}