package client.network;

import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import org.junit.*;
import client.BomberClient;
import messages.Message;
import static org.junit.Assert.*;

/**
 * The class <code>ClientMsgReceiverTest</code> contains tests for the class <code>{@link ClientMsgReceiver}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ClientMsgReceiverTest {
	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_1()
		throws Exception {
		Socket socket = new Socket("", 0);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

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
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_2()
		throws Exception {
		Socket socket = new Socket("", 0, InetAddress.getByAddress("", new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 0);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_3()
		throws Exception {
		Socket socket = new Socket("0123456789", 1);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_4()
		throws Exception {
		Socket socket = new Socket("0123456789", 1, InetAddress.getByAddress("0123456789", new byte[] {(byte) -1}), 1);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_5()
		throws Exception {
		Socket socket = new Socket("An��t-1.0.txt", 7, InetAddress.getByAddress(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 7);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1411)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_6()
		throws Exception {
		Socket socket = new Socket();
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.BomberClient.<clinit>(BomberClient.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_7()
		throws Exception {
		Socket socket = new Socket(InetAddress.getByAddress("", new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 0);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_8()
		throws Exception {
		Socket socket = new Socket(InetAddress.getByAddress("", new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 0, InetAddress.getByAddress("", new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 0);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_9()
		throws Exception {
		Socket socket = new Socket(InetAddress.getByAddress("0123456789", new byte[] {(byte) -1}), 1);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_10()
		throws Exception {
		Socket socket = new Socket(InetAddress.getByAddress("0123456789", new byte[] {(byte) -1}), 1, InetAddress.getByAddress("0123456789", new byte[] {(byte) -1}), 1);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_11()
		throws Exception {
		Socket socket = new Socket(InetAddress.getByAddress(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 7, InetAddress.getByAddress(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), 7);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.net.UnknownHostException: addr is of illegal length
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1014)
		//       at java.net.InetAddress.getByAddress(InetAddress.java:1411)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_12()
		throws Exception {
		Socket socket = new Socket(InetAddress.getByName(""), -1, InetAddress.getByName(""), -1);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: port out of range:-1
		//       at java.net.InetSocketAddress.checkPort(InetSocketAddress.java:143)
		//       at java.net.InetSocketAddress.<init>(InetSocketAddress.java:185)
		//       at java.net.Socket.<init>(Socket.java:319)
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_13()
		throws Exception {
		Socket socket = new Socket(Proxy.NO_PROXY);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.BomberClient
		assertNotNull(result);
	}

	/**
	 * Run the ClientMsgReceiver(Socket,BomberClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testClientMsgReceiver_14()
		throws Exception {
		Socket socket = new Socket((String) null, -1, InetAddress.getByName(""), -1);
		BomberClient bomberClient = BomberClient.getInstance();

		ClientMsgReceiver result = new ClientMsgReceiver(socket, bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: port out of range:-1
		//       at java.net.InetSocketAddress.checkPort(InetSocketAddress.java:143)
		//       at java.net.InetSocketAddress.<init>(InetSocketAddress.java:185)
		//       at java.net.Socket.<init>(Socket.java:280)
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
		new org.junit.runner.JUnitCore().run(ClientMsgReceiverTest.class);
	}
}