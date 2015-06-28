package messages.session;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import client.ClientGameSession;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SessionServerMsgTest</code> contains tests for the class <code>{@link SessionServerMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SessionServerMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionServerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private SessionServerMsg fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionServerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private SessionServerMsg fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionServerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private SessionServerMsg fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionServerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public SessionServerMsg getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SessionChatMsg("");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionServerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public SessionServerMsg getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SessionChatMsg("", "");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionServerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public SessionServerMsg getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new SessionChatMsg("0123456789", "0123456789");
		}
		return fixture3;
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_1()
		throws Exception {
		SessionServerMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.GameSession.<clinit>(GameSession.java:20)
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_1()
		throws Exception {
		SessionServerMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_1()
		throws Exception {
		SessionServerMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_2()
		throws Exception {
		SessionServerMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_2()
		throws Exception {
		SessionServerMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_2()
		throws Exception {
		SessionServerMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_3()
		throws Exception {
		SessionServerMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_3()
		throws Exception {
		SessionServerMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_3()
		throws Exception {
		SessionServerMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_4()
		throws Exception {
		SessionServerMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_4()
		throws Exception {
		SessionServerMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_4()
		throws Exception {
		SessionServerMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_5()
		throws Exception {
		SessionServerMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_5()
		throws Exception {
		SessionServerMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_5()
		throws Exception {
		SessionServerMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_6()
		throws Exception {
		SessionServerMsg fixture = getFixture3();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_6()
		throws Exception {
		SessionServerMsg fixture = getFixture1();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		ClientGameSession session = new ClientGameSession((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameSession) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_6()
		throws Exception {
		SessionServerMsg fixture = getFixture2();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture.execute(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
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
		new org.junit.runner.JUnitCore().run(SessionServerMsgTest.class);
	}
}