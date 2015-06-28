package messages.session;

import java.awt.Point;
import client.ClientGameSession;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;
import common.Map;

/**
 * The class <code>InitializeRoundMsgTest</code> contains tests for the class <code>{@link InitializeRoundMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class InitializeRoundMsgTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public InitializeRoundMsgTest(String name) {
	}

	/**
	 * Run the InitializeRoundMsg(Vector<PlayerInfo>,Map) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testInitializeRoundMsg_1()
		throws Exception {
		Vector<PlayerInfo> players = new Vector<PlayerInfo>();
		players.add(new PlayerInfo(0, new Point(), ""));
		Map map = new Map("");

		InitializeRoundMsg result = new InitializeRoundMsg(players, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.MapReader
		//       at common.Map.mapInit(Map.java:76)
		//       at common.Map.<init>(Map.java:50)
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
		new org.junit.runner.JUnitCore().run(InitializeRoundMsgTest.class);
	}
}