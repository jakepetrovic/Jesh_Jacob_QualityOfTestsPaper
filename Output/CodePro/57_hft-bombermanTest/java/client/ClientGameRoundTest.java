package client;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;
import common.Bomb;
import common.GameObject;
import common.Map;
import common.Player;
import client.view.GameCanvas;
import client.controller.LocalControl;

/**
 * The class <code>ClientGameRoundTest</code> contains tests for the class <code>{@link ClientGameRound}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ClientGameRoundTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public ClientGameRoundTest(String name) {
	}

	/**
	 * Run the ClientGameRound(ClientGameSession,GameCanvas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testClientGameRound_1()
		throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession session = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);
		GameCanvas gameCanvas = new GameCanvas(0, 0);

		ClientGameRound result = new ClientGameRound(session, gameCanvas);

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
		new org.junit.runner.JUnitCore().run(ClientGameRoundTest.class);
	}
}