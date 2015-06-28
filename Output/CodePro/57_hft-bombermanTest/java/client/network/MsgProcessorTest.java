package client.network;

import org.junit.*;
import messages.Message;
import messages.round.RoundTimeOverMsg;
import messages.session.PlayerLeftMsg;
import messages.global.GlobalChatMsg;
import messages.global.JoinSessionMsg;
import messages.session.SessionChatMsg;
import messages.global.SessionListMsg;
import messages.global.StopServerMsg;
import static org.junit.Assert.*;

/**
 * The class <code>MsgProcessorTest</code> contains tests for the class <code>{@link MsgProcessor}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MsgProcessorTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MsgProcessor
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private MsgProcessor fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MsgProcessor
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public MsgProcessor getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new GeneralMsgProcessor();
		}
		return fixture;
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_1()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new GlobalChatMsg("");

		fixture2.processMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at messages.global.GlobalChatMsg.<clinit>(GlobalChatMsg.java:20)
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_2()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new GlobalChatMsg("", "");

		fixture2.processMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_3()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new GlobalChatMsg("0123456789", "0123456789");

		fixture2.processMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.global.GlobalChatMsg
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_4()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new JoinSessionMsg("", "");

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_5()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new JoinSessionMsg("0123456789", "0123456789");

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_6()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new SessionListMsg();

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_7()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new StopServerMsg();

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_8()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new RoundTimeOverMsg();

		fixture2.processMsg(msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at messages.round.RoundTimeOverMsg.<clinit>(RoundTimeOverMsg.java:15)
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_9()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new PlayerLeftMsg();

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_10()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new SessionChatMsg("");

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_11()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new SessionChatMsg("", "");

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Run the void processMsg(Message) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testProcessMsg_fixture_12()
		throws Exception {
		MsgProcessor fixture2 = getFixture();
		Message msg = new SessionChatMsg("0123456789", "0123456789");

		fixture2.processMsg(msg);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MsgProcessorTest.class);
	}
}