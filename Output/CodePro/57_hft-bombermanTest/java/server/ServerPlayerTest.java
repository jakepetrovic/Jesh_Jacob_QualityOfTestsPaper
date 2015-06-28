package server;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServerPlayerTest</code> contains tests for the class <code>{@link ServerPlayer}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ServerPlayerTest {
	/**
	 * Run the ServerPlayer(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerPlayer_1()
		throws Exception {
		Point position = new Point();

		ServerPlayer result = new ServerPlayer(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPlayer
		assertNotNull(result);
	}

	/**
	 * Run the ServerPlayer(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerPlayer_2()
		throws Exception {
		Point position = new Point(0, 0);

		ServerPlayer result = new ServerPlayer(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPlayer
		assertNotNull(result);
	}

	/**
	 * Run the ServerPlayer(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerPlayer_3()
		throws Exception {
		Point position = new Point(1, 1);

		ServerPlayer result = new ServerPlayer(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPlayer
		assertNotNull(result);
	}

	/**
	 * Run the ServerPlayer(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testServerPlayer_4()
		throws Exception {
		Point position = new Point((Point) null);

		ServerPlayer result = new ServerPlayer(position);

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
		new org.junit.runner.JUnitCore().run(ServerPlayerTest.class);
	}
}