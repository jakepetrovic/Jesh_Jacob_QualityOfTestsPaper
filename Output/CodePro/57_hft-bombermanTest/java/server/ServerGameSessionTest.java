package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import messages.global.ParticipantInfo;
import javax.swing.ImageIcon;
import messages.Message;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServerGameSessionTest</code> contains tests for the class <code>{@link ServerGameSession}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerGameSessionTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public ServerGameSessionTest(String name) {
	}

	/**
	 * Run the ServerGameSession(String,List<String>,ImageIcon,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testServerGameSession_1()
		throws Exception {
		String name = "";
		ArrayList<String> maps = new ArrayList<String>();
		maps.add("");
		ImageIcon mapPreview = new ImageIcon("");
		int totalNrOfPlayers = 0;
		int totalRounds = 0;

		ServerGameSession result = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerGameSession
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerGameSessionTest.class);
	}
}