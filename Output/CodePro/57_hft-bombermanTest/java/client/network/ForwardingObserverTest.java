package client.network;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import client.ClientGameSession;
import client.ClientGameRound;
import javax.swing.ImageIcon;
import client.view.GameCanvas;
import client.BomberClient;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ForwardingObserverTest</code> contains tests for the class <code>{@link ForwardingObserver}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ForwardingObserverTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public ForwardingObserverTest(String name) {
	}

	/**
	 * Run the ForwardingObserver(BomberClient,ClientGameRound) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testForwardingObserver_1()
		throws Exception {
		BomberClient bomberClient = BomberClient.getInstance();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession clientGameSession = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);
		ClientGameRound clientGameRound = new ClientGameRound(clientGameSession, new GameCanvas(1, 1));

		ForwardingObserver result = new ForwardingObserver(bomberClient, clientGameRound);

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
		new org.junit.runner.JUnitCore().run(ForwardingObserverTest.class);
	}
}