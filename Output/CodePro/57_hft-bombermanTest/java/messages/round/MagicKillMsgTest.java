package messages.round;

import java.util.ArrayList;
import java.util.List;
import client.ClientGameSession;
import client.ClientGameRound;
import javax.swing.ImageIcon;
import client.view.GameCanvas;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MagicKillMsgTest</code> contains tests for the class <code>{@link MagicKillMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MagicKillMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MagicKillMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private MagicKillMsg fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MagicKillMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public MagicKillMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new MagicKillMsg(0);
		}
		return fixture;
	}

	/**
	 * Run the MagicKillMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMagicKillMsg_1()
		throws Exception {
		int playerId = 0;

		MagicKillMsg result = new MagicKillMsg(playerId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MagicKillMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMagicKillMsg_2()
		throws Exception {
		int playerId = 1;

		MagicKillMsg result = new MagicKillMsg(playerId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MagicKillMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testMagicKillMsg_3()
		throws Exception {
		int playerId = 7;

		MagicKillMsg result = new MagicKillMsg(playerId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		MagicKillMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession clientGameSession = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(1, 1));

		fixture2.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.GameSession.<clinit>(GameSession.java:20)
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testExecute_fixture_2()
		throws Exception {
		MagicKillMsg fixture2 = getFixture();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession clientGameSession = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(0, 0));

		fixture2.execute(round);

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
		new org.junit.runner.JUnitCore().run(MagicKillMsgTest.class);
	}
}