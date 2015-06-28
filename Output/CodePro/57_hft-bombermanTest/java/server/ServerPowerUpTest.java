package server;

import java.awt.Point;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;
import common.GameObject;

/**
 * The class <code>ServerPowerUpTest</code> contains tests for the class <code>{@link ServerPowerUp}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerPowerUpTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public ServerPowerUpTest(String name) {
	}

	/**
	 * Run the ServerPowerUp(Point,ServerGameSession) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testServerPowerUp_1()
		throws Exception {
		Point position = new Point();
		ServerGameSession session = null;

		ServerPowerUp result = new ServerPowerUp(position, session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
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
		new org.junit.runner.JUnitCore().run(ServerPowerUpTest.class);
	}
}