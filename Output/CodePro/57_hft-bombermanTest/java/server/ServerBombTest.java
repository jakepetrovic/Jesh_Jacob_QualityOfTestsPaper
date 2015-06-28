package server;

import java.awt.Point;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;
import common.GameObject;

/**
 * The class <code>ServerBombTest</code> contains tests for the class <code>{@link ServerBomb}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerBombTest {
	/**
	 * Run the ServerBomb(Point,ServerGameSession) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testServerBomb_1()
		throws Exception {
		Point position = new Point();
		ServerGameSession session = null;

		ServerBomb result = new ServerBomb(position, session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerBomb
		assertNotNull(result);
	}

	/**
	 * Run the ServerBomb(Point,ServerGameSession) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testServerBomb_2()
		throws Exception {
		Point position = new Point((Point) null);
		ServerGameSession session = null;

		ServerBomb result = new ServerBomb(position, session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(ServerBombTest.class);
	}
}