package messages.session;

import java.net.Socket;
import java.util.ArrayList;
import server.ClientInfo;
import java.util.LinkedList;
import java.util.List;
import server.ServerGameSession;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SessionStateMsgTest</code> contains tests for the class <code>{@link SessionStateMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SessionStateMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionStateMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private SessionStateMsg fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionStateMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public SessionStateMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SessionStateMsg(1);
		}
		return fixture;
	}

	/**
	 * Run the SessionStateMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testSessionStateMsg_1()
		throws Exception {
		int type = 1;

		SessionStateMsg result = new SessionStateMsg(type);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		SessionStateMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("0123456789", list, new ImageIcon("", ""), 1, 1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.GameSession.<clinit>(GameSession.java:20)
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_2()
		throws Exception {
		SessionStateMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(""), 0, 0);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_3()
		throws Exception {
		SessionStateMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_4()
		throws Exception {
		SessionStateMsg fixture2 = getFixture();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession session = new ServerGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_5()
		throws Exception {
		SessionStateMsg fixture2 = getFixture();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ServerGameSession session = new ServerGameSession((String) null, list, new ImageIcon(), -1, -1);
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(session, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
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
		new org.junit.runner.JUnitCore().run(SessionStateMsgTest.class);
	}
}