package server.network;

import java.net.Socket;
import org.junit.*;
import server.ClientInfo;
import messages.Message;
import static org.junit.Assert.*;

/**
 * The class <code>ServerMsgReceiverTest</code> contains tests for the class <code>{@link ServerMsgReceiver}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerMsgReceiverTest {
	/**
	 * Run the ServerMsgReceiver(ClientInfo) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testServerMsgReceiver_1()
		throws Exception {
		ClientInfo clientInfo = new ClientInfo(new Socket("", 0));

		ServerMsgReceiver result = new ServerMsgReceiver(clientInfo);

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
		new org.junit.runner.JUnitCore().run(ServerMsgReceiverTest.class);
	}
}