package messages.round;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import server.ServerGameSession;
import java.util.Vector;
import javax.swing.ImageIcon;
import server.ServerGameRound;
import server.ClientInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClientQuitRunningSessionMsgTest</code> contains tests for the class <code>{@link ClientQuitRunningSessionMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ClientQuitRunningSessionMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ClientQuitRunningSessionMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private ClientQuitRunningSessionMsg fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ClientQuitRunningSessionMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public ClientQuitRunningSessionMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ClientQuitRunningSessionMsg(0);
		}
		return fixture;
	}

	/**
	 * Run the ClientQuitRunningSessionMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientQuitRunningSessionMsg_1()
		throws Exception {
		int playerId = 0;

		ClientQuitRunningSessionMsg result = new ClientQuitRunningSessionMsg(playerId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClientQuitRunningSessionMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientQuitRunningSessionMsg_2()
		throws Exception {
		int playerId = 1;

		ClientQuitRunningSessionMsg result = new ClientQuitRunningSessionMsg(playerId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClientQuitRunningSessionMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientQuitRunningSessionMsg_3()
		throws Exception {
		int playerId = 7;

		ClientQuitRunningSessionMsg result = new ClientQuitRunningSessionMsg(playerId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(ServerGameRound,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		ClientQuitRunningSessionMsg fixture2 = getFixture();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("");
		list2.add("0123456789");
		ServerGameSession serverGameSession = new ServerGameSession("0123456789", list2, new ImageIcon("", ""), 1, 1);
		Vector<ClientInfo> list = new Vector<ClientInfo>();
		list.add(new ClientInfo(new Socket("", 0)));
		ServerGameRound round = new ServerGameRound(serverGameSession, list, "");
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(round, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.GameSession.<clinit>(GameSession.java:20)
	}

	/**
	 * Run the void execute(ServerGameRound,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture_2()
		throws Exception {
		ClientQuitRunningSessionMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ServerGameSession serverGameSession = new ServerGameSession("", list, new ImageIcon(""), 0, 0);
		ServerGameRound round = new ServerGameRound(serverGameSession, new Vector<ClientInfo>(), "0123456789");
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(round, sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
	}

	/**
	 * Run the void execute(ServerGameRound,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture_3()
		throws Exception {
		ClientQuitRunningSessionMsg fixture2 = getFixture();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("0123456789");
		ServerGameSession serverGameSession = new ServerGameSession("An��t-1.0.txt", list2, new ImageIcon("0123456789", "0123456789"), 7, 7);
		Vector<ClientInfo> list = new Vector<ClientInfo>();
		list.add((ClientInfo) null);
		ServerGameRound round = new ServerGameRound(serverGameSession, list, "An��t-1.0.txt");
		ClientInfo sender = new ClientInfo(new Socket("", 0));

		fixture2.execute(round, sender);

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
		new org.junit.runner.JUnitCore().run(ClientQuitRunningSessionMsgTest.class);
	}
}