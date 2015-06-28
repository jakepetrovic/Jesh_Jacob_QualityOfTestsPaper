package client;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import client.view.GameView;
import client.view.GameCanvas;
import org.junit.*;
import static org.junit.Assert.*;
import common.GameModel;
import client.controller.LocalControl;

/**
 * The class <code>ClientGameLoopTest</code> contains tests for the class <code>{@link ClientGameLoop}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ClientGameLoopTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public ClientGameLoopTest(String name) {
	}

	/**
	 * Run the ClientGameLoop(ClientGameRound,GameModel,GameView) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testClientGameLoop_1()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession clientGameSession = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(1, 1));
		GameModel gameModel = new GameModel();
		GameView gameView = new GameView(new GameCanvas(0, 0));

		ClientGameLoop result = new ClientGameLoop(round, gameModel, gameView);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientGameLoopTest.class);
	}
}