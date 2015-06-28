package server;

import java.awt.Point;
import java.net.Socket;
import java.util.HashMap;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;
import common.GameObject;

/**
 * The class <code>ServerGameRoundTest</code> contains tests for the class <code>{@link ServerGameRound}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerGameRoundTest {
	/**
	 * Run the ServerGameRound(ServerGameSession,Vector<ClientInfo>,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameRound_1()
		throws Exception {
		ServerGameSession session = null;
		Vector<ClientInfo> participants = new Vector<ClientInfo>();
		participants.add(new ClientInfo(new Socket("", 0)));
		String mapName = "";

		ServerGameRound result = new ServerGameRound(session, participants, mapName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.NoRouteToHostException: Can't assign requested address
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
		assertNotNull(result);
	}

	/**
	 * Run the ServerGameRound(ServerGameSession,Vector<ClientInfo>,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameRound_2()
		throws Exception {
		ServerGameSession session = null;
		Vector<ClientInfo> participants = new Vector<ClientInfo>();
		String mapName = "0123456789";

		ServerGameRound result = new ServerGameRound(session, participants, mapName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameRound
		assertNotNull(result);
	}

	/**
	 * Run the ServerGameRound(ServerGameSession,Vector<ClientInfo>,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameRound_3()
		throws Exception {
		ServerGameSession session = null;
		Vector<ClientInfo> participants = new Vector<ClientInfo>();
		String mapName = "";

		ServerGameRound result = new ServerGameRound(session, participants, mapName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameRound
		assertNotNull(result);
	}

	/**
	 * Run the ServerGameRound(ServerGameSession,Vector<ClientInfo>,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameRound_4()
		throws Exception {
		ServerGameSession session = null;
		Vector<ClientInfo> participants = new Vector<ClientInfo>();
		participants.add(new ClientInfo(new Socket("", 0)));
		String mapName = "0123456789";

		ServerGameRound result = new ServerGameRound(session, participants, mapName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.NoRouteToHostException: Can't assign requested address
		//       at java.net.PlainSocketImpl.socketConnect(Native Method)
		//       at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)
		//       at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)
		//       at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)
		//       at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
		//       at java.net.Socket.connect(Socket.java:579)
		//       at java.net.Socket.connect(Socket.java:528)
		//       at java.net.Socket.<init>(Socket.java:425)
		//       at java.net.Socket.<init>(Socket.java:208)
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
		new org.junit.runner.JUnitCore().run(ServerGameRoundTest.class);
	}
}