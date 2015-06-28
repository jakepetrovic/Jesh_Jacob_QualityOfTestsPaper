package messages.round;

import java.awt.Point;
import client.ClientGameRound;
import org.junit.*;
import server.ClientInfo;
import server.ServerGameRound;
import static org.junit.Assert.*;

/**
 * The class <code>PlayerStateMsgTest</code> contains tests for the class <code>{@link PlayerStateMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PlayerStateMsgTest {
	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_1()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point();
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_2()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point(0, 0);
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_3()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point(1, 1);
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_4()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point((Point) null);
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_5()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point(0, 0);
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_6()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point(1, 1);
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_7()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point((Point) null);
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_8()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point();
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_9()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point(1, 1);
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_10()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point((Point) null);
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_11()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point();
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_12()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point(0, 0);
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_13()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point((Point) null);
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_14()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point();
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_15()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point(0, 0);
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_16()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point(1, 1);
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_17()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point();
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_18()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point(0, 0);
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_19()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point(1, 1);
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_20()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point();
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_21()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point(0, 0);
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_22()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point(1, 1);
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_23()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point((Point) null);
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_24()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point(0, 0);
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_25()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point(1, 1);
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_26()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point((Point) null);
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_27()
		throws Exception {
		int gameObjectId = 1;
		Point position = new Point();
		Point moveVector = new Point((Point) null);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_28()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point(1, 1);
		Point moveVector = new Point();

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_29()
		throws Exception {
		int gameObjectId = 0;
		Point position = new Point((Point) null);
		Point moveVector = new Point(0, 0);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerStateMsg(int,Point,Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPlayerStateMsg_30()
		throws Exception {
		int gameObjectId = 7;
		Point position = new Point();
		Point moveVector = new Point(1, 1);

		PlayerStateMsg result = new PlayerStateMsg(gameObjectId, position, moveVector);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.PlayerStateMsg
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
		new org.junit.runner.JUnitCore().run(PlayerStateMsgTest.class);
	}
}