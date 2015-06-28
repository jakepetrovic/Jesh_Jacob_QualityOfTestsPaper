package messages.global;

import java.util.ArrayList;
import client.BomberClient;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SessionListMsgTest</code> contains tests for the class <code>{@link SessionListMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SessionListMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SessionListMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private SessionListMsg fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SessionListMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public SessionListMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SessionListMsg();
		}
		return fixture;
	}

	/**
	 * Run the void addSessionInfo(SessionDetailsMsg) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testAddSessionInfo_fixture_1()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		SessionDetailsMsg sessionInfo = new SessionDetailsMsg("0123456789", list, new ImageIcon("", ""), 1, 1, 1);

		fixture2.addSessionInfo(sessionInfo);

		// add additional test code here
	}

	/**
	 * Run the void addSessionInfo(SessionDetailsMsg) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testAddSessionInfo_fixture_2()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		SessionDetailsMsg sessionInfo = new SessionDetailsMsg("", list, new ImageIcon(""), 0, 0, 0);

		fixture2.addSessionInfo(sessionInfo);

		// add additional test code here
	}

	/**
	 * Run the void addSessionInfo(SessionDetailsMsg) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testAddSessionInfo_fixture_3()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		SessionDetailsMsg sessionInfo = new SessionDetailsMsg("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7, 7);

		fixture2.addSessionInfo(sessionInfo);

		// add additional test code here
	}

	/**
	 * Run the void addSessionInfo(SessionDetailsMsg) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testAddSessionInfo_fixture_4()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		list.add("0123456789");
		SessionDetailsMsg sessionInfo = new SessionDetailsMsg("", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

		fixture2.addSessionInfo(sessionInfo);

		// add additional test code here
	}

	/**
	 * Run the void addSessionInfo(SessionDetailsMsg) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testAddSessionInfo_fixture_5()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		LinkedList<String> list = new LinkedList<String>();
		list.add("");
		SessionDetailsMsg sessionInfo = new SessionDetailsMsg((String) null, list, new ImageIcon(), -1, -1, -1);

		fixture2.addSessionInfo(sessionInfo);

		// add additional test code here
	}

	/**
	 * Run the void addSessionInfo(SessionDetailsMsg) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testAddSessionInfo_fixture_6()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		LinkedList<String> list = new LinkedList<String>();
		list.add("0123456789");
		SessionDetailsMsg sessionInfo = new SessionDetailsMsg("0123456789", list, new ImageIcon(new byte[] {(byte) -1, (byte) 0, (byte) 1, Byte.MAX_VALUE, Byte.MIN_VALUE}, ""), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

		fixture2.addSessionInfo(sessionInfo);

		// add additional test code here
	}

	/**
	 * Run the void execute(BomberClient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		SessionListMsg fixture2 = getFixture();
		BomberClient bomberClient = BomberClient.getInstance();

		fixture2.execute(bomberClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.BomberClient.<clinit>(BomberClient.java:36)
	}

	/**
	 * Run the Vector<SessionDetailsMsg> getSessionInfos() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetSessionInfos_fixture_1()
		throws Exception {
		SessionListMsg fixture2 = getFixture();

		Vector<SessionDetailsMsg> result = fixture2.getSessionInfos();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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
		new org.junit.runner.JUnitCore().run(SessionListMsgTest.class);
	}
}