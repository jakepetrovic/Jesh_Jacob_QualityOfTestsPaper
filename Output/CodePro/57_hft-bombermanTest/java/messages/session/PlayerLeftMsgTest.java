package messages.session;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import server.ServerGameSession;
import javax.swing.ImageIcon;
import server.ClientInfo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PlayerLeftMsgTest</code> contains tests for the class <code>{@link PlayerLeftMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PlayerLeftMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PlayerLeftMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	private PlayerLeftMsg fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public PlayerLeftMsgTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PlayerLeftMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public PlayerLeftMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new PlayerLeftMsg();
		}
		return fixture;
	}

	/**
	 * Run the PlayerLeftMsg() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testPlayerLeftMsg_1()
		throws Exception {

		PlayerLeftMsg result = new PlayerLeftMsg();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(ServerGameSession,ClientInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		PlayerLeftMsg fixture2 = getFixture();
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
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PlayerLeftMsgTest.class);
	}
}