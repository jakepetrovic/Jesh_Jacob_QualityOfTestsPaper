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
 * The class <code>TileHitPlayerMsgTest</code> contains tests for the class <code>{@link TileHitPlayerMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TileHitPlayerMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TileHitPlayerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private TileHitPlayerMsg fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TileHitPlayerMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public TileHitPlayerMsg getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new TileHitPlayerMsg(0);
		}
		return fixture;
	}

	/**
	 * Run the TileHitPlayerMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testTileHitPlayerMsg_1()
		throws Exception {
		int playerID = 0;

		TileHitPlayerMsg result = new TileHitPlayerMsg(playerID);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TileHitPlayerMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testTileHitPlayerMsg_2()
		throws Exception {
		int playerID = 1;

		TileHitPlayerMsg result = new TileHitPlayerMsg(playerID);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TileHitPlayerMsg(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testTileHitPlayerMsg_3()
		throws Exception {
		int playerID = 7;

		TileHitPlayerMsg result = new TileHitPlayerMsg(playerID);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_1()
		throws Exception {
		TileHitPlayerMsg fixture2 = getFixture();
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture_2()
		throws Exception {
		TileHitPlayerMsg fixture2 = getFixture();
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
		new org.junit.runner.JUnitCore().run(TileHitPlayerMsgTest.class);
	}
}