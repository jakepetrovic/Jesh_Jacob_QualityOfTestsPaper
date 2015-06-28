package server;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServerGameModelTest</code> contains tests for the class <code>{@link ServerGameModel}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerGameModelTest {
	/**
	 * Run the ServerGameModel(ServerGameRound) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameModel_1()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ServerGameSession serverGameSession = new ServerGameSession("0123456789", list, new ImageIcon("", ""), 1, 1);
		Vector<ClientInfo> list2 = new Vector<ClientInfo>();
		list2.add(new ClientInfo(new Socket("", 0)));
		ServerGameRound round = new ServerGameRound(serverGameSession, list2, "");

		ServerGameModel result = new ServerGameModel(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
		assertNotNull(result);
	}

	/**
	 * Run the ServerGameModel(ServerGameRound) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameModel_2()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ServerGameSession serverGameSession = new ServerGameSession("", list, new ImageIcon(""), 0, 0);
		ServerGameRound round = new ServerGameRound(serverGameSession, new Vector<ClientInfo>(), "0123456789");

		ServerGameModel result = new ServerGameModel(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
		assertNotNull(result);
	}

	/**
	 * Run the ServerGameModel(ServerGameRound) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerGameModel_3()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		ServerGameSession serverGameSession = new ServerGameSession("An��t-1.0.txt", list, new ImageIcon("0123456789", "0123456789"), 7, 7);
		Vector<ClientInfo> list2 = new Vector<ClientInfo>();
		list2.add((ClientInfo) null);
		ServerGameRound round = new ServerGameRound(serverGameSession, list2, "An��t-1.0.txt");

		ServerGameModel result = new ServerGameModel(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
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
		new org.junit.runner.JUnitCore().run(ServerGameModelTest.class);
	}
}