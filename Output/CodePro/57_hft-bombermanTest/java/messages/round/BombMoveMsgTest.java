package messages.round;

import java.awt.Point;
import client.ClientGameRound;
import org.junit.*;
import server.ClientInfo;
import server.ServerGameRound;
import static org.junit.Assert.*;

/**
 * The class <code>BombMoveMsgTest</code> contains tests for the class <code>{@link BombMoveMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BombMoveMsgTest {
	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_1()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_2()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {0};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_3()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {1};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_4()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {7};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_5()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {0};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_6()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {1};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_7()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {7};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_8()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_9()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {0};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_10()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {1};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_11()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_12()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {0};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_13()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {1};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_14()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {7};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_15()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_16()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {0};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_17()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {7};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_18()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_19()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {0};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_20()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {1};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_21()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {7};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_22()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_23()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {1};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_24()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {7};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_25()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {7};
		int[] moveVector = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_26()
		throws Exception {
		int gameObjectId = 0;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {0};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_27()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {1};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_28()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {1};
		int[] moveVector = new int[] {7};
		boolean stopped = true;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_29()
		throws Exception {
		int gameObjectId = 1;
		int[] position = new int[] {0, 1, 7, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
		int[] moveVector = new int[] {0};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombMoveMsg(int,int[],int[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testBombMoveMsg_30()
		throws Exception {
		int gameObjectId = 7;
		int[] position = new int[] {0};
		int[] moveVector = new int[] {1};
		boolean stopped = false;

		BombMoveMsg result = new BombMoveMsg(gameObjectId, position, moveVector, stopped);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombMoveMsg
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
		new org.junit.runner.JUnitCore().run(BombMoveMsgTest.class);
	}
}